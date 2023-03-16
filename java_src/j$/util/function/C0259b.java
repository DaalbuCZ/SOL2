package j$.util.function;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* renamed from: j$.util.function.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0259b implements InterfaceC0260c, f, i, j, k, n, o, p, s, t, u, v, w, A, B, C, D {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f9727a;

    public /* synthetic */ C0259b(Object obj) {
        this.f9727a = obj;
    }

    public static /* synthetic */ InterfaceC0260c A(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C0259b(binaryOperator);
    }

    public static /* synthetic */ n B(IntFunction intFunction) {
        if (intFunction == null) {
            return null;
        }
        return new C0259b(intFunction);
    }

    public static /* synthetic */ A C(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return new C0259b(supplier);
    }

    public static /* synthetic */ C0259b n(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C0259b(doublePredicate);
    }

    public static /* synthetic */ C0259b r(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C0259b(intPredicate);
    }

    public static /* synthetic */ C0259b z(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C0259b(longPredicate);
    }

    public boolean D(double d10) {
        return ((DoublePredicate) this.f9727a).test(d10);
    }

    public boolean E(int i10) {
        return ((IntPredicate) this.f9727a).test(i10);
    }

    public boolean F(long j10) {
        return ((LongPredicate) this.f9727a).test(j10);
    }

    @Override // j$.util.function.u
    public /* synthetic */ void a(Object obj, double d10) {
        ((ObjDoubleConsumer) this.f9727a).accept(obj, d10);
    }

    public double b(double d10) {
        return ((DoubleUnaryOperator) this.f9727a).applyAsDouble(d10);
    }

    public double c(int i10) {
        return ((IntToDoubleFunction) this.f9727a).applyAsDouble(i10);
    }

    public double d(long j10) {
        return ((LongToDoubleFunction) this.f9727a).applyAsDouble(j10);
    }

    public int e(double d10) {
        return ((DoubleToIntFunction) this.f9727a).applyAsInt(d10);
    }

    @Override // j$.util.function.C
    public /* synthetic */ int f(Object obj) {
        return ((ToIntFunction) this.f9727a).applyAsInt(obj);
    }

    @Override // j$.util.function.D
    public /* synthetic */ long g(Object obj) {
        return ((ToLongFunction) this.f9727a).applyAsLong(obj);
    }

    @Override // j$.util.function.A
    public /* synthetic */ Object get() {
        return ((Supplier) this.f9727a).get();
    }

    public int h(int i10) {
        return ((IntUnaryOperator) this.f9727a).applyAsInt(i10);
    }

    @Override // j$.util.function.k
    public /* synthetic */ int i(int i10, int i11) {
        return ((IntBinaryOperator) this.f9727a).applyAsInt(i10, i11);
    }

    public int j(long j10) {
        return ((LongToIntFunction) this.f9727a).applyAsInt(j10);
    }

    @Override // j$.util.function.p
    public /* synthetic */ long k(long j10, long j11) {
        return ((LongBinaryOperator) this.f9727a).applyAsLong(j10, j11);
    }

    @Override // j$.util.function.f
    public /* synthetic */ double l(double d10, double d11) {
        return ((DoubleBinaryOperator) this.f9727a).applyAsDouble(d10, d11);
    }

    @Override // j$.util.function.v
    public /* synthetic */ void m(Object obj, int i10) {
        ((ObjIntConsumer) this.f9727a).accept(obj, i10);
    }

    @Override // j$.util.function.w
    public /* synthetic */ void o(Object obj, long j10) {
        ((ObjLongConsumer) this.f9727a).accept(obj, j10);
    }

    @Override // j$.util.function.j
    public /* synthetic */ long p(double d10) {
        return ((DoubleToLongFunction) this.f9727a).applyAsLong(d10);
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ Object s(Object obj, Object obj2) {
        return ((BinaryOperator) this.f9727a).apply(obj, obj2);
    }

    @Override // j$.util.function.B
    public /* synthetic */ double t(Object obj) {
        return ((ToDoubleFunction) this.f9727a).applyAsDouble(obj);
    }

    @Override // j$.util.function.n
    public /* synthetic */ Object u(int i10) {
        return ((IntFunction) this.f9727a).apply(i10);
    }

    @Override // j$.util.function.s
    public /* synthetic */ Object v(long j10) {
        return ((LongFunction) this.f9727a).apply(j10);
    }

    @Override // j$.util.function.t
    public /* synthetic */ long w(long j10) {
        return ((LongUnaryOperator) this.f9727a).applyAsLong(j10);
    }

    @Override // j$.util.function.i
    public /* synthetic */ Object x(double d10) {
        return ((DoubleFunction) this.f9727a).apply(d10);
    }

    @Override // j$.util.function.o
    public /* synthetic */ long y(int i10) {
        return ((IntToLongFunction) this.f9727a).applyAsLong(i10);
    }
}
