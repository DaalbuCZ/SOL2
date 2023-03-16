package p8;

import android.content.Context;
import android.util.Log;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f12468a;

    public static Context a() {
        return f12468a;
    }

    public static void b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        f12468a = context;
    }
}
