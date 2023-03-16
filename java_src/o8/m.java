package o8;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import c8.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l8.k;
/* loaded from: classes.dex */
public class m implements FlutterFirebasePlugin, k.c, c8.a {

    /* renamed from: n  reason: collision with root package name */
    private FirebaseAnalytics f12189n;

    /* renamed from: o  reason: collision with root package name */
    private l8.k f12190o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Map map, t4.j jVar) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.f12189n.d(((Boolean) obj).booleanValue());
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Map map, t4.j jVar) {
        try {
            Object obj = map.get("milliseconds");
            Objects.requireNonNull(obj);
            this.f12189n.g(((Integer) obj).intValue());
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Map map, t4.j jVar) {
        try {
            this.f12189n.h((String) map.get("userId"));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Map map, t4.j jVar) {
        try {
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            this.f12189n.i((String) obj, (String) map.get("value"));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(k.d dVar, t4.i iVar) {
        if (iVar.p()) {
            dVar.a(iVar.l());
            return;
        }
        Exception k10 = iVar.k();
        dVar.b("firebase_analytics", k10 != null ? k10.getMessage() : "An unknown error occurred", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Map map, t4.j jVar) {
        try {
            Boolean bool = (Boolean) map.get("adStorageConsentGranted");
            Boolean bool2 = (Boolean) map.get("analyticsStorageConsentGranted");
            HashMap hashMap = new HashMap();
            if (bool != null) {
                hashMap.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool2 != null) {
                hashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            this.f12189n.e(hashMap);
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Map map, t4.j jVar) {
        try {
            this.f12189n.f(m(map));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    private t4.i<Void> H(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.a
            @Override // java.lang.Runnable
            public final void run() {
                m.this.F(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> I(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.d
            @Override // java.lang.Runnable
            public final void run() {
                m.this.G(map, jVar);
            }
        });
        return jVar.a();
    }

    private static Bundle m(Map<String, Object> map) {
        long intValue;
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else {
                if (value instanceof Integer) {
                    intValue = ((Integer) value).intValue();
                } else if (value instanceof Long) {
                    intValue = ((Long) value).longValue();
                } else if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value == null) {
                    bundle.putString(key, null);
                } else if (value instanceof Iterable) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Object obj : (Iterable) value) {
                        if (!(obj instanceof Map)) {
                            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + key);
                        }
                        arrayList.add(m((Map) obj));
                    }
                    bundle.putParcelableArrayList(key, arrayList);
                } else if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                } else {
                    bundle.putParcelable(key, m((Map) value));
                }
                bundle.putLong(key, intValue);
            }
        }
        return bundle;
    }

    private t4.i<String> n() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.j
            @Override // java.lang.Runnable
            public final void run() {
                m.this.x(jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> o(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.f
            @Override // java.lang.Runnable
            public final void run() {
                m.this.y(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> p() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.l
            @Override // java.lang.Runnable
            public final void run() {
                m.this.z(jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> q(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.e
            @Override // java.lang.Runnable
            public final void run() {
                m.this.A(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> r(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.h
            @Override // java.lang.Runnable
            public final void run() {
                m.this.B(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> s(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.i
            @Override // java.lang.Runnable
            public final void run() {
                m.this.C(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> t(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.g
            @Override // java.lang.Runnable
            public final void run() {
                m.this.D(map, jVar);
            }
        });
        return jVar.a();
    }

    private void u(l8.c cVar, Context context) {
        this.f12189n = FirebaseAnalytics.getInstance(context);
        l8.k kVar = new l8.k(cVar, "plugins.flutter.io/firebase_analytics");
        this.f12190o = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(t4.j jVar) {
        try {
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(t4.j jVar) {
        try {
            jVar.c(new a());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(t4.j jVar) {
        try {
            jVar.c((String) t4.l.a(this.f12189n.a()));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Map map, t4.j jVar) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            Bundle m10 = m((Map) map.get("parameters"));
            this.f12189n.b((String) obj, m10);
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(t4.j jVar) {
        try {
            this.f12189n.c();
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Void> didReinitializeFirebaseCore() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.b
            @Override // java.lang.Runnable
            public final void run() {
                m.v(t4.j.this);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Map<String, Object>> getPluginConstantsForFirebaseApp(f5.e eVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: o8.k
            @Override // java.lang.Runnable
            public final void run() {
                m.this.w(jVar);
            }
        });
        return jVar.a();
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        u(bVar.b(), bVar.a());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        l8.k kVar = this.f12190o;
        if (kVar != null) {
            kVar.e(null);
            this.f12190o = null;
        }
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, final k.d dVar) {
        t4.i n10;
        String str = jVar.f11211a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2090892968:
                if (str.equals("Analytics#getAppInstanceId")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1931910274:
                if (str.equals("Analytics#resetAnalyticsData")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1572470123:
                if (str.equals("Analytics#setConsent")) {
                    c10 = 2;
                    break;
                }
                break;
            case -273201790:
                if (str.equals("Analytics#setAnalyticsCollectionEnabled")) {
                    c10 = 3;
                    break;
                }
                break;
            case -99047480:
                if (str.equals("Analytics#setDefaultEventParameters")) {
                    c10 = 4;
                    break;
                }
                break;
            case -45011405:
                if (str.equals("Analytics#logEvent")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1083589925:
                if (str.equals("Analytics#setUserProperty")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1751063748:
                if (str.equals("Analytics#setSessionTimeoutDuration")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1992044651:
                if (str.equals("Analytics#setUserId")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                n10 = n();
                break;
            case 1:
                n10 = p();
                break;
            case 2:
                n10 = H((Map) jVar.b());
                break;
            case 3:
                n10 = q((Map) jVar.b());
                break;
            case 4:
                n10 = I((Map) jVar.b());
                break;
            case 5:
                n10 = o((Map) jVar.b());
                break;
            case 6:
                n10 = t((Map) jVar.b());
                break;
            case 7:
                n10 = r((Map) jVar.b());
                break;
            case '\b':
                n10 = s((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        n10.c(new t4.d() { // from class: o8.c
            @Override // t4.d
            public final void a(t4.i iVar) {
                m.E(k.d.this, iVar);
            }
        });
    }
}
