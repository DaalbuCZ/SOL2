package j$.util.stream;
/* loaded from: classes2.dex */
final class V extends Y implements InterfaceC0347o2 {

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.m f9919b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(j$.util.function.m mVar, boolean z10) {
        super(z10);
        this.f9919b = mVar;
    }

    @Override // j$.util.stream.Y, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        this.f9919b.d(i10);
    }

    @Override // j$.util.function.Consumer
    /* renamed from: i */
    public /* synthetic */ void accept(Integer num) {
        D0.C(this, num);
    }
}
