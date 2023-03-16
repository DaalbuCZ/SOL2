package s1;

import s1.l3;
/* loaded from: classes.dex */
public abstract class e implements p2 {

    /* renamed from: a  reason: collision with root package name */
    protected final l3.d f13358a = new l3.d();

    private int N() {
        int D = D();
        if (D == 1) {
            return 0;
        }
        return D;
    }

    @Override // s1.p2
    public final boolean B() {
        l3 F = F();
        return !F.u() && F.r(w(), this.f13358a).f13561v;
    }

    @Override // s1.p2
    public final void H(long j10) {
        n(w(), j10);
    }

    @Override // s1.p2
    public final boolean J() {
        l3 F = F();
        return !F.u() && F.r(w(), this.f13358a).g();
    }

    public final long K() {
        l3 F = F();
        if (F.u()) {
            return -9223372036854775807L;
        }
        return F.r(w(), this.f13358a).f();
    }

    public final int L() {
        l3 F = F();
        if (F.u()) {
            return -1;
        }
        return F.i(w(), N(), G());
    }

    public final int M() {
        l3 F = F();
        if (F.u()) {
            return -1;
        }
        return F.p(w(), N(), G());
    }

    @Override // s1.p2
    public final boolean q() {
        l3 F = F();
        return !F.u() && F.r(w(), this.f13358a).f13560u;
    }

    @Override // s1.p2
    public final boolean t() {
        return L() != -1;
    }

    @Override // s1.p2
    public final boolean y() {
        return M() != -1;
    }
}
