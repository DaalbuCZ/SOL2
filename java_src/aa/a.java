package aa;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class a implements b, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f297p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    d f298n;

    /* renamed from: o  reason: collision with root package name */
    long f299o;

    public byte D() {
        long j10 = this.f299o;
        if (j10 != 0) {
            d dVar = this.f298n;
            int i10 = dVar.f306b;
            int i11 = dVar.f307c;
            int i12 = i10 + 1;
            byte b10 = dVar.f305a[i10];
            this.f299o = j10 - 1;
            if (i12 == i11) {
                this.f298n = dVar.a();
                e.a(dVar);
            } else {
                dVar.f306b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public byte[] E(long j10) {
        g.b(this.f299o, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            G(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public void G(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int t10 = t(bArr, i10, bArr.length - i10);
            if (t10 == -1) {
                throw new EOFException();
            }
            i10 += t10;
        }
    }

    public String N(long j10, Charset charset) {
        g.b(this.f299o, 0L, j10);
        if (charset != null) {
            if (j10 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
            } else if (j10 == 0) {
                return "";
            } else {
                d dVar = this.f298n;
                int i10 = dVar.f306b;
                if (i10 + j10 > dVar.f307c) {
                    return new String(E(j10), charset);
                }
                String str = new String(dVar.f305a, i10, (int) j10, charset);
                int i11 = (int) (dVar.f306b + j10);
                dVar.f306b = i11;
                this.f299o -= j10;
                if (i11 == dVar.f307c) {
                    this.f298n = dVar.a();
                    e.a(dVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String O() {
        try {
            return N(this.f299o, g.f316a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final c R() {
        long j10 = this.f299o;
        if (j10 <= 2147483647L) {
            return S((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f299o);
    }

    public final c S(int i10) {
        return i10 == 0 ? c.f301r : new f(this, i10);
    }

    d W(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        d dVar = this.f298n;
        if (dVar != null) {
            d dVar2 = dVar.f311g;
            return (dVar2.f307c + i10 > 8192 || !dVar2.f309e) ? dVar2.b(e.b()) : dVar2;
        }
        d b10 = e.b();
        this.f298n = b10;
        b10.f311g = b10;
        b10.f310f = b10;
        return b10;
    }

    public a X(byte[] bArr) {
        if (bArr != null) {
            return Y(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public a Y(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            g.b(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                d W = W(1);
                int min = Math.min(i12 - i10, 8192 - W.f307c);
                System.arraycopy(bArr, i10, W.f305a, W.f307c, min);
                i10 += min;
                W.f307c += min;
            }
            this.f299o += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public a Z(int i10) {
        d W = W(1);
        byte[] bArr = W.f305a;
        int i11 = W.f307c;
        W.f307c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f299o++;
        return this;
    }

    public a a0(long j10) {
        if (j10 == 0) {
            return Z(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        d W = W(numberOfTrailingZeros);
        byte[] bArr = W.f305a;
        int i10 = W.f307c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f297p[(int) (15 & j10)];
            j10 >>>= 4;
        }
        W.f307c += numberOfTrailingZeros;
        this.f299o += numberOfTrailingZeros;
        return this;
    }

    public a b0(String str, int i10, int i11, Charset charset) {
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i10);
            } else if (i11 < i10) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            } else if (i11 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(g.f316a)) {
                        return d0(str, i10, i11);
                    }
                    byte[] bytes = str.substring(i10, i11).getBytes(charset);
                    return Y(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            } else {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    /* renamed from: c */
    public a clone() {
        a aVar = new a();
        if (this.f299o == 0) {
            return aVar;
        }
        d c10 = this.f298n.c();
        aVar.f298n = c10;
        c10.f311g = c10;
        c10.f310f = c10;
        d dVar = this.f298n;
        while (true) {
            dVar = dVar.f310f;
            if (dVar == this.f298n) {
                aVar.f299o = this.f299o;
                return aVar;
            }
            aVar.f298n.f311g.b(dVar.c());
        }
    }

    public a c0(String str) {
        return d0(str, 0, str.length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public a d0(String str, int i10, int i11) {
        int i12;
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i10);
            } else if (i11 < i10) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            } else if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            } else {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        d W = W(1);
                        byte[] bArr = W.f305a;
                        int i13 = W.f307c - i10;
                        int min = Math.min(i11, 8192 - i13);
                        int i14 = i10 + 1;
                        bArr[i10 + i13] = (byte) charAt;
                        while (i14 < min) {
                            char charAt2 = str.charAt(i14);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i14 + i13] = (byte) charAt2;
                            i14++;
                        }
                        int i15 = W.f307c;
                        int i16 = (i13 + i14) - i15;
                        W.f307c = i15 + i16;
                        this.f299o += i16;
                        i10 = i14;
                    } else {
                        if (charAt < 2048) {
                            i12 = (charAt >> 6) | 192;
                        } else if (charAt < 55296 || charAt > 57343) {
                            Z((charAt >> '\f') | 224);
                            i12 = ((charAt >> 6) & 63) | 128;
                        } else {
                            int i17 = i10 + 1;
                            char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                            if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                Z(63);
                                i10 = i17;
                            } else {
                                int i18 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                Z((i18 >> 18) | 240);
                                Z(((i18 >> 12) & 63) | 128);
                                Z(((i18 >> 6) & 63) | 128);
                                Z((i18 & 63) | 128);
                                i10 += 2;
                            }
                        }
                        Z(i12);
                        Z((charAt & '?') | 128);
                        i10++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public a e0(int i10) {
        int i11;
        int i12;
        if (i10 >= 128) {
            if (i10 < 2048) {
                i12 = (i10 >> 6) | 192;
            } else {
                if (i10 < 65536) {
                    if (i10 >= 55296 && i10 <= 57343) {
                        Z(63);
                        return this;
                    }
                    i11 = (i10 >> 12) | 224;
                } else if (i10 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
                } else {
                    Z((i10 >> 18) | 240);
                    i11 = ((i10 >> 12) & 63) | 128;
                }
                Z(i11);
                i12 = ((i10 >> 6) & 63) | 128;
            }
            Z(i12);
            i10 = (i10 & 63) | 128;
        }
        Z(i10);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            long j10 = this.f299o;
            if (j10 != aVar.f299o) {
                return false;
            }
            long j11 = 0;
            if (j10 == 0) {
                return true;
            }
            d dVar = this.f298n;
            d dVar2 = aVar.f298n;
            int i10 = dVar.f306b;
            int i11 = dVar2.f306b;
            while (j11 < this.f299o) {
                long min = Math.min(dVar.f307c - i10, dVar2.f307c - i11);
                int i12 = 0;
                while (i12 < min) {
                    int i13 = i10 + 1;
                    int i14 = i11 + 1;
                    if (dVar.f305a[i10] != dVar2.f305a[i11]) {
                        return false;
                    }
                    i12++;
                    i10 = i13;
                    i11 = i14;
                }
                if (i10 == dVar.f307c) {
                    dVar = dVar.f310f;
                    i10 = dVar.f306b;
                }
                if (i11 == dVar2.f307c) {
                    dVar2 = dVar2.f310f;
                    i11 = dVar2.f306b;
                }
                j11 += min;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        d dVar = this.f298n;
        if (dVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = dVar.f307c;
            for (int i12 = dVar.f306b; i12 < i11; i12++) {
                i10 = (i10 * 31) + dVar.f305a[i12];
            }
            dVar = dVar.f310f;
        } while (dVar != this.f298n);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean p() {
        return this.f299o == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        d dVar = this.f298n;
        if (dVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), dVar.f307c - dVar.f306b);
        byteBuffer.put(dVar.f305a, dVar.f306b, min);
        int i10 = dVar.f306b + min;
        dVar.f306b = i10;
        this.f299o -= min;
        if (i10 == dVar.f307c) {
            this.f298n = dVar.a();
            e.a(dVar);
        }
        return min;
    }

    public int t(byte[] bArr, int i10, int i11) {
        g.b(bArr.length, i10, i11);
        d dVar = this.f298n;
        if (dVar == null) {
            return -1;
        }
        int min = Math.min(i11, dVar.f307c - dVar.f306b);
        System.arraycopy(dVar.f305a, dVar.f306b, bArr, i10, min);
        int i12 = dVar.f306b + min;
        dVar.f306b = i12;
        this.f299o -= min;
        if (i12 == dVar.f307c) {
            this.f298n = dVar.a();
            e.a(dVar);
        }
        return min;
    }

    public String toString() {
        return R().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                d W = W(1);
                int min = Math.min(i10, 8192 - W.f307c);
                byteBuffer.get(W.f305a, W.f307c, min);
                i10 -= min;
                W.f307c += min;
            }
            this.f299o += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }
}
