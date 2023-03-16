package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ b9 f4999n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ a9 f5000o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s8(a9 a9Var, b9 b9Var) {
        this.f5000o = a9Var;
        this.f4999n = b9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a9.k0(this.f5000o, this.f4999n);
        this.f5000o.x();
    }
}
