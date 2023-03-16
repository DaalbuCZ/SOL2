package z3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b1 extends a4.a {
    public static final Parcelable.Creator<b1> CREATOR = new c1();

    /* renamed from: n  reason: collision with root package name */
    Bundle f17314n;

    /* renamed from: o  reason: collision with root package name */
    w3.d[] f17315o;

    /* renamed from: p  reason: collision with root package name */
    int f17316p;

    /* renamed from: q  reason: collision with root package name */
    e f17317q;

    public b1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(Bundle bundle, w3.d[] dVarArr, int i10, e eVar) {
        this.f17314n = bundle;
        this.f17315o = dVarArr;
        this.f17316p = i10;
        this.f17317q = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.e(parcel, 1, this.f17314n, false);
        a4.c.p(parcel, 2, this.f17315o, i10, false);
        a4.c.i(parcel, 3, this.f17316p);
        a4.c.m(parcel, 4, this.f17317q, i10, false);
        a4.c.b(parcel, a10);
    }
}
