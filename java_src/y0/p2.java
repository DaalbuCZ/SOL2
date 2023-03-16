package y0;

import java.lang.Thread;
/* loaded from: classes.dex */
public class p2 {

    /* renamed from: a  reason: collision with root package name */
    private final z2<String> f16638a;

    public p2(z2<String> z2Var) {
        w1 a10 = a(this, Thread.getDefaultUncaughtExceptionHandler());
        this.f16638a = z2Var;
        c(a10);
    }

    private static w1 a(p2 p2Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new w1(p2Var, uncaughtExceptionHandler);
    }

    public static p2 b(z2<String> z2Var) {
        return new p2(z2Var);
    }

    private static void c(w1 w1Var) {
        Thread.setDefaultUncaughtExceptionHandler(w1Var);
    }

    public void d(q2 q2Var) {
        this.f16638a.e(q2Var.b());
        this.f16638a.l();
    }
}
