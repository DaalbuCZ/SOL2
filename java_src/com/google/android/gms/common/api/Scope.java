package com.google.android.gms.common.api;

import a4.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import z3.o;
/* loaded from: classes.dex */
public final class Scope extends a4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    final int f3529n;

    /* renamed from: o  reason: collision with root package name */
    private final String f3530o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i10, String str) {
        o.f(str, "scopeUri must not be null or empty");
        this.f3529n = i10;
        this.f3530o = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f3530o.equals(((Scope) obj).f3530o);
        }
        return false;
    }

    public int hashCode() {
        return this.f3530o.hashCode();
    }

    public String k() {
        return this.f3530o;
    }

    public String toString() {
        return this.f3530o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.i(parcel, 1, this.f3529n);
        c.n(parcel, 2, k(), false);
        c.b(parcel, a10);
    }
}
