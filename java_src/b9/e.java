package b9;

import b9.g;
import k9.k;
/* loaded from: classes.dex */
public interface e extends g.b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f2968b = b.f2969n;

    /* loaded from: classes.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            k.e(cVar, "key");
            if (!(cVar instanceof b9.b)) {
                if (e.f2968b == cVar) {
                    k.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return eVar;
                }
                return null;
            }
            b9.b bVar = (b9.b) cVar;
            if (bVar.a(eVar.getKey())) {
                E e10 = (E) bVar.b(eVar);
                if (e10 instanceof g.b) {
                    return e10;
                }
                return null;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> cVar) {
            k.e(cVar, "key");
            if (!(cVar instanceof b9.b)) {
                return e.f2968b == cVar ? h.f2971n : eVar;
            }
            b9.b bVar = (b9.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f2971n;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<e> {

        /* renamed from: n  reason: collision with root package name */
        static final /* synthetic */ b f2969n = new b();

        private b() {
        }
    }

    void R(d<?> dVar);

    <T> d<T> p(d<? super T> dVar);
}
