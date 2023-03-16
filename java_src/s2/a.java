package s2;

import android.os.Parcel;
import android.os.Parcelable;
import n2.b;
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0193a();

    /* renamed from: s2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0193a implements Parcelable.Creator<a> {
        C0193a() {
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
        super(parcel);
    }

    public a(String str, String str2) {
        super(str, str2);
    }
}
