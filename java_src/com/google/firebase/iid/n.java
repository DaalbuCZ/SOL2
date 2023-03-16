package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5366a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private String f5367b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private String f5368c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private int f5369d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    private int f5370e = 0;

    public n(Context context) {
        this.f5366a = context;
    }

    public static String c(f5.e eVar) {
        String f10 = eVar.q().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = eVar.q().c();
        if (c10.startsWith("1:")) {
            String[] split = c10.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c10;
    }

    private PackageInfo f(String str) {
        try {
            return this.f5366a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f5366a.getPackageName());
        if (f10 != null) {
            this.f5367b = Integer.toString(f10.versionCode);
            this.f5368c = f10.versionName;
        }
    }

    public synchronized String a() {
        if (this.f5367b == null) {
            h();
        }
        return this.f5367b;
    }

    public synchronized String b() {
        if (this.f5368c == null) {
            h();
        }
        return this.f5368c;
    }

    public synchronized int d() {
        PackageInfo f10;
        if (this.f5369d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f5369d = f10.versionCode;
        }
        return this.f5369d;
    }

    public synchronized int e() {
        int i10 = this.f5370e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f5366a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!d4.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f5370e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f5370e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (d4.l.h()) {
            this.f5370e = 2;
            i11 = 2;
        } else {
            this.f5370e = 1;
        }
        return i11;
    }

    public boolean g() {
        return e() != 0;
    }
}
