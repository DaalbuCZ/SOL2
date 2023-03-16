package t6;
/* loaded from: classes.dex */
public final class c implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14789a;

    public c(a aVar) {
        this.f14789a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static f5.e c(a aVar) {
        return (f5.e) r7.b.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public f5.e get() {
        return c(this.f14789a);
    }
}
