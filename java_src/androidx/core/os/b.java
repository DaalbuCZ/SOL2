package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static e a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? e.d(a.a(configuration)) : e.a(configuration.locale);
    }
}
