package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ra<T> implements za<T> {

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f4120p = new int[0];

    /* renamed from: q  reason: collision with root package name */
    private static final Unsafe f4121q = bc.l();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f4122a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f4123b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4124c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4125d;

    /* renamed from: e  reason: collision with root package name */
    private final oa f4126e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4127f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f4128g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f4129h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4130i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4131j;

    /* renamed from: k  reason: collision with root package name */
    private final ca f4132k;

    /* renamed from: l  reason: collision with root package name */
    private final rb f4133l;

    /* renamed from: m  reason: collision with root package name */
    private final v8 f4134m;

    /* renamed from: n  reason: collision with root package name */
    private final ta f4135n;

    /* renamed from: o  reason: collision with root package name */
    private final ja f4136o;

    private ra(int[] iArr, Object[] objArr, int i10, int i11, oa oaVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, ta taVar, ca caVar, rb rbVar, v8 v8Var, ja jaVar, byte[] bArr) {
        this.f4122a = iArr;
        this.f4123b = objArr;
        this.f4124c = i10;
        this.f4125d = i11;
        this.f4128g = z10;
        boolean z12 = false;
        if (v8Var != null && v8Var.c(oaVar)) {
            z12 = true;
        }
        this.f4127f = z12;
        this.f4129h = iArr2;
        this.f4130i = i12;
        this.f4131j = i13;
        this.f4135n = taVar;
        this.f4132k = caVar;
        this.f4133l = rbVar;
        this.f4134m = v8Var;
        this.f4126e = oaVar;
        this.f4136o = jaVar;
    }

    private final void A(kc kcVar, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        ha haVar = (ha) o(i11);
        throw null;
    }

    private final boolean B(Object obj, Object obj2, int i10) {
        return C(obj, i10) == C(obj2, i10);
    }

    private final boolean C(Object obj, int i10) {
        int Y = Y(i10);
        long j10 = Y & 1048575;
        if (j10 != 1048575) {
            return (bc.h(obj, j10) & (1 << (Y >>> 20))) != 0;
        }
        int k10 = k(i10);
        long j11 = k10 & 1048575;
        switch (j(k10)) {
            case 0:
                return Double.doubleToRawLongBits(bc.f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(bc.g(obj, j11)) != 0;
            case 2:
                return bc.i(obj, j11) != 0;
            case 3:
                return bc.i(obj, j11) != 0;
            case 4:
                return bc.h(obj, j11) != 0;
            case 5:
                return bc.i(obj, j11) != 0;
            case 6:
                return bc.h(obj, j11) != 0;
            case 7:
                return bc.B(obj, j11);
            case 8:
                Object k11 = bc.k(obj, j11);
                if (k11 instanceof String) {
                    return !((String) k11).isEmpty();
                } else if (k11 instanceof h8) {
                    return !h8.f3880o.equals(k11);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return bc.k(obj, j11) != null;
            case 10:
                return !h8.f3880o.equals(bc.k(obj, j11));
            case 11:
                return bc.h(obj, j11) != 0;
            case 12:
                return bc.h(obj, j11) != 0;
            case 13:
                return bc.h(obj, j11) != 0;
            case 14:
                return bc.i(obj, j11) != 0;
            case 15:
                return bc.h(obj, j11) != 0;
            case 16:
                return bc.i(obj, j11) != 0;
            case 17:
                return bc.k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean D(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? C(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean E(Object obj, int i10, za zaVar) {
        return zaVar.h(bc.k(obj, i10 & 1048575));
    }

    private static boolean F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof i9) {
            return ((i9) obj).x();
        }
        return true;
    }

    private final boolean G(Object obj, int i10, int i11) {
        return bc.h(obj, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean H(Object obj, long j10) {
        return ((Boolean) bc.k(obj, j10)).booleanValue();
    }

    private static final void I(int i10, Object obj, kc kcVar) {
        if (obj instanceof String) {
            kcVar.o(i10, (String) obj);
        } else {
            kcVar.A(i10, (h8) obj);
        }
    }

    static sb K(Object obj) {
        i9 i9Var = (i9) obj;
        sb sbVar = i9Var.zzc;
        if (sbVar == sb.c()) {
            sb f10 = sb.f();
            i9Var.zzc = f10;
            return f10;
        }
        return sbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ra L(Class cls, la laVar, ta taVar, ca caVar, rb rbVar, v8 v8Var, ja jaVar) {
        if (laVar instanceof ya) {
            return M((ya) laVar, taVar, caVar, rbVar, v8Var, jaVar);
        }
        ob obVar = (ob) laVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.ra M(com.google.android.gms.internal.measurement.ya r34, com.google.android.gms.internal.measurement.ta r35, com.google.android.gms.internal.measurement.ca r36, com.google.android.gms.internal.measurement.rb r37, com.google.android.gms.internal.measurement.v8 r38, com.google.android.gms.internal.measurement.ja r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.M(com.google.android.gms.internal.measurement.ya, com.google.android.gms.internal.measurement.ta, com.google.android.gms.internal.measurement.ca, com.google.android.gms.internal.measurement.rb, com.google.android.gms.internal.measurement.v8, com.google.android.gms.internal.measurement.ja):com.google.android.gms.internal.measurement.ra");
    }

    private static double N(Object obj, long j10) {
        return ((Double) bc.k(obj, j10)).doubleValue();
    }

    private static float O(Object obj, long j10) {
        return ((Float) bc.k(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x020c, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0219, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0226, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0233, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0240, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024d, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024f, code lost:
        r4 = com.google.android.gms.internal.measurement.p8.D(r11) + com.google.android.gms.internal.measurement.p8.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (G(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (G(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (G(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
        if (G(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
        if (G(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
        if (G(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
        r3 = R(r17, r3);
        r4 = com.google.android.gms.internal.measurement.p8.a(r11 << 3);
        r3 = com.google.android.gms.internal.measurement.p8.z(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
        if (G(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0143, code lost:
        if (G(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
        r6 = r6 + (com.google.android.gms.internal.measurement.p8.a(r11 << 3) + com.google.android.gms.internal.measurement.p8.b(l(r17, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
        if (G(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
        r3 = com.google.android.gms.internal.measurement.p8.a(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:
        if (G(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
        r3 = com.google.android.gms.internal.measurement.p8.a(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ba, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e4, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f2, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ff, code lost:
        if (r3 > 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int P(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.P(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.h8) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0311, code lost:
        r5 = com.google.android.gms.internal.measurement.p8.a(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.p8.C((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.h8) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int Q(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.Q(java.lang.Object):int");
    }

    private static int R(Object obj, long j10) {
        return ((Integer) bc.k(obj, j10)).intValue();
    }

    private final int S(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, t7 t7Var) {
        Unsafe unsafe = f4121q;
        Object o10 = o(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((ia) object).h()) {
            ia d10 = ia.c().d();
            ja.b(d10, object);
            unsafe.putObject(obj, j10, d10);
        }
        ha haVar = (ha) o10;
        throw null;
    }

    private final int T(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, t7 t7Var) {
        Unsafe unsafe = f4121q;
        long j11 = this.f4122a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(u7.p(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(u7.b(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m10 = u7.m(bArr, i10, t7Var);
                    unsafe.putObject(obj, j10, Long.valueOf(t7Var.f4188b));
                    unsafe.putInt(obj, j11, i13);
                    return m10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int j12 = u7.j(bArr, i10, t7Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(t7Var.f4187a));
                    unsafe.putInt(obj, j11, i13);
                    return j12;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(u7.p(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(u7.b(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int m11 = u7.m(bArr, i10, t7Var);
                    unsafe.putObject(obj, j10, Boolean.valueOf(t7Var.f4188b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return m11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int j13 = u7.j(bArr, i10, t7Var);
                    int i18 = t7Var.f4187a;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !hc.f(bArr, j13, j13 + i18)) {
                        throw r9.c();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, j13, i18, p9.f4067b));
                        j13 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return j13;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object q10 = q(obj, i13, i17);
                    int o10 = u7.o(q10, n(i17), bArr, i10, i11, t7Var);
                    y(obj, i13, i17, q10);
                    return o10;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int a10 = u7.a(bArr, i10, t7Var);
                    unsafe.putObject(obj, j10, t7Var.f4189c);
                    unsafe.putInt(obj, j11, i13);
                    return a10;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int j14 = u7.j(bArr, i10, t7Var);
                    int i19 = t7Var.f4187a;
                    l9 m12 = m(i17);
                    if (m12 == null || m12.a(i19)) {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    } else {
                        K(obj).j(i12, Long.valueOf(i19));
                    }
                    return j14;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int j15 = u7.j(bArr, i10, t7Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(l8.a(t7Var.f4187a)));
                    unsafe.putInt(obj, j11, i13);
                    return j15;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int m13 = u7.m(bArr, i10, t7Var);
                    unsafe.putObject(obj, j10, Long.valueOf(l8.b(t7Var.f4188b)));
                    unsafe.putInt(obj, j11, i13);
                    return m13;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object q11 = q(obj, i13, i17);
                    int n10 = u7.n(q11, n(i17), bArr, i10, i11, (i12 & (-8)) | 4, t7Var);
                    y(obj, i13, i17, q11);
                    return n10;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e0, code lost:
        if (r0 != r24) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e2, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f5, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0321, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0342, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int U(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.t7 r35) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.U(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.t7):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0250, code lost:
        if (r29.f4188b != 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0252, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0254, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0255, code lost:
        r12.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0258, code lost:
        if (r4 >= r19) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025a, code lost:
        r6 = com.google.android.gms.internal.measurement.u7.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0260, code lost:
        if (r20 == r29.f4187a) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0263, code lost:
        r4 = com.google.android.gms.internal.measurement.u7.m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x026b, code lost:
        if (r29.f4188b == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026e, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.google.android.gms.internal.measurement.h8.f3880o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.google.android.gms.internal.measurement.h8.E(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.google.android.gms.internal.measurement.u7.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.f4187a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.google.android.gms.internal.measurement.u7.j(r17, r4, r29);
        r4 = r29.f4187a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 > (r17.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r4 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        throw com.google.android.gms.internal.measurement.r9.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.google.android.gms.internal.measurement.r9.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01df -> B:111:0x01e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01f5 -> B:106:0x01cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0254 -> B:147:0x0255). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x026b -> B:145:0x0252). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0197 -> B:91:0x019b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01ad -> B:88:0x018c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int V(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.t7 r29) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.V(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.t7):int");
    }

    private final int W(int i10) {
        if (i10 < this.f4124c || i10 > this.f4125d) {
            return -1;
        }
        return Z(i10, 0);
    }

    private final int X(int i10, int i11) {
        if (i10 < this.f4124c || i10 > this.f4125d) {
            return -1;
        }
        return Z(i10, i11);
    }

    private final int Y(int i10) {
        return this.f4122a[i10 + 2];
    }

    private final int Z(int i10, int i11) {
        int length = (this.f4122a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f4122a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int j(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int k(int i10) {
        return this.f4122a[i10 + 1];
    }

    private static long l(Object obj, long j10) {
        return ((Long) bc.k(obj, j10)).longValue();
    }

    private final l9 m(int i10) {
        int i11 = i10 / 3;
        return (l9) this.f4123b[i11 + i11 + 1];
    }

    private final za n(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        za zaVar = (za) this.f4123b[i12];
        if (zaVar != null) {
            return zaVar;
        }
        za b10 = wa.a().b((Class) this.f4123b[i12 + 1]);
        this.f4123b[i12] = b10;
        return b10;
    }

    private final Object o(int i10) {
        int i11 = i10 / 3;
        return this.f4123b[i11 + i11];
    }

    private final Object p(Object obj, int i10) {
        za n10 = n(i10);
        long k10 = k(i10) & 1048575;
        if (C(obj, i10)) {
            Object object = f4121q.getObject(obj, k10);
            if (F(object)) {
                return object;
            }
            Object e10 = n10.e();
            if (object != null) {
                n10.c(e10, object);
            }
            return e10;
        }
        return n10.e();
    }

    private final Object q(Object obj, int i10, int i11) {
        za n10 = n(i11);
        if (G(obj, i10, i11)) {
            Object object = f4121q.getObject(obj, k(i11) & 1048575);
            if (F(object)) {
                return object;
            }
            Object e10 = n10.e();
            if (object != null) {
                n10.c(e10, object);
            }
            return e10;
        }
        return n10.e();
    }

    private static Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void s(Object obj) {
        if (!F(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void t(Object obj, Object obj2, int i10) {
        if (C(obj2, i10)) {
            long k10 = k(i10) & 1048575;
            Unsafe unsafe = f4121q;
            Object object = unsafe.getObject(obj2, k10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4122a[i10] + " is present but null: " + obj2.toString());
            }
            za n10 = n(i10);
            if (!C(obj, i10)) {
                if (F(object)) {
                    Object e10 = n10.e();
                    n10.c(e10, object);
                    unsafe.putObject(obj, k10, e10);
                } else {
                    unsafe.putObject(obj, k10, object);
                }
                v(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, k10);
            if (!F(object2)) {
                Object e11 = n10.e();
                n10.c(e11, object2);
                unsafe.putObject(obj, k10, e11);
                object2 = e11;
            }
            n10.c(object2, object);
        }
    }

    private final void u(Object obj, Object obj2, int i10) {
        int i11 = this.f4122a[i10];
        if (G(obj2, i11, i10)) {
            long k10 = k(i10) & 1048575;
            Unsafe unsafe = f4121q;
            Object object = unsafe.getObject(obj2, k10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4122a[i10] + " is present but null: " + obj2.toString());
            }
            za n10 = n(i10);
            if (!G(obj, i11, i10)) {
                if (F(object)) {
                    Object e10 = n10.e();
                    n10.c(e10, object);
                    unsafe.putObject(obj, k10, e10);
                } else {
                    unsafe.putObject(obj, k10, object);
                }
                w(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, k10);
            if (!F(object2)) {
                Object e11 = n10.e();
                n10.c(e11, object2);
                unsafe.putObject(obj, k10, e11);
                object2 = e11;
            }
            n10.c(object2, object);
        }
    }

    private final void v(Object obj, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 == 1048575) {
            return;
        }
        bc.v(obj, j10, (1 << (Y >>> 20)) | bc.h(obj, j10));
    }

    private final void w(Object obj, int i10, int i11) {
        bc.v(obj, Y(i11) & 1048575, i10);
    }

    private final void x(Object obj, int i10, Object obj2) {
        f4121q.putObject(obj, k(i10) & 1048575, obj2);
        v(obj, i10);
    }

    private final void y(Object obj, int i10, int i11, Object obj2) {
        f4121q.putObject(obj, k(i11) & 1048575, obj2);
        w(obj, i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void z(Object obj, kc kcVar) {
        int i10;
        boolean z10;
        if (this.f4127f) {
            this.f4134m.a(obj);
            throw null;
        }
        int length = this.f4122a.length;
        Unsafe unsafe = f4121q;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int k10 = k(i13);
            int[] iArr = this.f4122a;
            int i15 = iArr[i13];
            int j10 = j(k10);
            if (j10 <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j11 = k10 & i11;
            switch (j10) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.b(i15, bc.f(obj, j11));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.h(i15, bc.g(obj, j11));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.p(i15, unsafe.getLong(obj, j11));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.u(i15, unsafe.getLong(obj, j11));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.J(i15, unsafe.getInt(obj, j11));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.C(i15, unsafe.getLong(obj, j11));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.k(i15, unsafe.getInt(obj, j11));
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.l(i15, bc.B(obj, j11));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        I(i15, unsafe.getObject(obj, j11), kcVar);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.E(i15, unsafe.getObject(obj, j11), n(i13));
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.A(i15, (h8) unsafe.getObject(obj, j11));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.c(i15, unsafe.getInt(obj, j11));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.F(i15, unsafe.getInt(obj, j11));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.g(i15, unsafe.getInt(obj, j11));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.r(i15, unsafe.getLong(obj, j11));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.n(i15, unsafe.getInt(obj, j11));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.H(i15, unsafe.getLong(obj, j11));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        kcVar.w(i15, unsafe.getObject(obj, j11), n(i13));
                        break;
                    }
                case 18:
                    bb.j(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 19:
                    bb.n(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 20:
                    bb.q(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 21:
                    bb.y(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 22:
                    bb.p(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case c.j.f3071t3 /* 23 */:
                    bb.m(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case c.j.f3076u3 /* 24 */:
                    bb.l(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 25:
                    bb.h(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 26:
                    bb.w(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar);
                    break;
                case 27:
                    bb.r(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, n(i13));
                    break;
                case 28:
                    bb.i(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar);
                    break;
                case c.j.f3101z3 /* 29 */:
                    z10 = false;
                    bb.x(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 30:
                    z10 = false;
                    bb.k(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 31:
                    z10 = false;
                    bb.s(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 32:
                    z10 = false;
                    bb.t(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 33:
                    z10 = false;
                    bb.u(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 34:
                    z10 = false;
                    bb.v(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, false);
                    break;
                case 35:
                    bb.j(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 36:
                    bb.n(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 37:
                    bb.q(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 38:
                    bb.y(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 39:
                    bb.p(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 40:
                    bb.m(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 41:
                    bb.l(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 42:
                    bb.h(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 43:
                    bb.x(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 44:
                    bb.k(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 45:
                    bb.s(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 46:
                    bb.t(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 47:
                    bb.u(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 48:
                    bb.v(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, true);
                    break;
                case 49:
                    bb.o(this.f4122a[i13], (List) unsafe.getObject(obj, j11), kcVar, n(i13));
                    break;
                case 50:
                    A(kcVar, i15, unsafe.getObject(obj, j11), i13);
                    break;
                case 51:
                    if (G(obj, i15, i13)) {
                        kcVar.b(i15, N(obj, j11));
                    }
                    break;
                case 52:
                    if (G(obj, i15, i13)) {
                        kcVar.h(i15, O(obj, j11));
                    }
                    break;
                case 53:
                    if (G(obj, i15, i13)) {
                        kcVar.p(i15, l(obj, j11));
                    }
                    break;
                case 54:
                    if (G(obj, i15, i13)) {
                        kcVar.u(i15, l(obj, j11));
                    }
                    break;
                case 55:
                    if (G(obj, i15, i13)) {
                        kcVar.J(i15, R(obj, j11));
                    }
                    break;
                case 56:
                    if (G(obj, i15, i13)) {
                        kcVar.C(i15, l(obj, j11));
                    }
                    break;
                case 57:
                    if (G(obj, i15, i13)) {
                        kcVar.k(i15, R(obj, j11));
                    }
                    break;
                case 58:
                    if (G(obj, i15, i13)) {
                        kcVar.l(i15, H(obj, j11));
                    }
                    break;
                case 59:
                    if (G(obj, i15, i13)) {
                        I(i15, unsafe.getObject(obj, j11), kcVar);
                    }
                    break;
                case 60:
                    if (G(obj, i15, i13)) {
                        kcVar.E(i15, unsafe.getObject(obj, j11), n(i13));
                    }
                    break;
                case 61:
                    if (G(obj, i15, i13)) {
                        kcVar.A(i15, (h8) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (G(obj, i15, i13)) {
                        kcVar.c(i15, R(obj, j11));
                    }
                    break;
                case 63:
                    if (G(obj, i15, i13)) {
                        kcVar.F(i15, R(obj, j11));
                    }
                    break;
                case 64:
                    if (G(obj, i15, i13)) {
                        kcVar.g(i15, R(obj, j11));
                    }
                    break;
                case 65:
                    if (G(obj, i15, i13)) {
                        kcVar.r(i15, l(obj, j11));
                    }
                    break;
                case 66:
                    if (G(obj, i15, i13)) {
                        kcVar.n(i15, R(obj, j11));
                    }
                    break;
                case 67:
                    if (G(obj, i15, i13)) {
                        kcVar.H(i15, l(obj, j11));
                    }
                    break;
                case 68:
                    if (G(obj, i15, i13)) {
                        kcVar.w(i15, unsafe.getObject(obj, j11), n(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        rb rbVar = this.f4133l;
        rbVar.i(rbVar.d(obj), kcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0418, code lost:
        if (r6 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x041a, code lost:
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0420, code lost:
        r3 = r9.f4130i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0424, code lost:
        if (r3 >= r9.f4131j) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0426, code lost:
        r4 = r9.f4129h[r3];
        r5 = r9.f4122a[r4];
        r5 = com.google.android.gms.internal.measurement.bc.k(r12, r9.k(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0438, code lost:
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x043f, code lost:
        if (r9.m(r4) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0441, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0444, code lost:
        r5 = (com.google.android.gms.internal.measurement.ia) r5;
        r0 = (com.google.android.gms.internal.measurement.ha) r9.o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x044c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x044f, code lost:
        if (r7 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0451, code lost:
        if (r0 != r33) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0458, code lost:
        throw com.google.android.gms.internal.measurement.r9.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0459, code lost:
        if (r0 > r33) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x045b, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x045d, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0462, code lost:
        throw com.google.android.gms.internal.measurement.r9.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.t7 r35) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.J(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.t7):int");
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void a(Object obj) {
        if (F(obj)) {
            if (obj instanceof i9) {
                i9 i9Var = (i9) obj;
                i9Var.w(Integer.MAX_VALUE);
                i9Var.zzb = 0;
                i9Var.u();
            }
            int length = this.f4122a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int k10 = k(i10);
                long j10 = 1048575 & k10;
                int j11 = j(k10);
                if (j11 != 9) {
                    switch (j11) {
                        case 17:
                            break;
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
                            this.f4132k.a(obj, j10);
                            continue;
                        case 50:
                            Unsafe unsafe = f4121q;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((ia) object).e();
                                unsafe.putObject(obj, j10, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (C(obj, i10)) {
                    n(i10).a(f4121q.getObject(obj, j10));
                }
            }
            this.f4133l.g(obj);
            if (this.f4127f) {
                this.f4134m.b(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final int b(Object obj) {
        return this.f4128g ? Q(obj) : P(obj);
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void c(Object obj, Object obj2) {
        s(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.f4122a.length; i10 += 3) {
            int k10 = k(i10);
            long j10 = 1048575 & k10;
            int i11 = this.f4122a[i10];
            switch (j(k10)) {
                case 0:
                    if (C(obj2, i10)) {
                        bc.t(obj, j10, bc.f(obj2, j10));
                        v(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (C(obj2, i10)) {
                        bc.u(obj, j10, bc.g(obj2, j10));
                        v(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.w(obj, j10, bc.i(obj2, j10));
                    v(obj, i10);
                    break;
                case 3:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.w(obj, j10, bc.i(obj2, j10));
                    v(obj, i10);
                    break;
                case 4:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.v(obj, j10, bc.h(obj2, j10));
                    v(obj, i10);
                    break;
                case 5:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.w(obj, j10, bc.i(obj2, j10));
                    v(obj, i10);
                    break;
                case 6:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.v(obj, j10, bc.h(obj2, j10));
                    v(obj, i10);
                    break;
                case 7:
                    if (C(obj2, i10)) {
                        bc.r(obj, j10, bc.B(obj2, j10));
                        v(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.x(obj, j10, bc.k(obj2, j10));
                    v(obj, i10);
                    break;
                case 9:
                case 17:
                    t(obj, obj2, i10);
                    break;
                case 10:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.x(obj, j10, bc.k(obj2, j10));
                    v(obj, i10);
                    break;
                case 11:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.v(obj, j10, bc.h(obj2, j10));
                    v(obj, i10);
                    break;
                case 12:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.v(obj, j10, bc.h(obj2, j10));
                    v(obj, i10);
                    break;
                case 13:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.v(obj, j10, bc.h(obj2, j10));
                    v(obj, i10);
                    break;
                case 14:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.w(obj, j10, bc.i(obj2, j10));
                    v(obj, i10);
                    break;
                case 15:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.v(obj, j10, bc.h(obj2, j10));
                    v(obj, i10);
                    break;
                case 16:
                    if (!C(obj2, i10)) {
                        break;
                    }
                    bc.w(obj, j10, bc.i(obj2, j10));
                    v(obj, i10);
                    break;
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
                    this.f4132k.b(obj, obj2, j10);
                    break;
                case 50:
                    bb.B(this.f4136o, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!G(obj2, i11, i10)) {
                        break;
                    }
                    bc.x(obj, j10, bc.k(obj2, j10));
                    w(obj, i11, i10);
                    break;
                case 60:
                case 68:
                    u(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!G(obj2, i11, i10)) {
                        break;
                    }
                    bc.x(obj, j10, bc.k(obj2, j10));
                    w(obj, i11, i10);
                    break;
            }
        }
        bb.f(this.f4133l, obj, obj2);
        if (this.f4127f) {
            bb.e(this.f4134m, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void d(Object obj, kc kcVar) {
        double f10;
        float g10;
        long i10;
        long i11;
        int h10;
        long i12;
        int h11;
        boolean B;
        int h12;
        int h13;
        int h14;
        long i13;
        int h15;
        long i14;
        if (!this.f4128g) {
            z(obj, kcVar);
        } else if (this.f4127f) {
            this.f4134m.a(obj);
            throw null;
        } else {
            int length = this.f4122a.length;
            for (int i15 = 0; i15 < length; i15 += 3) {
                int k10 = k(i15);
                int i16 = this.f4122a[i15];
                switch (j(k10)) {
                    case 0:
                        if (C(obj, i15)) {
                            f10 = bc.f(obj, k10 & 1048575);
                            kcVar.b(i16, f10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (C(obj, i15)) {
                            g10 = bc.g(obj, k10 & 1048575);
                            kcVar.h(i16, g10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (C(obj, i15)) {
                            i10 = bc.i(obj, k10 & 1048575);
                            kcVar.p(i16, i10);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (C(obj, i15)) {
                            i11 = bc.i(obj, k10 & 1048575);
                            kcVar.u(i16, i11);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (C(obj, i15)) {
                            h10 = bc.h(obj, k10 & 1048575);
                            kcVar.J(i16, h10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (C(obj, i15)) {
                            i12 = bc.i(obj, k10 & 1048575);
                            kcVar.C(i16, i12);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (C(obj, i15)) {
                            h11 = bc.h(obj, k10 & 1048575);
                            kcVar.k(i16, h11);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (C(obj, i15)) {
                            B = bc.B(obj, k10 & 1048575);
                            kcVar.l(i16, B);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!C(obj, i15)) {
                            break;
                        }
                        I(i16, bc.k(obj, k10 & 1048575), kcVar);
                        break;
                    case 9:
                        if (!C(obj, i15)) {
                            break;
                        }
                        kcVar.E(i16, bc.k(obj, k10 & 1048575), n(i15));
                        break;
                    case 10:
                        if (!C(obj, i15)) {
                            break;
                        }
                        kcVar.A(i16, (h8) bc.k(obj, k10 & 1048575));
                        break;
                    case 11:
                        if (C(obj, i15)) {
                            h12 = bc.h(obj, k10 & 1048575);
                            kcVar.c(i16, h12);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (C(obj, i15)) {
                            h13 = bc.h(obj, k10 & 1048575);
                            kcVar.F(i16, h13);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (C(obj, i15)) {
                            h14 = bc.h(obj, k10 & 1048575);
                            kcVar.g(i16, h14);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (C(obj, i15)) {
                            i13 = bc.i(obj, k10 & 1048575);
                            kcVar.r(i16, i13);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (C(obj, i15)) {
                            h15 = bc.h(obj, k10 & 1048575);
                            kcVar.n(i16, h15);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (C(obj, i15)) {
                            i14 = bc.i(obj, k10 & 1048575);
                            kcVar.H(i16, i14);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!C(obj, i15)) {
                            break;
                        }
                        kcVar.w(i16, bc.k(obj, k10 & 1048575), n(i15));
                        break;
                    case 18:
                        bb.j(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 19:
                        bb.n(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 20:
                        bb.q(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 21:
                        bb.y(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 22:
                        bb.p(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case c.j.f3071t3 /* 23 */:
                        bb.m(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case c.j.f3076u3 /* 24 */:
                        bb.l(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 25:
                        bb.h(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 26:
                        bb.w(i16, (List) bc.k(obj, k10 & 1048575), kcVar);
                        break;
                    case 27:
                        bb.r(i16, (List) bc.k(obj, k10 & 1048575), kcVar, n(i15));
                        break;
                    case 28:
                        bb.i(i16, (List) bc.k(obj, k10 & 1048575), kcVar);
                        break;
                    case c.j.f3101z3 /* 29 */:
                        bb.x(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 30:
                        bb.k(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 31:
                        bb.s(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 32:
                        bb.t(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 33:
                        bb.u(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 34:
                        bb.v(i16, (List) bc.k(obj, k10 & 1048575), kcVar, false);
                        break;
                    case 35:
                        bb.j(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 36:
                        bb.n(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 37:
                        bb.q(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 38:
                        bb.y(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 39:
                        bb.p(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 40:
                        bb.m(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 41:
                        bb.l(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 42:
                        bb.h(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 43:
                        bb.x(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 44:
                        bb.k(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 45:
                        bb.s(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 46:
                        bb.t(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 47:
                        bb.u(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 48:
                        bb.v(i16, (List) bc.k(obj, k10 & 1048575), kcVar, true);
                        break;
                    case 49:
                        bb.o(i16, (List) bc.k(obj, k10 & 1048575), kcVar, n(i15));
                        break;
                    case 50:
                        A(kcVar, i16, bc.k(obj, k10 & 1048575), i15);
                        break;
                    case 51:
                        if (G(obj, i16, i15)) {
                            f10 = N(obj, k10 & 1048575);
                            kcVar.b(i16, f10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (G(obj, i16, i15)) {
                            g10 = O(obj, k10 & 1048575);
                            kcVar.h(i16, g10);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (G(obj, i16, i15)) {
                            i10 = l(obj, k10 & 1048575);
                            kcVar.p(i16, i10);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (G(obj, i16, i15)) {
                            i11 = l(obj, k10 & 1048575);
                            kcVar.u(i16, i11);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (G(obj, i16, i15)) {
                            h10 = R(obj, k10 & 1048575);
                            kcVar.J(i16, h10);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (G(obj, i16, i15)) {
                            i12 = l(obj, k10 & 1048575);
                            kcVar.C(i16, i12);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (G(obj, i16, i15)) {
                            h11 = R(obj, k10 & 1048575);
                            kcVar.k(i16, h11);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (G(obj, i16, i15)) {
                            B = H(obj, k10 & 1048575);
                            kcVar.l(i16, B);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!G(obj, i16, i15)) {
                            break;
                        }
                        I(i16, bc.k(obj, k10 & 1048575), kcVar);
                        break;
                    case 60:
                        if (!G(obj, i16, i15)) {
                            break;
                        }
                        kcVar.E(i16, bc.k(obj, k10 & 1048575), n(i15));
                        break;
                    case 61:
                        if (!G(obj, i16, i15)) {
                            break;
                        }
                        kcVar.A(i16, (h8) bc.k(obj, k10 & 1048575));
                        break;
                    case 62:
                        if (G(obj, i16, i15)) {
                            h12 = R(obj, k10 & 1048575);
                            kcVar.c(i16, h12);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (G(obj, i16, i15)) {
                            h13 = R(obj, k10 & 1048575);
                            kcVar.F(i16, h13);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (G(obj, i16, i15)) {
                            h14 = R(obj, k10 & 1048575);
                            kcVar.g(i16, h14);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (G(obj, i16, i15)) {
                            i13 = l(obj, k10 & 1048575);
                            kcVar.r(i16, i13);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (G(obj, i16, i15)) {
                            h15 = R(obj, k10 & 1048575);
                            kcVar.n(i16, h15);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (G(obj, i16, i15)) {
                            i14 = l(obj, k10 & 1048575);
                            kcVar.H(i16, i14);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!G(obj, i16, i15)) {
                            break;
                        }
                        kcVar.w(i16, bc.k(obj, k10 & 1048575), n(i15));
                        break;
                }
            }
            rb rbVar = this.f4133l;
            rbVar.i(rbVar.d(obj), kcVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final Object e() {
        return ((i9) this.f4126e).l();
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void f(Object obj, byte[] bArr, int i10, int i11, t7 t7Var) {
        if (this.f4128g) {
            U(obj, bArr, i10, i11, t7Var);
        } else {
            J(obj, bArr, i10, i11, 0, t7Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final boolean g(Object obj, Object obj2) {
        int length = this.f4122a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int k10 = k(i10);
            long j10 = k10 & 1048575;
            switch (j(k10)) {
                case 0:
                    if (B(obj, obj2, i10) && Double.doubleToLongBits(bc.f(obj, j10)) == Double.doubleToLongBits(bc.f(obj2, j10))) {
                        break;
                    }
                    return false;
                case 1:
                    if (B(obj, obj2, i10) && Float.floatToIntBits(bc.g(obj, j10)) == Float.floatToIntBits(bc.g(obj2, j10))) {
                        break;
                    }
                    return false;
                case 2:
                    if (B(obj, obj2, i10) && bc.i(obj, j10) == bc.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 3:
                    if (B(obj, obj2, i10) && bc.i(obj, j10) == bc.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 4:
                    if (B(obj, obj2, i10) && bc.h(obj, j10) == bc.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 5:
                    if (B(obj, obj2, i10) && bc.i(obj, j10) == bc.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 6:
                    if (B(obj, obj2, i10) && bc.h(obj, j10) == bc.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 7:
                    if (B(obj, obj2, i10) && bc.B(obj, j10) == bc.B(obj2, j10)) {
                        break;
                    }
                    return false;
                case 8:
                    if (B(obj, obj2, i10) && bb.z(bc.k(obj, j10), bc.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 9:
                    if (B(obj, obj2, i10) && bb.z(bc.k(obj, j10), bc.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 10:
                    if (B(obj, obj2, i10) && bb.z(bc.k(obj, j10), bc.k(obj2, j10))) {
                        break;
                    }
                    return false;
                case 11:
                    if (B(obj, obj2, i10) && bc.h(obj, j10) == bc.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 12:
                    if (B(obj, obj2, i10) && bc.h(obj, j10) == bc.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 13:
                    if (B(obj, obj2, i10) && bc.h(obj, j10) == bc.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 14:
                    if (B(obj, obj2, i10) && bc.i(obj, j10) == bc.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 15:
                    if (B(obj, obj2, i10) && bc.h(obj, j10) == bc.h(obj2, j10)) {
                        break;
                    }
                    return false;
                case 16:
                    if (B(obj, obj2, i10) && bc.i(obj, j10) == bc.i(obj2, j10)) {
                        break;
                    }
                    return false;
                case 17:
                    if (B(obj, obj2, i10) && bb.z(bc.k(obj, j10), bc.k(obj2, j10))) {
                        break;
                    }
                    return false;
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
                    if (bb.z(bc.k(obj, j10), bc.k(obj2, j10))) {
                        break;
                    } else {
                        return false;
                    }
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
                    long Y = Y(i10) & 1048575;
                    if (bc.h(obj, Y) == bc.h(obj2, Y) && bb.z(bc.k(obj, j10), bc.k(obj2, j10))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.f4133l.d(obj).equals(this.f4133l.d(obj2))) {
            if (this.f4127f) {
                this.f4134m.a(obj);
                this.f4134m.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final boolean h(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f4130i) {
            int i15 = this.f4129h[i14];
            int i16 = this.f4122a[i15];
            int k10 = k(i15);
            int i17 = this.f4122a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f4121q.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & k10) != 0 && !D(obj, i15, i10, i11, i19)) {
                return false;
            }
            int j10 = j(k10);
            if (j10 != 9 && j10 != 17) {
                if (j10 != 27) {
                    if (j10 == 60 || j10 == 68) {
                        if (G(obj, i16, i15) && !E(obj, k10, n(i15))) {
                            return false;
                        }
                    } else if (j10 != 49) {
                        if (j10 == 50 && !((ia) bc.k(obj, k10 & 1048575)).isEmpty()) {
                            ha haVar = (ha) o(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) bc.k(obj, k10 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    za n10 = n(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!n10.h(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (D(obj, i15, i10, i11, i19) && !E(obj, k10, n(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.f4127f) {
            this.f4134m.a(obj);
            throw null;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.measurement.za
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ra.i(java.lang.Object):int");
    }
}
