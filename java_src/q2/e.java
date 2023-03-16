package q2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final float f12555n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12556o;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(float f10, int i10) {
        this.f12555n = f10;
        this.f12556o = i10;
    }

    private e(Parcel parcel) {
        this.f12555n = parcel.readFloat();
        this.f12556o = parcel.readInt();
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f12555n == eVar.f12555n && this.f12556o == eVar.f12556o;
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
        return ((527 + d5.b.a(this.f12555n)) * 31) + this.f12556o;
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f12555n + ", svcTemporalLayerCount=" + this.f12556o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f12555n);
        parcel.writeInt(this.f12556o);
    }
}
