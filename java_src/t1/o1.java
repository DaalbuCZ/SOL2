package t1;

import android.os.Looper;
import android.util.SparseArray;
import b5.r;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.q;
import s1.l2;
import s1.l3;
import s1.o2;
import s1.p2;
import s1.q3;
import s1.u1;
import s1.z1;
import t1.c;
import u2.u;
/* loaded from: classes.dex */
public class o1 implements t1.a {

    /* renamed from: a  reason: collision with root package name */
    private final p3.d f14590a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.b f14591b;

    /* renamed from: c  reason: collision with root package name */
    private final l3.d f14592c;

    /* renamed from: d  reason: collision with root package name */
    private final a f14593d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<c.a> f14594e;

    /* renamed from: f  reason: collision with root package name */
    private p3.q<c> f14595f;

    /* renamed from: g  reason: collision with root package name */
    private p2 f14596g;

    /* renamed from: h  reason: collision with root package name */
    private p3.n f14597h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14598i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final l3.b f14599a;

        /* renamed from: b  reason: collision with root package name */
        private b5.q<u.b> f14600b = b5.q.J();

        /* renamed from: c  reason: collision with root package name */
        private b5.r<u.b, l3> f14601c = b5.r.j();

        /* renamed from: d  reason: collision with root package name */
        private u.b f14602d;

        /* renamed from: e  reason: collision with root package name */
        private u.b f14603e;

        /* renamed from: f  reason: collision with root package name */
        private u.b f14604f;

        public a(l3.b bVar) {
            this.f14599a = bVar;
        }

        private void b(r.a<u.b, l3> aVar, u.b bVar, l3 l3Var) {
            if (bVar == null) {
                return;
            }
            if (l3Var.f(bVar.f15356a) == -1 && (l3Var = this.f14601c.get(bVar)) == null) {
                return;
            }
            aVar.d(bVar, l3Var);
        }

        private static u.b c(p2 p2Var, b5.q<u.b> qVar, u.b bVar, l3.b bVar2) {
            l3 F = p2Var.F();
            int u10 = p2Var.u();
            Object q10 = F.u() ? null : F.q(u10);
            int g10 = (p2Var.j() || F.u()) ? -1 : F.j(u10, bVar2).g(p3.m0.A0(p2Var.I()) - bVar2.q());
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                u.b bVar3 = qVar.get(i10);
                if (i(bVar3, q10, p2Var.j(), p2Var.v(), p2Var.A(), g10)) {
                    return bVar3;
                }
            }
            if (qVar.isEmpty() && bVar != null) {
                if (i(bVar, q10, p2Var.j(), p2Var.v(), p2Var.A(), g10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(u.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f15356a.equals(obj)) {
                return (z10 && bVar.f15357b == i10 && bVar.f15358c == i11) || (!z10 && bVar.f15357b == -1 && bVar.f15360e == i12);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (a5.i.a(r3.f14602d, r3.f14604f) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
            if (r3.f14600b.contains(r3.f14602d) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
            b(r0, r3.f14602d, r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m(s1.l3 r4) {
            /*
                r3 = this;
                b5.r$a r0 = b5.r.a()
                b5.q<u2.u$b> r1 = r3.f14600b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                u2.u$b r1 = r3.f14603e
                r3.b(r0, r1, r4)
                u2.u$b r1 = r3.f14604f
                u2.u$b r2 = r3.f14603e
                boolean r1 = a5.i.a(r1, r2)
                if (r1 != 0) goto L20
                u2.u$b r1 = r3.f14604f
                r3.b(r0, r1, r4)
            L20:
                u2.u$b r1 = r3.f14602d
                u2.u$b r2 = r3.f14603e
                boolean r1 = a5.i.a(r1, r2)
                if (r1 != 0) goto L5b
                u2.u$b r1 = r3.f14602d
                u2.u$b r2 = r3.f14604f
                boolean r1 = a5.i.a(r1, r2)
                if (r1 != 0) goto L5b
                goto L56
            L35:
                r1 = 0
            L36:
                b5.q<u2.u$b> r2 = r3.f14600b
                int r2 = r2.size()
                if (r1 >= r2) goto L4c
                b5.q<u2.u$b> r2 = r3.f14600b
                java.lang.Object r2 = r2.get(r1)
                u2.u$b r2 = (u2.u.b) r2
                r3.b(r0, r2, r4)
                int r1 = r1 + 1
                goto L36
            L4c:
                b5.q<u2.u$b> r1 = r3.f14600b
                u2.u$b r2 = r3.f14602d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5b
            L56:
                u2.u$b r1 = r3.f14602d
                r3.b(r0, r1, r4)
            L5b:
                b5.r r4 = r0.b()
                r3.f14601c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.o1.a.m(s1.l3):void");
        }

        public u.b d() {
            return this.f14602d;
        }

        public u.b e() {
            if (this.f14600b.isEmpty()) {
                return null;
            }
            return (u.b) b5.t.c(this.f14600b);
        }

        public l3 f(u.b bVar) {
            return this.f14601c.get(bVar);
        }

        public u.b g() {
            return this.f14603e;
        }

        public u.b h() {
            return this.f14604f;
        }

        public void j(p2 p2Var) {
            this.f14602d = c(p2Var, this.f14600b, this.f14603e, this.f14599a);
        }

        public void k(List<u.b> list, u.b bVar, p2 p2Var) {
            this.f14600b = b5.q.F(list);
            if (!list.isEmpty()) {
                this.f14603e = list.get(0);
                this.f14604f = (u.b) p3.a.e(bVar);
            }
            if (this.f14602d == null) {
                this.f14602d = c(p2Var, this.f14600b, this.f14603e, this.f14599a);
            }
            m(p2Var.F());
        }

        public void l(p2 p2Var) {
            this.f14602d = c(p2Var, this.f14600b, this.f14603e, this.f14599a);
            m(p2Var.F());
        }
    }

    public o1(p3.d dVar) {
        this.f14590a = (p3.d) p3.a.e(dVar);
        this.f14595f = new p3.q<>(p3.m0.Q(), dVar, j1.f14558a);
        l3.b bVar = new l3.b();
        this.f14591b = bVar;
        this.f14592c = new l3.d();
        this.f14593d = new a(bVar);
        this.f14594e = new SparseArray<>();
    }

    private c.a D1(u.b bVar) {
        p3.a.e(this.f14596g);
        l3 f10 = bVar == null ? null : this.f14593d.f(bVar);
        if (bVar == null || f10 == null) {
            int w10 = this.f14596g.w();
            l3 F = this.f14596g.F();
            if (!(w10 < F.t())) {
                F = l3.f13539n;
            }
            return C1(F, w10, null);
        }
        return C1(f10, f10.l(bVar.f15356a, this.f14591b).f13544p, bVar);
    }

    private c.a E1() {
        return D1(this.f14593d.e());
    }

    private c.a F1(int i10, u.b bVar) {
        p3.a.e(this.f14596g);
        if (bVar != null) {
            return this.f14593d.f(bVar) != null ? D1(bVar) : C1(l3.f13539n, i10, bVar);
        }
        l3 F = this.f14596g.F();
        if (!(i10 < F.t())) {
            F = l3.f13539n;
        }
        return C1(F, i10, null);
    }

    private c.a G1() {
        return D1(this.f14593d.g());
    }

    private c.a H1() {
        return D1(this.f14593d.h());
    }

    private c.a I1(l2 l2Var) {
        u2.s sVar;
        return (!(l2Var instanceof s1.q) || (sVar = ((s1.q) l2Var).f13684v) == null) ? B1() : D1(new u.b(sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J1(c cVar, p3.l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J2(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.d(aVar, str, j10);
        cVar.m(aVar, str, j11, j10);
        cVar.q(aVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L2(c.a aVar, v1.e eVar, c cVar) {
        cVar.o(aVar, eVar);
        cVar.n(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M2(c.a aVar, v1.e eVar, c cVar) {
        cVar.q0(aVar, eVar);
        cVar.l0(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N1(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.Y(aVar, str, j10);
        cVar.z(aVar, str, j11, j10);
        cVar.q(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O2(c.a aVar, s1.m1 m1Var, v1.i iVar, c cVar) {
        cVar.W(aVar, m1Var);
        cVar.L(aVar, m1Var, iVar);
        cVar.b(aVar, 2, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P1(c.a aVar, v1.e eVar, c cVar) {
        cVar.j(aVar, eVar);
        cVar.n(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P2(c.a aVar, q3.z zVar, c cVar) {
        cVar.e(aVar, zVar);
        cVar.f0(aVar, zVar.f12694n, zVar.f12695o, zVar.f12696p, zVar.f12697q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q1(c.a aVar, v1.e eVar, c cVar) {
        cVar.x(aVar, eVar);
        cVar.l0(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R1(c.a aVar, s1.m1 m1Var, v1.i iVar, c cVar) {
        cVar.p(aVar, m1Var);
        cVar.T(aVar, m1Var, iVar);
        cVar.b(aVar, 1, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S2(p2 p2Var, c cVar, p3.l lVar) {
        cVar.N(p2Var, new c.b(lVar, this.f14594e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2() {
        final c.a B1 = B1();
        U2(B1, 1028, new q.a() { // from class: t1.z
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).y0(c.a.this);
            }
        });
        this.f14595f.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f2(c.a aVar, int i10, c cVar) {
        cVar.a(aVar);
        cVar.k0(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j2(c.a aVar, boolean z10, c cVar) {
        cVar.a0(aVar, z10);
        cVar.A(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z2(c.a aVar, int i10, p2.e eVar, p2.e eVar2, c cVar) {
        cVar.C(aVar, i10);
        cVar.j0(aVar, eVar, eVar2, i10);
    }

    @Override // s1.p2.d
    public final void A(final int i10) {
        final c.a B1 = B1();
        U2(B1, 6, new q.a() { // from class: t1.g
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).r0(c.a.this, i10);
            }
        });
    }

    @Override // s1.p2.d
    public final void B(final boolean z10, final int i10) {
        final c.a B1 = B1();
        U2(B1, -1, new q.a() { // from class: t1.h1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).i0(c.a.this, z10, i10);
            }
        });
    }

    protected final c.a B1() {
        return D1(this.f14593d.d());
    }

    @Override // w1.w
    public final void C(int i10, u.b bVar, final int i11) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1022, new q.a() { // from class: t1.e
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.f2(c.a.this, i11, (c) obj);
            }
        });
    }

    @RequiresNonNull({"player"})
    protected final c.a C1(l3 l3Var, int i10, u.b bVar) {
        long k10;
        u.b bVar2 = l3Var.u() ? null : bVar;
        long b10 = this.f14590a.b();
        boolean z10 = true;
        boolean z11 = l3Var.equals(this.f14596g.F()) && i10 == this.f14596g.w();
        long j10 = 0;
        if (bVar2 != null && bVar2.b()) {
            if (!z11 || this.f14596g.v() != bVar2.f15357b || this.f14596g.A() != bVar2.f15358c) {
                z10 = false;
            }
            if (z10) {
                j10 = this.f14596g.I();
            }
        } else if (z11) {
            k10 = this.f14596g.k();
            return new c.a(b10, l3Var, i10, bVar2, k10, this.f14596g.F(), this.f14596g.w(), this.f14593d.d(), this.f14596g.I(), this.f14596g.m());
        } else if (!l3Var.u()) {
            j10 = l3Var.r(i10, this.f14592c).d();
        }
        k10 = j10;
        return new c.a(b10, l3Var, i10, bVar2, k10, this.f14596g.F(), this.f14596g.w(), this.f14593d.d(), this.f14596g.I(), this.f14596g.m());
    }

    @Override // s1.p2.d
    public void D(boolean z10) {
    }

    @Override // s1.p2.d
    public void E(int i10) {
    }

    @Override // s1.p2.d
    public final void F(final l2 l2Var) {
        final c.a I1 = I1(l2Var);
        U2(I1, 10, new q.a() { // from class: t1.l0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).J(c.a.this, l2Var);
            }
        });
    }

    @Override // w1.w
    public final void G(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1027, new q.a() { // from class: t1.o
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).f(c.a.this);
            }
        });
    }

    @Override // t1.a
    public void H(final p2 p2Var, Looper looper) {
        p3.a.f(this.f14596g == null || this.f14593d.f14600b.isEmpty());
        this.f14596g = (p2) p3.a.e(p2Var);
        this.f14597h = this.f14590a.c(looper, null);
        this.f14595f = this.f14595f.e(looper, new q.b() { // from class: t1.i1
            @Override // p3.q.b
            public final void a(Object obj, p3.l lVar) {
                o1.this.S2(p2Var, (c) obj, lVar);
            }
        });
    }

    @Override // w1.w
    public final void I(int i10, u.b bVar, final Exception exc) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1024, new q.a() { // from class: t1.v
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).p0(c.a.this, exc);
            }
        });
    }

    @Override // t1.a
    public void J(c cVar) {
        p3.a.e(cVar);
        this.f14595f.c(cVar);
    }

    @Override // s1.p2.d
    public final void K(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 3, new q.a() { // from class: t1.e1
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.j2(c.a.this, z10, (c) obj);
            }
        });
    }

    @Override // s1.p2.d
    public void L() {
    }

    @Override // s1.p2.d
    public final void M() {
        final c.a B1 = B1();
        U2(B1, -1, new q.a() { // from class: t1.v0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).O(c.a.this);
            }
        });
    }

    @Override // s1.p2.d
    public void N(final q3 q3Var) {
        final c.a B1 = B1();
        U2(B1, 2, new q.a() { // from class: t1.p0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).r(c.a.this, q3Var);
            }
        });
    }

    @Override // s1.p2.d
    public void O(final p2.b bVar) {
        final c.a B1 = B1();
        U2(B1, 13, new q.a() { // from class: t1.o0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).y(c.a.this, bVar);
            }
        });
    }

    @Override // w1.w
    public final void P(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1025, new q.a() { // from class: t1.k1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).D(c.a.this);
            }
        });
    }

    @Override // u2.b0
    public final void Q(int i10, u.b bVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1005, new q.a() { // from class: t1.x0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).g(c.a.this, qVar);
            }
        });
    }

    @Override // s1.p2.d
    public void R(final z1 z1Var) {
        final c.a B1 = B1();
        U2(B1, 14, new q.a() { // from class: t1.j0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).w(c.a.this, z1Var);
            }
        });
    }

    @Override // s1.p2.d
    public final void S(final float f10) {
        final c.a H1 = H1();
        U2(H1, 22, new q.a() { // from class: t1.m1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).F(c.a.this, f10);
            }
        });
    }

    @Override // u2.b0
    public final void T(int i10, u.b bVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1004, new q.a() { // from class: t1.w0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).i(c.a.this, qVar);
            }
        });
    }

    @Override // u2.b0
    public final void U(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1000, new q.a() { // from class: t1.t0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).o0(c.a.this, nVar, qVar);
            }
        });
    }

    protected final void U2(c.a aVar, int i10, q.a<c> aVar2) {
        this.f14594e.put(i10, aVar);
        this.f14595f.k(i10, aVar2);
    }

    @Override // u2.b0
    public final void V(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1001, new q.a() { // from class: t1.r0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).s0(c.a.this, nVar, qVar);
            }
        });
    }

    @Override // s1.p2.d
    public final void W(final int i10) {
        final c.a B1 = B1();
        U2(B1, 4, new q.a() { // from class: t1.f
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).H(c.a.this, i10);
            }
        });
    }

    @Override // s1.p2.d
    public final void X(final boolean z10, final int i10) {
        final c.a B1 = B1();
        U2(B1, 5, new q.a() { // from class: t1.f1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).c0(c.a.this, z10, i10);
            }
        });
    }

    @Override // u2.b0
    public final void Y(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1002, new q.a() { // from class: t1.s0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).t(c.a.this, nVar, qVar);
            }
        });
    }

    @Override // t1.a
    public final void Z(List<u.b> list, u.b bVar) {
        this.f14593d.k(list, bVar, (p2) p3.a.e(this.f14596g));
    }

    @Override // t1.a
    public void a() {
        ((p3.n) p3.a.h(this.f14597h)).j(new Runnable() { // from class: t1.d
            @Override // java.lang.Runnable
            public final void run() {
                o1.this.T2();
            }
        });
    }

    @Override // w1.w
    public final void a0(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1023, new q.a() { // from class: t1.k0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).m0(c.a.this);
            }
        });
    }

    @Override // s1.p2.d
    public final void b(final boolean z10) {
        final c.a H1 = H1();
        U2(H1, 23, new q.a() { // from class: t1.d1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).M(c.a.this, z10);
            }
        });
    }

    @Override // s1.p2.d
    public final void b0(final p2.e eVar, final p2.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f14598i = false;
        }
        this.f14593d.j((p2) p3.a.e(this.f14596g));
        final c.a B1 = B1();
        U2(B1, 11, new q.a() { // from class: t1.m
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.z2(c.a.this, i10, eVar, eVar2, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void c(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1014, new q.a() { // from class: t1.u
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).v(c.a.this, exc);
            }
        });
    }

    @Override // o3.f.a
    public final void c0(final int i10, final long j10, final long j11) {
        final c.a E1 = E1();
        U2(E1, 1006, new q.a() { // from class: t1.k
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).h(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override // s1.p2.d
    public void d(final d3.e eVar) {
        final c.a B1 = B1();
        U2(B1, 27, new q.a() { // from class: t1.r
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).x0(c.a.this, eVar);
            }
        });
    }

    @Override // s1.p2.d
    public void d0(final l2 l2Var) {
        final c.a I1 = I1(l2Var);
        U2(I1, 10, new q.a() { // from class: t1.m0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).s(c.a.this, l2Var);
            }
        });
    }

    @Override // t1.a
    public final void e(final String str) {
        final c.a H1 = H1();
        U2(H1, 1019, new q.a() { // from class: t1.x
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).t0(c.a.this, str);
            }
        });
    }

    @Override // t1.a
    public final void e0() {
        if (this.f14598i) {
            return;
        }
        final c.a B1 = B1();
        this.f14598i = true;
        U2(B1, -1, new q.a() { // from class: t1.l1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).e0(c.a.this);
            }
        });
    }

    @Override // t1.a
    public final void f(final Object obj, final long j10) {
        final c.a H1 = H1();
        U2(H1, 26, new q.a() { // from class: t1.w
            @Override // p3.q.a
            public final void c(Object obj2) {
                ((c) obj2).b0(c.a.this, obj, j10);
            }
        });
    }

    @Override // w1.w
    public final void f0(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1026, new q.a() { // from class: t1.g1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).l(c.a.this);
            }
        });
    }

    @Override // t1.a
    public final void g(final String str, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1016, new q.a() { // from class: t1.b0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.J2(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // s1.p2.d
    public final void g0(l3 l3Var, final int i10) {
        this.f14593d.l((p2) p3.a.e(this.f14596g));
        final c.a B1 = B1();
        U2(B1, 0, new q.a() { // from class: t1.h
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).u0(c.a.this, i10);
            }
        });
    }

    @Override // s1.p2.d
    public final void h(final int i10) {
        final c.a B1 = B1();
        U2(B1, 8, new q.a() { // from class: t1.n1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).B(c.a.this, i10);
            }
        });
    }

    @Override // s1.p2.d
    public final void h0(final int i10, final int i11) {
        final c.a H1 = H1();
        U2(H1, 24, new q.a() { // from class: t1.i
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).d0(c.a.this, i10, i11);
            }
        });
    }

    @Override // t1.a
    public final void i(final v1.e eVar) {
        final c.a H1 = H1();
        U2(H1, 1007, new q.a() { // from class: t1.a1
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.Q1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // s1.p2.d
    public final void i0(final u1 u1Var, final int i10) {
        final c.a B1 = B1();
        U2(B1, 1, new q.a() { // from class: t1.i0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).Z(c.a.this, u1Var, i10);
            }
        });
    }

    @Override // s1.p2.d
    public void j(final List<d3.b> list) {
        final c.a B1 = B1();
        U2(B1, 27, new q.a() { // from class: t1.c0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).I(c.a.this, list);
            }
        });
    }

    @Override // s1.p2.d
    public void j0(p2 p2Var, p2.c cVar) {
    }

    @Override // t1.a
    public final void k(final long j10) {
        final c.a H1 = H1();
        U2(H1, 1010, new q.a() { // from class: t1.p
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).u(c.a.this, j10);
            }
        });
    }

    @Override // w1.w
    public /* synthetic */ void k0(int i10, u.b bVar) {
        w1.p.a(this, i10, bVar);
    }

    @Override // t1.a
    public final void l(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1029, new q.a() { // from class: t1.s
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).U(c.a.this, exc);
            }
        });
    }

    @Override // s1.p2.d
    public void l0(final s1.o oVar) {
        final c.a B1 = B1();
        U2(B1, 29, new q.a() { // from class: t1.f0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).g0(c.a.this, oVar);
            }
        });
    }

    @Override // t1.a
    public final void m(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1030, new q.a() { // from class: t1.t
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).G(c.a.this, exc);
            }
        });
    }

    @Override // u2.b0
    public final void m0(int i10, u.b bVar, final u2.n nVar, final u2.q qVar, final IOException iOException, final boolean z10) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1003, new q.a() { // from class: t1.u0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).K(c.a.this, nVar, qVar, iOException, z10);
            }
        });
    }

    @Override // t1.a
    public final void n(final v1.e eVar) {
        final c.a G1 = G1();
        U2(G1, 1013, new q.a() { // from class: t1.z0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.P1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // s1.p2.d
    public final void n0(final u1.e eVar) {
        final c.a H1 = H1();
        U2(H1, 20, new q.a() { // from class: t1.q0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).w0(c.a.this, eVar);
            }
        });
    }

    @Override // s1.p2.d
    public final void o(final q3.z zVar) {
        final c.a H1 = H1();
        U2(H1, 25, new q.a() { // from class: t1.e0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.P2(c.a.this, zVar, (c) obj);
            }
        });
    }

    @Override // s1.p2.d
    public void o0(final int i10, final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 30, new q.a() { // from class: t1.n
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).E(c.a.this, i10, z10);
            }
        });
    }

    @Override // s1.p2.d
    public final void p(final o2 o2Var) {
        final c.a B1 = B1();
        U2(B1, 12, new q.a() { // from class: t1.n0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).k(c.a.this, o2Var);
            }
        });
    }

    @Override // s1.p2.d
    public void p0(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 7, new q.a() { // from class: t1.c1
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).n0(c.a.this, z10);
            }
        });
    }

    @Override // t1.a
    public final void q(final String str) {
        final c.a H1 = H1();
        U2(H1, 1012, new q.a() { // from class: t1.y
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).h0(c.a.this, str);
            }
        });
    }

    @Override // t1.a
    public final void r(final String str, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1008, new q.a() { // from class: t1.a0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.N1(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void s(final s1.m1 m1Var, final v1.i iVar) {
        final c.a H1 = H1();
        U2(H1, 1009, new q.a() { // from class: t1.h0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.R1(c.a.this, m1Var, iVar, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void t(final v1.e eVar) {
        final c.a G1 = G1();
        U2(G1, 1020, new q.a() { // from class: t1.y0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.L2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void u(final int i10, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1011, new q.a() { // from class: t1.l
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).V(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override // t1.a
    public final void v(final int i10, final long j10) {
        final c.a G1 = G1();
        U2(G1, 1018, new q.a() { // from class: t1.j
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).X(c.a.this, i10, j10);
            }
        });
    }

    @Override // t1.a
    public final void w(final s1.m1 m1Var, final v1.i iVar) {
        final c.a H1 = H1();
        U2(H1, 1017, new q.a() { // from class: t1.g0
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.O2(c.a.this, m1Var, iVar, (c) obj);
            }
        });
    }

    @Override // s1.p2.d
    public final void x(final k2.a aVar) {
        final c.a B1 = B1();
        U2(B1, 28, new q.a() { // from class: t1.d0
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).v0(c.a.this, aVar);
            }
        });
    }

    @Override // t1.a
    public final void y(final long j10, final int i10) {
        final c.a G1 = G1();
        U2(G1, 1021, new q.a() { // from class: t1.q
            @Override // p3.q.a
            public final void c(Object obj) {
                ((c) obj).c(c.a.this, j10, i10);
            }
        });
    }

    @Override // t1.a
    public final void z(final v1.e eVar) {
        final c.a H1 = H1();
        U2(H1, 1015, new q.a() { // from class: t1.b1
            @Override // p3.q.a
            public final void c(Object obj) {
                o1.M2(c.a.this, eVar, (c) obj);
            }
        });
    }
}
