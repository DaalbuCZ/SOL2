package h2;

import h2.i0;
import java.util.List;
import s1.m1;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<m1> f7753a;

    /* renamed from: b  reason: collision with root package name */
    private final x1.e0[] f7754b;

    public d0(List<m1> list) {
        this.f7753a = list;
        this.f7754b = new x1.e0[list.size()];
    }

    public void a(long j10, p3.a0 a0Var) {
        x1.c.a(j10, a0Var, this.f7754b);
    }

    public void b(x1.n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f7754b.length; i10++) {
            dVar.a();
            x1.e0 e10 = nVar.e(dVar.c(), 3);
            m1 m1Var = this.f7753a.get(i10);
            String str = m1Var.f13587y;
            p3.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = m1Var.f13576n;
            if (str2 == null) {
                str2 = dVar.b();
            }
            e10.e(new m1.b().S(str2).e0(str).g0(m1Var.f13579q).V(m1Var.f13578p).F(m1Var.Q).T(m1Var.A).E());
            this.f7754b[i10] = e10;
        }
    }
}
