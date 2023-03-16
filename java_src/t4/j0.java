package t4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0<TResult> extends i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14735a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final g0 f14736b = new g0();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f14737c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f14738d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    private Object f14739e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    private Exception f14740f;

    private final void A() {
        synchronized (this.f14735a) {
            if (this.f14737c) {
                this.f14736b.b(this);
            }
        }
    }

    @GuardedBy("mLock")
    private final void x() {
        z3.o.m(this.f14737c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void y() {
        if (this.f14738d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    private final void z() {
        if (this.f14737c) {
            throw b.a(this);
        }
    }

    @Override // t4.i
    public final i<TResult> a(Executor executor, c cVar) {
        this.f14736b.a(new w(executor, cVar));
        A();
        return this;
    }

    @Override // t4.i
    public final i<TResult> b(Executor executor, d<TResult> dVar) {
        this.f14736b.a(new y(executor, dVar));
        A();
        return this;
    }

    @Override // t4.i
    public final i<TResult> c(d<TResult> dVar) {
        this.f14736b.a(new y(k.f14741a, dVar));
        A();
        return this;
    }

    @Override // t4.i
    public final i<TResult> d(Executor executor, e eVar) {
        this.f14736b.a(new a0(executor, eVar));
        A();
        return this;
    }

    @Override // t4.i
    public final i<TResult> e(e eVar) {
        d(k.f14741a, eVar);
        return this;
    }

    @Override // t4.i
    public final i<TResult> f(Executor executor, f<? super TResult> fVar) {
        this.f14736b.a(new c0(executor, fVar));
        A();
        return this;
    }

    @Override // t4.i
    public final i<TResult> g(f<? super TResult> fVar) {
        f(k.f14741a, fVar);
        return this;
    }

    @Override // t4.i
    public final <TContinuationResult> i<TContinuationResult> h(Executor executor, a<TResult, TContinuationResult> aVar) {
        j0 j0Var = new j0();
        this.f14736b.a(new s(executor, aVar, j0Var));
        A();
        return j0Var;
    }

    @Override // t4.i
    public final <TContinuationResult> i<TContinuationResult> i(a<TResult, TContinuationResult> aVar) {
        return h(k.f14741a, aVar);
    }

    @Override // t4.i
    public final <TContinuationResult> i<TContinuationResult> j(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        j0 j0Var = new j0();
        this.f14736b.a(new u(executor, aVar, j0Var));
        A();
        return j0Var;
    }

    @Override // t4.i
    public final Exception k() {
        Exception exc;
        synchronized (this.f14735a) {
            exc = this.f14740f;
        }
        return exc;
    }

    @Override // t4.i
    public final TResult l() {
        TResult tresult;
        synchronized (this.f14735a) {
            x();
            y();
            Exception exc = this.f14740f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = (TResult) this.f14739e;
        }
        return tresult;
    }

    @Override // t4.i
    public final <X extends Throwable> TResult m(Class<X> cls) {
        TResult tresult;
        synchronized (this.f14735a) {
            x();
            y();
            if (cls.isInstance(this.f14740f)) {
                throw cls.cast(this.f14740f);
            }
            Exception exc = this.f14740f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = (TResult) this.f14739e;
        }
        return tresult;
    }

    @Override // t4.i
    public final boolean n() {
        return this.f14738d;
    }

    @Override // t4.i
    public final boolean o() {
        boolean z10;
        synchronized (this.f14735a) {
            z10 = this.f14737c;
        }
        return z10;
    }

    @Override // t4.i
    public final boolean p() {
        boolean z10;
        synchronized (this.f14735a) {
            z10 = false;
            if (this.f14737c && !this.f14738d && this.f14740f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // t4.i
    public final <TContinuationResult> i<TContinuationResult> q(Executor executor, h<TResult, TContinuationResult> hVar) {
        j0 j0Var = new j0();
        this.f14736b.a(new e0(executor, hVar, j0Var));
        A();
        return j0Var;
    }

    @Override // t4.i
    public final <TContinuationResult> i<TContinuationResult> r(h<TResult, TContinuationResult> hVar) {
        Executor executor = k.f14741a;
        j0 j0Var = new j0();
        this.f14736b.a(new e0(executor, hVar, j0Var));
        A();
        return j0Var;
    }

    public final void s(Exception exc) {
        z3.o.j(exc, "Exception must not be null");
        synchronized (this.f14735a) {
            z();
            this.f14737c = true;
            this.f14740f = exc;
        }
        this.f14736b.b(this);
    }

    public final void t(Object obj) {
        synchronized (this.f14735a) {
            z();
            this.f14737c = true;
            this.f14739e = obj;
        }
        this.f14736b.b(this);
    }

    public final boolean u() {
        synchronized (this.f14735a) {
            if (this.f14737c) {
                return false;
            }
            this.f14737c = true;
            this.f14738d = true;
            this.f14736b.b(this);
            return true;
        }
    }

    public final boolean v(Exception exc) {
        z3.o.j(exc, "Exception must not be null");
        synchronized (this.f14735a) {
            if (this.f14737c) {
                return false;
            }
            this.f14737c = true;
            this.f14740f = exc;
            this.f14736b.b(this);
            return true;
        }
    }

    public final boolean w(Object obj) {
        synchronized (this.f14735a) {
            if (this.f14737c) {
                return false;
            }
            this.f14737c = true;
            this.f14739e = obj;
            this.f14736b.b(this);
            return true;
        }
    }
}
