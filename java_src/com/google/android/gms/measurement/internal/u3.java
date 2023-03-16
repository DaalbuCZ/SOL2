package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class u3 implements ServiceConnection {

    /* renamed from: n  reason: collision with root package name */
    private final String f5086n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ v3 f5087o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u3(v3 v3Var, String str) {
        this.f5087o = v3Var;
        this.f5086n = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f5087o.f5106a.d().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.t0 e10 = com.google.android.gms.internal.measurement.s0.e(iBinder);
            if (e10 == null) {
                this.f5087o.f5106a.d().w().a("Install Referrer Service implementation was not found");
                return;
            }
            this.f5087o.f5106a.d().v().a("Install Referrer Service connected");
            this.f5087o.f5106a.b().z(new t3(this, e10, this));
        } catch (RuntimeException e11) {
            this.f5087o.f5106a.d().w().b("Exception occurred while calling Install Referrer API", e11);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5087o.f5106a.d().v().a("Install Referrer Service disconnected");
    }
}
