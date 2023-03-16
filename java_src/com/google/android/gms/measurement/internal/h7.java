package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4594n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v7 f4595o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h7(v7 v7Var, n9 n9Var) {
        this.f4595o = v7Var;
        this.f4594n = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4595o;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            z3.o.i(this.f4594n);
            fVar.r(this.f4594n);
            this.f4595o.E();
        } catch (RemoteException e10) {
            this.f4595o.f4438a.d().r().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
