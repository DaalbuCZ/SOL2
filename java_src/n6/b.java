package n6;
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f11762a;

    private b() {
    }

    public static b b() {
        if (f11762a == null) {
            f11762a = new b();
        }
        return f11762a;
    }

    @Override // n6.a
    public long a() {
        return System.currentTimeMillis();
    }
}
