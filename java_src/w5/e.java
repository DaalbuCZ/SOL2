package w5;

import android.annotation.SuppressLint;
import android.database.SQLException;
import e1.f;
import e1.h;
import g1.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q5.j0;
import q5.p;
import s5.b0;
import t4.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final double f16130a;

    /* renamed from: b  reason: collision with root package name */
    private final double f16131b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16132c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16133d;

    /* renamed from: e  reason: collision with root package name */
    private final BlockingQueue<Runnable> f16134e;

    /* renamed from: f  reason: collision with root package name */
    private final ThreadPoolExecutor f16135f;

    /* renamed from: g  reason: collision with root package name */
    private final f<b0> f16136g;

    /* renamed from: h  reason: collision with root package name */
    private final q5.b0 f16137h;

    /* renamed from: i  reason: collision with root package name */
    private int f16138i;

    /* renamed from: j  reason: collision with root package name */
    private long f16139j;

    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final p f16140n;

        /* renamed from: o  reason: collision with root package name */
        private final j<p> f16141o;

        private b(p pVar, j<p> jVar) {
            this.f16140n = pVar;
            this.f16141o = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f16140n, this.f16141o);
            e.this.f16137h.e();
            double g10 = e.this.g();
            n5.f f10 = n5.f.f();
            f10.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g10 / 1000.0d)) + " s for report: " + this.f16140n.d());
            e.q(g10);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d10, double d11, long j10, f<b0> fVar, q5.b0 b0Var) {
        this.f16130a = d10;
        this.f16131b = d11;
        this.f16132c = j10;
        this.f16136g = fVar;
        this.f16137h = b0Var;
        int i10 = (int) d10;
        this.f16133d = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f16134e = arrayBlockingQueue;
        this.f16135f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f16138i = 0;
        this.f16139j = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f<b0> fVar, x5.d dVar, q5.b0 b0Var) {
        this(dVar.f16344f, dVar.f16345g, dVar.f16346h * 1000, fVar, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f16130a) * Math.pow(this.f16131b, h()));
    }

    private int h() {
        if (this.f16139j == 0) {
            this.f16139j = o();
        }
        int o10 = (int) ((o() - this.f16139j) / this.f16132c);
        int min = l() ? Math.min(100, this.f16138i + o10) : Math.max(0, this.f16138i - o10);
        if (this.f16138i != min) {
            this.f16138i = min;
            this.f16139j = o();
        }
        return min;
    }

    private boolean k() {
        return this.f16134e.size() < this.f16133d;
    }

    private boolean l() {
        return this.f16134e.size() == this.f16133d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.b(this.f16136g, e1.d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(j jVar, p pVar, Exception exc) {
        if (exc != null) {
            jVar.d(exc);
            return;
        }
        j();
        jVar.e(pVar);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final p pVar, final j<p> jVar) {
        n5.f f10 = n5.f.f();
        f10.b("Sending report through Google DataTransport: " + pVar.d());
        this.f16136g.a(e1.c.e(pVar.b()), new h() { // from class: w5.c
            @Override // e1.h
            public final void a(Exception exc) {
                e.this.n(jVar, pVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j<p> i(p pVar, boolean z10) {
        synchronized (this.f16134e) {
            j<p> jVar = new j<>();
            if (!z10) {
                p(pVar, jVar);
                return jVar;
            }
            this.f16137h.d();
            if (!k()) {
                h();
                n5.f f10 = n5.f.f();
                f10.b("Dropping report due to queue being full: " + pVar.d());
                this.f16137h.c();
                jVar.e(pVar);
                return jVar;
            }
            n5.f f11 = n5.f.f();
            f11.b("Enqueueing report: " + pVar.d());
            n5.f f12 = n5.f.f();
            f12.b("Queue size: " + this.f16134e.size());
            this.f16135f.execute(new b(pVar, jVar));
            n5.f f13 = n5.f.f();
            f13.b("Closing task for report: " + pVar.d());
            jVar.e(pVar);
            return jVar;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: w5.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        j0.e(countDownLatch, 2L, TimeUnit.SECONDS);
    }
}
