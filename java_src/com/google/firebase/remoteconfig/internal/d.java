package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.window.layout.u;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, d> f5836d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f5837e = u.f2506n;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5838a;

    /* renamed from: b  reason: collision with root package name */
    private final n f5839b;

    /* renamed from: c  reason: collision with root package name */
    private t4.i<e> f5840c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<TResult> implements t4.f<TResult>, t4.e, t4.c {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f5841a;

        private b() {
            this.f5841a = new CountDownLatch(1);
        }

        @Override // t4.c
        public void a() {
            this.f5841a.countDown();
        }

        @Override // t4.f
        public void b(TResult tresult) {
            this.f5841a.countDown();
        }

        @Override // t4.e
        public void c(Exception exc) {
            this.f5841a.countDown();
        }

        public boolean d(long j10, TimeUnit timeUnit) {
            return this.f5841a.await(j10, timeUnit);
        }
    }

    private d(Executor executor, n nVar) {
        this.f5838a = executor;
        this.f5839b = nVar;
    }

    private static <TResult> TResult c(t4.i<TResult> iVar, long j10, TimeUnit timeUnit) {
        b bVar = new b();
        Executor executor = f5837e;
        iVar.f(executor, bVar);
        iVar.d(executor, bVar);
        iVar.a(executor, bVar);
        if (bVar.d(j10, timeUnit)) {
            if (iVar.p()) {
                return iVar.l();
            }
            throw new ExecutionException(iVar.k());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized d h(Executor executor, n nVar) {
        d dVar;
        synchronized (d.class) {
            String b10 = nVar.b();
            Map<String, d> map = f5836d;
            if (!map.containsKey(b10)) {
                map.put(b10, new d(executor, nVar));
            }
            dVar = map.get(b10);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void i(e eVar) {
        return this.f5839b.e(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t4.i j(boolean z10, e eVar, Void r32) {
        if (z10) {
            m(eVar);
        }
        return t4.l.e(eVar);
    }

    private synchronized void m(e eVar) {
        this.f5840c = t4.l.e(eVar);
    }

    public void d() {
        synchronized (this) {
            this.f5840c = t4.l.e(null);
        }
        this.f5839b.a();
    }

    public synchronized t4.i<e> e() {
        t4.i<e> iVar = this.f5840c;
        if (iVar == null || (iVar.o() && !this.f5840c.p())) {
            Executor executor = this.f5838a;
            final n nVar = this.f5839b;
            Objects.requireNonNull(nVar);
            this.f5840c = t4.l.c(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return n.this.d();
                }
            });
        }
        return this.f5840c;
    }

    public e f() {
        return g(5L);
    }

    e g(long j10) {
        synchronized (this) {
            t4.i<e> iVar = this.f5840c;
            if (iVar != null && iVar.p()) {
                return this.f5840c.l();
            }
            try {
                return (e) c(e(), j10, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    public t4.i<e> k(e eVar) {
        return l(eVar, true);
    }

    public t4.i<e> l(final e eVar, final boolean z10) {
        return t4.l.c(this.f5838a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void i10;
                i10 = d.this.i(eVar);
                return i10;
            }
        }).q(this.f5838a, new t4.h() { // from class: com.google.firebase.remoteconfig.internal.c
            @Override // t4.h
            public final t4.i a(Object obj) {
                t4.i j10;
                j10 = d.this.j(z10, eVar, (Void) obj);
                return j10;
            }
        });
    }
}
