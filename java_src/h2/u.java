package h2;

import java.util.Arrays;
/* loaded from: classes.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f8045a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8046b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8047c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f8048d;

    /* renamed from: e  reason: collision with root package name */
    public int f8049e;

    public u(int i10, int i11) {
        this.f8045a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f8048d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f8046b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f8048d;
            int length = bArr2.length;
            int i13 = this.f8049e;
            if (length < i13 + i12) {
                this.f8048d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f8048d, this.f8049e, i12);
            this.f8049e += i12;
        }
    }

    public boolean b(int i10) {
        if (this.f8046b) {
            this.f8049e -= i10;
            this.f8046b = false;
            this.f8047c = true;
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f8047c;
    }

    public void d() {
        this.f8046b = false;
        this.f8047c = false;
    }

    public void e(int i10) {
        p3.a.f(!this.f8046b);
        boolean z10 = i10 == this.f8045a;
        this.f8046b = z10;
        if (z10) {
            this.f8049e = 3;
            this.f8047c = false;
        }
    }
}
