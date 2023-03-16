package z3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import z3.i;
/* loaded from: classes.dex */
public final class k0 extends a4.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: n  reason: collision with root package name */
    final int f17402n;

    /* renamed from: o  reason: collision with root package name */
    final IBinder f17403o;

    /* renamed from: p  reason: collision with root package name */
    private final w3.b f17404p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f17405q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f17406r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(int i10, IBinder iBinder, w3.b bVar, boolean z10, boolean z11) {
        this.f17402n = i10;
        this.f17403o = iBinder;
        this.f17404p = bVar;
        this.f17405q = z10;
        this.f17406r = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return this.f17404p.equals(k0Var.f17404p) && n.a(s(), k0Var.s());
        }
        return false;
    }

    public final w3.b k() {
        return this.f17404p;
    }

    public final i s() {
        IBinder iBinder = this.f17403o;
        if (iBinder == null) {
            return null;
        }
        return i.a.e(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f17402n);
        a4.c.h(parcel, 2, this.f17403o, false);
        a4.c.m(parcel, 3, this.f17404p, i10, false);
        a4.c.c(parcel, 4, this.f17405q);
        a4.c.c(parcel, 5, this.f17406r);
        a4.c.b(parcel, a10);
    }
}
