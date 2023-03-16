package j$.util.stream;

import j$.util.C0263h;
import j$.util.C0264i;
import j$.util.C0265j;
import j$.util.C0266k;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.LinkedHashSet;
import java.util.Objects;
/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0274a implements j$.util.function.n, j$.util.function.A, BiConsumer, j$.util.function.u, j$.util.function.B, j$.util.function.f, j$.util.function.i, j$.util.function.j, Predicate, j$.util.function.v, j$.util.function.C, j$.util.function.k, j$.util.function.o, j$.util.function.w, j$.util.function.D, j$.util.function.p, j$.util.function.s, j$.util.function.t, Consumer, InterfaceC0260c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9952a = new C0274a();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9953b = new C0274a();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9954c = new C0274a();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9955d = new C0274a();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9956e = new C0274a();

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9957f = new C0274a();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9958g = new C0274a();

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9959h = new C0274a();

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9960i = new C0274a();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9961j = new C0274a();

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9962k = new C0274a();

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9963l = new C0274a();

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9964m = new C0274a();

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9965n = new C0274a();

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9966o = new C0274a();

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9967p = new C0274a();

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9968q = new C0274a();

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9969r = new C0274a();

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9970s = new C0274a();

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ C0274a f9971t = new C0274a();

    @Override // j$.util.function.u
    public void a(Object obj, double d10) {
        ((C0263h) obj).c(d10);
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

    @Override // j$.util.function.C
    public int f(Object obj) {
        int i10 = AbstractC0320j0.f10061t;
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.D
    public long g(Object obj) {
        int i10 = AbstractC0361s0.f10131t;
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.A
    public Object get() {
        return new C0263h();
    }

    @Override // j$.util.function.k
    public int i(int i10, int i11) {
        return i10 + i11;
    }

    @Override // j$.util.function.p
    public long k(long j10, long j11) {
        return j10 + j11;
    }

    @Override // j$.util.function.f
    public double l(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @Override // j$.util.function.v
    public void m(Object obj, int i10) {
        ((C0264i) obj).d(i10);
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.w
    public void o(Object obj, long j10) {
        ((C0265j) obj).e(j10);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.j
    public long p(double d10) {
        int i10 = F.f9806t;
        return 1L;
    }

    @Override // j$.util.function.BiFunction
    public Object s(Object obj, Object obj2) {
        return new W0((J0) obj, (J0) obj2);
    }

    @Override // j$.util.function.B
    public double t(Object obj) {
        int i10 = F.f9806t;
        return ((Double) obj).doubleValue();
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0266k) obj).c();
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        int i11 = AbstractC0284c.f9987s;
        return new Object[i10];
    }

    @Override // j$.util.function.s
    public Object v(long j10) {
        return Long.valueOf(j10);
    }

    @Override // j$.util.function.t
    public long w(long j10) {
        int i10 = AbstractC0361s0.f10131t;
        return 1L;
    }

    @Override // j$.util.function.i
    public Object x(double d10) {
        return Double.valueOf(d10);
    }

    @Override // j$.util.function.o
    public long y(int i10) {
        int i11 = AbstractC0320j0.f10061t;
        return 1L;
    }
}
