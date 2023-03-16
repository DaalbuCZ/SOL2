package y0;
/* loaded from: classes.dex */
public final class m2 implements m0<j2> {
    @Override // y0.m0
    /* renamed from: a */
    public v0 of(j2 j2Var) {
        try {
            int a10 = j2Var.a();
            return a10 != -1007 ? a10 != -1004 ? new k1(j2Var) : new q0(j2Var.getMessage()) : new f1(j2Var.getMessage());
        } catch (Exception e10) {
            return new o1(e10);
        }
    }
}
