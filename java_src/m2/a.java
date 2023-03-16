package m2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.a;
import p3.m0;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class a implements a.b {

    /* renamed from: n  reason: collision with root package name */
    public final String f11329n;

    /* renamed from: o  reason: collision with root package name */
    public final String f11330o;

    /* renamed from: p  reason: collision with root package name */
    public final long f11331p;

    /* renamed from: q  reason: collision with root package name */
    public final long f11332q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f11333r;

    /* renamed from: s  reason: collision with root package name */
    private int f11334s;

    /* renamed from: t  reason: collision with root package name */
    private static final m1 f11327t = new m1.b().e0("application/id3").E();

    /* renamed from: u  reason: collision with root package name */
    private static final m1 f11328u = new m1.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<a> CREATOR = new C0164a();

    /* renamed from: m2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0164a implements Parcelable.Creator<a> {
        C0164a() {
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

    a(Parcel parcel) {
        this.f11329n = (String) m0.j(parcel.readString());
        this.f11330o = (String) m0.j(parcel.readString());
        this.f11331p = parcel.readLong();
        this.f11332q = parcel.readLong();
        this.f11333r = (byte[]) m0.j(parcel.createByteArray());
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f11329n = str;
        this.f11330o = str2;
        this.f11331p = j10;
        this.f11332q = j11;
        this.f11333r = bArr;
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
        return this.f11331p == aVar.f11331p && this.f11332q == aVar.f11332q && m0.c(this.f11329n, aVar.f11329n) && m0.c(this.f11330o, aVar.f11330o) && Arrays.equals(this.f11333r, aVar.f11333r);
    }

    @Override // k2.a.b
    public m1 g() {
        String str = this.f11329n;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f11328u;
            case 1:
            case 2:
                return f11327t;
            default:
                return null;
        }
    }

    @Override // k2.a.b
    public /* synthetic */ void h(z1.b bVar) {
        k2.b.c(this, bVar);
    }

    public int hashCode() {
        if (this.f11334s == 0) {
            String str = this.f11329n;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f11330o;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f11331p;
            long j11 = this.f11332q;
            this.f11334s = ((((((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f11333r);
        }
        return this.f11334s;
    }

    @Override // k2.a.b
    public byte[] l() {
        if (g() != null) {
            return this.f11333r;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f11329n + ", id=" + this.f11332q + ", durationMs=" + this.f11331p + ", value=" + this.f11330o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11329n);
        parcel.writeString(this.f11330o);
        parcel.writeLong(this.f11331p);
        parcel.writeLong(this.f11332q);
        parcel.writeByteArray(this.f11333r);
    }
}
