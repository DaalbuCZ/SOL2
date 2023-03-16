package q5;

import android.annotation.SuppressLint;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f12774a = u.c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Callable f12775n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ t4.j f12776o;

        /* renamed from: q5.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0182a implements t4.a<T, Void> {
            C0182a() {
            }

            @Override // t4.a
            /* renamed from: b */
            public Void a(t4.i<T> iVar) {
                if (iVar.p()) {
                    a.this.f12776o.c(iVar.l());
                    return null;
                }
                a.this.f12776o.b(iVar.k());
                return null;
            }
        }

        a(Callable callable, t4.j jVar) {
            this.f12775n = callable;
            this.f12776o = jVar;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"TaskMainThread"})
        public void run() {
            try {
                ((t4.i) this.f12775n.call()).i(new C0182a());
            } catch (Exception e10) {
                this.f12776o.b(e10);
            }
        }
    }

    public static <T> T d(t4.i<T> iVar) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.h(f12774a, new t4.a() { // from class: q5.g0
            @Override // t4.a
            public final Object a(t4.i iVar2) {
                Object countDown;
                countDown = countDownLatch.countDown();
                return countDown;
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (iVar.p()) {
            return iVar.l();
        }
        if (iVar.n()) {
            throw new CancellationException("Task is already canceled");
        }
        if (iVar.o()) {
            throw new IllegalStateException(iVar.k());
        }
        throw new TimeoutException();
    }

    public static boolean e(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> t4.i<T> f(Executor executor, Callable<t4.i<T>> callable) {
        t4.j jVar = new t4.j();
        executor.execute(new a(callable, jVar));
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void h(t4.j jVar, t4.i iVar) {
        if (iVar.p()) {
            jVar.e(iVar.l());
            return null;
        }
        Exception k10 = iVar.k();
        Objects.requireNonNull(k10);
        jVar.d(k10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void i(t4.j jVar, t4.i iVar) {
        if (iVar.p()) {
            jVar.e(iVar.l());
            return null;
        }
        Exception k10 = iVar.k();
        Objects.requireNonNull(k10);
        jVar.d(k10);
        return null;
    }

    public static <T> t4.i<T> j(Executor executor, t4.i<T> iVar, t4.i<T> iVar2) {
        final t4.j jVar = new t4.j();
        t4.a<T, TContinuationResult> aVar = new t4.a() { // from class: q5.h0
            @Override // t4.a
            public final Object a(t4.i iVar3) {
                Void i10;
                i10 = j0.i(t4.j.this, iVar3);
                return i10;
            }
        };
        iVar.h(executor, aVar);
        iVar2.h(executor, aVar);
        return jVar.a();
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> t4.i<T> k(t4.i<T> iVar, t4.i<T> iVar2) {
        final t4.j jVar = new t4.j();
        t4.a<T, TContinuationResult> aVar = new t4.a() { // from class: q5.i0
            @Override // t4.a
            public final Object a(t4.i iVar3) {
                Void h10;
                h10 = j0.h(t4.j.this, iVar3);
                return h10;
            }
        };
        iVar.i(aVar);
        iVar2.i(aVar);
        return jVar.a();
    }
}
