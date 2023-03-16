package p0;

import android.content.Context;
import android.os.Build;
import k0.k;
import s0.p;
/* loaded from: classes.dex */
public class g extends c<o0.b> {
    public g(Context context, u0.a aVar) {
        super(q0.g.c(context, aVar).d());
    }

    @Override // p0.c
    boolean b(p pVar) {
        return pVar.f13240j.b() == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f13240j.b() == k.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p0.c
    /* renamed from: i */
    public boolean c(o0.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
