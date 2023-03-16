package l0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k0.s;
import s0.p;
import s0.q;
import s0.t;
import t0.k;
import t0.l;
import t0.m;
/* loaded from: classes.dex */
public class j implements Runnable {
    static final String G = k0.j.f("WorkerWrapper");
    private t A;
    private List<String> B;
    private String C;
    private volatile boolean F;

    /* renamed from: n  reason: collision with root package name */
    Context f11078n;

    /* renamed from: o  reason: collision with root package name */
    private String f11079o;

    /* renamed from: p  reason: collision with root package name */
    private List<e> f11080p;

    /* renamed from: q  reason: collision with root package name */
    private WorkerParameters.a f11081q;

    /* renamed from: r  reason: collision with root package name */
    p f11082r;

    /* renamed from: s  reason: collision with root package name */
    ListenableWorker f11083s;

    /* renamed from: t  reason: collision with root package name */
    u0.a f11084t;

    /* renamed from: v  reason: collision with root package name */
    private androidx.work.a f11086v;

    /* renamed from: w  reason: collision with root package name */
    private r0.a f11087w;

    /* renamed from: x  reason: collision with root package name */
    private WorkDatabase f11088x;

    /* renamed from: y  reason: collision with root package name */
    private q f11089y;

    /* renamed from: z  reason: collision with root package name */
    private s0.b f11090z;

    /* renamed from: u  reason: collision with root package name */
    ListenableWorker.a f11085u = ListenableWorker.a.a();
    androidx.work.impl.utils.futures.c<Boolean> D = androidx.work.impl.utils.futures.c.t();
    e5.a<ListenableWorker.a> E = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ e5.a f11091n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f11092o;

        a(e5.a aVar, androidx.work.impl.utils.futures.c cVar) {
            this.f11091n = aVar;
            this.f11092o = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11091n.get();
                k0.j.c().a(j.G, String.format("Starting work for %s", j.this.f11082r.f13233c), new Throwable[0]);
                j jVar = j.this;
                jVar.E = jVar.f11083s.o();
                this.f11092o.r(j.this.E);
            } catch (Throwable th) {
                this.f11092o.q(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f11094n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f11095o;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f11094n = cVar;
            this.f11095o = str;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f11094n.get();
                    if (aVar == null) {
                        k0.j.c().b(j.G, String.format("%s returned a null result. Treating it as a failure.", j.this.f11082r.f13233c), new Throwable[0]);
                    } else {
                        k0.j.c().a(j.G, String.format("%s returned a %s result.", j.this.f11082r.f13233c, aVar), new Throwable[0]);
                        j.this.f11085u = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    k0.j.c().b(j.G, String.format("%s failed because it threw an exception/error", this.f11095o), e);
                } catch (CancellationException e11) {
                    k0.j.c().d(j.G, String.format("%s was cancelled", this.f11095o), e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    k0.j.c().b(j.G, String.format("%s failed because it threw an exception/error", this.f11095o), e);
                }
            } finally {
                j.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f11097a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f11098b;

        /* renamed from: c  reason: collision with root package name */
        r0.a f11099c;

        /* renamed from: d  reason: collision with root package name */
        u0.a f11100d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.a f11101e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f11102f;

        /* renamed from: g  reason: collision with root package name */
        String f11103g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f11104h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f11105i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, u0.a aVar2, r0.a aVar3, WorkDatabase workDatabase, String str) {
            this.f11097a = context.getApplicationContext();
            this.f11100d = aVar2;
            this.f11099c = aVar3;
            this.f11101e = aVar;
            this.f11102f = workDatabase;
            this.f11103g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f11105i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f11104h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f11078n = cVar.f11097a;
        this.f11084t = cVar.f11100d;
        this.f11087w = cVar.f11099c;
        this.f11079o = cVar.f11103g;
        this.f11080p = cVar.f11104h;
        this.f11081q = cVar.f11105i;
        this.f11083s = cVar.f11098b;
        this.f11086v = cVar.f11101e;
        WorkDatabase workDatabase = cVar.f11102f;
        this.f11088x = workDatabase;
        this.f11089y = workDatabase.B();
        this.f11090z = this.f11088x.t();
        this.A = this.f11088x.C();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f11079o);
        sb.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            k0.j.c().d(G, String.format("Worker result SUCCESS for %s", this.C), new Throwable[0]);
            if (!this.f11082r.d()) {
                m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            k0.j.c().d(G, String.format("Worker result RETRY for %s", this.C), new Throwable[0]);
            g();
            return;
        } else {
            k0.j.c().d(G, String.format("Worker result FAILURE for %s", this.C), new Throwable[0]);
            if (!this.f11082r.d()) {
                l();
                return;
            }
        }
        h();
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f11089y.j(str2) != s.CANCELLED) {
                this.f11089y.c(s.FAILED, str2);
            }
            linkedList.addAll(this.f11090z.c(str2));
        }
    }

    private void g() {
        this.f11088x.c();
        try {
            this.f11089y.c(s.ENQUEUED, this.f11079o);
            this.f11089y.q(this.f11079o, System.currentTimeMillis());
            this.f11089y.f(this.f11079o, -1L);
            this.f11088x.r();
        } finally {
            this.f11088x.g();
            i(true);
        }
    }

    private void h() {
        this.f11088x.c();
        try {
            this.f11089y.q(this.f11079o, System.currentTimeMillis());
            this.f11089y.c(s.ENQUEUED, this.f11079o);
            this.f11089y.m(this.f11079o);
            this.f11089y.f(this.f11079o, -1L);
            this.f11088x.r();
        } finally {
            this.f11088x.g();
            i(false);
        }
    }

    private void i(boolean z10) {
        ListenableWorker listenableWorker;
        this.f11088x.c();
        try {
            if (!this.f11088x.B().e()) {
                t0.d.a(this.f11078n, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f11089y.c(s.ENQUEUED, this.f11079o);
                this.f11089y.f(this.f11079o, -1L);
            }
            if (this.f11082r != null && (listenableWorker = this.f11083s) != null && listenableWorker.i()) {
                this.f11087w.c(this.f11079o);
            }
            this.f11088x.r();
            this.f11088x.g();
            this.D.p(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f11088x.g();
            throw th;
        }
    }

    private void j() {
        s j10 = this.f11089y.j(this.f11079o);
        if (j10 == s.RUNNING) {
            k0.j.c().a(G, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f11079o), new Throwable[0]);
            i(true);
            return;
        }
        k0.j.c().a(G, String.format("Status for %s is %s; not doing any work", this.f11079o, j10), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.b b10;
        if (n()) {
            return;
        }
        this.f11088x.c();
        try {
            p l10 = this.f11089y.l(this.f11079o);
            this.f11082r = l10;
            if (l10 == null) {
                k0.j.c().b(G, String.format("Didn't find WorkSpec for id %s", this.f11079o), new Throwable[0]);
                i(false);
                this.f11088x.r();
            } else if (l10.f13232b != s.ENQUEUED) {
                j();
                this.f11088x.r();
                k0.j.c().a(G, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f11082r.f13233c), new Throwable[0]);
            } else {
                if (l10.d() || this.f11082r.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p pVar = this.f11082r;
                    if (!(pVar.f13244n == 0) && currentTimeMillis < pVar.a()) {
                        k0.j.c().a(G, String.format("Delaying execution for %s because it is being executed before schedule.", this.f11082r.f13233c), new Throwable[0]);
                        i(true);
                        this.f11088x.r();
                        return;
                    }
                }
                this.f11088x.r();
                this.f11088x.g();
                if (this.f11082r.d()) {
                    b10 = this.f11082r.f13235e;
                } else {
                    k0.h b11 = this.f11086v.f().b(this.f11082r.f13234d);
                    if (b11 == null) {
                        k0.j.c().b(G, String.format("Could not create Input Merger %s", this.f11082r.f13234d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f11082r.f13235e);
                    arrayList.addAll(this.f11089y.o(this.f11079o));
                    b10 = b11.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f11079o), b10, this.B, this.f11081q, this.f11082r.f13241k, this.f11086v.e(), this.f11084t, this.f11086v.m(), new m(this.f11088x, this.f11084t), new l(this.f11088x, this.f11087w, this.f11084t));
                if (this.f11083s == null) {
                    this.f11083s = this.f11086v.m().b(this.f11078n, this.f11082r.f13233c, workerParameters);
                }
                ListenableWorker listenableWorker = this.f11083s;
                if (listenableWorker == null) {
                    k0.j.c().b(G, String.format("Could not create Worker %s", this.f11082r.f13233c), new Throwable[0]);
                    l();
                } else if (listenableWorker.k()) {
                    k0.j.c().b(G, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f11082r.f13233c), new Throwable[0]);
                    l();
                } else {
                    this.f11083s.n();
                    if (!o()) {
                        j();
                    } else if (n()) {
                    } else {
                        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
                        k kVar = new k(this.f11078n, this.f11082r, this.f11083s, workerParameters.b(), this.f11084t);
                        this.f11084t.a().execute(kVar);
                        e5.a<Void> a10 = kVar.a();
                        a10.e(new a(a10, t10), this.f11084t.a());
                        t10.e(new b(t10, this.C), this.f11084t.c());
                    }
                }
            }
        } finally {
            this.f11088x.g();
        }
    }

    private void m() {
        this.f11088x.c();
        try {
            this.f11089y.c(s.SUCCEEDED, this.f11079o);
            this.f11089y.t(this.f11079o, ((ListenableWorker.a.c) this.f11085u).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f11090z.c(this.f11079o)) {
                if (this.f11089y.j(str) == s.BLOCKED && this.f11090z.a(str)) {
                    k0.j.c().d(G, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f11089y.c(s.ENQUEUED, str);
                    this.f11089y.q(str, currentTimeMillis);
                }
            }
            this.f11088x.r();
        } finally {
            this.f11088x.g();
            i(false);
        }
    }

    private boolean n() {
        if (this.F) {
            k0.j.c().a(G, String.format("Work interrupted for %s", this.C), new Throwable[0]);
            s j10 = this.f11089y.j(this.f11079o);
            if (j10 == null) {
                i(false);
            } else {
                i(!j10.e());
            }
            return true;
        }
        return false;
    }

    private boolean o() {
        this.f11088x.c();
        try {
            boolean z10 = true;
            if (this.f11089y.j(this.f11079o) == s.ENQUEUED) {
                this.f11089y.c(s.RUNNING, this.f11079o);
                this.f11089y.p(this.f11079o);
            } else {
                z10 = false;
            }
            this.f11088x.r();
            return z10;
        } finally {
            this.f11088x.g();
        }
    }

    public e5.a<Boolean> b() {
        return this.D;
    }

    public void d() {
        boolean z10;
        this.F = true;
        n();
        e5.a<ListenableWorker.a> aVar = this.E;
        if (aVar != null) {
            z10 = aVar.isDone();
            this.E.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = this.f11083s;
        if (listenableWorker == null || z10) {
            k0.j.c().a(G, String.format("WorkSpec %s is already done. Not interrupting.", this.f11082r), new Throwable[0]);
        } else {
            listenableWorker.p();
        }
    }

    void f() {
        if (!n()) {
            this.f11088x.c();
            try {
                s j10 = this.f11089y.j(this.f11079o);
                this.f11088x.A().a(this.f11079o);
                if (j10 == null) {
                    i(false);
                } else if (j10 == s.RUNNING) {
                    c(this.f11085u);
                } else if (!j10.e()) {
                    g();
                }
                this.f11088x.r();
            } finally {
                this.f11088x.g();
            }
        }
        List<e> list = this.f11080p;
        if (list != null) {
            for (e eVar : list) {
                eVar.a(this.f11079o);
            }
            f.b(this.f11086v, this.f11088x, this.f11080p);
        }
    }

    void l() {
        this.f11088x.c();
        try {
            e(this.f11079o);
            this.f11089y.t(this.f11079o, ((ListenableWorker.a.C0048a) this.f11085u).e());
            this.f11088x.r();
        } finally {
            this.f11088x.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> b10 = this.A.b(this.f11079o);
        this.B = b10;
        this.C = a(b10);
        k();
    }
}
