package j$.util.stream;

import j$.util.C0264i;
import j$.util.C0267l;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.LinkedHashSet;
import java.util.Objects;
/* renamed from: j$.util.stream.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0324k implements j$.util.function.A, BiConsumer, j$.util.function.u, j$.util.function.f, j$.util.function.n, Predicate, j$.util.function.v, j$.util.function.k, j$.util.function.w, j$.util.function.p, j$.util.function.s, InterfaceC0260c, j$.util.function.D, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10064a = new C0324k();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10065b = new C0324k();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10066c = new C0324k();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10067d = new C0324k();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10068e = new C0324k();

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10069f = new C0324k();

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10070g = new C0324k();

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10071h = new C0324k();

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10072i = new C0324k();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10073j = new C0324k();

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10074k = new C0324k();

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10075l = new C0324k();

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10076m = new C0324k();

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ C0324k f10077n = new C0324k();

    @Override // j$.util.function.u
    public void a(Object obj, double d10) {
        double[] dArr = (double[]) obj;
        int i10 = F.f9806t;
        dArr[2] = dArr[2] + 1.0d;
        AbstractC0334m.b(dArr, d10);
        dArr[3] = dArr[3] + d10;
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

    @Override // j$.util.function.D
    public long g(Object obj) {
        int i10 = AbstractC0317i2.f10058t;
        return 1L;
    }

    @Override // j$.util.function.A
    public Object get() {
        return new C0264i();
    }

    @Override // j$.util.function.k
    public int i(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @Override // j$.util.function.p
    public long k(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @Override // j$.util.function.f
    public double l(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @Override // j$.util.function.v
    public void m(Object obj, int i10) {
        long[] jArr = (long[]) obj;
        int i11 = AbstractC0320j0.f10061t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i10;
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.w
    public void o(Object obj, long j10) {
        long[] jArr = (long[]) obj;
        int i10 = AbstractC0361s0.f10131t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.BiFunction
    public Object s(Object obj, Object obj2) {
        return new X0((L0) obj, (L0) obj2);
    }

    @Override // j$.util.function.Predicate
    public boolean test(Object obj) {
        return ((C0267l) obj).c();
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        int i11 = F.f9806t;
        return new Double[i10];
    }

    @Override // j$.util.function.s
    public Object v(long j10) {
        return D0.g0(j10);
    }
}
