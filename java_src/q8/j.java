package q8;

import c8.a;
import com.google.firebase.perf.metrics.Trace;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l8.k;
/* loaded from: classes.dex */
public class j implements FlutterFirebasePlugin, c8.a, k.c {

    /* renamed from: o  reason: collision with root package name */
    static final HashMap<Integer, v6.g> f12923o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    static final HashMap<Integer, Trace> f12924p = new HashMap<>();

    /* renamed from: q  reason: collision with root package name */
    static int f12925q = 0;

    /* renamed from: r  reason: collision with root package name */
    static int f12926r = 0;

    /* renamed from: n  reason: collision with root package name */
    private k f12927n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {
        a() {
        }
    }

    private t4.i<Integer> j(final l8.j jVar) {
        final t4.j jVar2 = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.c
            @Override // java.lang.Runnable
            public final void run() {
                j.p(l8.j.this, jVar2);
            }
        });
        return jVar2.a();
    }

    private t4.i<Void> k(final l8.j jVar) {
        final t4.j jVar2 = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.a
            @Override // java.lang.Runnable
            public final void run() {
                j.q(l8.j.this, jVar2);
            }
        });
        return jVar2.a();
    }

    private void l(l8.c cVar) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_performance", this);
        k kVar = new k(cVar, "plugins.flutter.io/firebase_performance");
        this.f12927n = kVar;
        kVar.e(this);
    }

    private t4.i<Boolean> m() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.g
            @Override // java.lang.Runnable
            public final void run() {
                j.r(t4.j.this);
            }
        });
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(t4.j jVar) {
        try {
            for (Trace trace : f12924p.values()) {
                trace.stop();
            }
            f12924p.clear();
            for (v6.g gVar : f12923o.values()) {
                gVar.h();
            }
            f12923o.clear();
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(t4.j jVar) {
        try {
            jVar.c(new a());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(l8.j jVar, t4.j jVar2) {
        try {
            String str = (String) jVar.a("url");
            Objects.requireNonNull(str);
            String str2 = (String) jVar.a("httpMethod");
            Objects.requireNonNull(str2);
            v6.g e10 = r6.e.c().e(str, w(str2));
            e10.g();
            int i10 = f12926r;
            f12926r = i10 + 1;
            f12923o.put(Integer.valueOf(i10), e10);
            jVar2.c(Integer.valueOf(i10));
        } catch (Exception e11) {
            jVar2.b(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(l8.j jVar, t4.j jVar2) {
        try {
            Integer num = (Integer) jVar.a("handle");
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Map map = (Map) jVar.a("attributes");
            Objects.requireNonNull(map);
            Map map2 = map;
            Integer num2 = (Integer) jVar.a("httpResponseCode");
            Integer num3 = (Integer) jVar.a("requestPayloadSize");
            String str = (String) jVar.a("responseContentType");
            Integer num4 = (Integer) jVar.a("responsePayloadSize");
            v6.g gVar = f12923o.get(Integer.valueOf(intValue));
            if (num2 != null) {
                gVar.c(num2.intValue());
            }
            if (num3 != null) {
                gVar.d(num3.intValue());
            }
            if (str != null) {
                gVar.e(str);
            }
            if (num4 != null) {
                gVar.f(num4.intValue());
            }
            for (String str2 : map2.keySet()) {
                gVar.b(str2, (String) map2.get(str2));
            }
            gVar.h();
            f12923o.remove(Integer.valueOf(intValue));
            jVar2.c(null);
        } catch (Exception e10) {
            jVar2.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(t4.j jVar) {
        try {
            jVar.c(Boolean.valueOf(r6.e.c().d()));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(k.d dVar, t4.i iVar) {
        if (iVar.p()) {
            dVar.a(iVar.l());
            return;
        }
        Exception k10 = iVar.k();
        dVar.b("firebase_crashlytics", k10 != null ? k10.getMessage() : "An unknown error occurred", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(l8.j jVar, t4.j jVar2) {
        try {
            r6.e.c().g((Boolean) jVar.a("enable"));
            jVar2.c(null);
        } catch (Exception e10) {
            jVar2.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(l8.j jVar, t4.j jVar2) {
        try {
            Trace f10 = r6.e.c().f((String) jVar.a("name"));
            f10.start();
            int i10 = f12925q;
            f12925q = i10 + 1;
            f12924p.put(Integer.valueOf(i10), f10);
            jVar2.c(Integer.valueOf(i10));
        } catch (Exception e10) {
            jVar2.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(l8.j jVar, t4.j jVar2) {
        try {
            Integer num = (Integer) jVar.a("handle");
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Map map = (Map) jVar.a("attributes");
            Objects.requireNonNull(map);
            Map map2 = map;
            Map map3 = (Map) jVar.a("metrics");
            Objects.requireNonNull(map3);
            Map map4 = map3;
            Trace trace = f12924p.get(Integer.valueOf(intValue));
            for (String str : map2.keySet()) {
                trace.putAttribute(str, (String) map2.get(str));
            }
            for (String str2 : map4.keySet()) {
                trace.putMetric(str2, ((Integer) map4.get(str2)).intValue());
            }
            trace.stop();
            f12924p.remove(Integer.valueOf(intValue));
            jVar2.c(null);
        } catch (Exception e10) {
            jVar2.b(e10);
        }
    }

    private static String w(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2047533199:
                if (str.equals("HttpMethod.Get")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2047524054:
                if (str.equals("HttpMethod.Put")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1022018640:
                if (str.equals("HttpMethod.Delete")) {
                    c10 = 2;
                    break;
                }
                break;
            case -576186973:
                if (str.equals("HttpMethod.Patch")) {
                    c10 = 3;
                    break;
                }
                break;
            case -572004704:
                if (str.equals("HttpMethod.Trace")) {
                    c10 = 4;
                    break;
                }
                break;
            case -122777287:
                if (str.equals("HttpMethod.Options")) {
                    c10 = 5;
                    break;
                }
                break;
            case 951009573:
                if (str.equals("HttpMethod.Head")) {
                    c10 = 6;
                    break;
                }
                break;
            case 951258085:
                if (str.equals("HttpMethod.Post")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2078049157:
                if (str.equals("HttpMethod.Connect")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "GET";
            case 1:
                return "PUT";
            case 2:
                return "DELETE";
            case 3:
                return "PATCH";
            case 4:
                return "TRACE";
            case 5:
                return "OPTIONS";
            case 6:
                return "HEAD";
            case 7:
                return "POST";
            case '\b':
                return "CONNECT";
            default:
                throw new IllegalArgumentException(String.format("No HttpMethod for: %s", str));
        }
    }

    private t4.i<Void> x(final l8.j jVar) {
        final t4.j jVar2 = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.b
            @Override // java.lang.Runnable
            public final void run() {
                j.t(l8.j.this, jVar2);
            }
        });
        return jVar2.a();
    }

    private t4.i<Integer> y(final l8.j jVar) {
        final t4.j jVar2 = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.d
            @Override // java.lang.Runnable
            public final void run() {
                j.u(l8.j.this, jVar2);
            }
        });
        return jVar2.a();
    }

    private t4.i<Void> z(final l8.j jVar) {
        final t4.j jVar2 = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.e
            @Override // java.lang.Runnable
            public final void run() {
                j.v(l8.j.this, jVar2);
            }
        });
        return jVar2.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Void> didReinitializeFirebaseCore() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.h
            @Override // java.lang.Runnable
            public final void run() {
                j.n(t4.j.this);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Map<String, Object>> getPluginConstantsForFirebaseApp(f5.e eVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: q8.f
            @Override // java.lang.Runnable
            public final void run() {
                j.this.o(jVar);
            }
        });
        return jVar.a();
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        l(bVar.b());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f12927n;
        if (kVar != null) {
            kVar.e(null);
            this.f12927n = null;
        }
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, final k.d dVar) {
        t4.i y10;
        String str = jVar.f11211a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2120473769:
                if (str.equals("FirebasePerformance#traceStart")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1491270476:
                if (str.equals("FirebasePerformance#httpMetricStop")) {
                    c10 = 1;
                    break;
                }
                break;
            case 347240045:
                if (str.equals("FirebasePerformance#traceStop")) {
                    c10 = 2;
                    break;
                }
                break;
            case 610629367:
                if (str.equals("FirebasePerformance#isPerformanceCollectionEnabled")) {
                    c10 = 3;
                    break;
                }
                break;
            case 844329211:
                if (str.equals("FirebasePerformance#setPerformanceCollectionEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1015242224:
                if (str.equals("FirebasePerformance#httpMetricStart")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                y10 = y(jVar);
                break;
            case 1:
                y10 = k(jVar);
                break;
            case 2:
                y10 = z(jVar);
                break;
            case 3:
                y10 = m();
                break;
            case 4:
                y10 = x(jVar);
                break;
            case 5:
                y10 = j(jVar);
                break;
            default:
                dVar.c();
                return;
        }
        y10.c(new t4.d() { // from class: q8.i
            @Override // t4.d
            public final void a(t4.i iVar) {
                j.s(k.d.this, iVar);
            }
        });
    }
}
