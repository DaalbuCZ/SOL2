package q1;
/* loaded from: classes.dex */
public final class d implements i1.b<q1.a> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final d f12539a = new d();
    }

    public static d a() {
        return a.f12539a;
    }

    public static q1.a c() {
        return (q1.a) i1.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public q1.a get() {
        return c();
    }
}
