package k9;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static final t f10901a;

    /* renamed from: b  reason: collision with root package name */
    private static final o9.b[] f10902b;

    static {
        t tVar = null;
        try {
            tVar = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tVar == null) {
            tVar = new t();
        }
        f10901a = tVar;
        f10902b = new o9.b[0];
    }

    public static o9.d a(i iVar) {
        return f10901a.a(iVar);
    }

    public static o9.b b(Class cls) {
        return f10901a.b(cls);
    }

    public static o9.c c(Class cls) {
        return f10901a.c(cls, "");
    }

    public static o9.e d(n nVar) {
        return f10901a.d(nVar);
    }

    public static String e(h hVar) {
        return f10901a.e(hVar);
    }

    public static String f(l lVar) {
        return f10901a.f(lVar);
    }
}
