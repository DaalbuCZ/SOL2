package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final String f12236o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f12237p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f12236o = (String) m0.j(parcel.readString());
        this.f12237p = (byte[]) m0.j(parcel.createByteArray());
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f12236o = str;
        this.f12237p = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return m0.c(this.f12236o, lVar.f12236o) && Arrays.equals(this.f12237p, lVar.f12237p);
    }

    public int hashCode() {
        String str = this.f12236o;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f12237p);
    }

    @Override // p2.i
    public String toString() {
        return this.f12227n + ": owner=" + this.f12236o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12236o);
        parcel.writeByteArray(this.f12237p);
    }
}
