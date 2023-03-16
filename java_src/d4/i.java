package d4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f6556a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f6557b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f6558c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f6559d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6559d == null) {
            boolean z10 = false;
            if (l.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f6559d = Boolean.valueOf(z10);
        }
        return f6559d.booleanValue();
    }

    public static boolean b() {
        int i10 = w3.i.f16085a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f6556a == null) {
            boolean z10 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f6556a = Boolean.valueOf(z10);
        }
        return f6556a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!c(context) || l.g()) {
            if (e(context)) {
                return !l.h() || l.k();
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean e(Context context) {
        if (f6557b == null) {
            boolean z10 = false;
            if (l.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f6557b = Boolean.valueOf(z10);
        }
        return f6557b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f6558c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f6558c = Boolean.valueOf(z10);
        }
        return f6558c.booleanValue();
    }
}
