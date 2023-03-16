package t4;
/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i f14755n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ s f14756o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, i iVar) {
        this.f14756o = sVar;
        this.f14755n = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var;
        j0 j0Var2;
        j0 j0Var3;
        a aVar;
        j0 j0Var4;
        j0 j0Var5;
        if (this.f14755n.n()) {
            j0Var5 = this.f14756o.f14759c;
            j0Var5.u();
            return;
        }
        try {
            aVar = this.f14756o.f14758b;
            Object a10 = aVar.a(this.f14755n);
            j0Var4 = this.f14756o.f14759c;
            j0Var4.t(a10);
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                j0Var3 = this.f14756o.f14759c;
                j0Var3.s((Exception) e10.getCause());
                return;
            }
            j0Var2 = this.f14756o.f14759c;
            j0Var2.s(e10);
        } catch (Exception e11) {
            j0Var = this.f14756o.f14759c;
            j0Var.s(e11);
        }
    }
}
