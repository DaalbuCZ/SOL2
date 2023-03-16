package com.google.firebase.perf.metrics;

import a7.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import b7.d;
import b7.m;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import f5.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z6.k;
/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, h {
    private static final l L = new a7.a().a();
    private static final long M = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace N;
    private static ExecutorService O;
    private y6.a G;

    /* renamed from: o  reason: collision with root package name */
    private final k f5720o;

    /* renamed from: p  reason: collision with root package name */
    private final a7.a f5721p;

    /* renamed from: q  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f5722q;

    /* renamed from: r  reason: collision with root package name */
    private final m.b f5723r;

    /* renamed from: s  reason: collision with root package name */
    private Context f5724s;

    /* renamed from: t  reason: collision with root package name */
    private WeakReference<Activity> f5725t;

    /* renamed from: u  reason: collision with root package name */
    private WeakReference<Activity> f5726u;

    /* renamed from: w  reason: collision with root package name */
    private final l f5728w;

    /* renamed from: x  reason: collision with root package name */
    private final l f5729x;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5719n = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5727v = false;

    /* renamed from: y  reason: collision with root package name */
    private l f5730y = null;

    /* renamed from: z  reason: collision with root package name */
    private l f5731z = null;
    private l A = null;
    private l B = null;
    private l C = null;
    private l D = null;
    private l E = null;
    private l F = null;
    private boolean H = false;
    private int I = 0;
    private final b J = new b();
    private boolean K = false;

    /* loaded from: classes.dex */
    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.o(AppStartTrace.this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        private final AppStartTrace f5733n;

        public c(AppStartTrace appStartTrace) {
            this.f5733n = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5733n.f5730y == null) {
                this.f5733n.H = true;
            }
        }
    }

    AppStartTrace(k kVar, a7.a aVar, com.google.firebase.perf.config.a aVar2, ExecutorService executorService) {
        this.f5720o = kVar;
        this.f5721p = aVar;
        this.f5722q = aVar2;
        O = executorService;
        this.f5723r = m.x0().V("_experiment_app_start_ttid");
        this.f5728w = Build.VERSION.SDK_INT >= 24 ? l.f(Process.getStartElapsedRealtime()) : null;
        f5.m mVar = (f5.m) e.n().j(f5.m.class);
        this.f5729x = mVar != null ? l.f(mVar.b()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.E != null) {
            return;
        }
        this.E = this.f5721p.a();
        this.f5723r.O(m.x0().V("_experiment_preDrawFoQ").T(s().e()).U(s().d(this.E)).a());
        x(this.f5723r);
    }

    static /* synthetic */ int o(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.I;
        appStartTrace.I = i10 + 1;
        return i10;
    }

    private l p() {
        l lVar = this.f5729x;
        return lVar != null ? lVar : L;
    }

    public static AppStartTrace q() {
        return N != null ? N : r(k.k(), new a7.a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace r(k kVar, a7.a aVar) {
        if (N == null) {
            synchronized (AppStartTrace.class) {
                if (N == null) {
                    N = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, M + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return N;
    }

    private l s() {
        l lVar = this.f5728w;
        return lVar != null ? lVar : p();
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public static boolean t(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    if (Build.VERSION.SDK_INT < 23 ? u(context) : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean u(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(m.b bVar) {
        this.f5720o.C(bVar.a(), d.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        m.b U = m.x0().V(a7.c.APP_START_TRACE_NAME.toString()).T(p().e()).U(p().d(this.A));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.x0().V(a7.c.ON_CREATE_TRACE_NAME.toString()).T(p().e()).U(p().d(this.f5730y)).a());
        m.b x02 = m.x0();
        x02.V(a7.c.ON_START_TRACE_NAME.toString()).T(this.f5730y.e()).U(this.f5730y.d(this.f5731z));
        arrayList.add(x02.a());
        m.b x03 = m.x0();
        x03.V(a7.c.ON_RESUME_TRACE_NAME.toString()).T(this.f5731z.e()).U(this.f5731z.d(this.A));
        arrayList.add(x03.a());
        U.M(arrayList).N(this.G.a());
        this.f5720o.C(U.a(), d.FOREGROUND_BACKGROUND);
    }

    private void x(final m.b bVar) {
        if (this.D == null || this.E == null || this.F == null) {
            return;
        }
        O.execute(new Runnable() { // from class: v6.e
            @Override // java.lang.Runnable
            public final void run() {
                AppStartTrace.this.v(bVar);
            }
        });
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.F != null) {
            return;
        }
        this.F = this.f5721p.a();
        this.f5723r.O(m.x0().V("_experiment_onDrawFoQ").T(s().e()).U(s().d(this.F)).a());
        if (this.f5728w != null) {
            this.f5723r.O(m.x0().V("_experiment_procStart_to_classLoad").T(s().e()).U(s().d(p())).a());
        }
        this.f5723r.S("systemDeterminedForeground", this.K ? "true" : "false");
        this.f5723r.R("onDrawCount", this.I);
        this.f5723r.N(this.G.a());
        x(this.f5723r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.D != null) {
            return;
        }
        this.D = this.f5721p.a();
        this.f5723r.T(s().e()).U(s().d(this.D));
        x(this.f5723r);
    }

    public synchronized void B(Context context) {
        boolean z10;
        if (this.f5719n) {
            return;
        }
        r.k().a().a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.K && !t(applicationContext)) {
                z10 = false;
                this.K = z10;
                this.f5719n = true;
                this.f5724s = applicationContext;
            }
            z10 = true;
            this.K = z10;
            this.f5719n = true;
            this.f5724s = applicationContext;
        }
    }

    public synchronized void C() {
        if (this.f5719n) {
            r.k().a().c(this);
            ((Application) this.f5724s).unregisterActivityLifecycleCallbacks(this);
            this.f5719n = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:15:0x001b, B:17:0x003c), top: B:25:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.H     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L40
            a7.l r5 = r3.f5730y     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La
            goto L40
        La:
            boolean r5 = r3.K     // Catch: java.lang.Throwable -> L42
            r0 = 1
            if (r5 != 0) goto L1a
            android.content.Context r5 = r3.f5724s     // Catch: java.lang.Throwable -> L42
            boolean r5 = t(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L18
            goto L1a
        L18:
            r5 = 0
            goto L1b
        L1a:
            r5 = r0
        L1b:
            r3.K = r5     // Catch: java.lang.Throwable -> L42
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            r3.f5725t = r5     // Catch: java.lang.Throwable -> L42
            a7.a r4 = r3.f5721p     // Catch: java.lang.Throwable -> L42
            a7.l r4 = r4.a()     // Catch: java.lang.Throwable -> L42
            r3.f5730y = r4     // Catch: java.lang.Throwable -> L42
            a7.l r4 = r3.s()     // Catch: java.lang.Throwable -> L42
            a7.l r5 = r3.f5730y     // Catch: java.lang.Throwable -> L42
            long r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L42
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.M     // Catch: java.lang.Throwable -> L42
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3e
            r3.f5727v = r0     // Catch: java.lang.Throwable -> L42
        L3e:
            monitor-exit(r3)
            return
        L40:
            monitor-exit(r3)
            return
        L42:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.H || this.f5727v || !this.f5722q.h()) {
            return;
        }
        activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.J);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.H && !this.f5727v) {
            boolean h10 = this.f5722q.h();
            if (h10) {
                View findViewById = activity.findViewById(16908290);
                findViewById.getViewTreeObserver().addOnDrawListener(this.J);
                a7.e.e(findViewById, new Runnable() { // from class: v6.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.y();
                    }
                });
                a7.h.a(findViewById, new Runnable() { // from class: v6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.z();
                    }
                }, new Runnable() { // from class: v6.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.A();
                    }
                });
            }
            if (this.A != null) {
                return;
            }
            this.f5726u = new WeakReference<>(activity);
            this.A = this.f5721p.a();
            this.G = SessionManager.getInstance().perfSession();
            u6.a e10 = u6.a.e();
            e10.a("onResume(): " + activity.getClass().getName() + ": " + p().d(this.A) + " microseconds");
            O.execute(new Runnable() { // from class: v6.d
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.w();
                }
            });
            if (!h10) {
                C();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.H && this.f5731z == null && !this.f5727v) {
            this.f5731z = this.f5721p.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @q(e.b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.H || this.f5727v || this.C != null) {
            return;
        }
        this.C = this.f5721p.a();
        this.f5723r.O(m.x0().V("_experiment_firstBackgrounding").T(s().e()).U(s().d(this.C)).a());
    }

    @q(e.b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.H || this.f5727v || this.B != null) {
            return;
        }
        this.B = this.f5721p.a();
        this.f5723r.O(m.x0().V("_experiment_firstForegrounding").T(s().e()).U(s().d(this.B)).a());
    }
}
