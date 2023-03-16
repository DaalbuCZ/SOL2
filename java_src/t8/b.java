package t8;

import android.content.Context;
import c8.a;
import l8.c;
import l8.k;
/* loaded from: classes.dex */
public class b implements c8.a {

    /* renamed from: n  reason: collision with root package name */
    private k f14817n;

    /* renamed from: o  reason: collision with root package name */
    private a f14818o;

    private void a(c cVar, Context context) {
        this.f14817n = new k(cVar, "plugins.flutter.io/shared_preferences_android");
        a aVar = new a(context);
        this.f14818o = aVar;
        this.f14817n.e(aVar);
    }

    private void b() {
        this.f14818o.f();
        this.f14818o = null;
        this.f14817n.e(null);
        this.f14817n = null;
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
