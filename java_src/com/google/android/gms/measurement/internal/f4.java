package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f4 extends FutureTask implements Comparable {

    /* renamed from: n  reason: collision with root package name */
    private final long f4524n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f4525o;

    /* renamed from: p  reason: collision with root package name */
    private final String f4526p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ h4 f4527q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f4527q = h4Var;
        z3.o.i(str);
        atomicLong = h4.f4580l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f4524n = andIncrement;
        this.f4526p = str;
        this.f4525o = z10;
        if (andIncrement == Long.MAX_VALUE) {
            h4Var.f4438a.d().r().a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4 h4Var, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f4527q = h4Var;
        z3.o.i("Task exception on worker thread");
        atomicLong = h4.f4580l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f4524n = andIncrement;
        this.f4526p = "Task exception on worker thread";
        this.f4525o = z10;
        if (andIncrement == Long.MAX_VALUE) {
            h4Var.f4438a.d().r().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        f4 f4Var = (f4) obj;
        boolean z10 = this.f4525o;
        if (z10 != f4Var.f4525o) {
            return !z10 ? 1 : -1;
        }
        int i10 = (this.f4524n > f4Var.f4524n ? 1 : (this.f4524n == f4Var.f4524n ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        this.f4527q.f4438a.d().t().b("Two tasks share the same index. index", Long.valueOf(this.f4524n));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f4527q.f4438a.d().r().b(this.f4526p, th);
        super.setException(th);
    }
}
