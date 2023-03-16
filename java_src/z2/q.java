package z2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final String f17290n;

    /* renamed from: o  reason: collision with root package name */
    public final String f17291o;

    /* renamed from: p  reason: collision with root package name */
    public final List<b> f17292p;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: n  reason: collision with root package name */
        public final int f17293n;

        /* renamed from: o  reason: collision with root package name */
        public final int f17294o;

        /* renamed from: p  reason: collision with root package name */
        public final String f17295p;

        /* renamed from: q  reason: collision with root package name */
        public final String f17296q;

        /* renamed from: r  reason: collision with root package name */
        public final String f17297r;

        /* renamed from: s  reason: collision with root package name */
        public final String f17298s;

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

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f17293n = i10;
            this.f17294o = i11;
            this.f17295p = str;
            this.f17296q = str2;
            this.f17297r = str3;
            this.f17298s = str4;
        }

        b(Parcel parcel) {
            this.f17293n = parcel.readInt();
            this.f17294o = parcel.readInt();
            this.f17295p = parcel.readString();
            this.f17296q = parcel.readString();
            this.f17297r = parcel.readString();
            this.f17298s = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17293n == bVar.f17293n && this.f17294o == bVar.f17294o && TextUtils.equals(this.f17295p, bVar.f17295p) && TextUtils.equals(this.f17296q, bVar.f17296q) && TextUtils.equals(this.f17297r, bVar.f17297r) && TextUtils.equals(this.f17298s, bVar.f17298s);
        }

        public int hashCode() {
            int i10 = ((this.f17293n * 31) + this.f17294o) * 31;
            String str = this.f17295p;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f17296q;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f17297r;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f17298s;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17293n);
            parcel.writeInt(this.f17294o);
            parcel.writeString(this.f17295p);
            parcel.writeString(this.f17296q);
            parcel.writeString(this.f17297r);
            parcel.writeString(this.f17298s);
        }
    }

    q(Parcel parcel) {
        this.f17290n = parcel.readString();
        this.f17291o = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f17292p = Collections.unmodifiableList(arrayList);
    }

    public q(String str, String str2, List<b> list) {
        this.f17290n = str;
        this.f17291o = str2;
        this.f17292p = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return TextUtils.equals(this.f17290n, qVar.f17290n) && TextUtils.equals(this.f17291o, qVar.f17291o) && this.f17292p.equals(qVar.f17292p);
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
        String str = this.f17290n;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f17291o;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f17292p.hashCode();
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f17290n != null) {
            str = " [" + this.f17290n + ", " + this.f17291o + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17290n);
        parcel.writeString(this.f17291o);
        int size = this.f17292p.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f17292p.get(i11), 0);
        }
    }
}
