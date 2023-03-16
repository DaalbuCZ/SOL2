package x9;

import android.os.Build;
import c8.a;
import l8.j;
import l8.k;
/* loaded from: classes.dex */
public class a implements c8.a, k.c {

    /* renamed from: n  reason: collision with root package name */
    private k f16406n;

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "flutter_native_splash");
        this.f16406n = kVar;
        kVar.e(this);
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f16406n.e(null);
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if (!jVar.f11211a.equals("getPlatformVersion")) {
            dVar.c();
            return;
        }
        dVar.a("Android " + Build.VERSION.RELEASE);
    }
}
