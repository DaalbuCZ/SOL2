package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class l implements Executor {

    /* renamed from: n  reason: collision with root package name */
    private final Executor f2286n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayDeque<Runnable> f2287o = new ArrayDeque<>();

    /* renamed from: p  reason: collision with root package name */
    private Runnable f2288p;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Runnable f2289n;

        a(Runnable runnable) {
            this.f2289n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2289n.run();
            } finally {
                l.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Executor executor) {
        this.f2286n = executor;
    }

    synchronized void a() {
        Runnable poll = this.f2287o.poll();
        this.f2288p = poll;
        if (poll != null) {
            this.f2286n.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f2287o.offer(new a(runnable));
        if (this.f2288p == null) {
            a();
        }
    }
}
