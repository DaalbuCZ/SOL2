package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0259b;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.b3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0283b3 implements java.util.stream.Stream {

    /* renamed from: a */
    final /* synthetic */ Stream f9986a;

    private /* synthetic */ C0283b3(Stream stream) {
        this.f9986a = stream;
    }

    public static /* synthetic */ java.util.stream.Stream A(Stream stream) {
        if (stream == null) {
            return null;
        }
        return new C0283b3(stream);
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f9986a.o(j$.util.function.y.a(predicate));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f9986a.anyMatch(j$.util.function.y.a(predicate));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.f9986a.close();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f9986a.e(C0259b.C(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object collect(Collector collector) {
        return this.f9986a.l(C0319j.b(collector));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ long count() {
        return this.f9986a.count();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream distinct() {
        return A(this.f9986a.distinct());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream filter(Predicate predicate) {
        return A(this.f9986a.h(j$.util.function.y.a(predicate)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional findAny() {
        return AbstractC0251a.t(this.f9986a.findAny());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional findFirst() {
        return AbstractC0251a.t(this.f9986a.findFirst());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream flatMap(Function function) {
        return A(this.f9986a.m(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
        return G.A(this.f9986a.w(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
        return C0325k0.A(this.f9986a.b(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
        return C0365t0.A(this.f9986a.q(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ void forEach(Consumer consumer) {
        this.f9986a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
        this.f9986a.d(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return this.f9986a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Iterator iterator() {
        return this.f9986a.iterator();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream limit(long j10) {
        return A(this.f9986a.limit(j10));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
        return A(this.f9986a.k(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return G.A(this.f9986a.v(toDoubleFunction == null ? null : new C0259b(toDoubleFunction)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return C0325k0.A(this.f9986a.j(toIntFunction == null ? null : new C0259b(toIntFunction)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return C0365t0.A(this.f9986a.t(toLongFunction == null ? null : new C0259b(toLongFunction)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional max(Comparator comparator) {
        return AbstractC0251a.t(this.f9986a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional min(Comparator comparator) {
        return AbstractC0251a.t(this.f9986a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f9986a.s(j$.util.function.y.a(predicate));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C0304g.A(this.f9986a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream parallel() {
        return C0304g.A(this.f9986a.parallel());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
        return A(this.f9986a.n(Consumer.VivifiedWrapper.convert(consumer)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f9986a.u(obj, BiFunction.VivifiedWrapper.convert(biFunction), C0259b.A(binaryOperator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f9986a.z(obj, C0259b.A(binaryOperator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return AbstractC0251a.t(this.f9986a.p(C0259b.A(binaryOperator)));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream sequential() {
        return C0304g.A(this.f9986a.sequential());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream skip(long j10) {
        return A(this.f9986a.skip(j10));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream sorted() {
        return A(this.f9986a.sorted());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
        return A(this.f9986a.sorted(comparator));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.G.a(this.f9986a.spliterator());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object[] toArray() {
        return this.f9986a.toArray();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f9986a.g(C0259b.B(intFunction));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream unordered() {
        return C0304g.A(this.f9986a.unordered());
    }
}
