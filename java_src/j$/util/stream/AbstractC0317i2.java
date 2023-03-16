package j$.util.stream;

import j$.util.C0266k;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0258a;
import j$.util.function.C0259b;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0317i2 extends AbstractC0284c implements Stream {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f10058t = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0317i2(j$.util.H h10, int i10, boolean z10) {
        super(h10, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0317i2(AbstractC0284c abstractC0284c, int i10) {
        super(abstractC0284c, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final H0 C0(long j10, j$.util.function.n nVar) {
        return D0.X(j10, nVar);
    }

    @Override // j$.util.stream.AbstractC0284c
    final P0 N0(D0 d02, j$.util.H h10, boolean z10, j$.util.function.n nVar) {
        return D0.Z(d02, h10, z10, nVar);
    }

    @Override // j$.util.stream.AbstractC0284c
    final void O0(j$.util.H h10, InterfaceC0356q2 interfaceC0356q2) {
        while (!interfaceC0356q2.r() && h10.a(interfaceC0356q2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public final int P0() {
        return 1;
    }

    @Override // j$.util.stream.AbstractC0284c
    final j$.util.H Y0(D0 d02, j$.util.function.A a10, boolean z10) {
        return new J3(d02, a10, z10);
    }

    public void a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        L0(new X(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) L0(D0.E0(predicate, A0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0330l0 b(Function function) {
        Objects.requireNonNull(function);
        return new C0388z(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((AbstractC0361s0) t(C0324k.f10076m)).sum();
    }

    public void d(Consumer consumer) {
        Objects.requireNonNull(consumer);
        L0(new X(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new r(this, 1, EnumC0298e3.f10023m | EnumC0298e3.f10030t);
    }

    @Override // j$.util.stream.Stream
    public final Object e(j$.util.function.A a10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return L0(D0.F0(a10, biConsumer, biConsumer2));
    }

    @Override // j$.util.stream.Stream
    public final C0266k findAny() {
        return (C0266k) L0(new M(false, 1, C0266k.a(), C0274a.f9960i, L.f9848a));
    }

    @Override // j$.util.stream.Stream
    public final C0266k findFirst() {
        return (C0266k) L0(new M(true, 1, C0266k.a(), C0274a.f9960i, L.f9848a));
    }

    @Override // j$.util.stream.Stream
    public final Object[] g(j$.util.function.n nVar) {
        return D0.m0(M0(nVar), nVar).o(nVar);
    }

    @Override // j$.util.stream.Stream
    public final Stream h(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C0384y(this, this, 1, EnumC0298e3.f10030t, predicate, 4);
    }

    @Override // j$.util.stream.InterfaceC0309h
    public final Iterator iterator() {
        return j$.util.W.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0330l0 j(j$.util.function.C c10) {
        Objects.requireNonNull(c10);
        return new C0388z(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c10, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream k(Function function) {
        Objects.requireNonNull(function);
        return new C0297e2(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final Object l(C0319j c0319j) {
        Object L0;
        if (isParallel() && c0319j.a().contains(EnumC0314i.CONCURRENT) && (!Q0() || c0319j.a().contains(EnumC0314i.UNORDERED))) {
            L0 = ((C0259b) C0259b.C(c0319j.f10060a.supplier())).get();
            a(new C0339n(BiConsumer.VivifiedWrapper.convert(c0319j.f10060a.accumulator()), L0, 5));
        } else {
            Objects.requireNonNull(c0319j);
            L0 = L0(new O1(1, C0259b.A(c0319j.f10060a.combiner()), BiConsumer.VivifiedWrapper.convert(c0319j.f10060a.accumulator()), C0259b.C(c0319j.f10060a.supplier()), c0319j));
        }
        return c0319j.a().contains(EnumC0314i.IDENTITY_FINISH) ? L0 : Function.VivifiedWrapper.convert(c0319j.f10060a.finisher()).a(L0);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j10) {
        if (j10 >= 0) {
            return D0.D0(this, 0L, j10);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream m(Function function) {
        Objects.requireNonNull(function);
        return new C0297e2(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, function, 1);
    }

    @Override // j$.util.stream.Stream
    public final C0266k max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return p(new C0258a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final C0266k min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return p(new C0258a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Stream n(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0384y(this, this, 1, 0, consumer, 3);
    }

    @Override // j$.util.stream.Stream
    public final boolean o(Predicate predicate) {
        return ((Boolean) L0(D0.E0(predicate, A0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final C0266k p(InterfaceC0260c interfaceC0260c) {
        Objects.requireNonNull(interfaceC0260c);
        return (C0266k) L0(new J1(1, interfaceC0260c, 1));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0369u0 q(Function function) {
        Objects.requireNonNull(function);
        return new A(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final boolean s(Predicate predicate) {
        return ((Boolean) L0(D0.E0(predicate, A0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? this : D0.D0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0369u0 t(j$.util.function.D d10) {
        Objects.requireNonNull(d10);
        return new A(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n, d10, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        I i10 = I.f9827c;
        return D0.m0(M0(i10), i10).o(i10);
    }

    @Override // j$.util.stream.Stream
    public final Object u(Object obj, BiFunction biFunction, InterfaceC0260c interfaceC0260c) {
        return L0(D0.G0(obj, biFunction, interfaceC0260c));
    }

    @Override // j$.util.stream.InterfaceC0309h
    public InterfaceC0309h unordered() {
        return !Q0() ? this : new C0292d2(this, this, 1, EnumC0298e3.f10028r);
    }

    @Override // j$.util.stream.Stream
    public final H v(j$.util.function.B b10) {
        Objects.requireNonNull(b10);
        return new C0380x(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n, b10, 6);
    }

    @Override // j$.util.stream.Stream
    public final H w(Function function) {
        Objects.requireNonNull(function);
        return new C0380x(this, this, 1, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final Object z(Object obj, InterfaceC0260c interfaceC0260c) {
        return L0(D0.G0(obj, interfaceC0260c, interfaceC0260c));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new L2(this, comparator);
    }
}
