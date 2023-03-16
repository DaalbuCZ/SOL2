package t0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class n {

    /* renamed from: f  reason: collision with root package name */
    private static final String f14475f = k0.j.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f14476a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f14477b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f14478c;

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f14479d;

    /* renamed from: e  reason: collision with root package name */
    final Object f14480e;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f14481a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f14481a);
            this.f14481a = this.f14481a + 1;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final n f14483n;

        /* renamed from: o  reason: collision with root package name */
        private final String f14484o;

        c(n nVar, String str) {
            this.f14483n = nVar;
            this.f14484o = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f14483n.f14480e) {
                if (this.f14483n.f14478c.remove(this.f14484o) != null) {
                    b remove = this.f14483n.f14479d.remove(this.f14484o);
                    if (remove != null) {
                        remove.a(this.f14484o);
                    }
                } else {
                    k0.j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f14484o), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a();
        this.f14476a = aVar;
        this.f14478c = new HashMap();
        this.f14479d = new HashMap();
        this.f14480e = new Object();
        this.f14477b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f14477b.isShutdown()) {
            return;
        }
        this.f14477b.shutdownNow();
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f14480e) {
            k0.j.c().a(f14475f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f14478c.put(str, cVar);
            this.f14479d.put(str, bVar);
            this.f14477b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f14480e) {
            if (this.f14478c.remove(str) != null) {
                k0.j.c().a(f14475f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f14479d.remove(str);
            }
        }
    }
}
