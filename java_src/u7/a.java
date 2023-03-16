package u7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import c8.a;
import java.util.Objects;
import l8.c;
import l8.k;
/* loaded from: classes.dex */
public final class a implements c8.a {

    /* renamed from: n  reason: collision with root package name */
    private k f15469n;

    private final void a(c cVar, Context context) {
        this.f15469n = new k(cVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        k9.k.d(packageManager, "context.packageManager");
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        b bVar = new b(packageManager, (WindowManager) systemService);
        k kVar = this.f15469n;
        if (kVar == null) {
            k9.k.o("methodChannel");
            kVar = null;
        }
        kVar.e(bVar);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        c b10 = bVar.b();
        k9.k.d(b10, "binding.binaryMessenger");
        Context a10 = bVar.a();
        k9.k.d(a10, "binding.applicationContext");
        a(b10, a10);
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        k kVar = this.f15469n;
        if (kVar == null) {
            k9.k.o("methodChannel");
            kVar = null;
        }
        kVar.e(null);
    }
}
