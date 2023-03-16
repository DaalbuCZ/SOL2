package p3;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private int f12341a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f12342b;

    public s() {
        this(32);
    }

    public s(int i10) {
        this.f12342b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f12341a;
        long[] jArr = this.f12342b;
        if (i10 == jArr.length) {
            this.f12342b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f12342b;
        int i11 = this.f12341a;
        this.f12341a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 < 0 || i10 >= this.f12341a) {
            throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f12341a);
        }
        return this.f12342b[i10];
    }

    public int c() {
        return this.f12341a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f12342b, this.f12341a);
    }
}
