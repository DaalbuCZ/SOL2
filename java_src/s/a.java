package s;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: n  reason: collision with root package name */
    private final Parcelable f13197n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f13196o = new C0191a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0191a extends a {
        C0191a() {
            super((C0191a) null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f13196o;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a() {
        this.f13197n = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f13197n = readParcelable == null ? f13196o : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f13197n = parcelable == f13196o ? null : parcelable;
    }

    /* synthetic */ a(C0191a c0191a) {
        this();
    }

    public final Parcelable a() {
        return this.f13197n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13197n, i10);
    }
}
