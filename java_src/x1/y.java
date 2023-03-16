package x1;

import java.io.EOFException;
import p2.h;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f16299a = new p3.a0(10);

    public k2.a a(m mVar, h.a aVar) {
        k2.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                mVar.o(this.f16299a.d(), 0, 10);
                this.f16299a.O(0);
                if (this.f16299a.F() != 4801587) {
                    break;
                }
                this.f16299a.P(3);
                int B = this.f16299a.B();
                int i11 = B + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f16299a.d(), 0, bArr, 0, 10);
                    mVar.o(bArr, 10, B);
                    aVar2 = new p2.h(aVar).e(bArr, i11);
                } else {
                    mVar.p(B);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        mVar.g();
        mVar.p(i10);
        return aVar2;
    }
}
