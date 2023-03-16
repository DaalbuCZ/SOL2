package z2;

import s1.n1;
import u2.n0;
/* loaded from: classes.dex */
final class l implements n0 {

    /* renamed from: n  reason: collision with root package name */
    private final int f17251n;

    /* renamed from: o  reason: collision with root package name */
    private final p f17252o;

    /* renamed from: p  reason: collision with root package name */
    private int f17253p = -1;

    public l(p pVar, int i10) {
        this.f17252o = pVar;
        this.f17251n = i10;
    }

    private boolean c() {
        int i10 = this.f17253p;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() {
        p3.a.a(this.f17253p == -1);
        this.f17253p = this.f17252o.y(this.f17251n);
    }

    @Override // u2.n0
    public void b() {
        int i10 = this.f17253p;
        if (i10 == -2) {
            throw new r(this.f17252o.p().b(this.f17251n).b(0).f13587y);
        }
        if (i10 == -1) {
            this.f17252o.U();
        } else if (i10 != -3) {
            this.f17252o.V(i10);
        }
    }

    public void d() {
        if (this.f17253p != -1) {
            this.f17252o.p0(this.f17251n);
            this.f17253p = -1;
        }
    }

    @Override // u2.n0
    public int e(n1 n1Var, v1.g gVar, int i10) {
        if (this.f17253p == -3) {
            gVar.l(4);
            return -4;
        } else if (c()) {
            return this.f17252o.e0(this.f17253p, n1Var, gVar, i10);
        } else {
            return -3;
        }
    }

    @Override // u2.n0
    public boolean i() {
        return this.f17253p == -3 || (c() && this.f17252o.Q(this.f17253p));
    }

    @Override // u2.n0
    public int t(long j10) {
        if (c()) {
            return this.f17252o.o0(this.f17253p, j10);
        }
        return 0;
    }
}
