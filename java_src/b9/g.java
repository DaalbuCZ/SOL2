package b9;

import b9.e;
import j9.p;
import k9.k;
import k9.l;
/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b9.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0068a extends l implements p<g, b, g> {

            /* renamed from: o  reason: collision with root package name */
            public static final C0068a f2970o = new C0068a();

            C0068a() {
                super(2);
            }

            @Override // j9.p
            /* renamed from: a */
            public final g k(g gVar, b bVar) {
                b9.c cVar;
                k.e(gVar, "acc");
                k.e(bVar, "element");
                g B = gVar.B(bVar.getKey());
                h hVar = h.f2971n;
                if (B == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f2968b;
                e eVar = (e) B.c(bVar2);
                if (eVar == null) {
                    cVar = new b9.c(B, bVar);
                } else {
                    g B2 = B.B(bVar2);
                    if (B2 == hVar) {
                        return new b9.c(bVar, eVar);
                    }
                    cVar = new b9.c(new b9.c(B2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            k.e(gVar2, "context");
            return gVar2 == h.f2971n ? gVar : (g) gVar2.S(gVar, C0068a.f2970o);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends g {

        /* loaded from: classes.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                k.e(pVar, "operation");
                return pVar.k(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                k.e(cVar, "key");
                if (k.a(bVar.getKey(), cVar)) {
                    k.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                k.e(cVar, "key");
                return k.a(bVar.getKey(), cVar) ? h.f2971n : bVar;
            }

            public static g d(b bVar, g gVar) {
                k.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // b9.g
        <E extends b> E c(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    g B(c<?> cVar);

    <R> R S(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E c(c<E> cVar);

    g j(g gVar);
}
