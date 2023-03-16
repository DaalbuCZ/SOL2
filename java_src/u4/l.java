package u4;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final w f15428a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15429b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15430c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f15431d = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(w wVar, i iVar, Context context) {
        this.f15428a = wVar;
        this.f15429b = iVar;
        this.f15430c = context;
    }

    @Override // u4.b
    public final boolean a(a aVar, int i10, Activity activity, int i11) {
        d c10 = d.c(i10);
        if (activity == null) {
            return false;
        }
        return e(aVar, new k(this, activity), c10, i11);
    }

    @Override // u4.b
    public final t4.i<Void> b() {
        return this.f15428a.d(this.f15430c.getPackageName());
    }

    @Override // u4.b
    public final t4.i<a> c() {
        return this.f15428a.e(this.f15430c.getPackageName());
    }

    @Override // u4.b
    public final synchronized void d(x4.b bVar) {
        this.f15429b.b(bVar);
    }

    public final boolean e(a aVar, w4.a aVar2, d dVar, int i10) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.e(dVar) || aVar.l()) {
            return false;
        }
        aVar.k();
        aVar2.a(aVar.i(dVar).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }
}
