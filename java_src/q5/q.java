package q5;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
class q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f12857a;

    /* renamed from: b  reason: collision with root package name */
    private final x5.i f12858b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f12859c;

    /* renamed from: d  reason: collision with root package name */
    private final n5.a f12860d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f12861e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    interface a {
        void a(x5.i iVar, Thread thread, Throwable th);
    }

    public q(a aVar, x5.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, n5.a aVar2) {
        this.f12857a = aVar;
        this.f12858b = iVar;
        this.f12859c = uncaughtExceptionHandler;
        this.f12860d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            n5.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            n5.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f12860d.b()) {
            n5.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f12861e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [n5.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [n5.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f12861e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f12857a.a(this.f12858b, thread, th);
                } else {
                    n5.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                n5.f.f().e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            n5.f.f().b(r02);
            this.f12859c.uncaughtException(thread, th);
            this.f12861e.set(false);
        }
    }
}
