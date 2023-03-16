package h2;

import h2.i0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class v implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private m1 f8050a;

    /* renamed from: b  reason: collision with root package name */
    private p3.i0 f8051b;

    /* renamed from: c  reason: collision with root package name */
    private x1.e0 f8052c;

    public v(String str) {
        this.f8050a = new m1.b().e0(str).E();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void b() {
        p3.a.h(this.f8051b);
        m0.j(this.f8052c);
    }

    @Override // h2.b0
    public void a(p3.a0 a0Var) {
        b();
        long d10 = this.f8051b.d();
        long e10 = this.f8051b.e();
        if (d10 == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        m1 m1Var = this.f8050a;
        if (e10 != m1Var.C) {
            m1 E = m1Var.b().i0(e10).E();
            this.f8050a = E;
            this.f8052c.e(E);
        }
        int a10 = a0Var.a();
        this.f8052c.d(a0Var, a10);
        this.f8052c.c(d10, 1, a10, 0, null);
    }

    @Override // h2.b0
    public void c(p3.i0 i0Var, x1.n nVar, i0.d dVar) {
        this.f8051b = i0Var;
        dVar.a();
        x1.e0 e10 = nVar.e(dVar.c(), 5);
        this.f8052c = e10;
        e10.e(this.f8050a);
    }
}
