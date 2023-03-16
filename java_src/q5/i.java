package q5;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12762a;

    /* renamed from: b  reason: collision with root package name */
    private t4.i<Void> f12763b = t4.l.e(null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f12764c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Boolean> f12765d = new ThreadLocal<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f12765d.set(Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f12767a;

        b(Runnable runnable) {
            this.f12767a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f12767a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements t4.a<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callable f12769a;

        c(Callable callable) {
            this.f12769a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // t4.a
        public T a(t4.i<Void> iVar) {
            return this.f12769a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements t4.a<T, Void> {
        d() {
        }

        @Override // t4.a
        /* renamed from: b */
        public Void a(t4.i<T> iVar) {
            return null;
        }
    }

    public i(Executor executor) {
        this.f12762a = executor;
        executor.execute(new a());
    }

    private <T> t4.i<Void> d(t4.i<T> iVar) {
        return iVar.h(this.f12762a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f12765d.get());
    }

    private <T> t4.a<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f12762a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> t4.i<T> h(Callable<T> callable) {
        t4.i<T> h10;
        synchronized (this.f12764c) {
            h10 = this.f12763b.h(this.f12762a, f(callable));
            this.f12763b = d(h10);
        }
        return h10;
    }

    public <T> t4.i<T> i(Callable<t4.i<T>> callable) {
        t4.i<T> j10;
        synchronized (this.f12764c) {
            j10 = this.f12763b.j(this.f12762a, f(callable));
            this.f12763b = d(j10);
        }
        return j10;
    }
}
