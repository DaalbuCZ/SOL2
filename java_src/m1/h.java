package m1;

import android.content.Context;
import android.os.Build;
import n1.y;
/* loaded from: classes.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static y a(Context context, o1.d dVar, n1.g gVar, q1.a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new n1.e(context, dVar, gVar) : new n1.a(context, dVar, aVar, gVar);
    }
}
