package j$.util.stream;

import j$.util.C0269n;
import j$.util.function.BiConsumer;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0361s0 extends AbstractC0284c implements InterfaceC0369u0 {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f10131t = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0361s0(j$.util.H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0361s0(AbstractC0284c abstractC0284c, int i10) {
        super(abstractC0284c, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.D a1(j$.util.H h10) {
        if (h10 instanceof j$.util.D) {
            return (j$.util.D) h10;
        }
        if (O3.f9877a) {
            O3.a(AbstractC0284c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final H0 C0(long j10, j$.util.function.n nVar) {
        return D0.u0(j10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final P0 N0(D0 d02, j$.util.H h10, boolean z10, j$.util.function.n nVar) {
        return D0.c0(d02, h10, z10);
    }

    @Override // j$.util.stream.AbstractC0284c
    final void O0(j$.util.H h10, InterfaceC0356q2 interfaceC0356q2) {
        j$.util.function.r c0340n0;
        j$.util.D a12 = a1(h10);
        if (interfaceC0356q2 instanceof j$.util.function.r) {
            c0340n0 = (j$.util.function.r) interfaceC0356q2;
        } else if (O3.f9877a) {
            O3.a(AbstractC0284c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            c0340n0 = new C0340n0(interfaceC0356q2, 0);
        }
        while (!interfaceC0356q2.r() && a12.g(c0340n0)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public final int P0() {
        return 3;
    }

    @Override // j$.util.stream.AbstractC0284c
    final j$.util.H Y0(D0 d02, j$.util.function.A a10, boolean z10) {
        return new s3(d02, a10, z10);
    }

    public final Object b1(j$.util.function.A a10, j$.util.function.w wVar, BiConsumer biConsumer) {
        C0368u c0368u = new C0368u(biConsumer, 2);
        Objects.requireNonNull(a10);
        Objects.requireNonNull(wVar);
        return L0(new F1(3, c0368u, wVar, a10, 0));
    }

    public void c(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        L0(new W(rVar, false));
    }

    public final InterfaceC0369u0 c1(j$.util.function.t tVar) {
        Objects.requireNonNull(tVar);
        return new A(this, this, 3, EnumC0298e3.f10026p | EnumC0298e3.f10024n, tVar, 2);
    }

    public final Stream d1(j$.util.function.s sVar) {
        Objects.requireNonNull(sVar);
        return new C0384y(this, this, 3, EnumC0298e3.f10026p | EnumC0298e3.f10024n, sVar, 2);
    }

    public final C0269n e1(j$.util.function.p pVar) {
        Objects.requireNonNull(pVar);
        return (C0269n) L0(new J1(3, pVar, 3));
    }

    @Override // j$.util.stream.AbstractC0284c, j$.util.stream.InterfaceC0309h
    /* renamed from: f1 */
    public final j$.util.D spliterator() {
        return a1(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0309h
    public Iterator iterator() {
        return j$.util.W.h(spliterator());
    }

    public void r(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        L0(new W(rVar, true));
    }

    public final long sum() {
        return ((Long) L0(new V1(3, C0274a.f9967p, 0L))).longValue();
    }

    @Override // j$.util.stream.InterfaceC0309h
    public InterfaceC0309h unordered() {
        return !Q0() ? this : new C0295e0(this, this, 3, EnumC0298e3.f10028r, 1);
    }
}
