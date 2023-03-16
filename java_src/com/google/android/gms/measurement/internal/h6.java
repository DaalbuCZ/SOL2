package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* loaded from: classes.dex */
public final class h6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ i6 f4593n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h6(i6 i6Var, p4.v vVar) {
        this.f4593n = i6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f4593n.f4438a.d().v().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f4593n.f4438a.N();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z10 = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z10 = false;
                    }
                    this.f4593n.f4438a.b().z(new g6(this, z10, data, str, queryParameter));
                }
            } catch (RuntimeException e10) {
                this.f4593n.f4438a.d().r().b("Throwable caught in onActivityCreated", e10);
            }
        } finally {
            this.f4593n.f4438a.K().y(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f4593n.f4438a.K().z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f4593n.f4438a.K().A(activity);
        l8 M = this.f4593n.f4438a.M();
        M.f4438a.b().z(new d8(M, M.f4438a.e().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        l8 M = this.f4593n.f4438a.M();
        M.f4438a.b().z(new c8(M, M.f4438a.e().b()));
        this.f4593n.f4438a.K().B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f4593n.f4438a.K().C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
