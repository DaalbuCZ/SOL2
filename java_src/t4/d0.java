package t4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class d0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i f14725n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ e0 f14726o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(e0 e0Var, i iVar) {
        this.f14726o = e0Var;
        this.f14725n = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        try {
            hVar = this.f14726o.f14728b;
            i a10 = hVar.a(this.f14725n.l());
            if (a10 == null) {
                this.f14726o.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f14742b;
            a10.f(executor, this.f14726o);
            a10.d(executor, this.f14726o);
            a10.a(executor, this.f14726o);
        } catch (CancellationException unused) {
            this.f14726o.a();
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                this.f14726o.c((Exception) e10.getCause());
            } else {
                this.f14726o.c(e10);
            }
        } catch (Exception e11) {
            this.f14726o.c(e11);
        }
    }
}
