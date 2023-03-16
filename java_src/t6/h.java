package t6;
/* loaded from: classes.dex */
public final class h implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14794a;

    public h(a aVar) {
        this.f14794a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static i6.b<e1.g> c(a aVar) {
        return (i6.b) r7.b.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public i6.b<e1.g> get() {
        return c(this.f14794a);
    }
}
