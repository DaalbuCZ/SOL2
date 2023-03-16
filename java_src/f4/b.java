package f4;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import d4.l;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f7230a;

    public b(Context context) {
        this.f7230a = context;
    }

    public int a(String str) {
        return this.f7230a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f7230a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i10) {
        return this.f7230a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence d(String str) {
        return this.f7230a.getPackageManager().getApplicationLabel(this.f7230a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i10) {
        return this.f7230a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f7230a);
        }
        if (!l.h() || (nameForUid = this.f7230a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f7230a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean g(int i10, String str) {
        if (l.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f7230a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f7230a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
