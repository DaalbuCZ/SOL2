package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c1 implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    private static final Object f5502s = new Object();

    /* renamed from: t  reason: collision with root package name */
    private static Boolean f5503t;

    /* renamed from: u  reason: collision with root package name */
    private static Boolean f5504u;

    /* renamed from: n  reason: collision with root package name */
    private final Context f5505n;

    /* renamed from: o  reason: collision with root package name */
    private final i0 f5506o;

    /* renamed from: p  reason: collision with root package name */
    private final PowerManager.WakeLock f5507p;

    /* renamed from: q  reason: collision with root package name */
    private final b1 f5508q;

    /* renamed from: r  reason: collision with root package name */
    private final long f5509r;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private c1 f5510a;

        public a(c1 c1Var) {
            this.f5510a = c1Var;
        }

        public void a() {
            if (c1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            c1.this.f5505n.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            c1 c1Var = this.f5510a;
            if (c1Var == null) {
                return;
            }
            if (c1Var.i()) {
                if (c1.j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f5510a.f5508q.m(this.f5510a, 0L);
                context.unregisterReceiver(this);
                this.f5510a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(b1 b1Var, Context context, i0 i0Var, long j10) {
        this.f5508q = b1Var;
        this.f5505n = context;
        this.f5509r = j10;
        this.f5506o = i0Var;
        this.f5507p = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f5502s) {
            Boolean bool = f5504u;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f5504u = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f5502s) {
            Boolean bool = f5503t;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f5503t = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5505n.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f5505n)) {
            this.f5507p.acquire(d.f5512a);
        }
        try {
            try {
                try {
                    this.f5508q.o(true);
                } catch (Throwable th) {
                    if (h(this.f5505n)) {
                        try {
                            this.f5507p.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f5508q.o(false);
                if (!h(this.f5505n)) {
                    return;
                }
                wakeLock = this.f5507p;
            }
            if (!this.f5506o.g()) {
                this.f5508q.o(false);
                if (h(this.f5505n)) {
                    try {
                        this.f5507p.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (f(this.f5505n) && !i()) {
                new a(this).a();
                if (h(this.f5505n)) {
                    try {
                        this.f5507p.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                if (this.f5508q.s()) {
                    this.f5508q.o(false);
                } else {
                    this.f5508q.t(this.f5509r);
                }
                if (h(this.f5505n)) {
                    wakeLock = this.f5507p;
                    wakeLock.release();
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
