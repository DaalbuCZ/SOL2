package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p4.j;
import p4.k;
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends u.a implements j {

    /* renamed from: p  reason: collision with root package name */
    private k f4351p;

    @Override // p4.j
    public void a(Context context, Intent intent) {
        u.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f4351p == null) {
            this.f4351p = new k(this);
        }
        this.f4351p.a(context, intent);
    }
}
