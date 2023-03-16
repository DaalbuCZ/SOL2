package p3;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f12246a;

    /* renamed from: b  reason: collision with root package name */
    private int f12247b;

    /* renamed from: c  reason: collision with root package name */
    private int f12248c;

    /* renamed from: d  reason: collision with root package name */
    private int f12249d;

    public b0(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11);
    }

    private void a() {
        int i10;
        int i11 = this.f12248c;
        a.f(i11 >= 0 && (i11 < (i10 = this.f12247b) || (i11 == i10 && this.f12249d == 0)));
    }

    private int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    private boolean j(int i10) {
        if (2 <= i10 && i10 < this.f12247b) {
            byte[] bArr = this.f12246a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int i10) {
        int i11 = this.f12248c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f12249d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f12247b) {
                break;
            } else if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f12247b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f12248c;
        int i11 = this.f12249d;
        int i12 = 0;
        while (this.f12248c < this.f12247b && !d()) {
            i12++;
        }
        boolean z10 = this.f12248c == this.f12247b;
        this.f12248c = i10;
        this.f12249d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.f12246a[this.f12248c] & (128 >> this.f12249d)) != 0;
        k();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.f12249d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f12249d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f12249d = i13;
            byte[] bArr = this.f12246a;
            int i14 = this.f12248c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!j(i14 + 1)) {
                r3 = 1;
            }
            this.f12248c = i14 + r3;
        }
        byte[] bArr2 = this.f12246a;
        int i15 = this.f12248c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f12249d = 0;
            this.f12248c = i15 + (j(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public int g() {
        int f10 = f();
        return (f10 % 2 == 0 ? -1 : 1) * ((f10 + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i10, int i11) {
        this.f12246a = bArr;
        this.f12248c = i10;
        this.f12247b = i11;
        this.f12249d = 0;
        a();
    }

    public void k() {
        int i10 = this.f12249d + 1;
        this.f12249d = i10;
        if (i10 == 8) {
            this.f12249d = 0;
            int i11 = this.f12248c;
            this.f12248c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i10) {
        int i11 = this.f12248c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f12248c = i13;
        int i14 = this.f12249d + (i10 - (i12 * 8));
        this.f12249d = i14;
        if (i14 > 7) {
            this.f12248c = i13 + 1;
            this.f12249d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f12248c) {
                a();
                return;
            } else if (j(i11)) {
                this.f12248c++;
                i11 += 2;
            }
        }
    }
}
