package r4;

import android.os.Parcel;
import android.os.Parcelable;
import z3.i0;
/* loaded from: classes.dex */
public final class j extends a4.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: n  reason: collision with root package name */
    final int f13015n;

    /* renamed from: o  reason: collision with root package name */
    final i0 f13016o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i10, i0 i0Var) {
        this.f13015n = i10;
        this.f13016o = i0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f13015n);
        a4.c.m(parcel, 2, this.f13016o, i10, false);
        a4.c.b(parcel, a10);
    }
}
