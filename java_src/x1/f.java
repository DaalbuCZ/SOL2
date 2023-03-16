package x1;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p3.m0;
import s1.j1;
/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: b  reason: collision with root package name */
    private final o3.i f16214b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16215c;

    /* renamed from: d  reason: collision with root package name */
    private long f16216d;

    /* renamed from: f  reason: collision with root package name */
    private int f16218f;

    /* renamed from: g  reason: collision with root package name */
    private int f16219g;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f16217e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16213a = new byte[4096];

    static {
        j1.a("goog.exo.extractor");
    }

    public f(o3.i iVar, long j10, long j11) {
        this.f16214b = iVar;
        this.f16216d = j10;
        this.f16215c = j11;
    }

    private void r(int i10) {
        if (i10 != -1) {
            this.f16216d += i10;
        }
    }

    private void s(int i10) {
        int i11 = this.f16218f + i10;
        byte[] bArr = this.f16217e;
        if (i11 > bArr.length) {
            this.f16217e = Arrays.copyOf(this.f16217e, m0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int t(byte[] bArr, int i10, int i11) {
        int i12 = this.f16219g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f16217e, 0, bArr, i10, min);
        x(min);
        return min;
    }

    private int u(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int b10 = this.f16214b.b(bArr, i10 + i12, i11 - i12);
        if (b10 == -1) {
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        return i12 + b10;
    }

    private int v(int i10) {
        int min = Math.min(this.f16219g, i10);
        x(min);
        return min;
    }

    private void x(int i10) {
        int i11 = this.f16219g - i10;
        this.f16219g = i11;
        this.f16218f = 0;
        byte[] bArr = this.f16217e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f16217e = bArr2;
    }

    @Override // x1.m
    public long a() {
        return this.f16215c;
    }

    @Override // x1.m, o3.i
    public int b(byte[] bArr, int i10, int i11) {
        int t10 = t(bArr, i10, i11);
        if (t10 == 0) {
            t10 = u(bArr, i10, i11, 0, true);
        }
        r(t10);
        return t10;
    }

    @Override // x1.m
    public int c(int i10) {
        int v10 = v(i10);
        if (v10 == 0) {
            byte[] bArr = this.f16213a;
            v10 = u(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        r(v10);
        return v10;
    }

    @Override // x1.m
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        int t10 = t(bArr, i10, i11);
        while (t10 < i11 && t10 != -1) {
            t10 = u(bArr, i10, i11, t10, z10);
        }
        r(t10);
        return t10 != -1;
    }

    @Override // x1.m
    public int e(byte[] bArr, int i10, int i11) {
        int min;
        s(i11);
        int i12 = this.f16219g;
        int i13 = this.f16218f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = u(this.f16217e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f16219g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f16217e, this.f16218f, bArr, i10, min);
        this.f16218f += min;
        return min;
    }

    @Override // x1.m
    public void g() {
        this.f16218f = 0;
    }

    @Override // x1.m
    public void h(int i10) {
        w(i10, false);
    }

    @Override // x1.m
    public boolean j(int i10, boolean z10) {
        s(i10);
        int i11 = this.f16219g - this.f16218f;
        while (i11 < i10) {
            i11 = u(this.f16217e, this.f16218f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f16219g = this.f16218f + i11;
        }
        this.f16218f += i10;
        return true;
    }

    @Override // x1.m
    public boolean l(byte[] bArr, int i10, int i11, boolean z10) {
        if (j(i11, z10)) {
            System.arraycopy(this.f16217e, this.f16218f - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // x1.m
    public long m() {
        return this.f16216d + this.f16218f;
    }

    @Override // x1.m
    public void o(byte[] bArr, int i10, int i11) {
        l(bArr, i10, i11, false);
    }

    @Override // x1.m
    public void p(int i10) {
        j(i10, false);
    }

    @Override // x1.m
    public long q() {
        return this.f16216d;
    }

    @Override // x1.m
    public void readFully(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    public boolean w(int i10, boolean z10) {
        int v10 = v(i10);
        while (v10 < i10 && v10 != -1) {
            v10 = u(this.f16213a, -v10, Math.min(i10, this.f16213a.length + v10), v10, z10);
        }
        r(v10);
        return v10 != -1;
    }
}
