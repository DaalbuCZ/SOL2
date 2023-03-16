package com.google.protobuf;

import com.google.protobuf.c0;
import com.google.protobuf.l0;
import com.google.protobuf.u1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
abstract class e implements g1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5937a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f5937a = iArr;
            try {
                iArr[u1.b.f6126w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5937a[u1.b.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5937a[u1.b.f6119p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5937a[u1.b.C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5937a[u1.b.f6125v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5937a[u1.b.f6124u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5937a[u1.b.f6120q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5937a[u1.b.f6123t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5937a[u1.b.f6121r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5937a[u1.b.f6129z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5937a[u1.b.D.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5937a[u1.b.E.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5937a[u1.b.F.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5937a[u1.b.G.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5937a[u1.b.f6127x.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5937a[u1.b.B.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5937a[u1.b.f6122s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f5938a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f5939b;

        /* renamed from: c  reason: collision with root package name */
        private int f5940c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5941d;

        /* renamed from: e  reason: collision with root package name */
        private int f5942e;

        /* renamed from: f  reason: collision with root package name */
        private int f5943f;

        /* renamed from: g  reason: collision with root package name */
        private int f5944g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f5938a = z10;
            this.f5939b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f5940c = arrayOffset;
            this.f5941d = arrayOffset;
            this.f5942e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f5940c == this.f5942e;
        }

        private byte S() {
            int i10 = this.f5940c;
            if (i10 != this.f5942e) {
                byte[] bArr = this.f5939b;
                this.f5940c = i10 + 1;
                return bArr[i10];
            }
            throw c0.k();
        }

        private Object T(u1.b bVar, Class<?> cls, p pVar) {
            switch (a.f5937a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(r());
                case 2:
                    return B();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(b());
                case 5:
                    return Integer.valueOf(p());
                case 6:
                    return Long.valueOf(f());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(E());
                case 9:
                    return Long.valueOf(L());
                case 10:
                    return m(cls, pVar);
                case 11:
                    return Integer.valueOf(G());
                case 12:
                    return Long.valueOf(v());
                case 13:
                    return Integer.valueOf(h());
                case 14:
                    return Long.valueOf(k());
                case 15:
                    return M();
                case 16:
                    return Integer.valueOf(D());
                case 17:
                    return Long.valueOf(d());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(h1<T> h1Var, p pVar) {
            int i10 = this.f5944g;
            this.f5944g = u1.c(u1.a(this.f5943f), 4);
            try {
                T h10 = h1Var.h();
                h1Var.e(h10, this, pVar);
                h1Var.c(h10);
                if (this.f5943f == this.f5944g) {
                    return h10;
                }
                throw c0.h();
            } finally {
                this.f5944g = i10;
            }
        }

        private int V() {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f5940c;
            byte[] bArr = this.f5939b;
            this.f5940c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f5940c;
            byte[] bArr = this.f5939b;
            this.f5940c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        private <T> T Z(h1<T> h1Var, p pVar) {
            int c02 = c0();
            f0(c02);
            int i10 = this.f5942e;
            int i11 = this.f5940c + c02;
            this.f5942e = i11;
            try {
                T h10 = h1Var.h();
                h1Var.e(h10, this, pVar);
                h1Var.c(h10);
                if (this.f5940c == i11) {
                    return h10;
                }
                throw c0.h();
            } finally {
                this.f5942e = i10;
            }
        }

        private int c0() {
            int i10;
            int i11 = this.f5940c;
            int i12 = this.f5942e;
            if (i12 != i11) {
                byte[] bArr = this.f5939b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f5940c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return (int) e0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                        throw c0.f();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f5940c = i14;
                    return i10;
                }
            }
            throw c0.k();
        }

        private long e0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte S = S();
                j10 |= (S & Byte.MAX_VALUE) << i10;
                if ((S & 128) == 0) {
                    return j10;
                }
            }
            throw c0.f();
        }

        private void f0(int i10) {
            if (i10 < 0 || i10 > this.f5942e - this.f5940c) {
                throw c0.k();
            }
        }

        private void g0(int i10) {
            if (this.f5940c != i10) {
                throw c0.k();
            }
        }

        private void h0(int i10) {
            if (u1.b(this.f5943f) != i10) {
                throw c0.e();
            }
        }

        private void i0(int i10) {
            f0(i10);
            this.f5940c += i10;
        }

        private void j0() {
            int i10 = this.f5944g;
            this.f5944g = u1.c(u1.a(this.f5943f), 4);
            while (t() != Integer.MAX_VALUE && F()) {
            }
            if (this.f5943f != this.f5944g) {
                throw c0.h();
            }
            this.f5944g = i10;
        }

        private void k0() {
            int i10 = this.f5942e;
            int i11 = this.f5940c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f5939b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f5940c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw c0.f();
        }

        private void m0(int i10) {
            f0(i10);
            if ((i10 & 3) != 0) {
                throw c0.h();
            }
        }

        private void n0(int i10) {
            f0(i10);
            if ((i10 & 7) != 0) {
                throw c0.h();
            }
        }

        @Override // com.google.protobuf.g1
        public <T> T A(h1<T> h1Var, p pVar) {
            h0(3);
            return (T) U(h1Var, pVar);
        }

        @Override // com.google.protobuf.g1
        public h B() {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return h.f5966o;
            }
            f0(c02);
            h Q = this.f5938a ? h.Q(this.f5939b, this.f5940c, c02) : h.l(this.f5939b, this.f5940c, c02);
            this.f5940c += c02;
            return Q;
        }

        @Override // com.google.protobuf.g1
        public void C(List<Float> list) {
            int i10;
            int i11;
            if (!(list instanceof w)) {
                int b10 = u1.b(this.f5943f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f5940c + c02;
                    while (this.f5940c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.e();
                } else {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                }
            }
            w wVar = (w) list;
            int b11 = u1.b(this.f5943f);
            if (b11 == 2) {
                int c03 = c0();
                m0(c03);
                int i13 = this.f5940c + c03;
                while (this.f5940c < i13) {
                    wVar.k(Float.intBitsToFloat(W()));
                }
            } else if (b11 != 5) {
                throw c0.e();
            } else {
                do {
                    wVar.k(readFloat());
                    if (R()) {
                        return;
                    }
                    i11 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i11;
            }
        }

        @Override // com.google.protobuf.g1
        public int D() {
            h0(0);
            return c0();
        }

        @Override // com.google.protobuf.g1
        public int E() {
            h0(0);
            return c0();
        }

        @Override // com.google.protobuf.g1
        public boolean F() {
            int i10;
            int i11;
            if (R() || (i10 = this.f5943f) == this.f5944g) {
                return false;
            }
            int b10 = u1.b(i10);
            if (b10 == 0) {
                k0();
                return true;
            }
            if (b10 == 1) {
                i11 = 8;
            } else if (b10 == 2) {
                i11 = c0();
            } else if (b10 == 3) {
                j0();
                return true;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                i11 = 4;
            }
            i0(i11);
            return true;
        }

        @Override // com.google.protobuf.g1
        public int G() {
            h0(5);
            return V();
        }

        @Override // com.google.protobuf.g1
        public void H(List<h> list) {
            int i10;
            if (u1.b(this.f5943f) != 2) {
                throw c0.e();
            }
            do {
                list.add(B());
                if (R()) {
                    return;
                }
                i10 = this.f5940c;
            } while (c0() == this.f5943f);
            this.f5940c = i10;
        }

        @Override // com.google.protobuf.g1
        public void I(List<Double> list) {
            int i10;
            int i11;
            if (!(list instanceof m)) {
                int b10 = u1.b(this.f5943f);
                if (b10 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f5940c + c02;
                    while (this.f5940c < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                    return;
                }
            }
            m mVar = (m) list;
            int b11 = u1.b(this.f5943f);
            if (b11 == 1) {
                do {
                    mVar.k(readDouble());
                    if (R()) {
                        return;
                    }
                    i11 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i11;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                int c03 = c0();
                n0(c03);
                int i13 = this.f5940c + c03;
                while (this.f5940c < i13) {
                    mVar.k(Double.longBitsToDouble(Y()));
                }
            }
        }

        @Override // com.google.protobuf.g1
        public void J(List<Long> list) {
            int i10;
            int c02;
            int i11;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b10 = u1.b(this.f5943f);
                if (b10 == 0) {
                    do {
                        j0Var.l(L());
                        if (R()) {
                            return;
                        }
                        i11 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        j0Var.l(d0());
                    }
                }
            } else {
                int b11 = u1.b(this.f5943f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(L()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Long.valueOf(d0()));
                    }
                }
            }
            g0(c02);
        }

        @Override // com.google.protobuf.g1
        public void K(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f5943f);
                if (b10 == 1) {
                    do {
                        list.add(Long.valueOf(v()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f5940c + c02;
                    while (this.f5940c < i12) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f5943f);
            if (b11 == 1) {
                do {
                    j0Var.l(v());
                    if (R()) {
                        return;
                    }
                    i11 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i11;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                int c03 = c0();
                n0(c03);
                int i13 = this.f5940c + c03;
                while (this.f5940c < i13) {
                    j0Var.l(Y());
                }
            }
        }

        @Override // com.google.protobuf.g1
        public long L() {
            h0(0);
            return d0();
        }

        @Override // com.google.protobuf.g1
        public String M() {
            return a0(true);
        }

        @Override // com.google.protobuf.g1
        public void N(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f5943f);
                if (b10 == 1) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f5940c + c02;
                    while (this.f5940c < i12) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f5943f);
            if (b11 == 1) {
                do {
                    j0Var.l(f());
                    if (R()) {
                        return;
                    }
                    i11 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i11;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                int c03 = c0();
                n0(c03);
                int i13 = this.f5940c + c03;
                while (this.f5940c < i13) {
                    j0Var.l(Y());
                }
            }
        }

        @Override // com.google.protobuf.g1
        public void O(List<Integer> list) {
            int i10;
            int c02;
            int i11;
            if (list instanceof z) {
                z zVar = (z) list;
                int b10 = u1.b(this.f5943f);
                if (b10 == 0) {
                    do {
                        zVar.r(E());
                        if (R()) {
                            return;
                        }
                        i11 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        zVar.r(c0());
                    }
                }
            } else {
                int b11 = u1.b(this.f5943f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                }
            }
            g0(c02);
        }

        @Override // com.google.protobuf.g1
        public void P(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = u1.b(this.f5943f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(b()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = u1.b(this.f5943f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int c03 = this.f5940c + c0();
                while (this.f5940c < c03) {
                    zVar.r(c0());
                }
                return;
            }
            do {
                zVar.r(b());
                if (R()) {
                    return;
                }
                i11 = this.f5940c;
            } while (c0() == this.f5943f);
            this.f5940c = i11;
        }

        @Override // com.google.protobuf.g1
        public void a(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = u1.b(this.f5943f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Integer.valueOf(i.b(c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = u1.b(this.f5943f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int c03 = this.f5940c + c0();
                while (this.f5940c < c03) {
                    zVar.r(i.b(c0()));
                }
                return;
            }
            do {
                zVar.r(h());
                if (R()) {
                    return;
                }
                i11 = this.f5940c;
            } while (c0() == this.f5943f);
            this.f5940c = i11;
        }

        public String a0(boolean z10) {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return "";
            }
            f0(c02);
            if (z10) {
                byte[] bArr = this.f5939b;
                int i10 = this.f5940c;
                if (!t1.n(bArr, i10, i10 + c02)) {
                    throw c0.d();
                }
            }
            String str = new String(this.f5939b, this.f5940c, c02, a0.f5906a);
            this.f5940c += c02;
            return str;
        }

        @Override // com.google.protobuf.g1
        public int b() {
            h0(0);
            return c0();
        }

        public void b0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (u1.b(this.f5943f) != 2) {
                throw c0.e();
            }
            if (!(list instanceof h0) || z10) {
                do {
                    list.add(a0(z10));
                    if (R()) {
                        return;
                    }
                    i10 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i10;
                return;
            }
            h0 h0Var = (h0) list;
            do {
                h0Var.q(B());
                if (R()) {
                    return;
                }
                i11 = this.f5940c;
            } while (c0() == this.f5943f);
            this.f5940c = i11;
        }

        @Override // com.google.protobuf.g1
        public int c() {
            return this.f5943f;
        }

        @Override // com.google.protobuf.g1
        public long d() {
            h0(0);
            return d0();
        }

        public long d0() {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f5940c;
            int i12 = this.f5942e;
            if (i12 != i11) {
                byte[] bArr = this.f5939b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f5940c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return e0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i14 = i16;
                            j10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = j13 ^ (bArr[i14] << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i14 = i19 + 1;
                                    long j15 = j14 ^ (bArr[i19] << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i19 = i14 + 1;
                                        j14 = j15 ^ (bArr[i14] << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i14 = i19 + 1;
                                            j15 = j14 ^ (bArr[i19] << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i20 = i14 + 1;
                                                long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i14 = i20 + 1;
                                                    if (bArr[i20] < 0) {
                                                        throw c0.f();
                                                    }
                                                } else {
                                                    i14 = i20;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i14 = i19;
                            }
                        }
                        this.f5940c = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f5940c = i14;
                    return j10;
                }
            }
            throw c0.k();
        }

        @Override // com.google.protobuf.g1
        public void e(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = u1.b(this.f5943f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f5940c + c02;
                    while (this.f5940c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.e();
                } else {
                    do {
                        list.add(Integer.valueOf(p()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                }
            }
            z zVar = (z) list;
            int b11 = u1.b(this.f5943f);
            if (b11 == 2) {
                int c03 = c0();
                m0(c03);
                int i13 = this.f5940c + c03;
                while (this.f5940c < i13) {
                    zVar.r(W());
                }
            } else if (b11 != 5) {
                throw c0.e();
            } else {
                do {
                    zVar.r(p());
                    if (R()) {
                        return;
                    }
                    i11 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i11;
            }
        }

        @Override // com.google.protobuf.g1
        public long f() {
            h0(1);
            return X();
        }

        @Override // com.google.protobuf.g1
        public void g(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = u1.b(this.f5943f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f5940c + c02;
                    while (this.f5940c < i12) {
                        list.add(Integer.valueOf(W()));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.e();
                } else {
                    do {
                        list.add(Integer.valueOf(G()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                }
            }
            z zVar = (z) list;
            int b11 = u1.b(this.f5943f);
            if (b11 == 2) {
                int c03 = c0();
                m0(c03);
                int i13 = this.f5940c + c03;
                while (this.f5940c < i13) {
                    zVar.r(W());
                }
            } else if (b11 != 5) {
                throw c0.e();
            } else {
                do {
                    zVar.r(G());
                    if (R()) {
                        return;
                    }
                    i11 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i11;
            }
        }

        @Override // com.google.protobuf.g1
        public int h() {
            h0(0);
            return i.b(c0());
        }

        @Override // com.google.protobuf.g1
        public void i(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f5943f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Long.valueOf(i.c(d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(k()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i10;
                return;
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f5943f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int c03 = this.f5940c + c0();
                while (this.f5940c < c03) {
                    j0Var.l(i.c(d0()));
                }
                return;
            }
            do {
                j0Var.l(k());
                if (R()) {
                    return;
                }
                i11 = this.f5940c;
            } while (c0() == this.f5943f);
            this.f5940c = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.g1
        public <T> void j(List<T> list, h1<T> h1Var, p pVar) {
            int i10;
            if (u1.b(this.f5943f) != 3) {
                throw c0.e();
            }
            int i11 = this.f5943f;
            do {
                list.add(U(h1Var, pVar));
                if (R()) {
                    return;
                }
                i10 = this.f5940c;
            } while (c0() == i11);
            this.f5940c = i10;
        }

        @Override // com.google.protobuf.g1
        public long k() {
            h0(0);
            return i.c(d0());
        }

        @Override // com.google.protobuf.g1
        public void l(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof z)) {
                int b10 = u1.b(this.f5943f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(D()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f5940c;
                } while (c0() == this.f5943f);
                this.f5940c = i10;
                return;
            }
            z zVar = (z) list;
            int b11 = u1.b(this.f5943f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int c03 = this.f5940c + c0();
                while (this.f5940c < c03) {
                    zVar.r(c0());
                }
                return;
            }
            do {
                zVar.r(D());
                if (R()) {
                    return;
                }
                i11 = this.f5940c;
            } while (c0() == this.f5943f);
            this.f5940c = i11;
        }

        @Override // com.google.protobuf.g1
        public <T> T m(Class<T> cls, p pVar) {
            h0(2);
            return (T) Z(d1.a().d(cls), pVar);
        }

        @Override // com.google.protobuf.g1
        public void n(List<Boolean> list) {
            int i10;
            int c02;
            int i11;
            if (list instanceof f) {
                f fVar = (f) list;
                int b10 = u1.b(this.f5943f);
                if (b10 == 0) {
                    do {
                        fVar.l(r());
                        if (R()) {
                            return;
                        }
                        i11 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        fVar.l(c0() != 0);
                    }
                }
            } else {
                int b11 = u1.b(this.f5943f);
                if (b11 == 0) {
                    do {
                        list.add(Boolean.valueOf(r()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                }
            }
            g0(c02);
        }

        @Override // com.google.protobuf.g1
        public String o() {
            return a0(false);
        }

        @Override // com.google.protobuf.g1
        public int p() {
            h0(5);
            return V();
        }

        @Override // com.google.protobuf.g1
        public <T> T q(Class<T> cls, p pVar) {
            h0(3);
            return (T) U(d1.a().d(cls), pVar);
        }

        @Override // com.google.protobuf.g1
        public boolean r() {
            h0(0);
            return c0() != 0;
        }

        @Override // com.google.protobuf.g1
        public double readDouble() {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // com.google.protobuf.g1
        public float readFloat() {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.g1
        public <T> void s(List<T> list, h1<T> h1Var, p pVar) {
            int i10;
            if (u1.b(this.f5943f) != 2) {
                throw c0.e();
            }
            int i11 = this.f5943f;
            do {
                list.add(Z(h1Var, pVar));
                if (R()) {
                    return;
                }
                i10 = this.f5940c;
            } while (c0() == i11);
            this.f5940c = i10;
        }

        @Override // com.google.protobuf.g1
        public int t() {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int c02 = c0();
            this.f5943f = c02;
            if (c02 == this.f5944g) {
                return Integer.MAX_VALUE;
            }
            return u1.a(c02);
        }

        @Override // com.google.protobuf.g1
        public void u(List<String> list) {
            b0(list, false);
        }

        @Override // com.google.protobuf.g1
        public long v() {
            h0(1);
            return X();
        }

        @Override // com.google.protobuf.g1
        public <T> T w(h1<T> h1Var, p pVar) {
            h0(2);
            return (T) Z(h1Var, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.g1
        public <K, V> void x(Map<K, V> map, l0.a<K, V> aVar, p pVar) {
            h0(2);
            int c02 = c0();
            f0(c02);
            int i10 = this.f5942e;
            this.f5942e = this.f5940c + c02;
            try {
                Object obj = aVar.f6045b;
                Object obj2 = aVar.f6047d;
                while (true) {
                    int t10 = t();
                    if (t10 == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (t10 == 1) {
                        obj = T(aVar.f6044a, null, null);
                    } else if (t10 != 2) {
                        try {
                            if (!F()) {
                                throw new c0("Unable to parse map entry.");
                                break;
                            }
                        } catch (c0.a unused) {
                            if (!F()) {
                                throw new c0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = T(aVar.f6046c, aVar.f6047d.getClass(), pVar);
                    }
                }
            } finally {
                this.f5942e = i10;
            }
        }

        @Override // com.google.protobuf.g1
        public void y(List<Long> list) {
            int i10;
            int c02;
            int i11;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b10 = u1.b(this.f5943f);
                if (b10 == 0) {
                    do {
                        j0Var.l(d());
                        if (R()) {
                            return;
                        }
                        i11 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        j0Var.l(d0());
                    }
                }
            } else {
                int b11 = u1.b(this.f5943f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f5940c;
                    } while (c0() == this.f5943f);
                    this.f5940c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    c02 = this.f5940c + c0();
                    while (this.f5940c < c02) {
                        list.add(Long.valueOf(d0()));
                    }
                }
            }
            g0(c02);
        }

        @Override // com.google.protobuf.g1
        public void z(List<String> list) {
            b0(list, true);
        }
    }

    private e() {
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
