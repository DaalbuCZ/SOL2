package q5;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f12877b;

        /* renamed from: q5.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0184a extends c {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ Runnable f12878n;

            C0184a(Runnable runnable) {
                this.f12878n = runnable;
            }

            @Override // q5.c
            public void a() {
                this.f12878n.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f12876a = str;
            this.f12877b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0184a(runnable));
            newThread.setName(this.f12876a + this.f12877b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends c {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f12880n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ ExecutorService f12881o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f12882p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ TimeUnit f12883q;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f12880n = str;
            this.f12881o = executorService;
            this.f12882p = j10;
            this.f12883q = timeUnit;
        }

        @Override // q5.c
        public void a() {
            try {
                n5.f f10 = n5.f.f();
                f10.b("Executing shutdown hook for " + this.f12880n);
                this.f12881o.shutdown();
                if (this.f12881o.awaitTermination(this.f12882p, this.f12883q)) {
                    return;
                }
                n5.f f11 = n5.f.f();
                f11.b(this.f12880n + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f12881o.shutdownNow();
            } catch (InterruptedException unused) {
                n5.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f12880n));
                this.f12881o.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j10, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
