package o3;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class n extends InputStream {

    /* renamed from: n  reason: collision with root package name */
    private final l f12012n;

    /* renamed from: o  reason: collision with root package name */
    private final p f12013o;

    /* renamed from: s  reason: collision with root package name */
    private long f12017s;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12015q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12016r = false;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f12014p = new byte[1];

    public n(l lVar, p pVar) {
        this.f12012n = lVar;
        this.f12013o = pVar;
    }

    private void a() {
        if (this.f12015q) {
            return;
        }
        this.f12012n.n(this.f12013o);
        this.f12015q = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12016r) {
            return;
        }
        this.f12012n.close();
        this.f12016r = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f12014p) == -1) {
            return -1;
        }
        return this.f12014p[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        p3.a.f(!this.f12016r);
        a();
        int b10 = this.f12012n.b(bArr, i10, i11);
        if (b10 == -1) {
            return -1;
        }
        this.f12017s += b10;
        return b10;
    }
}
