package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class h4 extends d5 {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicLong f4580l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    private g4 f4581c;

    /* renamed from: d  reason: collision with root package name */
    private g4 f4582d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue f4583e;

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue f4584f;

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f4585g;

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f4586h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f4587i;

    /* renamed from: j  reason: collision with root package name */
    private final Semaphore f4588j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f4589k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h4(j4 j4Var) {
        super(j4Var);
        this.f4587i = new Object();
        this.f4588j = new Semaphore(2);
        this.f4583e = new PriorityBlockingQueue();
        this.f4584f = new LinkedBlockingQueue();
        this.f4585g = new e4(this, "Thread death: Uncaught exception on worker thread");
        this.f4586h = new e4(this, "Thread death: Uncaught exception on network thread");
    }

    private final void D(f4 f4Var) {
        synchronized (this.f4587i) {
            this.f4583e.add(f4Var);
            g4 g4Var = this.f4581c;
            if (g4Var == null) {
                g4 g4Var2 = new g4(this, "Measurement Worker", this.f4583e);
                this.f4581c = g4Var2;
                g4Var2.setUncaughtExceptionHandler(this.f4585g);
                this.f4581c.start();
            } else {
                g4Var.a();
            }
        }
    }

    public final void A(Runnable runnable) {
        k();
        z3.o.i(runnable);
        D(new f4(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.f4581c;
    }

    @Override // com.google.android.gms.measurement.internal.c5
    public final void g() {
        if (Thread.currentThread() != this.f4582d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.c5
    public final void h() {
        if (Thread.currentThread() != this.f4581c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    protected final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object r(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f4438a.b().z(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                d3 w10 = this.f4438a.d().w();
                w10.a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f4438a.d().w().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future s(Callable callable) {
        k();
        z3.o.i(callable);
        f4 f4Var = new f4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4581c) {
            if (!this.f4583e.isEmpty()) {
                this.f4438a.d().w().a("Callable skipped the worker queue.");
            }
            f4Var.run();
        } else {
            D(f4Var);
        }
        return f4Var;
    }

    public final Future t(Callable callable) {
        k();
        z3.o.i(callable);
        f4 f4Var = new f4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4581c) {
            f4Var.run();
        } else {
            D(f4Var);
        }
        return f4Var;
    }

    public final void y(Runnable runnable) {
        k();
        z3.o.i(runnable);
        f4 f4Var = new f4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f4587i) {
            this.f4584f.add(f4Var);
            g4 g4Var = this.f4582d;
            if (g4Var == null) {
                g4 g4Var2 = new g4(this, "Measurement Network", this.f4584f);
                this.f4582d = g4Var2;
                g4Var2.setUncaughtExceptionHandler(this.f4586h);
                this.f4582d.start();
            } else {
                g4Var.a();
            }
        }
    }

    public final void z(Runnable runnable) {
        k();
        z3.o.i(runnable);
        D(new f4(this, runnable, false, "Task exception on worker thread"));
    }
}
