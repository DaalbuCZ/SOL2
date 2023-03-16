package q5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f12862a;

    /* renamed from: b  reason: collision with root package name */
    private final f5.e f12863b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f12864c;

    /* renamed from: d  reason: collision with root package name */
    t4.j<Void> f12865d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12866e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12867f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f12868g;

    /* renamed from: h  reason: collision with root package name */
    private final t4.j<Void> f12869h;

    public s(f5.e eVar) {
        Object obj = new Object();
        this.f12864c = obj;
        this.f12865d = new t4.j<>();
        this.f12866e = false;
        this.f12867f = false;
        this.f12869h = new t4.j<>();
        Context l10 = eVar.l();
        this.f12863b = eVar;
        this.f12862a = h.s(l10);
        Boolean b10 = b();
        this.f12868g = b10 == null ? a(l10) : b10;
        synchronized (obj) {
            if (d()) {
                this.f12865d.e(null);
                this.f12866e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f10 = f(context);
        if (f10 == null) {
            this.f12867f = false;
            return null;
        }
        this.f12867f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f10));
    }

    private Boolean b() {
        if (this.f12862a.contains("firebase_crashlytics_collection_enabled")) {
            this.f12867f = false;
            return Boolean.valueOf(this.f12862a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private void e(boolean z10) {
        n5.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f12868g == null ? "global Firebase setting" : this.f12867f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            n5.f.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f12869h.e(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        Boolean bool = this.f12868g;
        booleanValue = bool != null ? bool.booleanValue() : this.f12863b.w();
        e(booleanValue);
        return booleanValue;
    }

    public synchronized void g(Boolean bool) {
        if (bool != null) {
            try {
                this.f12867f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12868g = bool != null ? bool : a(this.f12863b.l());
        h(this.f12862a, bool);
        synchronized (this.f12864c) {
            if (d()) {
                if (!this.f12866e) {
                    this.f12865d.e(null);
                    this.f12866e = true;
                }
            } else if (this.f12866e) {
                this.f12865d = new t4.j<>();
                this.f12866e = false;
            }
        }
    }

    public t4.i<Void> i() {
        t4.i<Void> a10;
        synchronized (this.f12864c) {
            a10 = this.f12865d.a();
        }
        return a10;
    }

    public t4.i<Void> j(Executor executor) {
        return j0.j(executor, this.f12869h.a(), i());
    }
}
