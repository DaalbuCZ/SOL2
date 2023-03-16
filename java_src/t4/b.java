package t4;
/* loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i<?> iVar) {
        if (iVar.o()) {
            Exception k10 = iVar.k();
            return new b("Complete with: ".concat(k10 != null ? "failure" : iVar.p() ? "result ".concat(String.valueOf(iVar.l())) : iVar.n() ? "cancellation" : "unknown issue"), k10);
        }
        return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
}
