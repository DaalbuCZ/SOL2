package t9;

import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.y;
import r9.k;
import r9.n0;
import r9.o0;
import y8.m;
/* loaded from: classes.dex */
public abstract class a<E> extends t9.c<E> implements f<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0218a<E> implements g<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f14819a;

        /* renamed from: b  reason: collision with root package name */
        private Object f14820b = t9.b.f14829d;

        public C0218a(a<E> aVar) {
            this.f14819a = aVar;
        }

        private final boolean b(Object obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (jVar.f14852q == null) {
                    return false;
                }
                throw d0.k(jVar.I());
            }
            return true;
        }

        private final Object c(b9.d<? super Boolean> dVar) {
            b9.d b10;
            Object c10;
            Object a10;
            b10 = c9.c.b(dVar);
            r9.l a11 = r9.n.a(b10);
            b bVar = new b(this, a11);
            while (true) {
                if (this.f14819a.p(bVar)) {
                    this.f14819a.w(a11, bVar);
                    break;
                }
                Object v10 = this.f14819a.v();
                d(v10);
                if (v10 instanceof j) {
                    j jVar = (j) v10;
                    if (jVar.f14852q == null) {
                        m.a aVar = y8.m.f17093n;
                        a10 = d9.b.a(false);
                    } else {
                        m.a aVar2 = y8.m.f17093n;
                        a10 = y8.n.a(jVar.I());
                    }
                    a11.l(y8.m.a(a10));
                } else if (v10 != t9.b.f14829d) {
                    Boolean a12 = d9.b.a(true);
                    j9.l<E, y8.s> lVar = this.f14819a.f14833b;
                    a11.m(a12, lVar != null ? y.a(lVar, v10, a11.b()) : null);
                }
            }
            Object A = a11.A();
            c10 = c9.d.c();
            if (A == c10) {
                d9.h.c(dVar);
            }
            return A;
        }

        @Override // t9.g
        public Object a(b9.d<? super Boolean> dVar) {
            Object obj = this.f14820b;
            e0 e0Var = t9.b.f14829d;
            if (obj == e0Var) {
                obj = this.f14819a.v();
                this.f14820b = obj;
                if (obj == e0Var) {
                    return c(dVar);
                }
            }
            return d9.b.a(b(obj));
        }

        public final void d(Object obj) {
            this.f14820b = obj;
        }

        @Override // t9.g
        public E next() {
            E e10 = (E) this.f14820b;
            if (e10 instanceof j) {
                throw d0.k(((j) e10).I());
            }
            e0 e0Var = t9.b.f14829d;
            if (e10 != e0Var) {
                this.f14820b = e0Var;
                return e10;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<E> extends o<E> {

        /* renamed from: q  reason: collision with root package name */
        public final C0218a<E> f14821q;

        /* renamed from: r  reason: collision with root package name */
        public final r9.k<Boolean> f14822r;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0218a<E> c0218a, r9.k<? super Boolean> kVar) {
            this.f14821q = c0218a;
            this.f14822r = kVar;
        }

        @Override // t9.o
        public void D(j<?> jVar) {
            Object a10 = jVar.f14852q == null ? k.a.a(this.f14822r, Boolean.FALSE, null, 2, null) : this.f14822r.q(jVar.I());
            if (a10 != null) {
                this.f14821q.d(jVar);
                this.f14822r.s(a10);
            }
        }

        public j9.l<Throwable, y8.s> E(E e10) {
            j9.l<E, y8.s> lVar = this.f14821q.f14819a.f14833b;
            if (lVar != null) {
                return y.a(lVar, e10, this.f14822r.b());
            }
            return null;
        }

        @Override // t9.q
        public void b(E e10) {
            this.f14821q.d(e10);
            this.f14822r.s(r9.m.f13141a);
        }

        @Override // t9.q
        public e0 h(E e10, r.b bVar) {
            Object i10 = this.f14822r.i(Boolean.TRUE, null, E(e10));
            if (i10 == null) {
                return null;
            }
            if (n0.a()) {
                if (!(i10 == r9.m.f13141a)) {
                    throw new AssertionError();
                }
            }
            return r9.m.f13141a;
        }

        @Override // kotlinx.coroutines.internal.r
        public String toString() {
            return "ReceiveHasNext@" + o0.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends r9.e {

        /* renamed from: n  reason: collision with root package name */
        private final o<?> f14823n;

        public c(o<?> oVar) {
            this.f14823n = oVar;
        }

        @Override // r9.j
        public void a(Throwable th) {
            if (this.f14823n.y()) {
                a.this.t();
            }
        }

        @Override // j9.l
        public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
            a(th);
            return y8.s.f17099a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f14823n + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends r.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f14825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.r rVar, a aVar) {
            super(rVar);
            this.f14825d = aVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.r rVar) {
            if (this.f14825d.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.q.a();
        }
    }

    public a(j9.l<? super E, y8.s> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q10 = q(oVar);
        if (q10) {
            u();
        }
        return q10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(r9.k<?> kVar, o<?> oVar) {
        kVar.e(new c(oVar));
    }

    @Override // t9.p
    public final g<E> iterator() {
        return new C0218a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.c
    public q<E> l() {
        q<E> l10 = super.l();
        if (l10 != null && !(l10 instanceof j)) {
            t();
        }
        return l10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        int B;
        kotlinx.coroutines.internal.r u10;
        if (!r()) {
            kotlinx.coroutines.internal.r e10 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.r u11 = e10.u();
                if (!(!(u11 instanceof s))) {
                    return false;
                }
                B = u11.B(oVar, e10, dVar);
                if (B != 1) {
                }
            } while (B != 2);
            return false;
        }
        kotlinx.coroutines.internal.r e11 = e();
        do {
            u10 = e11.u();
            if (!(!(u10 instanceof s))) {
                return false;
            }
        } while (!u10.n(oVar, e11));
        return true;
    }

    protected abstract boolean r();

    protected abstract boolean s();

    protected void t() {
    }

    protected void u() {
    }

    protected Object v() {
        while (true) {
            s m10 = m();
            if (m10 == null) {
                return t9.b.f14829d;
            }
            e0 E = m10.E(null);
            if (E != null) {
                if (n0.a()) {
                    if (!(E == r9.m.f13141a)) {
                        throw new AssertionError();
                    }
                }
                m10.C();
                return m10.D();
            }
            m10.F();
        }
    }
}
