package j$.util.stream;

import j$.util.C0267l;
import j$.util.function.BiConsumer;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
abstract class F extends AbstractC0284c implements H {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f9806t = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(j$.util.H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(AbstractC0284c abstractC0284c, int i10) {
        super(abstractC0284c, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.z a1(j$.util.H h10) {
        if (h10 instanceof j$.util.z) {
            return (j$.util.z) h10;
        }
        if (O3.f9877a) {
            O3.a(AbstractC0284c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final H0 C0(long j10, j$.util.function.n nVar) {
        return D0.g0(j10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final P0 N0(D0 d02, j$.util.H h10, boolean z10, j$.util.function.n nVar) {
        return D0.a0(d02, h10, z10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final void O0(j$.util.H h10, InterfaceC0356q2 interfaceC0356q2) {
        j$.util.function.h c0372v;
        j$.util.z a12 = a1(h10);
        if (interfaceC0356q2 instanceof j$.util.function.h) {
            c0372v = (j$.util.function.h) interfaceC0356q2;
        } else if (O3.f9877a) {
            O3.a(AbstractC0284c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            c0372v = new C0372v(interfaceC0356q2, 0);
        }
        while (!interfaceC0356q2.r() && a12.k(c0372v)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public final int P0() {
        return 4;
    }

    @Override // j$.util.stream.AbstractC0284c
    final j$.util.H Y0(D0 d02, j$.util.function.A a10, boolean z10) {
        return new C0348o3(d02, a10, z10);
    }

    public final Object b1(j$.util.function.A a10, j$.util.function.u uVar, BiConsumer biConsumer) {
        C0368u c0368u = new C0368u(biConsumer, 0);
        Objects.requireNonNull(a10);
        Objects.requireNonNull(uVar);
        return L0(new F1(4, c0368u, uVar, a10, 1));
    }

    public final InterfaceC0369u0 c1(j$.util.function.j jVar) {
        Objects.requireNonNull(jVar);
        return new A(this, this, 4, EnumC0298e3.f10026p | EnumC0298e3.f10024n, jVar, 0);
    }

    public final Stream d1(j$.util.function.i iVar) {
        Objects.requireNonNull(iVar);
        return new C0384y(this, this, 4, EnumC0298e3.f10026p | EnumC0298e3.f10024n, iVar, 0);
    }

    public final C0267l e1(j$.util.function.f fVar) {
        Objects.requireNonNull(fVar);
        return (C0267l) L0(new J1(4, fVar, 0));
    }

    public void f(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        L0(new U(hVar, false));
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h
    /* renamed from: f1 */
    public final j$.util.z spliterator() {
        return a1(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0309h
    public Iterator iterator() {
        return j$.util.W.f(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0309h
    public InterfaceC0309h unordered() {
        return !Q0() ? this : new B(this, this, 4, EnumC0298e3.f10028r, 0);
    }

    public void y(j$.util.function.h hVar) {
        Objects.requireNonNull(hVar);
        L0(new U(hVar, true));
    }
}
