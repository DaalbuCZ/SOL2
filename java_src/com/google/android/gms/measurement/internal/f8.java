package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f8 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final long f4535n;

    /* renamed from: o  reason: collision with root package name */
    final long f4536o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ g8 f4537p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f8(g8 g8Var, long j10, long j11) {
        this.f4537p = g8Var;
        this.f4535n = j10;
        this.f4536o = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4537p.f4571b.f4438a.b().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.e8
            @Override // java.lang.Runnable
            public final void run() {
                f8 f8Var = f8.this;
                g8 g8Var = f8Var.f4537p;
                long j10 = f8Var.f4535n;
                long j11 = f8Var.f4536o;
                g8Var.f4571b.h();
                g8Var.f4571b.f4438a.d().q().a("Application going to the background");
                g8Var.f4571b.f4438a.F().f4985r.a(true);
                Bundle bundle = new Bundle();
                if (!g8Var.f4571b.f4438a.z().D()) {
                    g8Var.f4571b.f4747e.b(j11);
                    g8Var.f4571b.f4747e.d(false, false, j11);
                }
                g8Var.f4571b.f4438a.I().v("auto", "_ab", j10, bundle);
            }
        });
    }
}
