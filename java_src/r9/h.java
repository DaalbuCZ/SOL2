package r9;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static final p1 a(j0 j0Var, b9.g gVar, l0 l0Var, j9.p<? super j0, ? super b9.d<? super y8.s>, ? extends Object> pVar) {
        b9.g d10 = c0.d(j0Var, gVar);
        a y1Var = l0Var.h() ? new y1(d10, pVar) : new e2(d10, true);
        y1Var.G0(l0Var, y1Var, pVar);
        return y1Var;
    }

    public static /* synthetic */ p1 b(j0 j0Var, b9.g gVar, l0 l0Var, j9.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = b9.h.f2971n;
        }
        if ((i10 & 2) != 0) {
            l0Var = l0.DEFAULT;
        }
        return g.a(j0Var, gVar, l0Var, pVar);
    }
}
