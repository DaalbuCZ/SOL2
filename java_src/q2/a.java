package q2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import p3.m0;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0181a();

    /* renamed from: n  reason: collision with root package name */
    public final String f12540n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f12541o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12542p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12543q;

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0181a implements Parcelable.Creator<a> {
        C0181a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel) {
        this.f12540n = (String) m0.j(parcel.readString());
        this.f12541o = (byte[]) m0.j(parcel.createByteArray());
        this.f12542p = parcel.readInt();
        this.f12543q = parcel.readInt();
    }

    /* synthetic */ a(Parcel parcel, C0181a c0181a) {
        this(parcel);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f12540n = str;
        this.f12541o = bArr;
        this.f12542p = i10;
        this.f12543q = i11;
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
        return this.f12540n.equals(aVar.f12540n) && Arrays.equals(this.f12541o, aVar.f12541o) && this.f12542p == aVar.f12542p && this.f12543q == aVar.f12543q;
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public /* synthetic */ void h(z1.b bVar) {
        k2.b.c(this, bVar);
    }

    public int hashCode() {
        return ((((((527 + this.f12540n.hashCode()) * 31) + Arrays.hashCode(this.f12541o)) * 31) + this.f12542p) * 31) + this.f12543q;
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "mdta: key=" + this.f12540n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12540n);
        parcel.writeByteArray(this.f12541o);
        parcel.writeInt(this.f12542p);
        parcel.writeInt(this.f12543q);
    }
}
