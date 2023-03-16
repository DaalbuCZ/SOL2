package t4;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ j0 f14743n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ Callable f14744o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(j0 j0Var, Callable callable) {
        this.f14743n = j0Var;
        this.f14744o = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14743n.t(this.f14744o.call());
        } catch (Exception e10) {
            this.f14743n.s(e10);
        } catch (Throwable th) {
            this.f14743n.s(new RuntimeException(th));
        }
    }
}
