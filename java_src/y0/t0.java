package y0;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class t0 implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    private final int f16702n;

    /* renamed from: o  reason: collision with root package name */
    private final Charset f16703o;

    /* renamed from: p  reason: collision with root package name */
    private final RandomAccessFile f16704p;

    /* renamed from: q  reason: collision with root package name */
    private final byte[][] f16705q;

    /* renamed from: r  reason: collision with root package name */
    private final int f16706r;

    /* renamed from: s  reason: collision with root package name */
    private final int f16707s;

    /* renamed from: t  reason: collision with root package name */
    private b f16708t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f16709u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f16710a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f16711b;

        /* renamed from: c  reason: collision with root package name */
        private byte[] f16712c;

        /* renamed from: d  reason: collision with root package name */
        private int f16713d;

        private b(long j10, int i10, byte[] bArr) {
            this.f16710a = j10;
            int length = (bArr != null ? bArr.length : 0) + i10;
            byte[] bArr2 = new byte[length];
            this.f16711b = bArr2;
            long j11 = (j10 - 1) * t0.this.f16702n;
            if (j10 > 0) {
                t0.this.f16704p.seek(j11);
                if (t0.this.f16704p.read(bArr2, 0, i10) != i10) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i10, bArr.length);
            }
            this.f16713d = length - 1;
            this.f16712c = null;
        }

        private int a(byte[] bArr, int i10) {
            byte[][] bArr2;
            for (byte[] bArr3 : t0.this.f16705q) {
                boolean z10 = true;
                for (int length = bArr3.length - 1; length >= 0; length--) {
                    int length2 = (i10 + length) - (bArr3.length - 1);
                    z10 &= length2 >= 0 && bArr[length2] == bArr3[length];
                }
                if (z10) {
                    return bArr3.length;
                }
            }
            return 0;
        }

        private void c() {
            int i10 = this.f16713d + 1;
            if (i10 > 0) {
                byte[] bArr = new byte[i10];
                this.f16712c = bArr;
                System.arraycopy(this.f16711b, 0, bArr, 0, i10);
            } else {
                this.f16712c = null;
            }
            this.f16713d = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String d() {
            String str;
            byte[] bArr;
            boolean z10 = this.f16710a == 1;
            int i10 = this.f16713d;
            while (i10 > -1) {
                if (z10 || i10 >= t0.this.f16706r) {
                    int a10 = a(this.f16711b, i10);
                    if (a10 > 0) {
                        int i11 = i10 + 1;
                        int i12 = (this.f16713d - i11) + 1;
                        if (i12 < 0) {
                            throw new IllegalStateException("Unexpected negative line length=" + i12);
                        }
                        byte[] bArr2 = new byte[i12];
                        System.arraycopy(this.f16711b, i11, bArr2, 0, i12);
                        str = new String(bArr2, t0.this.f16703o);
                        this.f16713d = i10 - a10;
                        if (!z10 && (bArr = this.f16712c) != null) {
                            String str2 = new String(bArr, t0.this.f16703o);
                            this.f16712c = null;
                            return str2;
                        }
                    }
                    i10 -= t0.this.f16707s;
                    if (i10 < 0) {
                    }
                }
                c();
            }
            str = null;
            return !z10 ? str : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            if (this.f16713d > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.f16713d);
            }
            long j10 = this.f16710a;
            if (j10 > 1) {
                t0 t0Var = t0.this;
                return new b(j10 - 1, t0Var.f16702n, this.f16712c);
            } else if (this.f16712c == null) {
                return null;
            } else {
                throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.f16712c, t0.this.f16703o));
            }
        }
    }

    private t0(File file, int i10, Charset charset) {
        int i11;
        long j10;
        this.f16709u = false;
        this.f16702n = i10;
        this.f16703o = charset;
        if (charset.newEncoder().maxBytesPerChar() != 1.0f && charset != i3.f16539a) {
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        this.f16707s = 1;
        byte[][] bArr = {"\r\n".getBytes(charset), "\n".getBytes(charset), "\r".getBytes(charset)};
        this.f16705q = bArr;
        this.f16706r = bArr[0].length;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f16704p = randomAccessFile;
        long length = randomAccessFile.length();
        long j11 = i10;
        int i12 = (int) (length % j11);
        if (i12 > 0) {
            i11 = i12;
            j10 = (length / j11) + 1;
        } else {
            long j12 = length / j11;
            i11 = length > 0 ? i10 : i12;
            j10 = j12;
        }
        this.f16708t = new b(j10, i11, null);
    }

    public t0(File file, Charset charset) {
        this(file, 4096, charset);
    }

    public String c() {
        String d10 = this.f16708t.d();
        while (d10 == null) {
            b f10 = this.f16708t.f();
            this.f16708t = f10;
            if (f10 == null) {
                break;
            }
            d10 = f10.d();
        }
        if (!"".equals(d10) || this.f16709u) {
            return d10;
        }
        this.f16709u = true;
        return c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16704p.close();
    }
}
