package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes.dex */
final class u2 extends s2 {

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ Bundle f4230r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ Activity f4231s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ c3 f4232t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(c3 c3Var, Bundle bundle, Activity activity) {
        super(c3Var.f3766n, true);
        this.f4232t = c3Var;
        this.f4230r = bundle;
        this.f4231s = activity;
    }

    @Override // com.google.android.gms.internal.measurement.s2
    final void a() {
        Bundle bundle;
        f1 f1Var;
        if (this.f4230r != null) {
            bundle = new Bundle();
            if (this.f4230r.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f4230r.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        f1Var = this.f4232t.f3766n.f3792i;
        ((f1) z3.o.i(f1Var)).onActivityCreated(g4.b.m0(this.f4231s), bundle, this.f4147o);
    }
}
