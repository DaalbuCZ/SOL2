package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.r0;
import com.google.firebase.messaging.w0;
import h6.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: o  reason: collision with root package name */
    private static final long f5434o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p  reason: collision with root package name */
    private static w0 f5435p;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: q  reason: collision with root package name */
    static e1.g f5436q;

    /* renamed from: r  reason: collision with root package name */
    static ScheduledExecutorService f5437r;

    /* renamed from: a  reason: collision with root package name */
    private final f5.e f5438a;

    /* renamed from: b  reason: collision with root package name */
    private final h6.a f5439b;

    /* renamed from: c  reason: collision with root package name */
    private final j6.e f5440c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f5441d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f5442e;

    /* renamed from: f  reason: collision with root package name */
    private final r0 f5443f;

    /* renamed from: g  reason: collision with root package name */
    private final a f5444g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f5445h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f5446i;

    /* renamed from: j  reason: collision with root package name */
    private final Executor f5447j;

    /* renamed from: k  reason: collision with root package name */
    private final t4.i<b1> f5448k;

    /* renamed from: l  reason: collision with root package name */
    private final i0 f5449l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5450m;

    /* renamed from: n  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f5451n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private final f6.d f5452a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5453b;

        /* renamed from: c  reason: collision with root package name */
        private f6.b<f5.b> f5454c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f5455d;

        a(f6.d dVar) {
            this.f5452a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(f6.a aVar) {
            if (c()) {
                FirebaseMessaging.this.Q();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context l10 = FirebaseMessaging.this.f5438a.l();
            SharedPreferences sharedPreferences = l10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = l10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f5453b) {
                return;
            }
            Boolean e10 = e();
            this.f5455d = e10;
            if (e10 == null) {
                f6.b<f5.b> bVar = new f6.b() { // from class: com.google.firebase.messaging.a0
                    @Override // f6.b
                    public final void a(f6.a aVar) {
                        FirebaseMessaging.a.this.d(aVar);
                    }
                };
                this.f5454c = bVar;
                this.f5452a.d(f5.b.class, bVar);
            }
            this.f5453b = true;
        }

        synchronized boolean c() {
            Boolean bool;
            b();
            bool = this.f5455d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f5438a.w();
        }

        synchronized void f(boolean z10) {
            b();
            f6.b<f5.b> bVar = this.f5454c;
            if (bVar != null) {
                this.f5452a.b(f5.b.class, bVar);
                this.f5454c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f5438a.l().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z10);
            edit.apply();
            if (z10) {
                FirebaseMessaging.this.Q();
            }
            this.f5455d = Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(f5.e eVar, h6.a aVar, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2, e1.g gVar, f6.d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, gVar, dVar, new i0(eVar.l()));
    }

    FirebaseMessaging(f5.e eVar, h6.a aVar, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2, e1.g gVar, f6.d dVar, i0 i0Var) {
        this(eVar, aVar, eVar2, gVar, dVar, i0Var, new d0(eVar, i0Var, bVar, bVar2, eVar2), m.f(), m.c(), m.b());
    }

    FirebaseMessaging(f5.e eVar, h6.a aVar, j6.e eVar2, e1.g gVar, f6.d dVar, i0 i0Var, d0 d0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f5450m = false;
        f5436q = gVar;
        this.f5438a = eVar;
        this.f5439b = aVar;
        this.f5440c = eVar2;
        this.f5444g = new a(dVar);
        Context l10 = eVar.l();
        this.f5441d = l10;
        o oVar = new o();
        this.f5451n = oVar;
        this.f5449l = i0Var;
        this.f5446i = executor;
        this.f5442e = d0Var;
        this.f5443f = new r0(executor);
        this.f5445h = executor2;
        this.f5447j = executor3;
        Context l11 = eVar.l();
        if (l11 instanceof Application) {
            ((Application) l11).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + l11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c(new a.InterfaceC0119a() { // from class: com.google.firebase.messaging.r
                @Override // h6.a.InterfaceC0119a
                public final void a(String str) {
                    FirebaseMessaging.this.F(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.G();
            }
        });
        t4.i<b1> f10 = b1.f(this, i0Var, d0Var, l10, m.g());
        this.f5448k = f10;
        f10.f(executor2, new t4.f() { // from class: com.google.firebase.messaging.x
            @Override // t4.f
            public final void b(Object obj) {
                FirebaseMessaging.this.H((b1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.I();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t4.i A(final String str, final w0.a aVar) {
        return this.f5442e.f().q(this.f5447j, new t4.h() { // from class: com.google.firebase.messaging.y
            @Override // t4.h
            public final t4.i a(Object obj) {
                t4.i B;
                B = FirebaseMessaging.this.B(str, aVar, (String) obj);
                return B;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t4.i B(String str, w0.a aVar, String str2) {
        s(this.f5441d).g(t(), str, str2, this.f5449l.a());
        if (aVar == null || !str2.equals(aVar.f5640a)) {
            F(str2);
        }
        return t4.l.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(t4.j jVar) {
        try {
            this.f5439b.d(i0.c(this.f5438a), "FCM");
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(t4.j jVar) {
        try {
            t4.l.a(this.f5442e.c());
            s(this.f5441d).d(t(), i0.c(this.f5438a));
            jVar.c(null);
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(t4.j jVar) {
        try {
            jVar.c(n());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (y()) {
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(b1 b1Var) {
        if (y()) {
            b1Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        m0.c(this.f5441d);
    }

    private synchronized void P() {
        if (!this.f5450m) {
            S(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        h6.a aVar = this.f5439b;
        if (aVar != null) {
            aVar.a();
        } else if (T(v())) {
            P();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(f5.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.j(FirebaseMessaging.class);
            z3.o.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging r() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(f5.e.n());
        }
        return firebaseMessaging;
    }

    private static synchronized w0 s(Context context) {
        w0 w0Var;
        synchronized (FirebaseMessaging.class) {
            if (f5435p == null) {
                f5435p = new w0(context);
            }
            w0Var = f5435p;
        }
        return w0Var;
    }

    private String t() {
        return "[DEFAULT]".equals(this.f5438a.p()) ? "" : this.f5438a.r();
    }

    public static e1.g w() {
        return f5436q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void F(String str) {
        if ("[DEFAULT]".equals(this.f5438a.p())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f5438a.p());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new l(this.f5441d).i(intent);
        }
    }

    public void L(o0 o0Var) {
        if (TextUtils.isEmpty(o0Var.H())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.f5441d, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
        intent.setPackage("com.google.android.gms");
        o0Var.J(intent);
        this.f5441d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void M(boolean z10) {
        this.f5444g.f(z10);
    }

    public void N(boolean z10) {
        h0.y(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void O(boolean z10) {
        this.f5450m = z10;
    }

    public t4.i<Void> R(final String str) {
        return this.f5448k.r(new t4.h() { // from class: com.google.firebase.messaging.q
            @Override // t4.h
            public final t4.i a(Object obj) {
                t4.i r10;
                r10 = ((b1) obj).r(str);
                return r10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void S(long j10) {
        p(new x0(this, Math.min(Math.max(30L, 2 * j10), f5434o)), j10);
        this.f5450m = true;
    }

    boolean T(w0.a aVar) {
        return aVar == null || aVar.b(this.f5449l.a());
    }

    public t4.i<Void> U(final String str) {
        return this.f5448k.r(new t4.h() { // from class: com.google.firebase.messaging.z
            @Override // t4.h
            public final t4.i a(Object obj) {
                t4.i u10;
                u10 = ((b1) obj).u(str);
                return u10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        h6.a aVar = this.f5439b;
        if (aVar != null) {
            try {
                return (String) t4.l.a(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final w0.a v10 = v();
        if (T(v10)) {
            final String c10 = i0.c(this.f5438a);
            try {
                return (String) t4.l.a(this.f5443f.b(c10, new r0.a() { // from class: com.google.firebase.messaging.p
                    @Override // com.google.firebase.messaging.r0.a
                    public final t4.i start() {
                        t4.i A;
                        A = FirebaseMessaging.this.A(c10, v10);
                        return A;
                    }
                }));
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
        return v10.f5640a;
    }

    public t4.i<Void> o() {
        if (this.f5439b != null) {
            final t4.j jVar = new t4.j();
            this.f5445h.execute(new Runnable() { // from class: com.google.firebase.messaging.u
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.C(jVar);
                }
            });
            return jVar.a();
        } else if (v() == null) {
            return t4.l.e(null);
        } else {
            final t4.j jVar2 = new t4.j();
            m.e().execute(new Runnable() { // from class: com.google.firebase.messaging.w
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.D(jVar2);
                }
            });
            return jVar2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public void p(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f5437r == null) {
                f5437r = new ScheduledThreadPoolExecutor(1, new e4.a("TAG"));
            }
            f5437r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context q() {
        return this.f5441d;
    }

    public t4.i<String> u() {
        h6.a aVar = this.f5439b;
        if (aVar != null) {
            return aVar.b();
        }
        final t4.j jVar = new t4.j();
        this.f5445h.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.E(jVar);
            }
        });
        return jVar.a();
    }

    w0.a v() {
        return s(this.f5441d).e(t(), i0.c(this.f5438a));
    }

    public boolean y() {
        return this.f5444g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f5449l.g();
    }
}
