package l2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0154a();

    /* renamed from: n  reason: collision with root package name */
    public final int f11106n;

    /* renamed from: o  reason: collision with root package name */
    public final String f11107o;

    /* renamed from: l2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0154a implements Parcelable.Creator<a> {
        C0154a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) p3.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f11106n = i10;
        this.f11107o = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public /* synthetic */ void h(z1.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f11106n + ",url=" + this.f11107o + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11107o);
        parcel.writeInt(this.f11106n);
    }
}
