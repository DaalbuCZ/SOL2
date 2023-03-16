package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m3 extends BroadcastReceiver {

    /* renamed from: d  reason: collision with root package name */
    static final String f4754d = m3.class.getName();

    /* renamed from: a  reason: collision with root package name */
    private final a9 f4755a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4756b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4757c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m3(a9 a9Var) {
        z3.o.i(a9Var);
        this.f4755a = a9Var;
    }

    public final void b() {
        this.f4755a.g();
        this.f4755a.b().h();
        if (this.f4756b) {
            return;
        }
        this.f4755a.c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f4757c = this.f4755a.Y().m();
        this.f4755a.d().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f4757c));
        this.f4756b = true;
    }

    public final void c() {
        this.f4755a.g();
        this.f4755a.b().h();
        this.f4755a.b().h();
        if (this.f4756b) {
            this.f4755a.d().v().a("Unregistering connectivity change receiver");
            this.f4756b = false;
            this.f4757c = false;
            try {
                this.f4755a.c().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f4755a.d().r().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f4755a.g();
        String action = intent.getAction();
        this.f4755a.d().v().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f4755a.d().w().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m10 = this.f4755a.Y().m();
        if (this.f4757c != m10) {
            this.f4757c = m10;
            this.f4755a.b().z(new l3(this, m10));
        }
    }
}
