package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ d3 f3766n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3(d3 d3Var) {
        this.f3766n = d3Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f3766n.r(new u2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f3766n.r(new b3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f3766n.r(new y2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f3766n.r(new w2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b1 b1Var = new b1();
        this.f3766n.r(new a3(this, activity, b1Var));
        Bundle e10 = b1Var.e(50L);
        if (e10 != null) {
            bundle.putAll(e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f3766n.r(new v2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f3766n.r(new z2(this, activity));
    }
}
