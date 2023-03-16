package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.internal.measurement.je;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k8 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l8 f4714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k8(l8 l8Var) {
        this.f4714a = l8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f4714a.h();
        if (this.f4714a.f4438a.F().v(this.f4714a.f4438a.e().a())) {
            this.f4714a.f4438a.F().f4979l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f4714a.f4438a.d().v().a("Detected application was in foreground");
                c(this.f4714a.f4438a.e().a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j10, boolean z10) {
        this.f4714a.h();
        this.f4714a.s();
        if (this.f4714a.f4438a.F().v(j10)) {
            this.f4714a.f4438a.F().f4979l.a(true);
            je.c();
            if (this.f4714a.f4438a.z().B(null, u2.f5066o0)) {
                this.f4714a.f4438a.B().v();
            }
        }
        this.f4714a.f4438a.F().f4982o.b(j10);
        if (this.f4714a.f4438a.F().f4979l.b()) {
            c(j10, z10);
        }
    }

    final void c(long j10, boolean z10) {
        this.f4714a.h();
        if (this.f4714a.f4438a.o()) {
            this.f4714a.f4438a.F().f4982o.b(j10);
            this.f4714a.f4438a.d().v().b("Session started, time", Long.valueOf(this.f4714a.f4438a.e().b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f4714a.f4438a.I().M("auto", "_sid", valueOf, j10);
            this.f4714a.f4438a.F().f4983p.b(valueOf.longValue());
            this.f4714a.f4438a.F().f4979l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f4714a.f4438a.z().B(null, u2.f5040b0) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.f4714a.f4438a.I().v("auto", "_s", j10, bundle);
            ad.c();
            if (this.f4714a.f4438a.z().B(null, u2.f5046e0)) {
                String a10 = this.f4714a.f4438a.F().f4988u.a();
                if (TextUtils.isEmpty(a10)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                this.f4714a.f4438a.I().v("auto", "_ssr", j10, bundle2);
            }
        }
    }
}
