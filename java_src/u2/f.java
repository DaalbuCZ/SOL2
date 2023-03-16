package u2;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import s1.l3;
import u2.b0;
import u2.u;
import w1.w;
/* loaded from: classes.dex */
public abstract class f<T> extends u2.a {

    /* renamed from: u  reason: collision with root package name */
    private final HashMap<T, b<T>> f15183u = new HashMap<>();

    /* renamed from: v  reason: collision with root package name */
    private Handler f15184v;

    /* renamed from: w  reason: collision with root package name */
    private o3.p0 f15185w;

    /* loaded from: classes.dex */
    private final class a implements b0, w1.w {

        /* renamed from: a  reason: collision with root package name */
        private final T f15186a;

        /* renamed from: b  reason: collision with root package name */
        private b0.a f15187b;

        /* renamed from: c  reason: collision with root package name */
        private w.a f15188c;

        public a(T t10) {
            this.f15187b = f.this.w(null);
            this.f15188c = f.this.t(null);
            this.f15186a = t10;
        }

        private boolean b(int i10, u.b bVar) {
            u.b bVar2;
            if (bVar != null) {
                bVar2 = f.this.G(this.f15186a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int I = f.this.I(this.f15186a, i10);
            b0.a aVar = this.f15187b;
            if (aVar.f15161a != I || !p3.m0.c(aVar.f15162b, bVar2)) {
                this.f15187b = f.this.v(I, bVar2, 0L);
            }
            w.a aVar2 = this.f15188c;
            if (aVar2.f15966a == I && p3.m0.c(aVar2.f15967b, bVar2)) {
                return true;
            }
            this.f15188c = f.this.s(I, bVar2);
            return true;
        }

        private q d(q qVar) {
            long H = f.this.H(this.f15186a, qVar.f15340f);
            long H2 = f.this.H(this.f15186a, qVar.f15341g);
            return (H == qVar.f15340f && H2 == qVar.f15341g) ? qVar : new q(qVar.f15335a, qVar.f15336b, qVar.f15337c, qVar.f15338d, qVar.f15339e, H, H2);
        }

        @Override // w1.w
        public void C(int i10, u.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f15188c.k(i11);
            }
        }

        @Override // w1.w
        public void G(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f15188c.m();
            }
        }

        @Override // w1.w
        public void I(int i10, u.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f15188c.l(exc);
            }
        }

        @Override // w1.w
        public void P(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f15188c.j();
            }
        }

        @Override // u2.b0
        public void Q(int i10, u.b bVar, q qVar) {
            if (b(i10, bVar)) {
                this.f15187b.E(d(qVar));
            }
        }

        @Override // u2.b0
        public void T(int i10, u.b bVar, q qVar) {
            if (b(i10, bVar)) {
                this.f15187b.j(d(qVar));
            }
        }

        @Override // u2.b0
        public void U(int i10, u.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f15187b.B(nVar, d(qVar));
            }
        }

        @Override // u2.b0
        public void V(int i10, u.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f15187b.v(nVar, d(qVar));
            }
        }

        @Override // u2.b0
        public void Y(int i10, u.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f15187b.s(nVar, d(qVar));
            }
        }

        @Override // w1.w
        public void a0(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f15188c.h();
            }
        }

        @Override // w1.w
        public void f0(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f15188c.i();
            }
        }

        @Override // w1.w
        public /* synthetic */ void k0(int i10, u.b bVar) {
            w1.p.a(this, i10, bVar);
        }

        @Override // u2.b0
        public void m0(int i10, u.b bVar, n nVar, q qVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f15187b.y(nVar, d(qVar), iOException, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final u f15190a;

        /* renamed from: b  reason: collision with root package name */
        public final u.c f15191b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T>.a f15192c;

        public b(u uVar, u.c cVar, f<T>.a aVar) {
            this.f15190a = uVar;
            this.f15191b = cVar;
            this.f15192c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.a
    public void C(o3.p0 p0Var) {
        this.f15185w = p0Var;
        this.f15184v = p3.m0.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.a
    public void E() {
        for (b<T> bVar : this.f15183u.values()) {
            bVar.f15190a.c(bVar.f15191b);
            bVar.f15190a.e(bVar.f15192c);
            bVar.f15190a.q(bVar.f15192c);
        }
        this.f15183u.clear();
    }

    protected abstract u.b G(T t10, u.b bVar);

    protected long H(T t10, long j10) {
        return j10;
    }

    protected int I(T t10, int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public abstract void J(T t10, u uVar, l3 l3Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(final T t10, u uVar) {
        p3.a.a(!this.f15183u.containsKey(t10));
        u.c cVar = new u.c() { // from class: u2.e
            @Override // u2.u.c
            public final void a(u uVar2, l3 l3Var) {
                f.this.J(t10, uVar2, l3Var);
            }
        };
        a aVar = new a(t10);
        this.f15183u.put(t10, new b<>(uVar, cVar, aVar));
        uVar.l((Handler) p3.a.e(this.f15184v), aVar);
        uVar.p((Handler) p3.a.e(this.f15184v), aVar);
        uVar.h(cVar, this.f15185w, A());
        if (B()) {
            return;
        }
        uVar.k(cVar);
    }

    @Override // u2.a
    protected void y() {
        for (b<T> bVar : this.f15183u.values()) {
            bVar.f15190a.k(bVar.f15191b);
        }
    }

    @Override // u2.a
    protected void z() {
        for (b<T> bVar : this.f15183u.values()) {
            bVar.f15190a.d(bVar.f15191b);
        }
    }
}
