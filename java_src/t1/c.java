package t1;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import s1.l2;
import s1.l3;
import s1.o2;
import s1.p2;
import s1.q3;
import s1.u1;
import s1.z1;
import u2.u;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f14497a;

        /* renamed from: b  reason: collision with root package name */
        public final l3 f14498b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14499c;

        /* renamed from: d  reason: collision with root package name */
        public final u.b f14500d;

        /* renamed from: e  reason: collision with root package name */
        public final long f14501e;

        /* renamed from: f  reason: collision with root package name */
        public final l3 f14502f;

        /* renamed from: g  reason: collision with root package name */
        public final int f14503g;

        /* renamed from: h  reason: collision with root package name */
        public final u.b f14504h;

        /* renamed from: i  reason: collision with root package name */
        public final long f14505i;

        /* renamed from: j  reason: collision with root package name */
        public final long f14506j;

        public a(long j10, l3 l3Var, int i10, u.b bVar, long j11, l3 l3Var2, int i11, u.b bVar2, long j12, long j13) {
            this.f14497a = j10;
            this.f14498b = l3Var;
            this.f14499c = i10;
            this.f14500d = bVar;
            this.f14501e = j11;
            this.f14502f = l3Var2;
            this.f14503g = i11;
            this.f14504h = bVar2;
            this.f14505i = j12;
            this.f14506j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14497a == aVar.f14497a && this.f14499c == aVar.f14499c && this.f14501e == aVar.f14501e && this.f14503g == aVar.f14503g && this.f14505i == aVar.f14505i && this.f14506j == aVar.f14506j && a5.i.a(this.f14498b, aVar.f14498b) && a5.i.a(this.f14500d, aVar.f14500d) && a5.i.a(this.f14502f, aVar.f14502f) && a5.i.a(this.f14504h, aVar.f14504h);
        }

        public int hashCode() {
            return a5.i.b(Long.valueOf(this.f14497a), this.f14498b, Integer.valueOf(this.f14499c), this.f14500d, Long.valueOf(this.f14501e), this.f14502f, Integer.valueOf(this.f14503g), this.f14504h, Long.valueOf(this.f14505i), Long.valueOf(this.f14506j));
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final p3.l f14507a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f14508b;

        public b(p3.l lVar, SparseArray<a> sparseArray) {
            this.f14507a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.c());
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                int b10 = lVar.b(i10);
                sparseArray2.append(b10, (a) p3.a.e(sparseArray.get(b10)));
            }
            this.f14508b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f14507a.a(i10);
        }

        public int b(int i10) {
            return this.f14507a.b(i10);
        }

        public a c(int i10) {
            return (a) p3.a.e(this.f14508b.get(i10));
        }

        public int d() {
            return this.f14507a.c();
        }
    }

    void A(a aVar, boolean z10);

    void B(a aVar, int i10);

    @Deprecated
    void C(a aVar, int i10);

    void D(a aVar);

    void E(a aVar, int i10, boolean z10);

    void F(a aVar, float f10);

    void G(a aVar, Exception exc);

    void H(a aVar, int i10);

    @Deprecated
    void I(a aVar, List<d3.b> list);

    void J(a aVar, l2 l2Var);

    void K(a aVar, u2.n nVar, u2.q qVar, IOException iOException, boolean z10);

    void L(a aVar, s1.m1 m1Var, v1.i iVar);

    void M(a aVar, boolean z10);

    void N(p2 p2Var, b bVar);

    @Deprecated
    void O(a aVar);

    void T(a aVar, s1.m1 m1Var, v1.i iVar);

    void U(a aVar, Exception exc);

    void V(a aVar, int i10, long j10, long j11);

    @Deprecated
    void W(a aVar, s1.m1 m1Var);

    void X(a aVar, int i10, long j10);

    @Deprecated
    void Y(a aVar, String str, long j10);

    void Z(a aVar, u1 u1Var, int i10);

    @Deprecated
    void a(a aVar);

    @Deprecated
    void a0(a aVar, boolean z10);

    @Deprecated
    void b(a aVar, int i10, s1.m1 m1Var);

    void b0(a aVar, Object obj, long j10);

    void c(a aVar, long j10, int i10);

    void c0(a aVar, boolean z10, int i10);

    @Deprecated
    void d(a aVar, String str, long j10);

    void d0(a aVar, int i10, int i11);

    void e(a aVar, q3.z zVar);

    @Deprecated
    void e0(a aVar);

    void f(a aVar);

    @Deprecated
    void f0(a aVar, int i10, int i11, int i12, float f10);

    void g(a aVar, u2.q qVar);

    void g0(a aVar, s1.o oVar);

    void h(a aVar, int i10, long j10, long j11);

    void h0(a aVar, String str);

    void i(a aVar, u2.q qVar);

    @Deprecated
    void i0(a aVar, boolean z10, int i10);

    void j(a aVar, v1.e eVar);

    void j0(a aVar, p2.e eVar, p2.e eVar2, int i10);

    void k(a aVar, o2 o2Var);

    void k0(a aVar, int i10);

    void l(a aVar);

    @Deprecated
    void l0(a aVar, int i10, v1.e eVar);

    void m(a aVar, String str, long j10, long j11);

    void m0(a aVar);

    @Deprecated
    void n(a aVar, int i10, v1.e eVar);

    void n0(a aVar, boolean z10);

    void o(a aVar, v1.e eVar);

    void o0(a aVar, u2.n nVar, u2.q qVar);

    @Deprecated
    void p(a aVar, s1.m1 m1Var);

    void p0(a aVar, Exception exc);

    @Deprecated
    void q(a aVar, int i10, String str, long j10);

    void q0(a aVar, v1.e eVar);

    void r(a aVar, q3 q3Var);

    void r0(a aVar, int i10);

    void s(a aVar, l2 l2Var);

    void s0(a aVar, u2.n nVar, u2.q qVar);

    void t(a aVar, u2.n nVar, u2.q qVar);

    void t0(a aVar, String str);

    void u(a aVar, long j10);

    void u0(a aVar, int i10);

    void v(a aVar, Exception exc);

    void v0(a aVar, k2.a aVar2);

    void w(a aVar, z1 z1Var);

    void w0(a aVar, u1.e eVar);

    void x(a aVar, v1.e eVar);

    void x0(a aVar, d3.e eVar);

    void y(a aVar, p2.b bVar);

    void y0(a aVar);

    void z(a aVar, String str, long j10, long j11);
}
