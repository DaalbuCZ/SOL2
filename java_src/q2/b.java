package q2;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f;
import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final long f12544n;

    /* renamed from: o  reason: collision with root package name */
    public final long f12545o;

    /* renamed from: p  reason: collision with root package name */
    public final long f12546p;

    /* renamed from: q  reason: collision with root package name */
    public final long f12547q;

    /* renamed from: r  reason: collision with root package name */
    public final long f12548r;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f12544n = j10;
        this.f12545o = j11;
        this.f12546p = j12;
        this.f12547q = j13;
        this.f12548r = j14;
    }

    private b(Parcel parcel) {
        this.f12544n = parcel.readLong();
        this.f12545o = parcel.readLong();
        this.f12546p = parcel.readLong();
        this.f12547q = parcel.readLong();
        this.f12548r = parcel.readLong();
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
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
        return this.f12544n == bVar.f12544n && this.f12545o == bVar.f12545o && this.f12546p == bVar.f12546p && this.f12547q == bVar.f12547q && this.f12548r == bVar.f12548r;
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
        return ((((((((527 + f.b(this.f12544n)) * 31) + f.b(this.f12545o)) * 31) + f.b(this.f12546p)) * 31) + f.b(this.f12547q)) * 31) + f.b(this.f12548r);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f12544n + ", photoSize=" + this.f12545o + ", photoPresentationTimestampUs=" + this.f12546p + ", videoStartPosition=" + this.f12547q + ", videoSize=" + this.f12548r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12544n);
        parcel.writeLong(this.f12545o);
        parcel.writeLong(this.f12546p);
        parcel.writeLong(this.f12547q);
        parcel.writeLong(this.f12548r);
    }
}
