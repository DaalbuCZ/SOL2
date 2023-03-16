package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d extends a4.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: n  reason: collision with root package name */
    public String f4445n;

    /* renamed from: o  reason: collision with root package name */
    public String f4446o;

    /* renamed from: p  reason: collision with root package name */
    public d9 f4447p;

    /* renamed from: q  reason: collision with root package name */
    public long f4448q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4449r;

    /* renamed from: s  reason: collision with root package name */
    public String f4450s;

    /* renamed from: t  reason: collision with root package name */
    public final v f4451t;

    /* renamed from: u  reason: collision with root package name */
    public long f4452u;

    /* renamed from: v  reason: collision with root package name */
    public v f4453v;

    /* renamed from: w  reason: collision with root package name */
    public final long f4454w;

    /* renamed from: x  reason: collision with root package name */
    public final v f4455x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(d dVar) {
        z3.o.i(dVar);
        this.f4445n = dVar.f4445n;
        this.f4446o = dVar.f4446o;
        this.f4447p = dVar.f4447p;
        this.f4448q = dVar.f4448q;
        this.f4449r = dVar.f4449r;
        this.f4450s = dVar.f4450s;
        this.f4451t = dVar.f4451t;
        this.f4452u = dVar.f4452u;
        this.f4453v = dVar.f4453v;
        this.f4454w = dVar.f4454w;
        this.f4455x = dVar.f4455x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, String str2, d9 d9Var, long j10, boolean z10, String str3, v vVar, long j11, v vVar2, long j12, v vVar3) {
        this.f4445n = str;
        this.f4446o = str2;
        this.f4447p = d9Var;
        this.f4448q = j10;
        this.f4449r = z10;
        this.f4450s = str3;
        this.f4451t = vVar;
        this.f4452u = j11;
        this.f4453v = vVar2;
        this.f4454w = j12;
        this.f4455x = vVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.n(parcel, 2, this.f4445n, false);
        a4.c.n(parcel, 3, this.f4446o, false);
        a4.c.m(parcel, 4, this.f4447p, i10, false);
        a4.c.k(parcel, 5, this.f4448q);
        a4.c.c(parcel, 6, this.f4449r);
        a4.c.n(parcel, 7, this.f4450s, false);
        a4.c.m(parcel, 8, this.f4451t, i10, false);
        a4.c.k(parcel, 9, this.f4452u);
        a4.c.m(parcel, 10, this.f4453v, i10, false);
        a4.c.k(parcel, 11, this.f4454w);
        a4.c.m(parcel, 12, this.f4455x, i10, false);
        a4.c.b(parcel, a10);
    }
}
