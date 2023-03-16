package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o implements ScheduledExecutorService {

    /* renamed from: n  reason: collision with root package name */
    private final ExecutorService f5317n;

    /* renamed from: o  reason: collision with root package name */
    private final ScheduledExecutorService f5318o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f5317n = executorService;
        this.f5318o = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(final Runnable runnable, final p.b bVar) {
        this.f5317n.execute(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                o.m(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture o(final Runnable runnable, long j10, TimeUnit timeUnit, final p.b bVar) {
        return this.f5318o.schedule(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                o.this.n(runnable, bVar);
            }
        }, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future q(final Callable callable, final p.b bVar) {
        return this.f5317n.submit(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                o.p(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture r(final Callable callable, long j10, TimeUnit timeUnit, final p.b bVar) {
        return this.f5318o.schedule(new Callable() { // from class: com.google.firebase.concurrent.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future q10;
                q10 = o.this.q(callable, bVar);
                return q10;
            }
        }, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final Runnable runnable, final p.b bVar) {
        this.f5317n.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                o.s(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture u(final Runnable runnable, long j10, long j11, TimeUnit timeUnit, final p.b bVar) {
        return this.f5318o.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                o.this.t(runnable, bVar);
            }
        }, j10, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(final Runnable runnable, final p.b bVar) {
        this.f5317n.execute(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                o.x(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(final Runnable runnable, long j10, long j11, TimeUnit timeUnit, final p.b bVar) {
        return this.f5318o.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                o.this.v(runnable, bVar);
            }
        }, j10, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f5317n.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5317n.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f5317n.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f5317n.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f5317n.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f5317n.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f5317n.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f5317n.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture o10;
                o10 = o.this.o(runnable, j10, timeUnit, bVar);
                return o10;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture r10;
                r10 = o.this.r(callable, j10, timeUnit, bVar);
                return r10;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture u10;
                u10 = o.this.u(runnable, j10, j11, timeUnit, bVar);
                return u10;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.p.c
            public final ScheduledFuture a(p.b bVar) {
                ScheduledFuture w10;
                w10 = o.this.w(runnable, j10, j11, timeUnit, bVar);
                return w10;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f5317n.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f5317n.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f5317n.submit(callable);
    }
}
