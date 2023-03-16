package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.C0265j;
import j$.util.C0267l;
import j$.util.C0269n;
import j$.util.C0394v;
import j$.util.function.BiConsumer;
import j$.util.function.C0259b;
import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.t0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0365t0 implements LongStream {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0369u0 f10142a;

    private /* synthetic */ C0365t0(InterfaceC0369u0 interfaceC0369u0) {
        this.f10142a = interfaceC0369u0;
    }

    public static /* synthetic */ LongStream A(InterfaceC0369u0 interfaceC0369u0) {
        if (interfaceC0369u0 == null) {
            return null;
        }
        return new C0365t0(interfaceC0369u0);
    }

    @Override // java.util.stream.LongStream
    public boolean allMatch(LongPredicate longPredicate) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b z10 = C0259b.z(longPredicate);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        return ((Boolean) abstractC0361s0.L0(D0.B0(z10, A0.ALL))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public boolean anyMatch(LongPredicate longPredicate) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b z10 = C0259b.z(longPredicate);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        return ((Boolean) abstractC0361s0.L0(D0.B0(z10, A0.ANY))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public DoubleStream asDoubleStream() {
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) this.f10142a;
        Objects.requireNonNull(abstractC0361s0);
        return G.A(new B(abstractC0361s0, abstractC0361s0, 3, EnumC0298e3.f10026p | EnumC0298e3.f10024n, 2));
    }

    @Override // java.util.stream.LongStream
    public OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0361s0) this.f10142a).b1(C0335m0.f10095a, C0324k.f10072i, K.f9840b);
        return AbstractC0251a.u(jArr[0] > 0 ? C0267l.d(jArr[1] / jArr[0]) : C0267l.a());
    }

    @Override // java.util.stream.LongStream
    public java.util.stream.Stream boxed() {
        return C0283b3.A(((AbstractC0361s0) this.f10142a).d1(C0274a.f9968q));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        ((AbstractC0284c) this.f10142a).close();
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return ((AbstractC0361s0) this.f10142a).b1(C0259b.C(supplier), objLongConsumer == null ? null : new C0259b(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.LongStream
    public long count() {
        return ((AbstractC0361s0) ((AbstractC0361s0) this.f10142a).c1(C0274a.f9969r)).sum();
    }

    @Override // java.util.stream.LongStream
    public LongStream distinct() {
        return A(((AbstractC0317i2) ((AbstractC0317i2) ((AbstractC0361s0) this.f10142a).d1(C0274a.f9968q)).distinct()).t(C0274a.f9966o));
    }

    @Override // java.util.stream.LongStream
    public LongStream filter(LongPredicate longPredicate) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b z10 = C0259b.z(longPredicate);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        Objects.requireNonNull(z10);
        return A(new A(abstractC0361s0, abstractC0361s0, 3, EnumC0298e3.f10030t, z10, 4));
    }

    @Override // java.util.stream.LongStream
    public OptionalLong findAny() {
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) this.f10142a;
        Objects.requireNonNull(abstractC0361s0);
        return AbstractC0251a.w((C0269n) abstractC0361s0.L0(new M(false, 3, C0269n.a(), C0344o.f10110c, K.f9839a)));
    }

    @Override // java.util.stream.LongStream
    public OptionalLong findFirst() {
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) this.f10142a;
        Objects.requireNonNull(abstractC0361s0);
        return AbstractC0251a.w((C0269n) abstractC0361s0.L0(new M(true, 3, C0269n.a(), C0344o.f10110c, K.f9839a)));
    }

    @Override // java.util.stream.LongStream
    public LongStream flatMap(LongFunction longFunction) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b c0259b = longFunction == null ? null : new C0259b(longFunction);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        return A(new A(abstractC0361s0, abstractC0361s0, 3, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, c0259b, 3));
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f10142a.c(j$.util.function.q.a(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f10142a.r(j$.util.function.q.a(longConsumer));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return ((AbstractC0284c) this.f10142a).isParallel();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public /* synthetic */ Iterator<Long> iterator() {
        return ((AbstractC0361s0) this.f10142a).iterator();
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public Iterator<Long> iterator2() {
        return C0394v.a(j$.util.W.h(((AbstractC0361s0) this.f10142a).spliterator()));
    }

    @Override // java.util.stream.LongStream
    public LongStream limit(long j10) {
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) this.f10142a;
        Objects.requireNonNull(abstractC0361s0);
        if (j10 >= 0) {
            return A(D0.A0(abstractC0361s0, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return A(((AbstractC0361s0) this.f10142a).c1(longUnaryOperator == null ? null : new C0259b(longUnaryOperator)));
    }

    @Override // java.util.stream.LongStream
    public DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b c0259b = longToDoubleFunction == null ? null : new C0259b(longToDoubleFunction);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        Objects.requireNonNull(c0259b);
        return G.A(new C0380x(abstractC0361s0, abstractC0361s0, 3, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c0259b, 5));
    }

    @Override // java.util.stream.LongStream
    public IntStream mapToInt(LongToIntFunction longToIntFunction) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b c0259b = longToIntFunction == null ? null : new C0259b(longToIntFunction);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        Objects.requireNonNull(c0259b);
        return C0325k0.A(new C0388z(abstractC0361s0, abstractC0361s0, 3, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c0259b, 5));
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ java.util.stream.Stream mapToObj(LongFunction longFunction) {
        return C0283b3.A(((AbstractC0361s0) this.f10142a).d1(longFunction == null ? null : new C0259b(longFunction)));
    }

    @Override // java.util.stream.LongStream
    public OptionalLong max() {
        return AbstractC0251a.w(((AbstractC0361s0) this.f10142a).e1(C0324k.f10073j));
    }

    @Override // java.util.stream.LongStream
    public OptionalLong min() {
        return AbstractC0251a.w(((AbstractC0361s0) this.f10142a).e1(C0329l.f10089g));
    }

    @Override // java.util.stream.LongStream
    public boolean noneMatch(LongPredicate longPredicate) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b z10 = C0259b.z(longPredicate);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        return ((Boolean) abstractC0361s0.L0(D0.B0(z10, A0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public /* synthetic */ LongStream onClose(Runnable runnable) {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f10142a;
        abstractC0284c.onClose(runnable);
        return C0304g.A(abstractC0284c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public /* synthetic */ LongStream parallel() {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f10142a;
        abstractC0284c.parallel();
        return C0304g.A(abstractC0284c);
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public /* synthetic */ LongStream parallel2() {
        return A(this.f10142a.parallel());
    }

    @Override // java.util.stream.LongStream
    public LongStream peek(LongConsumer longConsumer) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        j$.util.function.r a10 = j$.util.function.q.a(longConsumer);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        Objects.requireNonNull(a10);
        return A(new A(abstractC0361s0, abstractC0361s0, 3, 0, a10, 5));
    }

    @Override // java.util.stream.LongStream
    public long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        InterfaceC0369u0 interfaceC0369u0 = this.f10142a;
        C0259b c0259b = longBinaryOperator == null ? null : new C0259b(longBinaryOperator);
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) interfaceC0369u0;
        Objects.requireNonNull(abstractC0361s0);
        Objects.requireNonNull(c0259b);
        return ((Long) abstractC0361s0.L0(new V1(3, c0259b, j10))).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public /* synthetic */ LongStream sequential() {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f10142a;
        abstractC0284c.sequential();
        return C0304g.A(abstractC0284c);
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public /* synthetic */ LongStream sequential2() {
        return A(this.f10142a.sequential());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.u0] */
    @Override // java.util.stream.LongStream
    public LongStream skip(long j10) {
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) this.f10142a;
        Objects.requireNonNull(abstractC0361s0);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        AbstractC0361s0 abstractC0361s02 = abstractC0361s0;
        if (i10 >= 0) {
            if (i10 != 0) {
                abstractC0361s02 = D0.A0(abstractC0361s0, j10, -1L);
            }
            return A(abstractC0361s02);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.LongStream
    public LongStream sorted() {
        AbstractC0361s0 abstractC0361s0 = (AbstractC0361s0) this.f10142a;
        Objects.requireNonNull(abstractC0361s0);
        return A(new K2(abstractC0361s0));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public /* synthetic */ Spliterator<Long> spliterator() {
        return j$.util.C.a(((AbstractC0361s0) this.f10142a).spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public /* synthetic */ Spliterator<Long> spliterator2() {
        return j$.util.G.a(((AbstractC0361s0) this.f10142a).spliterator());
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ long sum() {
        return ((AbstractC0361s0) this.f10142a).sum();
    }

    @Override // java.util.stream.LongStream
    public LongSummaryStatistics summaryStatistics() {
        C0265j c0265j = (C0265j) ((AbstractC0361s0) this.f10142a).b1(C0329l.f10083a, C0274a.f9965n, J.f9835b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public long[] toArray() {
        return (long[]) D0.p0((N0) ((AbstractC0361s0) this.f10142a).M0(C0364t.f10141c)).k();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public /* synthetic */ LongStream unordered() {
        return C0304g.A(((AbstractC0361s0) this.f10142a).unordered());
    }

    @Override // java.util.stream.LongStream
    public /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC0251a.w(((AbstractC0361s0) this.f10142a).e1(longBinaryOperator == null ? null : new C0259b(longBinaryOperator)));
    }
}
