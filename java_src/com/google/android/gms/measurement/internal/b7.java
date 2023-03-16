package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4423n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v7 f4424o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b7(v7 v7Var, n9 n9Var) {
        this.f4424o = v7Var;
        this.f4423n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4424o;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            z3.o.i(this.f4423n);
            fVar.g0(this.f4423n);
            this.f4424o.f4438a.C().t();
            this.f4424o.r(fVar, null, this.f4423n);
            this.f4424o.E();
        } catch (RemoteException e10) {
            this.f4424o.f4438a.d().r().b("Failed to send app launch to the service", e10);
        }
    }
}
