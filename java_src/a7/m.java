package a7;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f259a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        u6.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f259a == null) {
            f259a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f259a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
