package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c3.a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o3.g0;
import o3.h0;
import o3.i0;
import o3.j0;
import o3.l;
import o3.p0;
import o3.x;
import p3.m0;
import s1.j1;
import s1.u1;
import u2.b0;
import u2.h;
import u2.i;
import u2.n;
import u2.q;
import u2.q0;
import u2.r;
import u2.u;
import w1.y;
/* loaded from: classes.dex */
public final class SsMediaSource extends u2.a implements h0.b<j0<c3.a>> {
    private final h A;
    private final y B;
    private final g0 C;
    private final long D;
    private final b0.a E;
    private final j0.a<? extends c3.a> F;
    private final ArrayList<c> G;
    private l H;
    private h0 I;
    private i0 J;
    private p0 K;
    private long L;
    private c3.a M;
    private Handler N;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f3477u;

    /* renamed from: v  reason: collision with root package name */
    private final Uri f3478v;

    /* renamed from: w  reason: collision with root package name */
    private final u1.h f3479w;

    /* renamed from: x  reason: collision with root package name */
    private final u1 f3480x;

    /* renamed from: y  reason: collision with root package name */
    private final l.a f3481y;

    /* renamed from: z  reason: collision with root package name */
    private final b.a f3482z;

    /* loaded from: classes.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f3483a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f3484b;

        /* renamed from: c  reason: collision with root package name */
        private h f3485c;

        /* renamed from: d  reason: collision with root package name */
        private w1.b0 f3486d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f3487e;

        /* renamed from: f  reason: collision with root package name */
        private long f3488f;

        /* renamed from: g  reason: collision with root package name */
        private j0.a<? extends c3.a> f3489g;

        public Factory(b.a aVar, l.a aVar2) {
            this.f3483a = (b.a) p3.a.e(aVar);
            this.f3484b = aVar2;
            this.f3486d = new w1.l();
            this.f3487e = new x();
            this.f3488f = 30000L;
            this.f3485c = new i();
        }

        public Factory(l.a aVar) {
            this(new a.C0076a(aVar), aVar);
        }

        public SsMediaSource a(u1 u1Var) {
            p3.a.e(u1Var.f13763o);
            j0.a aVar = this.f3489g;
            if (aVar == null) {
                aVar = new c3.b();
            }
            List<t2.c> list = u1Var.f13763o.f13831e;
            return new SsMediaSource(u1Var, null, this.f3484b, !list.isEmpty() ? new t2.b(aVar, list) : aVar, this.f3483a, this.f3485c, this.f3486d.a(u1Var), this.f3487e, this.f3488f);
        }
    }

    static {
        j1.a("goog.exo.smoothstreaming");
    }

    private SsMediaSource(u1 u1Var, c3.a aVar, l.a aVar2, j0.a<? extends c3.a> aVar3, b.a aVar4, h hVar, y yVar, g0 g0Var, long j10) {
        p3.a.f(aVar == null || !aVar.f3153d);
        this.f3480x = u1Var;
        u1.h hVar2 = (u1.h) p3.a.e(u1Var.f13763o);
        this.f3479w = hVar2;
        this.M = aVar;
        this.f3478v = hVar2.f13827a.equals(Uri.EMPTY) ? null : m0.B(hVar2.f13827a);
        this.f3481y = aVar2;
        this.F = aVar3;
        this.f3482z = aVar4;
        this.A = hVar;
        this.B = yVar;
        this.C = g0Var;
        this.D = j10;
        this.E = w(null);
        this.f3477u = aVar != null;
        this.G = new ArrayList<>();
    }

    private void J() {
        a.b[] bVarArr;
        q0 q0Var;
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            this.G.get(i10).w(this.M);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.M.f3155f) {
            if (bVar.f3171k > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f3171k - 1) + bVar.c(bVar.f3171k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.M.f3153d ? -9223372036854775807L : 0L;
            c3.a aVar = this.M;
            boolean z10 = aVar.f3153d;
            q0Var = new q0(j12, 0L, 0L, 0L, true, z10, z10, aVar, this.f3480x);
        } else {
            c3.a aVar2 = this.M;
            if (aVar2.f3153d) {
                long j13 = aVar2.f3157h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long A0 = j15 - m0.A0(this.D);
                if (A0 < 5000000) {
                    A0 = Math.min(5000000L, j15 / 2);
                }
                q0Var = new q0(-9223372036854775807L, j15, j14, A0, true, true, true, this.M, this.f3480x);
            } else {
                long j16 = aVar2.f3156g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                q0Var = new q0(j11 + j17, j17, j11, 0L, true, false, false, this.M, this.f3480x);
            }
        }
        D(q0Var);
    }

    private void K() {
        if (this.M.f3153d) {
            this.N.postDelayed(new Runnable() { // from class: b3.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.L();
                }
            }, Math.max(0L, (this.L + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.I.i()) {
            return;
        }
        j0 j0Var = new j0(this.H, this.f3478v, 4, this.F);
        this.E.z(new n(j0Var.f11996a, j0Var.f11997b, this.I.n(j0Var, this, this.C.d(j0Var.f11998c))), j0Var.f11998c);
    }

    @Override // u2.a
    protected void C(p0 p0Var) {
        this.K = p0Var;
        this.B.b();
        this.B.e(Looper.myLooper(), A());
        if (this.f3477u) {
            this.J = new i0.a();
            J();
            return;
        }
        this.H = this.f3481y.a();
        h0 h0Var = new h0("SsMediaSource");
        this.I = h0Var;
        this.J = h0Var;
        this.N = m0.w();
        L();
    }

    @Override // u2.a
    protected void E() {
        this.M = this.f3477u ? this.M : null;
        this.H = null;
        this.L = 0L;
        h0 h0Var = this.I;
        if (h0Var != null) {
            h0Var.l();
            this.I = null;
        }
        Handler handler = this.N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.N = null;
        }
        this.B.a();
    }

    @Override // o3.h0.b
    /* renamed from: G */
    public void j(j0<c3.a> j0Var, long j10, long j11, boolean z10) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.C.a(j0Var.f11996a);
        this.E.q(nVar, j0Var.f11998c);
    }

    @Override // o3.h0.b
    /* renamed from: H */
    public void o(j0<c3.a> j0Var, long j10, long j11) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.C.a(j0Var.f11996a);
        this.E.t(nVar, j0Var.f11998c);
        this.M = j0Var.e();
        this.L = j10 - j11;
        J();
        K();
    }

    @Override // o3.h0.b
    /* renamed from: I */
    public h0.c u(j0<c3.a> j0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(j0Var.f11996a, j0Var.f11997b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        long b10 = this.C.b(new g0.c(nVar, new q(j0Var.f11998c), iOException, i10));
        h0.c h10 = b10 == -9223372036854775807L ? h0.f11975g : h0.h(false, b10);
        boolean z10 = !h10.c();
        this.E.x(nVar, j0Var.f11998c, iOException, z10);
        if (z10) {
            this.C.a(j0Var.f11996a);
        }
        return h10;
    }

    @Override // u2.u
    public u1 a() {
        return this.f3480x;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((c) rVar).v();
        this.G.remove(rVar);
    }

    @Override // u2.u
    public void f() {
        this.J.b();
    }

    @Override // u2.u
    public r n(u.b bVar, o3.b bVar2, long j10) {
        b0.a w10 = w(bVar);
        c cVar = new c(this.M, this.f3482z, this.K, this.A, this.B, t(bVar), this.C, w10, this.J, bVar2);
        this.G.add(cVar);
        return cVar;
    }
}
