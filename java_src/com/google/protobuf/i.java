package com.google.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    int f5978a;

    /* renamed from: b  reason: collision with root package name */
    int f5979b;

    /* renamed from: c  reason: collision with root package name */
    int f5980c;

    /* renamed from: d  reason: collision with root package name */
    j f5981d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5982e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f5983f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f5984g;

        /* renamed from: h  reason: collision with root package name */
        private int f5985h;

        /* renamed from: i  reason: collision with root package name */
        private int f5986i;

        /* renamed from: j  reason: collision with root package name */
        private int f5987j;

        /* renamed from: k  reason: collision with root package name */
        private int f5988k;

        /* renamed from: l  reason: collision with root package name */
        private int f5989l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5990m;

        /* renamed from: n  reason: collision with root package name */
        private int f5991n;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f5991n = Integer.MAX_VALUE;
            this.f5983f = bArr;
            this.f5985h = i11 + i10;
            this.f5987j = i10;
            this.f5988k = i10;
            this.f5984g = z10;
        }

        private void K() {
            int i10 = this.f5985h + this.f5986i;
            this.f5985h = i10;
            int i11 = i10 - this.f5988k;
            int i12 = this.f5991n;
            if (i11 <= i12) {
                this.f5986i = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f5986i = i13;
            this.f5985h = i10 - i13;
        }

        private void N() {
            if (this.f5985h - this.f5987j >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f5983f;
                int i11 = this.f5987j;
                this.f5987j = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw c0.f();
        }

        private void P() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw c0.f();
        }

        @Override // com.google.protobuf.i
        public int A() {
            return H();
        }

        @Override // com.google.protobuf.i
        public long B() {
            return I();
        }

        @Override // com.google.protobuf.i
        public boolean C(int i10) {
            int b10 = u1.b(i10);
            if (b10 == 0) {
                N();
                return true;
            } else if (b10 == 1) {
                M(8);
                return true;
            } else if (b10 == 2) {
                M(H());
                return true;
            } else if (b10 == 3) {
                L();
                a(u1.c(u1.a(i10), 4));
                return true;
            } else if (b10 != 4) {
                if (b10 == 5) {
                    M(4);
                    return true;
                }
                throw c0.e();
            } else {
                return false;
            }
        }

        public byte D() {
            int i10 = this.f5987j;
            if (i10 != this.f5985h) {
                byte[] bArr = this.f5983f;
                this.f5987j = i10 + 1;
                return bArr[i10];
            }
            throw c0.k();
        }

        public byte[] E(int i10) {
            if (i10 > 0) {
                int i11 = this.f5985h;
                int i12 = this.f5987j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f5987j = i13;
                    return Arrays.copyOfRange(this.f5983f, i12, i13);
                }
            }
            if (i10 <= 0) {
                if (i10 == 0) {
                    return a0.f5908c;
                }
                throw c0.g();
            }
            throw c0.k();
        }

        public int F() {
            int i10 = this.f5987j;
            if (this.f5985h - i10 >= 4) {
                byte[] bArr = this.f5983f;
                this.f5987j = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw c0.k();
        }

        public long G() {
            int i10 = this.f5987j;
            if (this.f5985h - i10 >= 8) {
                byte[] bArr = this.f5983f;
                this.f5987j = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw c0.k();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f5987j
                int r1 = r5.f5985h
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f5983f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f5987j = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r0 = (int) r0
                return r0
            L70:
                r5.f5987j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long I() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.b.I():long");
        }

        long J() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte D = D();
                j10 |= (D & Byte.MAX_VALUE) << i10;
                if ((D & 128) == 0) {
                    return j10;
                }
            }
            throw c0.f();
        }

        public void L() {
            int z10;
            do {
                z10 = z();
                if (z10 == 0) {
                    return;
                }
            } while (C(z10));
        }

        public void M(int i10) {
            if (i10 >= 0) {
                int i11 = this.f5985h;
                int i12 = this.f5987j;
                if (i10 <= i11 - i12) {
                    this.f5987j = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw c0.k();
            }
            throw c0.g();
        }

        @Override // com.google.protobuf.i
        public void a(int i10) {
            if (this.f5989l != i10) {
                throw c0.b();
            }
        }

        @Override // com.google.protobuf.i
        public int d() {
            return this.f5987j - this.f5988k;
        }

        @Override // com.google.protobuf.i
        public boolean e() {
            return this.f5987j == this.f5985h;
        }

        @Override // com.google.protobuf.i
        public void i(int i10) {
            this.f5991n = i10;
            K();
        }

        @Override // com.google.protobuf.i
        public int j(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                if (d10 >= 0) {
                    int i11 = this.f5991n;
                    if (d10 <= i11) {
                        this.f5991n = d10;
                        K();
                        return i11;
                    }
                    throw c0.k();
                }
                throw c0.h();
            }
            throw c0.g();
        }

        @Override // com.google.protobuf.i
        public boolean k() {
            return I() != 0;
        }

        @Override // com.google.protobuf.i
        public h l() {
            int H = H();
            if (H > 0) {
                int i10 = this.f5985h;
                int i11 = this.f5987j;
                if (H <= i10 - i11) {
                    h Q = (this.f5984g && this.f5990m) ? h.Q(this.f5983f, i11, H) : h.l(this.f5983f, i11, H);
                    this.f5987j += H;
                    return Q;
                }
            }
            return H == 0 ? h.f5966o : h.P(E(H));
        }

        @Override // com.google.protobuf.i
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.protobuf.i
        public int n() {
            return H();
        }

        @Override // com.google.protobuf.i
        public int o() {
            return F();
        }

        @Override // com.google.protobuf.i
        public long p() {
            return G();
        }

        @Override // com.google.protobuf.i
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.protobuf.i
        public int r() {
            return H();
        }

        @Override // com.google.protobuf.i
        public long s() {
            return I();
        }

        @Override // com.google.protobuf.i
        public int t() {
            return F();
        }

        @Override // com.google.protobuf.i
        public long u() {
            return G();
        }

        @Override // com.google.protobuf.i
        public int v() {
            return i.b(H());
        }

        @Override // com.google.protobuf.i
        public long w() {
            return i.c(I());
        }

        @Override // com.google.protobuf.i
        public String x() {
            int H = H();
            if (H > 0) {
                int i10 = this.f5985h;
                int i11 = this.f5987j;
                if (H <= i10 - i11) {
                    String str = new String(this.f5983f, i11, H, a0.f5906a);
                    this.f5987j += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw c0.g();
            }
            throw c0.k();
        }

        @Override // com.google.protobuf.i
        public String y() {
            int H = H();
            if (H > 0) {
                int i10 = this.f5985h;
                int i11 = this.f5987j;
                if (H <= i10 - i11) {
                    String e10 = t1.e(this.f5983f, i11, H);
                    this.f5987j += H;
                    return e10;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw c0.g();
            }
            throw c0.k();
        }

        @Override // com.google.protobuf.i
        public int z() {
            if (e()) {
                this.f5989l = 0;
                return 0;
            }
            int H = H();
            this.f5989l = H;
            if (u1.a(H) != 0) {
                return this.f5989l;
            }
            throw c0.c();
        }
    }

    private i() {
        this.f5979b = 100;
        this.f5980c = Integer.MAX_VALUE;
        this.f5982e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static i f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static i g(byte[] bArr, int i10, int i11) {
        return h(bArr, i10, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i h(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.j(i11);
            return bVar;
        } catch (c0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i10);

    public abstract int j(int i10);

    public abstract boolean k();

    public abstract h l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
