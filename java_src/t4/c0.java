package t4;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14722a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14723b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private f f14724c;

    public c0(Executor executor, f fVar) {
        this.f14722a = executor;
        this.f14724c = fVar;
    }

    @Override // t4.f0
    public final void d(i iVar) {
        if (iVar.p()) {
            synchronized (this.f14723b) {
                if (this.f14724c == null) {
                    return;
                }
                this.f14722a.execute(new b0(this, iVar));
            }
        }
    }
}
