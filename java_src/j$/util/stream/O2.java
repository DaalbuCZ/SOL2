package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: c  reason: collision with root package name */
    private int[] f9875c;

    /* renamed from: d  reason: collision with root package name */
    private int f9876d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2(InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.stream.InterfaceC0347o2, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        int[] iArr = this.f9875c;
        int i11 = this.f9876d;
        this.f9876d = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // j$.util.stream.AbstractC0327k2, j$.util.stream.InterfaceC0356q2
    public void h() {
        int i10 = 0;
        Arrays.sort(this.f9875c, 0, this.f9876d);
        this.f10081a.j(this.f9876d);
        if (this.f9788b) {
            while (i10 < this.f9876d && !this.f10081a.r()) {
                this.f10081a.d(this.f9875c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f9876d) {
                this.f10081a.d(this.f9875c[i10]);
                i10++;
            }
        }
        this.f10081a.h();
        this.f9875c = null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9875c = new int[(int) j10];
    }
}
