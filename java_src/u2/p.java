package u2;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.l3;
import s1.u1;
import u2.u;
/* loaded from: classes.dex */
public final class p extends f<Void> {
    private final l3.b A;
    private a B;
    private o C;
    private boolean D;
    private boolean E;
    private boolean F;

    /* renamed from: x  reason: collision with root package name */
    private final u f15325x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f15326y;

    /* renamed from: z  reason: collision with root package name */
    private final l3.d f15327z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends l {

        /* renamed from: s  reason: collision with root package name */
        public static final Object f15328s = new Object();

        /* renamed from: q  reason: collision with root package name */
        private final Object f15329q;

        /* renamed from: r  reason: collision with root package name */
        private final Object f15330r;

        private a(l3 l3Var, Object obj, Object obj2) {
            super(l3Var);
            this.f15329q = obj;
            this.f15330r = obj2;
        }

        public static a A(l3 l3Var, Object obj, Object obj2) {
            return new a(l3Var, obj, obj2);
        }

        public static a z(u1 u1Var) {
            return new a(new b(u1Var), l3.d.E, f15328s);
        }

        @Override // u2.l, s1.l3
        public int f(Object obj) {
            Object obj2;
            l3 l3Var = this.f15270p;
            if (f15328s.equals(obj) && (obj2 = this.f15330r) != null) {
                obj = obj2;
            }
            return l3Var.f(obj);
        }

        @Override // u2.l, s1.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            this.f15270p.k(i10, bVar, z10);
            if (p3.m0.c(bVar.f13543o, this.f15330r) && z10) {
                bVar.f13543o = f15328s;
            }
            return bVar;
        }

        @Override // u2.l, s1.l3
        public Object q(int i10) {
            Object q10 = this.f15270p.q(i10);
            return p3.m0.c(q10, this.f15330r) ? f15328s : q10;
        }

        @Override // u2.l, s1.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            this.f15270p.s(i10, dVar, j10);
            if (p3.m0.c(dVar.f13553n, this.f15329q)) {
                dVar.f13553n = l3.d.E;
            }
            return dVar;
        }

        public a y(l3 l3Var) {
            return new a(l3Var, this.f15329q, this.f15330r);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l3 {

        /* renamed from: p  reason: collision with root package name */
        private final u1 f15331p;

        public b(u1 u1Var) {
            this.f15331p = u1Var;
        }

        @Override // s1.l3
        public int f(Object obj) {
            return obj == a.f15328s ? 0 : -1;
        }

        @Override // s1.l3
        public l3.b k(int i10, l3.b bVar, boolean z10) {
            bVar.w(z10 ? 0 : null, z10 ? a.f15328s : null, 0, -9223372036854775807L, 0L, v2.c.f15567t, true);
            return bVar;
        }

        @Override // s1.l3
        public int m() {
            return 1;
        }

        @Override // s1.l3
        public Object q(int i10) {
            return a.f15328s;
        }

        @Override // s1.l3
        public l3.d s(int i10, l3.d dVar, long j10) {
            dVar.i(l3.d.E, this.f15331p, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f13564y = true;
            return dVar;
        }

        @Override // s1.l3
        public int t() {
            return 1;
        }
    }

    public p(u uVar, boolean z10) {
        this.f15325x = uVar;
        this.f15326y = z10 && uVar.g();
        this.f15327z = new l3.d();
        this.A = new l3.b();
        l3 i10 = uVar.i();
        if (i10 == null) {
            this.B = a.z(uVar.a());
            return;
        }
        this.B = a.A(i10, null, null);
        this.F = true;
    }

    private Object N(Object obj) {
        return (this.B.f15330r == null || !this.B.f15330r.equals(obj)) ? obj : a.f15328s;
    }

    private Object O(Object obj) {
        return (this.B.f15330r == null || !obj.equals(a.f15328s)) ? obj : this.B.f15330r;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void S(long j10) {
        o oVar = this.C;
        int f10 = this.B.f(oVar.f15316n.f15356a);
        if (f10 == -1) {
            return;
        }
        long j11 = this.B.j(f10, this.A).f13545q;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.w(j10);
    }

    @Override // u2.f, u2.a
    public void C(o3.p0 p0Var) {
        super.C(p0Var);
        if (this.f15326y) {
            return;
        }
        this.D = true;
        L(null, this.f15325x);
    }

    @Override // u2.f, u2.a
    public void E() {
        this.E = false;
        this.D = false;
        super.E();
    }

    @Override // u2.u
    /* renamed from: M */
    public o n(u.b bVar, o3.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.y(this.f15325x);
        if (this.E) {
            oVar.e(bVar.c(O(bVar.f15356a)));
        } else {
            this.C = oVar;
            if (!this.D) {
                this.D = true;
                L(null, this.f15325x);
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.f
    /* renamed from: P */
    public u.b G(Void r12, u.b bVar) {
        return bVar.c(N(bVar.f15356a));
    }

    public l3 Q() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // u2.f
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(java.lang.Void r13, u2.u r14, s1.l3 r15) {
        /*
            r12 = this;
            boolean r13 = r12.E
            if (r13 == 0) goto L19
            u2.p$a r13 = r12.B
            u2.p$a r13 = r13.y(r15)
            r12.B = r13
            u2.o r13 = r12.C
            if (r13 == 0) goto Lae
            long r13 = r13.i()
            r12.S(r13)
            goto Lae
        L19:
            boolean r13 = r15.u()
            if (r13 == 0) goto L36
            boolean r13 = r12.F
            if (r13 == 0) goto L2a
            u2.p$a r13 = r12.B
            u2.p$a r13 = r13.y(r15)
            goto L32
        L2a:
            java.lang.Object r13 = s1.l3.d.E
            java.lang.Object r14 = u2.p.a.f15328s
            u2.p$a r13 = u2.p.a.A(r15, r13, r14)
        L32:
            r12.B = r13
            goto Lae
        L36:
            s1.l3$d r13 = r12.f15327z
            r14 = 0
            r15.r(r14, r13)
            s1.l3$d r13 = r12.f15327z
            long r0 = r13.e()
            s1.l3$d r13 = r12.f15327z
            java.lang.Object r13 = r13.f13553n
            u2.o r2 = r12.C
            if (r2 == 0) goto L74
            long r2 = r2.t()
            u2.p$a r4 = r12.B
            u2.o r5 = r12.C
            u2.u$b r5 = r5.f15316n
            java.lang.Object r5 = r5.f15356a
            s1.l3$b r6 = r12.A
            r4.l(r5, r6)
            s1.l3$b r4 = r12.A
            long r4 = r4.q()
            long r4 = r4 + r2
            u2.p$a r2 = r12.B
            s1.l3$d r3 = r12.f15327z
            s1.l3$d r14 = r2.r(r14, r3)
            long r2 = r14.e()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            s1.l3$d r7 = r12.f15327z
            s1.l3$b r8 = r12.A
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.n(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.F
            if (r14 == 0) goto L94
            u2.p$a r13 = r12.B
            u2.p$a r13 = r13.y(r15)
            goto L98
        L94:
            u2.p$a r13 = u2.p.a.A(r15, r13, r0)
        L98:
            r12.B = r13
            u2.o r13 = r12.C
            if (r13 == 0) goto Lae
            r12.S(r1)
            u2.u$b r13 = r13.f15316n
            java.lang.Object r14 = r13.f15356a
            java.lang.Object r14 = r12.O(r14)
            u2.u$b r13 = r13.c(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.F = r14
            r12.E = r14
            u2.p$a r14 = r12.B
            r12.D(r14)
            if (r13 == 0) goto Lc6
            u2.o r14 = r12.C
            java.lang.Object r14 = p3.a.e(r14)
            u2.o r14 = (u2.o) r14
            r14.e(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.p.K(java.lang.Void, u2.u, s1.l3):void");
    }

    @Override // u2.u
    public u1 a() {
        return this.f15325x.a();
    }

    @Override // u2.u
    public void b(r rVar) {
        ((o) rVar).x();
        if (rVar == this.C) {
            this.C = null;
        }
    }

    @Override // u2.u
    public void f() {
    }
}
