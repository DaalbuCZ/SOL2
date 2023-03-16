package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4482n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ Bundle f4483o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ v7 f4484p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d7(v7 v7Var, n9 n9Var, Bundle bundle) {
        this.f4484p = v7Var;
        this.f4482n = n9Var;
        this.f4483o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        v7 v7Var = this.f4484p;
        fVar = v7Var.f5126d;
        if (fVar == null) {
            v7Var.f4438a.d().r().a("Failed to send default event parameters to service");
            return;
        }
        try {
            z3.o.i(this.f4482n);
            fVar.v(this.f4483o, this.f4482n);
        } catch (RemoteException e10) {
            this.f4484p.f4438a.d().r().b("Failed to send default event parameters to service", e10);
        }
    }
}
