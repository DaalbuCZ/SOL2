package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.h;
import com.google.protobuf.l0;
import com.google.protobuf.u1;
import com.google.protobuf.v1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
final class v0<T> implements h1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f6184r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f6185s = s1.D();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f6186a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f6187b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6188c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6189d;

    /* renamed from: e  reason: collision with root package name */
    private final s0 f6190e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6191f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f6192g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f6193h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f6194i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f6195j;

    /* renamed from: k  reason: collision with root package name */
    private final int f6196k;

    /* renamed from: l  reason: collision with root package name */
    private final int f6197l;

    /* renamed from: m  reason: collision with root package name */
    private final x0 f6198m;

    /* renamed from: n  reason: collision with root package name */
    private final i0 f6199n;

    /* renamed from: o  reason: collision with root package name */
    private final o1<?, ?> f6200o;

    /* renamed from: p  reason: collision with root package name */
    private final q<?> f6201p;

    /* renamed from: q  reason: collision with root package name */
    private final n0 f6202q;

    private v0(int[] iArr, Object[] objArr, int i10, int i11, s0 s0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, q<?> qVar, n0 n0Var) {
        this.f6186a = iArr;
        this.f6187b = objArr;
        this.f6188c = i10;
        this.f6189d = i11;
        this.f6192g = s0Var instanceof y;
        this.f6193h = z10;
        this.f6191f = qVar != null && qVar.e(s0Var);
        this.f6194i = z11;
        this.f6195j = iArr2;
        this.f6196k = i12;
        this.f6197l = i13;
        this.f6198m = x0Var;
        this.f6199n = i0Var;
        this.f6200o = o1Var;
        this.f6201p = qVar;
        this.f6190e = s0Var;
        this.f6202q = n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i10, h1 h1Var) {
        return h1Var.d(s1.C(obj, R(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean B(Object obj, int i10, int i11) {
        List list = (List) s1.C(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        h1 s10 = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!s10.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.h1] */
    private boolean C(T t10, int i10, int i11) {
        Map<?, ?> g10 = this.f6202q.g(s1.C(t10, R(i10)));
        if (g10.isEmpty()) {
            return true;
        }
        if (this.f6202q.f(r(i11)).f6046c.e() != u1.c.MESSAGE) {
            return true;
        }
        h1<T> h1Var = 0;
        for (Object obj : g10.values()) {
            if (h1Var == null) {
                h1Var = d1.a().d(obj.getClass());
            }
            boolean d10 = h1Var.d(obj);
            h1Var = h1Var;
            if (!d10) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long Y = Y(i10) & 1048575;
        return s1.z(t10, Y) == s1.z(t11, Y);
    }

    private boolean E(T t10, int i10, int i11) {
        return s1.z(t10, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> G(Object obj, long j10) {
        return (List) s1.C(obj, j10);
    }

    private static <T> long H(T t10, long j10) {
        return s1.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.f6196k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.f6197l) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = n(r19, r16.f6195j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.u.b<ET>> void I(com.google.protobuf.o1<UT, UB> r17, com.google.protobuf.q<ET> r18, T r19, com.google.protobuf.g1 r20, com.google.protobuf.p r21) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.I(com.google.protobuf.o1, com.google.protobuf.q, java.lang.Object, com.google.protobuf.g1, com.google.protobuf.p):void");
    }

    private final <K, V> void J(Object obj, int i10, Object obj2, p pVar, g1 g1Var) {
        long R = R(i0(i10));
        Object C = s1.C(obj, R);
        if (C == null) {
            C = this.f6202q.b(obj2);
            s1.R(obj, R, C);
        } else if (this.f6202q.d(C)) {
            Object b10 = this.f6202q.b(obj2);
            this.f6202q.a(b10, C);
            s1.R(obj, R, b10);
            C = b10;
        }
        g1Var.x(this.f6202q.h(C), this.f6202q.f(obj2), pVar);
    }

    private void K(T t10, T t11, int i10) {
        long R = R(i0(i10));
        if (y(t11, i10)) {
            Object C = s1.C(t10, R);
            Object C2 = s1.C(t11, R);
            if (C != null && C2 != null) {
                C2 = a0.h(C, C2);
            } else if (C2 == null) {
                return;
            }
            s1.R(t10, R, C2);
            e0(t10, i10);
        }
    }

    private void L(T t10, T t11, int i10) {
        int i02 = i0(i10);
        int Q = Q(i10);
        long R = R(i02);
        if (E(t11, Q, i10)) {
            Object C = E(t10, Q, i10) ? s1.C(t10, R) : null;
            Object C2 = s1.C(t11, R);
            if (C != null && C2 != null) {
                C2 = a0.h(C, C2);
            } else if (C2 == null) {
                return;
            }
            s1.R(t10, R, C2);
            f0(t10, Q, i10);
        }
    }

    private void M(T t10, T t11, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        int Q = Q(i10);
        switch (h0(i02)) {
            case 0:
                if (y(t11, i10)) {
                    s1.N(t10, R, s1.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (y(t11, i10)) {
                    s1.O(t10, R, s1.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (!y(t11, i10)) {
                    return;
                }
                s1.Q(t10, R, s1.A(t11, R));
                e0(t10, i10);
                return;
            case 3:
                if (!y(t11, i10)) {
                    return;
                }
                s1.Q(t10, R, s1.A(t11, R));
                e0(t10, i10);
                return;
            case 4:
                if (!y(t11, i10)) {
                    return;
                }
                s1.P(t10, R, s1.z(t11, R));
                e0(t10, i10);
                return;
            case 5:
                if (!y(t11, i10)) {
                    return;
                }
                s1.Q(t10, R, s1.A(t11, R));
                e0(t10, i10);
                return;
            case 6:
                if (!y(t11, i10)) {
                    return;
                }
                s1.P(t10, R, s1.z(t11, R));
                e0(t10, i10);
                return;
            case 7:
                if (y(t11, i10)) {
                    s1.H(t10, R, s1.r(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (!y(t11, i10)) {
                    return;
                }
                s1.R(t10, R, s1.C(t11, R));
                e0(t10, i10);
                return;
            case 9:
            case 17:
                K(t10, t11, i10);
                return;
            case 10:
                if (!y(t11, i10)) {
                    return;
                }
                s1.R(t10, R, s1.C(t11, R));
                e0(t10, i10);
                return;
            case 11:
                if (!y(t11, i10)) {
                    return;
                }
                s1.P(t10, R, s1.z(t11, R));
                e0(t10, i10);
                return;
            case 12:
                if (!y(t11, i10)) {
                    return;
                }
                s1.P(t10, R, s1.z(t11, R));
                e0(t10, i10);
                return;
            case 13:
                if (!y(t11, i10)) {
                    return;
                }
                s1.P(t10, R, s1.z(t11, R));
                e0(t10, i10);
                return;
            case 14:
                if (!y(t11, i10)) {
                    return;
                }
                s1.Q(t10, R, s1.A(t11, R));
                e0(t10, i10);
                return;
            case 15:
                if (!y(t11, i10)) {
                    return;
                }
                s1.P(t10, R, s1.z(t11, R));
                e0(t10, i10);
                return;
            case 16:
                if (!y(t11, i10)) {
                    return;
                }
                s1.Q(t10, R, s1.A(t11, R));
                e0(t10, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case c.j.f3071t3 /* 23 */:
            case c.j.f3076u3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case c.j.f3101z3 /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f6199n.d(t10, t11, R);
                return;
            case 50:
                j1.F(this.f6202q, t10, t11, R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!E(t11, Q, i10)) {
                    return;
                }
                s1.R(t10, R, s1.C(t11, R));
                f0(t10, Q, i10);
                return;
            case 60:
            case 68:
                L(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!E(t11, Q, i10)) {
                    return;
                }
                s1.R(t10, R, s1.C(t11, R));
                f0(t10, Q, i10);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> v0<T> N(Class<T> cls, q0 q0Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, q<?> qVar, n0 n0Var) {
        return q0Var instanceof f1 ? P((f1) q0Var, x0Var, i0Var, o1Var, qVar, n0Var) : O((l1) q0Var, x0Var, i0Var, o1Var, qVar, n0Var);
    }

    static <T> v0<T> O(l1 l1Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, q<?> qVar, n0 n0Var) {
        boolean z10 = l1Var.b() == c1.PROTO3;
        t[] e10 = l1Var.e();
        if (e10.length != 0) {
            t tVar = e10[0];
            throw null;
        }
        int length = e10.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e10.length > 0) {
            t tVar2 = e10[0];
            throw null;
        }
        int[] d10 = l1Var.d();
        if (d10 == null) {
            d10 = f6184r;
        }
        if (e10.length > 0) {
            t tVar3 = e10[0];
            throw null;
        }
        int[] iArr2 = f6184r;
        int[] iArr3 = f6184r;
        int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
        System.arraycopy(d10, 0, iArr4, 0, d10.length);
        System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
        return new v0<>(iArr, objArr, 0, 0, l1Var.c(), z10, true, iArr4, d10.length, d10.length + iArr2.length, x0Var, i0Var, o1Var, qVar, n0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.protobuf.v0<T> P(com.google.protobuf.f1 r34, com.google.protobuf.x0 r35, com.google.protobuf.i0 r36, com.google.protobuf.o1<?, ?> r37, com.google.protobuf.q<?> r38, com.google.protobuf.n0 r39) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.P(com.google.protobuf.f1, com.google.protobuf.x0, com.google.protobuf.i0, com.google.protobuf.o1, com.google.protobuf.q, com.google.protobuf.n0):com.google.protobuf.v0");
    }

    private int Q(int i10) {
        return this.f6186a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean S(T t10, long j10) {
        return ((Boolean) s1.C(t10, j10)).booleanValue();
    }

    private static <T> double T(T t10, long j10) {
        return ((Double) s1.C(t10, j10)).doubleValue();
    }

    private static <T> float U(T t10, long j10) {
        return ((Float) s1.C(t10, j10)).floatValue();
    }

    private static <T> int V(T t10, long j10) {
        return ((Integer) s1.C(t10, j10)).intValue();
    }

    private static <T> long W(T t10, long j10) {
        return ((Long) s1.C(t10, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f6188c || i10 > this.f6189d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f6186a[i10 + 2];
    }

    private <E> void Z(Object obj, long j10, g1 g1Var, h1<E> h1Var, p pVar) {
        g1Var.j(this.f6199n.e(obj, j10), h1Var, pVar);
    }

    private <E> void a0(Object obj, int i10, g1 g1Var, h1<E> h1Var, p pVar) {
        g1Var.s(this.f6199n.e(obj, R(i10)), h1Var, pVar);
    }

    private void b0(Object obj, int i10, g1 g1Var) {
        long R;
        Object B;
        if (x(i10)) {
            R = R(i10);
            B = g1Var.M();
        } else if (this.f6192g) {
            R = R(i10);
            B = g1Var.o();
        } else {
            R = R(i10);
            B = g1Var.B();
        }
        s1.R(obj, R, B);
    }

    private void c0(Object obj, int i10, g1 g1Var) {
        if (x(i10)) {
            g1Var.z(this.f6199n.e(obj, R(i10)));
        } else {
            g1Var.u(this.f6199n.e(obj, R(i10)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t10, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 == 1048575) {
            return;
        }
        s1.P(t10, j10, (1 << (Y >>> 20)) | s1.z(t10, j10));
    }

    private void f0(T t10, int i10, int i11) {
        s1.P(t10, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f6186a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Q = Q(i13);
            if (i10 == Q) {
                return i13;
            }
            if (i10 < Q) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int i0(int i10) {
        return this.f6186a[i10 + 1];
    }

    private boolean j(T t10, T t11, int i10) {
        return y(t10, i10) == y(t11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(T r18, com.google.protobuf.v1 r19) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.j0(java.lang.Object, com.google.protobuf.v1):void");
    }

    private static <T> boolean k(T t10, long j10) {
        return s1.r(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(T r13, com.google.protobuf.v1 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.k0(java.lang.Object, com.google.protobuf.v1):void");
    }

    private static <T> double l(T t10, long j10) {
        return s1.x(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(T r11, com.google.protobuf.v1 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.l0(java.lang.Object, com.google.protobuf.v1):void");
    }

    private boolean m(T t10, T t11, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        switch (h0(i02)) {
            case 0:
                return j(t10, t11, i10) && Double.doubleToLongBits(s1.x(t10, R)) == Double.doubleToLongBits(s1.x(t11, R));
            case 1:
                return j(t10, t11, i10) && Float.floatToIntBits(s1.y(t10, R)) == Float.floatToIntBits(s1.y(t11, R));
            case 2:
                return j(t10, t11, i10) && s1.A(t10, R) == s1.A(t11, R);
            case 3:
                return j(t10, t11, i10) && s1.A(t10, R) == s1.A(t11, R);
            case 4:
                return j(t10, t11, i10) && s1.z(t10, R) == s1.z(t11, R);
            case 5:
                return j(t10, t11, i10) && s1.A(t10, R) == s1.A(t11, R);
            case 6:
                return j(t10, t11, i10) && s1.z(t10, R) == s1.z(t11, R);
            case 7:
                return j(t10, t11, i10) && s1.r(t10, R) == s1.r(t11, R);
            case 8:
                return j(t10, t11, i10) && j1.K(s1.C(t10, R), s1.C(t11, R));
            case 9:
                return j(t10, t11, i10) && j1.K(s1.C(t10, R), s1.C(t11, R));
            case 10:
                return j(t10, t11, i10) && j1.K(s1.C(t10, R), s1.C(t11, R));
            case 11:
                return j(t10, t11, i10) && s1.z(t10, R) == s1.z(t11, R);
            case 12:
                return j(t10, t11, i10) && s1.z(t10, R) == s1.z(t11, R);
            case 13:
                return j(t10, t11, i10) && s1.z(t10, R) == s1.z(t11, R);
            case 14:
                return j(t10, t11, i10) && s1.A(t10, R) == s1.A(t11, R);
            case 15:
                return j(t10, t11, i10) && s1.z(t10, R) == s1.z(t11, R);
            case 16:
                return j(t10, t11, i10) && s1.A(t10, R) == s1.A(t11, R);
            case 17:
                return j(t10, t11, i10) && j1.K(s1.C(t10, R), s1.C(t11, R));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case c.j.f3071t3 /* 23 */:
            case c.j.f3076u3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case c.j.f3101z3 /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return j1.K(s1.C(t10, R), s1.C(t11, R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(t10, t11, i10) && j1.K(s1.C(t10, R), s1.C(t11, R));
            default:
                return true;
        }
    }

    private <K, V> void m0(v1 v1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            v1Var.x(i10, this.f6202q.f(r(i11)), this.f6202q.g(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub, o1<UT, UB> o1Var) {
        a0.e q10;
        int Q = Q(i10);
        Object C = s1.C(obj, R(i0(i10)));
        return (C == null || (q10 = q(i10)) == null) ? ub : (UB) o(i10, Q, this.f6202q.h(C), q10, ub, o1Var);
    }

    private void n0(int i10, Object obj, v1 v1Var) {
        if (obj instanceof String) {
            v1Var.G(i10, (String) obj);
        } else {
            v1Var.l(i10, (h) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, a0.e eVar, UB ub, o1<UT, UB> o1Var) {
        l0.a<?, ?> f10 = this.f6202q.f(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o1Var.n();
                }
                h.C0085h E = h.E(l0.b(f10, next.getKey(), next.getValue()));
                try {
                    l0.e(E.b(), f10, next.getKey(), next.getValue());
                    o1Var.d(ub, i11, E.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private <UT, UB> void o0(o1<UT, UB> o1Var, T t10, v1 v1Var) {
        o1Var.t(o1Var.g(t10), v1Var);
    }

    private static <T> float p(T t10, long j10) {
        return s1.y(t10, j10);
    }

    private a0.e q(int i10) {
        return (a0.e) this.f6187b[((i10 / 3) * 2) + 1];
    }

    private Object r(int i10) {
        return this.f6187b[(i10 / 3) * 2];
    }

    private h1 s(int i10) {
        int i11 = (i10 / 3) * 2;
        h1 h1Var = (h1) this.f6187b[i11];
        if (h1Var != null) {
            return h1Var;
        }
        h1<T> d10 = d1.a().d((Class) this.f6187b[i11 + 1]);
        this.f6187b[i11] = d10;
        return d10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b9, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cb, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01dd, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ef, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0200, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0211, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0222, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0233, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0244, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0255, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0257, code lost:
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025b, code lost:
        r4 = (com.google.protobuf.k.U(r10) + com.google.protobuf.k.W(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x031d, code lost:
        if ((r8 & r15) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x031f, code lost:
        r3 = com.google.protobuf.k.s(r10, (com.google.protobuf.s0) r2.getObject(r17, r13), s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x034a, code lost:
        if ((r8 & r15) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x034c, code lost:
        r3 = com.google.protobuf.k.M(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0353, code lost:
        if ((r8 & r15) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0355, code lost:
        r4 = com.google.protobuf.k.K(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0378, code lost:
        if ((r8 & r15) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037a, code lost:
        r3 = com.google.protobuf.k.g(r10, (com.google.protobuf.h) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0387, code lost:
        if ((r8 & r15) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0389, code lost:
        r3 = com.google.protobuf.j1.o(r10, r2.getObject(r17, r13), s(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03b4, code lost:
        if ((r8 & r15) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03b6, code lost:
        r3 = com.google.protobuf.k.d(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (E(r17, r10, r5) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (E(r17, r10, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (E(r17, r10, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
        if (E(r17, r10, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
        if (E(r17, r10, r5) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (E(r17, r10, r5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0183, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0195, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a7, code lost:
        if (r16.f6194i != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int t(T r17) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.t(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0184, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a8, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b9, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ca, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01db, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ec, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fd, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020e, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0210, code lost:
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0214, code lost:
        r6 = (com.google.protobuf.k.U(r8) + com.google.protobuf.k.W(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0334, code lost:
        if ((r6 instanceof com.google.protobuf.h) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
        if ((r6 instanceof com.google.protobuf.h) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r6 = com.google.protobuf.k.S(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014e, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
        if (r15.f6194i != false) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int u(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.u(java.lang.Object):int");
    }

    private <UT, UB> int v(o1<UT, UB> o1Var, T t10) {
        return o1Var.h(o1Var.g(t10));
    }

    private static <T> int w(T t10, long j10) {
        return s1.z(t10, j10);
    }

    private static boolean x(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean y(T t10, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 != 1048575) {
            return (s1.z(t10, j10) & (1 << (Y >>> 20))) != 0;
        }
        int i02 = i0(i10);
        long R = R(i02);
        switch (h0(i02)) {
            case 0:
                return s1.x(t10, R) != 0.0d;
            case 1:
                return s1.y(t10, R) != 0.0f;
            case 2:
                return s1.A(t10, R) != 0;
            case 3:
                return s1.A(t10, R) != 0;
            case 4:
                return s1.z(t10, R) != 0;
            case 5:
                return s1.A(t10, R) != 0;
            case 6:
                return s1.z(t10, R) != 0;
            case 7:
                return s1.r(t10, R);
            case 8:
                Object C = s1.C(t10, R);
                if (C instanceof String) {
                    return !((String) C).isEmpty();
                }
                if (C instanceof h) {
                    return !h.f5966o.equals(C);
                }
                throw new IllegalArgumentException();
            case 9:
                return s1.C(t10, R) != null;
            case 10:
                return !h.f5966o.equals(s1.C(t10, R));
            case 11:
                return s1.z(t10, R) != 0;
            case 12:
                return s1.z(t10, R) != 0;
            case 13:
                return s1.z(t10, R) != 0;
            case 14:
                return s1.A(t10, R) != 0;
            case 15:
                return s1.z(t10, R) != 0;
            case 16:
                return s1.A(t10, R) != 0;
            case 17:
                return s1.C(t10, R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean z(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? y(t10, i10) : (i12 & i13) != 0;
    }

    @Override // com.google.protobuf.h1
    public void a(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f6186a.length; i10 += 3) {
            M(t10, t11, i10);
        }
        j1.G(this.f6200o, t10, t11);
        if (this.f6191f) {
            j1.E(this.f6201p, t10, t11);
        }
    }

    @Override // com.google.protobuf.h1
    public void b(T t10, v1 v1Var) {
        if (v1Var.B() == v1.a.DESCENDING) {
            l0(t10, v1Var);
        } else if (this.f6193h) {
            k0(t10, v1Var);
        } else {
            j0(t10, v1Var);
        }
    }

    @Override // com.google.protobuf.h1
    public void c(T t10) {
        int i10;
        int i11 = this.f6196k;
        while (true) {
            i10 = this.f6197l;
            if (i11 >= i10) {
                break;
            }
            long R = R(i0(this.f6195j[i11]));
            Object C = s1.C(t10, R);
            if (C != null) {
                s1.R(t10, R, this.f6202q.e(C));
            }
            i11++;
        }
        int length = this.f6195j.length;
        while (i10 < length) {
            this.f6199n.c(t10, this.f6195j[i10]);
            i10++;
        }
        this.f6200o.j(t10);
        if (this.f6191f) {
            this.f6201p.f(t10);
        }
    }

    @Override // com.google.protobuf.h1
    public final boolean d(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f6196k) {
            int i15 = this.f6195j[i14];
            int Q = Q(i15);
            int i02 = i0(i15);
            int i16 = this.f6186a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f6185s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (F(i02) && !z(t10, i15, i10, i11, i18)) {
                return false;
            }
            int h02 = h0(i02);
            if (h02 != 9 && h02 != 17) {
                if (h02 != 27) {
                    if (h02 == 60 || h02 == 68) {
                        if (E(t10, Q, i15) && !A(t10, i02, s(i15))) {
                            return false;
                        }
                    } else if (h02 != 49) {
                        if (h02 == 50 && !C(t10, i02, i15)) {
                            return false;
                        }
                    }
                }
                if (!B(t10, i02, i15)) {
                    return false;
                }
            } else if (z(t10, i15, i10, i11, i18) && !A(t10, i02, s(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.f6191f || this.f6201p.c(t10).p();
    }

    @Override // com.google.protobuf.h1
    public void e(T t10, g1 g1Var, p pVar) {
        Objects.requireNonNull(pVar);
        I(this.f6200o, this.f6201p, t10, g1Var, pVar);
    }

    @Override // com.google.protobuf.h1
    public boolean f(T t10, T t11) {
        int length = this.f6186a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(t10, t11, i10)) {
                return false;
            }
        }
        if (this.f6200o.g(t10).equals(this.f6200o.g(t11))) {
            if (this.f6191f) {
                return this.f6201p.c(t10).equals(this.f6201p.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.h1
    public int g(T t10) {
        return this.f6193h ? u(t10) : t(t10);
    }

    @Override // com.google.protobuf.h1
    public T h() {
        return (T) this.f6198m.a(this.f6190e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.protobuf.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.i(java.lang.Object):int");
    }
}
