package j$.util.stream;
/* loaded from: classes2.dex */
abstract class D extends F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public D(AbstractC0284c abstractC0284c, int i10, int i11) {
        super(abstractC0284c, i11);
    }

    @Override // j$.util.stream.AbstractC0284c
    final boolean U0() {
        return true;
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
}
