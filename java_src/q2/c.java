package q2;

import a5.i;
import android.os.Parcel;
import android.os.Parcelable;
import b5.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k2.a;
import p3.m0;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    public final List<b> f12549n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {

        /* renamed from: n  reason: collision with root package name */
        public final long f12551n;

        /* renamed from: o  reason: collision with root package name */
        public final long f12552o;

        /* renamed from: p  reason: collision with root package name */
        public final int f12553p;

        /* renamed from: q  reason: collision with root package name */
        public static final Comparator<b> f12550q = d.f12554n;
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            p3.a.a(j10 < j11);
            this.f12551n = j10;
            this.f12552o = j11;
            this.f12553p = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            return k.j().e(bVar.f12551n, bVar2.f12551n).e(bVar.f12552o, bVar2.f12552o).d(bVar.f12553p, bVar2.f12553p).i();
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
            return this.f12551n == bVar.f12551n && this.f12552o == bVar.f12552o && this.f12553p == bVar.f12553p;
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.f12551n), Long.valueOf(this.f12552o), Integer.valueOf(this.f12553p));
        }

        public String toString() {
            return m0.C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f12551n), Long.valueOf(this.f12552o), Integer.valueOf(this.f12553p));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f12551n);
            parcel.writeLong(this.f12552o);
            parcel.writeInt(this.f12553p);
        }
    }

    public c(List<b> list) {
        this.f12549n = list;
        p3.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f12552o;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f12551n < j10) {
                return true;
            }
            j10 = list.get(i10).f12552o;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f12549n.equals(((c) obj).f12549n);
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
        return this.f12549n.hashCode();
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f12549n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f12549n);
    }
}
