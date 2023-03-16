package j$.util.stream;
/* loaded from: classes2.dex */
class V1 extends AbstractC0277a2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.p f9923b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f9924c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(int i10, j$.util.function.p pVar, long j10) {
        super(i10);
        this.f9923b = pVar;
        this.f9924c = j10;
    }

    @Override // j$.util.stream.AbstractC0277a2
    public Y1 b() {
        return new W1(this.f9924c, this.f9923b);
    }
}
