package r9;
/* loaded from: classes.dex */
public final class g0 {
    public static final void a(b9.g gVar, Throwable th) {
        try {
            e0 e0Var = (e0) gVar.c(e0.f13108k);
            if (e0Var != null) {
                e0Var.D(gVar, th);
            } else {
                f0.a(gVar, th);
            }
        } catch (Throwable th2) {
            f0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        y8.b.a(runtimeException, th);
        return runtimeException;
    }
}
