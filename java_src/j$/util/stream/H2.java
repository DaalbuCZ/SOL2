package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class H2 extends D2 {

    /* renamed from: c  reason: collision with root package name */
    private X2 f9820c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H2(InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.stream.InterfaceC0352p2, j$.util.stream.InterfaceC0356q2
    public void e(long j10) {
        this.f9820c.e(j10);
    }

    @Override // j$.util.stream.AbstractC0332l2, j$.util.stream.InterfaceC0356q2
    public void h() {
        long[] jArr = (long[]) this.f9820c.k();
        Arrays.sort(jArr);
        this.f10093a.j(jArr.length);
        int i10 = 0;
        if (this.f9799b) {
            int length = jArr.length;
            while (i10 < length) {
                long j10 = jArr[i10];
                if (this.f10093a.r()) {
                    break;
                }
                this.f10093a.e(j10);
                i10++;
            }
        } else {
            int length2 = jArr.length;
            while (i10 < length2) {
                this.f10093a.e(jArr[i10]);
                i10++;
            }
        }
        this.f10093a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9820c = j10 > 0 ? new X2((int) j10) : new X2();
    }
}
