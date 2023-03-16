package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g4 extends Thread {

    /* renamed from: n  reason: collision with root package name */
    private final Object f4550n;

    /* renamed from: o  reason: collision with root package name */
    private final BlockingQueue f4551o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4552p = false;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ h4 f4553q;

    public g4(h4 h4Var, String str, BlockingQueue blockingQueue) {
        this.f4553q = h4Var;
        z3.o.i(str);
        z3.o.i(blockingQueue);
        this.f4550n = new Object();
        this.f4551o = blockingQueue;
        setName(str);
    }

    private final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        g4 g4Var;
        g4 g4Var2;
        obj = this.f4553q.f4587i;
        synchronized (obj) {
            if (!this.f4552p) {
                semaphore = this.f4553q.f4588j;
                semaphore.release();
                obj2 = this.f4553q.f4587i;
                obj2.notifyAll();
                h4 h4Var = this.f4553q;
                g4Var = h4Var.f4581c;
                if (this == g4Var) {
                    h4Var.f4581c = null;
                } else {
                    g4Var2 = h4Var.f4582d;
                    if (this == g4Var2) {
                        h4Var.f4582d = null;
                    } else {
                        h4Var.f4438a.d().r().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f4552p = true;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f4553q.f4438a.d().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f4550n) {
            this.f4550n.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.f4553q.f4588j;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                f4 f4Var = (f4) this.f4551o.poll();
                if (f4Var != null) {
                    Process.setThreadPriority(true != f4Var.f4525o ? 10 : threadPriority);
                    f4Var.run();
                } else {
                    synchronized (this.f4550n) {
                        if (this.f4551o.peek() == null) {
                            boolean unused = this.f4553q.f4589k;
                            try {
                                this.f4550n.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    obj = this.f4553q.f4587i;
                    synchronized (obj) {
                        if (this.f4551o.peek() == null) {
                            b();
                            return;
                        }
                    }
                }
            }
        } finally {
            b();
        }
    }
}
