package c3;

import android.net.Uri;
import f2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p3.k0;
import p3.m0;
import s1.m1;
import t2.c;
/* loaded from: classes.dex */
public class a implements t2.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f3150a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3151b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3152c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3153d;

    /* renamed from: e  reason: collision with root package name */
    public final C0071a f3154e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f3155f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3156g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3157h;

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f3158a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f3159b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f3160c;

        public C0071a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f3158a = uuid;
            this.f3159b = bArr;
            this.f3160c = pVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3161a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3162b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3163c;

        /* renamed from: d  reason: collision with root package name */
        public final String f3164d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3165e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3166f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3167g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3168h;

        /* renamed from: i  reason: collision with root package name */
        public final String f3169i;

        /* renamed from: j  reason: collision with root package name */
        public final m1[] f3170j;

        /* renamed from: k  reason: collision with root package name */
        public final int f3171k;

        /* renamed from: l  reason: collision with root package name */
        private final String f3172l;

        /* renamed from: m  reason: collision with root package name */
        private final String f3173m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Long> f3174n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f3175o;

        /* renamed from: p  reason: collision with root package name */
        private final long f3176p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, m1[] m1VarArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, m1VarArr, list, m0.N0(list, 1000000L, j10), m0.M0(j11, 1000000L, j10));
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, m1[] m1VarArr, List<Long> list, long[] jArr, long j11) {
            this.f3172l = str;
            this.f3173m = str2;
            this.f3161a = i10;
            this.f3162b = str3;
            this.f3163c = j10;
            this.f3164d = str4;
            this.f3165e = i11;
            this.f3166f = i12;
            this.f3167g = i13;
            this.f3168h = i14;
            this.f3169i = str5;
            this.f3170j = m1VarArr;
            this.f3174n = list;
            this.f3175o = jArr;
            this.f3176p = j11;
            this.f3171k = list.size();
        }

        public Uri a(int i10, int i11) {
            p3.a.f(this.f3170j != null);
            p3.a.f(this.f3174n != null);
            p3.a.f(i11 < this.f3174n.size());
            String num = Integer.toString(this.f3170j[i10].f13583u);
            String l10 = this.f3174n.get(i11).toString();
            return k0.e(this.f3172l, this.f3173m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(m1[] m1VarArr) {
            return new b(this.f3172l, this.f3173m, this.f3161a, this.f3162b, this.f3163c, this.f3164d, this.f3165e, this.f3166f, this.f3167g, this.f3168h, this.f3169i, m1VarArr, this.f3174n, this.f3175o, this.f3176p);
        }

        public long c(int i10) {
            if (i10 == this.f3171k - 1) {
                return this.f3176p;
            }
            long[] jArr = this.f3175o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return m0.i(this.f3175o, j10, true, true);
        }

        public long e(int i10) {
            return this.f3175o[i10];
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0071a c0071a, b[] bVarArr) {
        this.f3150a = i10;
        this.f3151b = i11;
        this.f3156g = j10;
        this.f3157h = j11;
        this.f3152c = i12;
        this.f3153d = z10;
        this.f3154e = c0071a;
        this.f3155f = bVarArr;
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0071a c0071a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : m0.M0(j11, 1000000L, j10), j12 != 0 ? m0.M0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0071a, bVarArr);
    }

    @Override // t2.a
    /* renamed from: b */
    public final a a(List<c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f3155f[cVar.f14710o];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((m1[]) arrayList3.toArray(new m1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f3170j[cVar.f14711p]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((m1[]) arrayList3.toArray(new m1[0])));
        }
        return new a(this.f3150a, this.f3151b, this.f3156g, this.f3157h, this.f3152c, this.f3153d, this.f3154e, (b[]) arrayList2.toArray(new b[0]));
    }
}
