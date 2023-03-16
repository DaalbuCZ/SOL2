package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.je;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ p4.b f4500n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int f4501o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ long f4502p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ boolean f4503q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ p4.b f4504r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ i6 f4505s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e6(i6 i6Var, p4.b bVar, int i10, long j10, boolean z10, p4.b bVar2) {
        this.f4505s = i6Var;
        this.f4500n = bVar;
        this.f4501o = i10;
        this.f4502p = j10;
        this.f4503q = z10;
        this.f4504r = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4505s.J(this.f4500n);
        i6.c0(this.f4505s, this.f4500n, this.f4501o, this.f4502p, false, this.f4503q);
        je.c();
        if (this.f4505s.f4438a.z().B(null, u2.f5066o0)) {
            i6.b0(this.f4505s, this.f4500n, this.f4504r);
        }
    }
}
