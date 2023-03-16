package w3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class j {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private static j f16090c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16091a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f16092b;

    public j(Context context) {
        this.f16091a = context.getApplicationContext();
    }

    public static j a(Context context) {
        z3.o.i(context);
        synchronized (j.class) {
            if (f16090c == null) {
                z.d(context);
                f16090c = new j(context);
            }
        }
        return f16090c;
    }

    @Nullable
    static final v d(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            if (vVarArr[i10].equals(wVar)) {
                return vVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? d(packageInfo, y.f16110a) : d(packageInfo, y.f16110a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final j0 f(String str, boolean z10, boolean z11) {
        j0 j0Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return j0.c("null pkg");
        }
        if (str.equals(this.f16092b)) {
            return j0.b();
        }
        if (z.e()) {
            j0Var = z.b(str, i.d(this.f16091a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f16091a.getPackageManager().getPackageInfo(str, 64);
                boolean d10 = i.d(this.f16091a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        w wVar = new w(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        j0 a10 = z.a(str3, wVar, d10, false);
                        if (!a10.f16094a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !z.a(str3, wVar, false, true).f16094a) {
                            j0Var = a10;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                j0Var = j0.c(str2);
            } catch (PackageManager.NameNotFoundException e10) {
                return j0.d("no pkg ".concat(str), e10);
            }
        }
        if (j0Var.f16094a) {
            this.f16092b = str;
        }
        return j0Var;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (i.d(this.f16091a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        j0 c10;
        int length;
        String[] packagesForUid = this.f16091a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c10 = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z3.o.i(c10);
                    break;
                }
                c10 = f(packagesForUid[i11], false, false);
                if (c10.f16094a) {
                    break;
                }
                i11++;
            }
        } else {
            c10 = j0.c("no pkgs");
        }
        c10.e();
        return c10.f16094a;
    }
}
