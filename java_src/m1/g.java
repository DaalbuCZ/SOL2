package m1;
/* loaded from: classes.dex */
public final class g implements i1.b<n1.g> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<q1.a> f11322a;

    public g(x8.a<q1.a> aVar) {
        this.f11322a = aVar;
    }

    public static n1.g a(q1.a aVar) {
        return (n1.g) i1.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(x8.a<q1.a> aVar) {
        return new g(aVar);
    }

    @Override // x8.a
    /* renamed from: c */
    public n1.g get() {
        return a(this.f11322a.get());
    }
}
