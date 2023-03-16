package j$.util.stream;
/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0308g3 extends AbstractC0323j3 implements j$.util.function.h {

    /* renamed from: c  reason: collision with root package name */
    final double[] f10055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0308g3(int i10) {
        this.f10055c = new double[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0323j3
    public void a(Object obj, long j10) {
        j$.util.function.h hVar = (j$.util.function.h) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            hVar.c(this.f10055c[i10]);
        }
    }

    @Override // j$.util.function.h
    public void c(double d10) {
        double[] dArr = this.f10055c;
        int i10 = this.f10063b;
        this.f10063b = i10 + 1;
        dArr[i10] = d10;
    }
}
