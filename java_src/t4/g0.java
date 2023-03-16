package t4;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14730a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b  reason: collision with root package name */
    private Queue f14731b;
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f14732c;

    public final void a(f0 f0Var) {
        synchronized (this.f14730a) {
            if (this.f14731b == null) {
                this.f14731b = new ArrayDeque();
            }
            this.f14731b.add(f0Var);
        }
    }

    public final void b(i iVar) {
        f0 f0Var;
        synchronized (this.f14730a) {
            if (this.f14731b != null && !this.f14732c) {
                this.f14732c = true;
                while (true) {
                    synchronized (this.f14730a) {
                        f0Var = (f0) this.f14731b.poll();
                        if (f0Var == null) {
                            this.f14732c = false;
                            return;
                        }
                    }
                    f0Var.d(iVar);
                }
            }
        }
    }
}
