package g1;
/* loaded from: classes.dex */
public final class l {
    private static p a(e1.f<?> fVar) {
        if (fVar instanceof s) {
            return ((s) fVar).d();
        }
        throw new IllegalArgumentException("Expected instance of TransportImpl.");
    }

    public static void b(e1.f<?> fVar, e1.d dVar) {
        u.c().e().u(a(fVar).f(dVar), 1);
    }
}
