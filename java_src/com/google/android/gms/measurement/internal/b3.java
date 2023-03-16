package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import z3.c;
/* loaded from: classes.dex */
public final class b3 extends z3.c {
    public b3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.c
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // z3.c
    protected final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // z3.c, x3.a.f
    public final int h() {
        return w3.i.f16085a;
    }

    @Override // z3.c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof p4.f ? (p4.f) queryLocalInterface : new v2(iBinder);
    }
}
