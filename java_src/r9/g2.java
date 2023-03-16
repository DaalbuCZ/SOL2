package r9;
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    public static final g2 f13116a = new g2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<a1> f13117b = new ThreadLocal<>();

    private g2() {
    }

    public final a1 a() {
        ThreadLocal<a1> threadLocal = f13117b;
        a1 a1Var = threadLocal.get();
        if (a1Var == null) {
            a1 a10 = d1.a();
            threadLocal.set(a10);
            return a10;
        }
        return a1Var;
    }

    public final void b() {
        f13117b.set(null);
    }

    public final void c(a1 a1Var) {
        f13117b.set(a1Var);
    }
}
