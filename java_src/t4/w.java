package t4;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
final class w implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14766a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14767b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private c f14768c;

    public w(Executor executor, c cVar) {
        this.f14766a = executor;
        this.f14768c = cVar;
    }

    @Override // t4.f0
    public final void d(i iVar) {
        if (iVar.n()) {
            synchronized (this.f14767b) {
                if (this.f14768c == null) {
                    return;
                }
                this.f14766a.execute(new v(this));
            }
        }
    }
}
