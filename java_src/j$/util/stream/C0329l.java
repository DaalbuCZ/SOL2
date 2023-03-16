package j$.util.stream;

import j$.util.C0263h;
import j$.util.C0265j;
import j$.util.C0268m;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.Objects;
/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0329l implements j$.util.function.A, BiConsumer, j$.util.function.u, Predicate, j$.util.function.n, j$.util.function.k, j$.util.function.p, j$.util.function.s, InterfaceC0260c, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10083a = new C0329l();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10084b = new C0329l();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10085c = new C0329l();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10086d = new C0329l();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10087e = new C0329l();

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10088f = new C0329l();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10089g = new C0329l();

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10090h = new C0329l();

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10091i = new C0329l();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ C0329l f10092j = new C0329l();

    @Override // j$.util.function.u
    public void a(Object obj, double d10) {
        double[] dArr = (double[]) obj;
        int i10 = F.f9806t;
        AbstractC0334m.b(dArr, d10);
        dArr[2] = dArr[2] + d10;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.function.A
    public Object get() {
        return new C0265j();
    }

    @Override // j$.util.function.k
    public int i(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @Override // j$.util.function.p
    public long k(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        ((C0263h) obj).a((C0263h) obj2);
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
        return new Y0((N0) obj, (N0) obj2);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0268m) obj).c();
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        int i11 = Z.f9941h;
        return new Object[i10];
    }

    @Override // j$.util.function.s
    public Object v(long j10) {
        return D0.s0(j10);
    }
}
