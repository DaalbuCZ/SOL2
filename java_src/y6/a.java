package y6;

import a7.l;
import android.os.Parcel;
import android.os.Parcelable;
import b7.k;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0243a();

    /* renamed from: n  reason: collision with root package name */
    private final String f17030n;

    /* renamed from: o  reason: collision with root package name */
    private final l f17031o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17032p;

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0243a implements Parcelable.Creator<a> {
        C0243a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0243a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel) {
        this.f17032p = false;
        this.f17030n = parcel.readString();
        this.f17032p = parcel.readByte() != 0;
        this.f17031o = (l) parcel.readParcelable(l.class.getClassLoader());
    }

    /* synthetic */ a(Parcel parcel, C0243a c0243a) {
        this(parcel);
    }

    public a(String str, a7.a aVar) {
        this.f17032p = false;
        this.f17030n = str;
        this.f17031o = aVar.a();
    }

    public static k[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = list.get(i10).a();
            if (z10 || !list.get(i10).i()) {
                kVarArr[i10] = a11;
            } else {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    public static a c() {
        a aVar = new a(UUID.randomUUID().toString().replace("-", ""), new a7.a());
        aVar.k(m());
        return aVar;
    }

    public static boolean m() {
        com.google.firebase.perf.config.a g10 = com.google.firebase.perf.config.a.g();
        return g10.K() && Math.random() < ((double) g10.D());
    }

    public k a() {
        k.c M = k.Y().M(this.f17030n);
        if (this.f17032p) {
            M.L(b7.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return M.a();
    }

    public l d() {
        return this.f17031o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f17031o.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean f() {
        return this.f17032p;
    }

    public boolean i() {
        return this.f17032p;
    }

    public String j() {
        return this.f17030n;
    }

    public void k(boolean z10) {
        this.f17032p = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17030n);
        parcel.writeByte(this.f17032p ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f17031o, 0);
    }
}
