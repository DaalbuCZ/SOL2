package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class E extends F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public E(AbstractC0284c abstractC0284c, int i10, int i11) {
        super(abstractC0284c, i11);
    }

    @Override // j$.util.stream.AbstractC0284c
    final boolean U0() {
        return false;
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
