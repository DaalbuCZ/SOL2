package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f5157n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f5158o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ n9 f5159p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ boolean f5160q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f5161r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ v7 f5162s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w6(v7 v7Var, String str, String str2, n9 n9Var, boolean z10, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f5162s = v7Var;
        this.f5157n = str;
        this.f5158o = str2;
        this.f5159p = n9Var;
        this.f5160q = z10;
        this.f5161r = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        p4.f fVar;
        Bundle bundle2 = new Bundle();
        try {
            v7 v7Var = this.f5162s;
            fVar = v7Var.f5126d;
            if (fVar == null) {
                v7Var.f4438a.d().r().c("Failed to get user properties; not connected to service", this.f5157n, this.f5158o);
                this.f5162s.f4438a.N().F(this.f5161r, bundle2);
                return;
            }
            z3.o.i(this.f5159p);
            List<d9> G = fVar.G(this.f5157n, this.f5158o, this.f5160q, this.f5159p);
            bundle = new Bundle();
            if (G != null) {
                for (d9 d9Var : G) {
                    String str = d9Var.f4491r;
                    if (str != null) {
                        bundle.putString(d9Var.f4488o, str);
                    } else {
                        Long l10 = d9Var.f4490q;
                        if (l10 != null) {
                            bundle.putLong(d9Var.f4488o, l10.longValue());
                        } else {
                            Double d10 = d9Var.f4493t;
                            if (d10 != null) {
                                bundle.putDouble(d9Var.f4488o, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f5162s.E();
                    this.f5162s.f4438a.N().F(this.f5161r, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f5162s.f4438a.d().r().c("Failed to get user properties; remote exception", this.f5157n, e10);
                    this.f5162s.f4438a.N().F(this.f5161r, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f5162s.f4438a.N().F(this.f5161r, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.f5162s.f4438a.N().F(this.f5161r, bundle2);
            throw th;
        }
    }
}
