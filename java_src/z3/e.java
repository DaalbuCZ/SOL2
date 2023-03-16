package z3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class e extends a4.a {
    public static final Parcelable.Creator<e> CREATOR = new d1();

    /* renamed from: n  reason: collision with root package name */
    private final q f17349n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f17350o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f17351p;

    /* renamed from: q  reason: collision with root package name */
    private final int[] f17352q;

    /* renamed from: r  reason: collision with root package name */
    private final int f17353r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f17354s;

    public e(q qVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f17349n = qVar;
        this.f17350o = z10;
        this.f17351p = z11;
        this.f17352q = iArr;
        this.f17353r = i10;
        this.f17354s = iArr2;
    }

    public boolean C() {
        return this.f17351p;
    }

    public final q D() {
        return this.f17349n;
    }

    public int k() {
        return this.f17353r;
    }

    public int[] s() {
        return this.f17352q;
    }

    public int[] v() {
        return this.f17354s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.m(parcel, 1, this.f17349n, i10, false);
        a4.c.c(parcel, 2, x());
        a4.c.c(parcel, 3, C());
        a4.c.j(parcel, 4, s(), false);
        a4.c.i(parcel, 5, k());
        a4.c.j(parcel, 6, v(), false);
        a4.c.b(parcel, a10);
    }

    public boolean x() {
        return this.f17350o;
    }
}
