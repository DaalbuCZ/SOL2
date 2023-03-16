package j$.util.stream;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0350p0 extends AbstractC0361s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0350p0(j$.util.H h10, int i10, boolean z10) {
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

    @Override // j$.util.stream.AbstractC0361s0, j$.util.stream.InterfaceC0369u0
    public void c(j$.util.function.r rVar) {
        j$.util.D a12;
        if (isParallel()) {
            super.c(rVar);
            return;
        }
        a12 = AbstractC0361s0.a1(X0());
        a12.f(rVar);
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h, j$.util.stream.H
    public /* bridge */ /* synthetic */ InterfaceC0369u0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0361s0, j$.util.stream.InterfaceC0369u0
    public void r(j$.util.function.r rVar) {
        j$.util.D a12;
        if (isParallel()) {
            Objects.requireNonNull(rVar);
            L0(new W(rVar, true));
            return;
        }
        a12 = AbstractC0361s0.a1(X0());
        a12.f(rVar);
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h, j$.util.stream.H
    public /* bridge */ /* synthetic */ InterfaceC0369u0 sequential() {
        sequential();
        return this;
    }
}
