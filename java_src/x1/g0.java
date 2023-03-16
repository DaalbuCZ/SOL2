package x1;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16228a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16229b;

    /* renamed from: c  reason: collision with root package name */
    private int f16230c;

    /* renamed from: d  reason: collision with root package name */
    private int f16231d;

    public g0(byte[] bArr) {
        this.f16228a = bArr;
        this.f16229b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f16230c;
        p3.a.f(i11 >= 0 && (i11 < (i10 = this.f16229b) || (i11 == i10 && this.f16231d == 0)));
    }

    public int b() {
        return (this.f16230c * 8) + this.f16231d;
    }

    public boolean c() {
        boolean z10 = (((this.f16228a[this.f16230c] & 255) >> this.f16231d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f16230c;
        int min = Math.min(i10, 8 - this.f16231d);
        int i12 = i11 + 1;
        int i13 = ((this.f16228a[i11] & 255) >> this.f16231d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f16228a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f16230c + i11;
        this.f16230c = i12;
        int i13 = this.f16231d + (i10 - (i11 * 8));
        this.f16231d = i13;
        if (i13 > 7) {
            this.f16230c = i12 + 1;
            this.f16231d = i13 - 8;
        }
        a();
    }
}
