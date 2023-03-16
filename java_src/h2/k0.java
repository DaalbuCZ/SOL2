package h2;

import h2.i0;
import java.util.List;
import s1.m1;
/* loaded from: classes.dex */
final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<m1> f7874a;

    /* renamed from: b  reason: collision with root package name */
    private final x1.e0[] f7875b;

    public k0(List<m1> list) {
        this.f7874a = list;
        this.f7875b = new x1.e0[list.size()];
    }

    public void a(long j10, p3.a0 a0Var) {
        if (a0Var.a() < 9) {
            return;
        }
        int m10 = a0Var.m();
        int m11 = a0Var.m();
        int C = a0Var.C();
        if (m10 == 434 && m11 == 1195456820 && C == 3) {
            x1.c.b(j10, a0Var, this.f7875b);
        }
    }

    public void b(x1.n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f7875b.length; i10++) {
            dVar.a();
            x1.e0 e10 = nVar.e(dVar.c(), 3);
            m1 m1Var = this.f7874a.get(i10);
            String str = m1Var.f13587y;
            p3.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            e10.e(new m1.b().S(dVar.b()).e0(str).g0(m1Var.f13579q).V(m1Var.f13578p).F(m1Var.Q).T(m1Var.A).E());
            this.f7875b[i10] = e10;
        }
    }
}
