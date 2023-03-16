package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* loaded from: classes.dex */
public final class n9 extends a4.a {
    public static final Parcelable.Creator<n9> CREATOR = new o9();
    public final int A;
    public final boolean B;
    public final boolean C;
    public final String D;
    public final Boolean E;
    public final long F;
    public final List G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;

    /* renamed from: n  reason: collision with root package name */
    public final String f4817n;

    /* renamed from: o  reason: collision with root package name */
    public final String f4818o;

    /* renamed from: p  reason: collision with root package name */
    public final String f4819p;

    /* renamed from: q  reason: collision with root package name */
    public final String f4820q;

    /* renamed from: r  reason: collision with root package name */
    public final long f4821r;

    /* renamed from: s  reason: collision with root package name */
    public final long f4822s;

    /* renamed from: t  reason: collision with root package name */
    public final String f4823t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f4824u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f4825v;

    /* renamed from: w  reason: collision with root package name */
    public final long f4826w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4827x;
    @Deprecated

    /* renamed from: y  reason: collision with root package name */
    public final long f4828y;

    /* renamed from: z  reason: collision with root package name */
    public final long f4829z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n9(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        z3.o.e(str);
        this.f4817n = str;
        this.f4818o = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f4819p = str3;
        this.f4826w = j10;
        this.f4820q = str4;
        this.f4821r = j11;
        this.f4822s = j12;
        this.f4823t = str5;
        this.f4824u = z10;
        this.f4825v = z11;
        this.f4827x = str6;
        this.f4828y = 0L;
        this.f4829z = j14;
        this.A = i10;
        this.B = z12;
        this.C = z13;
        this.D = str7;
        this.E = bool;
        this.F = j15;
        this.G = list;
        this.H = null;
        this.I = str9;
        this.J = str10;
        this.K = str11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n9(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List list, String str8, String str9, String str10, String str11) {
        this.f4817n = str;
        this.f4818o = str2;
        this.f4819p = str3;
        this.f4826w = j12;
        this.f4820q = str4;
        this.f4821r = j10;
        this.f4822s = j11;
        this.f4823t = str5;
        this.f4824u = z10;
        this.f4825v = z11;
        this.f4827x = str6;
        this.f4828y = j13;
        this.f4829z = j14;
        this.A = i10;
        this.B = z12;
        this.C = z13;
        this.D = str7;
        this.E = bool;
        this.F = j15;
        this.G = list;
        this.H = str8;
        this.I = str9;
        this.J = str10;
        this.K = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.n(parcel, 2, this.f4817n, false);
        a4.c.n(parcel, 3, this.f4818o, false);
        a4.c.n(parcel, 4, this.f4819p, false);
        a4.c.n(parcel, 5, this.f4820q, false);
        a4.c.k(parcel, 6, this.f4821r);
        a4.c.k(parcel, 7, this.f4822s);
        a4.c.n(parcel, 8, this.f4823t, false);
        a4.c.c(parcel, 9, this.f4824u);
        a4.c.c(parcel, 10, this.f4825v);
        a4.c.k(parcel, 11, this.f4826w);
        a4.c.n(parcel, 12, this.f4827x, false);
        a4.c.k(parcel, 13, this.f4828y);
        a4.c.k(parcel, 14, this.f4829z);
        a4.c.i(parcel, 15, this.A);
        a4.c.c(parcel, 16, this.B);
        a4.c.c(parcel, 18, this.C);
        a4.c.n(parcel, 19, this.D, false);
        a4.c.d(parcel, 21, this.E, false);
        a4.c.k(parcel, 22, this.F);
        a4.c.o(parcel, 23, this.G, false);
        a4.c.n(parcel, 24, this.H, false);
        a4.c.n(parcel, 25, this.I, false);
        a4.c.n(parcel, 26, this.J, false);
        a4.c.n(parcel, 27, this.K, false);
        a4.c.b(parcel, a10);
    }
}
