package z6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import b7.c;
import b7.i;
import b7.m;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import t4.l;
/* loaded from: classes.dex */
public class k implements a.b {
    private static final u6.a E = u6.a.e();
    private static final k F = new k();
    private c.b A;
    private String B;
    private String C;

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, Integer> f17497n;

    /* renamed from: q  reason: collision with root package name */
    private f5.e f17500q;

    /* renamed from: r  reason: collision with root package name */
    private r6.e f17501r;

    /* renamed from: s  reason: collision with root package name */
    private j6.e f17502s;

    /* renamed from: t  reason: collision with root package name */
    private i6.b<e1.g> f17503t;

    /* renamed from: u  reason: collision with root package name */
    private b f17504u;

    /* renamed from: w  reason: collision with root package name */
    private Context f17506w;

    /* renamed from: x  reason: collision with root package name */
    private com.google.firebase.perf.config.a f17507x;

    /* renamed from: y  reason: collision with root package name */
    private d f17508y;

    /* renamed from: z  reason: collision with root package name */
    private com.google.firebase.perf.application.a f17509z;

    /* renamed from: o  reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f17498o = new ConcurrentLinkedQueue<>();

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f17499p = new AtomicBoolean(false);
    private boolean D = false;

    /* renamed from: v  reason: collision with root package name */
    private ExecutorService f17505v = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f17497n = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private b7.i D(i.b bVar, b7.d dVar) {
        G();
        c.b P = this.A.P(dVar);
        if (bVar.l() || bVar.s()) {
            P = P.clone().M(j());
        }
        return bVar.L(P).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Context l10 = this.f17500q.l();
        this.f17506w = l10;
        this.B = l10.getPackageName();
        this.f17507x = com.google.firebase.perf.config.a.g();
        this.f17508y = new d(this.f17506w, new a7.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f17509z = com.google.firebase.perf.application.a.b();
        this.f17504u = new b(this.f17503t, this.f17507x.a());
        h();
    }

    private void F(i.b bVar, b7.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                E.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f17498o.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        b7.i D = D(bVar, dVar);
        if (t(D)) {
            g(D);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    private void G() {
        if (this.f17507x.K()) {
            if (!this.A.L() || this.D) {
                String str = null;
                try {
                    str = (String) l.b(this.f17502s.a(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    E.d("Task to retrieve Installation Id is interrupted: %s", e10.getMessage());
                } catch (ExecutionException e11) {
                    E.d("Unable to retrieve Installation Id: %s", e11.getMessage());
                } catch (TimeoutException e12) {
                    E.d("Task to retrieve Installation Id is timed out: %s", e12.getMessage());
                }
                if (TextUtils.isEmpty(str)) {
                    E.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.A.O(str);
                }
            }
        }
    }

    private void H() {
        if (this.f17501r == null && u()) {
            this.f17501r = r6.e.c();
        }
    }

    private void g(b7.i iVar) {
        if (iVar.l()) {
            E.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.n()));
        } else {
            E.g("Logging %s", n(iVar));
        }
        this.f17504u.b(iVar);
    }

    private void h() {
        this.f17509z.k(new WeakReference<>(F));
        c.b f02 = b7.c.f0();
        this.A = f02;
        f02.Q(this.f17500q.q().c()).N(b7.a.Y().L(this.B).M(r6.a.f13067b).N(p(this.f17506w)));
        this.f17499p.set(true);
        while (!this.f17498o.isEmpty()) {
            final c poll = this.f17498o.poll();
            if (poll != null) {
                this.f17505v.execute(new Runnable() { // from class: z6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.v(poll);
                    }
                });
            }
        }
    }

    private String i(m mVar) {
        String p02 = mVar.p0();
        return p02.startsWith("_st_") ? u6.b.c(this.C, this.B, p02) : u6.b.a(this.C, this.B, p02);
    }

    private Map<String, String> j() {
        H();
        r6.e eVar = this.f17501r;
        return eVar != null ? eVar.b() : Collections.emptyMap();
    }

    public static k k() {
        return F;
    }

    private static String l(b7.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.e0()), Integer.valueOf(gVar.b0()), Integer.valueOf(gVar.a0()));
    }

    private static String m(b7.h hVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", hVar.v0(), hVar.y0() ? String.valueOf(hVar.m0()) : "UNKNOWN", new DecimalFormat("#.####").format((hVar.C0() ? hVar.t0() : 0L) / 1000.0d));
    }

    private static String n(b7.j jVar) {
        return jVar.l() ? o(jVar.n()) : jVar.s() ? m(jVar.t()) : jVar.c() ? l(jVar.h()) : "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", mVar.p0(), new DecimalFormat("#.####").format(mVar.m0() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(b7.i iVar) {
        com.google.firebase.perf.application.a aVar;
        a7.b bVar;
        if (iVar.l()) {
            aVar = this.f17509z;
            bVar = a7.b.TRACE_EVENT_RATE_LIMITED;
        } else if (!iVar.s()) {
            return;
        } else {
            aVar = this.f17509z;
            bVar = a7.b.NETWORK_TRACE_EVENT_RATE_LIMITED;
        }
        aVar.d(bVar.toString(), 1L);
    }

    private boolean s(b7.j jVar) {
        int intValue = this.f17497n.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f17497n.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f17497n.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (jVar.l() && intValue > 0) {
            this.f17497n.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (jVar.s() && intValue2 > 0) {
            this.f17497n.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!jVar.c() || intValue3 <= 0) {
            E.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        } else {
            this.f17497n.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    private boolean t(b7.i iVar) {
        if (!this.f17507x.K()) {
            E.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        } else if (!iVar.W().b0()) {
            E.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        } else if (!w6.e.b(iVar, this.f17506w)) {
            E.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        } else if (!this.f17508y.h(iVar)) {
            q(iVar);
            E.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        } else if (this.f17508y.g(iVar)) {
            q(iVar);
            E.g("Rate limited (per device) - %s", n(iVar));
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(c cVar) {
        F(cVar.f17464a, cVar.f17465b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(m mVar, b7.d dVar) {
        F(b7.i.Y().O(mVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(b7.h hVar, b7.d dVar) {
        F(b7.i.Y().N(hVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(b7.g gVar, b7.d dVar) {
        F(b7.i.Y().M(gVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f17508y.a(this.D);
    }

    public void A(final b7.g gVar, final b7.d dVar) {
        this.f17505v.execute(new Runnable() { // from class: z6.g
            @Override // java.lang.Runnable
            public final void run() {
                k.this.y(gVar, dVar);
            }
        });
    }

    public void B(final b7.h hVar, final b7.d dVar) {
        this.f17505v.execute(new Runnable() { // from class: z6.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.x(hVar, dVar);
            }
        });
    }

    public void C(final m mVar, final b7.d dVar) {
        this.f17505v.execute(new Runnable() { // from class: z6.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.w(mVar, dVar);
            }
        });
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(b7.d dVar) {
        this.D = dVar == b7.d.FOREGROUND;
        if (u()) {
            this.f17505v.execute(new Runnable() { // from class: z6.f
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.z();
                }
            });
        }
    }

    public void r(f5.e eVar, j6.e eVar2, i6.b<e1.g> bVar) {
        this.f17500q = eVar;
        this.C = eVar.q().g();
        this.f17502s = eVar2;
        this.f17503t = bVar;
        this.f17505v.execute(new Runnable() { // from class: z6.e
            @Override // java.lang.Runnable
            public final void run() {
                k.this.E();
            }
        });
    }

    public boolean u() {
        return this.f17499p.get();
    }
}
