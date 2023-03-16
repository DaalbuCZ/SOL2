package k2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p3.m0;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0149a();

    /* renamed from: n  reason: collision with root package name */
    private final b[] f10530n;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0149a implements Parcelable.Creator<a> {
        C0149a() {
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

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        m1 g();

        void h(z1.b bVar);

        byte[] l();
    }

    a(Parcel parcel) {
        this.f10530n = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f10530n;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
            i10++;
        }
    }

    public a(List<? extends b> list) {
        this.f10530n = (b[]) list.toArray(new b[0]);
    }

    public a(b... bVarArr) {
        this.f10530n = bVarArr;
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a((b[]) m0.E0(this.f10530n, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f10530n);
    }

    public b c(int i10) {
        return this.f10530n[i10];
    }

    public int d() {
        return this.f10530n.length;
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
        return Arrays.equals(this.f10530n, ((a) obj).f10530n);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10530n);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f10530n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10530n.length);
        for (b bVar : this.f10530n) {
            parcel.writeParcelable(bVar, 0);
        }
    }
}
