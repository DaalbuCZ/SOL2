package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import g4.a;
/* loaded from: classes.dex */
public final class n extends l4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final g4.a f(g4.a aVar, String str, int i10, g4.a aVar2) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        e10.writeInt(i10);
        l4.c.e(e10, aVar2);
        Parcel a10 = a(2, e10);
        g4.a e11 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e11;
    }

    public final g4.a m0(g4.a aVar, String str, int i10, g4.a aVar2) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        e10.writeInt(i10);
        l4.c.e(e10, aVar2);
        Parcel a10 = a(3, e10);
        g4.a e11 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e11;
    }
}
