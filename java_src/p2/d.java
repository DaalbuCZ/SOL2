package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12209o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f12210p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f12211q;

    /* renamed from: r  reason: collision with root package name */
    public final String[] f12212r;

    /* renamed from: s  reason: collision with root package name */
    private final i[] f12213s;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f12209o = (String) m0.j(parcel.readString());
        this.f12210p = parcel.readByte() != 0;
        this.f12211q = parcel.readByte() != 0;
        this.f12212r = (String[]) m0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f12213s = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f12213s[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f12209o = str;
        this.f12210p = z10;
        this.f12211q = z11;
        this.f12212r = strArr;
        this.f12213s = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12210p == dVar.f12210p && this.f12211q == dVar.f12211q && m0.c(this.f12209o, dVar.f12209o) && Arrays.equals(this.f12212r, dVar.f12212r) && Arrays.equals(this.f12213s, dVar.f12213s);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f12210p ? 1 : 0)) * 31) + (this.f12211q ? 1 : 0)) * 31;
        String str = this.f12209o;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12209o);
        parcel.writeByte(this.f12210p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12211q ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f12212r);
        parcel.writeInt(this.f12213s.length);
        for (i iVar : this.f12213s) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
