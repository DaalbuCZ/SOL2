package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5223n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ n9 f5224o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ v7 f5225p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z6(v7 v7Var, AtomicReference atomicReference, n9 n9Var) {
        this.f5225p = v7Var;
        this.f5223n = atomicReference;
        this.f5224o = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p4.f fVar;
        synchronized (this.f5223n) {
            try {
            } catch (RemoteException e10) {
                this.f5225p.f4438a.d().r().b("Failed to get app instance id", e10);
                atomicReference = this.f5223n;
            }
            if (!this.f5225p.f4438a.F().q().i(p4.a.ANALYTICS_STORAGE)) {
                this.f5225p.f4438a.d().x().a("Analytics storage consent denied; will not get app instance id");
                this.f5225p.f4438a.I().C(null);
                this.f5225p.f4438a.F().f4974g.b(null);
                this.f5223n.set(null);
                this.f5223n.notify();
                return;
            }
            v7 v7Var = this.f5225p;
            fVar = v7Var.f5126d;
            if (fVar == null) {
                v7Var.f4438a.d().r().a("Failed to get app instance id");
                this.f5223n.notify();
                return;
            }
            z3.o.i(this.f5224o);
            this.f5223n.set(fVar.H(this.f5224o));
            String str = (String) this.f5223n.get();
            if (str != null) {
                this.f5225p.f4438a.I().C(str);
                this.f5225p.f4438a.F().f4974g.b(str);
            }
            this.f5225p.E();
            atomicReference = this.f5223n;
            atomicReference.notify();
        }
    }
}
