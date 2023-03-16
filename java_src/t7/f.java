package t7;

import android.content.Context;
import android.net.ConnectivityManager;
import c8.a;
import l8.k;
/* loaded from: classes.dex */
public class f implements c8.a {

    /* renamed from: n  reason: collision with root package name */
    private k f14806n;

    /* renamed from: o  reason: collision with root package name */
    private l8.d f14807o;

    /* renamed from: p  reason: collision with root package name */
    private d f14808p;

    private void a(l8.c cVar, Context context) {
        this.f14806n = new k(cVar, "dev.fluttercommunity.plus/connectivity");
        this.f14807o = new l8.d(cVar, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f14808p = new d(context, aVar);
        this.f14806n.e(eVar);
        this.f14807o.d(this.f14808p);
    }

    private void b() {
        this.f14806n.e(null);
        this.f14807o.d(null);
        this.f14808p.b(null);
        this.f14806n = null;
        this.f14807o = null;
        this.f14808p = null;
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
