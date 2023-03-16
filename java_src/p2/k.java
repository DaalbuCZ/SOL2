package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final int f12231o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12232p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12233q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f12234r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f12235s;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12231o = i10;
        this.f12232p = i11;
        this.f12233q = i12;
        this.f12234r = iArr;
        this.f12235s = iArr2;
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f12231o = parcel.readInt();
        this.f12232p = parcel.readInt();
        this.f12233q = parcel.readInt();
        this.f12234r = (int[]) m0.j(parcel.createIntArray());
        this.f12235s = (int[]) m0.j(parcel.createIntArray());
    }

    @Override // p2.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f12231o == kVar.f12231o && this.f12232p == kVar.f12232p && this.f12233q == kVar.f12233q && Arrays.equals(this.f12234r, kVar.f12234r) && Arrays.equals(this.f12235s, kVar.f12235s);
    }

    public int hashCode() {
        return ((((((((527 + this.f12231o) * 31) + this.f12232p) * 31) + this.f12233q) * 31) + Arrays.hashCode(this.f12234r)) * 31) + Arrays.hashCode(this.f12235s);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12231o);
        parcel.writeInt(this.f12232p);
        parcel.writeInt(this.f12233q);
        parcel.writeIntArray(this.f12234r);
        parcel.writeIntArray(this.f12235s);
    }
}
