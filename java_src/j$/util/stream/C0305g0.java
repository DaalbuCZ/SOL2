package j$.util.stream;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0305g0 extends AbstractC0320j0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0305g0(j$.util.H h10, int i10, boolean z10) {
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

    @Override // j$.util.stream.AbstractC0320j0, j$.util.stream.InterfaceC0330l0
    public void i(j$.util.function.m mVar) {
        j$.util.B a12;
        if (isParallel()) {
            super.i(mVar);
            return;
        }
        a12 = AbstractC0320j0.a1(X0());
        a12.m(mVar);
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h, j$.util.stream.H
    public /* bridge */ /* synthetic */ InterfaceC0330l0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h, j$.util.stream.H
    public /* bridge */ /* synthetic */ InterfaceC0330l0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC0320j0, j$.util.stream.InterfaceC0330l0
    public void x(j$.util.function.m mVar) {
        j$.util.B a12;
        if (isParallel()) {
            Objects.requireNonNull(mVar);
            L0(new V(mVar, true));
            return;
        }
        a12 = AbstractC0320j0.a1(X0());
        a12.m(mVar);
    }
}
