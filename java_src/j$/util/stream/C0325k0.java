package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.C0264i;
import j$.util.C0267l;
import j$.util.C0268m;
import j$.util.C0273s;
import j$.util.function.BiConsumer;
import j$.util.function.C0259b;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.k0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0325k0 implements IntStream {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0330l0 f10078a;

    private /* synthetic */ C0325k0(InterfaceC0330l0 interfaceC0330l0) {
        this.f10078a = interfaceC0330l0;
    }

    public static /* synthetic */ IntStream A(InterfaceC0330l0 interfaceC0330l0) {
        if (interfaceC0330l0 == null) {
            return null;
        }
        return new C0325k0(interfaceC0330l0);
    }

    @Override // java.util.stream.IntStream
    public boolean allMatch(IntPredicate intPredicate) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b r10 = C0259b.r(intPredicate);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        return ((Boolean) abstractC0320j0.L0(D0.z0(r10, A0.ALL))).booleanValue();
    }

    @Override // java.util.stream.IntStream
    public boolean anyMatch(IntPredicate intPredicate) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b r10 = C0259b.r(intPredicate);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        return ((Boolean) abstractC0320j0.L0(D0.z0(r10, A0.ANY))).booleanValue();
    }

    @Override // java.util.stream.IntStream
    public DoubleStream asDoubleStream() {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        return G.A(new B(abstractC0320j0, abstractC0320j0, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n, 1));
    }

    @Override // java.util.stream.IntStream
    public LongStream asLongStream() {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        return C0365t0.A(new C0295e0(abstractC0320j0, abstractC0320j0, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n, 0));
    }

    @Override // java.util.stream.IntStream
    public OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0320j0) this.f10078a).b1(C0280b0.f9981a, C0324k.f10070g, I.f9826b);
        return AbstractC0251a.u(jArr[0] > 0 ? C0267l.d(jArr[1] / jArr[0]) : C0267l.a());
    }

    @Override // java.util.stream.IntStream
    public java.util.stream.Stream boxed() {
        return C0283b3.A(((AbstractC0320j0) this.f10078a).d1(C0344o.f10111d));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        ((AbstractC0284c) this.f10078a).close();
    }

    @Override // java.util.stream.IntStream
    public /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return ((AbstractC0320j0) this.f10078a).b1(C0259b.C(supplier), objIntConsumer == null ? null : new C0259b(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.IntStream
    public long count() {
        return ((AbstractC0361s0) ((AbstractC0320j0) this.f10078a).c1(C0274a.f9964m)).sum();
    }

    @Override // java.util.stream.IntStream
    public IntStream distinct() {
        return A(((AbstractC0317i2) ((AbstractC0317i2) ((AbstractC0320j0) this.f10078a).d1(C0344o.f10111d)).distinct()).j(C0274a.f9962k));
    }

    @Override // java.util.stream.IntStream
    public IntStream filter(IntPredicate intPredicate) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b r10 = C0259b.r(intPredicate);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        Objects.requireNonNull(r10);
        return A(new C0388z(abstractC0320j0, abstractC0320j0, 2, EnumC0298e3.f10030t, r10, 4));
    }

    @Override // java.util.stream.IntStream
    public OptionalInt findAny() {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        return AbstractC0251a.v((C0268m) abstractC0320j0.L0(new M(false, 2, C0268m.a(), C0329l.f10086d, J.f9834a)));
    }

    @Override // java.util.stream.IntStream
    public OptionalInt findFirst() {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        return AbstractC0251a.v((C0268m) abstractC0320j0.L0(new M(true, 2, C0268m.a(), C0329l.f10086d, J.f9834a)));
    }

    @Override // java.util.stream.IntStream
    public IntStream flatMap(IntFunction intFunction) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        j$.util.function.n B = C0259b.B(intFunction);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        return A(new C0388z(abstractC0320j0, abstractC0320j0, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, B, 3));
    }

    @Override // java.util.stream.IntStream
    public /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f10078a.i(j$.util.function.l.a(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f10078a.x(j$.util.function.l.a(intConsumer));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return ((AbstractC0284c) this.f10078a).isParallel();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public /* synthetic */ Iterator<Integer> iterator() {
        return ((AbstractC0320j0) this.f10078a).iterator();
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public Iterator<Integer> iterator2() {
        return C0273s.a(j$.util.W.g(((AbstractC0320j0) this.f10078a).spliterator()));
    }

    @Override // java.util.stream.IntStream
    public IntStream limit(long j10) {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        if (j10 >= 0) {
            return A(D0.y0(abstractC0320j0, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.IntStream
    public IntStream map(IntUnaryOperator intUnaryOperator) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b c0259b = intUnaryOperator == null ? null : new C0259b(intUnaryOperator);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        Objects.requireNonNull(c0259b);
        return A(new C0388z(abstractC0320j0, abstractC0320j0, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c0259b, 2));
    }

    @Override // java.util.stream.IntStream
    public DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b c0259b = intToDoubleFunction == null ? null : new C0259b(intToDoubleFunction);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        Objects.requireNonNull(c0259b);
        return G.A(new C0380x(abstractC0320j0, abstractC0320j0, 2, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c0259b, 4));
    }

    @Override // java.util.stream.IntStream
    public /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
        return C0365t0.A(((AbstractC0320j0) this.f10078a).c1(intToLongFunction == null ? null : new C0259b(intToLongFunction)));
    }

    @Override // java.util.stream.IntStream
    public /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
        return C0283b3.A(((AbstractC0320j0) this.f10078a).d1(C0259b.B(intFunction)));
    }

    @Override // java.util.stream.IntStream
    public OptionalInt max() {
        return AbstractC0251a.v(((AbstractC0320j0) this.f10078a).e1(C0324k.f10071h));
    }

    @Override // java.util.stream.IntStream
    public OptionalInt min() {
        return AbstractC0251a.v(((AbstractC0320j0) this.f10078a).e1(C0329l.f10088f));
    }

    @Override // java.util.stream.IntStream
    public boolean noneMatch(IntPredicate intPredicate) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b r10 = C0259b.r(intPredicate);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        return ((Boolean) abstractC0320j0.L0(D0.z0(r10, A0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public /* synthetic */ IntStream onClose(Runnable runnable) {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f10078a;
        abstractC0284c.onClose(runnable);
        return C0304g.A(abstractC0284c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public /* synthetic */ IntStream parallel() {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f10078a;
        abstractC0284c.parallel();
        return C0304g.A(abstractC0284c);
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public /* synthetic */ IntStream parallel2() {
        return A(this.f10078a.parallel());
    }

    @Override // java.util.stream.IntStream
    public IntStream peek(IntConsumer intConsumer) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        j$.util.function.m a10 = j$.util.function.l.a(intConsumer);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        Objects.requireNonNull(a10);
        return A(new C0388z(abstractC0320j0, abstractC0320j0, 2, 0, a10, 1));
    }

    @Override // java.util.stream.IntStream
    public int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        InterfaceC0330l0 interfaceC0330l0 = this.f10078a;
        C0259b c0259b = intBinaryOperator == null ? null : new C0259b(intBinaryOperator);
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) interfaceC0330l0;
        Objects.requireNonNull(abstractC0320j0);
        Objects.requireNonNull(c0259b);
        return ((Integer) abstractC0320j0.L0(new R1(2, c0259b, i10))).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public /* synthetic */ IntStream sequential() {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f10078a;
        abstractC0284c.sequential();
        return C0304g.A(abstractC0284c);
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public /* synthetic */ IntStream sequential2() {
        return A(this.f10078a.sequential());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.l0] */
    @Override // java.util.stream.IntStream
    public IntStream skip(long j10) {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        AbstractC0320j0 abstractC0320j02 = abstractC0320j0;
        if (i10 >= 0) {
            if (i10 != 0) {
                abstractC0320j02 = D0.y0(abstractC0320j0, j10, -1L);
            }
            return A(abstractC0320j02);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.IntStream
    public IntStream sorted() {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        return A(new J2(abstractC0320j0));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public /* synthetic */ Spliterator<Integer> spliterator() {
        return j$.util.A.a(((AbstractC0320j0) this.f10078a).spliterator());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public /* synthetic */ Spliterator<Integer> spliterator2() {
        return j$.util.G.a(((AbstractC0320j0) this.f10078a).spliterator());
    }

    @Override // java.util.stream.IntStream
    public int sum() {
        AbstractC0320j0 abstractC0320j0 = (AbstractC0320j0) this.f10078a;
        Objects.requireNonNull(abstractC0320j0);
        return ((Integer) abstractC0320j0.L0(new R1(2, C0274a.f9963l, 0))).intValue();
    }

    @Override // java.util.stream.IntStream
    public IntSummaryStatistics summaryStatistics() {
        C0264i c0264i = (C0264i) ((AbstractC0320j0) this.f10078a).b1(C0324k.f10064a, C0274a.f9961j, C0364t.f10140b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public int[] toArray() {
        return (int[]) D0.o0((L0) ((AbstractC0320j0) this.f10078a).M0(C0360s.f10130c)).k();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public /* synthetic */ IntStream unordered() {
        return C0304g.A(((AbstractC0320j0) this.f10078a).unordered());
    }

    @Override // java.util.stream.IntStream
    public /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC0251a.v(((AbstractC0320j0) this.f10078a).e1(intBinaryOperator == null ? null : new C0259b(intBinaryOperator)));
    }
}
