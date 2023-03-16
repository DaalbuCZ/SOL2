package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.e;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    final ArrayList<String> A;
    final boolean B;

    /* renamed from: n  reason: collision with root package name */
    final int[] f1862n;

    /* renamed from: o  reason: collision with root package name */
    final ArrayList<String> f1863o;

    /* renamed from: p  reason: collision with root package name */
    final int[] f1864p;

    /* renamed from: q  reason: collision with root package name */
    final int[] f1865q;

    /* renamed from: r  reason: collision with root package name */
    final int f1866r;

    /* renamed from: s  reason: collision with root package name */
    final int f1867s;

    /* renamed from: t  reason: collision with root package name */
    final String f1868t;

    /* renamed from: u  reason: collision with root package name */
    final int f1869u;

    /* renamed from: v  reason: collision with root package name */
    final int f1870v;

    /* renamed from: w  reason: collision with root package name */
    final CharSequence f1871w;

    /* renamed from: x  reason: collision with root package name */
    final int f1872x;

    /* renamed from: y  reason: collision with root package name */
    final CharSequence f1873y;

    /* renamed from: z  reason: collision with root package name */
    final ArrayList<String> f1874z;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<b> {
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

    public b(Parcel parcel) {
        this.f1862n = parcel.createIntArray();
        this.f1863o = parcel.createStringArrayList();
        this.f1864p = parcel.createIntArray();
        this.f1865q = parcel.createIntArray();
        this.f1866r = parcel.readInt();
        this.f1867s = parcel.readInt();
        this.f1868t = parcel.readString();
        this.f1869u = parcel.readInt();
        this.f1870v = parcel.readInt();
        this.f1871w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1872x = parcel.readInt();
        this.f1873y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1874z = parcel.createStringArrayList();
        this.A = parcel.createStringArrayList();
        this.B = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1971a.size();
        this.f1862n = new int[size * 5];
        if (!aVar.f1978h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1863o = new ArrayList<>(size);
        this.f1864p = new int[size];
        this.f1865q = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            n.a aVar2 = aVar.f1971a.get(i10);
            int i12 = i11 + 1;
            this.f1862n[i11] = aVar2.f1989a;
            ArrayList<String> arrayList = this.f1863o;
            Fragment fragment = aVar2.f1990b;
            arrayList.add(fragment != null ? fragment.f1827r : null);
            int[] iArr = this.f1862n;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f1991c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f1992d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f1993e;
            iArr[i15] = aVar2.f1994f;
            this.f1864p[i10] = aVar2.f1995g.ordinal();
            this.f1865q[i10] = aVar2.f1996h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f1866r = aVar.f1976f;
        this.f1867s = aVar.f1977g;
        this.f1868t = aVar.f1980j;
        this.f1869u = aVar.f1861u;
        this.f1870v = aVar.f1981k;
        this.f1871w = aVar.f1982l;
        this.f1872x = aVar.f1983m;
        this.f1873y = aVar.f1984n;
        this.f1874z = aVar.f1985o;
        this.A = aVar.f1986p;
        this.B = aVar.f1987q;
    }

    public androidx.fragment.app.a a(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f1862n.length) {
            n.a aVar2 = new n.a();
            int i12 = i10 + 1;
            aVar2.f1989a = this.f1862n[i10];
            if (j.U) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f1862n[i12]);
            }
            String str = this.f1863o.get(i11);
            aVar2.f1990b = str != null ? jVar.f1907t.get(str) : null;
            aVar2.f1995g = e.c.values()[this.f1864p[i11]];
            aVar2.f1996h = e.c.values()[this.f1865q[i11]];
            int[] iArr = this.f1862n;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f1991c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f1992d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f1993e = i18;
            int i19 = iArr[i17];
            aVar2.f1994f = i19;
            aVar.f1972b = i14;
            aVar.f1973c = i16;
            aVar.f1974d = i18;
            aVar.f1975e = i19;
            aVar.c(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f1976f = this.f1866r;
        aVar.f1977g = this.f1867s;
        aVar.f1980j = this.f1868t;
        aVar.f1861u = this.f1869u;
        aVar.f1978h = true;
        aVar.f1981k = this.f1870v;
        aVar.f1982l = this.f1871w;
        aVar.f1983m = this.f1872x;
        aVar.f1984n = this.f1873y;
        aVar.f1985o = this.f1874z;
        aVar.f1986p = this.A;
        aVar.f1987q = this.B;
        aVar.h(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1862n);
        parcel.writeStringList(this.f1863o);
        parcel.writeIntArray(this.f1864p);
        parcel.writeIntArray(this.f1865q);
        parcel.writeInt(this.f1866r);
        parcel.writeInt(this.f1867s);
        parcel.writeString(this.f1868t);
        parcel.writeInt(this.f1869u);
        parcel.writeInt(this.f1870v);
        TextUtils.writeToParcel(this.f1871w, parcel, 0);
        parcel.writeInt(this.f1872x);
        TextUtils.writeToParcel(this.f1873y, parcel, 0);
        parcel.writeStringList(this.f1874z);
        parcel.writeStringList(this.A);
        parcel.writeInt(this.B ? 1 : 0);
    }
}
