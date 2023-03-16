package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
import s1.z1;
/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0178a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12198o;

    /* renamed from: p  reason: collision with root package name */
    public final String f12199p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12200q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f12201r;

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0178a implements Parcelable.Creator<a> {
        C0178a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    a(Parcel parcel) {
        super("APIC");
        this.f12198o = (String) m0.j(parcel.readString());
        this.f12199p = parcel.readString();
        this.f12200q = parcel.readInt();
        this.f12201r = (byte[]) m0.j(parcel.createByteArray());
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f12198o = str;
        this.f12199p = str2;
        this.f12200q = i10;
        this.f12201r = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12200q == aVar.f12200q && m0.c(this.f12198o, aVar.f12198o) && m0.c(this.f12199p, aVar.f12199p) && Arrays.equals(this.f12201r, aVar.f12201r);
    }

    @Override // p2.i, k2.a.b
    public void h(z1.b bVar) {
        bVar.G(this.f12201r, this.f12200q);
    }

    public int hashCode() {
        int i10 = (527 + this.f12200q) * 31;
        String str = this.f12198o;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12199p;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f12201r);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": mimeType=" + this.f12198o + ", description=" + this.f12199p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12198o);
        parcel.writeString(this.f12199p);
        parcel.writeInt(this.f12200q);
        parcel.writeByteArray(this.f12201r);
    }
}
