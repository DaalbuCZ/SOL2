package o1;
/* loaded from: classes.dex */
public final class g implements i1.b<String> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final g f11844a = new g();
    }

    public static g a() {
        return a.f11844a;
    }

    public static String b() {
        return (String) i1.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: c */
    public String get() {
        return b();
    }
}
