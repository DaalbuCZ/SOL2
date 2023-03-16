package w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: n  reason: collision with root package name */
    private final b[] f15937n;

    /* renamed from: o  reason: collision with root package name */
    private int f15938o;

    /* renamed from: p  reason: collision with root package name */
    public final String f15939p;

    /* renamed from: q  reason: collision with root package name */
    public final int f15940q;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: n  reason: collision with root package name */
        private int f15941n;

        /* renamed from: o  reason: collision with root package name */
        public final UUID f15942o;

        /* renamed from: p  reason: collision with root package name */
        public final String f15943p;

        /* renamed from: q  reason: collision with root package name */
        public final String f15944q;

        /* renamed from: r  reason: collision with root package name */
        public final byte[] f15945r;

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

        b(Parcel parcel) {
            this.f15942o = new UUID(parcel.readLong(), parcel.readLong());
            this.f15943p = parcel.readString();
            this.f15944q = (String) p3.m0.j(parcel.readString());
            this.f15945r = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f15942o = (UUID) p3.a.e(uuid);
            this.f15943p = str;
            this.f15944q = (String) p3.a.e(str2);
            this.f15945r = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f15942o);
        }

        public b b(byte[] bArr) {
            return new b(this.f15942o, this.f15943p, this.f15944q, bArr);
        }

        public boolean c() {
            return this.f15945r != null;
        }

        public boolean d(UUID uuid) {
            return s1.i.f13425a.equals(this.f15942o) || uuid.equals(this.f15942o);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                if (obj == this) {
                    return true;
                }
                b bVar = (b) obj;
                return p3.m0.c(this.f15943p, bVar.f15943p) && p3.m0.c(this.f15944q, bVar.f15944q) && p3.m0.c(this.f15942o, bVar.f15942o) && Arrays.equals(this.f15945r, bVar.f15945r);
            }
            return false;
        }

        public int hashCode() {
            if (this.f15941n == 0) {
                int hashCode = this.f15942o.hashCode() * 31;
                String str = this.f15943p;
                this.f15941n = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f15944q.hashCode()) * 31) + Arrays.hashCode(this.f15945r);
            }
            return this.f15941n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f15942o.getMostSignificantBits());
            parcel.writeLong(this.f15942o.getLeastSignificantBits());
            parcel.writeString(this.f15943p);
            parcel.writeString(this.f15944q);
            parcel.writeByteArray(this.f15945r);
        }
    }

    m(Parcel parcel) {
        this.f15939p = parcel.readString();
        b[] bVarArr = (b[]) p3.m0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f15937n = bVarArr;
        this.f15940q = bVarArr.length;
    }

    public m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    private m(String str, boolean z10, b... bVarArr) {
        this.f15939p = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f15937n = bVarArr;
        this.f15940q = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    private static boolean b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f15942o.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m d(m mVar, m mVar2) {
        String str;
        b[] bVarArr;
        b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f15939p;
            for (b bVar : mVar.f15937n) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f15939p;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.f15937n) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f15942o)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = s1.i.f13425a;
        return uuid.equals(bVar.f15942o) ? uuid.equals(bVar2.f15942o) ? 0 : 1 : bVar.f15942o.compareTo(bVar2.f15942o);
    }

    public m c(String str) {
        return p3.m0.c(this.f15939p, str) ? this : new m(str, false, this.f15937n);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f15937n[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return p3.m0.c(this.f15939p, mVar.f15939p) && Arrays.equals(this.f15937n, mVar.f15937n);
    }

    public m f(m mVar) {
        String str;
        String str2 = this.f15939p;
        p3.a.f(str2 == null || (str = mVar.f15939p) == null || TextUtils.equals(str2, str));
        String str3 = this.f15939p;
        if (str3 == null) {
            str3 = mVar.f15939p;
        }
        return new m(str3, (b[]) p3.m0.E0(this.f15937n, mVar.f15937n));
    }

    public int hashCode() {
        if (this.f15938o == 0) {
            String str = this.f15939p;
            this.f15938o = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15937n);
        }
        return this.f15938o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15939p);
        parcel.writeTypedArray(this.f15937n, 0);
    }
}
