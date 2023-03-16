package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.h0;
import r9.d0;
import r9.g1;
/* loaded from: classes.dex */
public final class b extends g1 implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public static final b f11008q = new b();

    /* renamed from: r  reason: collision with root package name */
    private static final d0 f11009r;

    static {
        int a10;
        int d10;
        m mVar = m.f11028p;
        a10 = n9.f.a(64, f0.a());
        d10 = h0.d("kotlinx.coroutines.io.parallelism", a10, 0, 0, 12, null);
        f11009r = mVar.X(d10);
    }

    private b() {
    }

    @Override // r9.d0
    public void b(b9.g gVar, Runnable runnable) {
        f11009r.b(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b(b9.h.f2971n, runnable);
    }

    @Override // r9.d0
    public String toString() {
        return "Dispatchers.IO";
    }
}
