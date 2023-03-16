package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import c8.a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l8.k;
import l8.n;
import t4.l;
/* loaded from: classes.dex */
public class e extends BroadcastReceiver implements FlutterFirebasePlugin, k.c, n, c8.a, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private final HashMap<String, Boolean> f8965n = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private k f8966o;

    /* renamed from: p  reason: collision with root package name */
    private Activity f8967p;

    /* renamed from: q  reason: collision with root package name */
    private o0 f8968q;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, Object> f8969r;

    /* renamed from: s  reason: collision with root package name */
    h f8970s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f8971n;

        a(String str) {
            this.f8971n = str;
            put("token", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends HashMap<String, Object> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ FirebaseMessaging f8973n;

        b(FirebaseMessaging firebaseMessaging) {
            this.f8973n = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.y()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(f5.e eVar, t4.j jVar) {
        try {
            HashMap hashMap = new HashMap();
            if (eVar.p().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.r().y()));
            }
            jVar.c(hashMap);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(t4.j jVar) {
        try {
            jVar.c(new a((String) l.a(FirebaseMessaging.r().u())));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(k.d dVar, t4.i iVar) {
        if (iVar.p()) {
            dVar.a(iVar.l());
            return;
        }
        Exception k10 = iVar.k();
        dVar.b("firebase_messaging", k10 != null ? k10.getMessage() : null, r(k10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(final t4.j jVar) {
        final HashMap hashMap = new HashMap();
        try {
            if (p().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                jVar.c(hashMap);
            } else {
                this.f8970s.a(this.f8967p, new h.a() { // from class: io.flutter.plugins.firebase.messaging.d
                    @Override // io.flutter.plugins.firebase.messaging.h.a
                    public final void a(int i10) {
                        e.E(hashMap, jVar, i10);
                    }
                }, new io.flutter.plugins.firebase.messaging.a() { // from class: io.flutter.plugins.firebase.messaging.c
                    @Override // io.flutter.plugins.firebase.messaging.a
                    public final void a(String str) {
                        e.F(t4.j.this, str);
                    }
                });
            }
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(Map map, t4.j jVar, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        jVar.c(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(t4.j jVar, String str) {
        jVar.b(new Exception(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Map map, t4.j jVar) {
        try {
            g.a(map).L(g.b(map));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Map map, t4.j jVar) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a10.M(((Boolean) obj).booleanValue());
            jVar.c(new b(a10));
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Map map, t4.j jVar) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a10.N(((Boolean) obj).booleanValue());
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(Map map, t4.j jVar) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            l.a(a10.R((String) obj));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(Map map, t4.j jVar) {
        try {
            FirebaseMessaging a10 = g.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            l.a(a10.U((String) obj));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    private t4.i<Map<String, Integer>> L() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.k
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.this.D(jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> M(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.n
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.G(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Map<String, Object>> N(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.i
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.this.H(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> O(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.o
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.I(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> P(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.p
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.J(map, jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Void> Q(final Map<String, Object> map) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.q
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.K(map, jVar);
            }
        });
        return jVar.a();
    }

    private Boolean p() {
        return Boolean.valueOf(p8.a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private t4.i<Void> q() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.f
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.w(t4.j.this);
            }
        });
        return jVar.a();
    }

    private Map<String, Object> r(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put("message", exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private t4.i<Map<String, Object>> s() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.l
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.this.y(jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Map<String, Integer>> t() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.m
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.this.z(jVar);
            }
        });
        return jVar.a();
    }

    private t4.i<Map<String, Object>> u() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.j
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.this.B(jVar);
            }
        });
        return jVar.a();
    }

    private void v(l8.c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/firebase_messaging");
        this.f8966o = kVar;
        kVar.e(this);
        this.f8970s = new h();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.TOKEN");
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.NOTIFICATION");
        w.a.b(p8.a.a()).c(this, intentFilter);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(t4.j jVar) {
        try {
            l.a(FirebaseMessaging.r().o());
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(t4.j jVar) {
        Map map;
        try {
            o0 o0Var = this.f8968q;
            if (o0Var != null) {
                Map<String, Object> f10 = g.f(o0Var);
                Map<String, Object> map2 = this.f8969r;
                if (map2 != null) {
                    f10.put("notification", map2);
                }
                jVar.c(f10);
                this.f8968q = null;
                this.f8969r = null;
                return;
            }
            Activity activity = this.f8967p;
            if (activity == null) {
                jVar.c(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.f8965n.get(string) == null) {
                    o0 o0Var2 = FlutterFirebaseMessagingReceiver.f8954a.get(string);
                    if (o0Var2 == null) {
                        Map<String, Object> a10 = f.b().a(string);
                        if (a10 != null) {
                            o0Var2 = g.b(a10);
                            if (a10.get("notification") != null) {
                                map = (Map) a10.get("notification");
                                f.b().g(string);
                            }
                        }
                        map = null;
                        f.b().g(string);
                    } else {
                        map = null;
                    }
                    if (o0Var2 == null) {
                        jVar.c(null);
                        return;
                    }
                    this.f8965n.put(string, Boolean.TRUE);
                    Map<String, Object> f11 = g.f(o0Var2);
                    if (o0Var2.E() == null && map != null) {
                        f11.put("notification", map);
                    }
                    jVar.c(f11);
                    return;
                }
                jVar.c(null);
                return;
            }
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(t4.j jVar) {
        Integer valueOf;
        try {
            HashMap hashMap = new HashMap();
            int i10 = 1;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!p().booleanValue()) {
                    i10 = 0;
                }
                valueOf = Integer.valueOf(i10);
            } else {
                if (!androidx.core.app.n.f(this.f8967p).a()) {
                    i10 = 0;
                }
                valueOf = Integer.valueOf(i10);
            }
            hashMap.put("authorizationStatus", valueOf);
            jVar.c(hashMap);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Void> didReinitializeFirebaseCore() {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.g
            @Override // java.lang.Runnable
            public final void run() {
                t4.j.this.c(null);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public t4.i<Map<String, Object>> getPluginConstantsForFirebaseApp(final f5.e eVar) {
        final t4.j jVar = new t4.j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: p8.e
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.firebase.messaging.e.A(f5.e.this, jVar);
            }
        });
        return jVar.a();
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        cVar.f(this);
        cVar.c(this.f8970s);
        Activity e10 = cVar.e();
        this.f8967p = e10;
        if (e10.getIntent() == null || this.f8967p.getIntent().getExtras() == null || (this.f8967p.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.f8967p.getIntent());
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        v(bVar.b());
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        this.f8967p = null;
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f8967p = null;
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        w.a.b(bVar.a()).e(this);
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, final k.d dVar) {
        t4.i s10;
        String str = jVar.f11211a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c10 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c10 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c10 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                s10 = s();
                break;
            case 1:
                s10 = N((Map) jVar.b());
                break;
            case 2:
                s10 = q();
                break;
            case 3:
                s10 = Q((Map) jVar.b());
                break;
            case 4:
                s10 = P((Map) jVar.b());
                break;
            case 5:
                s10 = O((Map) jVar.b());
                break;
            case 6:
                Map map = (Map) jVar.f11212b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                long longValue = (obj instanceof Long ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
                long longValue2 = (obj2 instanceof Long ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue();
                Activity activity = this.f8967p;
                io.flutter.embedding.engine.e a10 = activity != null ? io.flutter.embedding.engine.e.a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.n(longValue);
                FlutterFirebaseMessagingBackgroundService.o(longValue2);
                FlutterFirebaseMessagingBackgroundService.p(longValue, a10);
                s10 = l.e(null);
                break;
            case 7:
                s10 = M((Map) jVar.b());
                break;
            case '\b':
                if (Build.VERSION.SDK_INT >= 33) {
                    s10 = L();
                    break;
                }
            case '\t':
                s10 = t();
                break;
            case '\n':
                s10 = u();
                break;
            default:
                dVar.c();
                return;
        }
        s10.c(new t4.d() { // from class: p8.h
            @Override // t4.d
            public final void a(t4.i iVar) {
                io.flutter.plugins.firebase.messaging.e.this.C(dVar, iVar);
            }
        });
    }

    @Override // l8.n
    public boolean onNewIntent(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> a10;
        if (intent == null || intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        o0 o0Var = FlutterFirebaseMessagingReceiver.f8954a.get(string);
        Map<String, Object> map2 = null;
        if (o0Var == null && (a10 = f.b().a(string)) != null) {
            o0Var = g.b(a10);
            map2 = g.c(a10);
        }
        if (o0Var == null) {
            return false;
        }
        this.f8968q = o0Var;
        this.f8969r = map2;
        FlutterFirebaseMessagingReceiver.f8954a.remove(string);
        Map<String, Object> f10 = g.f(o0Var);
        if (o0Var.E() == null && (map = this.f8969r) != null) {
            f10.put("notification", map);
        }
        this.f8966o.c("Messaging#onMessageOpenedApp", f10);
        this.f8967p.setIntent(intent);
        return true;
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        cVar.f(this);
        this.f8967p = cVar.e();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        o0 o0Var;
        Object f10;
        k kVar;
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("io.flutter.plugins.firebase.messaging.TOKEN")) {
            f10 = intent.getStringExtra("token");
            kVar = this.f8966o;
            str = "Messaging#onTokenRefresh";
        } else if (!action.equals("io.flutter.plugins.firebase.messaging.NOTIFICATION") || (o0Var = (o0) intent.getParcelableExtra("notification")) == null) {
            return;
        } else {
            f10 = g.f(o0Var);
            kVar = this.f8966o;
            str = "Messaging#onMessage";
        }
        kVar.c(str, f10);
    }
}
