package u2;

import s1.d3;
import s1.m1;
import s1.n1;
import u2.r;
/* loaded from: classes.dex */
public final class d implements r, r.a {

    /* renamed from: n  reason: collision with root package name */
    public final r f15170n;

    /* renamed from: o  reason: collision with root package name */
    private r.a f15171o;

    /* renamed from: p  reason: collision with root package name */
    private a[] f15172p = new a[0];

    /* renamed from: q  reason: collision with root package name */
    private long f15173q;

    /* renamed from: r  reason: collision with root package name */
    long f15174r;

    /* renamed from: s  reason: collision with root package name */
    long f15175s;

    /* loaded from: classes.dex */
    private final class a implements n0 {

        /* renamed from: n  reason: collision with root package name */
        public final n0 f15176n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f15177o;

        public a(n0 n0Var) {
            this.f15176n = n0Var;
        }

        public void a() {
            this.f15177o = false;
        }

        @Override // u2.n0
        public void b() {
            this.f15176n.b();
        }

        @Override // u2.n0
        public int e(n1 n1Var, v1.g gVar, int i10) {
            if (d.this.i()) {
                return -3;
            }
            if (this.f15177o) {
                gVar.w(4);
                return -4;
            }
            int e10 = this.f15176n.e(n1Var, gVar, i10);
            if (e10 == -5) {
                m1 m1Var = (m1) p3.a.e(n1Var.f13638b);
                int i11 = m1Var.O;
                if (i11 != 0 || m1Var.P != 0) {
                    d dVar = d.this;
                    if (dVar.f15174r != 0) {
                        i11 = 0;
                    }
                    n1Var.f13638b = m1Var.b().N(i11).O(dVar.f15175s == Long.MIN_VALUE ? m1Var.P : 0).E();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f15175s;
            if (j10 == Long.MIN_VALUE || ((e10 != -4 || gVar.f15538r < j10) && !(e10 == -3 && dVar2.f() == Long.MIN_VALUE && !gVar.f15537q))) {
                return e10;
            }
            gVar.m();
            gVar.w(4);
            this.f15177o = true;
            return -4;
        }

        @Override // u2.n0
        public boolean i() {
            return !d.this.i() && this.f15176n.i();
        }

        @Override // u2.n0
        public int t(long j10) {
            if (d.this.i()) {
                return -3;
            }
            return this.f15176n.t(j10);
        }
    }

    public d(r rVar, boolean z10, long j10, long j11) {
        this.f15170n = rVar;
        this.f15173q = z10 ? j10 : -9223372036854775807L;
        this.f15174r = j10;
        this.f15175s = j11;
    }

    private d3 e(long j10, d3 d3Var) {
        long r10 = p3.m0.r(d3Var.f13356a, 0L, j10 - this.f15174r);
        long j11 = d3Var.f13357b;
        long j12 = this.f15175s;
        long r11 = p3.m0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (r10 == d3Var.f13356a && r11 == d3Var.f13357b) ? d3Var : new d3(r10, r11);
    }

    private static boolean u(long j10, n3.t[] tVarArr) {
        if (j10 != 0) {
            for (n3.t tVar : tVarArr) {
                if (tVar != null) {
                    m1 o10 = tVar.o();
                    if (!p3.v.a(o10.f13587y, o10.f13584v)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.f15170n.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        long c10 = this.f15170n.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f15175s;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.r
    public long d(long j10, d3 d3Var) {
        long j11 = this.f15174r;
        if (j10 == j11) {
            return j11;
        }
        return this.f15170n.d(j10, e(j10, d3Var));
    }

    @Override // u2.r, u2.o0
    public long f() {
        long f10 = this.f15170n.f();
        if (f10 != Long.MIN_VALUE) {
            long j10 = this.f15175s;
            if (j10 == Long.MIN_VALUE || f10 < j10) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        return this.f15170n.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.f15170n.h(j10);
    }

    boolean i() {
        return this.f15173q != -9223372036854775807L;
    }

    @Override // u2.r.a
    public void j(r rVar) {
        ((r.a) p3.a.e(this.f15171o)).j(this);
    }

    @Override // u2.r
    public void k(r.a aVar, long j10) {
        this.f15171o = aVar;
        this.f15170n.k(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m(n3.t[] r13, boolean[] r14, u2.n0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            u2.d$a[] r2 = new u2.d.a[r2]
            r0.f15172p = r2
            int r2 = r1.length
            u2.n0[] r9 = new u2.n0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            u2.d$a[] r3 = r0.f15172p
            r4 = r1[r2]
            u2.d$a r4 = (u2.d.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            u2.n0 r11 = r3.f15176n
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            u2.r r2 = r0.f15170n
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.m(r3, r4, r5, r6, r7)
            boolean r4 = r12.i()
            if (r4 == 0) goto L47
            long r4 = r0.f15174r
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = u(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f15173q = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f15174r
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L65
            long r4 = r0.f15175s
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L67
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L65
            goto L67
        L65:
            r4 = r10
            goto L68
        L67:
            r4 = 1
        L68:
            p3.a.f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            u2.d$a[] r4 = r0.f15172p
            r4[r10] = r11
            goto L8e
        L77:
            u2.d$a[] r4 = r0.f15172p
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            u2.n0 r5 = r5.f15176n
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            u2.d$a r5 = new u2.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            u2.d$a[] r4 = r0.f15172p
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.m(n3.t[], boolean[], u2.n0[], boolean[], long):long");
    }

    @Override // u2.r
    public long n() {
        if (i()) {
            long j10 = this.f15173q;
            this.f15173q = -9223372036854775807L;
            long n10 = n();
            return n10 != -9223372036854775807L ? n10 : j10;
        }
        long n11 = this.f15170n.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        p3.a.f(n11 >= this.f15174r);
        long j11 = this.f15175s;
        if (j11 != Long.MIN_VALUE && n11 > j11) {
            z10 = false;
        }
        p3.a.f(z10);
        return n11;
    }

    @Override // u2.r
    public v0 p() {
        return this.f15170n.p();
    }

    @Override // u2.r
    public void q() {
        this.f15170n.q();
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        this.f15170n.r(j10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f15173q = r0
            u2.d$a[] r0 = r5.f15172p
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            u2.r r0 = r5.f15170n
            long r0 = r0.s(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f15174r
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f15175s
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p3.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.s(long):long");
    }

    @Override // u2.o0.a
    /* renamed from: t */
    public void o(r rVar) {
        ((r.a) p3.a.e(this.f15171o)).o(this);
    }

    public void v(long j10, long j11) {
        this.f15174r = j10;
        this.f15175s = j11;
    }
}
