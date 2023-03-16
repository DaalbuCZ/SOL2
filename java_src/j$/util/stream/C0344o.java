package j$.util.stream;

import j$.util.C0269n;
import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.LinkedHashSet;
import java.util.Objects;
/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0344o implements j$.util.function.A, BiConsumer, Predicate, j$.util.function.n, j$.util.function.s, InterfaceC0260c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0344o f10108a = new C0344o();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C0344o f10109b = new C0344o();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ C0344o f10110c = new C0344o();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ C0344o f10111d = new C0344o();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ C0344o f10112e = new C0344o();

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ C0344o f10113f = new C0344o();

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.A
    public Object get() {
        return new LinkedHashSet();
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i10 = F.f9806t;
        AbstractC0334m.b(dArr, dArr2[0]);
        AbstractC0334m.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.BiFunction
    public Object s(Object obj, Object obj2) {
        return new C0276a1((P0) obj, (P0) obj2);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0269n) obj).c();
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        return Integer.valueOf(i10);
    }

    @Override // j$.util.function.s
    public Object v(long j10) {
        return D0.u0(j10);
    }
}
