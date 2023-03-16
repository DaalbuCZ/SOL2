package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5548a;

    /* renamed from: b  reason: collision with root package name */
    private String f5549b;

    /* renamed from: c  reason: collision with root package name */
    private String f5550c;

    /* renamed from: d  reason: collision with root package name */
    private int f5551d;

    /* renamed from: e  reason: collision with root package name */
    private int f5552e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Context context) {
        this.f5548a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
            return this.f5548a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f5548a.getPackageName());
        if (f10 != null) {
            this.f5549b = Integer.toString(f10.versionCode);
            this.f5550c = f10.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f5549b == null) {
            h();
        }
        return this.f5549b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f5550c == null) {
            h();
        }
        return this.f5550c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        if (this.f5551d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f5551d = f10.versionCode;
        }
        return this.f5551d;
    }

    synchronized int e() {
        int i10 = this.f5552e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f5548a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!d4.l.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f5552e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f5552e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (d4.l.h()) {
            this.f5552e = 2;
        } else {
            this.f5552e = 1;
        }
        return this.f5552e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
