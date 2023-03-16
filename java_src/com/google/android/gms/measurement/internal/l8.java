package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class l8 extends w3 {

    /* renamed from: c  reason: collision with root package name */
    private Handler f4745c;

    /* renamed from: d  reason: collision with root package name */
    protected final k8 f4746d;

    /* renamed from: e  reason: collision with root package name */
    protected final j8 f4747e;

    /* renamed from: f  reason: collision with root package name */
    protected final g8 f4748f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l8(j4 j4Var) {
        super(j4Var);
        this.f4746d = new k8(this);
        this.f4747e = new j8(this);
        this.f4748f = new g8(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void q(l8 l8Var, long j10) {
        l8Var.h();
        l8Var.s();
        l8Var.f4438a.d().v().b("Activity paused, time", Long.valueOf(j10));
        l8Var.f4748f.a(j10);
        if (l8Var.f4438a.z().D()) {
            l8Var.f4747e.b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void r(l8 l8Var, long j10) {
        l8Var.h();
        l8Var.s();
        l8Var.f4438a.d().v().b("Activity resumed, time", Long.valueOf(j10));
        if (l8Var.f4438a.z().D() || l8Var.f4438a.F().f4985r.b()) {
            l8Var.f4747e.c(j10);
        }
        l8Var.f4748f.b();
        k8 k8Var = l8Var.f4746d;
        k8Var.f4714a.h();
        if (k8Var.f4714a.f4438a.o()) {
            k8Var.b(k8Var.f4714a.f4438a.e().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        h();
        if (this.f4745c == null) {
            this.f4745c = new com.google.android.gms.internal.measurement.a1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean n() {
        return false;
    }
}
