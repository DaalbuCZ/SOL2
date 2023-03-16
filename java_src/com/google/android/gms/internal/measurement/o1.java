package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o1 extends a4.a {
    public static final Parcelable.Creator<o1> CREATOR = new p1();

    /* renamed from: n  reason: collision with root package name */
    public final long f4040n;

    /* renamed from: o  reason: collision with root package name */
    public final long f4041o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4042p;

    /* renamed from: q  reason: collision with root package name */
    public final String f4043q;

    /* renamed from: r  reason: collision with root package name */
    public final String f4044r;

    /* renamed from: s  reason: collision with root package name */
    public final String f4045s;

    /* renamed from: t  reason: collision with root package name */
    public final Bundle f4046t;

    /* renamed from: u  reason: collision with root package name */
    public final String f4047u;

    public o1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f4040n = j10;
        this.f4041o = j11;
        this.f4042p = z10;
        this.f4043q = str;
        this.f4044r = str2;
        this.f4045s = str3;
        this.f4046t = bundle;
        this.f4047u = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.k(parcel, 1, this.f4040n);
        a4.c.k(parcel, 2, this.f4041o);
        a4.c.c(parcel, 3, this.f4042p);
        a4.c.n(parcel, 4, this.f4043q, false);
        a4.c.n(parcel, 5, this.f4044r, false);
        a4.c.n(parcel, 6, this.f4045s, false);
        a4.c.e(parcel, 7, this.f4046t, false);
        a4.c.n(parcel, 8, this.f4047u, false);
        a4.c.b(parcel, a10);
    }
}
