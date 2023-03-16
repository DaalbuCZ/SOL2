package j$.util.stream;
/* loaded from: classes2.dex */
class H1 extends AbstractC0277a2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.f f9818b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f9819c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(int i10, j$.util.function.f fVar, double d10) {
        super(i10);
        this.f9818b = fVar;
        this.f9819c = d10;
    }

    @Override // j$.util.stream.AbstractC0277a2
    public Y1 b() {
        return new I1(this.f9819c, this.f9818b);
    }
}
