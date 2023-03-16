package o6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import f5.b;
import f6.c;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12153a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f12154b;

    /* renamed from: c  reason: collision with root package name */
    private final c f12155c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12156d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f12153a = a10;
        this.f12154b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f12155c = cVar;
        this.f12156d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f12154b.contains("firebase_data_collection_default_enabled") ? this.f12154b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f12153a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f12153a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f12156d != z10) {
            this.f12156d = z10;
            this.f12155c.a(new f6.a<>(b.class, new b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f12156d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f12154b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f12154b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}
