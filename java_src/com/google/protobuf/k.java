package com.google.protobuf;

import com.google.protobuf.t1;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class k extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f6007c = Logger.getLogger(k.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f6008d = s1.E();

    /* renamed from: a  reason: collision with root package name */
    l f6009a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6010b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends k {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f6011e;

        /* renamed from: f  reason: collision with root package name */
        private final int f6012f;

        /* renamed from: g  reason: collision with root package name */
        private final int f6013g;

        /* renamed from: h  reason: collision with root package name */
        private int f6014h;

        b(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f6011e = bArr;
            this.f6012f = i10;
            this.f6014h = i10;
            this.f6013g = i12;
        }

        @Override // com.google.protobuf.k
        public final void B0(int i10, int i11) {
            T0(i10, 0);
            C0(i11);
        }

        @Override // com.google.protobuf.k
        public final void C0(int i10) {
            if (i10 >= 0) {
                V0(i10);
            } else {
                X0(i10);
            }
        }

        @Override // com.google.protobuf.k
        final void F0(int i10, s0 s0Var, h1 h1Var) {
            T0(i10, 2);
            V0(((com.google.protobuf.a) s0Var).k(h1Var));
            h1Var.b(s0Var, this.f6009a);
        }

        @Override // com.google.protobuf.k
        public final void G0(s0 s0Var) {
            V0(s0Var.d());
            s0Var.i(this);
        }

        @Override // com.google.protobuf.k
        public final void H0(int i10, s0 s0Var) {
            T0(1, 3);
            U0(2, i10);
            Z0(3, s0Var);
            T0(1, 4);
        }

        @Override // com.google.protobuf.k
        public final void I0(int i10, h hVar) {
            T0(1, 3);
            U0(2, i10);
            l0(3, hVar);
            T0(1, 4);
        }

        @Override // com.google.protobuf.k
        public final void R0(int i10, String str) {
            T0(i10, 2);
            S0(str);
        }

        @Override // com.google.protobuf.k
        public final void S0(String str) {
            int f10;
            int i10 = this.f6014h;
            try {
                int W = k.W(str.length() * 3);
                int W2 = k.W(str.length());
                if (W2 == W) {
                    int i11 = i10 + W2;
                    this.f6014h = i11;
                    f10 = t1.f(str, this.f6011e, i11, f0());
                    this.f6014h = i10;
                    V0((f10 - i10) - W2);
                } else {
                    V0(t1.g(str));
                    f10 = t1.f(str, this.f6011e, this.f6014h, f0());
                }
                this.f6014h = f10;
            } catch (t1.d e10) {
                this.f6014h = i10;
                b0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.protobuf.k
        public final void T0(int i10, int i11) {
            V0(u1.c(i10, i11));
        }

        @Override // com.google.protobuf.k
        public final void U0(int i10, int i11) {
            T0(i10, 0);
            V0(i11);
        }

        @Override // com.google.protobuf.k
        public final void V0(int i10) {
            if (!k.f6008d || d.c() || f0() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f6011e;
                        int i11 = this.f6014h;
                        this.f6014h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6014h), Integer.valueOf(this.f6013g), 1), e10);
                    }
                }
                byte[] bArr2 = this.f6011e;
                int i12 = this.f6014h;
                this.f6014h = i12 + 1;
                bArr2[i12] = (byte) i10;
            } else if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f6011e;
                int i13 = this.f6014h;
                this.f6014h = i13 + 1;
                s1.K(bArr3, i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f6011e;
                int i14 = this.f6014h;
                this.f6014h = i14 + 1;
                s1.K(bArr4, i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & (-128)) == 0) {
                    byte[] bArr5 = this.f6011e;
                    int i16 = this.f6014h;
                    this.f6014h = i16 + 1;
                    s1.K(bArr5, i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f6011e;
                int i17 = this.f6014h;
                this.f6014h = i17 + 1;
                s1.K(bArr6, i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & (-128)) == 0) {
                    byte[] bArr7 = this.f6011e;
                    int i19 = this.f6014h;
                    this.f6014h = i19 + 1;
                    s1.K(bArr7, i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f6011e;
                int i20 = this.f6014h;
                this.f6014h = i20 + 1;
                s1.K(bArr8, i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & (-128)) == 0) {
                    byte[] bArr9 = this.f6011e;
                    int i22 = this.f6014h;
                    this.f6014h = i22 + 1;
                    s1.K(bArr9, i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f6011e;
                int i23 = this.f6014h;
                this.f6014h = i23 + 1;
                s1.K(bArr10, i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f6011e;
                int i24 = this.f6014h;
                this.f6014h = i24 + 1;
                s1.K(bArr11, i24, (byte) (i21 >>> 7));
            }
        }

        @Override // com.google.protobuf.k
        public final void W0(int i10, long j10) {
            T0(i10, 0);
            X0(j10);
        }

        @Override // com.google.protobuf.k
        public final void X0(long j10) {
            if (k.f6008d && f0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f6011e;
                    int i10 = this.f6014h;
                    this.f6014h = i10 + 1;
                    s1.K(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f6011e;
                int i11 = this.f6014h;
                this.f6014h = i11 + 1;
                s1.K(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f6011e;
                    int i12 = this.f6014h;
                    this.f6014h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6014h), Integer.valueOf(this.f6013g), 1), e10);
                }
            }
            byte[] bArr4 = this.f6011e;
            int i13 = this.f6014h;
            this.f6014h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void Y0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f6011e, this.f6014h, i11);
                this.f6014h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6014h), Integer.valueOf(this.f6013g), Integer.valueOf(i11)), e10);
            }
        }

        public final void Z0(int i10, s0 s0Var) {
            T0(i10, 2);
            G0(s0Var);
        }

        @Override // com.google.protobuf.k, com.google.protobuf.g
        public final void a(byte[] bArr, int i10, int i11) {
            Y0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.k
        public final int f0() {
            return this.f6013g - this.f6014h;
        }

        @Override // com.google.protobuf.k
        public final void g0(byte b10) {
            try {
                byte[] bArr = this.f6011e;
                int i10 = this.f6014h;
                this.f6014h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6014h), Integer.valueOf(this.f6013g), 1), e10);
            }
        }

        @Override // com.google.protobuf.k
        public final void h0(int i10, boolean z10) {
            T0(i10, 0);
            g0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.k
        public final void k0(byte[] bArr, int i10, int i11) {
            V0(i11);
            Y0(bArr, i10, i11);
        }

        @Override // com.google.protobuf.k
        public final void l0(int i10, h hVar) {
            T0(i10, 2);
            m0(hVar);
        }

        @Override // com.google.protobuf.k
        public final void m0(h hVar) {
            V0(hVar.size());
            hVar.R(this);
        }

        @Override // com.google.protobuf.k
        public final void r0(int i10, int i11) {
            T0(i10, 5);
            s0(i11);
        }

        @Override // com.google.protobuf.k
        public final void s0(int i10) {
            try {
                byte[] bArr = this.f6011e;
                int i11 = this.f6014h;
                int i12 = i11 + 1;
                this.f6014h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f6014h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f6014h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f6014h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6014h), Integer.valueOf(this.f6013g), 1), e10);
            }
        }

        @Override // com.google.protobuf.k
        public final void t0(int i10, long j10) {
            T0(i10, 1);
            u0(j10);
        }

        @Override // com.google.protobuf.k
        public final void u0(long j10) {
            try {
                byte[] bArr = this.f6011e;
                int i10 = this.f6014h;
                int i11 = i10 + 1;
                this.f6014h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f6014h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f6014h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f6014h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f6014h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f6014h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f6014h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f6014h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6014h), Integer.valueOf(this.f6013g), 1), e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private k() {
    }

    public static int A(int i10, f0 f0Var) {
        return U(i10) + B(f0Var);
    }

    public static int B(f0 f0Var) {
        return C(f0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, s0 s0Var) {
        return (U(1) * 2) + V(2, i10) + E(3, s0Var);
    }

    public static int E(int i10, s0 s0Var) {
        return U(i10) + G(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i10, s0 s0Var, h1 h1Var) {
        return U(i10) + H(s0Var, h1Var);
    }

    public static int G(s0 s0Var) {
        return C(s0Var.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(s0 s0Var, h1 h1Var) {
        return C(((com.google.protobuf.a) s0Var).k(h1Var));
    }

    public static int I(int i10, h hVar) {
        return (U(1) * 2) + V(2, i10) + g(3, hVar);
    }

    @Deprecated
    public static int J(int i10) {
        return W(i10);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = t1.g(str);
        } catch (t1.d unused) {
            length = str.getBytes(a0.f5906a).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(u1.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static k d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static k e0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i10, h hVar) {
        return U(i10) + h(hVar);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int s(int i10, s0 s0Var, h1 h1Var) {
        return (U(i10) * 2) + u(s0Var, h1Var);
    }

    @Deprecated
    public static int t(s0 s0Var) {
        return s0Var.d();
    }

    @Deprecated
    static int u(s0 s0Var, h1 h1Var) {
        return ((com.google.protobuf.a) s0Var).k(h1Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, f0 f0Var) {
        return (U(1) * 2) + V(2, i10) + A(3, f0Var);
    }

    @Deprecated
    final void A0(s0 s0Var, h1 h1Var) {
        h1Var.b(s0Var, this.f6009a);
    }

    public abstract void B0(int i10, int i11);

    public abstract void C0(int i10);

    public final void D0(int i10, long j10) {
        W0(i10, j10);
    }

    public final void E0(long j10) {
        X0(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void F0(int i10, s0 s0Var, h1 h1Var);

    public abstract void G0(s0 s0Var);

    public abstract void H0(int i10, s0 s0Var);

    public abstract void I0(int i10, h hVar);

    public final void J0(int i10, int i11) {
        r0(i10, i11);
    }

    public final void K0(int i10) {
        s0(i10);
    }

    public final void L0(int i10, long j10) {
        t0(i10, j10);
    }

    public final void M0(long j10) {
        u0(j10);
    }

    public final void N0(int i10, int i11) {
        U0(i10, Z(i11));
    }

    public final void O0(int i10) {
        V0(Z(i10));
    }

    public final void P0(int i10, long j10) {
        W0(i10, a0(j10));
    }

    public final void Q0(long j10) {
        X0(a0(j10));
    }

    public abstract void R0(int i10, String str);

    public abstract void S0(String str);

    public abstract void T0(int i10, int i11);

    public abstract void U0(int i10, int i11);

    public abstract void V0(int i10);

    public abstract void W0(int i10, long j10);

    public abstract void X0(long j10);

    @Override // com.google.protobuf.g
    public abstract void a(byte[] bArr, int i10, int i11);

    final void b0(String str, t1.d dVar) {
        f6007c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.f5906a);
        try {
            V0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new c(e11);
        }
    }

    public final void c() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c0() {
        return this.f6010b;
    }

    public abstract int f0();

    public abstract void g0(byte b10);

    public abstract void h0(int i10, boolean z10);

    public final void i0(boolean z10) {
        g0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void j0(byte[] bArr) {
        k0(bArr, 0, bArr.length);
    }

    abstract void k0(byte[] bArr, int i10, int i11);

    public abstract void l0(int i10, h hVar);

    public abstract void m0(h hVar);

    public final void n0(int i10, double d10) {
        t0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void o0(double d10) {
        u0(Double.doubleToRawLongBits(d10));
    }

    public final void p0(int i10, int i11) {
        B0(i10, i11);
    }

    public final void q0(int i10) {
        C0(i10);
    }

    public abstract void r0(int i10, int i11);

    public abstract void s0(int i10);

    public abstract void t0(int i10, long j10);

    public abstract void u0(long j10);

    public final void v0(int i10, float f10) {
        r0(i10, Float.floatToRawIntBits(f10));
    }

    public final void w0(float f10) {
        s0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void x0(int i10, s0 s0Var) {
        T0(i10, 3);
        z0(s0Var);
        T0(i10, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void y0(int i10, s0 s0Var, h1 h1Var) {
        T0(i10, 3);
        A0(s0Var, h1Var);
        T0(i10, 4);
    }

    @Deprecated
    public final void z0(s0 s0Var) {
        s0Var.i(this);
    }
}
