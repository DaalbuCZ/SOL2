package w3;

import android.os.Parcel;
import android.os.Parcelable;
import z3.n;
/* loaded from: classes.dex */
public class d extends a4.a {
    public static final Parcelable.Creator<d> CREATOR = new o();

    /* renamed from: n  reason: collision with root package name */
    private final String f16069n;
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    private final int f16070o;

    /* renamed from: p  reason: collision with root package name */
    private final long f16071p;

    public d(String str, int i10, long j10) {
        this.f16069n = str;
        this.f16070o = i10;
        this.f16071p = j10;
    }

    public d(String str, long j10) {
        this.f16069n = str;
        this.f16071p = j10;
        this.f16070o = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((k() != null && k().equals(dVar.k())) || (k() == null && dVar.k() == null)) && s() == dVar.s()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z3.n.b(k(), Long.valueOf(s()));
    }

    public String k() {
        return this.f16069n;
    }

    public long s() {
        long j10 = this.f16071p;
        return j10 == -1 ? this.f16070o : j10;
    }

    public final String toString() {
        n.a c10 = z3.n.c(this);
        c10.a("name", k());
        c10.a("version", Long.valueOf(s()));
        return c10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.n(parcel, 1, k(), false);
        a4.c.i(parcel, 2, this.f16070o);
        a4.c.k(parcel, 3, s());
        a4.c.b(parcel, a10);
    }
}
