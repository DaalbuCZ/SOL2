package t4;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
final class y implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14771a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14772b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private d f14773c;

    public y(Executor executor, d dVar) {
        this.f14771a = executor;
        this.f14773c = dVar;
    }

    @Override // t4.f0
    public final void d(i iVar) {
        synchronized (this.f14772b) {
            if (this.f14773c == null) {
                return;
            }
            this.f14771a.execute(new x(this, iVar));
        }
    }
}
