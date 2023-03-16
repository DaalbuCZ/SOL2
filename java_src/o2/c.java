package o2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f11923n;

    /* renamed from: o  reason: collision with root package name */
    public final String f11924o;

    /* renamed from: p  reason: collision with root package name */
    public final String f11925p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    c(Parcel parcel) {
        this.f11923n = (byte[]) p3.a.e(parcel.createByteArray());
        this.f11924o = parcel.readString();
        this.f11925p = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f11923n = bArr;
        this.f11924o = str;
        this.f11925p = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11923n, ((c) obj).f11923n);
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public void h(z1.b bVar) {
        String str = this.f11924o;
        if (str != null) {
            bVar.i0(str);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11923n);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f11924o, this.f11925p, Integer.valueOf(this.f11923n.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f11923n);
        parcel.writeString(this.f11924o);
        parcel.writeString(this.f11925p);
    }
}
