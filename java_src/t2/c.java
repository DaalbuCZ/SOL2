package t2;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final int f14709n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14710o;

    /* renamed from: p  reason: collision with root package name */
    public final int f14711p;
    @Deprecated

    /* renamed from: q  reason: collision with root package name */
    public final int f14712q;

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

    public c(int i10, int i11, int i12) {
        this.f14709n = i10;
        this.f14710o = i11;
        this.f14711p = i12;
        this.f14712q = i12;
    }

    c(Parcel parcel) {
        this.f14709n = parcel.readInt();
        this.f14710o = parcel.readInt();
        int readInt = parcel.readInt();
        this.f14711p = readInt;
        this.f14712q = readInt;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(c cVar) {
        int i10 = this.f14709n - cVar.f14709n;
        if (i10 == 0) {
            int i11 = this.f14710o - cVar.f14710o;
            return i11 == 0 ? this.f14711p - cVar.f14711p : i11;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14709n == cVar.f14709n && this.f14710o == cVar.f14710o && this.f14711p == cVar.f14711p;
    }

    public int hashCode() {
        return (((this.f14709n * 31) + this.f14710o) * 31) + this.f14711p;
    }

    public String toString() {
        return this.f14709n + "." + this.f14710o + "." + this.f14711p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14709n);
        parcel.writeInt(this.f14710o);
        parcel.writeInt(this.f14711p);
    }
}
