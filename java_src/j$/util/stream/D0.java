package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0259b;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0260c;
import j$.util.function.Predicate;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class D0 {

    /* renamed from: a  reason: collision with root package name */
    private static final P0 f9790a = new C0311h1(null);

    /* renamed from: b  reason: collision with root package name */
    private static final L0 f9791b = new C0301f1();

    /* renamed from: c  reason: collision with root package name */
    private static final N0 f9792c = new C0306g1();

    /* renamed from: d  reason: collision with root package name */
    private static final J0 f9793d = new C0296e1();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f9794e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f9795f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    private static final double[] f9796g = new double[0];

    public static void A() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC0369u0 A0(AbstractC0284c abstractC0284c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0379w2(abstractC0284c, 3, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static void B(InterfaceC0342n2 interfaceC0342n2, Double d10) {
        if (O3.f9877a) {
            O3.a(interfaceC0342n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC0342n2.c(d10.doubleValue());
        }
    }

    public static L3 B0(C0259b c0259b, A0 a02) {
        Objects.requireNonNull(c0259b);
        Objects.requireNonNull(a02);
        return new B0(3, a02, new C0339n(a02, c0259b, 3));
    }

    public static void C(InterfaceC0347o2 interfaceC0347o2, Integer num) {
        if (O3.f9877a) {
            O3.a(interfaceC0347o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC0347o2.d(num.intValue());
        }
    }

    public static void D(InterfaceC0352p2 interfaceC0352p2, Long l10) {
        if (O3.f9877a) {
            O3.a(interfaceC0352p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC0352p2.e(l10.longValue());
        }
    }

    public static Stream D0(AbstractC0284c abstractC0284c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0363s2(abstractC0284c, 1, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static void E() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static L3 E0(Predicate predicate, A0 a02) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(a02);
        return new B0(1, a02, new C0339n(a02, predicate, 4));
    }

    public static void F() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static L3 F0(j$.util.function.A a10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(a10);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return new F1(1, biConsumer2, biConsumer, a10, 3);
    }

    public static Object[] G(O0 o02, j$.util.function.n nVar) {
        if (O3.f9877a) {
            O3.a(o02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (o02.count() < 2147483639) {
            Object[] objArr = (Object[]) nVar.u((int) o02.count());
            o02.m(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static L3 G0(Object obj, BiFunction biFunction, InterfaceC0260c interfaceC0260c) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(interfaceC0260c);
        return new F1(1, interfaceC0260c, biFunction, obj, 2);
    }

    public static void H(J0 j02, Double[] dArr, int i10) {
        if (O3.f9877a) {
            O3.a(j02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) j02.k();
        for (int i11 = 0; i11 < dArr2.length; i11++) {
            dArr[i10 + i11] = Double.valueOf(dArr2[i11]);
        }
    }

    public static Stream H0(j$.util.H h10, boolean z10) {
        Objects.requireNonNull(h10);
        return new C0302f2(h10, EnumC0298e3.c(h10), z10);
    }

    public static void I(L0 l02, Integer[] numArr, int i10) {
        if (O3.f9877a) {
            O3.a(l02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) l02.k();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i10 + i11] = Integer.valueOf(iArr[i11]);
        }
    }

    public static void J(N0 n02, Long[] lArr, int i10) {
        if (O3.f9877a) {
            O3.a(n02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) n02.k();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i10 + i11] = Long.valueOf(jArr[i11]);
        }
    }

    public static void K(J0 j02, Consumer consumer) {
        if (consumer instanceof j$.util.function.h) {
            j02.l((j$.util.function.h) consumer);
        } else if (O3.f9877a) {
            O3.a(j02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.z) j02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void L(L0 l02, Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            l02.l((j$.util.function.m) consumer);
        } else if (O3.f9877a) {
            O3.a(l02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.B) l02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void M(N0 n02, Consumer consumer) {
        if (consumer instanceof j$.util.function.r) {
            n02.l((j$.util.function.r) consumer);
        } else if (O3.f9877a) {
            O3.a(n02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.D) n02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static J0 N(J0 j02, long j10, long j11) {
        if (j10 == 0 && j11 == j02.count()) {
            return j02;
        }
        long j12 = j11 - j10;
        j$.util.z zVar = (j$.util.z) j02.spliterator();
        E0 g02 = g0(j12);
        g02.j(j12);
        for (int i10 = 0; i10 < j10 && zVar.k(I0.f9828a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && zVar.k(g02); i11++) {
        }
        g02.h();
        return g02.b();
    }

    public static L0 O(L0 l02, long j10, long j11) {
        if (j10 == 0 && j11 == l02.count()) {
            return l02;
        }
        long j12 = j11 - j10;
        j$.util.B b10 = (j$.util.B) l02.spliterator();
        F0 s02 = s0(j12);
        s02.j(j12);
        for (int i10 = 0; i10 < j10 && b10.i(K0.f9842a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && b10.i(s02); i11++) {
        }
        s02.h();
        return s02.b();
    }

    public static N0 P(N0 n02, long j10, long j11) {
        if (j10 == 0 && j11 == n02.count()) {
            return n02;
        }
        long j12 = j11 - j10;
        j$.util.D d10 = (j$.util.D) n02.spliterator();
        G0 u02 = u0(j12);
        u02.j(j12);
        for (int i10 = 0; i10 < j10 && d10.g(M0.f9860a); i10++) {
        }
        for (int i11 = 0; i11 < j12 && d10.g(u02); i11++) {
        }
        u02.h();
        return u02.b();
    }

    public static P0 Q(P0 p02, long j10, long j11, j$.util.function.n nVar) {
        if (j10 == 0 && j11 == p02.count()) {
            return p02;
        }
        j$.util.H spliterator = p02.spliterator();
        long j12 = j11 - j10;
        H0 X = X(j12, nVar);
        X.j(j12);
        for (int i10 = 0; i10 < j10 && spliterator.a(C0274a.f9970s); i10++) {
        }
        for (int i11 = 0; i11 < j12 && spliterator.a(X); i11++) {
        }
        X.h();
        return X.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j$.util.H S(int i10, j$.util.H h10, long j10, long j11) {
        long Y = Y(j10, j11);
        int[] iArr = AbstractC0391z2.f10192a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return new u3((j$.util.z) h10, j10, Y);
                        }
                        throw new IllegalStateException("Unknown shape " + j$.time.a.c(i10));
                    }
                    return new y3((j$.util.D) h10, j10, Y);
                }
                return new w3((j$.util.B) h10, j10, Y);
            }
            return new A3(h10, j10, Y);
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long T(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static H0 X(long j10, j$.util.function.n nVar) {
        return (j10 < 0 || j10 >= 2147483639) ? new B1() : new C0321j1(j10, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long Y(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static P0 Z(D0 d02, j$.util.H h10, boolean z10, j$.util.function.n nVar) {
        long k02 = d02.k0(h10);
        if (k02 < 0 || !h10.hasCharacteristics(16384)) {
            P0 p02 = (P0) new U0(d02, nVar, h10).invoke();
            return z10 ? m0(p02, nVar) : p02;
        } else if (k02 < 2147483639) {
            Object[] objArr = (Object[]) nVar.u((int) k02);
            new C0390z1(h10, d02, objArr).invoke();
            return new S0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static J0 a0(D0 d02, j$.util.H h10, boolean z10) {
        long k02 = d02.k0(h10);
        if (k02 < 0 || !h10.hasCharacteristics(16384)) {
            J0 j02 = (J0) new U0(d02, h10, 0).invoke();
            return z10 ? n0(j02) : j02;
        } else if (k02 < 2147483639) {
            double[] dArr = new double[(int) k02];
            new C0378w1(h10, d02, dArr).invoke();
            return new C0281b1(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static L0 b0(D0 d02, j$.util.H h10, boolean z10) {
        long k02 = d02.k0(h10);
        if (k02 < 0 || !h10.hasCharacteristics(16384)) {
            L0 l02 = (L0) new U0(d02, h10, 1).invoke();
            return z10 ? o0(l02) : l02;
        } else if (k02 < 2147483639) {
            int[] iArr = new int[(int) k02];
            new C0382x1(h10, d02, iArr).invoke();
            return new C0326k1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    public static N0 c0(D0 d02, j$.util.H h10, boolean z10) {
        long k02 = d02.k0(h10);
        if (k02 < 0 || !h10.hasCharacteristics(16384)) {
            N0 n02 = (N0) new U0(d02, h10, 2).invoke();
            return z10 ? p0(n02) : n02;
        } else if (k02 < 2147483639) {
            long[] jArr = new long[(int) k02];
            new C0386y1(h10, d02, jArr).invoke();
            return new C0366t1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static P0 d0(int i10, P0 p02, P0 p03) {
        int[] iArr = Q0.f9883a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return new W0((J0) p02, (J0) p03);
                        }
                        throw new IllegalStateException("Unknown shape " + j$.time.a.c(i10));
                    }
                    return new Y0((N0) p02, (N0) p03);
                }
                return new X0((L0) p02, (L0) p03);
            }
            return new C0276a1(p02, p03);
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static E0 g0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0291d1() : new C0286c1(j10);
    }

    public static H h0(j$.util.z zVar, boolean z10) {
        return new C(zVar, EnumC0298e3.c(zVar), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static P0 i0(int i10) {
        int[] iArr = Q0.f9883a;
        if (i10 != 0) {
            int i11 = iArr[i10 - 1];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return f9793d;
                        }
                        throw new IllegalStateException("Unknown shape " + j$.time.a.c(i10));
                    }
                    return f9792c;
                }
                return f9791b;
            }
            return f9790a;
        }
        throw null;
    }

    private static int l0(long j10) {
        return (j10 != -1 ? EnumC0298e3.f10031u : 0) | EnumC0298e3.f10030t;
    }

    public static P0 m0(P0 p02, j$.util.function.n nVar) {
        if (p02.n() > 0) {
            long count = p02.count();
            if (count < 2147483639) {
                Object[] objArr = (Object[]) nVar.u((int) count);
                new D1(p02, objArr, 0, (Q0) null).invoke();
                return new S0(objArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return p02;
    }

    public static J0 n0(J0 j02) {
        if (j02.n() > 0) {
            long count = j02.count();
            if (count < 2147483639) {
                double[] dArr = new double[(int) count];
                new C1(j02, dArr, 0, (Q0) null).invoke();
                return new C0281b1(dArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return j02;
    }

    public static L0 o0(L0 l02) {
        if (l02.n() > 0) {
            long count = l02.count();
            if (count < 2147483639) {
                int[] iArr = new int[(int) count];
                new C1(l02, iArr, 0, (Q0) null).invoke();
                return new C0326k1(iArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return l02;
    }

    public static N0 p0(N0 n02) {
        if (n02.n() > 0) {
            long count = n02.count();
            if (count < 2147483639) {
                long[] jArr = new long[(int) count];
                new C1(n02, jArr, 0, (Q0) null).invoke();
                return new C0366t1(jArr);
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        return n02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static F0 s0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0336m1() : new C0331l1(j10);
    }

    public static InterfaceC0330l0 t0(j$.util.B b10, boolean z10) {
        return new C0305g0(b10, EnumC0298e3.c(b10), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static G0 u0(long j10) {
        return (j10 < 0 || j10 >= 2147483639) ? new C0374v1() : new C0370u1(j10);
    }

    public static InterfaceC0369u0 v0(j$.util.D d10, boolean z10) {
        return new C0350p0(d10, EnumC0298e3.c(d10), z10);
    }

    public static H w0(AbstractC0284c abstractC0284c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0387y2(abstractC0284c, 4, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static L3 x0(C0259b c0259b, A0 a02) {
        Objects.requireNonNull(c0259b);
        Objects.requireNonNull(a02);
        return new B0(4, a02, new C0339n(a02, c0259b, 1));
    }

    public static InterfaceC0330l0 y0(AbstractC0284c abstractC0284c, long j10, long j11) {
        if (j10 >= 0) {
            return new C0371u2(abstractC0284c, 2, l0(j11), j10, j11);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j10);
    }

    public static L3 z0(C0259b c0259b, A0 a02) {
        Objects.requireNonNull(c0259b);
        Objects.requireNonNull(a02);
        return new B0(2, a02, new C0339n(a02, c0259b, 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract H0 C0(long j10, j$.util.function.n nVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0356q2 I0(InterfaceC0356q2 interfaceC0356q2, j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0356q2 J0(InterfaceC0356q2 interfaceC0356q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract j$.util.H K0(j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e0(InterfaceC0356q2 interfaceC0356q2, j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f0(InterfaceC0356q2 interfaceC0356q2, j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract P0 j0(j$.util.H h10, boolean z10, j$.util.function.n nVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long k0(j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int q0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int r0();
}
