package r9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class h1 extends g1 implements r0 {

    /* renamed from: q  reason: collision with root package name */
    private final Executor f13120q;

    public h1(Executor executor) {
        this.f13120q = executor;
        kotlinx.coroutines.internal.e.a(Z());
    }

    private final void Y(b9.g gVar, RejectedExecutionException rejectedExecutionException) {
        t1.c(gVar, f1.a("The task was rejected", rejectedExecutionException));
    }

    public Executor Z() {
        return this.f13120q;
    }

    @Override // r9.d0
    public void b(b9.g gVar, Runnable runnable) {
        try {
            Executor Z = Z();
            c.a();
            Z.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            Y(gVar, e10);
            x0.b().b(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor Z = Z();
        ExecutorService executorService = Z instanceof ExecutorService ? (ExecutorService) Z : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof h1) && ((h1) obj).Z() == Z();
    }

    public int hashCode() {
        return System.identityHashCode(Z());
    }

    @Override // r9.d0
    public String toString() {
        return Z().toString();
    }
}
