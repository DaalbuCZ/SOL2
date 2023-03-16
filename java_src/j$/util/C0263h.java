package j$.util;
/* renamed from: j$.util.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0263h implements j$.util.function.h {

    /* renamed from: a  reason: collision with root package name */
    private double f9742a;

    /* renamed from: b  reason: collision with root package name */
    private double f9743b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void e(double d10) {
        double d11 = d10 - this.f9742a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f9742a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public void a(C0263h c0263h) {
        this.count += c0263h.count;
        this.f9743b += c0263h.f9743b;
        e(c0263h.sum);
        e(c0263h.f9742a);
        this.min = Math.min(this.min, c0263h.min);
        this.max = Math.max(this.max, c0263h.max);
    }

    @Override // j$.util.function.h
    public void c(double d10) {
        this.count++;
        this.f9743b += d10;
        e(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final double d() {
        double d10 = this.sum + this.f9742a;
        return (Double.isNaN(d10) && Double.isInfinite(this.f9743b)) ? this.f9743b : d10;
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0263h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Double.valueOf(d());
        objArr[3] = Double.valueOf(this.min);
        objArr[4] = Double.valueOf(this.count > 0 ? d() / this.count : 0.0d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
