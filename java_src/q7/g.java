package q7;

import c8.a;
import k9.k;
import q7.a;
/* loaded from: classes.dex */
public final class g implements c8.a, a.c, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private f f12907n;

    @Override // q7.a.c
    public void a(a.b bVar) {
        f fVar = this.f12907n;
        k.b(fVar);
        k.b(bVar);
        fVar.d(bVar);
    }

    @Override // q7.a.c
    public a.C0186a isEnabled() {
        f fVar = this.f12907n;
        k.b(fVar);
        return fVar.b();
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        k.e(cVar, "binding");
        f fVar = this.f12907n;
        if (fVar == null) {
            return;
        }
        fVar.c(cVar.e());
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k.e(bVar, "flutterPluginBinding");
        d.f(bVar.b(), this);
        this.f12907n = new f();
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        f fVar = this.f12907n;
        if (fVar == null) {
            return;
        }
        fVar.c(null);
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k.e(bVar, "binding");
        d.f(bVar.b(), null);
        this.f12907n = null;
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        k.e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
