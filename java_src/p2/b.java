package p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p3.m0;
/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f12202o;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f12202o = (byte[]) m0.j(parcel.createByteArray());
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f12202o = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12227n.equals(bVar.f12227n) && Arrays.equals(this.f12202o, bVar.f12202o);
    }

    public int hashCode() {
        return ((527 + this.f12227n.hashCode()) * 31) + Arrays.hashCode(this.f12202o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12227n);
        parcel.writeByteArray(this.f12202o);
    }
}
