package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.je;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d6 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ p4.b f4475n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ long f4476o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ int f4477p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ long f4478q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ boolean f4479r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ p4.b f4480s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ i6 f4481t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6(i6 i6Var, p4.b bVar, long j10, int i10, long j11, boolean z10, p4.b bVar2) {
        this.f4481t = i6Var;
        this.f4475n = bVar;
        this.f4476o = j10;
        this.f4477p = i10;
        this.f4478q = j11;
        this.f4479r = z10;
        this.f4480s = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4481t.J(this.f4475n);
        this.f4481t.z(this.f4476o, false);
        i6.c0(this.f4481t, this.f4475n, this.f4477p, this.f4478q, true, this.f4479r);
        je.c();
        if (this.f4481t.f4438a.z().B(null, u2.f5066o0)) {
            i6.b0(this.f4481t, this.f4475n, this.f4480s);
        }
    }
}
