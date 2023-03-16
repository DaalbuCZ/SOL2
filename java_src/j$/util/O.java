package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class O extends AbstractC0251a implements z {
    @Override // j$.util.z, j$.util.H
    public /* synthetic */ boolean a(Consumer consumer) {
        return AbstractC0251a.q(this, consumer);
    }

    @Override // j$.util.z, j$.util.H
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0251a.c(this, consumer);
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

    @Override // j$.util.z
    public boolean k(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        return false;
    }

    @Override // j$.util.z
    public void l(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
    }

    @Override // j$.util.AbstractC0251a, j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ F trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0251a, j$.util.F, j$.util.H
    public /* bridge */ /* synthetic */ z trySplit() {
        return null;
    }
}
