package b9;

import b9.g;
import j9.p;
import java.io.Serializable;
import k9.k;
/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: n  reason: collision with root package name */
    public static final h f2971n = new h();

    private h() {
    }

    @Override // b9.g
    public g B(g.c<?> cVar) {
        k.e(cVar, "key");
        return this;
    }

    @Override // b9.g
    public <R> R S(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return r10;
    }

    @Override // b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        k.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // b9.g
    public g j(g gVar) {
        k.e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
