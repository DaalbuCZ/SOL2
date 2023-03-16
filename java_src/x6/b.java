package x6;

import a7.l;
import java.io.IOException;
import java.io.OutputStream;
import v6.h;
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: n  reason: collision with root package name */
    private final OutputStream f16382n;

    /* renamed from: o  reason: collision with root package name */
    private final l f16383o;

    /* renamed from: p  reason: collision with root package name */
    h f16384p;

    /* renamed from: q  reason: collision with root package name */
    long f16385q = -1;

    public b(OutputStream outputStream, h hVar, l lVar) {
        this.f16382n = outputStream;
        this.f16384p = hVar;
        this.f16383o = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f16385q;
        if (j10 != -1) {
            this.f16384p.s(j10);
        }
        this.f16384p.w(this.f16383o.c());
        try {
            this.f16382n.close();
        } catch (IOException e10) {
            this.f16384p.x(this.f16383o.c());
            e.d(this.f16384p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f16382n.flush();
        } catch (IOException e10) {
            this.f16384p.x(this.f16383o.c());
            e.d(this.f16384p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        try {
            this.f16382n.write(i10);
            long j10 = this.f16385q + 1;
            this.f16385q = j10;
            this.f16384p.s(j10);
        } catch (IOException e10) {
            this.f16384p.x(this.f16383o.c());
            e.d(this.f16384p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f16382n.write(bArr);
            long length = this.f16385q + bArr.length;
            this.f16385q = length;
            this.f16384p.s(length);
        } catch (IOException e10) {
            this.f16384p.x(this.f16383o.c());
            e.d(this.f16384p);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.f16382n.write(bArr, i10, i11);
            long j10 = this.f16385q + i11;
            this.f16385q = j10;
            this.f16384p.s(j10);
        } catch (IOException e10) {
            this.f16384p.x(this.f16383o.c());
            e.d(this.f16384p);
            throw e10;
        }
    }
}
