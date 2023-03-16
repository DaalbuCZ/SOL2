package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f5191n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ long f5192o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ a2 f5193p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(a2 a2Var, String str, long j10) {
        this.f5193p = a2Var;
        this.f5191n = str;
        this.f5192o = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2.j(this.f5193p, this.f5191n, this.f5192o);
    }
}
