package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
final class t3 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.t0 f5014n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ ServiceConnection f5015o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ u3 f5016p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t3(u3 u3Var, com.google.android.gms.internal.measurement.t0 t0Var, ServiceConnection serviceConnection) {
        this.f5016p = u3Var;
        this.f5014n = t0Var;
        this.f5015o = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        d3 r10;
        String str2;
        u3 u3Var = this.f5016p;
        v3 v3Var = u3Var.f5087o;
        str = u3Var.f5086n;
        com.google.android.gms.internal.measurement.t0 t0Var = this.f5014n;
        ServiceConnection serviceConnection = this.f5015o;
        v3Var.f5106a.b().h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle X = t0Var.X(bundle);
            if (X == null) {
                v3Var.f5106a.d().r().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = X;
            }
        } catch (Exception e10) {
            v3Var.f5106a.d().r().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        v3Var.f5106a.b().h();
        j4.t();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                r10 = v3Var.f5106a.d().w();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    r10 = v3Var.f5106a.d().r();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    v3Var.f5106a.d().v().b("InstallReferrer API result", string);
                    Bundle t02 = v3Var.f5106a.N().t0(Uri.parse("?".concat(string)));
                    if (t02 == null) {
                        r10 = v3Var.f5106a.d().r();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = t02.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                r10 = v3Var.f5106a.d().r();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                t02.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == v3Var.f5106a.F().f4973f.a()) {
                            v3Var.f5106a.d().v().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (v3Var.f5106a.o()) {
                            v3Var.f5106a.F().f4973f.b(j10);
                            v3Var.f5106a.d().v().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t02.putString("_cis", "referrer API v2");
                            v3Var.f5106a.I().t("auto", "_cmp", t02, str);
                        }
                    }
                }
            }
            r10.a(str2);
        }
        c4.a.b().c(v3Var.f5106a.c(), serviceConnection);
    }
}
