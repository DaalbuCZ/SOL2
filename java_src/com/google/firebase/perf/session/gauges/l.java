package com.google.firebase.perf.session.gauges;

import a7.o;
import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class l {

    /* renamed from: f  reason: collision with root package name */
    private static final u6.a f5790f = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f5791a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b7.b> f5792b;

    /* renamed from: c  reason: collision with root package name */
    private final Runtime f5793c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledFuture f5794d;

    /* renamed from: e  reason: collision with root package name */
    private long f5795e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f5794d = null;
        this.f5795e = -1L;
        this.f5791a = scheduledExecutorService;
        this.f5792b = new ConcurrentLinkedQueue<>();
        this.f5793c = runtime;
    }

    private int d() {
        return o.c(a7.k.f254s.e(this.f5793c.totalMemory() - this.f5793c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(a7.l lVar) {
        b7.b l10 = l(lVar);
        if (l10 != null) {
            this.f5792b.add(l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(a7.l lVar) {
        b7.b l10 = l(lVar);
        if (l10 != null) {
            this.f5792b.add(l10);
        }
    }

    private synchronized void h(final a7.l lVar) {
        try {
            this.f5791a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.f(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            u6.a aVar = f5790f;
            aVar.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void i(long j10, final a7.l lVar) {
        this.f5795e = j10;
        try {
            this.f5794d = this.f5791a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.g(lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            u6.a aVar = f5790f;
            aVar.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private b7.b l(a7.l lVar) {
        if (lVar == null) {
            return null;
        }
        return b7.b.U().L(lVar.b()).M(d()).a();
    }

    public void c(a7.l lVar) {
        h(lVar);
    }

    public void j(long j10, a7.l lVar) {
        if (e(j10)) {
            return;
        }
        if (this.f5794d == null) {
            i(j10, lVar);
        } else if (this.f5795e != j10) {
            k();
            i(j10, lVar);
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f5794d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f5794d = null;
        this.f5795e = -1L;
    }
}
