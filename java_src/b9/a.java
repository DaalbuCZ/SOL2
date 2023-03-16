package b9;

import b9.g;
import j9.p;
import k9.k;
/* loaded from: classes.dex */
public abstract class a implements g.b {

    /* renamed from: n  reason: collision with root package name */
    private final g.c<?> f2962n;

    public a(g.c<?> cVar) {
        k.e(cVar, "key");
        this.f2962n = cVar;
    }

    @Override // b9.g
    public g B(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // b9.g
    public <R> R S(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // b9.g.b, b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // b9.g.b
    public g.c<?> getKey() {
        return this.f2962n;
    }

    @Override // b9.g
    public g j(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
