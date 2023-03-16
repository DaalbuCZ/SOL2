package y2;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f16928a;

    /* renamed from: b  reason: collision with root package name */
    final long f16929b;

    /* renamed from: c  reason: collision with root package name */
    final long f16930c;

    /* loaded from: classes.dex */
    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f16931d;

        /* renamed from: e  reason: collision with root package name */
        final long f16932e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f16933f;

        /* renamed from: g  reason: collision with root package name */
        private final long f16934g;

        /* renamed from: h  reason: collision with root package name */
        private final long f16935h;

        /* renamed from: i  reason: collision with root package name */
        final long f16936i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f16931d = j12;
            this.f16932e = j13;
            this.f16933f = list;
            this.f16936i = j14;
            this.f16934g = j15;
            this.f16935h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            return g10 != -1 ? g10 : (int) (i((j11 - this.f16935h) + this.f16936i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f16934g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f16935h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f16931d;
        }

        public long f(long j10, long j11) {
            if (this.f16933f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f16936i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f16933f;
            if (list != null) {
                return (list.get((int) (j10 - this.f16931d)).f16942b * 1000000) / this.f16929b;
            }
            long g10 = g(j11);
            return (g10 == -1 || j10 != (e() + g10) - 1) ? (this.f16932e * 1000000) / this.f16929b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f16933f == null) {
                long j12 = this.f16931d + (j10 / ((this.f16932e * 1000000) / this.f16929b));
                return j12 < e10 ? e10 : g10 == -1 ? j12 : Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            return j14 == e10 ? j14 : j13;
        }

        public final long j(long j10) {
            List<d> list = this.f16933f;
            return m0.M0(list != null ? list.get((int) (j10 - this.f16931d)).f16941a - this.f16930c : (j10 - this.f16931d) * this.f16932e, 1000000L, this.f16929b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f16933f != null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<i> f16937j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f16937j = list2;
        }

        @Override // y2.k.a
        public long g(long j10) {
            return this.f16937j.size();
        }

        @Override // y2.k.a
        public i k(j jVar, long j10) {
            return this.f16937j.get((int) (j10 - this.f16931d));
        }

        @Override // y2.k.a
        public boolean l() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f16938j;

        /* renamed from: k  reason: collision with root package name */
        final n f16939k;

        /* renamed from: l  reason: collision with root package name */
        final long f16940l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f16938j = nVar;
            this.f16939k = nVar2;
            this.f16940l = j13;
        }

        @Override // y2.k
        public i a(j jVar) {
            n nVar = this.f16938j;
            if (nVar != null) {
                m1 m1Var = jVar.f16915b;
                return new i(nVar.a(m1Var.f13576n, 0L, m1Var.f13583u, 0L), 0L, -1L);
            }
            return super.a(jVar);
        }

        @Override // y2.k.a
        public long g(long j10) {
            List<d> list = this.f16933f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f16940l;
            if (j11 != -1) {
                return (j11 - this.f16931d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return c5.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f16929b)), BigInteger.valueOf(this.f16932e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // y2.k.a
        public i k(j jVar, long j10) {
            List<d> list = this.f16933f;
            long j11 = list != null ? list.get((int) (j10 - this.f16931d)).f16941a : (j10 - this.f16931d) * this.f16932e;
            n nVar = this.f16939k;
            m1 m1Var = jVar.f16915b;
            return new i(nVar.a(m1Var.f13576n, j10, m1Var.f13583u, j11), 0L, -1L);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f16941a;

        /* renamed from: b  reason: collision with root package name */
        final long f16942b;

        public d(long j10, long j11) {
            this.f16941a = j10;
            this.f16942b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f16941a == dVar.f16941a && this.f16942b == dVar.f16942b;
        }

        public int hashCode() {
            return (((int) this.f16941a) * 31) + ((int) this.f16942b);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f16943d;

        /* renamed from: e  reason: collision with root package name */
        final long f16944e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f16943d = j12;
            this.f16944e = j13;
        }

        public i c() {
            long j10 = this.f16944e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f16943d, j10);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f16928a = iVar;
        this.f16929b = j10;
        this.f16930c = j11;
    }

    public i a(j jVar) {
        return this.f16928a;
    }

    public long b() {
        return m0.M0(this.f16930c, 1000000L, this.f16929b);
    }
}
