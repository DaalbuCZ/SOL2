package b5;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends h0<Comparable<?>> implements Serializable {

    /* renamed from: n  reason: collision with root package name */
    static final e0 f2813n = new e0();

    private e0() {
    }

    @Override // b5.h0
    public <S extends Comparable<?>> h0<S> d() {
        return m0.f2851n;
    }

    @Override // b5.h0, java.util.Comparator
    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        a5.j.i(comparable);
        a5.j.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
