package v9;

import b9.g;
import j9.p;
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: n  reason: collision with root package name */
    public final Throwable f15793n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ g f15794o;

    public a(Throwable th, g gVar) {
        this.f15793n = th;
        this.f15794o = gVar;
    }

    @Override // b9.g
    public g B(g.c<?> cVar) {
        return this.f15794o.B(cVar);
    }

    @Override // b9.g
    public <R> R S(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f15794o.S(r10, pVar);
    }

    @Override // b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        return (E) this.f15794o.c(cVar);
    }

    @Override // b9.g
    public g j(g gVar) {
        return this.f15794o.j(gVar);
    }
}
