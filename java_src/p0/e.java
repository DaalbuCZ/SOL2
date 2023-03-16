package p0;

import android.content.Context;
import android.os.Build;
import k0.j;
import k0.k;
import s0.p;
/* loaded from: classes.dex */
public class e extends c<o0.b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f12196e = j.f("NetworkMeteredCtrlr");

    public e(Context context, u0.a aVar) {
        super(q0.g.c(context, aVar).d());
    }

    @Override // p0.c
    boolean b(p pVar) {
        return pVar.f13240j.b() == k.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p0.c
    /* renamed from: i */
    public boolean c(o0.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        j.c().a(f12196e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
