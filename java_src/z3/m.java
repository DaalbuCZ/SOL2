package z3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class m extends a4.a {
    public static final Parcelable.Creator<m> CREATOR = new h0();

    /* renamed from: n  reason: collision with root package name */
    private final int f17409n;

    /* renamed from: o  reason: collision with root package name */
    private final int f17410o;

    /* renamed from: p  reason: collision with root package name */
    private final int f17411p;

    /* renamed from: q  reason: collision with root package name */
    private final long f17412q;

    /* renamed from: r  reason: collision with root package name */
    private final long f17413r;

    /* renamed from: s  reason: collision with root package name */
    private final String f17414s;

    /* renamed from: t  reason: collision with root package name */
    private final String f17415t;

    /* renamed from: u  reason: collision with root package name */
    private final int f17416u;

    /* renamed from: v  reason: collision with root package name */
    private final int f17417v;

    public m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f17409n = i10;
        this.f17410o = i11;
        this.f17411p = i12;
        this.f17412q = j10;
        this.f17413r = j11;
        this.f17414s = str;
        this.f17415t = str2;
        this.f17416u = i13;
        this.f17417v = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f17409n);
        a4.c.i(parcel, 2, this.f17410o);
        a4.c.i(parcel, 3, this.f17411p);
        a4.c.k(parcel, 4, this.f17412q);
        a4.c.k(parcel, 5, this.f17413r);
        a4.c.n(parcel, 6, this.f17414s, false);
        a4.c.n(parcel, 7, this.f17415t, false);
        a4.c.i(parcel, 8, this.f17416u);
        a4.c.i(parcel, 9, this.f17417v);
        a4.c.b(parcel, a10);
    }
}
