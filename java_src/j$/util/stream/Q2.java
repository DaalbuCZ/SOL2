package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f9887d;

    /* renamed from: e  reason: collision with root package name */
    private int f9888e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q2(InterfaceC0356q2 interfaceC0356q2, Comparator comparator) {
        super(interfaceC0356q2, comparator);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        Object[] objArr = this.f9887d;
        int i10 = this.f9888e;
        this.f9888e = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.stream.AbstractC0337m2, j$.util.stream.InterfaceC0356q2
    public void h() {
        int i10 = 0;
        Arrays.sort(this.f9887d, 0, this.f9888e, this.f9803b);
        this.f10096a.j(this.f9888e);
        if (this.f9804c) {
            while (i10 < this.f9888e && !this.f10096a.r()) {
                this.f10096a.accept(this.f9887d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f9888e) {
                this.f10096a.accept(this.f9887d[i10]);
                i10++;
            }
        }
        this.f10096a.h();
        this.f9887d = null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f9887d = new Object[(int) j10];
    }
}
