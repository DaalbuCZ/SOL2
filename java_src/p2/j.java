package p2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.m0;
/* loaded from: classes.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12228o;

    /* renamed from: p  reason: collision with root package name */
    public final String f12229p;

    /* renamed from: q  reason: collision with root package name */
    public final String f12230q;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    j(Parcel parcel) {
        super("----");
        this.f12228o = (String) m0.j(parcel.readString());
        this.f12229p = (String) m0.j(parcel.readString());
        this.f12230q = (String) m0.j(parcel.readString());
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f12228o = str;
        this.f12229p = str2;
        this.f12230q = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return m0.c(this.f12229p, jVar.f12229p) && m0.c(this.f12228o, jVar.f12228o) && m0.c(this.f12230q, jVar.f12230q);
    }

    public int hashCode() {
        String str = this.f12228o;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12229p;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12230q;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": domain=" + this.f12228o + ", description=" + this.f12229p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12227n);
        parcel.writeString(this.f12228o);
        parcel.writeString(this.f12230q);
    }
}
