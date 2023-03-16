package a3;

import android.net.Uri;
import b5.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import w1.m;
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: d  reason: collision with root package name */
    public final int f88d;

    /* renamed from: e  reason: collision with root package name */
    public final long f89e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f90f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f91g;

    /* renamed from: h  reason: collision with root package name */
    public final long f92h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f93i;

    /* renamed from: j  reason: collision with root package name */
    public final int f94j;

    /* renamed from: k  reason: collision with root package name */
    public final long f95k;

    /* renamed from: l  reason: collision with root package name */
    public final int f96l;

    /* renamed from: m  reason: collision with root package name */
    public final long f97m;

    /* renamed from: n  reason: collision with root package name */
    public final long f98n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f99o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f100p;

    /* renamed from: q  reason: collision with root package name */
    public final m f101q;

    /* renamed from: r  reason: collision with root package name */
    public final List<d> f102r;

    /* renamed from: s  reason: collision with root package name */
    public final List<b> f103s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<Uri, c> f104t;

    /* renamed from: u  reason: collision with root package name */
    public final long f105u;

    /* renamed from: v  reason: collision with root package name */
    public final f f106v;

    /* loaded from: classes.dex */
    public static final class b extends e {

        /* renamed from: y  reason: collision with root package name */
        public final boolean f107y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f108z;

        public b(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, mVar, str2, str3, j12, j13, z10);
            this.f107y = z11;
            this.f108z = z12;
        }

        public b g(long j10, int i10) {
            return new b(this.f114n, this.f115o, this.f116p, i10, j10, this.f119s, this.f120t, this.f121u, this.f122v, this.f123w, this.f124x, this.f107y, this.f108z);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f109a;

        /* renamed from: b  reason: collision with root package name */
        public final long f110b;

        /* renamed from: c  reason: collision with root package name */
        public final int f111c;

        public c(Uri uri, long j10, int i10) {
            this.f109a = uri;
            this.f110b = j10;
            this.f111c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends e {

        /* renamed from: y  reason: collision with root package name */
        public final String f112y;

        /* renamed from: z  reason: collision with root package name */
        public final List<b> f113z;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, q.J());
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, m mVar, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, mVar, str3, str4, j12, j13, z10);
            this.f112y = str2;
            this.f113z = q.F(list);
        }

        public d g(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f113z.size(); i11++) {
                b bVar = this.f113z.get(i11);
                arrayList.add(bVar.g(j11, i10));
                j11 += bVar.f116p;
            }
            return new d(this.f114n, this.f115o, this.f112y, this.f116p, i10, j10, this.f119s, this.f120t, this.f121u, this.f122v, this.f123w, this.f124x, arrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: n  reason: collision with root package name */
        public final String f114n;

        /* renamed from: o  reason: collision with root package name */
        public final d f115o;

        /* renamed from: p  reason: collision with root package name */
        public final long f116p;

        /* renamed from: q  reason: collision with root package name */
        public final int f117q;

        /* renamed from: r  reason: collision with root package name */
        public final long f118r;

        /* renamed from: s  reason: collision with root package name */
        public final m f119s;

        /* renamed from: t  reason: collision with root package name */
        public final String f120t;

        /* renamed from: u  reason: collision with root package name */
        public final String f121u;

        /* renamed from: v  reason: collision with root package name */
        public final long f122v;

        /* renamed from: w  reason: collision with root package name */
        public final long f123w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f124x;

        private e(String str, d dVar, long j10, int i10, long j11, m mVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f114n = str;
            this.f115o = dVar;
            this.f116p = j10;
            this.f117q = i10;
            this.f118r = j11;
            this.f119s = mVar;
            this.f120t = str2;
            this.f121u = str3;
            this.f122v = j12;
            this.f123w = j13;
            this.f124x = z10;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(Long l10) {
            if (this.f118r > l10.longValue()) {
                return 1;
            }
            return this.f118r < l10.longValue() ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f125a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f126b;

        /* renamed from: c  reason: collision with root package name */
        public final long f127c;

        /* renamed from: d  reason: collision with root package name */
        public final long f128d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f129e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f125a = j10;
            this.f126b = z10;
            this.f127c = j11;
            this.f128d = j12;
            this.f129e = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, w1.m r31, java.util.List<a3.g.d> r32, java.util.List<a3.g.b> r33, a3.g.f r34, java.util.Map<android.net.Uri, a3.g.c> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f88d = r3
            r3 = r17
            r0.f92h = r3
            r3 = r16
            r0.f91g = r3
            r3 = r19
            r0.f93i = r3
            r3 = r20
            r0.f94j = r3
            r3 = r21
            r0.f95k = r3
            r3 = r23
            r0.f96l = r3
            r3 = r24
            r0.f97m = r3
            r3 = r26
            r0.f98n = r3
            r3 = r29
            r0.f99o = r3
            r3 = r30
            r0.f100p = r3
            r3 = r31
            r0.f101q = r3
            b5.q r3 = b5.q.F(r32)
            r0.f102r = r3
            b5.q r3 = b5.q.F(r33)
            r0.f103s = r3
            b5.r r3 = b5.r.c(r35)
            r0.f104t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = b5.t.c(r33)
            a3.g$b r3 = (a3.g.b) r3
        L58:
            long r6 = r3.f118r
            long r8 = r3.f116p
            long r6 = r6 + r8
            r0.f105u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = b5.t.c(r32)
            a3.g$d r3 = (a3.g.d) r3
            goto L58
        L6d:
            r0.f105u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.f105u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f89e = r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f90f = r1
            r1 = r34
            r0.f106v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, w1.m, java.util.List, java.util.List, a3.g$f, java.util.Map):void");
    }

    @Override // t2.a
    /* renamed from: b */
    public g a(List<t2.c> list) {
        return this;
    }

    public g c(long j10, int i10) {
        return new g(this.f88d, this.f151a, this.f152b, this.f89e, this.f91g, j10, true, i10, this.f95k, this.f96l, this.f97m, this.f98n, this.f153c, this.f99o, this.f100p, this.f101q, this.f102r, this.f103s, this.f106v, this.f104t);
    }

    public g d() {
        return this.f99o ? this : new g(this.f88d, this.f151a, this.f152b, this.f89e, this.f91g, this.f92h, this.f93i, this.f94j, this.f95k, this.f96l, this.f97m, this.f98n, this.f153c, true, this.f100p, this.f101q, this.f102r, this.f103s, this.f106v, this.f104t);
    }

    public long e() {
        return this.f92h + this.f105u;
    }

    public boolean f(g gVar) {
        if (gVar != null) {
            long j10 = this.f95k;
            long j11 = gVar.f95k;
            if (j10 > j11) {
                return true;
            }
            if (j10 < j11) {
                return false;
            }
            int size = this.f102r.size() - gVar.f102r.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.f103s.size();
            int size3 = gVar.f103s.size();
            if (size2 <= size3) {
                return size2 == size3 && this.f99o && !gVar.f99o;
            }
            return true;
        }
        return true;
    }
}
