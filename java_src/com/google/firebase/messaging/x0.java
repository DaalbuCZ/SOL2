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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x0 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final long f5644n;

    /* renamed from: o  reason: collision with root package name */
    private final PowerManager.WakeLock f5645o;

    /* renamed from: p  reason: collision with root package name */
    private final FirebaseMessaging f5646p;
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: q  reason: collision with root package name */
    ExecutorService f5647q = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e4.a("firebase-iid-executor"));

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private x0 f5648a;

        public a(x0 x0Var) {
            this.f5648a = x0Var;
        }

        public void a() {
            if (x0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f5648a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            x0 x0Var = this.f5648a;
            if (x0Var != null && x0Var.d()) {
                if (x0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f5648a.f5646p.p(this.f5648a, 0L);
                this.f5648a.b().unregisterReceiver(this);
                this.f5648a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public x0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f5646p = firebaseMessaging;
        this.f5644n = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f5645o = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f5646p.q();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() {
        String str;
        try {
            if (this.f5646p.n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e10) {
            if (d0.h(e10.getMessage())) {
                str = "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval";
            } else if (e10.getMessage() != null) {
                throw e10;
            } else {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (t0.b().e(b())) {
            this.f5645o.acquire();
        }
        try {
            try {
                this.f5646p.O(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f5646p.O(false);
                if (!t0.b().e(b())) {
                    return;
                }
            }
            if (!this.f5646p.z()) {
                this.f5646p.O(false);
                if (t0.b().e(b())) {
                    this.f5645o.release();
                }
            } else if (t0.b().d(b()) && !d()) {
                new a(this).a();
                if (t0.b().e(b())) {
                    this.f5645o.release();
                }
            } else {
                if (e()) {
                    this.f5646p.O(false);
                } else {
                    this.f5646p.S(this.f5644n);
                }
                if (!t0.b().e(b())) {
                    return;
                }
                this.f5645o.release();
            }
        } catch (Throwable th) {
            if (t0.b().e(b())) {
                this.f5645o.release();
            }
            throw th;
        }
    }
}
