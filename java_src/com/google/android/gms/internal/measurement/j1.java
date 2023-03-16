package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class j1 extends o0 implements l1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final int d() {
        Parcel e10 = e(2, a());
        int readInt = e10.readInt();
        e10.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.l1
    public final void n(String str, String str2, Bundle bundle, long j10) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        q0.e(a10, bundle);
        a10.writeLong(j10);
        f(1, a10);
    }
}
