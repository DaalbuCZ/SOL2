package d9;
/* loaded from: classes.dex */
public final class c implements b9.d<Object> {

    /* renamed from: n  reason: collision with root package name */
    public static final c f6613n = new c();

    private c() {
    }

    @Override // b9.d
    public b9.g b() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // b9.d
    public void l(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
