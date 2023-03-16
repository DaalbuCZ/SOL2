package s1;

import android.util.Pair;
import s1.l3;
/* loaded from: classes.dex */
public abstract class a extends l3 {

    /* renamed from: p  reason: collision with root package name */
    private final int f13279p;

    /* renamed from: q  reason: collision with root package name */
    private final u2.p0 f13280q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f13281r;

    public a(boolean z10, u2.p0 p0Var) {
        this.f13281r = z10;
        this.f13280q = p0Var;
        this.f13279p = p0Var.a();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f13280q.c(i10);
        }
        if (i10 < this.f13279p - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int H(int i10, boolean z10) {
        if (z10) {
            return this.f13280q.f(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    protected abstract Object C(int i10);

    protected abstract int E(int i10);

    protected abstract int F(int i10);

    protected abstract l3 I(int i10);

    @Override // s1.l3
    public int e(boolean z10) {
        if (this.f13279p == 0) {
            return -1;
        }
        if (this.f13281r) {
            z10 = false;
        }
        int e10 = z10 ? this.f13280q.e() : 0;
        while (I(e10).u()) {
            e10 = G(e10, z10);
            if (e10 == -1) {
                return -1;
            }
        }
        return F(e10) + I(e10).e(z10);
    }

    @Override // s1.l3
    public final int f(Object obj) {
        int f10;
        if (obj instanceof Pair) {
            Object B = B(obj);
            Object A = A(obj);
            int x10 = x(B);
            if (x10 == -1 || (f10 = I(x10).f(A)) == -1) {
                return -1;
            }
            return E(x10) + f10;
        }
        return -1;
    }

    @Override // s1.l3
    public int g(boolean z10) {
        int i10 = this.f13279p;
        if (i10 == 0) {
            return -1;
        }
        if (this.f13281r) {
            z10 = false;
        }
        int g10 = z10 ? this.f13280q.g() : i10 - 1;
        while (I(g10).u()) {
            g10 = H(g10, z10);
            if (g10 == -1) {
                return -1;
            }
        }
        return F(g10) + I(g10).g(z10);
    }

    @Override // s1.l3
    public int i(int i10, int i11, boolean z10) {
        if (this.f13281r) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        int i12 = I(z11).i(i10 - F, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return F + i12;
        }
        int G = G(z11, z10);
        while (G != -1 && I(G).u()) {
            G = G(G, z10);
        }
        if (G != -1) {
            return F(G) + I(G).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // s1.l3
    public final l3.b k(int i10, l3.b bVar, boolean z10) {
        int y10 = y(i10);
        int F = F(y10);
        I(y10).k(i10 - E(y10), bVar, z10);
        bVar.f13544p += F;
        if (z10) {
            bVar.f13543o = D(C(y10), p3.a.e(bVar.f13543o));
        }
        return bVar;
    }

    @Override // s1.l3
    public final l3.b l(Object obj, l3.b bVar) {
        Object B = B(obj);
        Object A = A(obj);
        int x10 = x(B);
        int F = F(x10);
        I(x10).l(A, bVar);
        bVar.f13544p += F;
        bVar.f13543o = obj;
        return bVar;
    }

    @Override // s1.l3
    public int p(int i10, int i11, boolean z10) {
        if (this.f13281r) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        int p10 = I(z11).p(i10 - F, i11 != 2 ? i11 : 0, z10);
        if (p10 != -1) {
            return F + p10;
        }
        int H = H(z11, z10);
        while (H != -1 && I(H).u()) {
            H = H(H, z10);
        }
        if (H != -1) {
            return F(H) + I(H).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // s1.l3
    public final Object q(int i10) {
        int y10 = y(i10);
        return D(C(y10), I(y10).q(i10 - E(y10)));
    }

    @Override // s1.l3
    public final l3.d s(int i10, l3.d dVar, long j10) {
        int z10 = z(i10);
        int F = F(z10);
        int E = E(z10);
        I(z10).s(i10 - F, dVar, j10);
        Object C = C(z10);
        if (!l3.d.E.equals(dVar.f13553n)) {
            C = D(C, dVar.f13553n);
        }
        dVar.f13553n = C;
        dVar.B += E;
        dVar.C += E;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i10);

    protected abstract int z(int i10);
}
