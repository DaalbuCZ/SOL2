package y0;

import java.lang.Thread;
/* loaded from: classes.dex */
public class w1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: c  reason: collision with root package name */
    private static final Thread.UncaughtExceptionHandler f16750c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final p2 f16751a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f16752b;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    public w1(p2 p2Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16751a = p2Var;
        this.f16752b = uncaughtExceptionHandler == null ? f16750c : uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f16751a.d(q2.a(thread, th));
        this.f16752b.uncaughtException(thread, th);
    }
}
