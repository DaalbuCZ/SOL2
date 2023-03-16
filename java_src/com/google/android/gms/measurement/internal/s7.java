package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
/* loaded from: classes.dex */
final class s7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ u7 f4998n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s7(u7 u7Var) {
        this.f4998n = u7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v7 v7Var = this.f4998n.f5096p;
        Context c10 = v7Var.f4438a.c();
        this.f4998n.f5096p.f4438a.f();
        v7.M(v7Var, new ComponentName(c10, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
