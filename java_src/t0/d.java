package t0;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14434a = k0.j.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            k0.j c10 = k0.j.c();
            String str = f14434a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : "disabled";
            c10.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            k0.j c11 = k0.j.c();
            String str2 = f14434a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z10 ? "enabled" : "disabled";
            c11.a(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
