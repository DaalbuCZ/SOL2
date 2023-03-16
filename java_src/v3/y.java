package v3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15638a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private int f15639b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private int f15640c = 0;

    public y(Context context) {
        this.f15638a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f15639b == 0) {
            try {
                packageInfo = f4.c.a(this.f15638a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f15639b = packageInfo.versionCode;
            }
        }
        return this.f15639b;
    }

    public final synchronized int b() {
        int i10 = this.f15640c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f15638a.getPackageManager();
        if (f4.c.a(this.f15638a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!d4.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f15640c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f15640c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (d4.l.h()) {
            this.f15640c = 2;
            i11 = 2;
        } else {
            this.f15640c = 1;
        }
        return i11;
    }
}