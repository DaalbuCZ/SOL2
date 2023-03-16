package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class w8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f5166n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f5167o = "_err";

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ Bundle f5168p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ x8 f5169q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w8(x8 x8Var, String str, String str2, Bundle bundle) {
        this.f5169q = x8Var;
        this.f5166n = str;
        this.f5168p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5169q.f5190a.k((v) z3.o.i(this.f5169q.f5190a.h0().w0(this.f5166n, this.f5167o, this.f5168p, "auto", this.f5169q.f5190a.e().a(), false, true)), this.f5166n);
    }
}
