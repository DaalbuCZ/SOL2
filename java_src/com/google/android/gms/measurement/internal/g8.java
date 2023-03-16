package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a  reason: collision with root package name */
    private f8 f4570a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l8 f4571b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g8(l8 l8Var) {
        this.f4571b = l8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j10) {
        Handler handler;
        this.f4570a = new f8(this, this.f4571b.f4438a.e().a(), j10);
        handler = this.f4571b.f4745c;
        handler.postDelayed(this.f4570a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Handler handler;
        this.f4571b.h();
        f8 f8Var = this.f4570a;
        if (f8Var != null) {
            handler = this.f4571b.f4745c;
            handler.removeCallbacks(f8Var);
        }
        this.f4571b.f4438a.F().f4985r.a(false);
    }
}
