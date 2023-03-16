package z3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class q extends a4.a {
    public static final Parcelable.Creator<q> CREATOR = new u0();

    /* renamed from: n  reason: collision with root package name */
    private final int f17431n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f17432o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f17433p;

    /* renamed from: q  reason: collision with root package name */
    private final int f17434q;

    /* renamed from: r  reason: collision with root package name */
    private final int f17435r;

    public q(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f17431n = i10;
        this.f17432o = z10;
        this.f17433p = z11;
        this.f17434q = i11;
        this.f17435r = i12;
    }

    public int C() {
        return this.f17431n;
    }

    public int k() {
        return this.f17434q;
    }

    public int s() {
        return this.f17435r;
    }

    public boolean v() {
        return this.f17432o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, C());
        a4.c.c(parcel, 2, v());
        a4.c.c(parcel, 3, x());
        a4.c.i(parcel, 4, k());
        a4.c.i(parcel, 5, s());
        a4.c.b(parcel, a10);
    }

    public boolean x() {
        return this.f17433p;
    }
}
