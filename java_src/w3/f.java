package w3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import z3.l1;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16080a = i.f16085a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f16081b = new f();

    public static f f() {
        return f16081b;
    }

    public int a(Context context) {
        return i.a(context);
    }

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return l1.c("com.google.android.gms");
        } else if (context == null || !d4.i.d(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f16080a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(f4.c.a(context).e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return l1.b("com.google.android.gms", sb.toString());
        } else {
            return l1.a();
        }
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent b10 = b(context, i10, str);
        if (b10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, b10, l4.d.f11120a | 134217728);
    }

    public String e(int i10) {
        return i.b(i10);
    }

    public int g(Context context) {
        return h(context, f16080a);
    }

    public int h(Context context, int i10) {
        int e10 = i.e(context, i10);
        if (i.f(context, e10)) {
            return 18;
        }
        return e10;
    }

    public boolean i(Context context, String str) {
        return i.j(context, str);
    }

    public boolean j(int i10) {
        return i.h(i10);
    }
}
