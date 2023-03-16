package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import g4.a;
/* loaded from: classes.dex */
public final class m extends l4.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int f() {
        Parcel a10 = a(6, e());
        int readInt = a10.readInt();
        a10.recycle();
        return readInt;
    }

    public final int m0(g4.a aVar, String str, boolean z10) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        l4.c.c(e10, z10);
        Parcel a10 = a(3, e10);
        int readInt = a10.readInt();
        a10.recycle();
        return readInt;
    }

    public final int n0(g4.a aVar, String str, boolean z10) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        l4.c.c(e10, z10);
        Parcel a10 = a(5, e10);
        int readInt = a10.readInt();
        a10.recycle();
        return readInt;
    }

    public final g4.a o0(g4.a aVar, String str, int i10) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        e10.writeInt(i10);
        Parcel a10 = a(2, e10);
        g4.a e11 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e11;
    }

    public final g4.a p0(g4.a aVar, String str, int i10, g4.a aVar2) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        e10.writeInt(i10);
        l4.c.e(e10, aVar2);
        Parcel a10 = a(8, e10);
        g4.a e11 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e11;
    }

    public final g4.a q0(g4.a aVar, String str, int i10) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        e10.writeInt(i10);
        Parcel a10 = a(4, e10);
        g4.a e11 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e11;
    }

    public final g4.a r0(g4.a aVar, String str, boolean z10, long j10) {
        Parcel e10 = e();
        l4.c.e(e10, aVar);
        e10.writeString(str);
        l4.c.c(e10, z10);
        e10.writeLong(j10);
        Parcel a10 = a(7, e10);
        g4.a e11 = a.AbstractBinderC0114a.e(a10.readStrongBinder());
        a10.recycle();
        return e11;
    }
}
