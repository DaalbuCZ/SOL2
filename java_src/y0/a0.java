package y0;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final long f16430b = TimeUnit.SECONDS.toMillis(12);

    /* renamed from: a  reason: collision with root package name */
    private Timer f16431a;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: n  reason: collision with root package name */
        private final c f16432n;

        public a(c cVar) {
            this.f16432n = cVar;
        }

        @Override // y0.a0.c
        public void a() {
            this.f16432n.a();
        }

        @Override // y0.a0.c
        public void b(Exception exc) {
            this.f16432n.b(exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends c {

        /* renamed from: n  reason: collision with root package name */
        private final Random f16433n = new Random();

        /* renamed from: o  reason: collision with root package name */
        final long f16434o = a0.f16430b;

        /* renamed from: p  reason: collision with root package name */
        int f16435p = 0;

        private void f() {
            int i10 = this.f16435p + 1;
            this.f16435p = i10;
            d(c(i10, this.f16434o));
        }

        @Override // y0.a0.c
        public void a() {
            e();
            if (this.f16435p > 0) {
                g();
                d(a0.f16430b);
            }
        }

        @Override // y0.a0.c
        public void b(Exception exc) {
            if (exc instanceof j2) {
                f();
            } else {
                i0.c(exc);
            }
        }

        public long c(int i10, long j10) {
            long pow = (long) ((j10 / 1000) * Math.pow(2.0d, Math.min(i10, 15)));
            double nextDouble = this.f16433n.nextDouble() * Math.min(pow, 18000L);
            return ((long) Math.min(pow + nextDouble, nextDouble + 43200.0d)) * 1000;
        }

        protected abstract void d(long j10);

        public abstract void e();

        public void g() {
            this.f16435p = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends TimerTask {
        public abstract void a();

        public abstract void b(Exception exc);

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Exception e10) {
                b(e10);
            }
        }
    }

    public void a() {
        Timer timer = this.f16431a;
        if (timer != null) {
            timer.cancel();
            this.f16431a = null;
        }
    }

    public void b(long j10, c cVar) {
        Timer timer = new Timer();
        this.f16431a = timer;
        timer.schedule(cVar, j10, j10);
    }
}
