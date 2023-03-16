package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.l;
import androidx.work.impl.foreground.a;
import k0.j;
/* loaded from: classes.dex */
public class SystemForegroundService extends l implements a.b {

    /* renamed from: s  reason: collision with root package name */
    private static final String f2635s = j.f("SystemFgService");

    /* renamed from: t  reason: collision with root package name */
    private static SystemForegroundService f2636t = null;

    /* renamed from: o  reason: collision with root package name */
    private Handler f2637o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2638p;

    /* renamed from: q  reason: collision with root package name */
    androidx.work.impl.foreground.a f2639q;

    /* renamed from: r  reason: collision with root package name */
    NotificationManager f2640r;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f2641n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Notification f2642o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f2643p;

        a(int i10, Notification notification, int i11) {
            this.f2641n = i10;
            this.f2642o = notification;
            this.f2643p = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f2641n, this.f2642o, this.f2643p);
            } else {
                SystemForegroundService.this.startForeground(this.f2641n, this.f2642o);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f2645n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Notification f2646o;

        b(int i10, Notification notification) {
            this.f2645n = i10;
            this.f2646o = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f2640r.notify(this.f2645n, this.f2646o);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f2648n;

        c(int i10) {
            this.f2648n = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f2640r.cancel(this.f2648n);
        }
    }

    private void f() {
        this.f2637o = new Handler(Looper.getMainLooper());
        this.f2640r = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f2639q = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10) {
        this.f2637o.post(new c(i10));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10, int i11, Notification notification) {
        this.f2637o.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i10, Notification notification) {
        this.f2637o.post(new b(i10, notification));
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        f2636t = this;
        f();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2639q.k();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2638p) {
            j.c().d(f2635s, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f2639q.k();
            f();
            this.f2638p = false;
        }
        if (intent != null) {
            this.f2639q.l(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f2638p = true;
        j.c().a(f2635s, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f2636t = null;
        stopSelf();
    }
}
