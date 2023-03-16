package r9;

import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 {
    public static final t a(p1 p1Var) {
        return new s1(p1Var);
    }

    public static /* synthetic */ t b(p1 p1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p1Var = null;
        }
        return t1.a(p1Var);
    }

    public static final void c(b9.g gVar, CancellationException cancellationException) {
        p1 p1Var = (p1) gVar.c(p1.f13154l);
        if (p1Var != null) {
            p1Var.N(cancellationException);
        }
    }

    public static final void d(b9.g gVar) {
        p1 p1Var = (p1) gVar.c(p1.f13154l);
        if (p1Var != null) {
            t1.e(p1Var);
        }
    }

    public static final void e(p1 p1Var) {
        if (!p1Var.a()) {
            throw p1Var.G();
        }
    }
}
