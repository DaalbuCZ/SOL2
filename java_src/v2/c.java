package v2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p3.m0;
import s1.h;
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: t  reason: collision with root package name */
    public static final c f15567t = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: u  reason: collision with root package name */
    private static final a f15568u = new a(0).j(0);

    /* renamed from: v  reason: collision with root package name */
    public static final h.a<c> f15569v = v2.a.f15565a;

    /* renamed from: n  reason: collision with root package name */
    public final Object f15570n;

    /* renamed from: o  reason: collision with root package name */
    public final int f15571o;

    /* renamed from: p  reason: collision with root package name */
    public final long f15572p;

    /* renamed from: q  reason: collision with root package name */
    public final long f15573q;

    /* renamed from: r  reason: collision with root package name */
    public final int f15574r;

    /* renamed from: s  reason: collision with root package name */
    private final a[] f15575s;

    /* loaded from: classes.dex */
    public static final class a implements h {

        /* renamed from: u  reason: collision with root package name */
        public static final h.a<a> f15576u = b.f15566a;

        /* renamed from: n  reason: collision with root package name */
        public final long f15577n;

        /* renamed from: o  reason: collision with root package name */
        public final int f15578o;

        /* renamed from: p  reason: collision with root package name */
        public final Uri[] f15579p;

        /* renamed from: q  reason: collision with root package name */
        public final int[] f15580q;

        /* renamed from: r  reason: collision with root package name */
        public final long[] f15581r;

        /* renamed from: s  reason: collision with root package name */
        public final long f15582s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f15583t;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            p3.a.a(iArr.length == uriArr.length);
            this.f15577n = j10;
            this.f15578o = i10;
            this.f15580q = iArr;
            this.f15579p = uriArr;
            this.f15581r = jArr;
            this.f15582s = j11;
            this.f15583t = z10;
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a d(Bundle bundle) {
            long j10 = bundle.getLong(h(0));
            int i10 = bundle.getInt(h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j11 = bundle.getLong(h(5));
            boolean z10 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15577n == aVar.f15577n && this.f15578o == aVar.f15578o && Arrays.equals(this.f15579p, aVar.f15579p) && Arrays.equals(this.f15580q, aVar.f15580q) && Arrays.equals(this.f15581r, aVar.f15581r) && this.f15582s == aVar.f15582s && this.f15583t == aVar.f15583t;
        }

        public int f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f15580q;
                if (i11 >= iArr.length || this.f15583t || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean g() {
            if (this.f15578o == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f15578o; i10++) {
                int[] iArr = this.f15580q;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f15577n;
            long j11 = this.f15582s;
            return (((((((((((this.f15578o * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f15579p)) * 31) + Arrays.hashCode(this.f15580q)) * 31) + Arrays.hashCode(this.f15581r)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f15583t ? 1 : 0);
        }

        public boolean i() {
            return this.f15578o == -1 || e() < this.f15578o;
        }

        public a j(int i10) {
            int[] c10 = c(this.f15580q, i10);
            long[] b10 = b(this.f15581r, i10);
            return new a(this.f15577n, i10, c10, (Uri[]) Arrays.copyOf(this.f15579p, i10), b10, this.f15582s, this.f15583t);
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f15570n = obj;
        this.f15572p = j10;
        this.f15573q = j11;
        this.f15571o = aVarArr.length + i10;
        this.f15575s = aVarArr;
        this.f15574r = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f15576u.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(g(2), 0L), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f15577n;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    private static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    public a c(int i10) {
        int i11 = this.f15574r;
        return i10 < i11 ? f15568u : this.f15575s[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                int i10 = this.f15574r;
                while (i10 < this.f15571o && ((c(i10).f15577n != Long.MIN_VALUE && c(i10).f15577n <= j10) || !c(i10).i())) {
                    i10++;
                }
                if (i10 < this.f15571o) {
                    return i10;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f15571o - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return m0.c(this.f15570n, cVar.f15570n) && this.f15571o == cVar.f15571o && this.f15572p == cVar.f15572p && this.f15573q == cVar.f15573q && this.f15574r == cVar.f15574r && Arrays.equals(this.f15575s, cVar.f15575s);
    }

    public int hashCode() {
        int i10 = this.f15571o * 31;
        Object obj = this.f15570n;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f15572p)) * 31) + ((int) this.f15573q)) * 31) + this.f15574r) * 31) + Arrays.hashCode(this.f15575s);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f15570n);
        sb.append(", adResumePositionUs=");
        sb.append(this.f15572p);
        sb.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f15575s.length; i10++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f15575s[i10].f15577n);
            sb.append(", ads=[");
            for (int i11 = 0; i11 < this.f15575s[i10].f15580q.length; i11++) {
                sb.append("ad(state=");
                int i12 = this.f15575s[i10].f15580q[i11];
                sb.append(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f15575s[i10].f15581r[i11]);
                sb.append(')');
                if (i11 < this.f15575s[i10].f15580q.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i10 < this.f15575s.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
