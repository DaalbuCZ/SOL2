package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class s0 extends p0 implements t0 {
    public static t0 e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new r0(iBinder);
    }
}