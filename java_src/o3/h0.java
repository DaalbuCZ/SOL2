package o3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class h0 implements i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f11972d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f11973e = h(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f11974f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f11975g = new c(3, -9223372036854775807L);

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f11976a;

    /* renamed from: b  reason: collision with root package name */
    private d<? extends e> f11977b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f11978c;

    /* loaded from: classes.dex */
    public interface b<T extends e> {
        void j(T t10, long j10, long j11, boolean z10);

        void o(T t10, long j10, long j11);

        c u(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f11979a;

        /* renamed from: b  reason: collision with root package name */
        private final long f11980b;

        private c(int i10, long j10) {
            this.f11979a = i10;
            this.f11980b = j10;
        }

        public boolean c() {
            int i10 = this.f11979a;
            return i10 == 0 || i10 == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        public final int f11981n;

        /* renamed from: o  reason: collision with root package name */
        private final T f11982o;

        /* renamed from: p  reason: collision with root package name */
        private final long f11983p;

        /* renamed from: q  reason: collision with root package name */
        private b<T> f11984q;

        /* renamed from: r  reason: collision with root package name */
        private IOException f11985r;

        /* renamed from: s  reason: collision with root package name */
        private int f11986s;

        /* renamed from: t  reason: collision with root package name */
        private Thread f11987t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f11988u;

        /* renamed from: v  reason: collision with root package name */
        private volatile boolean f11989v;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f11982o = t10;
            this.f11984q = bVar;
            this.f11981n = i10;
            this.f11983p = j10;
        }

        private void b() {
            this.f11985r = null;
            h0.this.f11976a.execute((Runnable) p3.a.e(h0.this.f11977b));
        }

        private void c() {
            h0.this.f11977b = null;
        }

        private long d() {
            return Math.min((this.f11986s - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f11989v = z10;
            this.f11985r = null;
            if (hasMessages(0)) {
                this.f11988u = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f11988u = true;
                    this.f11982o.c();
                    Thread thread = this.f11987t;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) p3.a.e(this.f11984q)).j(this.f11982o, elapsedRealtime, elapsedRealtime - this.f11983p, true);
                this.f11984q = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f11985r;
            if (iOException != null && this.f11986s > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            p3.a.f(h0.this.f11977b == null);
            h0.this.f11977b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f11989v) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
            } else if (i10 == 3) {
                throw ((Error) message.obj);
            } else {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f11983p;
                b bVar = (b) p3.a.e(this.f11984q);
                if (this.f11988u) {
                    bVar.j(this.f11982o, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        bVar.o(this.f11982o, elapsedRealtime, j10);
                    } catch (RuntimeException e10) {
                        p3.r.d("LoadTask", "Unexpected exception handling load completed", e10);
                        h0.this.f11978c = new h(e10);
                    }
                } else if (i11 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f11985r = iOException;
                    int i12 = this.f11986s + 1;
                    this.f11986s = i12;
                    c u10 = bVar.u(this.f11982o, elapsedRealtime, j10, iOException, i12);
                    if (u10.f11979a == 3) {
                        h0.this.f11978c = this.f11985r;
                    } else if (u10.f11979a != 2) {
                        if (u10.f11979a == 1) {
                            this.f11986s = 1;
                        }
                        f(u10.f11980b != -9223372036854775807L ? u10.f11980b : d());
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f11988u;
                    this.f11987t = Thread.currentThread();
                }
                if (z10) {
                    p3.j0.a("load:" + this.f11982o.getClass().getSimpleName());
                    try {
                        this.f11982o.b();
                        p3.j0.c();
                    } catch (Throwable th) {
                        p3.j0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f11987t = null;
                    Thread.interrupted();
                }
                if (this.f11989v) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f11989v) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Error e11) {
                if (!this.f11989v) {
                    p3.r.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f11989v) {
                    return;
                }
                p3.r.d("LoadTask", "Unexpected exception loading stream", e12);
                hVar = new h(e12);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f11989v) {
                    return;
                }
                p3.r.d("LoadTask", "OutOfMemory error loading stream", e13);
                hVar = new h(e13);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public interface f {
        void l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final f f11991n;

        public g(f fVar) {
            this.f11991n = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11991n.l();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public h0(String str) {
        this.f11976a = p3.m0.B0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // o3.i0
    public void b() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) p3.a.h(this.f11977b)).a(false);
    }

    public void g() {
        this.f11978c = null;
    }

    public boolean i() {
        return this.f11978c != null;
    }

    public boolean j() {
        return this.f11977b != null;
    }

    public void k(int i10) {
        IOException iOException = this.f11978c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f11977b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f11981n;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f11977b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f11976a.execute(new g(fVar));
        }
        this.f11976a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f11978c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) p3.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
