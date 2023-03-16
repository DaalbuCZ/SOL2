package j$.util.stream;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class C extends F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C(j$.util.H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final boolean U0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public final InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.F, j$.util.stream.H
    public void f(j$.util.function.h hVar) {
        j$.util.z a12;
        if (isParallel()) {
            super.f(hVar);
            return;
        }
        a12 = F.a1(X0());
        a12.l(hVar);
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h, j$.util.stream.H
    public /* bridge */ /* synthetic */ H parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h, j$.util.stream.H
    public /* bridge */ /* synthetic */ H sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.F, j$.util.stream.H
    public void y(j$.util.function.h hVar) {
        j$.util.z a12;
        if (isParallel()) {
            Objects.requireNonNull(hVar);
            L0(new U(hVar, true));
            return;
        }
        a12 = F.a1(X0());
        a12.l(hVar);
    }
}
