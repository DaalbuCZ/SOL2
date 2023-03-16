package w2;

import o3.o0;
import s1.m1;
import w2.g;
/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f16040j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f16041k;

    /* renamed from: l  reason: collision with root package name */
    private long f16042l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f16043m;

    public m(o3.l lVar, o3.p pVar, m1 m1Var, int i10, Object obj, g gVar) {
        super(lVar, pVar, 2, m1Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f16040j = gVar;
    }

    @Override // o3.h0.e
    public void b() {
        if (this.f16042l == 0) {
            this.f16040j.c(this.f16041k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            o3.p e10 = this.f16004b.e(this.f16042l);
            o0 o0Var = this.f16011i;
            x1.f fVar = new x1.f(o0Var, e10.f12040g, o0Var.n(e10));
            while (!this.f16043m && this.f16040j.b(fVar)) {
            }
            this.f16042l = fVar.q() - this.f16004b.f12040g;
        } finally {
            o3.o.a(this.f16011i);
        }
    }

    @Override // o3.h0.e
    public void c() {
        this.f16043m = true;
    }

    public void g(g.b bVar) {
        this.f16041k = bVar;
    }
}
