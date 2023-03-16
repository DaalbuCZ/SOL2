package s1;
/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: c  reason: collision with root package name */
    public static final d3 f13351c;

    /* renamed from: d  reason: collision with root package name */
    public static final d3 f13352d;

    /* renamed from: e  reason: collision with root package name */
    public static final d3 f13353e;

    /* renamed from: f  reason: collision with root package name */
    public static final d3 f13354f;

    /* renamed from: g  reason: collision with root package name */
    public static final d3 f13355g;

    /* renamed from: a  reason: collision with root package name */
    public final long f13356a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13357b;

    static {
        d3 d3Var = new d3(0L, 0L);
        f13351c = d3Var;
        f13352d = new d3(Long.MAX_VALUE, Long.MAX_VALUE);
        f13353e = new d3(Long.MAX_VALUE, 0L);
        f13354f = new d3(0L, Long.MAX_VALUE);
        f13355g = d3Var;
    }

    public d3(long j10, long j11) {
        p3.a.a(j10 >= 0);
        p3.a.a(j11 >= 0);
        this.f13356a = j10;
        this.f13357b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f13356a;
        if (j13 == 0 && this.f13357b == 0) {
            return j10;
        }
        long S0 = p3.m0.S0(j10, j13, Long.MIN_VALUE);
        long b10 = p3.m0.b(j10, this.f13357b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = S0 <= j11 && j11 <= b10;
        if (S0 > j12 || j12 > b10) {
            z10 = false;
        }
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : S0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.class != obj.getClass()) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f13356a == d3Var.f13356a && this.f13357b == d3Var.f13357b;
    }

    public int hashCode() {
        return (((int) this.f13356a) * 31) + ((int) this.f13357b);
    }
}
