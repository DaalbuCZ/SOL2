package r4;

import android.os.Parcel;
import android.os.Parcelable;
import z3.k0;
/* loaded from: classes.dex */
public final class l extends a4.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: n  reason: collision with root package name */
    final int f13017n;

    /* renamed from: o  reason: collision with root package name */
    private final w3.b f13018o;

    /* renamed from: p  reason: collision with root package name */
    private final k0 f13019p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i10, w3.b bVar, k0 k0Var) {
        this.f13017n = i10;
        this.f13018o = bVar;
        this.f13019p = k0Var;
    }

    public final w3.b k() {
        return this.f13018o;
    }

    public final k0 s() {
        return this.f13019p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f13017n);
        a4.c.m(parcel, 2, this.f13018o, i10, false);
        a4.c.m(parcel, 3, this.f13019p, i10, false);
        a4.c.b(parcel, a10);
    }
}
