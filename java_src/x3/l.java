package x3;
/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: n  reason: collision with root package name */
    private final w3.d f16334n;

    public l(w3.d dVar) {
        this.f16334n = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f16334n));
    }
}
