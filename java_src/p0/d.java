package p0;

import android.content.Context;
import android.os.Build;
import k0.k;
import s0.p;
/* loaded from: classes.dex */
public class d extends c<o0.b> {
    public d(Context context, u0.a aVar) {
        super(q0.g.c(context, aVar).d());
    }

    @Override // p0.c
    boolean b(p pVar) {
        return pVar.f13240j.b() == k.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p0.c
    /* renamed from: i */
    public boolean c(o0.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}
