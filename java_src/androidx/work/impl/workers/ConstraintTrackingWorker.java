package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import k0.j;
import l0.i;
import o0.c;
import o0.d;
import s0.p;
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: x  reason: collision with root package name */
    private static final String f2699x = j.f("ConstraintTrkngWrkr");

    /* renamed from: s  reason: collision with root package name */
    private WorkerParameters f2700s;

    /* renamed from: t  reason: collision with root package name */
    final Object f2701t;

    /* renamed from: u  reason: collision with root package name */
    volatile boolean f2702u;

    /* renamed from: v  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<ListenableWorker.a> f2703v;

    /* renamed from: w  reason: collision with root package name */
    private ListenableWorker f2704w;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ e5.a f2706n;

        b(e5.a aVar) {
            this.f2706n = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f2701t) {
                if (ConstraintTrackingWorker.this.f2702u) {
                    ConstraintTrackingWorker.this.t();
                } else {
                    ConstraintTrackingWorker.this.f2703v.r(this.f2706n);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2700s = workerParameters;
        this.f2701t = new Object();
        this.f2702u = false;
        this.f2703v = androidx.work.impl.utils.futures.c.t();
    }

    @Override // o0.c
    public void d(List<String> list) {
        j.c().a(f2699x, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f2701t) {
            this.f2702u = true;
        }
    }

    @Override // o0.c
    public void e(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public boolean i() {
        ListenableWorker listenableWorker = this.f2704w;
        return listenableWorker != null && listenableWorker.i();
    }

    @Override // androidx.work.ListenableWorker
    public void l() {
        super.l();
        ListenableWorker listenableWorker = this.f2704w;
        if (listenableWorker == null || listenableWorker.j()) {
            return;
        }
        this.f2704w.p();
    }

    @Override // androidx.work.ListenableWorker
    public e5.a<ListenableWorker.a> o() {
        b().execute(new a());
        return this.f2703v;
    }

    public u0.a q() {
        return i.k(a()).p();
    }

    public WorkDatabase r() {
        return i.k(a()).o();
    }

    void s() {
        this.f2703v.p(ListenableWorker.a.a());
    }

    void t() {
        this.f2703v.p(ListenableWorker.a.b());
    }

    void u() {
        String l10 = g().l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(l10)) {
            j.c().b(f2699x, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b10 = h().b(a(), l10, this.f2700s);
            this.f2704w = b10;
            if (b10 != null) {
                p l11 = r().B().l(f().toString());
                if (l11 == null) {
                    s();
                    return;
                }
                d dVar = new d(a(), q(), this);
                dVar.d(Collections.singletonList(l11));
                if (!dVar.c(f().toString())) {
                    j.c().a(f2699x, String.format("Constraints not met for delegate %s. Requesting retry.", l10), new Throwable[0]);
                    t();
                    return;
                }
                j.c().a(f2699x, String.format("Constraints met for delegate %s", l10), new Throwable[0]);
                try {
                    e5.a<ListenableWorker.a> o10 = this.f2704w.o();
                    o10.e(new b(o10), b());
                    return;
                } catch (Throwable th) {
                    j c10 = j.c();
                    String str = f2699x;
                    c10.a(str, String.format("Delegated worker %s threw exception in startWork.", l10), th);
                    synchronized (this.f2701t) {
                        if (this.f2702u) {
                            j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            t();
                        } else {
                            s();
                        }
                        return;
                    }
                }
            }
            j.c().a(f2699x, "No worker to delegate to.", new Throwable[0]);
        }
        s();
    }
}
