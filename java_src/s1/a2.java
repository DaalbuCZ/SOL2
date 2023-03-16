package s1;

import u2.u;
/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final u2.r f13284a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13285b;

    /* renamed from: c  reason: collision with root package name */
    public final u2.n0[] f13286c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13287d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13288e;

    /* renamed from: f  reason: collision with root package name */
    public b2 f13289f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13290g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f13291h;

    /* renamed from: i  reason: collision with root package name */
    private final a3[] f13292i;

    /* renamed from: j  reason: collision with root package name */
    private final n3.c0 f13293j;

    /* renamed from: k  reason: collision with root package name */
    private final g2 f13294k;

    /* renamed from: l  reason: collision with root package name */
    private a2 f13295l;

    /* renamed from: m  reason: collision with root package name */
    private u2.v0 f13296m;

    /* renamed from: n  reason: collision with root package name */
    private n3.d0 f13297n;

    /* renamed from: o  reason: collision with root package name */
    private long f13298o;

    public a2(a3[] a3VarArr, long j10, n3.c0 c0Var, o3.b bVar, g2 g2Var, b2 b2Var, n3.d0 d0Var) {
        this.f13292i = a3VarArr;
        this.f13298o = j10;
        this.f13293j = c0Var;
        this.f13294k = g2Var;
        u.b bVar2 = b2Var.f13307a;
        this.f13285b = bVar2.f15356a;
        this.f13289f = b2Var;
        this.f13296m = u2.v0.f15373q;
        this.f13297n = d0Var;
        this.f13286c = new u2.n0[a3VarArr.length];
        this.f13291h = new boolean[a3VarArr.length];
        this.f13284a = e(bVar2, g2Var, bVar, b2Var.f13308b, b2Var.f13310d);
    }

    private void c(u2.n0[] n0VarArr) {
        int i10 = 0;
        while (true) {
            a3[] a3VarArr = this.f13292i;
            if (i10 >= a3VarArr.length) {
                return;
            }
            if (a3VarArr[i10].k() == -2 && this.f13297n.c(i10)) {
                n0VarArr[i10] = new u2.k();
            }
            i10++;
        }
    }

    private static u2.r e(u.b bVar, g2 g2Var, o3.b bVar2, long j10, long j11) {
        u2.r h10 = g2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new u2.d(h10, true, 0L, j11) : h10;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            n3.d0 d0Var = this.f13297n;
            if (i10 >= d0Var.f11646a) {
                return;
            }
            boolean c10 = d0Var.c(i10);
            n3.t tVar = this.f13297n.f11648c[i10];
            if (c10 && tVar != null) {
                tVar.g();
            }
            i10++;
        }
    }

    private void g(u2.n0[] n0VarArr) {
        int i10 = 0;
        while (true) {
            a3[] a3VarArr = this.f13292i;
            if (i10 >= a3VarArr.length) {
                return;
            }
            if (a3VarArr[i10].k() == -2) {
                n0VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            n3.d0 d0Var = this.f13297n;
            if (i10 >= d0Var.f11646a) {
                return;
            }
            boolean c10 = d0Var.c(i10);
            n3.t tVar = this.f13297n.f11648c[i10];
            if (c10 && tVar != null) {
                tVar.k();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f13295l == null;
    }

    private static void u(g2 g2Var, u2.r rVar) {
        try {
            if (rVar instanceof u2.d) {
                rVar = ((u2.d) rVar).f15170n;
            }
            g2Var.z(rVar);
        } catch (RuntimeException e10) {
            p3.r.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        u2.r rVar = this.f13284a;
        if (rVar instanceof u2.d) {
            long j10 = this.f13289f.f13310d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((u2.d) rVar).v(0L, j10);
        }
    }

    public long a(n3.d0 d0Var, long j10, boolean z10) {
        return b(d0Var, j10, z10, new boolean[this.f13292i.length]);
    }

    public long b(n3.d0 d0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= d0Var.f11646a) {
                break;
            }
            boolean[] zArr2 = this.f13291h;
            if (z10 || !d0Var.b(this.f13297n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f13286c);
        f();
        this.f13297n = d0Var;
        h();
        long m10 = this.f13284a.m(d0Var.f11648c, this.f13291h, this.f13286c, zArr, j10);
        c(this.f13286c);
        this.f13288e = false;
        int i11 = 0;
        while (true) {
            u2.n0[] n0VarArr = this.f13286c;
            if (i11 >= n0VarArr.length) {
                return m10;
            }
            if (n0VarArr[i11] != null) {
                p3.a.f(d0Var.c(i11));
                if (this.f13292i[i11].k() != -2) {
                    this.f13288e = true;
                }
            } else {
                p3.a.f(d0Var.f11648c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        p3.a.f(r());
        this.f13284a.g(y(j10));
    }

    public long i() {
        if (this.f13287d) {
            long f10 = this.f13288e ? this.f13284a.f() : Long.MIN_VALUE;
            return f10 == Long.MIN_VALUE ? this.f13289f.f13311e : f10;
        }
        return this.f13289f.f13308b;
    }

    public a2 j() {
        return this.f13295l;
    }

    public long k() {
        if (this.f13287d) {
            return this.f13284a.c();
        }
        return 0L;
    }

    public long l() {
        return this.f13298o;
    }

    public long m() {
        return this.f13289f.f13308b + this.f13298o;
    }

    public u2.v0 n() {
        return this.f13296m;
    }

    public n3.d0 o() {
        return this.f13297n;
    }

    public void p(float f10, l3 l3Var) {
        this.f13287d = true;
        this.f13296m = this.f13284a.p();
        n3.d0 v10 = v(f10, l3Var);
        b2 b2Var = this.f13289f;
        long j10 = b2Var.f13308b;
        long j11 = b2Var.f13311e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f13298o;
        b2 b2Var2 = this.f13289f;
        this.f13298o = j12 + (b2Var2.f13308b - a10);
        this.f13289f = b2Var2.b(a10);
    }

    public boolean q() {
        return this.f13287d && (!this.f13288e || this.f13284a.f() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        p3.a.f(r());
        if (this.f13287d) {
            this.f13284a.h(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f13294k, this.f13284a);
    }

    public n3.d0 v(float f10, l3 l3Var) {
        n3.t[] tVarArr;
        n3.d0 g10 = this.f13293j.g(this.f13292i, n(), this.f13289f.f13307a, l3Var);
        for (n3.t tVar : g10.f11648c) {
            if (tVar != null) {
                tVar.s(f10);
            }
        }
        return g10;
    }

    public void w(a2 a2Var) {
        if (a2Var == this.f13295l) {
            return;
        }
        f();
        this.f13295l = a2Var;
        h();
    }

    public void x(long j10) {
        this.f13298o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
