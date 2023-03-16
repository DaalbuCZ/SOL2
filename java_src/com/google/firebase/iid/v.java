package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final long f5388n;

    /* renamed from: o  reason: collision with root package name */
    private final PowerManager.WakeLock f5389o;

    /* renamed from: p  reason: collision with root package name */
    private final FirebaseInstanceId f5390p;

    /* renamed from: q  reason: collision with root package name */
    ExecutorService f5391q = b.b();

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private v f5392a;

        public a(v vVar) {
            this.f5392a = vVar;
        }

        public void a() {
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f5392a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            v vVar = this.f5392a;
            if (vVar != null && vVar.c()) {
                if (FirebaseInstanceId.r()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f5392a.f5390p.g(this.f5392a, 0L);
                this.f5392a.b().unregisterReceiver(this);
                this.f5392a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f5390p = firebaseInstanceId;
        this.f5388n = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f5389o = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    Context b() {
        return this.f5390p.h().l();
    }

    boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean d() {
        String str;
        if (this.f5390p.F(this.f5390p.p())) {
            try {
                if (this.f5390p.d() == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Token successfully retrieved");
                }
                return true;
            } catch (IOException e10) {
                if (k.g(e10.getMessage())) {
                    String message = e10.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                    sb.append("Token retrieval failed: ");
                    sb.append(message);
                    sb.append(". Will retry token retrieval");
                    str = sb.toString();
                } else if (e10.getMessage() != null) {
                    throw e10;
                } else {
                    str = "Token retrieval failed without exception message. Will retry token retrieval";
                }
                Log.w("FirebaseInstanceId", str);
                return false;
            } catch (SecurityException unused) {
                str = "Token retrieval failed with SecurityException. Will retry token retrieval";
                Log.w("FirebaseInstanceId", str);
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (t.a().c(b())) {
            this.f5389o.acquire();
        }
        try {
            try {
                this.f5390p.C(true);
                if (!this.f5390p.s()) {
                    this.f5390p.C(false);
                    if (!t.a().c(b())) {
                        return;
                    }
                } else if (!t.a().b(b()) || c()) {
                    if (d()) {
                        this.f5390p.C(false);
                    } else {
                        this.f5390p.E(this.f5388n);
                    }
                    if (!t.a().c(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!t.a().c(b())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f5390p.C(false);
                if (!t.a().c(b())) {
                    return;
                }
            }
            this.f5389o.release();
        } catch (Throwable th) {
            if (t.a().c(b())) {
                this.f5389o.release();
            }
            throw th;
        }
    }
}
