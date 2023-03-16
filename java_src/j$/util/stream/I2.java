package j$.util.stream;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
final class I2 extends D {
    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(AbstractC0284c abstractC0284c) {
        super(abstractC0284c, 4, EnumC0298e3.f10027q | EnumC0298e3.f10025o);
    }

    @Override // j$.util.stream.AbstractC0284c
    public P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        if (EnumC0298e3.SORTED.g(d02.r0())) {
            return d02.j0(h10, false, nVar);
        }
        double[] dArr = (double[]) ((J0) d02.j0(h10, true, nVar)).k();
        Arrays.sort(dArr);
        return new C0281b1(dArr);
    }

    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        return EnumC0298e3.SORTED.g(i10) ? interfaceC0356q2 : EnumC0298e3.SIZED.g(i10) ? new N2(interfaceC0356q2) : new F2(interfaceC0356q2);
    }
}
