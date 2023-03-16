package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
class h {

    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f1500a;

        /* renamed from: b  reason: collision with root package name */
        private int f1501b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0027a extends Thread {

            /* renamed from: n  reason: collision with root package name */
            private final int f1502n;

            C0027a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f1502n = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f1502n);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f1500a = str;
            this.f1501b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0027a(runnable, this.f1500a, this.f1501b);
        }
    }

    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private Callable<T> f1503n;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.util.a<T> f1504o;

        /* renamed from: p  reason: collision with root package name */
        private Handler f1505p;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f1506n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ Object f1507o;

            a(androidx.core.util.a aVar, Object obj) {
                this.f1506n = aVar;
                this.f1507o = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f1506n.accept(this.f1507o);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f1503n = callable;
            this.f1504o = aVar;
            this.f1505p = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f1503n.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f1505p.post(new a(this.f1504o, t10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
