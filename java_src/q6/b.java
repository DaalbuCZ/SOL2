package q6;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final q6.a f12896a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile q6.a f12897b;

    /* renamed from: q6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0185b implements q6.a {
        private C0185b() {
        }

        @Override // q6.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0185b c0185b = new C0185b();
        f12896a = c0185b;
        f12897b = c0185b;
    }

    public static q6.a a() {
        return f12897b;
    }
}
