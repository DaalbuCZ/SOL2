package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Bundle f4994n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4995o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s5(i6 i6Var, Bundle bundle) {
        this.f4995o = i6Var;
        this.f4994n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6 i6Var = this.f4995o;
        Bundle bundle = this.f4994n;
        i6Var.h();
        i6Var.i();
        z3.o.i(bundle);
        String e10 = z3.o.e(bundle.getString("name"));
        if (!i6Var.f4438a.o()) {
            i6Var.f4438a.d().v().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            i6Var.f4438a.L().s(new d(bundle.getString("app_id"), "", new d9(e10, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), i6Var.f4438a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
