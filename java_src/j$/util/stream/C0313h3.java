package j$.util.stream;
/* renamed from: j$.util.stream.h3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0313h3 extends AbstractC0323j3 implements j$.util.function.m {

    /* renamed from: c  reason: collision with root package name */
    final int[] f10056c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0313h3(int i10) {
        this.f10056c = new int[i10];
    }

    @Override // j$.util.stream.AbstractC0323j3
    public void a(Object obj, long j10) {
        j$.util.function.m mVar = (j$.util.function.m) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            mVar.d(this.f10056c[i10]);
        }
    }

    @Override // j$.util.function.m
    public void d(int i10) {
        int[] iArr = this.f10056c;
        int i11 = this.f10063b;
        this.f10063b = i11 + 1;
        iArr[i11] = i10;
    }
}
