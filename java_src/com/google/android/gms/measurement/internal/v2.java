package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class v2 extends com.google.android.gms.internal.measurement.o0 implements p4.f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p4.f
    public final byte[] B(v vVar, String str) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, vVar);
        a10.writeString(str);
        Parcel e10 = e(9, a10);
        byte[] createByteArray = e10.createByteArray();
        e10.recycle();
        return createByteArray;
    }

    @Override // p4.f
    public final void D(n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(20, a10);
    }

    @Override // p4.f
    public final List G(String str, String str2, boolean z10, n9 n9Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        com.google.android.gms.internal.measurement.q0.d(a10, z10);
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        Parcel e10 = e(14, a10);
        ArrayList createTypedArrayList = e10.createTypedArrayList(d9.CREATOR);
        e10.recycle();
        return createTypedArrayList;
    }

    @Override // p4.f
    public final String H(n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        Parcel e10 = e(11, a10);
        String readString = e10.readString();
        e10.recycle();
        return readString;
    }

    @Override // p4.f
    public final List L(String str, String str2, String str3) {
        Parcel a10 = a();
        a10.writeString(null);
        a10.writeString(str2);
        a10.writeString(str3);
        Parcel e10 = e(17, a10);
        ArrayList createTypedArrayList = e10.createTypedArrayList(d.CREATOR);
        e10.recycle();
        return createTypedArrayList;
    }

    @Override // p4.f
    public final void O(n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(18, a10);
    }

    @Override // p4.f
    public final void U(d dVar, n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, dVar);
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(12, a10);
    }

    @Override // p4.f
    public final void d0(v vVar, n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, vVar);
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(1, a10);
    }

    @Override // p4.f
    public final void g0(n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(4, a10);
    }

    @Override // p4.f
    public final List h0(String str, String str2, n9 n9Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        Parcel e10 = e(16, a10);
        ArrayList createTypedArrayList = e10.createTypedArrayList(d.CREATOR);
        e10.recycle();
        return createTypedArrayList;
    }

    @Override // p4.f
    public final void m(long j10, String str, String str2, String str3) {
        Parcel a10 = a();
        a10.writeLong(j10);
        a10.writeString(str);
        a10.writeString(str2);
        a10.writeString(str3);
        f(10, a10);
    }

    @Override // p4.f
    public final void r(n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(6, a10);
    }

    @Override // p4.f
    public final void s(d9 d9Var, n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, d9Var);
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(2, a10);
    }

    @Override // p4.f
    public final void v(Bundle bundle, n9 n9Var) {
        Parcel a10 = a();
        com.google.android.gms.internal.measurement.q0.e(a10, bundle);
        com.google.android.gms.internal.measurement.q0.e(a10, n9Var);
        f(19, a10);
    }

    @Override // p4.f
    public final List x(String str, String str2, String str3, boolean z10) {
        Parcel a10 = a();
        a10.writeString(null);
        a10.writeString(str2);
        a10.writeString(str3);
        com.google.android.gms.internal.measurement.q0.d(a10, z10);
        Parcel e10 = e(15, a10);
        ArrayList createTypedArrayList = e10.createTypedArrayList(d9.CREATOR);
        e10.recycle();
        return createTypedArrayList;
    }
}
