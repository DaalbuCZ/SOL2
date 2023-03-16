package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class N2 extends B2 {

    /* renamed from: c  reason: collision with root package name */
    private double[] f9868c;

    /* renamed from: d  reason: collision with root package name */
    private int f9869d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N2(InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.stream.InterfaceC0342n2, j$.util.stream.InterfaceC0356q2
    public void c(double d10) {
        double[] dArr = this.f9868c;
        int i10 = this.f9869d;
        this.f9869d = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // j$.util.stream.AbstractC0322j2, j$.util.stream.InterfaceC0356q2
    public void h() {
        int i10 = 0;
        Arrays.sort(this.f9868c, 0, this.f9869d);
        this.f10062a.j(this.f9869d);
        if (this.f9781b) {
            while (i10 < this.f9869d && !this.f10062a.r()) {
                this.f10062a.c(this.f9868c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f9869d) {
                this.f10062a.c(this.f9868c[i10]);
                i10++;
            }
        }
        this.f10062a.h();
        this.f9868c = null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9868c = new double[(int) j10];
    }
}
