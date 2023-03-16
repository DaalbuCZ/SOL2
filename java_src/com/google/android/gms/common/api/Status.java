package com.google.android.gms.common.api;

import a4.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import x3.d;
import x3.j;
import z3.n;
/* loaded from: classes.dex */
public final class Status extends a4.a implements j, ReflectedParcelable {

    /* renamed from: n  reason: collision with root package name */
    final int f3539n;

    /* renamed from: o  reason: collision with root package name */
    private final int f3540o;

    /* renamed from: p  reason: collision with root package name */
    private final String f3541p;

    /* renamed from: q  reason: collision with root package name */
    private final PendingIntent f3542q;

    /* renamed from: r  reason: collision with root package name */
    private final w3.b f3543r;

    /* renamed from: s  reason: collision with root package name */
    public static final Status f3531s = new Status(-1);

    /* renamed from: t  reason: collision with root package name */
    public static final Status f3532t = new Status(0);

    /* renamed from: u  reason: collision with root package name */
    public static final Status f3533u = new Status(14);

    /* renamed from: v  reason: collision with root package name */
    public static final Status f3534v = new Status(8);

    /* renamed from: w  reason: collision with root package name */
    public static final Status f3535w = new Status(15);

    /* renamed from: x  reason: collision with root package name */
    public static final Status f3536x = new Status(16);

    /* renamed from: z  reason: collision with root package name */
    public static final Status f3538z = new Status(17);

    /* renamed from: y  reason: collision with root package name */
    public static final Status f3537y = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    public Status(int i10) {
        this(i10, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i10, int i11, String str, PendingIntent pendingIntent, w3.b bVar) {
        this.f3539n = i10;
        this.f3540o = i11;
        this.f3541p = str;
        this.f3542q = pendingIntent;
        this.f3543r = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(w3.b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(w3.b bVar, String str, int i10) {
        this(1, i10, str, bVar.v(), bVar);
    }

    public final String C() {
        String str = this.f3541p;
        return str != null ? str : d.a(this.f3540o);
    }

    @Override // x3.j
    public Status d() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f3539n == status.f3539n && this.f3540o == status.f3540o && n.a(this.f3541p, status.f3541p) && n.a(this.f3542q, status.f3542q) && n.a(this.f3543r, status.f3543r);
        }
        return false;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f3539n), Integer.valueOf(this.f3540o), this.f3541p, this.f3542q, this.f3543r);
    }

    public w3.b k() {
        return this.f3543r;
    }

    public int s() {
        return this.f3540o;
    }

    public String toString() {
        n.a c10 = n.c(this);
        c10.a("statusCode", C());
        c10.a("resolution", this.f3542q);
        return c10.toString();
    }

    public String v() {
        return this.f3541p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.i(parcel, 1, s());
        c.n(parcel, 2, v(), false);
        c.m(parcel, 3, this.f3542q, i10, false);
        c.m(parcel, 4, k(), i10, false);
        c.i(parcel, 1000, this.f3539n);
        c.b(parcel, a10);
    }

    public boolean x() {
        return this.f3542q != null;
    }
}
