package com.google.android.gms.internal.measurement;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class sb {

    /* renamed from: f  reason: collision with root package name */
    private static final sb f4169f = new sb(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f4170a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4171b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f4172c;

    /* renamed from: d  reason: collision with root package name */
    private int f4173d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4174e;

    private sb() {
        this(0, new int[8], new Object[8], true);
    }

    private sb(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4173d = -1;
        this.f4170a = i10;
        this.f4171b = iArr;
        this.f4172c = objArr;
        this.f4174e = z10;
    }

    public static sb c() {
        return f4169f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static sb e(sb sbVar, sb sbVar2) {
        int i10 = sbVar.f4170a + sbVar2.f4170a;
        int[] copyOf = Arrays.copyOf(sbVar.f4171b, i10);
        System.arraycopy(sbVar2.f4171b, 0, copyOf, sbVar.f4170a, sbVar2.f4170a);
        Object[] copyOf2 = Arrays.copyOf(sbVar.f4172c, i10);
        System.arraycopy(sbVar2.f4172c, 0, copyOf2, sbVar.f4170a, sbVar2.f4170a);
        return new sb(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static sb f() {
        return new sb(0, new int[8], new Object[8], true);
    }

    private final void l(int i10) {
        int[] iArr = this.f4171b;
        if (i10 > iArr.length) {
            int i11 = this.f4170a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f4171b = Arrays.copyOf(iArr, i10);
            this.f4172c = Arrays.copyOf(this.f4172c, i10);
        }
    }

    public final int a() {
        int a10;
        int b10;
        int i10;
        int i11 = this.f4173d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f4170a; i13++) {
                int i14 = this.f4171b[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ((Long) this.f4172c[i13]).longValue();
                        i10 = p8.a(i15 << 3) + 8;
                    } else if (i16 == 2) {
                        int a11 = p8.a(i15 << 3);
                        int h10 = ((h8) this.f4172c[i13]).h();
                        i12 += a11 + p8.a(h10) + h10;
                    } else if (i16 == 3) {
                        int D = p8.D(i15);
                        a10 = D + D;
                        b10 = ((sb) this.f4172c[i13]).a();
                    } else if (i16 != 5) {
                        throw new IllegalStateException(r9.a());
                    } else {
                        ((Integer) this.f4172c[i13]).intValue();
                        i10 = p8.a(i15 << 3) + 4;
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.f4172c[i13]).longValue();
                    a10 = p8.a(i15 << 3);
                    b10 = p8.b(longValue);
                }
                i10 = a10 + b10;
                i12 += i10;
            }
            this.f4173d = i12;
            return i12;
        }
        return i11;
    }

    public final int b() {
        int i10 = this.f4173d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f4170a; i12++) {
                int i13 = this.f4171b[i12];
                int a10 = p8.a(8);
                int h10 = ((h8) this.f4172c[i12]).h();
                i11 += a10 + a10 + p8.a(16) + p8.a(i13 >>> 3) + p8.a(24) + p8.a(h10) + h10;
            }
            this.f4173d = i11;
            return i11;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final sb d(sb sbVar) {
        if (sbVar.equals(f4169f)) {
            return this;
        }
        g();
        int i10 = this.f4170a + sbVar.f4170a;
        l(i10);
        System.arraycopy(sbVar.f4171b, 0, this.f4171b, this.f4170a, sbVar.f4170a);
        System.arraycopy(sbVar.f4172c, 0, this.f4172c, this.f4170a, sbVar.f4170a);
        this.f4170a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof sb)) {
            sb sbVar = (sb) obj;
            int i10 = this.f4170a;
            if (i10 == sbVar.f4170a) {
                int[] iArr = this.f4171b;
                int[] iArr2 = sbVar.f4171b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.f4172c;
                        Object[] objArr2 = sbVar.f4172c;
                        int i12 = this.f4170a;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (objArr[i13].equals(objArr2[i13])) {
                            }
                        }
                        return true;
                    } else if (iArr[i11] != iArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    final void g() {
        if (!this.f4174e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        this.f4174e = false;
    }

    public final int hashCode() {
        int i10 = this.f4170a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f4171b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f4172c;
        int i16 = this.f4170a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f4170a; i11++) {
            qa.b(sb, i10, String.valueOf(this.f4171b[i11] >>> 3), this.f4172c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i10, Object obj) {
        g();
        l(this.f4170a + 1);
        int[] iArr = this.f4171b;
        int i11 = this.f4170a;
        iArr[i11] = i10;
        this.f4172c[i11] = obj;
        this.f4170a = i11 + 1;
    }

    public final void k(kc kcVar) {
        if (this.f4170a != 0) {
            for (int i10 = 0; i10 < this.f4170a; i10++) {
                int i11 = this.f4171b[i10];
                Object obj = this.f4172c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    kcVar.p(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    kcVar.C(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    kcVar.A(i12, (h8) obj);
                } else if (i13 == 3) {
                    kcVar.y(i12);
                    ((sb) obj).k(kcVar);
                    kcVar.I(i12);
                } else if (i13 != 5) {
                    throw new RuntimeException(r9.a());
                } else {
                    kcVar.k(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
