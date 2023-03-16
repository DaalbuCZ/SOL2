package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f4860n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4861o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f4862p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ n9 f4863q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ boolean f4864r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ v7 f4865s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o7(v7 v7Var, AtomicReference atomicReference, String str, String str2, String str3, n9 n9Var, boolean z10) {
        this.f4865s = v7Var;
        this.f4860n = atomicReference;
        this.f4861o = str2;
        this.f4862p = str3;
        this.f4863q = n9Var;
        this.f4864r = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        v7 v7Var;
        p4.f fVar;
        AtomicReference atomicReference2;
        List x10;
        synchronized (this.f4860n) {
            try {
                v7Var = this.f4865s;
                fVar = v7Var.f5126d;
            } catch (RemoteException e10) {
                this.f4865s.f4438a.d().r().d("(legacy) Failed to get user properties; remote exception", null, this.f4861o, e10);
                this.f4860n.set(Collections.emptyList());
                atomicReference = this.f4860n;
            }
            if (fVar == null) {
                v7Var.f4438a.d().r().d("(legacy) Failed to get user properties; not connected to service", null, this.f4861o, this.f4862p);
                this.f4860n.set(Collections.emptyList());
                this.f4860n.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                z3.o.i(this.f4863q);
                atomicReference2 = this.f4860n;
                x10 = fVar.G(this.f4861o, this.f4862p, this.f4864r, this.f4863q);
            } else {
                atomicReference2 = this.f4860n;
                x10 = fVar.x(null, this.f4861o, this.f4862p, this.f4864r);
            }
            atomicReference2.set(x10);
            this.f4865s.E();
            atomicReference = this.f4860n;
            atomicReference.notify();
        }
    }
}
