package r4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class b extends a4.a implements x3.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: n  reason: collision with root package name */
    final int f13010n;

    /* renamed from: o  reason: collision with root package name */
    private int f13011o;

    /* renamed from: p  reason: collision with root package name */
    private Intent f13012p;

    public b() {
        this(2, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, Intent intent) {
        this.f13010n = i10;
        this.f13011o = i11;
        this.f13012p = intent;
    }

    @Override // x3.j
    public final Status d() {
        return this.f13011o == 0 ? Status.f3532t : Status.f3536x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f13010n);
        a4.c.i(parcel, 2, this.f13011o);
        a4.c.m(parcel, 3, this.f13012p, i10, false);
        a4.c.b(parcel, a10);
    }
}
