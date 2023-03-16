package r9;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import r9.b1;
/* loaded from: classes.dex */
public final class p0 extends b1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: u  reason: collision with root package name */
    public static final p0 f13152u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f13153v;

    static {
        Long l10;
        p0 p0Var = new p0();
        f13152u = p0Var;
        a1.d0(p0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f13153v = timeUnit.toNanos(l10.longValue());
    }

    private p0() {
    }

    private final boolean A0() {
        return debugStatus == 4;
    }

    private final boolean B0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean C0() {
        if (B0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void D0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized void y0() {
        if (B0()) {
            debugStatus = 3;
            t0();
            notifyAll();
        }
    }

    private final synchronized Thread z0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    @Override // r9.c1
    protected Thread h0() {
        Thread thread = _thread;
        return thread == null ? z0() : thread;
    }

    @Override // r9.c1
    protected void i0(long j10, b1.a aVar) {
        D0();
    }

    @Override // r9.b1
    public void n0(Runnable runnable) {
        if (A0()) {
            D0();
        }
        super.n0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean q02;
        g2.f13116a.c(this);
        c.a();
        try {
            if (!C0()) {
                if (q02) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long r02 = r0();
                if (r02 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f13153v + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        y0();
                        c.a();
                        if (q0()) {
                            return;
                        }
                        h0();
                        return;
                    }
                    r02 = n9.f.d(r02, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (r02 > 0) {
                    if (B0()) {
                        _thread = null;
                        y0();
                        c.a();
                        if (q0()) {
                            return;
                        }
                        h0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, r02);
                }
            }
        } finally {
            _thread = null;
            y0();
            c.a();
            if (!q0()) {
                h0();
            }
        }
    }

    @Override // r9.b1, r9.a1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
