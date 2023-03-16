package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Bundle f4891n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ o6 f4892o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ o6 f4893p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ long f4894q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ v6 f4895r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p6(v6 v6Var, Bundle bundle, o6 o6Var, o6 o6Var2, long j10) {
        this.f4895r = v6Var;
        this.f4891n = bundle;
        this.f4892o = o6Var;
        this.f4893p = o6Var2;
        this.f4894q = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v6.w(this.f4895r, this.f4891n, this.f4892o, this.f4893p, this.f4894q);
    }
}
