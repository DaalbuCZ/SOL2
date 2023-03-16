package q1;
/* loaded from: classes.dex */
public final class c implements i1.b<q1.a> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f12538a = new c();
    }

    public static c a() {
        return a.f12538a;
    }

    public static q1.a b() {
        return (q1.a) i1.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: c */
    public q1.a get() {
        return b();
    }
}
