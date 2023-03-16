package y0;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import y0.n0;
/* loaded from: classes.dex */
public class b0<T> implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16448a;

    /* renamed from: b  reason: collision with root package name */
    private final l1<T> f16449b;

    /* renamed from: c  reason: collision with root package name */
    private final i2<T> f16450c;

    /* renamed from: d  reason: collision with root package name */
    private final f2 f16451d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f16452e;

    /* renamed from: f  reason: collision with root package name */
    private final k3 f16453f;

    /* renamed from: g  reason: collision with root package name */
    private final T f16454g;

    public b0(s2 s2Var, i2<T> i2Var, T t10, f2 f2Var, l1<T> l1Var, AtomicLong atomicLong, k3 k3Var) {
        this.f16448a = s2Var;
        this.f16450c = i2Var;
        this.f16454g = t10;
        this.f16451d = f2Var;
        this.f16449b = l1Var;
        this.f16452e = atomicLong;
        this.f16453f = k3Var;
    }

    private n0 b(String str) {
        return new n0.b().f(0).a(n0.c.E.e()).b(this.f16452e.getAndIncrement()).d(new Date(System.currentTimeMillis())).h("bf_disk_error").g("").c("").i(str).k("").j("").e();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Boolean call() {
        boolean e10 = this.f16450c.a().e(this.f16449b.a(this.f16454g));
        if (!e10) {
            i0.d("Bugfender-SDK", "Bugfender couldn't store the log on disk due to an error.");
            if (this.f16453f.c()) {
                new r1(this.f16448a, this.f16451d, b("Bugfender couldn't store the log on disk due to an error.")).call();
            }
        }
        return Boolean.valueOf(e10);
    }
}
