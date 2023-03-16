package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* loaded from: classes.dex */
final class q7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ ComponentName f4925n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ u7 f4926o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q7(u7 u7Var, ComponentName componentName) {
        this.f4926o = u7Var;
        this.f4925n = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v7.M(this.f4926o.f5096p, this.f4925n);
    }
}
