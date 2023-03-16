package u4;

import android.content.Context;
import v4.f0;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static e f15425a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized e a(Context context) {
        e eVar;
        synchronized (h.class) {
            if (f15425a == null) {
                g gVar = new g(null);
                gVar.b(new n(f0.a(context)));
                f15425a = gVar.a();
            }
            eVar = f15425a;
        }
        return eVar;
    }
}
