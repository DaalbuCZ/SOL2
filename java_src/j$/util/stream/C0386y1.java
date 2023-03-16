package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0386y1 extends A1 implements InterfaceC0352p2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f10183h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0386y1(j$.util.H h10, D0 d02, long[] jArr) {
        super(h10, d02, jArr.length);
        this.f10183h = jArr;
    }

    C0386y1(C0386y1 c0386y1, j$.util.H h10, long j10, long j11) {
        super(c0386y1, h10, j10, j11, c0386y1.f10183h.length);
        this.f10183h = c0386y1.f10183h;
    }

    @Override // j$.util.stream.A1
    A1 a(j$.util.H h10, long j10, long j11) {
        return new C0386y1(this, h10, j10, j11);
    }

    @Override // j$.util.stream.A1, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        int i10 = this.f9769f;
        if (i10 >= this.f9770g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f9769f));
        }
        long[] jArr = this.f10183h;
        this.f9769f = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: f */
    public /* synthetic */ void accept(Long l10) {
        D0.D(this, l10);
    }
}
