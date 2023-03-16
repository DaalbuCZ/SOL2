package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0378w1 extends A1 implements InterfaceC0342n2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f10166h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0378w1(j$.util.H h10, D0 d02, double[] dArr) {
        super(h10, d02, dArr.length);
        this.f10166h = dArr;
    }

    C0378w1(C0378w1 c0378w1, j$.util.H h10, long j10, long j11) {
        super(c0378w1, h10, j10, j11, c0378w1.f10166h.length);
        this.f10166h = c0378w1.f10166h;
    }

    @Override // j$.util.stream.A1
    A1 a(j$.util.H h10, long j10, long j11) {
        return new C0378w1(this, h10, j10, j11);
    }

    @Override // j$.util.stream.A1, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        int i10 = this.f9769f;
        if (i10 >= this.f9770g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f9769f));
        }
        double[] dArr = this.f10166h;
        this.f9769f = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: f */
    public /* synthetic */ void accept(Double d10) {
        D0.B(this, d10);
    }
}
