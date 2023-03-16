package x6;

import a7.l;
import java.io.IOException;
import java.io.InputStream;
import v6.h;
/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: n  reason: collision with root package name */
    private final InputStream f16376n;

    /* renamed from: o  reason: collision with root package name */
    private final h f16377o;

    /* renamed from: p  reason: collision with root package name */
    private final l f16378p;

    /* renamed from: r  reason: collision with root package name */
    private long f16380r;

    /* renamed from: q  reason: collision with root package name */
    private long f16379q = -1;

    /* renamed from: s  reason: collision with root package name */
    private long f16381s = -1;

    public a(InputStream inputStream, h hVar, l lVar) {
        this.f16378p = lVar;
        this.f16376n = inputStream;
        this.f16377o = hVar;
        this.f16380r = hVar.e();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f16376n.available();
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long c10 = this.f16378p.c();
        if (this.f16381s == -1) {
            this.f16381s = c10;
        }
        try {
            this.f16376n.close();
            long j10 = this.f16379q;
            if (j10 != -1) {
                this.f16377o.v(j10);
            }
            long j11 = this.f16380r;
            if (j11 != -1) {
                this.f16377o.y(j11);
            }
            this.f16377o.x(this.f16381s);
            this.f16377o.b();
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f16376n.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f16376n.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f16376n.read();
            long c10 = this.f16378p.c();
            if (this.f16380r == -1) {
                this.f16380r = c10;
            }
            if (read == -1 && this.f16381s == -1) {
                this.f16381s = c10;
                this.f16377o.x(c10);
                this.f16377o.b();
            } else {
                long j10 = this.f16379q + 1;
                this.f16379q = j10;
                this.f16377o.v(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f16376n.read(bArr);
            long c10 = this.f16378p.c();
            if (this.f16380r == -1) {
                this.f16380r = c10;
            }
            if (read == -1 && this.f16381s == -1) {
                this.f16381s = c10;
                this.f16377o.x(c10);
                this.f16377o.b();
            } else {
                long j10 = this.f16379q + read;
                this.f16379q = j10;
                this.f16377o.v(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            int read = this.f16376n.read(bArr, i10, i11);
            long c10 = this.f16378p.c();
            if (this.f16380r == -1) {
                this.f16380r = c10;
            }
            if (read == -1 && this.f16381s == -1) {
                this.f16381s = c10;
                this.f16377o.x(c10);
                this.f16377o.b();
            } else {
                long j10 = this.f16379q + read;
                this.f16379q = j10;
                this.f16377o.v(j10);
            }
            return read;
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        try {
            this.f16376n.reset();
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            long skip = this.f16376n.skip(j10);
            long c10 = this.f16378p.c();
            if (this.f16380r == -1) {
                this.f16380r = c10;
            }
            if (skip == -1 && this.f16381s == -1) {
                this.f16381s = c10;
                this.f16377o.x(c10);
            } else {
                long j11 = this.f16379q + skip;
                this.f16379q = j11;
                this.f16377o.v(j11);
            }
            return skip;
        } catch (IOException e10) {
            this.f16377o.x(this.f16378p.c());
            e.d(this.f16377o);
            throw e10;
        }
    }
}
