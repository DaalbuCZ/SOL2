package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1526a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f1527b;

    /* loaded from: classes.dex */
    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0029b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            if (i10 < 24) {
                try {
                    f1527b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f1526a = cls.getMethod("getScript", String.class);
            f1527b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e11) {
            f1526a = null;
            f1527b = null;
            Log.w("ICUCompat", e11);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f1527b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            Log.w("ICUCompat", e10);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static String b(String str) {
        try {
            Method method = f1526a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            Log.w("ICUCompat", e10);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return C0029b.c(C0029b.a(C0029b.b(locale)));
        }
        if (i10 >= 21) {
            try {
                return a.a((Locale) f1527b.invoke(null, locale));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.w("ICUCompat", e10);
                return a.a(locale);
            }
        }
        String a10 = a(locale);
        if (a10 != null) {
            return b(a10);
        }
        return null;
    }
}
