package t4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class i0 implements Executor {

    /* renamed from: n  reason: collision with root package name */
    private final Handler f14733n = new n4.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14733n.post(runnable);
    }
}
