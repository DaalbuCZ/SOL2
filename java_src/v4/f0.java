package v4;

import android.content.Context;
/* loaded from: classes.dex */
public final class f0 {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
