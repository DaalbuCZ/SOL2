package r9;
/* loaded from: classes.dex */
public class s1 extends w1 implements t {

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13161o;

    public s1(p1 p1Var) {
        super(true);
        c0(p1Var);
        this.f13161o = D0();
    }

    private final boolean D0() {
        w1 D;
        q Y = Y();
        r rVar = Y instanceof r ? (r) Y : null;
        if (rVar != null && (D = rVar.D()) != null) {
            while (!D.V()) {
                q Y2 = D.Y();
                r rVar2 = Y2 instanceof r ? (r) Y2 : null;
                if (rVar2 != null) {
                    D = rVar2.D();
                    if (D == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // r9.w1
    public boolean V() {
        return this.f13161o;
    }

    @Override // r9.w1
    public boolean W() {
        return true;
    }
}
