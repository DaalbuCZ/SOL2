package z3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f17440a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b  reason: collision with root package name */
    private static boolean f17441b;

    /* renamed from: c  reason: collision with root package name */
    private static String f17442c;

    /* renamed from: d  reason: collision with root package name */
    private static int f17443d;

    public static int a(Context context) {
        b(context);
        return f17443d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f17440a) {
            if (f17441b) {
                return;
            }
            f17441b = true;
            try {
                bundle = f4.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f17442c = bundle.getString("com.google.app.id");
            f17443d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
