package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ v f4531n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4532o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4533p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ v7 f4534q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f7(v7 v7Var, v vVar, String str, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f4534q = v7Var;
        this.f4531n = vVar;
        this.f4532o = str;
        this.f4533p = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        byte[] bArr = null;
        try {
            try {
                v7 v7Var = this.f4534q;
                fVar = v7Var.f5126d;
                if (fVar == null) {
                    v7Var.f4438a.d().r().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = fVar.B(this.f4531n, this.f4532o);
                    this.f4534q.E();
                }
            } catch (RemoteException e10) {
                this.f4534q.f4438a.d().r().b("Failed to send event to the service to bundle", e10);
            }
        } finally {
            this.f4534q.f4438a.N().G(this.f4533p, bArr);
        }
    }
}
