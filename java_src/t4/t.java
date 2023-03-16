package t4;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i f14760n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ u f14761o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(u uVar, i iVar) {
        this.f14761o = uVar;
        this.f14760n = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var;
        j0 j0Var2;
        j0 j0Var3;
        a aVar;
        try {
            aVar = this.f14761o.f14763b;
            i iVar = (i) aVar.a(this.f14760n);
            if (iVar == null) {
                this.f14761o.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f14742b;
            iVar.f(executor, this.f14761o);
            iVar.d(executor, this.f14761o);
            iVar.a(executor, this.f14761o);
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                j0Var3 = this.f14761o.f14764c;
                j0Var3.s((Exception) e10.getCause());
                return;
            }
            j0Var2 = this.f14761o.f14764c;
            j0Var2.s(e10);
        } catch (Exception e11) {
            j0Var = this.f14761o.f14764c;
            j0Var.s(e11);
        }
    }
}
