package u0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import t0.g;
/* loaded from: classes.dex */
public class b implements u0.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f14857a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f14858b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f14859c = new a();

    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f14857a = new g(executor);
    }

    @Override // u0.a
    public Executor a() {
        return this.f14859c;
    }

    @Override // u0.a
    public void b(Runnable runnable) {
        this.f14857a.execute(runnable);
    }

    @Override // u0.a
    public g c() {
        return this.f14857a;
    }

    public void d(Runnable runnable) {
        this.f14858b.post(runnable);
    }
}
