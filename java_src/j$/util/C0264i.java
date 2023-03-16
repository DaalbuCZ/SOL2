package j$.util;
/* renamed from: j$.util.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0264i implements j$.util.function.m {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public void a(C0264i c0264i) {
        this.count += c0264i.count;
        this.sum += c0264i.sum;
        this.min = Math.min(this.min, c0264i.min);
        this.max = Math.max(this.max, c0264i.max);
    }

    @Override // j$.util.function.m
    public void d(int i10) {
        this.count++;
        this.sum += i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0264i.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
