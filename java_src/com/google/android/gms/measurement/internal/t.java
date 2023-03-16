package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class t extends a4.a implements Iterable<String> {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: n  reason: collision with root package name */
    private final Bundle f5003n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Bundle bundle) {
        this.f5003n = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long C(String str) {
        return Long.valueOf(this.f5003n.getLong("value"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object D(String str) {
        return this.f5003n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E(String str) {
        return this.f5003n.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new s(this);
    }

    public final int k() {
        return this.f5003n.size();
    }

    public final String toString() {
        return this.f5003n.toString();
    }

    public final Bundle v() {
        return new Bundle(this.f5003n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.e(parcel, 2, v(), false);
        a4.c.b(parcel, a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double x(String str) {
        return Double.valueOf(this.f5003n.getDouble("value"));
    }
}
