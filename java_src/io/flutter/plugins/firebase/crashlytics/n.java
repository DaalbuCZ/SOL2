package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c8.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l8.k;
/* loaded from: classes.dex */
public class n implements FlutterFirebasePlugin, c8.a, k.c {

    /* renamed from: n  reason: collision with root package name */
    private l8.k f8944n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f8945n;

        a(boolean z10) {
            this.f8945n = z10;
            put("unsentReports", Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends HashMap<String, Object> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f8947n;

        b(boolean z10) {
            this.f8947n = z10;
            put("didCrashOnPreviousExecution", Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends HashMap<String, Object> {
        c() {
            put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.v(f5.e.n())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends HashMap<String, Object> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ f5.e f8950n;

        d(f5.e eVar) {
            this.f8950n = eVar;
            if (eVar.p().equals("[DEFAULT]")) {
                put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.v(f5.e.n())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(t4.j jVar) {
        try {
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(t4.j jVar, f5.e eVar) {
        try {
            jVar.c(new d(eVar));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Map map, t4.j jVar) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            com.google.firebase.crashlytics.a.d().f((String) obj);
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(k.d dVar, t4.i iVar) {
        if (iVar.p()) {
            dVar.a(iVar.l());
            return;
        }
        Exception k10 = iVar.k();
        dVar.b("firebase_crashlytics", k10 != null ? k10.getMessage() : "An unknown error occurred", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Map map, t4.j jVar) {
        FlutterError flutterError;
        try {
            com.google.firebase.crashlytics.a d10 = com.google.firebase.crashlytics.a.d();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get("fatal");
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get("buildId");
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            if (str4.length() > 0) {
                com.google.firebase.crashlytics.b.b(str4);
            }
            if (str2 != null) {
                d10.k("flutter_error_reason", "thrown " + str2);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            d10.k("flutter_error_exception", str);
            ArrayList arrayList = new ArrayList();
            Object obj5 = map.get("stackTraceElements");
            Objects.requireNonNull(obj5);
            for (Map<String, String> map2 : (List) obj5) {
                StackTraceElement s10 = s(map2);
                if (s10 != null) {
                    arrayList.add(s10);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                d10.f(str3);
            }
            if (booleanValue) {
                com.google.firebase.crashlytics.b.a(flutterError);
            } else {
                d10.g(flutterError);
            }
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(t4.j jVar) {
        try {
            com.google.firebase.crashlytics.a.d().h();
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Map map, t4.j jVar) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            com.google.firebase.crashlytics.a.d().i((Boolean) obj);
            jVar.c(new c());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(Map map, t4.j jVar) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            com.google.firebase.crashlytics.a.d().k((String) obj, (String) obj2);
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Map map, t4.j jVar) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            com.google.firebase.crashlytics.a.d().l((String) obj);
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    private t4.i<Void> J(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.j
            @Override // java.lang.Runnable
            public final void run() {
                n.C(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> K(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.a
            @Override // java.lang.Runnable
            public final void run() {
                n.this.E(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> L() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.m
            @Override // java.lang.Runnable
            public final void run() {
                n.F(t4.j.this);
            }
        });
        return jVar.a();
    }

    private t4.i<Map<String, Object>> M(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.e
            @Override // java.lang.Runnable
            public final void run() {
                n.this.G(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> N(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.k
            @Override // java.lang.Runnable
            public final void run() {
                n.H(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> O(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.i
            @Override // java.lang.Runnable
            public final void run() {
                n.I(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Map<String, Object>> o() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.g
            @Override // java.lang.Runnable
            public final void run() {
                n.this.w(jVar);
            }
        });
        return jVar.a();
    }

    private void p() {
        new Handler(Looper.myLooper()).postDelayed(io.flutter.plugins.firebase.crashlytics.c.f8924n, 50L);
    }

    private t4.i<Void> q() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.b
            @Override // java.lang.Runnable
            public final void run() {
                n.y(t4.j.this);
            }
        });
        return jVar.a();
    }

    private t4.i<Map<String, Object>> r() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.f
            @Override // java.lang.Runnable
            public final void run() {
                n.this.z(jVar);
            }
        });
        return jVar.a();
    }

    private StackTraceElement s(Map<String, String> map) {
        try {
            String str = map.get("file");
            String str2 = map.get("line");
            String str3 = map.get("class");
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences t(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void u(l8.c cVar) {
        l8.k kVar = new l8.k(cVar, "plugins.flutter.io/firebase_crashlytics");
        this.f8944n = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v(f5.e eVar) {
        SharedPreferences t10 = t(eVar.l());
        if (t10.contains("firebase_crashlytics_collection_enabled")) {
            return t10.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (eVar.w()) {
            com.google.firebase.crashlytics.a.d().j(true);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(t4.j jVar) {
        try {
            jVar.c(new a(((Boolean) t4.l.a(com.google.firebase.crashlytics.a.d().a())).booleanValue()));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(t4.j jVar) {
        try {
            com.google.firebase.crashlytics.a.d().b();
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(t4.j jVar) {
        try {
            jVar.c(new b(com.google.firebase.crashlytics.a.d().c()));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Void> didReinitializeFirebaseCore() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.l
            @Override // java.lang.Runnable
            public final void run() {
                n.A(t4.j.this);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Map<String, Object>> getPluginConstantsForFirebaseApp(final f5.e eVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.h
            @Override // java.lang.Runnable
            public final void run() {
                n.this.B(jVar, eVar);
            }
        });
        return jVar.a();
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        u(bVar.b());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        l8.k kVar = this.f8944n;
        if (kVar != null) {
            kVar.e(null);
            this.f8944n = null;
        }
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, final k.d dVar) {
        t4.i r10;
        String str = jVar.f11211a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2094964816:
                if (str.equals("Crashlytics#didCrashOnPreviousExecution")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1437158995:
                if (str.equals("Crashlytics#recordError")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1025128541:
                if (str.equals("Crashlytics#checkForUnsentReports")) {
                    c10 = 2;
                    break;
                }
                break;
            case -424770276:
                if (str.equals("Crashlytics#sendUnsentReports")) {
                    c10 = 3;
                    break;
                }
                break;
            case -108157790:
                if (str.equals("Crashlytics#setCrashlyticsCollectionEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 28093114:
                if (str.equals("Crashlytics#log")) {
                    c10 = 5;
                    break;
                }
                break;
            case 108415030:
                if (str.equals("Crashlytics#setCustomKey")) {
                    c10 = 6;
                    break;
                }
                break;
            case 213629529:
                if (str.equals("Crashlytics#deleteUnsentReports")) {
                    c10 = 7;
                    break;
                }
                break;
            case 679831756:
                if (str.equals("Crashlytics#setUserIdentifier")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1219454365:
                if (str.equals("Crashlytics#crash")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                r10 = r();
                break;
            case 1:
                r10 = K((Map) jVar.b());
                break;
            case 2:
                r10 = o();
                break;
            case 3:
                r10 = L();
                break;
            case 4:
                r10 = M((Map) jVar.b());
                break;
            case 5:
                r10 = J((Map) jVar.b());
                break;
            case 6:
                r10 = N((Map) jVar.b());
                break;
            case 7:
                r10 = q();
                break;
            case '\b':
                r10 = O((Map) jVar.b());
                break;
            case '\t':
                p();
                return;
            default:
                dVar.c();
                return;
        }
        r10.c(new t4.d() { // from class: io.flutter.plugins.firebase.crashlytics.d
            @Override // t4.d
            public final void a(t4.i iVar) {
                n.D(k.d.this, iVar);
            }
        });
    }
}
