package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c  reason: collision with root package name */
    private long[] f9881c;

    /* renamed from: d  reason: collision with root package name */
    private int f9882d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.stream.InterfaceC0352p2, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        long[] jArr = this.f9881c;
        int i10 = this.f9882d;
        this.f9882d = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // j$.util.stream.AbstractC0332l2, j$.util.stream.InterfaceC0356q2
    public void h() {
        int i10 = 0;
        Arrays.sort(this.f9881c, 0, this.f9882d);
        this.f10093a.j(this.f9882d);
        if (this.f9799b) {
            while (i10 < this.f9882d && !this.f10093a.r()) {
                this.f10093a.e(this.f9881c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f9882d) {
                this.f10093a.e(this.f9881c[i10]);
                i10++;
            }
        }
        this.f10093a.h();
        this.f9881c = null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9881c = new long[(int) j10];
    }
}
