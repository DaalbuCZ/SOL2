package p3;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f12242a;

    /* renamed from: b  reason: collision with root package name */
    private int f12243b;

    /* renamed from: c  reason: collision with root package name */
    private int f12244c;

    public a0() {
        this.f12242a = m0.f12311f;
    }

    public a0(int i10) {
        this.f12242a = new byte[i10];
        this.f12244c = i10;
    }

    public a0(byte[] bArr) {
        this.f12242a = bArr;
        this.f12244c = bArr.length;
    }

    public a0(byte[] bArr, int i10) {
        this.f12242a = bArr;
        this.f12244c = i10;
    }

    public String A(int i10, Charset charset) {
        String str = new String(this.f12242a, this.f12243b, i10, charset);
        this.f12243b += i10;
        return str;
    }

    public int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public int C() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        this.f12243b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int D() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f12243b = i12 + 2;
        return i13;
    }

    public long E() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = i12 + 1;
        this.f12243b = i13;
        this.f12243b = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int F() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f12243b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int G() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException("Top bit not zero: " + m10);
    }

    public long H() {
        long v10 = v();
        if (v10 >= 0) {
            return v10;
        }
        throw new IllegalStateException("Top bit not zero: " + v10);
    }

    public int I() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        this.f12243b = i11 + 1;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long J() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.f12242a[this.f12243b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f12242a[this.f12243b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (b10 & 63);
        }
        this.f12243b += i11;
        return j10;
    }

    public void K(int i10) {
        M(b() < i10 ? new byte[i10] : this.f12242a, i10);
    }

    public void L(byte[] bArr) {
        M(bArr, bArr.length);
    }

    public void M(byte[] bArr, int i10) {
        this.f12242a = bArr;
        this.f12244c = i10;
        this.f12243b = 0;
    }

    public void N(int i10) {
        a.a(i10 >= 0 && i10 <= this.f12242a.length);
        this.f12244c = i10;
    }

    public void O(int i10) {
        a.a(i10 >= 0 && i10 <= this.f12244c);
        this.f12243b = i10;
    }

    public void P(int i10) {
        O(this.f12243b + i10);
    }

    public int a() {
        return this.f12244c - this.f12243b;
    }

    public int b() {
        return this.f12242a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f12242a = Arrays.copyOf(this.f12242a, i10);
        }
    }

    public byte[] d() {
        return this.f12242a;
    }

    public int e() {
        return this.f12243b;
    }

    public int f() {
        return this.f12244c;
    }

    public char g() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        return (char) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public int h() {
        return this.f12242a[this.f12243b] & 255;
    }

    public void i(z zVar, int i10) {
        j(zVar.f12390a, 0, i10);
        zVar.p(0);
    }

    public void j(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f12242a, this.f12243b, bArr, i10, i11);
        this.f12243b += i11;
    }

    public String k(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f12243b;
        while (i10 < this.f12244c && this.f12242a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f12242a;
        int i11 = this.f12243b;
        String E = m0.E(bArr, i11, i10 - i11);
        this.f12243b = i10;
        if (i10 < this.f12244c) {
            this.f12243b = i10 + 1;
        }
        return E;
    }

    public double l() {
        return Double.longBitsToDouble(v());
    }

    public int m() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        this.f12243b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f12243b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int n() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f12243b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public String o() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f12243b;
        while (i10 < this.f12244c && !m0.t0(this.f12242a[i10])) {
            i10++;
        }
        int i11 = this.f12243b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f12242a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f12243b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f12242a;
        int i12 = this.f12243b;
        String E = m0.E(bArr2, i12, i10 - i12);
        this.f12243b = i10;
        int i13 = this.f12244c;
        if (i10 == i13) {
            return E;
        }
        byte[] bArr3 = this.f12242a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f12243b = i14;
            if (i14 == i13) {
                return E;
            }
        }
        int i15 = this.f12243b;
        if (bArr3[i15] == 10) {
            this.f12243b = i15 + 1;
        }
        return E;
    }

    public int p() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        this.f12243b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f12243b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long q() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = i12 + 1;
        this.f12243b = i13;
        int i14 = i13 + 1;
        this.f12243b = i14;
        int i15 = i14 + 1;
        this.f12243b = i15;
        int i16 = i15 + 1;
        this.f12243b = i16;
        int i17 = i16 + 1;
        this.f12243b = i17;
        this.f12243b = i17 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    public short r() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        this.f12243b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long s() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = i12 + 1;
        this.f12243b = i13;
        this.f12243b = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public int t() {
        int p10 = p();
        if (p10 >= 0) {
            return p10;
        }
        throw new IllegalStateException("Top bit not zero: " + p10);
    }

    public int u() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        this.f12243b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public long v() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        int i12 = i11 + 1;
        this.f12243b = i12;
        int i13 = i12 + 1;
        this.f12243b = i13;
        int i14 = i13 + 1;
        this.f12243b = i14;
        int i15 = i14 + 1;
        this.f12243b = i15;
        int i16 = i15 + 1;
        this.f12243b = i16;
        int i17 = i16 + 1;
        this.f12243b = i17;
        this.f12243b = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }

    public String w() {
        return k((char) 0);
    }

    public String x(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f12243b;
        int i12 = (i11 + i10) - 1;
        String E = m0.E(this.f12242a, i11, (i12 >= this.f12244c || this.f12242a[i12] != 0) ? i10 : i10 - 1);
        this.f12243b += i10;
        return E;
    }

    public short y() {
        byte[] bArr = this.f12242a;
        int i10 = this.f12243b;
        int i11 = i10 + 1;
        this.f12243b = i11;
        this.f12243b = i11 + 1;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String z(int i10) {
        return A(i10, a5.d.f200c);
    }
}
