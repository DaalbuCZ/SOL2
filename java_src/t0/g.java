package t0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class g implements Executor {

    /* renamed from: o  reason: collision with root package name */
    private final Executor f14438o;

    /* renamed from: q  reason: collision with root package name */
    private volatile Runnable f14440q;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<a> f14437n = new ArrayDeque<>();

    /* renamed from: p  reason: collision with root package name */
    private final Object f14439p = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final g f14441n;

        /* renamed from: o  reason: collision with root package name */
        final Runnable f14442o;

        a(g gVar, Runnable runnable) {
            this.f14441n = gVar;
            this.f14442o = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14442o.run();
            } finally {
                this.f14441n.b();
            }
        }
    }

    public g(Executor executor) {
        this.f14438o = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f14439p) {
            z10 = !this.f14437n.isEmpty();
        }
        return z10;
    }

    void b() {
        synchronized (this.f14439p) {
            a poll = this.f14437n.poll();
            this.f14440q = poll;
            if (poll != null) {
                this.f14438o.execute(this.f14440q);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f14439p) {
            this.f14437n.add(new a(this, runnable));
            if (this.f14440q == null) {
                b();
            }
        }
    }
}
