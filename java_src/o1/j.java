package o1;
/* loaded from: classes.dex */
public final class j implements i1.b<e> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final j f11850a = new j();
    }

    public static j a() {
        return a.f11850a;
    }

    public static e c() {
        return (e) i1.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public e get() {
        return c();
    }
}
