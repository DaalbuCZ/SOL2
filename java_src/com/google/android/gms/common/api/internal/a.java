package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: r  reason: collision with root package name */
    private static final a f3561r = new a();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f3562n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f3563o = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList f3564p = new ArrayList();
    @GuardedBy("sInstance")

    /* renamed from: q  reason: collision with root package name */
    private boolean f3565q = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0077a {
        void a(boolean z10);
    }

    private a() {
    }

    public static a b() {
        return f3561r;
    }

    public static void c(Application application) {
        a aVar = f3561r;
        synchronized (aVar) {
            if (!aVar.f3565q) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f3565q = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f3561r) {
            Iterator it = this.f3564p.iterator();
            while (it.hasNext()) {
                ((InterfaceC0077a) it.next()).a(z10);
            }
        }
    }

    public void a(InterfaceC0077a interfaceC0077a) {
        synchronized (f3561r) {
            this.f3564p.add(interfaceC0077a);
        }
    }

    public boolean d() {
        return this.f3562n.get();
    }

    @TargetApi(16)
    public boolean e(boolean z10) {
        if (!this.f3563o.get()) {
            if (!d4.l.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f3563o.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f3562n.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f3562n.compareAndSet(true, false);
        this.f3563o.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f3562n.compareAndSet(true, false);
        this.f3563o.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f3562n.compareAndSet(false, true)) {
            this.f3563o.set(true);
            f(true);
        }
    }
}
