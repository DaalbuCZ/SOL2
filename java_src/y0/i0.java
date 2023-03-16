package y0;

import android.util.Log;
/* loaded from: classes.dex */
public class i0 {
    public static void a(String str, String str2) {
        Log.d("BF/" + str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        Log.e("BF/" + str, str2, th);
    }

    public static void c(Throwable th) {
        Log.e("BF/Exception", Log.getStackTraceString(th));
    }

    public static void d(String str, String str2) {
        Log.e("BF/" + str, str2);
    }

    public static void e(String str, String str2) {
        Log.i("BF/" + str, str2);
    }

    public static void f(String str, String str2) {
        Log.w("BF/" + str, str2);
    }
}
