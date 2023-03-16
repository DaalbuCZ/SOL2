package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m7 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ AtomicReference f4786n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4787o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f4788p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ n9 f4789q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ v7 f4790r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m7(v7 v7Var, AtomicReference atomicReference, String str, String str2, String str3, n9 n9Var) {
        this.f4790r = v7Var;
        this.f4786n = atomicReference;
        this.f4787o = str2;
        this.f4788p = str3;
        this.f4789q = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        v7 v7Var;
        p4.f fVar;
        AtomicReference atomicReference2;
        List L;
        synchronized (this.f4786n) {
            try {
                v7Var = this.f4790r;
                fVar = v7Var.f5126d;
            } catch (RemoteException e10) {
                this.f4790r.f4438a.d().r().d("(legacy) Failed to get conditional properties; remote exception", null, this.f4787o, e10);
                this.f4786n.set(Collections.emptyList());
                atomicReference = this.f4786n;
            }
            if (fVar == null) {
                v7Var.f4438a.d().r().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f4787o, this.f4788p);
                this.f4786n.set(Collections.emptyList());
                this.f4786n.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                z3.o.i(this.f4789q);
                atomicReference2 = this.f4786n;
                L = fVar.h0(this.f4787o, this.f4788p, this.f4789q);
            } else {
                atomicReference2 = this.f4786n;
                L = fVar.L(null, this.f4787o, this.f4788p);
            }
            atomicReference2.set(L);
            this.f4790r.E();
            atomicReference = this.f4786n;
            atomicReference.notify();
        }
    }
}
