package j$.util.stream;
/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0310h0 extends AbstractC0320j0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0310h0(AbstractC0284c abstractC0284c, int i10, int i11) {
        super(abstractC0284c, i11);
    }

    @Override // j$.util.stream.AbstractC0284c
    final boolean U0() {
        return true;
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
}