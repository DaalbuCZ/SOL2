package a7;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f245a;

    /* renamed from: b  reason: collision with root package name */
    private long f246b;

    /* renamed from: c  reason: collision with root package name */
    private TimeUnit f247c;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f248a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f248a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f248a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f248a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f245a = j10;
        this.f246b = j11;
        this.f247c = timeUnit;
    }

    public double a() {
        int i10 = a.f248a[this.f247c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f245a / this.f247c.toSeconds(this.f246b) : (this.f245a / this.f246b) * TimeUnit.SECONDS.toMillis(1L) : (this.f245a / this.f246b) * TimeUnit.SECONDS.toMicros(1L) : (this.f245a / this.f246b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
