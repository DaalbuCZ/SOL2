package t4;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14717a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14718b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private e f14719c;

    public a0(Executor executor, e eVar) {
        this.f14717a = executor;
        this.f14719c = eVar;
    }

    @Override // t4.f0
    public final void d(i iVar) {
        if (iVar.p() || iVar.n()) {
            return;
        }
        synchronized (this.f14718b) {
            if (this.f14719c == null) {
                return;
            }
            this.f14717a.execute(new z(this, iVar));
        }
    }
}
