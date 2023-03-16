package j$.util.stream;
/* renamed from: j$.util.stream.i3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0318i3 extends AbstractC0323j3 implements j$.util.function.r {

    /* renamed from: c  reason: collision with root package name */
    final long[] f10059c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0318i3(int i10) {
        this.f10059c = new long[i10];
    }

    @Override // j$.util.stream.AbstractC0323j3
    public void a(Object obj, long j10) {
        j$.util.function.r rVar = (j$.util.function.r) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            rVar.e(this.f10059c[i10]);
        }
    }

    @Override // j$.util.function.r
    public void e(long j10) {
        long[] jArr = this.f10059c;
        int i10 = this.f10063b;
        this.f10063b = i10 + 1;
        jArr[i10] = j10;
    }
}
