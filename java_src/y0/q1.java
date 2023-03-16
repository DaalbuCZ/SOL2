package y0;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import y0.a0;
import y0.c3;
import y0.k3;
import y0.n0;
import y0.y;
import y0.z1;
/* loaded from: classes.dex */
public class q1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f16641a;

    /* renamed from: c  reason: collision with root package name */
    private final y f16643c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f16644d;

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f16645e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f16646f;

    /* renamed from: g  reason: collision with root package name */
    private final String f16647g;

    /* renamed from: h  reason: collision with root package name */
    private final String f16648h;

    /* renamed from: i  reason: collision with root package name */
    private final s2 f16649i;

    /* renamed from: j  reason: collision with root package name */
    private final t f16650j;

    /* renamed from: k  reason: collision with root package name */
    private final j3<String> f16651k;

    /* renamed from: l  reason: collision with root package name */
    private final e0 f16652l;

    /* renamed from: m  reason: collision with root package name */
    private final s f16653m;

    /* renamed from: n  reason: collision with root package name */
    private final f2 f16654n;

    /* renamed from: o  reason: collision with root package name */
    private final z0 f16655o;

    /* renamed from: p  reason: collision with root package name */
    private p2 f16656p;

    /* renamed from: q  reason: collision with root package name */
    private volatile k3 f16657q;

    /* renamed from: r  reason: collision with root package name */
    private z1 f16658r;

    /* renamed from: v  reason: collision with root package name */
    private final List<Callable<?>> f16662v;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f16659s = false;

    /* renamed from: t  reason: collision with root package name */
    private volatile boolean f16660t = false;

    /* renamed from: u  reason: collision with root package name */
    private volatile boolean f16661u = false;

    /* renamed from: w  reason: collision with root package name */
    private long f16663w = 5242880;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicLong f16664x = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f16642b = Executors.newSingleThreadScheduledExecutor();

    /* loaded from: classes.dex */
    class a implements y.c {
        a() {
        }

        @Override // y0.y.c
        public void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
            q1 q1Var = q1.this;
            threadPoolExecutor.submit(q1Var.c(q1Var.A(n0.c.D, "bf_log_memory_pressure", "Bugfender received a memory warning. New incoming logs will be discarded until the logs pending to be processed are reduced.")));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements h2<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f16666a;

        b(q qVar) {
            this.f16666a = qVar;
        }

        @Override // y0.h2
        public void b(Throwable th) {
            i0.b("Bugfender-SDK", "Set device data \"" + this.f16666a.a() + "\"=\"" + this.f16666a.b() + "\" failed", th);
        }

        @Override // y0.h2
        /* renamed from: c */
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                q1.this.m(q1.this.c(new n0.b().h("bf_key_value").i("Set device data \"" + this.f16666a.a() + "\"=\"" + this.f16666a.b() + "\"").g("").d(new Date()).b(q1.this.f16664x.getAndIncrement()).c("").a(n0.c.D.e()).f(0).e()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q1.this.f16656p == null) {
                z2<String> g10 = q1.this.f16649i.g();
                q1.this.f16656p = p2.b(g10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements h2<k3> {
        d() {
        }

        @Override // y0.h2
        public void b(Throwable th) {
            if (th instanceof q0) {
                q1.this.l0();
            } else if (q1.this.f16657q == null) {
                q1.this.f16657q = k3.f16553d;
            }
        }

        @Override // y0.h2
        /* renamed from: c */
        public void a(k3 k3Var) {
            q1.this.f16657q = new k3.b(k3Var).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ z1 f16670n;

        e(z1 z1Var) {
            this.f16670n = z1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!q1.this.K(this.f16670n)) {
                q1.this.f16659s = false;
                i0.d("Bugfender-SDK", "Bugfender SDK initialization has failed.");
                return;
            }
            k3 e10 = q1.this.f16649i.e();
            q1.this.t(e10);
            q1.this.U(e10);
            q1.this.f16659s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q1.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends a0.b {

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ k3 f16673q;

        g(k3 k3Var) {
            this.f16673q = k3Var;
        }

        private void h(n2<?> n2Var) {
            if (n2Var.b() instanceof f1) {
                q1.this.f16657q = k3.f16553d;
            } else if (n2Var.b() instanceof k1) {
                throw new j2();
            }
        }

        @Override // y0.a0.b
        protected void d(long j10) {
            q1.this.f16646f.a();
            q1.this.f16646f.b(j10, new a0.a(this));
        }

        @Override // y0.a0.b
        public void e() {
            boolean z10 = true;
            boolean z11 = q1.this.f16657q != null && q1.this.f16657q.c();
            boolean a10 = q1.this.f16652l.a();
            if ((a10 && z11) || (a10 && q1.this.f16660t)) {
                h((n2) q1.this.h0().get());
                q1 q1Var = q1.this;
                h((n2) q1Var.H(q1Var.f16657q).get());
            }
            k3 k3Var = this.f16673q;
            if (k3Var == null || !k3Var.c()) {
                z10 = false;
            }
            if (a10) {
                if (q1.this.f16657q != null || z10) {
                    h((n2) q1.this.f0().get());
                    k3 k3Var2 = q1.this.f16657q != null ? q1.this.f16657q : this.f16673q;
                    if (k3Var2 != null) {
                        h((n2) q1.this.y(k3Var2).get());
                    }
                    h((n2) q1.this.c0().get());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q1.this.a0();
        }
    }

    public q1(String str, s2 s2Var, t tVar, f2 f2Var, j3<String> j3Var, e0 e0Var, s sVar, z0 z0Var, String str2) {
        this.f16647g = str;
        this.f16649i = s2Var;
        this.f16650j = tVar;
        this.f16651k = j3Var;
        this.f16652l = e0Var;
        this.f16653m = sVar;
        this.f16654n = f2Var;
        this.f16655o = z0Var;
        this.f16648h = str2;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
        this.f16644d = newFixedThreadPool;
        this.f16643c = new y((ThreadPoolExecutor) newFixedThreadPool, 5000, 20, new a());
        this.f16645e = Executors.newFixedThreadPool(1);
        this.f16646f = new a0();
        this.f16662v = new CopyOnWriteArrayList();
        this.f16641a = v0();
        k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0 A(n0.c cVar, String str, String str2) {
        Map<Integer, String> u02 = u0();
        Date date = new Date(System.currentTimeMillis());
        String name = Thread.currentThread().getName();
        return new n0.b().h(str).i(str2).g(u02.get(0)).d(date).b(this.f16664x.getAndIncrement()).c(u02.get(1)).a(cVar.e()).f(Integer.valueOf(u02.get(2)).intValue()).k(name).j(String.valueOf(Thread.currentThread().getId())).e();
    }

    private Future<Boolean> F() {
        return this.f16645e.submit(new l2(this.f16649i, this.f16650j, this.f16663w, this.f16664x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future<n2<Boolean>> H(k3 k3Var) {
        return this.f16645e.submit(new u1(this.f16654n, this.f16649i, this.f16647g, new i1(this.f16649i, this.f16654n, this.f16647g, this.f16653m, k3Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(z1 z1Var) {
        try {
            return x(z1Var).get().booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            i0.c(e10);
            return false;
        }
    }

    private long L(k3 k3Var) {
        int i10;
        int i11;
        if (k3Var == null || k3Var.c()) {
            i10 = 10;
            i11 = 70;
        } else {
            i10 = 30;
            i11 = 300;
        }
        return new Random().nextInt(i11 - i10) + i10;
    }

    private void O() {
        X();
        S();
    }

    private void S() {
        this.f16643c.b(new x2(this.f16649i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(k3 k3Var) {
        ScheduledExecutorService scheduledExecutorService = this.f16642b;
        f fVar = new f();
        long L = L(k3Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledExecutorService.scheduleWithFixedDelay(fVar, L, 300L, timeUnit);
        this.f16646f.b(a0.f16430b, new g(k3Var));
        this.f16642b.scheduleWithFixedDelay(new h(), 5L, 10L, timeUnit);
    }

    private void X() {
        this.f16643c.b(new b3(this.f16649i));
    }

    private StackTraceElement a(StackTraceElement[] stackTraceElementArr) {
        if (this.f16641a != null) {
            if (stackTraceElementArr.length > 4) {
                for (int i10 = 4; i10 < stackTraceElementArr.length; i10++) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i10];
                    if (!stackTraceElement.getClassName().startsWith(this.f16641a)) {
                        return stackTraceElement;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        if (this.f16662v.size() > 0) {
            y0();
        }
        O();
        F();
    }

    private UUID b(String str, String str2, String str3, String str4) {
        UUID a10 = u0.a(s0());
        d3 f10 = d3.a().d(a10).j(str).h(str2).l(str3).f();
        m(new b0(this.f16649i, new x1(this.f16649i), f10, this.f16654n, new t1(), this.f16664x, this.f16657q));
        o(n0.c.F, str4, a10.toString());
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Callable<Boolean> c(n0 n0Var) {
        return new b0(this.f16649i, new b2(this.f16649i), n0Var, this.f16654n, new e2(), this.f16664x, this.f16657q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future<n2<Boolean>> c0() {
        return this.f16645e.submit(new d1(this.f16654n, this.f16651k, r0()));
    }

    private z1 f(String str, long j10) {
        return new z1.a().i(j10).f(new l0(new g0(str), this.f16653m.a(), this.f16653m.h())).a(this.f16653m.i()).g(r0()).c(this.f16653m.o()).d(this.f16653m.m()).b(this.f16653m.d()).j(this.f16653m.r()).k(this.f16653m.f()).l(this.f16653m.g()).o(this.f16653m.n()).p(this.f16653m.l()).e(new Date()).n(p0.g(UUID.fromString(s0())).toString()).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future<n2<Boolean>> f0() {
        return this.f16645e.submit(new n1(this.f16649i, this.f16654n, this.f16647g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f16645e.submit(new q3(this.f16654n, r0(), this.f16651k, new d(), this.f16649i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future<n2<Boolean>> h0() {
        return this.f16645e.submit(new r1(this.f16649i, this.f16654n));
    }

    private void k(String str) {
        z1 f10 = f(str, System.currentTimeMillis());
        this.f16658r = f10;
        s(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        this.f16643c.c();
        this.f16645e.shutdown();
        this.f16642b.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Callable<?> callable) {
        if (this.f16659s) {
            if (this.f16662v.size() > 0) {
                y0();
            }
            this.f16643c.b(callable);
            return;
        }
        this.f16662v.add(callable);
        if (this.f16662v.size() > 500) {
            this.f16662v.clear();
        }
    }

    private void o(n0.c cVar, String str, String str2) {
        m(c(A(cVar, str, str2)));
    }

    private void o0() {
        this.f16657q = new k3.b(this.f16657q).b(true).c();
        if (this.f16659s) {
            O();
            h0();
            f0();
            y(this.f16657q);
        }
    }

    private c3 r0() {
        return new c3.b().n(this.f16653m.e()).i(this.f16653m.b(this.f16648h)).g(this.f16653m.s()).j(this.f16653m.r()).o(this.f16653m.a()).f(this.f16653m.h()).h(this.f16653m.m()).m(this.f16653m.l()).k(this.f16653m.g()).e(this.f16653m.q()).a(this.f16653m.c()).b(this.f16647g).l(String.valueOf(20230306)).c(this.f16653m.p()).d();
    }

    private void s(z1 z1Var) {
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ((ThreadPoolExecutor) this.f16645e).setRejectedExecutionHandler(discardPolicy);
        ((ThreadPoolExecutor) this.f16644d).setRejectedExecutionHandler(discardPolicy);
        this.f16642b.execute(new e(z1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(k3 k3Var) {
        if (k3Var != null) {
            try {
                if (20230306 < k3Var.a()) {
                    i0.a("Bugfender-SDK", "There's a new Bugfender SDK version. Please check bugfender.com.");
                }
                y(k3Var);
            } catch (InterruptedException | ExecutionException e10) {
                i0.c(e10);
            }
        }
        F().get();
        n(new q("$package_id", this.f16653m.j()));
        n(new q("$android_id", this.f16653m.k()));
    }

    private Map<Integer, String> u0() {
        StackTraceElement[] stackTrace;
        StackTraceElement a10;
        HashMap hashMap = new HashMap(3);
        hashMap.put(0, "");
        hashMap.put(1, "");
        hashMap.put(2, String.valueOf(0));
        if (!this.f16661u && ((a10 = a((stackTrace = Thread.currentThread().getStackTrace()))) != null || stackTrace.length >= 6)) {
            if (a10 == null) {
                a10 = stackTrace[6];
            }
            String fileName = a10.getFileName();
            hashMap.put(0, a10.getClassName() + "." + a10.getMethodName());
            hashMap.put(1, fileName);
            hashMap.put(2, String.valueOf(a10.getLineNumber()));
        }
        return hashMap;
    }

    private String v0() {
        if (getClass().getPackage() != null) {
            String[] split = getClass().getPackage().getName().split(Pattern.quote("."));
            if (split.length > 1) {
                return split[0] + "." + split[1];
            }
            return split[0];
        }
        return null;
    }

    private Future<Boolean> x(z1 z1Var) {
        return this.f16643c.b(new y2(this.f16649i, z1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Future<n2<Integer>> y(k3 k3Var) {
        return this.f16645e.submit(new i1(this.f16649i, this.f16654n, this.f16647g, this.f16653m, k3Var));
    }

    private void y0() {
        for (Callable<?> callable : this.f16662v) {
            this.f16643c.b(callable);
        }
        this.f16662v.clear();
    }

    public void B() {
        this.f16642b.submit(new c());
    }

    public void C(String str) {
        this.f16645e.submit(new o0(this.f16651k, this.f16654n, r0(), str));
    }

    public void D(String str, String str2) {
        o(n0.c.E, str, str2);
    }

    public void E(boolean z10) {
        this.f16660t = z10;
        if (z10 && this.f16652l.a()) {
            o0();
        }
    }

    public void I(String str, String str2) {
        o(n0.c.F, str, str2);
    }

    public void P(String str, String str2) {
        o(n0.c.I, str, str2);
    }

    public URL Q(String str, String str2) {
        return this.f16655o.c(b(str, str2, "crash", "bf_issue").toString());
    }

    public UUID V(String str, String str2) {
        return b(str, str2, null, "bf_issue");
    }

    public URL Y(String str, String str2) {
        return this.f16655o.c(V(str, str2).toString());
    }

    public UUID b0(String str, String str2) {
        return b(str, str2, "user-feedback", "bf_issue");
    }

    public URL e0(String str, String str2) {
        return this.f16655o.c(b0(str, str2).toString());
    }

    public void i(int i10, String str, String str2, n0.c cVar, String str3, String str4) {
        m(c(new n0.b().h(str3).i(str4).g(str).d(new Date()).b(this.f16664x.getAndIncrement()).c(str2).a(cVar.e()).f(i10).j(String.valueOf(Thread.currentThread().getId())).k(Thread.currentThread().getName()).e()));
    }

    public void j(long j10) {
        String str;
        if (j10 > 52428800) {
            this.f16663w = 52428800L;
            str = "Provided maximum local storage size is higher than 50 MB. Setting it to 50 MB.";
        } else if (j10 >= 1048576) {
            this.f16663w = j10;
            return;
        } else {
            this.f16663w = 1048576L;
            str = "Provided maximum local storage size is lower than 1 MB. Setting it to 1 MB.";
        }
        i0.f("Bugfender-SDK", str);
    }

    public void j0(String str, String str2) {
        o(n0.c.T, str, str2);
    }

    public void l(String str, String str2) {
        o(n0.c.D, str, str2);
    }

    public void m0(String str, String str2) {
        o(n0.c.W, str, str2);
    }

    public <T> void n(q<T> qVar) {
        this.f16645e.submit(new o2(this.f16651k, qVar, new b(qVar)));
    }

    public void p0() {
        if (this.f16652l.a()) {
            o0();
        }
    }

    public String s0() {
        return this.f16653m.e();
    }

    public URL t0() {
        return this.f16655o.a(s0());
    }

    public String w0() {
        z1 z1Var = this.f16658r;
        if (z1Var != null) {
            return z1Var.m();
        }
        return null;
    }

    public URL x0() {
        String w02 = w0();
        if (w02 != null) {
            return this.f16655o.d(w02);
        }
        return null;
    }
}
