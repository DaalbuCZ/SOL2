package j$.util.stream;

import j$.util.C0268m;
import j$.util.function.BiConsumer;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0320j0 extends AbstractC0284c implements InterfaceC0330l0 {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f10061t = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0320j0(j$.util.H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0320j0(AbstractC0284c abstractC0284c, int i10) {
        super(abstractC0284c, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.B a1(j$.util.H h10) {
        if (h10 instanceof j$.util.B) {
            return (j$.util.B) h10;
        }
        if (O3.f9877a) {
            O3.a(AbstractC0284c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final H0 C0(long j10, j$.util.function.n nVar) {
        return D0.s0(j10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final P0 N0(D0 d02, j$.util.H h10, boolean z10, j$.util.function.n nVar) {
        return D0.b0(d02, h10, z10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final void O0(j$.util.H h10, InterfaceC0356q2 interfaceC0356q2) {
        j$.util.function.m c0285c0;
        j$.util.B a12 = a1(h10);
        if (interfaceC0356q2 instanceof j$.util.function.m) {
            c0285c0 = (j$.util.function.m) interfaceC0356q2;
        } else if (O3.f9877a) {
            O3.a(AbstractC0284c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            c0285c0 = new C0285c0(interfaceC0356q2, 0);
        }
        while (!interfaceC0356q2.r() && a12.i(c0285c0)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public final int P0() {
        return 2;
    }

    @Override // j$.util.stream.AbstractC0284c
    final j$.util.H Y0(D0 d02, j$.util.function.A a10, boolean z10) {
        return new q3(d02, a10, z10);
    }

    public final Object b1(j$.util.function.A a10, j$.util.function.v vVar, BiConsumer biConsumer) {
        C0368u c0368u = new C0368u(biConsumer, 1);
        Objects.requireNonNull(a10);
        Objects.requireNonNull(vVar);
        return L0(new F1(2, c0368u, vVar, a10, 4));
    }

    public final InterfaceC0369u0 c1(j$.util.function.o oVar) {
        Objects.requireNonNull(oVar);
        return new A(this, this, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n, oVar, 1);
    }

    public final Stream d1(j$.util.function.n nVar) {
        Objects.requireNonNull(nVar);
        return new C0384y(this, this, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n, nVar, 1);
    }

    public final C0268m e1(j$.util.function.k kVar) {
        Objects.requireNonNull(kVar);
        return (C0268m) L0(new J1(2, kVar, 2));
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h
    /* renamed from: f1 */
    public final j$.util.B spliterator() {
        return a1(super.spliterator());
    }

    public void i(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        L0(new V(mVar, false));
    }

    @Override // j$.util.stream.InterfaceC0309h
    public Iterator iterator() {
        return j$.util.W.g(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0309h
    public InterfaceC0309h unordered() {
        return !Q0() ? this : new C0300f0(this, this, 2, EnumC0298e3.f10028r);
    }

    public void x(j$.util.function.m mVar) {
        Objects.requireNonNull(mVar);
        L0(new V(mVar, true));
    }
}
