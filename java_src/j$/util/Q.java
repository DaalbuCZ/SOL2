package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class Q extends AbstractC0251a implements D {
    @Override // j$.util.D, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.s(this, consumer);
    }

    @Override // j$.util.D
    public void f(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
    }

    @Override // j$.util.D, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.e(this, consumer);
    }

    @Override // j$.util.D
    public boolean g(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        return false;
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.H
    public /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0251a.h(this);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0251a.j(this, i10);
    }

    @Override // j$.util.AbstractC0251a, j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ D trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0251a, j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ F trySplit() {
        return null;
    }
}
