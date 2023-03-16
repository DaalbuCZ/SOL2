package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0382x1 extends A1 implements InterfaceC0347o2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f10174h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0382x1(j$.util.H h10, D0 d02, int[] iArr) {
        super(h10, d02, iArr.length);
        this.f10174h = iArr;
    }

    C0382x1(C0382x1 c0382x1, j$.util.H h10, long j10, long j11) {
        super(c0382x1, h10, j10, j11, c0382x1.f10174h.length);
        this.f10174h = c0382x1.f10174h;
    }

    @Override // j$.util.stream.A1
    A1 a(j$.util.H h10, long j10, long j11) {
        return new C0382x1(this, h10, j10, j11);
    }

    @Override // j$.util.stream.A1, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        int i11 = this.f9769f;
        if (i11 >= this.f9770g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f9769f));
        }
        int[] iArr = this.f10174h;
        this.f9769f = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: f */
    public /* synthetic */ void accept(Integer num) {
        D0.C(this, num);
    }
}
