package r4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends a4.a implements x3.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: n  reason: collision with root package name */
    private final List<String> f13013n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13014o;

    public h(List<String> list, String str) {
        this.f13013n = list;
        this.f13014o = str;
    }

    @Override // x3.j
    public final Status d() {
        return this.f13014o != null ? Status.f3532t : Status.f3536x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.o(parcel, 1, this.f13013n, false);
        a4.c.n(parcel, 2, this.f13014o, false);
        a4.c.b(parcel, a10);
    }
}
