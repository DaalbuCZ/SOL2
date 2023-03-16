package r9;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class i1 {
    public static final d0 a(Executor executor) {
        d0 d0Var;
        w0 w0Var = executor instanceof w0 ? (w0) executor : null;
        return (w0Var == null || (d0Var = w0Var.f13174n) == null) ? new h1(executor) : d0Var;
    }
}
