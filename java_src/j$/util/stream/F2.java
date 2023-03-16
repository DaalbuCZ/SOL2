package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class F2 extends B2 {

    /* renamed from: c  reason: collision with root package name */
    private T2 f9811c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.stream.InterfaceC0342n2, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        this.f9811c.c(d10);
    }

    @Override // j$.util.stream.AbstractC0322j2, j$.util.stream.InterfaceC0356q2
    public void h() {
        double[] dArr = (double[]) this.f9811c.k();
        Arrays.sort(dArr);
        this.f10062a.j(dArr.length);
        int i10 = 0;
        if (this.f9781b) {
            int length = dArr.length;
            while (i10 < length) {
                double d10 = dArr[i10];
                if (this.f10062a.r()) {
                    break;
                }
                this.f10062a.c(d10);
                i10++;
            }
        } else {
            int length2 = dArr.length;
            while (i10 < length2) {
                this.f10062a.c(dArr[i10]);
                i10++;
            }
        }
        this.f10062a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9811c = j10 > 0 ? new T2((int) j10) : new T2();
    }
}
