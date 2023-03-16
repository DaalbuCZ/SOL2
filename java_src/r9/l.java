package r9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r9.p1;
/* loaded from: classes.dex */
public class l<T> extends u0<T> implements k<T>, d9.e {

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13129t = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision");

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13130u = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: q  reason: collision with root package name */
    private final b9.d<T> f13131q;

    /* renamed from: r  reason: collision with root package name */
    private final b9.g f13132r;

    /* renamed from: s  reason: collision with root package name */
    private y0 f13133s;

    /* JADX WARN: Multi-variable type inference failed */
    public l(b9.d<? super T> dVar, int i10) {
        super(i10);
        this.f13131q = dVar;
        if (n0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        this.f13132r = dVar.b();
        this._decision = 0;
        this._state = d.f13105n;
    }

    private final String C() {
        Object B = B();
        return B instanceof c2 ? "Active" : B instanceof o ? "Cancelled" : "Completed";
    }

    private final y0 D() {
        p1 p1Var = (p1) b().c(p1.f13154l);
        if (p1Var == null) {
            return null;
        }
        y0 d10 = p1.a.d(p1Var, true, false, new p(this), 2, null);
        this.f13133s = d10;
        return d10;
    }

    private final boolean E() {
        return v0.c(this.f13168p) && ((kotlinx.coroutines.internal.h) this.f13131q).t();
    }

    private final i F(j9.l<? super Throwable, y8.s> lVar) {
        return lVar instanceof i ? (i) lVar : new m1(lVar);
    }

    private final void G(j9.l<? super Throwable, y8.s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void J() {
        Throwable w10;
        b9.d<T> dVar = this.f13131q;
        kotlinx.coroutines.internal.h hVar = dVar instanceof kotlinx.coroutines.internal.h ? (kotlinx.coroutines.internal.h) dVar : null;
        if (hVar == null || (w10 = hVar.w(this)) == null) {
            return;
        }
        w();
        u(w10);
    }

    private final void L(Object obj, int i10, j9.l<? super Throwable, y8.s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof c2)) {
                if (obj2 instanceof o) {
                    o oVar = (o) obj2;
                    if (oVar.c()) {
                        if (lVar != null) {
                            t(lVar, oVar.f13170a);
                            return;
                        }
                        return;
                    }
                }
                o(obj);
                throw new y8.d();
            }
        } while (!androidx.concurrent.futures.b.a(f13130u, this, obj2, N((c2) obj2, obj, i10, lVar, null)));
        x();
        y(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void M(l lVar, Object obj, int i10, j9.l lVar2, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar2 = null;
        }
        lVar.L(obj, i10, lVar2);
    }

    private final Object N(c2 c2Var, Object obj, int i10, j9.l<? super Throwable, y8.s> lVar, Object obj2) {
        if (obj instanceof v) {
            if (n0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (n0.a()) {
                if (lVar == null) {
                    return obj;
                }
                throw new AssertionError();
            }
            return obj;
        } else if (v0.b(i10) || obj2 != null) {
            if (lVar != null || (((c2Var instanceof i) && !(c2Var instanceof e)) || obj2 != null)) {
                return new u(obj, c2Var instanceof i ? (i) c2Var : null, lVar, obj2, null, 16, null);
            }
            return obj;
        } else {
            return obj;
        }
    }

    private final boolean O() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f13129t.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.e0 P(Object obj, Object obj2, j9.l<? super Throwable, y8.s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof c2)) {
                if (!(obj3 instanceof u) || obj2 == null) {
                    return null;
                }
                u uVar = (u) obj3;
                if (uVar.f13166d == obj2) {
                    if (!n0.a() || k9.k.a(uVar.f13163a, obj)) {
                        return m.f13141a;
                    }
                    throw new AssertionError();
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f13130u, this, obj3, N((c2) obj3, obj, this.f13168p, lVar, obj2)));
        x();
        return m.f13141a;
    }

    private final boolean Q() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f13129t.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void p(j9.l<? super Throwable, y8.s> lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            b9.g b10 = b();
            g0.a(b10, new y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean v(Throwable th) {
        if (E()) {
            return ((kotlinx.coroutines.internal.h) this.f13131q).u(th);
        }
        return false;
    }

    private final void x() {
        if (E()) {
            return;
        }
        w();
    }

    private final void y(int i10) {
        if (O()) {
            return;
        }
        v0.a(this, i10);
    }

    public final Object A() {
        p1 p1Var;
        Throwable j10;
        Throwable j11;
        Object c10;
        boolean E = E();
        if (Q()) {
            if (this.f13133s == null) {
                D();
            }
            if (E) {
                J();
            }
            c10 = c9.d.c();
            return c10;
        }
        if (E) {
            J();
        }
        Object B = B();
        if (B instanceof v) {
            Throwable th = ((v) B).f13170a;
            if (n0.d()) {
                j11 = kotlinx.coroutines.internal.d0.j(th, this);
                throw j11;
            }
            throw th;
        } else if (!v0.b(this.f13168p) || (p1Var = (p1) b().c(p1.f13154l)) == null || p1Var.a()) {
            return f(B);
        } else {
            CancellationException G = p1Var.G();
            a(B, G);
            if (n0.d()) {
                j10 = kotlinx.coroutines.internal.d0.j(G, this);
                throw j10;
            }
            throw G;
        }
    }

    public final Object B() {
        return this._state;
    }

    protected String H() {
        return "CancellableContinuation";
    }

    public final void I(Throwable th) {
        if (v(th)) {
            return;
        }
        u(th);
        x();
    }

    public final boolean K() {
        if (n0.a()) {
            if (!(this.f13168p == 2)) {
                throw new AssertionError();
            }
        }
        if (n0.a()) {
            if (!(this.f13133s != b2.f13099n)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (!n0.a() || (!(obj instanceof c2))) {
            if ((obj instanceof u) && ((u) obj).f13166d != null) {
                w();
                return false;
            }
            this._decision = 0;
            this._state = d.f13105n;
            return true;
        }
        throw new AssertionError();
    }

    @Override // r9.u0
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof c2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof v) {
                return;
            }
            if (obj2 instanceof u) {
                u uVar = (u) obj2;
                if (!(!uVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f13130u, this, obj2, u.b(uVar, null, null, null, null, th, 15, null))) {
                    uVar.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f13130u, this, obj2, new u(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // b9.d
    public b9.g b() {
        return this.f13132r;
    }

    @Override // r9.u0
    public final b9.d<T> c() {
        return this.f13131q;
    }

    @Override // r9.u0
    public Throwable d(Object obj) {
        Throwable j10;
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            b9.d<T> dVar = this.f13131q;
            if (n0.d() && (dVar instanceof d9.e)) {
                j10 = kotlinx.coroutines.internal.d0.j(d10, (d9.e) dVar);
                return j10;
            }
            return d10;
        }
        return null;
    }

    @Override // r9.k
    public void e(j9.l<? super Throwable, y8.s> lVar) {
        i F = F(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.concurrent.futures.b.a(f13130u, this, obj, F)) {
                    return;
                }
            } else if (obj instanceof i) {
                G(lVar, obj);
            } else {
                boolean z10 = obj instanceof v;
                if (z10) {
                    v vVar = (v) obj;
                    if (!vVar.b()) {
                        G(lVar, obj);
                    }
                    if (obj instanceof o) {
                        if (!z10) {
                            vVar = null;
                        }
                        p(lVar, vVar != null ? vVar.f13170a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof u) {
                    u uVar = (u) obj;
                    if (uVar.f13164b != null) {
                        G(lVar, obj);
                    }
                    if (F instanceof e) {
                        return;
                    }
                    if (uVar.c()) {
                        p(lVar, uVar.f13167e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f13130u, this, obj, u.b(uVar, null, F, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (F instanceof e) {
                    return;
                } else {
                    if (androidx.concurrent.futures.b.a(f13130u, this, obj, new u(obj, F, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r9.u0
    public <T> T f(Object obj) {
        return obj instanceof u ? (T) ((u) obj).f13163a : obj;
    }

    @Override // r9.k
    public Object g(T t10, Object obj) {
        return P(t10, obj, null);
    }

    @Override // d9.e
    public d9.e h() {
        b9.d<T> dVar = this.f13131q;
        if (dVar instanceof d9.e) {
            return (d9.e) dVar;
        }
        return null;
    }

    @Override // r9.k
    public Object i(T t10, Object obj, j9.l<? super Throwable, y8.s> lVar) {
        return P(t10, obj, lVar);
    }

    @Override // r9.u0
    public Object k() {
        return B();
    }

    @Override // b9.d
    public void l(Object obj) {
        M(this, z.c(obj, this), this.f13168p, null, 4, null);
    }

    @Override // r9.k
    public void m(T t10, j9.l<? super Throwable, y8.s> lVar) {
        L(t10, this.f13168p, lVar);
    }

    @Override // d9.e
    public StackTraceElement n() {
        return null;
    }

    @Override // r9.k
    public Object q(Throwable th) {
        return P(new v(th, false, 2, null), null, null);
    }

    public final void r(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            b9.g b10 = b();
            g0.a(b10, new y("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // r9.k
    public void s(Object obj) {
        if (n0.a()) {
            if (!(obj == m.f13141a)) {
                throw new AssertionError();
            }
        }
        y(this.f13168p);
    }

    public final void t(j9.l<? super Throwable, y8.s> lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            b9.g b10 = b();
            g0.a(b10, new y("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public String toString() {
        return H() + '(' + o0.c(this.f13131q) + "){" + C() + "}@" + o0.b(this);
    }

    public boolean u(Throwable th) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof c2)) {
                return false;
            }
            z10 = obj instanceof i;
        } while (!androidx.concurrent.futures.b.a(f13130u, this, obj, new o(this, th, z10)));
        i iVar = z10 ? (i) obj : null;
        if (iVar != null) {
            r(iVar, th);
        }
        x();
        y(this.f13168p);
        return true;
    }

    public final void w() {
        y0 y0Var = this.f13133s;
        if (y0Var == null) {
            return;
        }
        y0Var.e();
        this.f13133s = b2.f13099n;
    }

    public Throwable z(p1 p1Var) {
        return p1Var.G();
    }
}
