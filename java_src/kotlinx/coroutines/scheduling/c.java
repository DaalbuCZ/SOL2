package kotlinx.coroutines.scheduling;
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: v  reason: collision with root package name */
    public static final c f11010v = new c();

    private c() {
        super(l.f11022b, l.f11023c, l.f11024d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // r9.d0
    public String toString() {
        return "Dispatchers.Default";
    }
}
