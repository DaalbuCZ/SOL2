package p2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.m0;
/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12240o;

    /* renamed from: p  reason: collision with root package name */
    public final String f12241p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    n(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f12240o = parcel.readString();
        this.f12241p = (String) m0.j(parcel.readString());
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f12240o = str2;
        this.f12241p = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f12227n.equals(nVar.f12227n) && m0.c(this.f12240o, nVar.f12240o) && m0.c(this.f12241p, nVar.f12241p);
    }

    public int hashCode() {
        int hashCode = (527 + this.f12227n.hashCode()) * 31;
        String str = this.f12240o;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12241p;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": url=" + this.f12241p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12227n);
        parcel.writeString(this.f12240o);
        parcel.writeString(this.f12241p);
    }
}
