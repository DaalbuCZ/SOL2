package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.C0263h;
import j$.util.C0267l;
import j$.util.C0271p;
import j$.util.C0397y;
import j$.util.function.BiConsumer;
import j$.util.function.C0259b;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public final /* synthetic */ class G implements DoubleStream {

    /* renamed from: a */
    final /* synthetic */ H f9812a;

    private /* synthetic */ G(H h10) {
        this.f9812a = h10;
    }

    public static /* synthetic */ DoubleStream A(H h10) {
        if (h10 == null) {
            return null;
        }
        return new G(h10);
    }

    @Override // java.util.stream.DoubleStream
    public boolean allMatch(DoublePredicate doublePredicate) {
        H h10 = this.f9812a;
        C0259b n10 = C0259b.n(doublePredicate);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        return ((Boolean) f10.L0(D0.x0(n10, A0.ALL))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public boolean anyMatch(DoublePredicate doublePredicate) {
        H h10 = this.f9812a;
        C0259b n10 = C0259b.n(doublePredicate);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        return ((Boolean) f10.L0(D0.x0(n10, A0.ANY))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public OptionalDouble average() {
        double[] dArr = (double[]) ((F) this.f9812a).b1(C0360s.f10128a, C0324k.f10066c, C0344o.f10109b);
        return AbstractC0251a.u(dArr[2] > 0.0d ? C0267l.d(AbstractC0334m.a(dArr) / dArr[2]) : C0267l.a());
    }

    @Override // java.util.stream.DoubleStream
    public java.util.stream.Stream boxed() {
        return C0283b3.A(((F) this.f9812a).d1(C0274a.f9958g));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        ((AbstractC0284c) this.f9812a).close();
    }

    @Override // java.util.stream.DoubleStream
    public /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return ((F) this.f9812a).b1(C0259b.C(supplier), objDoubleConsumer == null ? null : new C0259b(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public long count() {
        return ((AbstractC0361s0) ((F) this.f9812a).c1(C0274a.f9959h)).sum();
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream distinct() {
        return A(((AbstractC0317i2) ((AbstractC0317i2) ((F) this.f9812a).d1(C0274a.f9958g)).distinct()).v(C0274a.f9956e));
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream filter(DoublePredicate doublePredicate) {
        H h10 = this.f9812a;
        C0259b n10 = C0259b.n(doublePredicate);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        Objects.requireNonNull(n10);
        return A(new C0380x(f10, f10, 4, EnumC0298e3.f10030t, n10, 2));
    }

    @Override // java.util.stream.DoubleStream
    public OptionalDouble findAny() {
        F f10 = (F) this.f9812a;
        Objects.requireNonNull(f10);
        return AbstractC0251a.u((C0267l) f10.L0(new M(false, 4, C0267l.a(), C0324k.f10069f, I.f9825a)));
    }

    @Override // java.util.stream.DoubleStream
    public OptionalDouble findFirst() {
        F f10 = (F) this.f9812a;
        Objects.requireNonNull(f10);
        return AbstractC0251a.u((C0267l) f10.L0(new M(true, 4, C0267l.a(), C0324k.f10069f, I.f9825a)));
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream flatMap(DoubleFunction doubleFunction) {
        H h10 = this.f9812a;
        C0259b c0259b = doubleFunction == null ? null : new C0259b(doubleFunction);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        return A(new C0380x(f10, f10, 4, EnumC0298e3.f10026p | EnumC0298e3.f10024n | EnumC0298e3.f10030t, c0259b, 1));
    }

    @Override // java.util.stream.DoubleStream
    public /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f9812a.f(j$.util.function.g.a(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f9812a.y(j$.util.function.g.a(doubleConsumer));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return ((AbstractC0284c) this.f9812a).isParallel();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public /* synthetic */ Iterator<Double> iterator() {
        return ((F) this.f9812a).iterator();
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public Iterator<Double> iterator2() {
        return C0271p.a(j$.util.W.f(((F) this.f9812a).spliterator()));
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream limit(long j10) {
        F f10 = (F) this.f9812a;
        Objects.requireNonNull(f10);
        if (j10 >= 0) {
            return A(D0.w0(f10, 0L, j10));
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        H h10 = this.f9812a;
        C0259b c0259b = doubleUnaryOperator == null ? null : new C0259b(doubleUnaryOperator);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        Objects.requireNonNull(c0259b);
        return A(new C0380x(f10, f10, 4, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c0259b, 0));
    }

    @Override // java.util.stream.DoubleStream
    public IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        H h10 = this.f9812a;
        C0259b c0259b = doubleToIntFunction == null ? null : new C0259b(doubleToIntFunction);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        Objects.requireNonNull(c0259b);
        return C0325k0.A(new C0388z(f10, f10, 4, EnumC0298e3.f10026p | EnumC0298e3.f10024n, c0259b, 0));
    }

    @Override // java.util.stream.DoubleStream
    public /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C0365t0.A(((F) this.f9812a).c1(doubleToLongFunction == null ? null : new C0259b(doubleToLongFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public /* synthetic */ java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        return C0283b3.A(((F) this.f9812a).d1(doubleFunction == null ? null : new C0259b(doubleFunction)));
    }

    @Override // java.util.stream.DoubleStream
    public OptionalDouble max() {
        return AbstractC0251a.u(((F) this.f9812a).e1(C0274a.f9957f));
    }

    @Override // java.util.stream.DoubleStream
    public OptionalDouble min() {
        return AbstractC0251a.u(((F) this.f9812a).e1(C0324k.f10067d));
    }

    @Override // java.util.stream.DoubleStream
    public boolean noneMatch(DoublePredicate doublePredicate) {
        H h10 = this.f9812a;
        C0259b n10 = C0259b.n(doublePredicate);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        return ((Boolean) f10.L0(D0.x0(n10, A0.NONE))).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public /* synthetic */ DoubleStream onClose(Runnable runnable) {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f9812a;
        abstractC0284c.onClose(runnable);
        return C0304g.A(abstractC0284c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public /* synthetic */ DoubleStream parallel() {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f9812a;
        abstractC0284c.parallel();
        return C0304g.A(abstractC0284c);
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public /* synthetic */ DoubleStream parallel2() {
        return A(this.f9812a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream peek(DoubleConsumer doubleConsumer) {
        H h10 = this.f9812a;
        j$.util.function.h a10 = j$.util.function.g.a(doubleConsumer);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        Objects.requireNonNull(a10);
        return A(new C0380x(f10, f10, 4, 0, a10, 3));
    }

    @Override // java.util.stream.DoubleStream
    public double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        H h10 = this.f9812a;
        C0259b c0259b = doubleBinaryOperator == null ? null : new C0259b(doubleBinaryOperator);
        F f10 = (F) h10;
        Objects.requireNonNull(f10);
        Objects.requireNonNull(c0259b);
        return ((Double) f10.L0(new H1(4, c0259b, d10))).doubleValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public /* synthetic */ DoubleStream sequential() {
        AbstractC0284c abstractC0284c = (AbstractC0284c) this.f9812a;
        abstractC0284c.sequential();
        return C0304g.A(abstractC0284c);
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public /* synthetic */ DoubleStream sequential2() {
        return A(this.f9812a.sequential());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.H] */
    @Override // java.util.stream.DoubleStream
    public DoubleStream skip(long j10) {
        F f10 = (F) this.f9812a;
        Objects.requireNonNull(f10);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        F f11 = f10;
        if (i10 >= 0) {
            if (i10 != 0) {
                f11 = D0.w0(f10, j10, -1L);
            }
            return A(f11);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // java.util.stream.DoubleStream
    public DoubleStream sorted() {
        F f10 = (F) this.f9812a;
        Objects.requireNonNull(f10);
        return A(new I2(f10));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public /* synthetic */ Spliterator<Double> spliterator() {
        return C0397y.a(((F) this.f9812a).spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public /* synthetic */ Spliterator<Double> spliterator2() {
        return j$.util.G.a(((F) this.f9812a).spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public double sum() {
        return AbstractC0334m.a((double[]) ((F) this.f9812a).b1(C0364t.f10139a, C0329l.f10085c, C0360s.f10129b));
    }

    @Override // java.util.stream.DoubleStream
    public DoubleSummaryStatistics summaryStatistics() {
        C0263h c0263h = (C0263h) ((F) this.f9812a).b1(C0274a.f9953b, C0274a.f9955d, C0329l.f10084b);
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public double[] toArray() {
        return (double[]) D0.n0((J0) ((F) this.f9812a).M0(C0324k.f10068e)).k();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public /* synthetic */ DoubleStream unordered() {
        return C0304g.A(((F) this.f9812a).unordered());
    }

    @Override // java.util.stream.DoubleStream
    public /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC0251a.u(((F) this.f9812a).e1(doubleBinaryOperator == null ? null : new C0259b(doubleBinaryOperator)));
    }
}
