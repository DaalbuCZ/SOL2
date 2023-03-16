package s0;

import java.util.List;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f13229s = k0.j.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final l.a<List<Object>, List<Object>> f13230t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f13231a;

    /* renamed from: b  reason: collision with root package name */
    public k0.s f13232b;

    /* renamed from: c  reason: collision with root package name */
    public String f13233c;

    /* renamed from: d  reason: collision with root package name */
    public String f13234d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f13235e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.b f13236f;

    /* renamed from: g  reason: collision with root package name */
    public long f13237g;

    /* renamed from: h  reason: collision with root package name */
    public long f13238h;

    /* renamed from: i  reason: collision with root package name */
    public long f13239i;

    /* renamed from: j  reason: collision with root package name */
    public k0.b f13240j;

    /* renamed from: k  reason: collision with root package name */
    public int f13241k;

    /* renamed from: l  reason: collision with root package name */
    public k0.a f13242l;

    /* renamed from: m  reason: collision with root package name */
    public long f13243m;

    /* renamed from: n  reason: collision with root package name */
    public long f13244n;

    /* renamed from: o  reason: collision with root package name */
    public long f13245o;

    /* renamed from: p  reason: collision with root package name */
    public long f13246p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f13247q;

    /* renamed from: r  reason: collision with root package name */
    public k0.n f13248r;

    /* loaded from: classes.dex */
    class a implements l.a<List<Object>, List<Object>> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f13249a;

        /* renamed from: b  reason: collision with root package name */
        public k0.s f13250b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f13250b != bVar.f13250b) {
                    return false;
                }
                return this.f13249a.equals(bVar.f13249a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f13249a.hashCode() * 31) + this.f13250b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f13232b = k0.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f2561c;
        this.f13235e = bVar;
        this.f13236f = bVar;
        this.f13240j = k0.b.f10469i;
        this.f13242l = k0.a.EXPONENTIAL;
        this.f13243m = 30000L;
        this.f13246p = -1L;
        this.f13248r = k0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f13231a = str;
        this.f13233c = str2;
    }

    public p(p pVar) {
        this.f13232b = k0.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f2561c;
        this.f13235e = bVar;
        this.f13236f = bVar;
        this.f13240j = k0.b.f10469i;
        this.f13242l = k0.a.EXPONENTIAL;
        this.f13243m = 30000L;
        this.f13246p = -1L;
        this.f13248r = k0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f13231a = pVar.f13231a;
        this.f13233c = pVar.f13233c;
        this.f13232b = pVar.f13232b;
        this.f13234d = pVar.f13234d;
        this.f13235e = new androidx.work.b(pVar.f13235e);
        this.f13236f = new androidx.work.b(pVar.f13236f);
        this.f13237g = pVar.f13237g;
        this.f13238h = pVar.f13238h;
        this.f13239i = pVar.f13239i;
        this.f13240j = new k0.b(pVar.f13240j);
        this.f13241k = pVar.f13241k;
        this.f13242l = pVar.f13242l;
        this.f13243m = pVar.f13243m;
        this.f13244n = pVar.f13244n;
        this.f13245o = pVar.f13245o;
        this.f13246p = pVar.f13246p;
        this.f13247q = pVar.f13247q;
        this.f13248r = pVar.f13248r;
    }

    public long a() {
        if (c()) {
            return this.f13244n + Math.min(18000000L, this.f13242l == k0.a.LINEAR ? this.f13243m * this.f13241k : Math.scalb((float) this.f13243m, this.f13241k - 1));
        }
        if (!d()) {
            long j10 = this.f13244n;
            if (j10 == 0) {
                j10 = System.currentTimeMillis();
            }
            return j10 + this.f13237g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f13244n;
        long j12 = j11 == 0 ? currentTimeMillis + this.f13237g : j11;
        long j13 = this.f13239i;
        long j14 = this.f13238h;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (j13 != j14) {
            return j12 + j14 + (i10 == 0 ? j13 * (-1) : 0L);
        }
        return j12 + (i10 != 0 ? j14 : 0L);
    }

    public boolean b() {
        return !k0.b.f10469i.equals(this.f13240j);
    }

    public boolean c() {
        return this.f13232b == k0.s.ENQUEUED && this.f13241k > 0;
    }

    public boolean d() {
        return this.f13238h != 0;
    }

    public void e(long j10) {
        if (j10 > 18000000) {
            k0.j.c().h(f13229s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j10 = 18000000;
        }
        if (j10 < 10000) {
            k0.j.c().h(f13229s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j10 = 10000;
        }
        this.f13243m = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f13237g == pVar.f13237g && this.f13238h == pVar.f13238h && this.f13239i == pVar.f13239i && this.f13241k == pVar.f13241k && this.f13243m == pVar.f13243m && this.f13244n == pVar.f13244n && this.f13245o == pVar.f13245o && this.f13246p == pVar.f13246p && this.f13247q == pVar.f13247q && this.f13231a.equals(pVar.f13231a) && this.f13232b == pVar.f13232b && this.f13233c.equals(pVar.f13233c)) {
            String str = this.f13234d;
            if (str == null ? pVar.f13234d == null : str.equals(pVar.f13234d)) {
                return this.f13235e.equals(pVar.f13235e) && this.f13236f.equals(pVar.f13236f) && this.f13240j.equals(pVar.f13240j) && this.f13242l == pVar.f13242l && this.f13248r == pVar.f13248r;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f13231a.hashCode() * 31) + this.f13232b.hashCode()) * 31) + this.f13233c.hashCode()) * 31;
        String str = this.f13234d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f13237g;
        long j11 = this.f13238h;
        long j12 = this.f13239i;
        long j13 = this.f13243m;
        long j14 = this.f13244n;
        long j15 = this.f13245o;
        long j16 = this.f13246p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f13235e.hashCode()) * 31) + this.f13236f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f13240j.hashCode()) * 31) + this.f13241k) * 31) + this.f13242l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f13247q ? 1 : 0)) * 31) + this.f13248r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f13231a + "}";
    }
}
