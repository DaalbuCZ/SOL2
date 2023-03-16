package t4;
/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ w f14765n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(w wVar) {
        this.f14765n = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f14765n.f14767b;
        synchronized (obj) {
            w wVar = this.f14765n;
            cVar = wVar.f14768c;
            if (cVar != null) {
                cVar2 = wVar.f14768c;
                cVar2.a();
            }
        }
    }
}
