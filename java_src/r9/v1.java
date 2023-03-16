package r9;
/* loaded from: classes.dex */
public abstract class v1 extends x implements y0, k1 {

    /* renamed from: q  reason: collision with root package name */
    public w1 f13171q;

    public final w1 D() {
        w1 w1Var = this.f13171q;
        if (w1Var != null) {
            return w1Var;
        }
        k9.k.o("job");
        return null;
    }

    public final void E(w1 w1Var) {
        this.f13171q = w1Var;
    }

    @Override // r9.k1
    public boolean a() {
        return true;
    }

    @Override // r9.y0
    public void e() {
        D().r0(this);
    }

    @Override // r9.k1
    public a2 i() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.r
    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + "[job@" + o0.b(D()) + ']';
    }
}
