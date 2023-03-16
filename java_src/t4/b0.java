package t4;
/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i f14720n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ c0 f14721o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(c0 c0Var, i iVar) {
        this.f14721o = c0Var;
        this.f14720n = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f14721o.f14723b;
        synchronized (obj) {
            c0 c0Var = this.f14721o;
            fVar = c0Var.f14724c;
            if (fVar != null) {
                fVar2 = c0Var.f14724c;
                fVar2.b(this.f14720n.l());
            }
        }
    }
}
