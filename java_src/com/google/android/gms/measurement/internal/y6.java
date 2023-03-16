package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f5202n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v7 f5203o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y6(v7 v7Var, n9 n9Var) {
        this.f5203o = v7Var;
        this.f5202n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f5203o;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            z3.o.i(this.f5202n);
            fVar.O(this.f5202n);
        } catch (RemoteException e10) {
            this.f5203o.f4438a.d().r().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f5203o.E();
    }
}
