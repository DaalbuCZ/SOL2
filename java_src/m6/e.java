package m6;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f11432d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f11433e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f11434a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f11435b;

    /* renamed from: c  reason: collision with root package name */
    private int f11436c;

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f11436c) + this.f11434a.e(), f11433e);
        }
        return f11432d;
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f11436c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f11436c != 0) {
            z10 = this.f11434a.a() > this.f11435b;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f11436c++;
        this.f11435b = this.f11434a.a() + a(i10);
    }
}
