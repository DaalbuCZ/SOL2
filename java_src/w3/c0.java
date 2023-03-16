package w3;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c0 extends a4.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: n  reason: collision with root package name */
    private final boolean f16065n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private final String f16066o;

    /* renamed from: p  reason: collision with root package name */
    private final int f16067p;

    /* renamed from: q  reason: collision with root package name */
    private final int f16068q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(boolean z10, String str, int i10, int i11) {
        this.f16065n = z10;
        this.f16066o = str;
        this.f16067p = k0.a(i10) - 1;
        this.f16068q = p.a(i11) - 1;
    }

    @Nullable
    public final String k() {
        return this.f16066o;
    }

    public final boolean s() {
        return this.f16065n;
    }

    public final int v() {
        return p.a(this.f16068q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.c(parcel, 1, this.f16065n);
        a4.c.n(parcel, 2, this.f16066o, false);
        a4.c.i(parcel, 3, this.f16067p);
        a4.c.i(parcel, 4, this.f16068q);
        a4.c.b(parcel, a10);
    }

    public final int x() {
        return k0.a(this.f16067p);
    }
}
