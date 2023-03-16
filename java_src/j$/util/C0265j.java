package j$.util;
/* renamed from: j$.util.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0265j implements j$.util.function.r, j$.util.function.m {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public void a(C0265j c0265j) {
        this.count += c0265j.count;
        this.sum += c0265j.sum;
        this.min = Math.min(this.min, c0265j.min);
        this.max = Math.max(this.max, c0265j.max);
    }

    @Override // j$.util.function.m
    public void d(int i10) {
        e(i10);
    }

    @Override // j$.util.function.r
    public void e(long j10) {
        this.count++;
        this.sum += j10;
        this.min = Math.min(this.min, j10);
        this.max = Math.max(this.max, j10);
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0265j.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
