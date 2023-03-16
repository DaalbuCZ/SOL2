package com.google.protobuf;

import com.google.protobuf.v1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: f  reason: collision with root package name */
    private static final p1 f6069f = new p1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f6070a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f6071b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f6072c;

    /* renamed from: d  reason: collision with root package name */
    private int f6073d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6074e;

    private p1() {
        this(0, new int[8], new Object[8], true);
    }

    private p1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f6073d = -1;
        this.f6070a = i10;
        this.f6071b = iArr;
        this.f6072c = objArr;
        this.f6074e = z10;
    }

    private void b() {
        int i10 = this.f6070a;
        int[] iArr = this.f6071b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f6071b = Arrays.copyOf(iArr, i11);
            this.f6072c = Arrays.copyOf(this.f6072c, i11);
        }
    }

    public static p1 c() {
        return f6069f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 i(p1 p1Var, p1 p1Var2) {
        int i10 = p1Var.f6070a + p1Var2.f6070a;
        int[] copyOf = Arrays.copyOf(p1Var.f6071b, i10);
        System.arraycopy(p1Var2.f6071b, 0, copyOf, p1Var.f6070a, p1Var2.f6070a);
        Object[] copyOf2 = Arrays.copyOf(p1Var.f6072c, i10);
        System.arraycopy(p1Var2.f6072c, 0, copyOf2, p1Var.f6070a, p1Var2.f6070a);
        return new p1(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 j() {
        return new p1();
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void p(int i10, Object obj, v1 v1Var) {
        int a10 = u1.a(i10);
        int b10 = u1.b(i10);
        if (b10 == 0) {
            v1Var.e(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            v1Var.A(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            v1Var.l(a10, (h) obj);
        } else if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(c0.e());
            }
            v1Var.p(a10, ((Integer) obj).intValue());
        } else if (v1Var.B() == v1.a.ASCENDING) {
            v1Var.k(a10);
            ((p1) obj).q(v1Var);
            v1Var.F(a10);
        } else {
            v1Var.F(a10);
            ((p1) obj).q(v1Var);
            v1Var.k(a10);
        }
    }

    void a() {
        if (!this.f6074e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int X;
        int i10 = this.f6073d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6070a; i12++) {
            int i13 = this.f6071b[i12];
            int a10 = u1.a(i13);
            int b10 = u1.b(i13);
            if (b10 == 0) {
                X = k.X(a10, ((Long) this.f6072c[i12]).longValue());
            } else if (b10 == 1) {
                X = k.o(a10, ((Long) this.f6072c[i12]).longValue());
            } else if (b10 == 2) {
                X = k.g(a10, (h) this.f6072c[i12]);
            } else if (b10 == 3) {
                X = (k.U(a10) * 2) + ((p1) this.f6072c[i12]).d();
            } else if (b10 != 5) {
                throw new IllegalStateException(c0.e());
            } else {
                X = k.m(a10, ((Integer) this.f6072c[i12]).intValue());
            }
            i11 += X;
        }
        this.f6073d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f6073d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6070a; i12++) {
            i11 += k.I(u1.a(this.f6071b[i12]), (h) this.f6072c[i12]);
        }
        this.f6073d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p1)) {
            p1 p1Var = (p1) obj;
            int i10 = this.f6070a;
            return i10 == p1Var.f6070a && n(this.f6071b, p1Var.f6071b, i10) && k(this.f6072c, p1Var.f6072c, this.f6070a);
        }
        return false;
    }

    public void h() {
        this.f6074e = false;
    }

    public int hashCode() {
        int i10 = this.f6070a;
        return ((((527 + i10) * 31) + f(this.f6071b, i10)) * 31) + g(this.f6072c, this.f6070a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f6070a; i11++) {
            u0.c(sb, i10, String.valueOf(u1.a(this.f6071b[i11])), this.f6072c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f6071b;
        int i11 = this.f6070a;
        iArr[i11] = i10;
        this.f6072c[i11] = obj;
        this.f6070a = i11 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(v1 v1Var) {
        if (v1Var.B() == v1.a.DESCENDING) {
            for (int i10 = this.f6070a - 1; i10 >= 0; i10--) {
                v1Var.h(u1.a(this.f6071b[i10]), this.f6072c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f6070a; i11++) {
            v1Var.h(u1.a(this.f6071b[i11]), this.f6072c[i11]);
        }
    }

    public void q(v1 v1Var) {
        if (this.f6070a == 0) {
            return;
        }
        if (v1Var.B() == v1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f6070a; i10++) {
                p(this.f6071b[i10], this.f6072c[i10], v1Var);
            }
            return;
        }
        for (int i11 = this.f6070a - 1; i11 >= 0; i11--) {
            p(this.f6071b[i11], this.f6072c[i11], v1Var);
        }
    }
}
