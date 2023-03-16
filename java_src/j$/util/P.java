package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class P extends AbstractC0251a implements B {
    @Override // j$.util.B, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.r(this, consumer);
    }

    @Override // j$.util.B, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.d(this, consumer);
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

    @Override // j$.util.B
    public boolean i(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        return false;
    }

    @Override // j$.util.B
    public void m(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
    }

    @Override // j$.util.AbstractC0251a, j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ B trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0251a, j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ F trySplit() {
        return null;
    }
}
