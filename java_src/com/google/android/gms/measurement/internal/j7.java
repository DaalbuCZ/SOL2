package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4689n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v7 f4690o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j7(v7 v7Var, n9 n9Var) {
        this.f4690o = v7Var;
        this.f4689n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4690o;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Failed to send consent settings to service");
            return;
        }
        try {
            z3.o.i(this.f4689n);
            fVar.D(this.f4689n);
            this.f4690o.E();
        } catch (RemoteException e10) {
            this.f4690o.f4438a.d().r().b("Failed to send consent settings to the service", e10);
        }
    }
}
