package r9;
/* loaded from: classes.dex */
final class s0 extends RuntimeException {

    /* renamed from: n  reason: collision with root package name */
    private final b9.g f13160n;

    public s0(b9.g gVar) {
        this.f13160n = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f13160n.toString();
    }
}
