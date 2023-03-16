package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d9 extends a4.a {
    public static final Parcelable.Creator<d9> CREATOR = new e9();

    /* renamed from: n  reason: collision with root package name */
    public final int f4487n;

    /* renamed from: o  reason: collision with root package name */
    public final String f4488o;

    /* renamed from: p  reason: collision with root package name */
    public final long f4489p;

    /* renamed from: q  reason: collision with root package name */
    public final Long f4490q;

    /* renamed from: r  reason: collision with root package name */
    public final String f4491r;

    /* renamed from: s  reason: collision with root package name */
    public final String f4492s;

    /* renamed from: t  reason: collision with root package name */
    public final Double f4493t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f4487n = i10;
        this.f4488o = str;
        this.f4489p = j10;
        this.f4490q = l10;
        if (i10 == 1) {
            this.f4493t = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f4493t = d10;
        }
        this.f4491r = str2;
        this.f4492s = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(f9 f9Var) {
        this(f9Var.f4540c, f9Var.f4541d, f9Var.f4542e, f9Var.f4539b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(String str, long j10, Object obj, String str2) {
        z3.o.e(str);
        this.f4487n = 2;
        this.f4488o = str;
        this.f4489p = j10;
        this.f4492s = str2;
        if (obj == null) {
            this.f4490q = null;
            this.f4493t = null;
            this.f4491r = null;
        } else if (obj instanceof Long) {
            this.f4490q = (Long) obj;
            this.f4493t = null;
            this.f4491r = null;
        } else if (obj instanceof String) {
            this.f4490q = null;
            this.f4493t = null;
            this.f4491r = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.f4490q = null;
            this.f4493t = (Double) obj;
            this.f4491r = null;
        }
    }

    public final Object k() {
        Long l10 = this.f4490q;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f4493t;
        if (d10 != null) {
            return d10;
        }
        String str = this.f4491r;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e9.a(this, parcel, i10);
    }
}
