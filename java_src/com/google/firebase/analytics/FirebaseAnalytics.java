package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.d3;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p4.w;
import t4.i;
import t4.l;
import z3.o;
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c  reason: collision with root package name */
    private static volatile FirebaseAnalytics f5241c;

    /* renamed from: a  reason: collision with root package name */
    private final d3 f5242a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f5243b;

    /* loaded from: classes.dex */
    public enum a {
        GRANTED,
        DENIED
    }

    /* loaded from: classes.dex */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(d3 d3Var) {
        o.i(d3Var);
        this.f5242a = d3Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f5241c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f5241c == null) {
                    f5241c = new FirebaseAnalytics(d3.y(context, null, null, null, null));
                }
            }
        }
        return f5241c;
    }

    @Keep
    public static w getScionFrontendApiImplementation(Context context, Bundle bundle) {
        d3 y10 = d3.y(context, null, null, null, bundle);
        if (y10 == null) {
            return null;
        }
        return new c(y10);
    }

    @EnsuresNonNull({"this.executor"})
    private final ExecutorService k() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f5243b == null) {
                this.f5243b = new com.google.firebase.analytics.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f5243b;
        }
        return executorService;
    }

    public i<String> a() {
        try {
            return l.c(k(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e10) {
            this.f5242a.a(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return l.d(e10);
        }
    }

    public void b(String str, Bundle bundle) {
        this.f5242a.N(str, bundle);
    }

    public void c() {
        this.f5242a.c();
    }

    public void d(boolean z10) {
        this.f5242a.i(Boolean.valueOf(z10));
    }

    public void e(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.f5242a.e(bundle);
    }

    public void f(Bundle bundle) {
        this.f5242a.h(bundle);
    }

    public void g(long j10) {
        this.f5242a.j(j10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(com.google.firebase.installations.c.q().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(String str) {
        this.f5242a.k(str);
    }

    public void i(String str, String str2) {
        this.f5242a.l(null, str, str2, false);
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f5242a.f(activity, str, str2);
    }
}
