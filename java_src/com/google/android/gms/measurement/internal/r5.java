package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Bundle f4955n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f4956o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r5(i6 i6Var, Bundle bundle) {
        this.f4956o = i6Var;
        this.f4955n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6 i6Var = this.f4956o;
        Bundle bundle = this.f4955n;
        i6Var.h();
        i6Var.i();
        z3.o.i(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        z3.o.e(string);
        z3.o.e(string2);
        z3.o.i(bundle.get("value"));
        if (!i6Var.f4438a.o()) {
            i6Var.f4438a.d().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        d9 d9Var = new d9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            v w02 = i6Var.f4438a.N().w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            i6Var.f4438a.L().s(new d(bundle.getString("app_id"), string2, d9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), i6Var.f4438a.N().w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), w02, bundle.getLong("time_to_live"), i6Var.f4438a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
