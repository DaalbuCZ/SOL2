package f5;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k5.o;
import k5.x;
import z3.n;
/* loaded from: classes.dex */
public class e {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f7240k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map<String, e> f7241l = new m.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f7242a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7243b;

    /* renamed from: c  reason: collision with root package name */
    private final l f7244c;

    /* renamed from: d  reason: collision with root package name */
    private final o f7245d;

    /* renamed from: g  reason: collision with root package name */
    private final x<o6.a> f7248g;

    /* renamed from: h  reason: collision with root package name */
    private final i6.b<g6.f> f7249h;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f7246e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f7247f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f7250i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<f> f7251j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0077a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference<b> f7252a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (d4.l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f7252a.get() == null) {
                    b bVar = new b();
                    if (f7252a.compareAndSet(null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0077a
        public void a(boolean z10) {
            synchronized (e.f7240k) {
                Iterator it = new ArrayList(e.f7241l.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f7246e.get()) {
                        eVar.B(z10);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(c.j.f3076u3)
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f7253b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        private final Context f7254a;

        public c(Context context) {
            this.f7254a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f7253b.get() == null) {
                c cVar = new c(context);
                if (f7253b.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f7254a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f7240k) {
                for (e eVar : e.f7241l.values()) {
                    eVar.s();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, l lVar) {
        this.f7242a = (Context) z3.o.i(context);
        this.f7243b = z3.o.e(str);
        this.f7244c = (l) z3.o.i(lVar);
        m b10 = FirebaseInitProvider.b();
        e7.c.b("Firebase");
        e7.c.b("ComponentDiscovery");
        List<i6.b<ComponentRegistrar>> b11 = k5.g.c(context, ComponentDiscoveryService.class).b();
        e7.c.a();
        e7.c.b("Runtime");
        o.b g10 = o.m(l5.k.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(k5.c.s(context, Context.class, new Class[0])).b(k5.c.s(this, e.class, new Class[0])).b(k5.c.s(lVar, l.class, new Class[0])).g(new e7.b());
        if (androidx.core.os.i.a(context) && FirebaseInitProvider.c()) {
            g10.b(k5.c.s(b10, m.class, new Class[0]));
        }
        o e10 = g10.e();
        this.f7245d = e10;
        e7.c.a();
        this.f7248g = new x<>(new i6.b() { // from class: f5.d
            @Override // i6.b
            public final Object get() {
                o6.a y10;
                y10 = e.this.y(context);
                return y10;
            }
        });
        this.f7249h = e10.f(g6.f.class);
        g(new a() { // from class: f5.c
            @Override // f5.e.a
            public final void a(boolean z10) {
                e.this.z(z10);
            }
        });
        e7.c.a();
    }

    private static String A(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a aVar : this.f7250i) {
            aVar.a(z10);
        }
    }

    private void C() {
        for (f fVar : this.f7251j) {
            fVar.a(this.f7243b, this.f7244c);
        }
    }

    private void h() {
        z3.o.m(!this.f7247f.get(), "FirebaseApp was deleted");
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f7240k) {
            for (e eVar : f7241l.values()) {
                arrayList.add(eVar.p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<e> m(Context context) {
        ArrayList arrayList;
        synchronized (f7240k) {
            arrayList = new ArrayList(f7241l.values());
        }
        return arrayList;
    }

    public static e n() {
        e eVar;
        synchronized (f7240k) {
            eVar = f7241l.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + d4.m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e o(String str) {
        e eVar;
        List<String> k10;
        String str2;
        synchronized (f7240k) {
            eVar = f7241l.get(A(str));
            if (eVar == null) {
                if (k().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", k10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            eVar.f7249h.get().l();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (!androidx.core.os.i.a(this.f7242a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f7242a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f7245d.p(x());
        this.f7249h.get().l();
    }

    public static e t(Context context) {
        synchronized (f7240k) {
            if (f7241l.containsKey("[DEFAULT]")) {
                return n();
            }
            l a10 = l.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return u(context, a10);
        }
    }

    public static e u(Context context, l lVar) {
        return v(context, lVar, "[DEFAULT]");
    }

    public static e v(Context context, l lVar, String str) {
        e eVar;
        b.c(context);
        String A = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7240k) {
            Map<String, e> map = f7241l;
            boolean z10 = !map.containsKey(A);
            z3.o.m(z10, "FirebaseApp name " + A + " already exists!");
            z3.o.j(context, "Application context cannot be null.");
            eVar = new e(context, A, lVar);
            map.put(A, eVar);
        }
        eVar.s();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o6.a y(Context context) {
        return new o6.a(context, r(), (f6.c) this.f7245d.a(f6.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(boolean z10) {
        if (z10) {
            return;
        }
        this.f7249h.get().l();
    }

    public void D(boolean z10) {
        boolean z11;
        h();
        if (this.f7246e.compareAndSet(!z10, z10)) {
            boolean d10 = com.google.android.gms.common.api.internal.a.b().d();
            if (z10 && d10) {
                z11 = true;
            } else if (z10 || !d10) {
                return;
            } else {
                z11 = false;
            }
            B(z11);
        }
    }

    public void E(Boolean bool) {
        h();
        this.f7248g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f7243b.equals(((e) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f7246e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.f7250i.add(aVar);
    }

    public int hashCode() {
        return this.f7243b.hashCode();
    }

    public void i() {
        if (this.f7247f.compareAndSet(false, true)) {
            synchronized (f7240k) {
                f7241l.remove(this.f7243b);
            }
            C();
        }
    }

    public <T> T j(Class<T> cls) {
        h();
        return (T) this.f7245d.a(cls);
    }

    public Context l() {
        h();
        return this.f7242a;
    }

    public String p() {
        h();
        return this.f7243b;
    }

    public l q() {
        h();
        return this.f7244c;
    }

    public String r() {
        return d4.c.a(p().getBytes(Charset.defaultCharset())) + "+" + d4.c.a(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return n.c(this).a("name", this.f7243b).a("options", this.f7244c).toString();
    }

    public boolean w() {
        h();
        return this.f7248g.get().b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
