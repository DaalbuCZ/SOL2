package t4;
/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i f14769n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ y f14770o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(y yVar, i iVar) {
        this.f14770o = yVar;
        this.f14769n = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f14770o.f14772b;
        synchronized (obj) {
            y yVar = this.f14770o;
            dVar = yVar.f14773c;
            if (dVar != null) {
                dVar2 = yVar.f14773c;
                dVar2.a(this.f14769n);
            }
        }
    }
}
