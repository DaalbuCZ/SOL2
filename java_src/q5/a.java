package q5;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12716a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12717b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f12718c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12719d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12720e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12721f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12722g;

    /* renamed from: h  reason: collision with root package name */
    public final n5.e f12723h;

    public a(String str, String str2, List<e> list, String str3, String str4, String str5, String str6, n5.e eVar) {
        this.f12716a = str;
        this.f12717b = str2;
        this.f12718c = list;
        this.f12719d = str3;
        this.f12720e = str4;
        this.f12721f = str5;
        this.f12722g = str6;
        this.f12723h = eVar;
    }

    public static a a(Context context, w wVar, String str, String str2, List<e> list, n5.e eVar) {
        String packageName = context.getPackageName();
        String g10 = wVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, g10, packageName, num, str3, eVar);
    }
}
