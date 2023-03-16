package r9;

import b9.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.r;
import r9.p1;
/* loaded from: classes.dex */
public class w1 implements p1, s, d2 {

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13175n = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends v1 {

        /* renamed from: r  reason: collision with root package name */
        private final w1 f13176r;

        /* renamed from: s  reason: collision with root package name */
        private final b f13177s;

        /* renamed from: t  reason: collision with root package name */
        private final r f13178t;

        /* renamed from: u  reason: collision with root package name */
        private final Object f13179u;

        public a(w1 w1Var, b bVar, r rVar, Object obj) {
            this.f13176r = w1Var;
            this.f13177s = bVar;
            this.f13178t = rVar;
            this.f13179u = obj;
        }

        @Override // r9.x
        public void C(Throwable th) {
            this.f13176r.L(this.f13177s, this.f13178t, this.f13179u);
        }

        @Override // j9.l
        public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
            C(th);
            return y8.s.f17099a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements k1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: n  reason: collision with root package name */
        private final a2 f13180n;

        public b(a2 a2Var, boolean z10, Throwable th) {
            this.f13180n = a2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // r9.k1
        public boolean a() {
            return e() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Throwable th) {
            Throwable e10 = e();
            if (e10 == null) {
                m(th);
            } else if (th == e10) {
            } else {
                Object d10 = d();
                if (d10 == null) {
                    l(th);
                } else if (d10 instanceof Throwable) {
                    if (th == d10) {
                        return;
                    }
                    ArrayList<Throwable> c10 = c();
                    c10.add(d10);
                    c10.add(th);
                    l(c10);
                } else if (d10 instanceof ArrayList) {
                    ((ArrayList) d10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
            }
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            kotlinx.coroutines.internal.e0 e0Var;
            Object d10 = d();
            e0Var = x1.f13191e;
            return d10 == e0Var;
        }

        @Override // r9.k1
        public a2 i() {
            return this.f13180n;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.e0 e0Var;
            Object d10 = d();
            if (d10 == null) {
                arrayList = c();
            } else if (d10 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(d10);
                arrayList = c10;
            } else if (!(d10 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + d10).toString());
            } else {
                arrayList = (ArrayList) d10;
            }
            Throwable e10 = e();
            if (e10 != null) {
                arrayList.add(0, e10);
            }
            if (th != null && !k9.k.a(th, e10)) {
                arrayList.add(th);
            }
            e0Var = x1.f13191e;
            l(e0Var);
            return arrayList;
        }

        public final void k(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + i() + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends r.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w1 f13181d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f13182e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.r rVar, w1 w1Var, Object obj) {
            super(rVar);
            this.f13181d = w1Var;
            this.f13182e = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.r rVar) {
            if (this.f13181d.Z() == this.f13182e) {
                return null;
            }
            return kotlinx.coroutines.internal.q.a();
        }
    }

    public w1(boolean z10) {
        this._state = z10 ? x1.f13193g : x1.f13192f;
        this._parentHandle = null;
    }

    private final Object A0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.e0 e0Var;
        kotlinx.coroutines.internal.e0 e0Var2;
        if (!(obj instanceof k1)) {
            e0Var2 = x1.f13187a;
            return e0Var2;
        } else if ((!(obj instanceof z0) && !(obj instanceof v1)) || (obj instanceof r) || (obj2 instanceof v)) {
            return B0((k1) obj, obj2);
        } else {
            if (y0((k1) obj, obj2)) {
                return obj2;
            }
            e0Var = x1.f13189c;
            return e0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object B0(k1 k1Var, Object obj) {
        kotlinx.coroutines.internal.e0 e0Var;
        kotlinx.coroutines.internal.e0 e0Var2;
        kotlinx.coroutines.internal.e0 e0Var3;
        a2 X = X(k1Var);
        if (X == null) {
            e0Var3 = x1.f13189c;
            return e0Var3;
        }
        b bVar = k1Var instanceof b ? (b) k1Var : null;
        if (bVar == null) {
            bVar = new b(X, false, null);
        }
        k9.r rVar = new k9.r();
        synchronized (bVar) {
            if (bVar.g()) {
                e0Var2 = x1.f13187a;
                return e0Var2;
            }
            bVar.k(true);
            if (bVar != k1Var && !androidx.concurrent.futures.b.a(f13175n, this, k1Var, bVar)) {
                e0Var = x1.f13189c;
                return e0Var;
            }
            if (n0.a() && !(!bVar.h())) {
                throw new AssertionError();
            }
            boolean f10 = bVar.f();
            v vVar = obj instanceof v ? (v) obj : null;
            if (vVar != null) {
                bVar.b(vVar.f13170a);
            }
            ?? e10 = Boolean.valueOf(f10 ? false : true).booleanValue() ? bVar.e() : 0;
            rVar.f10900n = e10;
            y8.s sVar = y8.s.f17099a;
            if (e10 != 0) {
                k0(X, e10);
            }
            r Q = Q(k1Var);
            return (Q == null || !C0(bVar, Q, obj)) ? P(bVar, obj) : x1.f13188b;
        }
    }

    private final boolean C0(b bVar, r rVar, Object obj) {
        while (p1.a.d(rVar.f13159r, false, false, new a(this, bVar, rVar, obj), 1, null) == b2.f13099n) {
            rVar = j0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Object F(Object obj) {
        kotlinx.coroutines.internal.e0 e0Var;
        Object A0;
        kotlinx.coroutines.internal.e0 e0Var2;
        do {
            Object Z = Z();
            if (!(Z instanceof k1) || ((Z instanceof b) && ((b) Z).g())) {
                e0Var = x1.f13187a;
                return e0Var;
            }
            A0 = A0(Z, new v(M(obj), false, 2, null));
            e0Var2 = x1.f13189c;
        } while (A0 == e0Var2);
        return A0;
    }

    private final boolean H(Throwable th) {
        if (e0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        q Y = Y();
        return (Y == null || Y == b2.f13099n) ? z10 : Y.l(th) || z10;
    }

    private final void K(k1 k1Var, Object obj) {
        q Y = Y();
        if (Y != null) {
            Y.e();
            s0(b2.f13099n);
        }
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th = vVar != null ? vVar.f13170a : null;
        if (!(k1Var instanceof v1)) {
            a2 i10 = k1Var.i();
            if (i10 != null) {
                l0(i10, th);
                return;
            }
            return;
        }
        try {
            ((v1) k1Var).C(th);
        } catch (Throwable th2) {
            b0(new y("Exception in completion handler " + k1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(b bVar, r rVar, Object obj) {
        if (n0.a()) {
            if (!(Z() == bVar)) {
                throw new AssertionError();
            }
        }
        r j02 = j0(rVar);
        if (j02 == null || !C0(bVar, j02, obj)) {
            z(P(bVar, obj));
        }
    }

    private final Throwable M(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new q1(I(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((d2) obj).E();
    }

    private final Object P(b bVar, Object obj) {
        boolean f10;
        Throwable U;
        boolean z10 = true;
        if (n0.a()) {
            if (!(Z() == bVar)) {
                throw new AssertionError();
            }
        }
        if (!n0.a() || (!bVar.h())) {
            if (!n0.a() || bVar.g()) {
                v vVar = obj instanceof v ? (v) obj : null;
                Throwable th = vVar != null ? vVar.f13170a : null;
                synchronized (bVar) {
                    f10 = bVar.f();
                    List<Throwable> j10 = bVar.j(th);
                    U = U(bVar, j10);
                    if (U != null) {
                        x(U, j10);
                    }
                }
                if (U != null && U != th) {
                    obj = new v(U, false, 2, null);
                }
                if (U != null) {
                    if (!H(U) && !a0(U)) {
                        z10 = false;
                    }
                    if (z10) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                        ((v) obj).b();
                    }
                }
                if (!f10) {
                    m0(U);
                }
                n0(obj);
                boolean a10 = androidx.concurrent.futures.b.a(f13175n, this, bVar, x1.g(obj));
                if (!n0.a() || a10) {
                    K(bVar, obj);
                    return obj;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final r Q(k1 k1Var) {
        r rVar = k1Var instanceof r ? (r) k1Var : null;
        if (rVar == null) {
            a2 i10 = k1Var.i();
            if (i10 != null) {
                return j0(i10);
            }
            return null;
        }
        return rVar;
    }

    private final Throwable T(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f13170a;
        }
        return null;
    }

    private final Throwable U(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.f()) {
                return new q1(I(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final a2 X(k1 k1Var) {
        a2 i10 = k1Var.i();
        if (i10 == null) {
            if (k1Var instanceof z0) {
                return new a2();
            }
            if (k1Var instanceof v1) {
                q0((v1) k1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + k1Var).toString());
        }
        return i10;
    }

    private final Object f0(Object obj) {
        kotlinx.coroutines.internal.e0 e0Var;
        kotlinx.coroutines.internal.e0 e0Var2;
        kotlinx.coroutines.internal.e0 e0Var3;
        kotlinx.coroutines.internal.e0 e0Var4;
        kotlinx.coroutines.internal.e0 e0Var5;
        kotlinx.coroutines.internal.e0 e0Var6;
        Throwable th = null;
        while (true) {
            Object Z = Z();
            if (Z instanceof b) {
                synchronized (Z) {
                    if (((b) Z).h()) {
                        e0Var2 = x1.f13190d;
                        return e0Var2;
                    }
                    boolean f10 = ((b) Z).f();
                    if (obj != null || !f10) {
                        if (th == null) {
                            th = M(obj);
                        }
                        ((b) Z).b(th);
                    }
                    Throwable e10 = f10 ^ true ? ((b) Z).e() : null;
                    if (e10 != null) {
                        k0(((b) Z).i(), e10);
                    }
                    e0Var = x1.f13187a;
                    return e0Var;
                }
            } else if (!(Z instanceof k1)) {
                e0Var3 = x1.f13190d;
                return e0Var3;
            } else {
                if (th == null) {
                    th = M(obj);
                }
                k1 k1Var = (k1) Z;
                if (!k1Var.a()) {
                    Object A0 = A0(Z, new v(th, false, 2, null));
                    e0Var5 = x1.f13187a;
                    if (A0 == e0Var5) {
                        throw new IllegalStateException(("Cannot happen in " + Z).toString());
                    }
                    e0Var6 = x1.f13189c;
                    if (A0 != e0Var6) {
                        return A0;
                    }
                } else if (z0(k1Var, th)) {
                    e0Var4 = x1.f13187a;
                    return e0Var4;
                }
            }
        }
    }

    private final v1 h0(j9.l<? super Throwable, y8.s> lVar, boolean z10) {
        v1 v1Var;
        if (z10) {
            v1Var = lVar instanceof r1 ? (r1) lVar : null;
            if (v1Var == null) {
                v1Var = new n1(lVar);
            }
        } else {
            v1Var = lVar instanceof v1 ? (v1) lVar : null;
            if (v1Var == null) {
                v1Var = new o1(lVar);
            } else if (n0.a() && !(!(v1Var instanceof r1))) {
                throw new AssertionError();
            }
        }
        v1Var.E(this);
        return v1Var;
    }

    private final r j0(kotlinx.coroutines.internal.r rVar) {
        while (rVar.x()) {
            rVar = rVar.u();
        }
        while (true) {
            rVar = rVar.t();
            if (!rVar.x()) {
                if (rVar instanceof r) {
                    return (r) rVar;
                }
                if (rVar instanceof a2) {
                    return null;
                }
            }
        }
    }

    private final void k0(a2 a2Var, Throwable th) {
        m0(th);
        y yVar = null;
        for (kotlinx.coroutines.internal.r rVar = (kotlinx.coroutines.internal.r) a2Var.s(); !k9.k.a(rVar, a2Var); rVar = rVar.t()) {
            if (rVar instanceof r1) {
                v1 v1Var = (v1) rVar;
                try {
                    v1Var.C(th);
                } catch (Throwable th2) {
                    if (yVar != null) {
                        y8.b.a(yVar, th2);
                    } else {
                        yVar = new y("Exception in completion handler " + v1Var + " for " + this, th2);
                        y8.s sVar = y8.s.f17099a;
                    }
                }
            }
        }
        if (yVar != null) {
            b0(yVar);
        }
        H(th);
    }

    private final void l0(a2 a2Var, Throwable th) {
        y yVar = null;
        for (kotlinx.coroutines.internal.r rVar = (kotlinx.coroutines.internal.r) a2Var.s(); !k9.k.a(rVar, a2Var); rVar = rVar.t()) {
            if (rVar instanceof v1) {
                v1 v1Var = (v1) rVar;
                try {
                    v1Var.C(th);
                } catch (Throwable th2) {
                    if (yVar != null) {
                        y8.b.a(yVar, th2);
                    } else {
                        yVar = new y("Exception in completion handler " + v1Var + " for " + this, th2);
                        y8.s sVar = y8.s.f17099a;
                    }
                }
            }
        }
        if (yVar != null) {
            b0(yVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [r9.j1] */
    private final void p0(z0 z0Var) {
        a2 a2Var = new a2();
        if (!z0Var.a()) {
            a2Var = new j1(a2Var);
        }
        androidx.concurrent.futures.b.a(f13175n, this, z0Var, a2Var);
    }

    private final void q0(v1 v1Var) {
        v1Var.o(new a2());
        androidx.concurrent.futures.b.a(f13175n, this, v1Var, v1Var.t());
    }

    private final int t0(Object obj) {
        z0 z0Var;
        if (!(obj instanceof z0)) {
            if (obj instanceof j1) {
                if (androidx.concurrent.futures.b.a(f13175n, this, obj, ((j1) obj).i())) {
                    o0();
                    return 1;
                }
                return -1;
            }
            return 0;
        } else if (((z0) obj).a()) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13175n;
            z0Var = x1.f13193g;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, z0Var)) {
                o0();
                return 1;
            }
            return -1;
        }
    }

    private final String u0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof k1 ? ((k1) obj).a() ? "Active" : "New" : obj instanceof v ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.g() ? "Completing" : "Active";
    }

    private final boolean w(Object obj, a2 a2Var, v1 v1Var) {
        int B;
        c cVar = new c(v1Var, this, obj);
        do {
            B = a2Var.u().B(v1Var, a2Var, cVar);
            if (B == 1) {
                return true;
            }
        } while (B != 2);
        return false;
    }

    public static /* synthetic */ CancellationException w0(w1 w1Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return w1Var.v0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final void x(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable n10 = !n0.d() ? th : kotlinx.coroutines.internal.d0.n(th);
        for (Throwable th2 : list) {
            if (n0.d()) {
                th2 = kotlinx.coroutines.internal.d0.n(th2);
            }
            if (th2 != th && th2 != n10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                y8.b.a(th, th2);
            }
        }
    }

    private final boolean y0(k1 k1Var, Object obj) {
        if (n0.a()) {
            if (!((k1Var instanceof z0) || (k1Var instanceof v1))) {
                throw new AssertionError();
            }
        }
        if (!n0.a() || (!(obj instanceof v))) {
            if (androidx.concurrent.futures.b.a(f13175n, this, k1Var, x1.g(obj))) {
                m0(null);
                n0(obj);
                K(k1Var, obj);
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    private final boolean z0(k1 k1Var, Throwable th) {
        if (!n0.a() || (!(k1Var instanceof b))) {
            if (!n0.a() || k1Var.a()) {
                a2 X = X(k1Var);
                if (X == null) {
                    return false;
                }
                if (androidx.concurrent.futures.b.a(f13175n, this, k1Var, new b(X, false, th))) {
                    k0(X, th);
                    return true;
                }
                return false;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public final boolean A(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.e0 e0Var;
        kotlinx.coroutines.internal.e0 e0Var2;
        kotlinx.coroutines.internal.e0 e0Var3;
        obj2 = x1.f13187a;
        if (W() && (obj2 = F(obj)) == x1.f13188b) {
            return true;
        }
        e0Var = x1.f13187a;
        if (obj2 == e0Var) {
            obj2 = f0(obj);
        }
        e0Var2 = x1.f13187a;
        if (obj2 == e0Var2 || obj2 == x1.f13188b) {
            return true;
        }
        e0Var3 = x1.f13190d;
        if (obj2 == e0Var3) {
            return false;
        }
        z(obj2);
        return true;
    }

    @Override // b9.g
    public b9.g B(g.c<?> cVar) {
        return p1.a.e(this, cVar);
    }

    public void C(Throwable th) {
        A(th);
    }

    @Override // r9.d2
    public CancellationException E() {
        Throwable th;
        Object Z = Z();
        if (Z instanceof b) {
            th = ((b) Z).e();
        } else if (Z instanceof v) {
            th = ((v) Z).f13170a;
        } else if (Z instanceof k1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + Z).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new q1("Parent job is " + u0(Z), th, this);
        }
        return cancellationException;
    }

    @Override // r9.p1
    public final CancellationException G() {
        Object Z = Z();
        if (!(Z instanceof b)) {
            if (Z instanceof k1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (Z instanceof v) {
                return w0(this, ((v) Z).f13170a, null, 1, null);
            } else {
                return new q1(o0.a(this) + " has completed normally", null, this);
            }
        }
        Throwable e10 = ((b) Z).e();
        if (e10 != null) {
            CancellationException v02 = v0(e10, o0.a(this) + " is cancelling");
            if (v02 != null) {
                return v02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String I() {
        return "Job was cancelled";
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return A(th) && V();
    }

    @Override // r9.p1
    public void N(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new q1(I(), null, this);
        }
        C(cancellationException);
    }

    @Override // r9.p1
    public final y0 O(boolean z10, boolean z11, j9.l<? super Throwable, y8.s> lVar) {
        v1 h02 = h0(lVar, z10);
        while (true) {
            Object Z = Z();
            if (Z instanceof z0) {
                z0 z0Var = (z0) Z;
                if (!z0Var.a()) {
                    p0(z0Var);
                } else if (androidx.concurrent.futures.b.a(f13175n, this, Z, h02)) {
                    return h02;
                }
            } else {
                if (!(Z instanceof k1)) {
                    if (z11) {
                        v vVar = Z instanceof v ? (v) Z : null;
                        lVar.c(vVar != null ? vVar.f13170a : null);
                    }
                    return b2.f13099n;
                }
                a2 i10 = ((k1) Z).i();
                if (i10 == null) {
                    Objects.requireNonNull(Z, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    q0((v1) Z);
                } else {
                    y0 y0Var = b2.f13099n;
                    if (z10 && (Z instanceof b)) {
                        synchronized (Z) {
                            r3 = ((b) Z).e();
                            if (r3 == null || ((lVar instanceof r) && !((b) Z).g())) {
                                if (w(Z, i10, h02)) {
                                    if (r3 == null) {
                                        return h02;
                                    }
                                    y0Var = h02;
                                }
                            }
                            y8.s sVar = y8.s.f17099a;
                        }
                    }
                    if (r3 != null) {
                        if (z11) {
                            lVar.c(r3);
                        }
                        return y0Var;
                    } else if (w(Z, i10, h02)) {
                        return h02;
                    }
                }
            }
        }
    }

    @Override // b9.g
    public <R> R S(R r10, j9.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) p1.a.b(this, r10, pVar);
    }

    public boolean V() {
        return true;
    }

    public boolean W() {
        return false;
    }

    public final q Y() {
        return (q) this._parentHandle;
    }

    public final Object Z() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.z)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.z) obj).c(this);
        }
    }

    @Override // r9.p1
    public boolean a() {
        Object Z = Z();
        return (Z instanceof k1) && ((k1) Z).a();
    }

    protected boolean a0(Throwable th) {
        return false;
    }

    public void b0(Throwable th) {
        throw th;
    }

    @Override // b9.g.b, b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        return (E) p1.a.c(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c0(p1 p1Var) {
        if (n0.a()) {
            if (!(Y() == null)) {
                throw new AssertionError();
            }
        }
        if (p1Var == null) {
            s0(b2.f13099n);
            return;
        }
        p1Var.start();
        q k10 = p1Var.k(this);
        s0(k10);
        if (d0()) {
            k10.e();
            s0(b2.f13099n);
        }
    }

    public final boolean d0() {
        return !(Z() instanceof k1);
    }

    protected boolean e0() {
        return false;
    }

    public final Object g0(Object obj) {
        Object A0;
        kotlinx.coroutines.internal.e0 e0Var;
        kotlinx.coroutines.internal.e0 e0Var2;
        do {
            A0 = A0(Z(), obj);
            e0Var = x1.f13187a;
            if (A0 == e0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, T(obj));
            }
            e0Var2 = x1.f13189c;
        } while (A0 == e0Var2);
        return A0;
    }

    @Override // b9.g.b
    public final g.c<?> getKey() {
        return p1.f13154l;
    }

    public String i0() {
        return o0.a(this);
    }

    @Override // b9.g
    public b9.g j(b9.g gVar) {
        return p1.a.f(this, gVar);
    }

    @Override // r9.p1
    public final q k(s sVar) {
        return (q) p1.a.d(this, true, false, new r(sVar), 2, null);
    }

    protected void m0(Throwable th) {
    }

    protected void n0(Object obj) {
    }

    protected void o0() {
    }

    public final void r0(v1 v1Var) {
        Object Z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z0 z0Var;
        do {
            Z = Z();
            if (!(Z instanceof v1)) {
                if (!(Z instanceof k1) || ((k1) Z).i() == null) {
                    return;
                }
                v1Var.y();
                return;
            } else if (Z != v1Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f13175n;
                z0Var = x1.f13193g;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, Z, z0Var));
    }

    public final void s0(q qVar) {
        this._parentHandle = qVar;
    }

    @Override // r9.p1
    public final boolean start() {
        int t02;
        do {
            t02 = t0(Z());
            if (t02 == 0) {
                return false;
            }
        } while (t02 != 1);
        return true;
    }

    public String toString() {
        return x0() + '@' + o0.b(this);
    }

    protected final CancellationException v0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = I();
            }
            cancellationException = new q1(str, th, this);
        }
        return cancellationException;
    }

    public final String x0() {
        return i0() + '{' + u0(Z()) + '}';
    }

    @Override // r9.s
    public final void y(d2 d2Var) {
        A(d2Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(Object obj) {
    }
}
