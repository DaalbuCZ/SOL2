package t6;
/* loaded from: classes.dex */
public final class d implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14790a;

    public d(a aVar) {
        this.f14790a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static j6.e c(a aVar) {
        return (j6.e) r7.b.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public j6.e get() {
        return c(this.f14790a);
    }
}
