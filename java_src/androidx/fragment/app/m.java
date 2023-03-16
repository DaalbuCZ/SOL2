package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    Fragment A;

    /* renamed from: n  reason: collision with root package name */
    final String f1958n;

    /* renamed from: o  reason: collision with root package name */
    final String f1959o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f1960p;

    /* renamed from: q  reason: collision with root package name */
    final int f1961q;

    /* renamed from: r  reason: collision with root package name */
    final int f1962r;

    /* renamed from: s  reason: collision with root package name */
    final String f1963s;

    /* renamed from: t  reason: collision with root package name */
    final boolean f1964t;

    /* renamed from: u  reason: collision with root package name */
    final boolean f1965u;

    /* renamed from: v  reason: collision with root package name */
    final boolean f1966v;

    /* renamed from: w  reason: collision with root package name */
    final Bundle f1967w;

    /* renamed from: x  reason: collision with root package name */
    final boolean f1968x;

    /* renamed from: y  reason: collision with root package name */
    final int f1969y;

    /* renamed from: z  reason: collision with root package name */
    Bundle f1970z;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<m> {
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

    m(Parcel parcel) {
        this.f1958n = parcel.readString();
        this.f1959o = parcel.readString();
        this.f1960p = parcel.readInt() != 0;
        this.f1961q = parcel.readInt();
        this.f1962r = parcel.readInt();
        this.f1963s = parcel.readString();
        this.f1964t = parcel.readInt() != 0;
        this.f1965u = parcel.readInt() != 0;
        this.f1966v = parcel.readInt() != 0;
        this.f1967w = parcel.readBundle();
        this.f1968x = parcel.readInt() != 0;
        this.f1970z = parcel.readBundle();
        this.f1969y = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Fragment fragment) {
        this.f1958n = fragment.getClass().getName();
        this.f1959o = fragment.f1827r;
        this.f1960p = fragment.f1835z;
        this.f1961q = fragment.I;
        this.f1962r = fragment.J;
        this.f1963s = fragment.K;
        this.f1964t = fragment.N;
        this.f1965u = fragment.f1834y;
        this.f1966v = fragment.M;
        this.f1967w = fragment.f1828s;
        this.f1968x = fragment.L;
        this.f1969y = fragment.f1817e0.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.A == null) {
            Bundle bundle2 = this.f1967w;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a10 = gVar.a(classLoader, this.f1958n);
            this.A = a10;
            a10.h1(this.f1967w);
            Bundle bundle3 = this.f1970z;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.A;
                bundle = this.f1970z;
            } else {
                fragment = this.A;
                bundle = new Bundle();
            }
            fragment.f1824o = bundle;
            Fragment fragment2 = this.A;
            fragment2.f1827r = this.f1959o;
            fragment2.f1835z = this.f1960p;
            fragment2.B = true;
            fragment2.I = this.f1961q;
            fragment2.J = this.f1962r;
            fragment2.K = this.f1963s;
            fragment2.N = this.f1964t;
            fragment2.f1834y = this.f1965u;
            fragment2.M = this.f1966v;
            fragment2.L = this.f1968x;
            fragment2.f1817e0 = e.c.values()[this.f1969y];
            if (j.U) {
                Log.v("FragmentManager", "Instantiated fragment " + this.A);
            }
        }
        return this.A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1958n);
        sb.append(" (");
        sb.append(this.f1959o);
        sb.append(")}:");
        if (this.f1960p) {
            sb.append(" fromLayout");
        }
        if (this.f1962r != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1962r));
        }
        String str = this.f1963s;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1963s);
        }
        if (this.f1964t) {
            sb.append(" retainInstance");
        }
        if (this.f1965u) {
            sb.append(" removing");
        }
        if (this.f1966v) {
            sb.append(" detached");
        }
        if (this.f1968x) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1958n);
        parcel.writeString(this.f1959o);
        parcel.writeInt(this.f1960p ? 1 : 0);
        parcel.writeInt(this.f1961q);
        parcel.writeInt(this.f1962r);
        parcel.writeString(this.f1963s);
        parcel.writeInt(this.f1964t ? 1 : 0);
        parcel.writeInt(this.f1965u ? 1 : 0);
        parcel.writeInt(this.f1966v ? 1 : 0);
        parcel.writeBundle(this.f1967w);
        parcel.writeInt(this.f1968x ? 1 : 0);
        parcel.writeBundle(this.f1970z);
        parcel.writeInt(this.f1969y);
    }
}
