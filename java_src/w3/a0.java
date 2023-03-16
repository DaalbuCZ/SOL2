package w3;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g4.a;
/* loaded from: classes.dex */
public final class a0 extends a4.a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: n  reason: collision with root package name */
    private final String f16052n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f16053o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f16054p;

    /* renamed from: q  reason: collision with root package name */
    private final Context f16055q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f16056r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f16052n = str;
        this.f16053o = z10;
        this.f16054p = z11;
        this.f16055q = (Context) g4.b.f(a.AbstractBinderC0114a.e(iBinder));
        this.f16056r = z12;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, g4.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.n(parcel, 1, this.f16052n, false);
        a4.c.c(parcel, 2, this.f16053o);
        a4.c.c(parcel, 3, this.f16054p);
        a4.c.h(parcel, 4, g4.b.m0(this.f16055q), false);
        a4.c.c(parcel, 5, this.f16056r);
        a4.c.b(parcel, a10);
    }
}
