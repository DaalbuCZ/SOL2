package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class v extends a4.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: n  reason: collision with root package name */
    public final String f5100n;

    /* renamed from: o  reason: collision with root package name */
    public final t f5101o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5102p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5103q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(v vVar, long j10) {
        z3.o.i(vVar);
        this.f5100n = vVar.f5100n;
        this.f5101o = vVar.f5101o;
        this.f5102p = vVar.f5102p;
        this.f5103q = j10;
    }

    public v(String str, t tVar, String str2, long j10) {
        this.f5100n = str;
        this.f5101o = tVar;
        this.f5102p = str2;
        this.f5103q = j10;
    }

    public final String toString() {
        String str = this.f5102p;
        String str2 = this.f5100n;
        String valueOf = String.valueOf(this.f5101o);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w.a(this, parcel, i10);
    }
}
