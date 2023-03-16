package j$.util.stream;

import j$.util.AbstractC0251a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class L2 extends AbstractC0307g2 {

    /* renamed from: u  reason: collision with root package name */
    private final boolean f9853u;

    /* renamed from: v  reason: collision with root package name */
    private final Comparator f9854v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC0284c abstractC0284c) {
        super(abstractC0284c, 1, EnumC0298e3.f10027q | EnumC0298e3.f10025o);
        this.f9853u = true;
        this.f9854v = AbstractC0251a.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC0284c abstractC0284c, Comparator comparator) {
        super(abstractC0284c, 1, EnumC0298e3.f10027q | EnumC0298e3.f10026p);
        this.f9853u = false;
        Objects.requireNonNull(comparator);
        this.f9854v = comparator;
    }

    @Override // j$.util.stream.AbstractC0284c
    public P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        if (EnumC0298e3.SORTED.g(d02.r0()) && this.f9853u) {
            return d02.j0(h10, false, nVar);
        }
        Object[] o10 = d02.j0(h10, true, nVar).o(nVar);
        Arrays.sort(o10, this.f9854v);
        return new S0(o10);
    }

    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        return (EnumC0298e3.SORTED.g(i10) && this.f9853u) ? interfaceC0356q2 : EnumC0298e3.SIZED.g(i10) ? new Q2(interfaceC0356q2, this.f9854v) : new M2(interfaceC0356q2, this.f9854v);
    }
}
