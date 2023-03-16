package p2;

import android.os.Parcel;
import android.os.Parcelable;
import p3.m0;
/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12214o;

    /* renamed from: p  reason: collision with root package name */
    public final String f12215p;

    /* renamed from: q  reason: collision with root package name */
    public final String f12216q;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    e(Parcel parcel) {
        super("COMM");
        this.f12214o = (String) m0.j(parcel.readString());
        this.f12215p = (String) m0.j(parcel.readString());
        this.f12216q = (String) m0.j(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f12214o = str;
        this.f12215p = str2;
        this.f12216q = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return m0.c(this.f12215p, eVar.f12215p) && m0.c(this.f12214o, eVar.f12214o) && m0.c(this.f12216q, eVar.f12216q);
    }

    public int hashCode() {
        String str = this.f12214o;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12215p;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12216q;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": language=" + this.f12214o + ", description=" + this.f12215p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12227n);
        parcel.writeString(this.f12214o);
        parcel.writeString(this.f12216q);
    }
}
