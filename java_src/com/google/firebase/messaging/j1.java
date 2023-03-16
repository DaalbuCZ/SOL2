package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.j1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class j1 implements ServiceConnection {

    /* renamed from: n  reason: collision with root package name */
    private final Context f5557n;

    /* renamed from: o  reason: collision with root package name */
    private final Intent f5558o;

    /* renamed from: p  reason: collision with root package name */
    private final ScheduledExecutorService f5559p;

    /* renamed from: q  reason: collision with root package name */
    private final Queue<a> f5560q;

    /* renamed from: r  reason: collision with root package name */
    private g1 f5561r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f5562s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f5563a;

        /* renamed from: b  reason: collision with root package name */
        private final t4.j<Void> f5564b = new t4.j<>();

        a(Intent intent) {
            this.f5563a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f5563a.getAction() + " Releasing WakeLock.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.h1
                @Override // java.lang.Runnable
                public final void run() {
                    j1.a.this.f();
                }
            }, (this.f5563a.getFlags() & 268435456) != 0 ? e1.f5525a : 9000L, TimeUnit.MILLISECONDS);
            e().b(scheduledExecutorService, new t4.d() { // from class: com.google.firebase.messaging.i1
                @Override // t4.d
                public final void a(t4.i iVar) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f5564b.e(null);
        }

        t4.i<Void> e() {
            return this.f5564b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public j1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new e4.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    j1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f5560q = new ArrayDeque();
        this.f5562s = false;
        Context applicationContext = context.getApplicationContext();
        this.f5557n = applicationContext;
        this.f5558o = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f5559p = scheduledExecutorService;
    }

    private void a() {
        while (!this.f5560q.isEmpty()) {
            this.f5560q.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f5560q.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            g1 g1Var = this.f5561r;
            if (g1Var == null || !g1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f5561r.c(this.f5560q.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f5562s);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f5562s) {
            return;
        }
        this.f5562s = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (c4.a.b().a(this.f5557n, this.f5558o, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f5562s = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized t4.i<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f5559p);
        this.f5560q.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f5562s = false;
        if (iBinder instanceof g1) {
            this.f5561r = (g1) iBinder;
            b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
