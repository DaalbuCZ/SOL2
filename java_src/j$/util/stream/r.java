package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class r extends AbstractC0307g2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(AbstractC0284c abstractC0284c, int i10, int i11) {
        super(abstractC0284c, i10, i11);
    }

    @Override // j$.util.stream.AbstractC0284c
    P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        if (EnumC0298e3.DISTINCT.g(d02.r0())) {
            return d02.j0(h10, false, nVar);
        }
        if (EnumC0298e3.ORDERED.g(d02.r0())) {
            return Z0(d02, h10);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new X(new C0339n(atomicBoolean, concurrentHashMap, 0), false).f(d02, h10);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new T0(keySet);
    }

    @Override // j$.util.stream.AbstractC0284c
    j$.util.H T0(D0 d02, j$.util.H h10) {
        return EnumC0298e3.DISTINCT.g(d02.r0()) ? d02.K0(h10) : EnumC0298e3.ORDERED.g(d02.r0()) ? ((T0) Z0(d02, h10)).spliterator() : new C0338m3(d02.K0(h10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        return EnumC0298e3.DISTINCT.g(i10) ? interfaceC0356q2 : EnumC0298e3.SORTED.g(i10) ? new C0349p(this, interfaceC0356q2) : new C0353q(this, interfaceC0356q2);
    }

    P0 Z0(D0 d02, j$.util.H h10) {
        return new T0((Collection) ((AbstractC0277a2) D0.F0(C0344o.f10108a, C0274a.f9954c, C0324k.f10065b)).f(d02, h10));
    }
}
