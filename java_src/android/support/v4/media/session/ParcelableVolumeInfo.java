package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public int f356n;

    /* renamed from: o  reason: collision with root package name */
    public int f357o;

    /* renamed from: p  reason: collision with root package name */
    public int f358p;

    /* renamed from: q  reason: collision with root package name */
    public int f359q;

    /* renamed from: r  reason: collision with root package name */
    public int f360r;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f356n = parcel.readInt();
        this.f358p = parcel.readInt();
        this.f359q = parcel.readInt();
        this.f360r = parcel.readInt();
        this.f357o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f356n);
        parcel.writeInt(this.f358p);
        parcel.writeInt(this.f359q);
        parcel.writeInt(this.f360r);
        parcel.writeInt(this.f357o);
    }
}
