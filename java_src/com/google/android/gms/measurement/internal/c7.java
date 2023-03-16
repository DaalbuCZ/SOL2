package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ o6 f4441n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v7 f4442o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c7(v7 v7Var, o6 o6Var) {
        this.f4442o = v7Var;
        this.f4441n = o6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4442o;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Failed to send current screen to service");
            return;
        }
        try {
            o6 o6Var = this.f4441n;
            if (o6Var == null) {
                fVar.m(0L, null, null, v7Var.f4438a.c().getPackageName());
            } else {
                fVar.m(o6Var.f4856c, o6Var.f4854a, o6Var.f4855b, v7Var.f4438a.c().getPackageName());
            }
            this.f4442o.E();
        } catch (RemoteException e10) {
            this.f4442o.f4438a.d().r().b("Failed to send current screen to the service", e10);
        }
    }
}
