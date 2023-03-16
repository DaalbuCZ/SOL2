package j$.util.stream;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
final class J2 extends AbstractC0310h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public J2(AbstractC0284c abstractC0284c) {
        super(abstractC0284c, 2, EnumC0298e3.f10027q | EnumC0298e3.f10025o);
    }

    @Override // j$.util.stream.AbstractC0284c
    public P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        if (EnumC0298e3.SORTED.g(d02.r0())) {
            return d02.j0(h10, false, nVar);
        }
        int[] iArr = (int[]) ((L0) d02.j0(h10, true, nVar)).k();
        Arrays.sort(iArr);
        return new C0326k1(iArr);
    }

    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        return EnumC0298e3.SORTED.g(i10) ? interfaceC0356q2 : EnumC0298e3.SIZED.g(i10) ? new O2(interfaceC0356q2) : new G2(interfaceC0356q2);
    }
}
