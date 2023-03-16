package z2;

import h2.h0;
import p3.i0;
import s1.m1;
import x1.a0;
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final a0 f17180d = new a0();

    /* renamed from: a  reason: collision with root package name */
    final x1.l f17181a;

    /* renamed from: b  reason: collision with root package name */
    private final m1 f17182b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f17183c;

    public b(x1.l lVar, m1 m1Var, i0 i0Var) {
        this.f17181a = lVar;
        this.f17182b = m1Var;
        this.f17183c = i0Var;
    }

    @Override // z2.j
    public boolean a() {
        x1.l lVar = this.f17181a;
        return (lVar instanceof h2.h) || (lVar instanceof h2.b) || (lVar instanceof h2.e) || (lVar instanceof e2.f);
    }

    @Override // z2.j
    public boolean b(x1.m mVar) {
        return this.f17181a.i(mVar, f17180d) == 0;
    }

    @Override // z2.j
    public void c(x1.n nVar) {
        this.f17181a.c(nVar);
    }

    @Override // z2.j
    public void d() {
        this.f17181a.b(0L, 0L);
    }

    @Override // z2.j
    public boolean e() {
        x1.l lVar = this.f17181a;
        return (lVar instanceof h0) || (lVar instanceof f2.g);
    }

    @Override // z2.j
    public j f() {
        x1.l fVar;
        p3.a.f(!e());
        x1.l lVar = this.f17181a;
        if (lVar instanceof t) {
            fVar = new t(this.f17182b.f13578p, this.f17183c);
        } else if (lVar instanceof h2.h) {
            fVar = new h2.h();
        } else if (lVar instanceof h2.b) {
            fVar = new h2.b();
        } else if (lVar instanceof h2.e) {
            fVar = new h2.e();
        } else if (!(lVar instanceof e2.f)) {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f17181a.getClass().getSimpleName());
        } else {
            fVar = new e2.f();
        }
        return new b(fVar, this.f17182b, this.f17183c);
    }
}
