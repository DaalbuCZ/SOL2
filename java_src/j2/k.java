package j2;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f10305a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f10306b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f10307c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f10308d;

    /* renamed from: e  reason: collision with root package name */
    private int f10309e;

    public k() {
        int[] iArr = new int[16];
        this.f10308d = iArr;
        this.f10309e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f10308d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f10305a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f10308d, 0, iArr2, i11, i10);
        this.f10305a = 0;
        this.f10306b = this.f10307c - 1;
        this.f10308d = iArr2;
        this.f10309e = iArr2.length - 1;
    }

    public void a(int i10) {
        if (this.f10307c == this.f10308d.length) {
            c();
        }
        int i11 = (this.f10306b + 1) & this.f10309e;
        this.f10306b = i11;
        this.f10308d[i11] = i10;
        this.f10307c++;
    }

    public void b() {
        this.f10305a = 0;
        this.f10306b = -1;
        this.f10307c = 0;
    }

    public boolean d() {
        return this.f10307c == 0;
    }

    public int e() {
        int i10 = this.f10307c;
        if (i10 != 0) {
            int[] iArr = this.f10308d;
            int i11 = this.f10305a;
            int i12 = iArr[i11];
            this.f10305a = (i11 + 1) & this.f10309e;
            this.f10307c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
