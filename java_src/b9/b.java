package b9;

import b9.g;
import b9.g.b;
import j9.l;
import k9.k;
/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: n  reason: collision with root package name */
    private final l<g.b, E> f2963n;

    /* renamed from: o  reason: collision with root package name */
    private final g.c<?> f2964o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j9.l<b9.g$b, E extends B>, j9.l<? super b9.g$b, ? extends E extends B>, java.lang.Object] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        k.e(cVar, "baseKey");
        k.e(lVar, "safeCast");
        this.f2963n = lVar;
        this.f2964o = cVar instanceof b ? (g.c<B>) ((b) cVar).f2964o : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        k.e(cVar, "key");
        return cVar == this || this.f2964o == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lb9/g$b;)TE; */
    public final g.b b(g.b bVar) {
        k.e(bVar, "element");
        return (g.b) this.f2963n.c(bVar);
    }
}
