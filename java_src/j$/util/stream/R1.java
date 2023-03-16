package j$.util.stream;
/* loaded from: classes2.dex */
class R1 extends AbstractC0277a2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.k f9892b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f9893c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(int i10, j$.util.function.k kVar, int i11) {
        super(i10);
        this.f9892b = kVar;
        this.f9893c = i11;
    }

    @Override // j$.util.stream.AbstractC0277a2
    public Y1 b() {
        return new S1(this.f9893c, this.f9892b);
    }
}
