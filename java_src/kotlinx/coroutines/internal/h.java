package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r9.a1;
import r9.g2;
import r9.o0;
import r9.u0;
/* loaded from: classes.dex */
public final class h<T> extends u0<T> implements d9.e, b9.d<T> {

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10919u = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: q  reason: collision with root package name */
    public final r9.d0 f10920q;

    /* renamed from: r  reason: collision with root package name */
    public final b9.d<T> f10921r;

    /* renamed from: s  reason: collision with root package name */
    public Object f10922s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f10923t;

    /* JADX WARN: Multi-variable type inference failed */
    public h(r9.d0 d0Var, b9.d<? super T> dVar) {
        super(-1);
        this.f10920q = d0Var;
        this.f10921r = dVar;
        this.f10922s = i.a();
        this.f10923t = i0.b(b());
        this._reusableCancellableContinuation = null;
    }

    private final r9.l<?> r() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof r9.l) {
            return (r9.l) obj;
        }
        return null;
    }

    @Override // r9.u0
    public void a(Object obj, Throwable th) {
        if (obj instanceof r9.w) {
            ((r9.w) obj).f13173b.c(th);
        }
    }

    @Override // b9.d
    public b9.g b() {
        return this.f10921r.b();
    }

    @Override // r9.u0
    public b9.d<T> c() {
        return this;
    }

    @Override // d9.e
    public d9.e h() {
        b9.d<T> dVar = this.f10921r;
        if (dVar instanceof d9.e) {
            return (d9.e) dVar;
        }
        return null;
    }

    @Override // r9.u0
    public Object k() {
        Object obj = this.f10922s;
        if (r9.n0.a()) {
            if (!(obj != i.a())) {
                throw new AssertionError();
            }
        }
        this.f10922s = i.a();
        return obj;
    }

    @Override // b9.d
    public void l(Object obj) {
        b9.g b10 = this.f10921r.b();
        Object d10 = r9.z.d(obj, null, 1, null);
        if (this.f10920q.W(b10)) {
            this.f10922s = d10;
            this.f13168p = 0;
            this.f10920q.b(b10, this);
            return;
        }
        r9.n0.a();
        a1 a10 = g2.f13116a.a();
        if (a10.e0()) {
            this.f10922s = d10;
            this.f13168p = 0;
            a10.a0(this);
            return;
        }
        a10.c0(true);
        try {
            b9.g b11 = b();
            Object c10 = i0.c(b11, this.f10923t);
            this.f10921r.l(obj);
            y8.s sVar = y8.s.f17099a;
            i0.a(b11, c10);
            do {
            } while (a10.g0());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // d9.e
    public StackTraceElement n() {
        return null;
    }

    public final void o() {
        do {
        } while (this._reusableCancellableContinuation == i.f10925b);
    }

    public final r9.l<T> p() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = i.f10925b;
                return null;
            } else if (obj instanceof r9.l) {
                if (androidx.concurrent.futures.b.a(f10919u, this, obj, i.f10925b)) {
                    return (r9.l) obj;
                }
            } else if (obj != i.f10925b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean t() {
        return this._reusableCancellableContinuation != null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f10920q + ", " + o0.c(this.f10921r) + ']';
    }

    public final boolean u(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            e0 e0Var = i.f10925b;
            if (k9.k.a(obj, e0Var)) {
                if (androidx.concurrent.futures.b.a(f10919u, this, e0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (androidx.concurrent.futures.b.a(f10919u, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        o();
        r9.l<?> r10 = r();
        if (r10 != null) {
            r10.w();
        }
    }

    public final Throwable w(r9.k<?> kVar) {
        e0 e0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            e0Var = i.f10925b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f10919u, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f10919u, this, e0Var, kVar));
        return null;
    }
}
