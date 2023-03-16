package u8;

import android.util.Log;
import c8.a;
/* loaded from: classes.dex */
public final class c implements c8.a, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private a f15480n;

    /* renamed from: o  reason: collision with root package name */
    private b f15481o;

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        if (this.f15480n == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f15481o.d(cVar.e());
        }
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        b bVar2 = new b(bVar.a(), null);
        this.f15481o = bVar2;
        a aVar = new a(bVar2);
        this.f15480n = aVar;
        aVar.e(bVar.b());
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        if (this.f15480n == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f15481o.d(null);
        }
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        a aVar = this.f15480n;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.f();
        this.f15480n = null;
        this.f15481o = null;
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        onAttachedToActivity(cVar);
    }
}
