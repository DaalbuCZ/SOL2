package r9;
/* loaded from: classes.dex */
public abstract class z1 extends d0 {
    public abstract z1 Y();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String Z() {
        z1 z1Var;
        z1 c10 = x0.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            z1Var = c10.Y();
        } catch (UnsupportedOperationException unused) {
            z1Var = null;
        }
        if (this == z1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // r9.d0
    public String toString() {
        String Z = Z();
        if (Z == null) {
            return o0.a(this) + '@' + o0.b(this);
        }
        return Z;
    }
}
