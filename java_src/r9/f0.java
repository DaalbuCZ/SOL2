package r9;

import java.util.List;
import java.util.ServiceLoader;
import y8.m;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<e0> f13113a;

    static {
        p9.b a10;
        List<e0> f10;
        a10 = p9.f.a(ServiceLoader.load(e0.class, e0.class.getClassLoader()).iterator());
        f10 = p9.h.f(a10);
        f13113a = f10;
    }

    public static final void a(b9.g gVar, Throwable th) {
        for (e0 e0Var : f13113a) {
            try {
                e0Var.D(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, g0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            m.a aVar = y8.m.f17093n;
            y8.b.a(th, new s0(gVar));
            y8.m.a(y8.s.f17099a);
        } catch (Throwable th3) {
            m.a aVar2 = y8.m.f17093n;
            y8.m.a(y8.n.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
