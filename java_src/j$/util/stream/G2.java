package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class G2 extends C2 {

    /* renamed from: c  reason: collision with root package name */
    private V2 f9816c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G2(InterfaceC0356q2 interfaceC0356q2) {
        super(interfaceC0356q2);
    }

    @Override // j$.util.stream.InterfaceC0347o2, j$.util.stream.InterfaceC0356q2
    public void d(int i10) {
        this.f9816c.d(i10);
    }

    @Override // j$.util.stream.AbstractC0327k2, j$.util.stream.InterfaceC0356q2
    public void h() {
        int[] iArr = (int[]) this.f9816c.k();
        Arrays.sort(iArr);
        this.f10081a.j(iArr.length);
        int i10 = 0;
        if (this.f9788b) {
            int length = iArr.length;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (this.f10081a.r()) {
                    break;
                }
                this.f10081a.d(i11);
                i10++;
            }
        } else {
            int length2 = iArr.length;
            while (i10 < length2) {
                this.f10081a.d(iArr[i10]);
                i10++;
            }
        }
        this.f10081a.h();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9816c = j10 > 0 ? new V2((int) j10) : new V2();
    }
}
