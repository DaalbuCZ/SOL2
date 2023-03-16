package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12217o;

    /* renamed from: p  reason: collision with root package name */
    public final String f12218p;

    /* renamed from: q  reason: collision with root package name */
    public final String f12219q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f12220r;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f12217o = (String) m0.j(parcel.readString());
        this.f12218p = (String) m0.j(parcel.readString());
        this.f12219q = (String) m0.j(parcel.readString());
        this.f12220r = (byte[]) m0.j(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12217o = str;
        this.f12218p = str2;
        this.f12219q = str3;
        this.f12220r = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return m0.c(this.f12217o, fVar.f12217o) && m0.c(this.f12218p, fVar.f12218p) && m0.c(this.f12219q, fVar.f12219q) && Arrays.equals(this.f12220r, fVar.f12220r);
    }

    public int hashCode() {
        String str = this.f12217o;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12218p;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12219q;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f12220r);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": mimeType=" + this.f12217o + ", filename=" + this.f12218p + ", description=" + this.f12219q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12217o);
        parcel.writeString(this.f12218p);
        parcel.writeString(this.f12219q);
        parcel.writeByteArray(this.f12220r);
    }
}
