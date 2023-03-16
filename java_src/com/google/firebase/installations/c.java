package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.firebase.installations.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k5.x;
import m6.d;
import m6.f;
import t4.j;
import t4.l;
import z3.o;
/* loaded from: classes.dex */
public class c implements j6.e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f5401m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f5402n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f5.e f5403a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.c f5404b;

    /* renamed from: c  reason: collision with root package name */
    private final l6.c f5405c;

    /* renamed from: d  reason: collision with root package name */
    private final i f5406d;

    /* renamed from: e  reason: collision with root package name */
    private final x<l6.b> f5407e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.g f5408f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5409g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f5410h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f5411i;

    /* renamed from: j  reason: collision with root package name */
    private String f5412j;

    /* renamed from: k  reason: collision with root package name */
    private Set<k6.a> f5413k;

    /* renamed from: l  reason: collision with root package name */
    private final List<h> f5414l;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5415a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f5415a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5416a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5417b;

        static {
            int[] iArr = new int[f.b.values().length];
            f5417b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5417b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5417b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f5416a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5416a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c(final f5.e eVar, i6.b<g6.i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new m6.c(eVar.l(), bVar), new l6.c(eVar), i.c(), new x(new i6.b() { // from class: j6.a
            @Override // i6.b
            public final Object get() {
                l6.b z10;
                z10 = com.google.firebase.installations.c.z(f5.e.this);
                return z10;
            }
        }), new j6.g());
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, f5.e eVar, m6.c cVar, l6.c cVar2, i iVar, x<l6.b> xVar, j6.g gVar) {
        this.f5409g = new Object();
        this.f5413k = new HashSet();
        this.f5414l = new ArrayList();
        this.f5403a = eVar;
        this.f5404b = cVar;
        this.f5405c = cVar2;
        this.f5406d = iVar;
        this.f5407e = xVar;
        this.f5408f = gVar;
        this.f5410h = executorService;
        this.f5411i = executor;
    }

    private void A() {
        o.f(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.f(u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.f(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(i.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(i.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String B(l6.d dVar) {
        if ((this.f5403a.p().equals("CHIME_ANDROID_SDK") || this.f5403a.x()) && dVar.m()) {
            String f10 = p().f();
            return TextUtils.isEmpty(f10) ? this.f5408f.a() : f10;
        }
        return this.f5408f.a();
    }

    private l6.d C(l6.d dVar) {
        m6.d d10 = this.f5404b.d(m(), dVar.d(), u(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i10 = b.f5416a[d10.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        return dVar.s(d10.c(), d10.d(), this.f5406d.b(), d10.b().c(), d10.b().d());
    }

    private void D(Exception exc) {
        synchronized (this.f5409g) {
            Iterator<h> it = this.f5414l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void E(l6.d dVar) {
        synchronized (this.f5409g) {
            Iterator<h> it = this.f5414l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void F(String str) {
        this.f5412j = str;
    }

    private synchronized void G(l6.d dVar, l6.d dVar2) {
        if (this.f5413k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            for (k6.a aVar : this.f5413k) {
                aVar.a(dVar2.d());
            }
        }
    }

    private t4.i<g> g() {
        j jVar = new j();
        i(new e(this.f5406d, jVar));
        return jVar.a();
    }

    private t4.i<String> h() {
        j jVar = new j();
        i(new f(jVar));
        return jVar.a();
    }

    private void i(h hVar) {
        synchronized (this.f5409g) {
            this.f5414l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(boolean r3) {
        /*
            r2 = this;
            l6.d r0 = r2.s()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.d -> L5c
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.d -> L5c
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f5406d     // Catch: com.google.firebase.installations.d -> L5c
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.d -> L5c
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            l6.d r3 = r2.l(r0)     // Catch: com.google.firebase.installations.d -> L5c
            goto L26
        L22:
            l6.d r3 = r2.C(r0)     // Catch: com.google.firebase.installations.d -> L5c
        L26:
            r2.v(r3)
            r2.G(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.F(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
        L46:
            r2.D(r3)
            goto L5b
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L58
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L46
        L58:
            r2.E(r3)
        L5b:
            return
        L5c:
            r3 = move-exception
            r2.D(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.w(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void y(final boolean z10) {
        l6.d t10 = t();
        if (z10) {
            t10 = t10.p();
        }
        E(t10);
        this.f5411i.execute(new Runnable() { // from class: j6.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w(z10);
            }
        });
    }

    private l6.d l(l6.d dVar) {
        m6.f e10 = this.f5404b.e(m(), dVar.d(), u(), dVar.f());
        int i10 = b.f5417b[e10.b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    F(null);
                    return dVar.r();
                }
                throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
            }
            return dVar.q("BAD CONFIG");
        }
        return dVar.o(e10.c(), e10.d(), this.f5406d.b());
    }

    private synchronized String o() {
        return this.f5412j;
    }

    private l6.b p() {
        return this.f5407e.get();
    }

    public static c q() {
        return r(f5.e.n());
    }

    public static c r(f5.e eVar) {
        o.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.j(j6.e.class);
    }

    private l6.d s() {
        l6.d d10;
        synchronized (f5401m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f5403a.l(), "generatefid.lock");
            d10 = this.f5405c.d();
            if (a10 != null) {
                a10.b();
            }
        }
        return d10;
    }

    private l6.d t() {
        l6.d d10;
        synchronized (f5401m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f5403a.l(), "generatefid.lock");
            d10 = this.f5405c.d();
            if (d10.j()) {
                d10 = this.f5405c.b(d10.t(B(d10)));
            }
            if (a10 != null) {
                a10.b();
            }
        }
        return d10;
    }

    private void v(l6.d dVar) {
        synchronized (f5401m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f5403a.l(), "generatefid.lock");
            this.f5405c.b(dVar);
            if (a10 != null) {
                a10.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l6.b z(f5.e eVar) {
        return new l6.b(eVar);
    }

    @Override // j6.e
    public t4.i<String> a() {
        A();
        String o10 = o();
        if (o10 != null) {
            return l.e(o10);
        }
        t4.i<String> h10 = h();
        this.f5410h.execute(new Runnable() { // from class: j6.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x();
            }
        });
        return h10;
    }

    @Override // j6.e
    public t4.i<g> b(final boolean z10) {
        A();
        t4.i<g> g10 = g();
        this.f5410h.execute(new Runnable() { // from class: j6.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.y(z10);
            }
        });
        return g10;
    }

    String m() {
        return this.f5403a.q().b();
    }

    String n() {
        return this.f5403a.q().c();
    }

    String u() {
        return this.f5403a.q().g();
    }
}
