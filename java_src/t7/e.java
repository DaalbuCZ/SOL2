package t7;

import l8.j;
import l8.k;
/* loaded from: classes.dex */
class e implements k.c {

    /* renamed from: n  reason: collision with root package name */
    private final a f14805n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(a aVar) {
        this.f14805n = aVar;
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if ("check".equals(jVar.f11211a)) {
            dVar.a(this.f14805n.b());
        } else {
            dVar.c();
        }
    }
}
