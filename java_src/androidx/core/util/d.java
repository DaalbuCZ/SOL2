package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? a.a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? a.b(objArr) : Arrays.hashCode(objArr);
    }

    public static <T> T c(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T d(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
