package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, d7.k> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private i6.b<com.google.firebase.remoteconfig.c> firebaseRemoteConfigProvider;
    private static final u6.a logger = u6.a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.f(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS), getInitialStartupMillis());
    }

    RemoteConfigManager(x xVar, Executor executor, com.google.firebase.remoteconfig.a aVar, long j10, long j11) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        this.allRcConfigMap = aVar == null ? new ConcurrentHashMap<>() : new ConcurrentHashMap<>(aVar.h());
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }

    static long getInitialStartupMillis() {
        f5.m mVar = (f5.m) f5.e.n().j(f5.m.class);
        return mVar != null ? mVar.c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private d7.k getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            d7.k kVar = this.allRcConfigMap.get(str);
            if (kVar.e() == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", kVar.b(), str);
                return kVar;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().f(this.executor, new t4.f() { // from class: com.google.firebase.perf.config.z
            @Override // t4.f
            public final void b(Object obj) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).d(this.executor, new t4.e() { // from class: com.google.firebase.perf.config.y
            @Override // t4.e
            public final void c(Exception exc) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public a7.g<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return a7.g.a();
        }
        d7.k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return a7.g.e(Boolean.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return a7.g.a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public a7.g<Float> getFloat(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config float value is null.");
            return a7.g.a();
        }
        d7.k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return a7.g.e(Float.valueOf(Double.valueOf(remoteConfigValue.a()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return a7.g.a();
    }

    public a7.g<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return a7.g.a();
        }
        d7.k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return a7.g.e(Long.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.b().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                }
            }
        }
        return a7.g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        Object obj;
        d7.k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t10;
        }
        try {
            if (t10 instanceof Boolean) {
                obj = Boolean.valueOf(remoteConfigValue.d());
            } else if (t10 instanceof Float) {
                obj = Float.valueOf(Double.valueOf(remoteConfigValue.a()).floatValue());
            } else {
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (!(t10 instanceof String)) {
                        T t11 = (T) remoteConfigValue.b();
                        try {
                            logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                            return t11;
                        } catch (IllegalArgumentException unused) {
                            t10 = t11;
                            if (remoteConfigValue.b().isEmpty()) {
                                return t10;
                            }
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.b(), str);
                            return t10;
                        }
                    }
                    obj = remoteConfigValue.b();
                }
                obj = Long.valueOf(remoteConfigValue.c());
            }
            return obj;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public a7.g<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return a7.g.a();
        }
        d7.k remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? a7.g.e(remoteConfigValue.b()) : a7.g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        i6.b<com.google.firebase.remoteconfig.c> bVar;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (cVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = cVar.c(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.i().a() == 1;
    }

    public void setFirebaseRemoteConfigProvider(i6.b<com.google.firebase.remoteconfig.c> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    protected void syncConfigValues(Map<String, d7.k> map) {
        u6.a aVar;
        String str;
        this.allRcConfigMap.putAll(map);
        for (String str2 : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str2)) {
                this.allRcConfigMap.remove(str2);
            }
        }
        d e10 = d.e();
        d7.k kVar = this.allRcConfigMap.get(e10.c());
        if (kVar != null) {
            try {
                this.cache.n(e10.a(), kVar.d());
                return;
            } catch (Exception unused) {
                aVar = logger;
                str = "ExperimentTTID remote config flag has invalid value, expected boolean.";
            }
        } else {
            aVar = logger;
            str = "ExperimentTTID remote config flag does not exist.";
        }
        aVar.a(str);
    }
}
