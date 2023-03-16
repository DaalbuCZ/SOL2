package f4;

import android.content.Context;
import d4.l;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f7228a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f7229b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f7228a;
            if (context2 != null && (bool2 = f7229b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f7229b = null;
            if (!l.h()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f7229b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f7228a = applicationContext;
                return f7229b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f7229b = bool;
            f7228a = applicationContext;
            return f7229b.booleanValue();
        }
    }
}
