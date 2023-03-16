package t4;
/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i f14774n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ a0 f14775o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(a0 a0Var, i iVar) {
        this.f14775o = a0Var;
        this.f14774n = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f14775o.f14718b;
        synchronized (obj) {
            a0 a0Var = this.f14775o;
            eVar = a0Var.f14719c;
            if (eVar != null) {
                eVar2 = a0Var.f14719c;
                eVar2.c((Exception) z3.o.i(this.f14774n.k()));
            }
        }
    }
}
