package y0;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private long f16701a = -1;

    public synchronized long a() {
        return this.f16701a;
    }

    public synchronized void b(long j10) {
        if (d()) {
            this.f16701a += j10;
        }
    }

    public synchronized void c(long j10) {
        this.f16701a = j10;
    }

    public synchronized boolean d() {
        return this.f16701a != -1;
    }

    public synchronized void e(long j10) {
        if (d()) {
            this.f16701a -= j10;
        }
    }
}
