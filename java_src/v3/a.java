package v3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a extends a4.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: n  reason: collision with root package name */
    Intent f15584n;

    public a(Intent intent) {
        this.f15584n = intent;
    }

    public Intent k() {
        return this.f15584n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.m(parcel, 1, this.f15584n, i10, false);
        a4.c.b(parcel, a10);
    }
}
