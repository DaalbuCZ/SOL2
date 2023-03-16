package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f4811n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4812o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ n9 f4813p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f4814q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ v7 f4815r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n7(v7 v7Var, String str, String str2, n9 n9Var, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f4815r = v7Var;
        this.f4811n = str;
        this.f4812o = str2;
        this.f4813p = n9Var;
        this.f4814q = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.f fVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                v7 v7Var = this.f4815r;
                fVar = v7Var.f5126d;
                if (fVar == null) {
                    v7Var.f4438a.d().r().c("Failed to get conditional properties; not connected to service", this.f4811n, this.f4812o);
                } else {
                    z3.o.i(this.f4813p);
                    arrayList = i9.v(fVar.h0(this.f4811n, this.f4812o, this.f4813p));
                    this.f4815r.E();
                }
            } catch (RemoteException e10) {
                this.f4815r.f4438a.d().r().d("Failed to get conditional properties; remote exception", this.f4811n, this.f4812o, e10);
            }
        } finally {
            this.f4815r.f4438a.N().E(this.f4814q, arrayList);
        }
    }
}
