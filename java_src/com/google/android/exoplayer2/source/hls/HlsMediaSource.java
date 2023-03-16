package com.google.android.exoplayer2.source.hls;

import a3.e;
import a3.g;
import a3.k;
import a3.l;
import android.os.Looper;
import java.util.List;
import o3.b;
import o3.g0;
import o3.l;
import o3.p0;
import o3.x;
import p3.m0;
import s1.j1;
import s1.u1;
import u2.b0;
import u2.i;
import u2.q0;
import u2.r;
import u2.u;
import w1.b0;
import w1.y;
import z2.c;
import z2.g;
import z2.h;
/* loaded from: classes.dex */
public final class HlsMediaSource extends u2.a implements l.e {
    private final boolean A;
    private final int B;
    private final boolean C;
    private final l D;
    private final long E;
    private final u1 F;
    private u1.g G;
    private p0 H;

    /* renamed from: u  reason: collision with root package name */
    private final h f3457u;

    /* renamed from: v  reason: collision with root package name */
    private final u1.h f3458v;

    /* renamed from: w  reason: collision with root package name */
    private final g f3459w;

    /* renamed from: x  reason: collision with root package name */
    private final u2.h f3460x;

    /* renamed from: y  reason: collision with root package name */
    private final y f3461y;

    /* renamed from: z  reason: collision with root package name */
    private final g0 f3462z;

    /* loaded from: classes.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final g f3463a;

        /* renamed from: b  reason: collision with root package name */
        private h f3464b;

        /* renamed from: c  reason: collision with root package name */
        private k f3465c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f3466d;

        /* renamed from: e  reason: collision with root package name */
        private u2.h f3467e;

        /* renamed from: f  reason: collision with root package name */
        private b0 f3468f;

        /* renamed from: g  reason: collision with root package name */
        private g0 f3469g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3470h;

        /* renamed from: i  reason: collision with root package name */
        private int f3471i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3472j;

        /* renamed from: k  reason: collision with root package name */
        private long f3473k;

        public Factory(l.a aVar) {
            this(new c(aVar));
        }

        public Factory(g gVar) {
            this.f3463a = (g) p3.a.e(gVar);
            this.f3468f = new w1.l();
            this.f3465c = new a3.a();
            this.f3466d = a3.c.C;
            this.f3464b = h.f17221a;
            this.f3469g = new x();
            this.f3467e = new i();
            this.f3471i = 1;
            this.f3473k = -9223372036854775807L;
            this.f3470h = true;
        }

        public HlsMediaSource a(u1 u1Var) {
            p3.a.e(u1Var.f13763o);
            k kVar = this.f3465c;
            List<t2.c> list = u1Var.f13763o.f13831e;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f3463a;
            h hVar = this.f3464b;
            u2.h hVar2 = this.f3467e;
            y a10 = this.f3468f.a(u1Var);
            g0 g0Var = this.f3469g;
            return new HlsMediaSource(u1Var, gVar, hVar, hVar2, a10, g0Var, this.f3466d.a(this.f3463a, g0Var, kVar), this.f3473k, this.f3470h, this.f3471i, this.f3472j);
        }
    }

    static {
        j1.a("goog.exo.hls");
    }

    private HlsMediaSource(u1 u1Var, g gVar, h hVar, u2.h hVar2, y yVar, g0 g0Var, a3.l lVar, long j10, boolean z10, int i10, boolean z11) {
        this.f3458v = (u1.h) p3.a.e(u1Var.f13763o);
        this.F = u1Var;
        this.G = u1Var.f13765q;
        this.f3459w = gVar;
        this.f3457u = hVar;
        this.f3460x = hVar2;
        this.f3461y = yVar;
        this.f3462z = g0Var;
        this.D = lVar;
        this.E = j10;
        this.A = z10;
        this.B = i10;
        this.C = z11;
    }

    private q0 F(a3.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long m10 = gVar.f92h - this.D.m();
        long j12 = gVar.f99o ? m10 + gVar.f105u : -9223372036854775807L;
        long J = J(gVar);
        long j13 = this.G.f13817n;
        M(gVar, m0.r(j13 != -9223372036854775807L ? m0.A0(j13) : L(gVar, J), J, gVar.f105u + J));
        return new q0(j10, j11, -9223372036854775807L, j12, gVar.f105u, m10, K(gVar, J), true, !gVar.f99o, gVar.f88d == 2 && gVar.f90f, aVar, this.F, this.G);
    }

    private q0 G(a3.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long j12;
        if (gVar.f89e == -9223372036854775807L || gVar.f102r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar.f91g) {
                long j13 = gVar.f89e;
                if (j13 != gVar.f105u) {
                    j12 = I(gVar.f102r, j13).f118r;
                }
            }
            j12 = gVar.f89e;
        }
        long j14 = gVar.f105u;
        return new q0(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, aVar, this.F, null);
    }

    private static g.b H(List<g.b> list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = list.get(i10);
            long j11 = bVar2.f118r;
            if (j11 <= j10 && bVar2.f107y) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static g.d I(List<g.d> list, long j10) {
        return list.get(m0.f(list, Long.valueOf(j10), true, true));
    }

    private long J(a3.g gVar) {
        if (gVar.f100p) {
            return m0.A0(m0.a0(this.E)) - gVar.e();
        }
        return 0L;
    }

    private long K(a3.g gVar, long j10) {
        long j11 = gVar.f89e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f105u + j10) - m0.A0(this.G.f13817n);
        }
        if (gVar.f91g) {
            return j11;
        }
        g.b H = H(gVar.f103s, j11);
        if (H != null) {
            return H.f118r;
        }
        if (gVar.f102r.isEmpty()) {
            return 0L;
        }
        g.d I = I(gVar.f102r, j11);
        g.b H2 = H(I.f113z, j11);
        return H2 != null ? H2.f118r : I.f118r;
    }

    private static long L(a3.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f106v;
        long j12 = gVar.f89e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f105u - j12;
        } else {
            long j13 = fVar.f128d;
            if (j13 == -9223372036854775807L || gVar.f98n == -9223372036854775807L) {
                long j14 = fVar.f127c;
                j11 = j14 != -9223372036854775807L ? j14 : gVar.f97m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M(a3.g r5, long r6) {
        /*
            r4 = this;
            s1.u1 r0 = r4.F
            s1.u1$g r0 = r0.f13765q
            float r1 = r0.f13820q
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f13821r
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            a3.g$f r5 = r5.f106v
            long r0 = r5.f127c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.f128d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            s1.u1$g$a r0 = new s1.u1$g$a
            r0.<init>()
            long r6 = p3.m0.X0(r6)
            s1.u1$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3c
            r0 = r7
            goto L40
        L3c:
            s1.u1$g r0 = r4.G
            float r0 = r0.f13820q
        L40:
            s1.u1$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L47
            goto L4b
        L47:
            s1.u1$g r5 = r4.G
            float r7 = r5.f13821r
        L4b:
            s1.u1$g$a r5 = r6.h(r7)
            s1.u1$g r5 = r5.f()
            r4.G = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.M(a3.g, long):void");
    }

    @Override // u2.a
    protected void C(p0 p0Var) {
        this.H = p0Var;
        this.f3461y.b();
        this.f3461y.e((Looper) p3.a.e(Looper.myLooper()), A());
        this.D.g(this.f3458v.f13827a, w(null), this);
    }

    @Override // u2.a
    protected void E() {
        this.D.stop();
        this.f3461y.a();
    }

    @Override // u2.u
    public u1 a() {
        return this.F;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((z2.k) rVar).B();
    }

    @Override // u2.u
    public void f() {
        this.D.f();
    }

    @Override // a3.l.e
    public void m(a3.g gVar) {
        long X0 = gVar.f100p ? m0.X0(gVar.f92h) : -9223372036854775807L;
        int i10 = gVar.f88d;
        long j10 = (i10 == 2 || i10 == 1) ? X0 : -9223372036854775807L;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((a3.h) p3.a.e(this.D.b()), gVar);
        D(this.D.a() ? F(gVar, j10, X0, aVar) : G(gVar, j10, X0, aVar));
    }

    @Override // u2.u
    public r n(u.b bVar, b bVar2, long j10) {
        b0.a w10 = w(bVar);
        return new z2.k(this.f3457u, this.D, this.f3459w, this.H, this.f3461y, t(bVar), this.f3462z, w10, bVar2, this.f3460x, this.A, this.B, this.C, A());
    }
}
