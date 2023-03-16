package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i4 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ g5 f4609n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ j4 f4610o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i4(j4 j4Var, g5 g5Var) {
        this.f4610o = j4Var;
        this.f4609n = g5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j4.a(this.f4610o, this.f4609n);
        this.f4610o.m(this.f4609n.f4560g);
    }
}
