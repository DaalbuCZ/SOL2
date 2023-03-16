package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12203o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12204p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12205q;

    /* renamed from: r  reason: collision with root package name */
    public final long f12206r;

    /* renamed from: s  reason: collision with root package name */
    public final long f12207s;

    /* renamed from: t  reason: collision with root package name */
    private final i[] f12208t;

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

    c(Parcel parcel) {
        super("CHAP");
        this.f12203o = (String) m0.j(parcel.readString());
        this.f12204p = parcel.readInt();
        this.f12205q = parcel.readInt();
        this.f12206r = parcel.readLong();
        this.f12207s = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12208t = new i[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f12208t[i10] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f12203o = str;
        this.f12204p = i10;
        this.f12205q = i11;
        this.f12206r = j10;
        this.f12207s = j11;
        this.f12208t = iVarArr;
    }

    @Override // p2.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12204p == cVar.f12204p && this.f12205q == cVar.f12205q && this.f12206r == cVar.f12206r && this.f12207s == cVar.f12207s && m0.c(this.f12203o, cVar.f12203o) && Arrays.equals(this.f12208t, cVar.f12208t);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f12204p) * 31) + this.f12205q) * 31) + ((int) this.f12206r)) * 31) + ((int) this.f12207s)) * 31;
        String str = this.f12203o;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12203o);
        parcel.writeInt(this.f12204p);
        parcel.writeInt(this.f12205q);
        parcel.writeLong(this.f12206r);
        parcel.writeLong(this.f12207s);
        parcel.writeInt(this.f12208t.length);
        for (i iVar : this.f12208t) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
