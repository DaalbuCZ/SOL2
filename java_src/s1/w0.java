package s1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p3.q;
import r3.f;
import s1.b;
import s1.d;
import s1.g2;
import s1.g3;
import s1.i1;
import s1.l3;
import s1.p2;
import s1.r;
import s1.t2;
import s1.w0;
import u2.p0;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w0 extends s1.e implements r {
    private final s1.d A;
    private final g3 B;
    private final r3 C;
    private final s3 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private d3 L;
    private u2.p0 M;
    private boolean N;
    private p2.b O;
    private z1 P;
    private z1 Q;
    private m1 R;
    private m1 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private r3.f X;
    private boolean Y;
    private TextureView Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f13870a0;

    /* renamed from: b  reason: collision with root package name */
    final n3.d0 f13871b;

    /* renamed from: b0  reason: collision with root package name */
    private int f13872b0;

    /* renamed from: c  reason: collision with root package name */
    final p2.b f13873c;

    /* renamed from: c0  reason: collision with root package name */
    private int f13874c0;

    /* renamed from: d  reason: collision with root package name */
    private final p3.g f13875d;

    /* renamed from: d0  reason: collision with root package name */
    private int f13876d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13877e;

    /* renamed from: e0  reason: collision with root package name */
    private v1.e f13878e0;

    /* renamed from: f  reason: collision with root package name */
    private final p2 f13879f;

    /* renamed from: f0  reason: collision with root package name */
    private v1.e f13880f0;

    /* renamed from: g  reason: collision with root package name */
    private final y2[] f13881g;

    /* renamed from: g0  reason: collision with root package name */
    private int f13882g0;

    /* renamed from: h  reason: collision with root package name */
    private final n3.c0 f13883h;

    /* renamed from: h0  reason: collision with root package name */
    private u1.e f13884h0;

    /* renamed from: i  reason: collision with root package name */
    private final p3.n f13885i;

    /* renamed from: i0  reason: collision with root package name */
    private float f13886i0;

    /* renamed from: j  reason: collision with root package name */
    private final i1.f f13887j;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f13888j0;

    /* renamed from: k  reason: collision with root package name */
    private final i1 f13889k;

    /* renamed from: k0  reason: collision with root package name */
    private d3.e f13890k0;

    /* renamed from: l  reason: collision with root package name */
    private final p3.q<p2.d> f13891l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f13892l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet<r.a> f13893m;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f13894m0;

    /* renamed from: n  reason: collision with root package name */
    private final l3.b f13895n;

    /* renamed from: n0  reason: collision with root package name */
    private p3.c0 f13896n0;

    /* renamed from: o  reason: collision with root package name */
    private final List<e> f13897o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f13898o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f13899p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f13900p0;

    /* renamed from: q  reason: collision with root package name */
    private final u.a f13901q;

    /* renamed from: q0  reason: collision with root package name */
    private o f13902q0;

    /* renamed from: r  reason: collision with root package name */
    private final t1.a f13903r;

    /* renamed from: r0  reason: collision with root package name */
    private q3.z f13904r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f13905s;

    /* renamed from: s0  reason: collision with root package name */
    private z1 f13906s0;

    /* renamed from: t  reason: collision with root package name */
    private final o3.f f13907t;

    /* renamed from: t0  reason: collision with root package name */
    private m2 f13908t0;

    /* renamed from: u  reason: collision with root package name */
    private final long f13909u;

    /* renamed from: u0  reason: collision with root package name */
    private int f13910u0;

    /* renamed from: v  reason: collision with root package name */
    private final long f13911v;

    /* renamed from: v0  reason: collision with root package name */
    private int f13912v0;

    /* renamed from: w  reason: collision with root package name */
    private final p3.d f13913w;

    /* renamed from: w0  reason: collision with root package name */
    private long f13914w0;

    /* renamed from: x  reason: collision with root package name */
    private final c f13915x;

    /* renamed from: y  reason: collision with root package name */
    private final d f13916y;

    /* renamed from: z  reason: collision with root package name */
    private final s1.b f13917z;

    /* loaded from: classes.dex */
    private static final class b {
        public static t1.t1 a(Context context, w0 w0Var, boolean z10) {
            t1.r1 A0 = t1.r1.A0(context);
            if (A0 == null) {
                p3.r.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new t1.t1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                w0Var.N0(A0);
            }
            return new t1.t1(A0.H0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements q3.x, u1.s, d3.n, k2.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, f.a, d.b, b.InterfaceC0192b, g3.b, r.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Q(p2.d dVar) {
            dVar.R(w0.this.P);
        }

        @Override // s1.g3.b
        public void A(final int i10, final boolean z10) {
            w0.this.f13891l.k(30, new q.a() { // from class: s1.x0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).o0(i10, z10);
                }
            });
        }

        @Override // s1.g3.b
        public void B(int i10) {
            final o R0 = w0.R0(w0.this.B);
            if (R0.equals(w0.this.f13902q0)) {
                return;
            }
            w0.this.f13902q0 = R0;
            w0.this.f13891l.k(29, new q.a() { // from class: s1.c1
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).l0(o.this);
                }
            });
        }

        @Override // q3.x
        public /* synthetic */ void C(m1 m1Var) {
            q3.m.a(this, m1Var);
        }

        @Override // s1.b.InterfaceC0192b
        public void D() {
            w0.this.X1(false, -1, 3);
        }

        @Override // s1.r.a
        public void E(boolean z10) {
            w0.this.a2();
        }

        @Override // s1.d.b
        public void F(float f10) {
            w0.this.O1();
        }

        @Override // s1.d.b
        public void a(int i10) {
            boolean p10 = w0.this.p();
            w0.this.X1(p10, i10, w0.b1(p10, i10));
        }

        @Override // u1.s
        public void b(final boolean z10) {
            if (w0.this.f13888j0 == z10) {
                return;
            }
            w0.this.f13888j0 = z10;
            w0.this.f13891l.k(23, new q.a() { // from class: s1.e1
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).b(z10);
                }
            });
        }

        @Override // u1.s
        public void c(Exception exc) {
            w0.this.f13903r.c(exc);
        }

        @Override // d3.n
        public void d(final d3.e eVar) {
            w0.this.f13890k0 = eVar;
            w0.this.f13891l.k(27, new q.a() { // from class: s1.y0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).d(d3.e.this);
                }
            });
        }

        @Override // q3.x
        public void e(String str) {
            w0.this.f13903r.e(str);
        }

        @Override // q3.x
        public void f(Object obj, long j10) {
            w0.this.f13903r.f(obj, j10);
            if (w0.this.U == obj) {
                w0.this.f13891l.k(26, f1.f13376a);
            }
        }

        @Override // q3.x
        public void g(String str, long j10, long j11) {
            w0.this.f13903r.g(str, j10, j11);
        }

        @Override // r3.f.a
        public void h(Surface surface) {
            w0.this.T1(null);
        }

        @Override // u1.s
        public void i(v1.e eVar) {
            w0.this.f13880f0 = eVar;
            w0.this.f13903r.i(eVar);
        }

        @Override // d3.n
        public void j(final List<d3.b> list) {
            w0.this.f13891l.k(27, new q.a() { // from class: s1.z0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).j(list);
                }
            });
        }

        @Override // u1.s
        public void k(long j10) {
            w0.this.f13903r.k(j10);
        }

        @Override // u1.s
        public void l(Exception exc) {
            w0.this.f13903r.l(exc);
        }

        @Override // q3.x
        public void m(Exception exc) {
            w0.this.f13903r.m(exc);
        }

        @Override // u1.s
        public void n(v1.e eVar) {
            w0.this.f13903r.n(eVar);
            w0.this.S = null;
            w0.this.f13880f0 = null;
        }

        @Override // q3.x
        public void o(final q3.z zVar) {
            w0.this.f13904r0 = zVar;
            w0.this.f13891l.k(25, new q.a() { // from class: s1.b1
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).o(q3.z.this);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            w0.this.S1(surfaceTexture);
            w0.this.I1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            w0.this.T1(null);
            w0.this.I1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            w0.this.I1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // u1.s
        public /* synthetic */ void p(m1 m1Var) {
            u1.h.a(this, m1Var);
        }

        @Override // u1.s
        public void q(String str) {
            w0.this.f13903r.q(str);
        }

        @Override // u1.s
        public void r(String str, long j10, long j11) {
            w0.this.f13903r.r(str, j10, j11);
        }

        @Override // u1.s
        public void s(m1 m1Var, v1.i iVar) {
            w0.this.S = m1Var;
            w0.this.f13903r.s(m1Var, iVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            w0.this.I1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (w0.this.Y) {
                w0.this.T1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (w0.this.Y) {
                w0.this.T1(null);
            }
            w0.this.I1(0, 0);
        }

        @Override // q3.x
        public void t(v1.e eVar) {
            w0.this.f13903r.t(eVar);
            w0.this.R = null;
            w0.this.f13878e0 = null;
        }

        @Override // u1.s
        public void u(int i10, long j10, long j11) {
            w0.this.f13903r.u(i10, j10, j11);
        }

        @Override // q3.x
        public void v(int i10, long j10) {
            w0.this.f13903r.v(i10, j10);
        }

        @Override // q3.x
        public void w(m1 m1Var, v1.i iVar) {
            w0.this.R = m1Var;
            w0.this.f13903r.w(m1Var, iVar);
        }

        @Override // k2.f
        public void x(final k2.a aVar) {
            w0 w0Var = w0.this;
            w0Var.f13906s0 = w0Var.f13906s0.b().J(aVar).F();
            z1 Q0 = w0.this.Q0();
            if (!Q0.equals(w0.this.P)) {
                w0.this.P = Q0;
                w0.this.f13891l.i(14, new q.a() { // from class: s1.d1
                    @Override // p3.q.a
                    public final void c(Object obj) {
                        w0.c.this.Q((p2.d) obj);
                    }
                });
            }
            w0.this.f13891l.i(28, new q.a() { // from class: s1.a1
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).x(k2.a.this);
                }
            });
            w0.this.f13891l.f();
        }

        @Override // q3.x
        public void y(long j10, int i10) {
            w0.this.f13903r.y(j10, i10);
        }

        @Override // q3.x
        public void z(v1.e eVar) {
            w0.this.f13878e0 = eVar;
            w0.this.f13903r.z(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements q3.j, r3.a, t2.b {

        /* renamed from: n  reason: collision with root package name */
        private q3.j f13919n;

        /* renamed from: o  reason: collision with root package name */
        private r3.a f13920o;

        /* renamed from: p  reason: collision with root package name */
        private q3.j f13921p;

        /* renamed from: q  reason: collision with root package name */
        private r3.a f13922q;

        private d() {
        }

        @Override // r3.a
        public void a(long j10, float[] fArr) {
            r3.a aVar = this.f13922q;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            r3.a aVar2 = this.f13920o;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // r3.a
        public void d() {
            r3.a aVar = this.f13922q;
            if (aVar != null) {
                aVar.d();
            }
            r3.a aVar2 = this.f13920o;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        @Override // q3.j
        public void j(long j10, long j11, m1 m1Var, MediaFormat mediaFormat) {
            q3.j jVar = this.f13921p;
            if (jVar != null) {
                jVar.j(j10, j11, m1Var, mediaFormat);
            }
            q3.j jVar2 = this.f13919n;
            if (jVar2 != null) {
                jVar2.j(j10, j11, m1Var, mediaFormat);
            }
        }

        @Override // s1.t2.b
        public void p(int i10, Object obj) {
            r3.a cameraMotionListener;
            if (i10 == 7) {
                this.f13919n = (q3.j) obj;
            } else if (i10 == 8) {
                this.f13920o = (r3.a) obj;
            } else if (i10 != 10000) {
            } else {
                r3.f fVar = (r3.f) obj;
                if (fVar == null) {
                    cameraMotionListener = null;
                    this.f13921p = null;
                } else {
                    this.f13921p = fVar.getVideoFrameMetadataListener();
                    cameraMotionListener = fVar.getCameraMotionListener();
                }
                this.f13922q = cameraMotionListener;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f13923a;

        /* renamed from: b  reason: collision with root package name */
        private l3 f13924b;

        public e(Object obj, l3 l3Var) {
            this.f13923a = obj;
            this.f13924b = l3Var;
        }

        @Override // s1.e2
        public Object a() {
            return this.f13923a;
        }

        @Override // s1.e2
        public l3 b() {
            return this.f13924b;
        }
    }

    static {
        j1.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public w0(r.b bVar, p2 p2Var) {
        w0 w0Var;
        p3.g gVar = new p3.g();
        this.f13875d = gVar;
        try {
            p3.r.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + p3.m0.f12310e + "]");
            Context applicationContext = bVar.f13702a.getApplicationContext();
            this.f13877e = applicationContext;
            t1.a apply = bVar.f13710i.apply(bVar.f13703b);
            this.f13903r = apply;
            this.f13896n0 = bVar.f13712k;
            this.f13884h0 = bVar.f13713l;
            this.f13870a0 = bVar.f13718q;
            this.f13872b0 = bVar.f13719r;
            this.f13888j0 = bVar.f13717p;
            this.E = bVar.f13726y;
            c cVar = new c();
            this.f13915x = cVar;
            d dVar = new d();
            this.f13916y = dVar;
            Handler handler = new Handler(bVar.f13711j);
            y2[] a10 = bVar.f13705d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f13881g = a10;
            p3.a.f(a10.length > 0);
            n3.c0 c0Var = bVar.f13707f.get();
            this.f13883h = c0Var;
            this.f13901q = bVar.f13706e.get();
            o3.f fVar = bVar.f13709h.get();
            this.f13907t = fVar;
            this.f13899p = bVar.f13720s;
            this.L = bVar.f13721t;
            this.f13909u = bVar.f13722u;
            this.f13911v = bVar.f13723v;
            this.N = bVar.f13727z;
            Looper looper = bVar.f13711j;
            this.f13905s = looper;
            p3.d dVar2 = bVar.f13703b;
            this.f13913w = dVar2;
            p2 p2Var2 = p2Var == null ? this : p2Var;
            this.f13879f = p2Var2;
            this.f13891l = new p3.q<>(looper, dVar2, new q.b() { // from class: s1.m0
                @Override // p3.q.b
                public final void a(Object obj, p3.l lVar) {
                    w0.this.k1((p2.d) obj, lVar);
                }
            });
            this.f13893m = new CopyOnWriteArraySet<>();
            this.f13897o = new ArrayList();
            this.M = new p0.a(0);
            n3.d0 d0Var = new n3.d0(new b3[a10.length], new n3.t[a10.length], q3.f13693o, null);
            this.f13871b = d0Var;
            this.f13895n = new l3.b();
            p2.b e10 = new p2.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, c0Var.d()).e();
            this.f13873c = e10;
            this.O = new p2.b.a().b(e10).a(4).a(10).e();
            this.f13885i = dVar2.c(looper, null);
            i1.f fVar2 = new i1.f() { // from class: s1.n0
                @Override // s1.i1.f
                public final void a(i1.e eVar) {
                    w0.this.m1(eVar);
                }
            };
            this.f13887j = fVar2;
            this.f13908t0 = m2.j(d0Var);
            apply.H(p2Var2, looper);
            int i10 = p3.m0.f12306a;
            try {
                i1 i1Var = new i1(a10, c0Var, d0Var, bVar.f13708g.get(), fVar, this.F, this.G, apply, this.L, bVar.f13724w, bVar.f13725x, this.N, looper, dVar2, fVar2, i10 < 31 ? new t1.t1() : b.a(applicationContext, this, bVar.A));
                w0Var = this;
                try {
                    w0Var.f13889k = i1Var;
                    w0Var.f13886i0 = 1.0f;
                    w0Var.F = 0;
                    z1 z1Var = z1.T;
                    w0Var.P = z1Var;
                    w0Var.Q = z1Var;
                    w0Var.f13906s0 = z1Var;
                    w0Var.f13910u0 = -1;
                    w0Var.f13882g0 = i10 < 21 ? w0Var.h1(0) : p3.m0.F(applicationContext);
                    w0Var.f13890k0 = d3.e.f6537o;
                    w0Var.f13892l0 = true;
                    w0Var.l(apply);
                    fVar.i(new Handler(looper), apply);
                    w0Var.O0(cVar);
                    long j10 = bVar.f13704c;
                    if (j10 > 0) {
                        i1Var.v(j10);
                    }
                    s1.b bVar2 = new s1.b(bVar.f13702a, handler, cVar);
                    w0Var.f13917z = bVar2;
                    bVar2.b(bVar.f13716o);
                    s1.d dVar3 = new s1.d(bVar.f13702a, handler, cVar);
                    w0Var.A = dVar3;
                    dVar3.m(bVar.f13714m ? w0Var.f13884h0 : null);
                    g3 g3Var = new g3(bVar.f13702a, handler, cVar);
                    w0Var.B = g3Var;
                    g3Var.h(p3.m0.f0(w0Var.f13884h0.f14911p));
                    r3 r3Var = new r3(bVar.f13702a);
                    w0Var.C = r3Var;
                    r3Var.a(bVar.f13715n != 0);
                    s3 s3Var = new s3(bVar.f13702a);
                    w0Var.D = s3Var;
                    s3Var.a(bVar.f13715n == 2);
                    w0Var.f13902q0 = R0(g3Var);
                    w0Var.f13904r0 = q3.z.f12692r;
                    c0Var.h(w0Var.f13884h0);
                    w0Var.N1(1, 10, Integer.valueOf(w0Var.f13882g0));
                    w0Var.N1(2, 10, Integer.valueOf(w0Var.f13882g0));
                    w0Var.N1(1, 3, w0Var.f13884h0);
                    w0Var.N1(2, 4, Integer.valueOf(w0Var.f13870a0));
                    w0Var.N1(2, 5, Integer.valueOf(w0Var.f13872b0));
                    w0Var.N1(1, 9, Boolean.valueOf(w0Var.f13888j0));
                    w0Var.N1(2, 7, dVar);
                    w0Var.N1(6, 8, dVar);
                    gVar.e();
                } catch (Throwable th) {
                    th = th;
                    w0Var.f13875d.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                w0Var = this;
            }
        } catch (Throwable th3) {
            th = th3;
            w0Var = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A1(m2 m2Var, p2.d dVar) {
        dVar.B(m2Var.f13627l, m2Var.f13620e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B1(m2 m2Var, p2.d dVar) {
        dVar.W(m2Var.f13620e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C1(m2 m2Var, int i10, p2.d dVar) {
        dVar.X(m2Var.f13627l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D1(m2 m2Var, p2.d dVar) {
        dVar.A(m2Var.f13628m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E1(m2 m2Var, p2.d dVar) {
        dVar.p0(i1(m2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F1(m2 m2Var, p2.d dVar) {
        dVar.p(m2Var.f13629n);
    }

    private m2 G1(m2 m2Var, l3 l3Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        p3.a.a(l3Var.u() || pair != null);
        l3 l3Var2 = m2Var.f13616a;
        m2 i11 = m2Var.i(l3Var);
        if (l3Var.u()) {
            u.b k10 = m2.k();
            long A0 = p3.m0.A0(this.f13914w0);
            m2 b10 = i11.c(k10, A0, A0, A0, 0L, u2.v0.f15373q, this.f13871b, b5.q.J()).b(k10);
            b10.f13631p = b10.f13633r;
            return b10;
        }
        Object obj = i11.f13617b.f15356a;
        boolean z10 = !obj.equals(((Pair) p3.m0.j(pair)).first);
        u.b bVar = z10 ? new u.b(pair.first) : i11.f13617b;
        long longValue = ((Long) pair.second).longValue();
        long A02 = p3.m0.A0(k());
        if (!l3Var2.u()) {
            A02 -= l3Var2.l(obj, this.f13895n).q();
        }
        if (z10 || longValue < A02) {
            p3.a.f(!bVar.b());
            m2 b11 = i11.c(bVar, longValue, longValue, longValue, 0L, z10 ? u2.v0.f15373q : i11.f13623h, z10 ? this.f13871b : i11.f13624i, z10 ? b5.q.J() : i11.f13625j).b(bVar);
            b11.f13631p = longValue;
            return b11;
        }
        if (i10 == 0) {
            int f10 = l3Var.f(i11.f13626k.f15356a);
            if (f10 == -1 || l3Var.j(f10, this.f13895n).f13544p != l3Var.l(bVar.f15356a, this.f13895n).f13544p) {
                l3Var.l(bVar.f15356a, this.f13895n);
                j10 = bVar.b() ? this.f13895n.e(bVar.f15357b, bVar.f15358c) : this.f13895n.f13545q;
                i11 = i11.c(bVar, i11.f13633r, i11.f13633r, i11.f13619d, j10 - i11.f13633r, i11.f13623h, i11.f13624i, i11.f13625j).b(bVar);
            }
            return i11;
        }
        p3.a.f(!bVar.b());
        long max = Math.max(0L, i11.f13632q - (longValue - A02));
        j10 = i11.f13631p;
        if (i11.f13626k.equals(i11.f13617b)) {
            j10 = longValue + max;
        }
        i11 = i11.c(bVar, longValue, longValue, longValue, max, i11.f13623h, i11.f13624i, i11.f13625j);
        i11.f13631p = j10;
        return i11;
    }

    private Pair<Object, Long> H1(l3 l3Var, int i10, long j10) {
        if (l3Var.u()) {
            this.f13910u0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f13914w0 = j10;
            this.f13912v0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= l3Var.t()) {
            i10 = l3Var.e(this.G);
            j10 = l3Var.r(i10, this.f13358a).d();
        }
        return l3Var.n(this.f13358a, this.f13895n, i10, p3.m0.A0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1(final int i10, final int i11) {
        if (i10 == this.f13874c0 && i11 == this.f13876d0) {
            return;
        }
        this.f13874c0 = i10;
        this.f13876d0 = i11;
        this.f13891l.k(24, new q.a() { // from class: s1.p0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((p2.d) obj).h0(i10, i11);
            }
        });
    }

    private long J1(l3 l3Var, u.b bVar, long j10) {
        l3Var.l(bVar.f15356a, this.f13895n);
        return j10 + this.f13895n.q();
    }

    private m2 K1(int i10, int i11) {
        boolean z10 = false;
        p3.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f13897o.size());
        int w10 = w();
        l3 F = F();
        int size = this.f13897o.size();
        this.H++;
        L1(i10, i11);
        l3 S0 = S0();
        m2 G1 = G1(this.f13908t0, S0, a1(F, S0));
        int i12 = G1.f13620e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && w10 >= G1.f13616a.t()) {
            z10 = true;
        }
        if (z10) {
            G1 = G1.g(4);
        }
        this.f13889k.o0(i10, i11, this.M);
        return G1;
    }

    private void L1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f13897o.remove(i12);
        }
        this.M = this.M.b(i10, i11);
    }

    private void M1() {
        if (this.X != null) {
            T0(this.f13916y).n(10000).m(null).l();
            this.X.d(this.f13915x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f13915x) {
                p3.r.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f13915x);
            this.W = null;
        }
    }

    private void N1(int i10, int i11, Object obj) {
        y2[] y2VarArr;
        for (y2 y2Var : this.f13881g) {
            if (y2Var.k() == i10) {
                T0(y2Var).n(i11).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1() {
        N1(1, 2, Float.valueOf(this.f13886i0 * this.A.g()));
    }

    private List<g2.c> P0(int i10, List<u2.u> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            g2.c cVar = new g2.c(list.get(i11), this.f13899p);
            arrayList.add(cVar);
            this.f13897o.add(i11 + i10, new e(cVar.f13405b, cVar.f13404a.Q()));
        }
        this.M = this.M.d(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public z1 Q0() {
        l3 F = F();
        if (F.u()) {
            return this.f13906s0;
        }
        return this.f13906s0.b().H(F.r(w(), this.f13358a).f13555p.f13766r).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o R0(g3 g3Var) {
        return new o(0, g3Var.d(), g3Var.c());
    }

    private void R1(List<u2.u> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int Z0 = Z0();
        long I = I();
        boolean z11 = true;
        this.H++;
        if (!this.f13897o.isEmpty()) {
            L1(0, this.f13897o.size());
        }
        List<g2.c> P0 = P0(0, list);
        l3 S0 = S0();
        if (!S0.u() && i10 >= S0.t()) {
            throw new q1(S0, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = S0.e(this.G);
        } else if (i10 == -1) {
            i11 = Z0;
            j11 = I;
        } else {
            i11 = i10;
            j11 = j10;
        }
        m2 G1 = G1(this.f13908t0, S0, H1(S0, i11, j11));
        int i12 = G1.f13620e;
        if (i11 != -1 && i12 != 1) {
            i12 = (S0.u() || i11 >= S0.t()) ? 4 : 2;
        }
        m2 g10 = G1.g(i12);
        this.f13889k.N0(P0, i11, p3.m0.A0(j11), this.M);
        if (this.f13908t0.f13617b.f15356a.equals(g10.f13617b.f15356a) || this.f13908t0.f13616a.u()) {
            z11 = false;
        }
        Y1(g10, 0, 1, false, z11, 4, Y0(g10), -1);
    }

    private l3 S0() {
        return new u2(this.f13897o, this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        T1(surface);
        this.V = surface;
    }

    private t2 T0(t2.b bVar) {
        int Z0 = Z0();
        i1 i1Var = this.f13889k;
        l3 l3Var = this.f13908t0.f13616a;
        if (Z0 == -1) {
            Z0 = 0;
        }
        return new t2(i1Var, bVar, l3Var, Z0, this.f13913w, i1Var.C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T1(Object obj) {
        boolean z10;
        ArrayList<t2> arrayList = new ArrayList();
        y2[] y2VarArr = this.f13881g;
        int length = y2VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            y2 y2Var = y2VarArr[i10];
            if (y2Var.k() == 2) {
                arrayList.add(T0(y2Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (t2 t2Var : arrayList) {
                    t2Var.a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            V1(false, q.j(new k1(3), 1003));
        }
    }

    private Pair<Boolean, Integer> U0(m2 m2Var, m2 m2Var2, boolean z10, int i10, boolean z11) {
        l3 l3Var = m2Var2.f13616a;
        l3 l3Var2 = m2Var.f13616a;
        if (l3Var2.u() && l3Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (l3Var2.u() != l3Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (l3Var.r(l3Var.l(m2Var2.f13617b.f15356a, this.f13895n).f13544p, this.f13358a).f13553n.equals(l3Var2.r(l3Var2.l(m2Var.f13617b.f15356a, this.f13895n).f13544p, this.f13358a).f13553n)) {
            return (z10 && i10 == 0 && m2Var2.f13617b.f15359d < m2Var.f13617b.f15359d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void V1(boolean z10, q qVar) {
        m2 b10;
        if (z10) {
            b10 = K1(0, this.f13897o.size()).e(null);
        } else {
            m2 m2Var = this.f13908t0;
            b10 = m2Var.b(m2Var.f13617b);
            b10.f13631p = b10.f13633r;
            b10.f13632q = 0L;
        }
        m2 g10 = b10.g(1);
        if (qVar != null) {
            g10 = g10.e(qVar);
        }
        m2 m2Var2 = g10;
        this.H++;
        this.f13889k.g1();
        Y1(m2Var2, 0, 1, false, m2Var2.f13616a.u() && !this.f13908t0.f13616a.u(), 4, Y0(m2Var2), -1);
    }

    private void W1() {
        p2.b bVar = this.O;
        p2.b H = p3.m0.H(this.f13879f, this.f13873c);
        this.O = H;
        if (H.equals(bVar)) {
            return;
        }
        this.f13891l.i(13, new q.a() { // from class: s1.r0
            @Override // p3.q.a
            public final void c(Object obj) {
                w0.this.r1((p2.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        m2 m2Var = this.f13908t0;
        if (m2Var.f13627l == z11 && m2Var.f13628m == i12) {
            return;
        }
        this.H++;
        m2 d10 = m2Var.d(z11, i12);
        this.f13889k.Q0(z11, i12);
        Y1(d10, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    private long Y0(m2 m2Var) {
        return m2Var.f13616a.u() ? p3.m0.A0(this.f13914w0) : m2Var.f13617b.b() ? m2Var.f13633r : J1(m2Var.f13616a, m2Var.f13617b, m2Var.f13633r);
    }

    private void Y1(final m2 m2Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        m2 m2Var2 = this.f13908t0;
        this.f13908t0 = m2Var;
        Pair<Boolean, Integer> U0 = U0(m2Var, m2Var2, z11, i12, !m2Var2.f13616a.equals(m2Var.f13616a));
        boolean booleanValue = ((Boolean) U0.first).booleanValue();
        final int intValue = ((Integer) U0.second).intValue();
        z1 z1Var = this.P;
        if (booleanValue) {
            r3 = m2Var.f13616a.u() ? null : m2Var.f13616a.r(m2Var.f13616a.l(m2Var.f13617b.f15356a, this.f13895n).f13544p, this.f13358a).f13555p;
            this.f13906s0 = z1.T;
        }
        if (booleanValue || !m2Var2.f13625j.equals(m2Var.f13625j)) {
            this.f13906s0 = this.f13906s0.b().I(m2Var.f13625j).F();
            z1Var = Q0();
        }
        boolean z12 = !z1Var.equals(this.P);
        this.P = z1Var;
        boolean z13 = m2Var2.f13627l != m2Var.f13627l;
        boolean z14 = m2Var2.f13620e != m2Var.f13620e;
        if (z14 || z13) {
            a2();
        }
        boolean z15 = m2Var2.f13622g;
        boolean z16 = m2Var.f13622g;
        boolean z17 = z15 != z16;
        if (z17) {
            Z1(z16);
        }
        if (!m2Var2.f13616a.equals(m2Var.f13616a)) {
            this.f13891l.i(0, new q.a() { // from class: s1.g0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.s1(m2.this, i10, (p2.d) obj);
                }
            });
        }
        if (z11) {
            final p2.e e12 = e1(i12, m2Var2, i13);
            final p2.e d12 = d1(j10);
            this.f13891l.i(11, new q.a() { // from class: s1.q0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.t1(i12, e12, d12, (p2.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f13891l.i(1, new q.a() { // from class: s1.s0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).i0(u1.this, intValue);
                }
            });
        }
        if (m2Var2.f13621f != m2Var.f13621f) {
            this.f13891l.i(10, new q.a() { // from class: s1.u0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.v1(m2.this, (p2.d) obj);
                }
            });
            if (m2Var.f13621f != null) {
                this.f13891l.i(10, new q.a() { // from class: s1.d0
                    @Override // p3.q.a
                    public final void c(Object obj) {
                        w0.w1(m2.this, (p2.d) obj);
                    }
                });
            }
        }
        n3.d0 d0Var = m2Var2.f13624i;
        n3.d0 d0Var2 = m2Var.f13624i;
        if (d0Var != d0Var2) {
            this.f13883h.e(d0Var2.f11650e);
            this.f13891l.i(2, new q.a() { // from class: s1.z
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.x1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z12) {
            final z1 z1Var2 = this.P;
            this.f13891l.i(14, new q.a() { // from class: s1.t0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).R(z1.this);
                }
            });
        }
        if (z17) {
            this.f13891l.i(3, new q.a() { // from class: s1.f0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.z1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z14 || z13) {
            this.f13891l.i(-1, new q.a() { // from class: s1.e0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.A1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z14) {
            this.f13891l.i(4, new q.a() { // from class: s1.v0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.B1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z13) {
            this.f13891l.i(5, new q.a() { // from class: s1.h0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.C1(m2.this, i11, (p2.d) obj);
                }
            });
        }
        if (m2Var2.f13628m != m2Var.f13628m) {
            this.f13891l.i(6, new q.a() { // from class: s1.a0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.D1(m2.this, (p2.d) obj);
                }
            });
        }
        if (i1(m2Var2) != i1(m2Var)) {
            this.f13891l.i(7, new q.a() { // from class: s1.c0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.E1(m2.this, (p2.d) obj);
                }
            });
        }
        if (!m2Var2.f13629n.equals(m2Var.f13629n)) {
            this.f13891l.i(12, new q.a() { // from class: s1.b0
                @Override // p3.q.a
                public final void c(Object obj) {
                    w0.F1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z10) {
            this.f13891l.i(-1, l0.f13534a);
        }
        W1();
        this.f13891l.f();
        if (m2Var2.f13630o != m2Var.f13630o) {
            Iterator<r.a> it = this.f13893m.iterator();
            while (it.hasNext()) {
                it.next().E(m2Var.f13630o);
            }
        }
    }

    private int Z0() {
        if (this.f13908t0.f13616a.u()) {
            return this.f13910u0;
        }
        m2 m2Var = this.f13908t0;
        return m2Var.f13616a.l(m2Var.f13617b.f15356a, this.f13895n).f13544p;
    }

    private void Z1(boolean z10) {
        p3.c0 c0Var = this.f13896n0;
        if (c0Var != null) {
            if (z10 && !this.f13898o0) {
                c0Var.a(0);
                this.f13898o0 = true;
            } else if (z10 || !this.f13898o0) {
            } else {
                c0Var.b(0);
                this.f13898o0 = false;
            }
        }
    }

    private Pair<Object, Long> a1(l3 l3Var, l3 l3Var2) {
        long k10 = k();
        if (l3Var.u() || l3Var2.u()) {
            boolean z10 = !l3Var.u() && l3Var2.u();
            int Z0 = z10 ? -1 : Z0();
            if (z10) {
                k10 = -9223372036854775807L;
            }
            return H1(l3Var2, Z0, k10);
        }
        Pair<Object, Long> n10 = l3Var.n(this.f13358a, this.f13895n, w(), p3.m0.A0(k10));
        Object obj = ((Pair) p3.m0.j(n10)).first;
        if (l3Var2.f(obj) != -1) {
            return n10;
        }
        Object z02 = i1.z0(this.f13358a, this.f13895n, this.F, this.G, obj, l3Var, l3Var2);
        if (z02 != null) {
            l3Var2.l(z02, this.f13895n);
            int i10 = this.f13895n.f13544p;
            return H1(l3Var2, i10, l3Var2.r(i10, this.f13358a).d());
        }
        return H1(l3Var2, -1, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        int r10 = r();
        boolean z10 = true;
        if (r10 != 1) {
            if (r10 == 2 || r10 == 3) {
                boolean V0 = V0();
                r3 r3Var = this.C;
                if (!p() || V0) {
                    z10 = false;
                }
                r3Var.b(z10);
                this.D.b(p());
                return;
            } else if (r10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private void b2() {
        this.f13875d.b();
        if (Thread.currentThread() != W0().getThread()) {
            String C = p3.m0.C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), W0().getThread().getName());
            if (this.f13892l0) {
                throw new IllegalStateException(C);
            }
            p3.r.j("ExoPlayerImpl", C, this.f13894m0 ? null : new IllegalStateException());
            this.f13894m0 = true;
        }
    }

    private p2.e d1(long j10) {
        int i10;
        u1 u1Var;
        Object obj;
        int w10 = w();
        Object obj2 = null;
        if (this.f13908t0.f13616a.u()) {
            i10 = -1;
            u1Var = null;
            obj = null;
        } else {
            m2 m2Var = this.f13908t0;
            Object obj3 = m2Var.f13617b.f15356a;
            m2Var.f13616a.l(obj3, this.f13895n);
            i10 = this.f13908t0.f13616a.f(obj3);
            obj = obj3;
            obj2 = this.f13908t0.f13616a.r(w10, this.f13358a).f13553n;
            u1Var = this.f13358a.f13555p;
        }
        long X0 = p3.m0.X0(j10);
        long X02 = this.f13908t0.f13617b.b() ? p3.m0.X0(f1(this.f13908t0)) : X0;
        u.b bVar = this.f13908t0.f13617b;
        return new p2.e(obj2, w10, u1Var, obj, i10, X0, X02, bVar.f15357b, bVar.f15358c);
    }

    private p2.e e1(int i10, m2 m2Var, int i11) {
        int i12;
        int i13;
        Object obj;
        u1 u1Var;
        Object obj2;
        long j10;
        long j11;
        l3.b bVar = new l3.b();
        if (m2Var.f13616a.u()) {
            i12 = i11;
            i13 = -1;
            obj = null;
            u1Var = null;
            obj2 = null;
        } else {
            Object obj3 = m2Var.f13617b.f15356a;
            m2Var.f13616a.l(obj3, bVar);
            int i14 = bVar.f13544p;
            i12 = i14;
            obj2 = obj3;
            i13 = m2Var.f13616a.f(obj3);
            obj = m2Var.f13616a.r(i14, this.f13358a).f13553n;
            u1Var = this.f13358a.f13555p;
        }
        boolean b10 = m2Var.f13617b.b();
        if (i10 == 0) {
            if (b10) {
                u.b bVar2 = m2Var.f13617b;
                j10 = bVar.e(bVar2.f15357b, bVar2.f15358c);
                j11 = f1(m2Var);
            } else {
                j10 = m2Var.f13617b.f15360e != -1 ? f1(this.f13908t0) : bVar.f13546r + bVar.f13545q;
                j11 = j10;
            }
        } else if (b10) {
            j10 = m2Var.f13633r;
            j11 = f1(m2Var);
        } else {
            j10 = bVar.f13546r + m2Var.f13633r;
            j11 = j10;
        }
        long X0 = p3.m0.X0(j10);
        long X02 = p3.m0.X0(j11);
        u.b bVar3 = m2Var.f13617b;
        return new p2.e(obj, i12, u1Var, obj2, i13, X0, X02, bVar3.f15357b, bVar3.f15358c);
    }

    private static long f1(m2 m2Var) {
        l3.d dVar = new l3.d();
        l3.b bVar = new l3.b();
        m2Var.f13616a.l(m2Var.f13617b.f15356a, bVar);
        return m2Var.f13618c == -9223372036854775807L ? m2Var.f13616a.r(bVar.f13544p, dVar).e() : bVar.q() + m2Var.f13618c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public void l1(i1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f13463c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f13464d) {
            this.I = eVar.f13465e;
            this.J = true;
        }
        if (eVar.f13466f) {
            this.K = eVar.f13467g;
        }
        if (i10 == 0) {
            l3 l3Var = eVar.f13462b.f13616a;
            if (!this.f13908t0.f13616a.u() && l3Var.u()) {
                this.f13910u0 = -1;
                this.f13914w0 = 0L;
                this.f13912v0 = 0;
            }
            if (!l3Var.u()) {
                List<l3> J = ((u2) l3Var).J();
                p3.a.f(J.size() == this.f13897o.size());
                for (int i11 = 0; i11 < J.size(); i11++) {
                    this.f13897o.get(i11).f13924b = J.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f13462b.f13617b.equals(this.f13908t0.f13617b) && eVar.f13462b.f13619d == this.f13908t0.f13633r) {
                    z11 = false;
                }
                if (z11) {
                    if (l3Var.u() || eVar.f13462b.f13617b.b()) {
                        j11 = eVar.f13462b.f13619d;
                    } else {
                        m2 m2Var = eVar.f13462b;
                        j11 = J1(l3Var, m2Var.f13617b, m2Var.f13619d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            Y1(eVar.f13462b, 1, this.K, false, z10, this.I, j10, -1);
        }
    }

    private int h1(int i10) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    private static boolean i1(m2 m2Var) {
        return m2Var.f13620e == 3 && m2Var.f13627l && m2Var.f13628m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(p2.d dVar, p3.l lVar) {
        dVar.j0(this.f13879f, new p2.c(lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(final i1.e eVar) {
        this.f13885i.j(new Runnable() { // from class: s1.y
            @Override // java.lang.Runnable
            public final void run() {
                w0.this.l1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n1(p2.d dVar) {
        dVar.F(q.j(new k1(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r1(p2.d dVar) {
        dVar.O(this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s1(m2 m2Var, int i10, p2.d dVar) {
        dVar.g0(m2Var.f13616a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t1(int i10, p2.e eVar, p2.e eVar2, p2.d dVar) {
        dVar.E(i10);
        dVar.b0(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v1(m2 m2Var, p2.d dVar) {
        dVar.d0(m2Var.f13621f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w1(m2 m2Var, p2.d dVar) {
        dVar.F(m2Var.f13621f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x1(m2 m2Var, p2.d dVar) {
        dVar.N(m2Var.f13624i.f11649d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z1(m2 m2Var, p2.d dVar) {
        dVar.D(m2Var.f13622g);
        dVar.K(m2Var.f13622g);
    }

    @Override // s1.p2
    public int A() {
        b2();
        if (j()) {
            return this.f13908t0.f13617b.f15358c;
        }
        return -1;
    }

    @Override // s1.p2
    public int C() {
        b2();
        return this.f13908t0.f13628m;
    }

    @Override // s1.p2
    public int D() {
        b2();
        return this.F;
    }

    @Override // s1.p2
    public long E() {
        b2();
        if (j()) {
            m2 m2Var = this.f13908t0;
            u.b bVar = m2Var.f13617b;
            m2Var.f13616a.l(bVar.f15356a, this.f13895n);
            return p3.m0.X0(this.f13895n.e(bVar.f15357b, bVar.f15358c));
        }
        return K();
    }

    @Override // s1.p2
    public l3 F() {
        b2();
        return this.f13908t0.f13616a;
    }

    @Override // s1.p2
    public boolean G() {
        b2();
        return this.G;
    }

    @Override // s1.p2
    public long I() {
        b2();
        return p3.m0.X0(Y0(this.f13908t0));
    }

    public void N0(t1.c cVar) {
        p3.a.e(cVar);
        this.f13903r.J(cVar);
    }

    public void O0(r.a aVar) {
        this.f13893m.add(aVar);
    }

    public void P1(List<u2.u> list) {
        b2();
        Q1(list, true);
    }

    public void Q1(List<u2.u> list, boolean z10) {
        b2();
        R1(list, -1, -9223372036854775807L, z10);
    }

    public void U1(boolean z10) {
        b2();
        this.A.p(p(), 1);
        V1(z10, null);
        this.f13890k0 = d3.e.f6537o;
    }

    public boolean V0() {
        b2();
        return this.f13908t0.f13630o;
    }

    public Looper W0() {
        return this.f13905s;
    }

    public long X0() {
        b2();
        if (this.f13908t0.f13616a.u()) {
            return this.f13914w0;
        }
        m2 m2Var = this.f13908t0;
        if (m2Var.f13626k.f15359d != m2Var.f13617b.f15359d) {
            return m2Var.f13616a.r(w(), this.f13358a).f();
        }
        long j10 = m2Var.f13631p;
        if (this.f13908t0.f13626k.b()) {
            m2 m2Var2 = this.f13908t0;
            l3.b l10 = m2Var2.f13616a.l(m2Var2.f13626k.f15356a, this.f13895n);
            long i10 = l10.i(this.f13908t0.f13626k.f15357b);
            j10 = i10 == Long.MIN_VALUE ? l10.f13545q : i10;
        }
        m2 m2Var3 = this.f13908t0;
        return p3.m0.X0(J1(m2Var3.f13616a, m2Var3.f13626k, j10));
    }

    @Override // s1.p2
    public void a() {
        AudioTrack audioTrack;
        p3.r.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + p3.m0.f12310e + "] [" + j1.b() + "]");
        b2();
        if (p3.m0.f12306a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f13917z.b(false);
        this.B.g();
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f13889k.l0()) {
            this.f13891l.k(10, k0.f13524a);
        }
        this.f13891l.j();
        this.f13885i.i(null);
        this.f13907t.d(this.f13903r);
        m2 g10 = this.f13908t0.g(1);
        this.f13908t0 = g10;
        m2 b10 = g10.b(g10.f13617b);
        this.f13908t0 = b10;
        b10.f13631p = b10.f13633r;
        this.f13908t0.f13632q = 0L;
        this.f13903r.a();
        this.f13883h.f();
        M1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f13898o0) {
            ((p3.c0) p3.a.e(this.f13896n0)).b(0);
            this.f13898o0 = false;
        }
        this.f13890k0 = d3.e.f6537o;
        this.f13900p0 = true;
    }

    @Override // s1.p2
    public void b() {
        b2();
        boolean p10 = p();
        int p11 = this.A.p(p10, 2);
        X1(p10, p11, b1(p10, p11));
        m2 m2Var = this.f13908t0;
        if (m2Var.f13620e != 1) {
            return;
        }
        m2 e10 = m2Var.e(null);
        m2 g10 = e10.g(e10.f13616a.u() ? 4 : 2);
        this.H++;
        this.f13889k.j0();
        Y1(g10, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // s1.r
    public void c(final u1.e eVar, boolean z10) {
        b2();
        if (this.f13900p0) {
            return;
        }
        if (!p3.m0.c(this.f13884h0, eVar)) {
            this.f13884h0 = eVar;
            N1(1, 3, eVar);
            this.B.h(p3.m0.f0(eVar.f14911p));
            this.f13891l.i(20, new q.a() { // from class: s1.i0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).n0(u1.e.this);
                }
            });
        }
        this.A.m(z10 ? eVar : null);
        this.f13883h.h(eVar);
        boolean p10 = p();
        int p11 = this.A.p(p10, r());
        X1(p10, p11, b1(p10, p11));
        this.f13891l.f();
    }

    @Override // s1.p2
    /* renamed from: c1 */
    public q g() {
        b2();
        return this.f13908t0.f13621f;
    }

    @Override // s1.p2
    public void d(o2 o2Var) {
        b2();
        if (o2Var == null) {
            o2Var = o2.f13648q;
        }
        if (this.f13908t0.f13629n.equals(o2Var)) {
            return;
        }
        m2 f10 = this.f13908t0.f(o2Var);
        this.H++;
        this.f13889k.S0(o2Var);
        Y1(f10, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // s1.r
    public m1 e() {
        b2();
        return this.R;
    }

    @Override // s1.p2
    public void f(float f10) {
        b2();
        final float p10 = p3.m0.p(f10, 0.0f, 1.0f);
        if (this.f13886i0 == p10) {
            return;
        }
        this.f13886i0 = p10;
        O1();
        this.f13891l.k(22, new q.a() { // from class: s1.j0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((p2.d) obj).S(p10);
            }
        });
    }

    @Override // s1.p2
    public void h(boolean z10) {
        b2();
        int p10 = this.A.p(z10, r());
        X1(z10, p10, b1(z10, p10));
    }

    @Override // s1.p2
    public void i(Surface surface) {
        b2();
        M1();
        T1(surface);
        int i10 = surface == null ? 0 : -1;
        I1(i10, i10);
    }

    @Override // s1.p2
    public boolean j() {
        b2();
        return this.f13908t0.f13617b.b();
    }

    @Override // s1.p2
    public long k() {
        b2();
        if (j()) {
            m2 m2Var = this.f13908t0;
            m2Var.f13616a.l(m2Var.f13617b.f15356a, this.f13895n);
            m2 m2Var2 = this.f13908t0;
            return m2Var2.f13618c == -9223372036854775807L ? m2Var2.f13616a.r(w(), this.f13358a).d() : this.f13895n.p() + p3.m0.X0(this.f13908t0.f13618c);
        }
        return I();
    }

    @Override // s1.p2
    public void l(p2.d dVar) {
        p3.a.e(dVar);
        this.f13891l.c(dVar);
    }

    @Override // s1.p2
    public long m() {
        b2();
        return p3.m0.X0(this.f13908t0.f13632q);
    }

    @Override // s1.p2
    public void n(int i10, long j10) {
        b2();
        this.f13903r.e0();
        l3 l3Var = this.f13908t0.f13616a;
        if (i10 < 0 || (!l3Var.u() && i10 >= l3Var.t())) {
            throw new q1(l3Var, i10, j10);
        }
        this.H++;
        if (j()) {
            p3.r.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            i1.e eVar = new i1.e(this.f13908t0);
            eVar.b(1);
            this.f13887j.a(eVar);
            return;
        }
        int i11 = r() != 1 ? 2 : 1;
        int w10 = w();
        m2 G1 = G1(this.f13908t0.g(i11), l3Var, H1(l3Var, i10, j10));
        this.f13889k.B0(l3Var, i10, p3.m0.A0(j10));
        Y1(G1, 0, 1, true, true, 1, Y0(G1), w10);
    }

    @Override // s1.p2
    public long o() {
        b2();
        if (j()) {
            m2 m2Var = this.f13908t0;
            return m2Var.f13626k.equals(m2Var.f13617b) ? p3.m0.X0(this.f13908t0.f13631p) : E();
        }
        return X0();
    }

    @Override // s1.p2
    public boolean p() {
        b2();
        return this.f13908t0.f13627l;
    }

    @Override // s1.p2
    public int r() {
        b2();
        return this.f13908t0.f13620e;
    }

    @Override // s1.p2
    public q3 s() {
        b2();
        return this.f13908t0.f13624i.f11649d;
    }

    @Override // s1.p2
    public void stop() {
        b2();
        U1(false);
    }

    @Override // s1.p2
    public int u() {
        b2();
        if (this.f13908t0.f13616a.u()) {
            return this.f13912v0;
        }
        m2 m2Var = this.f13908t0;
        return m2Var.f13616a.f(m2Var.f13617b.f15356a);
    }

    @Override // s1.p2
    public int v() {
        b2();
        if (j()) {
            return this.f13908t0.f13617b.f15357b;
        }
        return -1;
    }

    @Override // s1.p2
    public int w() {
        b2();
        int Z0 = Z0();
        if (Z0 == -1) {
            return 0;
        }
        return Z0;
    }

    @Override // s1.p2
    public void x(final int i10) {
        b2();
        if (this.F != i10) {
            this.F = i10;
            this.f13889k.U0(i10);
            this.f13891l.i(8, new q.a() { // from class: s1.o0
                @Override // p3.q.a
                public final void c(Object obj) {
                    ((p2.d) obj).h(i10);
                }
            });
            W1();
            this.f13891l.f();
        }
    }

    @Override // s1.r
    public void z(u2.u uVar) {
        b2();
        P1(Collections.singletonList(uVar));
    }
}
