package z3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f17370f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f17371a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17372b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f17373c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17374d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f17375e;

    public f1(String str, String str2, int i10, boolean z10) {
        o.e(str);
        this.f17371a = str;
        o.e(str2);
        this.f17372b = str2;
        this.f17373c = null;
        this.f17374d = i10;
        this.f17375e = z10;
    }

    public final int a() {
        return this.f17374d;
    }

    public final ComponentName b() {
        return this.f17373c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f17371a != null) {
            if (this.f17375e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f17371a);
                try {
                    bundle = context.getContentResolver().call(f17370f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f17371a)));
                }
            }
            return r2 != null ? r2 : new Intent(this.f17371a).setPackage(this.f17372b);
        }
        return new Intent().setComponent(this.f17373c);
    }

    public final String d() {
        return this.f17372b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            return n.a(this.f17371a, f1Var.f17371a) && n.a(this.f17372b, f1Var.f17372b) && n.a(this.f17373c, f1Var.f17373c) && this.f17374d == f1Var.f17374d && this.f17375e == f1Var.f17375e;
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f17371a, this.f17372b, this.f17373c, Integer.valueOf(this.f17374d), Boolean.valueOf(this.f17375e));
    }

    public final String toString() {
        String str = this.f17371a;
        if (str == null) {
            o.i(this.f17373c);
            return this.f17373c.flattenToString();
        }
        return str;
    }
}
