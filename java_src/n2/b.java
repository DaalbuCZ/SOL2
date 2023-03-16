package n2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import p3.m0;
import s1.m1;
import s1.z1;
@Deprecated
/* loaded from: classes.dex */
public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final String f11569n;

    /* renamed from: o  reason: collision with root package name */
    public final String f11570o;

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

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Parcel parcel) {
        this.f11569n = (String) m0.j(parcel.readString());
        this.f11570o = (String) m0.j(parcel.readString());
    }

    public b(String str, String str2) {
        this.f11569n = str;
        this.f11570o = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11569n.equals(bVar.f11569n) && this.f11570o.equals(bVar.f11570o);
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public void h(z1.b bVar) {
        String str = this.f11569n;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.L(this.f11570o);
                return;
            case 1:
                bVar.i0(this.f11570o);
                return;
            case 2:
                bVar.S(this.f11570o);
                return;
            case 3:
                bVar.K(this.f11570o);
                return;
            case 4:
                bVar.M(this.f11570o);
                return;
            default:
                return;
        }
    }

    public int hashCode() {
        return ((527 + this.f11569n.hashCode()) * 31) + this.f11570o.hashCode();
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "VC: " + this.f11569n + "=" + this.f11570o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11569n);
        parcel.writeString(this.f11570o);
    }
}
