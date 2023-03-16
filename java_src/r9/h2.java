package r9;
/* loaded from: classes.dex */
public final class h2 extends d0 {

    /* renamed from: p  reason: collision with root package name */
    public static final h2 f13121p = new h2();

    private h2() {
    }

    @Override // r9.d0
    public boolean W(b9.g gVar) {
        return false;
    }

    @Override // r9.d0
    public void b(b9.g gVar, Runnable runnable) {
        k2 k2Var = (k2) gVar.c(k2.f13127p);
        if (k2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        k2Var.f13128o = true;
    }

    @Override // r9.d0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
