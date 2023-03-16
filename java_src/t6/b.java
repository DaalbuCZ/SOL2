package t6;
/* loaded from: classes.dex */
public final class b implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14788a;

    public b(a aVar) {
        this.f14788a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) r7.b.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public com.google.firebase.perf.config.a get() {
        return c(this.f14788a);
    }
}
