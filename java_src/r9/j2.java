package r9;

import b9.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j2 implements g.b, g.c<j2> {

    /* renamed from: n  reason: collision with root package name */
    public static final j2 f13126n = new j2();

    private j2() {
    }

    @Override // b9.g
    public b9.g B(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // b9.g
    public <R> R S(R r10, j9.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // b9.g.b, b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // b9.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // b9.g
    public b9.g j(b9.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
