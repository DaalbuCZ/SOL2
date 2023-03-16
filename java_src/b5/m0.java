package b5;

import java.io.Serializable;
/* loaded from: classes.dex */
final class m0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    static final m0 f2851n = new m0();

    private m0() {
    }

    @Override // b5.h0
    public <S extends Comparable<?>> h0<S> d() {
        return h0.b();
    }

    @Override // b5.h0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        a5.j.i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
