package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.plugin.platform.q;
import java.util.HashSet;
import java.util.Set;
import k8.f;
import k8.g;
import k8.h;
import k8.i;
import k8.l;
import k8.m;
import k8.n;
import k8.o;
import k8.p;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f8610a;

    /* renamed from: b  reason: collision with root package name */
    private final j8.a f8611b;

    /* renamed from: c  reason: collision with root package name */
    private final y7.a f8612c;

    /* renamed from: d  reason: collision with root package name */
    private final c f8613d;

    /* renamed from: e  reason: collision with root package name */
    private final m8.a f8614e;

    /* renamed from: f  reason: collision with root package name */
    private final k8.a f8615f;

    /* renamed from: g  reason: collision with root package name */
    private final k8.b f8616g;

    /* renamed from: h  reason: collision with root package name */
    private final k8.e f8617h;

    /* renamed from: i  reason: collision with root package name */
    private final f f8618i;

    /* renamed from: j  reason: collision with root package name */
    private final g f8619j;

    /* renamed from: k  reason: collision with root package name */
    private final h f8620k;

    /* renamed from: l  reason: collision with root package name */
    private final l f8621l;

    /* renamed from: m  reason: collision with root package name */
    private final i f8622m;

    /* renamed from: n  reason: collision with root package name */
    private final m f8623n;

    /* renamed from: o  reason: collision with root package name */
    private final n f8624o;

    /* renamed from: p  reason: collision with root package name */
    private final o f8625p;

    /* renamed from: q  reason: collision with root package name */
    private final p f8626q;

    /* renamed from: r  reason: collision with root package name */
    private final q f8627r;

    /* renamed from: s  reason: collision with root package name */
    private final Set<b> f8628s;

    /* renamed from: t  reason: collision with root package name */
    private final b f8629t;

    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0130a implements b {
        C0130a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            x7.b.f("FlutterEngine", "onPreEngineRestart()");
            for (b bVar : a.this.f8628s) {
                bVar.b();
            }
            a.this.f8627r.b0();
            a.this.f8621l.g();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, a8.f fVar, FlutterJNI flutterJNI, q qVar, String[] strArr, boolean z10) {
        this(context, fVar, flutterJNI, qVar, strArr, z10, false);
    }

    public a(Context context, a8.f fVar, FlutterJNI flutterJNI, q qVar, String[] strArr, boolean z10, boolean z11) {
        AssetManager assets;
        this.f8628s = new HashSet();
        this.f8629t = new C0130a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        x7.a e10 = x7.a.e();
        flutterJNI = flutterJNI == null ? e10.d().a() : flutterJNI;
        this.f8610a = flutterJNI;
        y7.a aVar = new y7.a(flutterJNI, assets);
        this.f8612c = aVar;
        aVar.p();
        z7.a a10 = x7.a.e().a();
        this.f8615f = new k8.a(aVar, flutterJNI);
        k8.b bVar = new k8.b(aVar);
        this.f8616g = bVar;
        this.f8617h = new k8.e(aVar);
        f fVar2 = new f(aVar);
        this.f8618i = fVar2;
        this.f8619j = new g(aVar);
        this.f8620k = new h(aVar);
        this.f8622m = new i(aVar);
        this.f8621l = new l(aVar, z11);
        this.f8623n = new m(aVar);
        this.f8624o = new n(aVar);
        this.f8625p = new o(aVar);
        this.f8626q = new p(aVar);
        if (a10 != null) {
            a10.e(bVar);
        }
        m8.a aVar2 = new m8.a(context, fVar2);
        this.f8614e = aVar2;
        fVar = fVar == null ? e10.c() : fVar;
        if (!flutterJNI.isAttached()) {
            fVar.q(context.getApplicationContext());
            fVar.g(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f8629t);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e10.a());
        if (!flutterJNI.isAttached()) {
            d();
        }
        this.f8611b = new j8.a(flutterJNI);
        this.f8627r = qVar;
        qVar.V();
        this.f8613d = new c(context.getApplicationContext(), this, fVar);
        aVar2.d(context.getResources().getConfiguration());
        if (z10 && fVar.f()) {
            i8.a.a(this);
        }
    }

    public a(Context context, a8.f fVar, FlutterJNI flutterJNI, String[] strArr, boolean z10) {
        this(context, fVar, flutterJNI, new q(), strArr, z10);
    }

    public a(Context context, String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public a(Context context, String[] strArr, boolean z10) {
        this(context, null, null, strArr, z10);
    }

    public a(Context context, String[] strArr, boolean z10, boolean z11) {
        this(context, null, null, new q(), strArr, z10, z11);
    }

    private void d() {
        x7.b.f("FlutterEngine", "Attaching to JNI.");
        this.f8610a.attachToNative();
        if (!v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean v() {
        return this.f8610a.isAttached();
    }

    public void e() {
        x7.b.f("FlutterEngine", "Destroying.");
        for (b bVar : this.f8628s) {
            bVar.a();
        }
        this.f8613d.j();
        this.f8627r.X();
        this.f8612c.q();
        this.f8610a.removeEngineLifecycleListener(this.f8629t);
        this.f8610a.setDeferredComponentManager(null);
        this.f8610a.detachFromNativeAndReleaseResources();
        if (x7.a.e().a() != null) {
            x7.a.e().a().d();
            this.f8616g.c(null);
        }
    }

    public k8.a f() {
        return this.f8615f;
    }

    public d8.b g() {
        return this.f8613d;
    }

    public y7.a h() {
        return this.f8612c;
    }

    public k8.e i() {
        return this.f8617h;
    }

    public m8.a j() {
        return this.f8614e;
    }

    public g k() {
        return this.f8619j;
    }

    public h l() {
        return this.f8620k;
    }

    public i m() {
        return this.f8622m;
    }

    public q n() {
        return this.f8627r;
    }

    public c8.b o() {
        return this.f8613d;
    }

    public j8.a p() {
        return this.f8611b;
    }

    public l q() {
        return this.f8621l;
    }

    public m r() {
        return this.f8623n;
    }

    public n s() {
        return this.f8624o;
    }

    public o t() {
        return this.f8625p;
    }

    public p u() {
        return this.f8626q;
    }
}
