package t0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import s0.p;
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    static final String f14452t = k0.j.f("WorkForegroundRunnable");

    /* renamed from: n  reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f14453n = androidx.work.impl.utils.futures.c.t();

    /* renamed from: o  reason: collision with root package name */
    final Context f14454o;

    /* renamed from: p  reason: collision with root package name */
    final p f14455p;

    /* renamed from: q  reason: collision with root package name */
    final ListenableWorker f14456q;

    /* renamed from: r  reason: collision with root package name */
    final k0.f f14457r;

    /* renamed from: s  reason: collision with root package name */
    final u0.a f14458s;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f14459n;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f14459n = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14459n.r(k.this.f14456q.c());
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f14461n;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f14461n = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k0.e eVar = (k0.e) this.f14461n.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", k.this.f14455p.f13233c));
                }
                k0.j.c().a(k.f14452t, String.format("Updating notification for %s", k.this.f14455p.f13233c), new Throwable[0]);
                k.this.f14456q.m(true);
                k kVar = k.this;
                kVar.f14453n.r(kVar.f14457r.a(kVar.f14454o, kVar.f14456q.f(), eVar));
            } catch (Throwable th) {
                k.this.f14453n.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public k(Context context, p pVar, ListenableWorker listenableWorker, k0.f fVar, u0.a aVar) {
        this.f14454o = context;
        this.f14455p = pVar;
        this.f14456q = listenableWorker;
        this.f14457r = fVar;
        this.f14458s = aVar;
    }

    public e5.a<Void> a() {
        return this.f14453n;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f14455p.f13247q || androidx.core.os.a.c()) {
            this.f14453n.p(null);
            return;
        }
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        this.f14458s.a().execute(new a(t10));
        t10.e(new b(t10), this.f14458s.a());
    }
}
