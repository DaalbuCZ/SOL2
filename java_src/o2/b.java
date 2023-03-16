package o2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import p3.m0;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final int f11917n;

    /* renamed from: o  reason: collision with root package name */
    public final String f11918o;

    /* renamed from: p  reason: collision with root package name */
    public final String f11919p;

    /* renamed from: q  reason: collision with root package name */
    public final String f11920q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f11921r;

    /* renamed from: s  reason: collision with root package name */
    public final int f11922s;

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

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        p3.a.a(i11 == -1 || i11 > 0);
        this.f11917n = i10;
        this.f11918o = str;
        this.f11919p = str2;
        this.f11920q = str3;
        this.f11921r = z10;
        this.f11922s = i11;
    }

    b(Parcel parcel) {
        this.f11917n = parcel.readInt();
        this.f11918o = parcel.readString();
        this.f11919p = parcel.readString();
        this.f11920q = parcel.readString();
        this.f11921r = m0.K0(parcel);
        this.f11922s = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o2.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b.a(java.util.Map):o2.b");
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
        return this.f11917n == bVar.f11917n && m0.c(this.f11918o, bVar.f11918o) && m0.c(this.f11919p, bVar.f11919p) && m0.c(this.f11920q, bVar.f11920q) && this.f11921r == bVar.f11921r && this.f11922s == bVar.f11922s;
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public void h(z1.b bVar) {
        String str = this.f11919p;
        if (str != null) {
            bVar.g0(str);
        }
        String str2 = this.f11918o;
        if (str2 != null) {
            bVar.X(str2);
        }
    }

    public int hashCode() {
        int i10 = (527 + this.f11917n) * 31;
        String str = this.f11918o;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11919p;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11920q;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f11921r ? 1 : 0)) * 31) + this.f11922s;
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f11919p + "\", genre=\"" + this.f11918o + "\", bitrate=" + this.f11917n + ", metadataInterval=" + this.f11922s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11917n);
        parcel.writeString(this.f11918o);
        parcel.writeString(this.f11919p);
        parcel.writeString(this.f11920q);
        m0.Y0(parcel, this.f11921r);
        parcel.writeInt(this.f11922s);
    }
}
