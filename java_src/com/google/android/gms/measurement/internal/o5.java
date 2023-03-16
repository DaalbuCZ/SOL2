package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f4845n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f4846o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ long f4847p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ Bundle f4848q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ boolean f4849r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ boolean f4850s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ boolean f4851t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ String f4852u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ i6 f4853v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o5(i6 i6Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f4853v = i6Var;
        this.f4845n = str;
        this.f4846o = str2;
        this.f4847p = j10;
        this.f4848q = bundle;
        this.f4849r = z10;
        this.f4850s = z11;
        this.f4851t = z12;
        this.f4852u = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4853v.w(this.f4845n, this.f4846o, this.f4847p, this.f4848q, this.f4849r, this.f4850s, this.f4851t, this.f4852u);
    }
}
