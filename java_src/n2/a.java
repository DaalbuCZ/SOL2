package n2;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import p3.a0;
import p3.m0;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0169a();

    /* renamed from: n  reason: collision with root package name */
    public final int f11561n;

    /* renamed from: o  reason: collision with root package name */
    public final String f11562o;

    /* renamed from: p  reason: collision with root package name */
    public final String f11563p;

    /* renamed from: q  reason: collision with root package name */
    public final int f11564q;

    /* renamed from: r  reason: collision with root package name */
    public final int f11565r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11566s;

    /* renamed from: t  reason: collision with root package name */
    public final int f11567t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f11568u;

    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0169a implements Parcelable.Creator<a> {
        C0169a() {
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

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f11561n = i10;
        this.f11562o = str;
        this.f11563p = str2;
        this.f11564q = i11;
        this.f11565r = i12;
        this.f11566s = i13;
        this.f11567t = i14;
        this.f11568u = bArr;
    }

    a(Parcel parcel) {
        this.f11561n = parcel.readInt();
        this.f11562o = (String) m0.j(parcel.readString());
        this.f11563p = (String) m0.j(parcel.readString());
        this.f11564q = parcel.readInt();
        this.f11565r = parcel.readInt();
        this.f11566s = parcel.readInt();
        this.f11567t = parcel.readInt();
        this.f11568u = (byte[]) m0.j(parcel.createByteArray());
    }

    public static a a(a0 a0Var) {
        int m10 = a0Var.m();
        String A = a0Var.A(a0Var.m(), d.f198a);
        String z10 = a0Var.z(a0Var.m());
        int m11 = a0Var.m();
        int m12 = a0Var.m();
        int m13 = a0Var.m();
        int m14 = a0Var.m();
        int m15 = a0Var.m();
        byte[] bArr = new byte[m15];
        a0Var.j(bArr, 0, m15);
        return new a(m10, A, z10, m11, m12, m13, m14, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11561n == aVar.f11561n && this.f11562o.equals(aVar.f11562o) && this.f11563p.equals(aVar.f11563p) && this.f11564q == aVar.f11564q && this.f11565r == aVar.f11565r && this.f11566s == aVar.f11566s && this.f11567t == aVar.f11567t && Arrays.equals(this.f11568u, aVar.f11568u);
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public void h(z1.b bVar) {
        bVar.G(this.f11568u, this.f11561n);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f11561n) * 31) + this.f11562o.hashCode()) * 31) + this.f11563p.hashCode()) * 31) + this.f11564q) * 31) + this.f11565r) * 31) + this.f11566s) * 31) + this.f11567t) * 31) + Arrays.hashCode(this.f11568u);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f11562o + ", description=" + this.f11563p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11561n);
        parcel.writeString(this.f11562o);
        parcel.writeString(this.f11563p);
        parcel.writeInt(this.f11564q);
        parcel.writeInt(this.f11565r);
        parcel.writeInt(this.f11566s);
        parcel.writeInt(this.f11567t);
        parcel.writeByteArray(this.f11568u);
    }
}
