package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<m> f1946n;

    /* renamed from: o  reason: collision with root package name */
    ArrayList<String> f1947o;

    /* renamed from: p  reason: collision with root package name */
    b[] f1948p;

    /* renamed from: q  reason: collision with root package name */
    String f1949q;

    /* renamed from: r  reason: collision with root package name */
    int f1950r;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k() {
        this.f1949q = null;
    }

    public k(Parcel parcel) {
        this.f1949q = null;
        this.f1946n = parcel.createTypedArrayList(m.CREATOR);
        this.f1947o = parcel.createStringArrayList();
        this.f1948p = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1949q = parcel.readString();
        this.f1950r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f1946n);
        parcel.writeStringList(this.f1947o);
        parcel.writeTypedArray(this.f1948p, i10);
        parcel.writeString(this.f1949q);
        parcel.writeInt(this.f1950r);
    }
}
