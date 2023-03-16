package r6;

import a7.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import z6.k;
/* loaded from: classes.dex */
public class e {

    /* renamed from: i  reason: collision with root package name */
    private static final u6.a f13071i = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f13072a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f13073b;

    /* renamed from: c  reason: collision with root package name */
    private final a7.f f13074c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f13075d;

    /* renamed from: e  reason: collision with root package name */
    private final f5.e f13076e;

    /* renamed from: f  reason: collision with root package name */
    private final i6.b<com.google.firebase.remoteconfig.c> f13077f;

    /* renamed from: g  reason: collision with root package name */
    private final j6.e f13078g;

    /* renamed from: h  reason: collision with root package name */
    private final i6.b<e1.g> f13079h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f5.e eVar, i6.b<com.google.firebase.remoteconfig.c> bVar, j6.e eVar2, i6.b<e1.g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        this.f13075d = null;
        this.f13076e = eVar;
        this.f13077f = bVar;
        this.f13078g = eVar2;
        this.f13079h = bVar2;
        if (eVar == null) {
            this.f13075d = Boolean.FALSE;
            this.f13073b = aVar;
            this.f13074c = new a7.f(new Bundle());
            return;
        }
        k.k().r(eVar, eVar2, bVar2);
        Context l10 = eVar.l();
        a7.f a10 = a(l10);
        this.f13074c = a10;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f13073b = aVar;
        aVar.Q(a10);
        aVar.O(l10);
        sessionManager.setApplicationContext(l10);
        this.f13075d = aVar.j();
        u6.a aVar2 = f13071i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", u6.b.b(eVar.q().g(), l10.getPackageName())));
        }
    }

    private static a7.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new a7.f(bundle) : new a7.f();
    }

    public static e c() {
        return (e) f5.e.n().j(e.class);
    }

    public Map<String, String> b() {
        return new HashMap(this.f13072a);
    }

    public boolean d() {
        Boolean bool = this.f13075d;
        return bool != null ? bool.booleanValue() : f5.e.n().w();
    }

    public v6.g e(String str, String str2) {
        return new v6.g(str, str2, k.k(), new l());
    }

    public Trace f(String str) {
        return Trace.c(str);
    }

    public synchronized void g(Boolean bool) {
        u6.a aVar;
        String str;
        try {
            f5.e.n();
            if (this.f13073b.i().booleanValue()) {
                f13071i.f("Firebase Performance is permanently disabled");
                return;
            }
            this.f13073b.P(bool);
            if (bool == null) {
                bool = this.f13073b.j();
            }
            this.f13075d = bool;
            if (!Boolean.TRUE.equals(this.f13075d)) {
                if (Boolean.FALSE.equals(this.f13075d)) {
                    aVar = f13071i;
                    str = "Firebase Performance is Disabled";
                }
            }
            aVar = f13071i;
            str = "Firebase Performance is Enabled";
            aVar.f(str);
        } catch (IllegalStateException unused) {
        }
    }
}
