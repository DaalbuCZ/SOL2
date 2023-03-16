package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ n9 f4378n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4379o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ v7 f4380p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7(v7 v7Var, n9 n9Var, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f4380p = v7Var;
        this.f4378n = n9Var;
        this.f4379o = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        String str = null;
        try {
            try {
                if (this.f4380p.f4438a.F().q().i(p4.a.ANALYTICS_STORAGE)) {
                    v7 v7Var = this.f4380p;
                    fVar = v7Var.f5126d;
                    if (fVar == null) {
                        v7Var.f4438a.d().r().a("Failed to get app instance id");
                    } else {
                        z3.o.i(this.f4378n);
                        str = fVar.H(this.f4378n);
                        if (str != null) {
                            this.f4380p.f4438a.I().C(str);
                            this.f4380p.f4438a.F().f4974g.b(str);
                        }
                        this.f4380p.E();
                    }
                } else {
                    this.f4380p.f4438a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f4380p.f4438a.I().C(null);
                    this.f4380p.f4438a.F().f4974g.b(null);
                }
            } catch (RemoteException e10) {
                this.f4380p.f4438a.d().r().b("Failed to get app instance id", e10);
            }
        } finally {
            this.f4380p.f4438a.N().J(this.f4379o, null);
        }
    }
}
