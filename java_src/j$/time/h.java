package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.v;
import j$.time.temporal.w;
import j$.time.temporal.x;
import j$.time.temporal.y;
import j$.time.temporal.z;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class h implements j$.time.temporal.k, j$.time.temporal.l, j$.time.chrono.b, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final h f9515d = y(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final h f9516e = y(999999999, 12, 31);

    /* renamed from: a  reason: collision with root package name */
    private final int f9517a;

    /* renamed from: b  reason: collision with root package name */
    private final short f9518b;

    /* renamed from: c  reason: collision with root package name */
    private final short f9519c;

    private h(int i10, int i11, int i12) {
        this.f9517a = i10;
        this.f9518b = (short) i11;
        this.f9519c = (short) i12;
    }

    public static h A(int i10, int i11) {
        long j10 = i10;
        j$.time.temporal.a.YEAR.o(j10);
        j$.time.temporal.a.DAY_OF_YEAR.o(i11);
        boolean c10 = j$.time.chrono.g.f9432a.c(j10);
        if (i11 == 366 && !c10) {
            throw new d("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        n r10 = n.r(((i11 - 1) / 31) + 1);
        if (i11 > (r10.q(c10) + r10.o(c10)) - 1) {
            r10 = r10.s(1L);
        }
        return new h(i10, r10.p(), (i11 - r10.o(c10)) + 1);
    }

    private static h G(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            return new h(i10, i11, i12);
        }
        i13 = j$.time.chrono.g.f9432a.c((long) i10) ? 29 : 28;
        i12 = Math.min(i12, i13);
        return new h(i10, i11, i12);
    }

    public static h q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        int i10 = j$.time.temporal.n.f9558a;
        h hVar = (h) temporalAccessor.m(u.f9564a);
        if (hVar != null) {
            return hVar;
        }
        throw new d("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int r(j$.time.temporal.o oVar) {
        switch (g.f9513a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.f9519c;
            case 2:
                return u();
            case 3:
                return ((this.f9519c - 1) / 7) + 1;
            case 4:
                int i10 = this.f9517a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return t().o();
            case 6:
                return ((this.f9519c - 1) % 7) + 1;
            case 7:
                return ((u() - 1) % 7) + 1;
            case 8:
                throw new y("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((u() - 1) / 7) + 1;
            case 10:
                return this.f9518b;
            case 11:
                throw new y("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f9517a;
            case 13:
                return this.f9517a >= 1 ? 1 : 0;
            default:
                throw new y("Unsupported field: " + oVar);
        }
    }

    public static h y(int i10, int i11, int i12) {
        long j10 = i10;
        j$.time.temporal.a.YEAR.o(j10);
        j$.time.temporal.a.MONTH_OF_YEAR.o(i11);
        j$.time.temporal.a.DAY_OF_MONTH.o(i12);
        if (i12 > 28) {
            int i13 = 31;
            if (i11 == 2) {
                i13 = j$.time.chrono.g.f9432a.c(j10) ? 29 : 28;
            } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new d("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                StringBuilder b10 = a.b("Invalid date '");
                b10.append(n.r(i11).name());
                b10.append(" ");
                b10.append(i12);
                b10.append("'");
                throw new d(b10.toString());
            }
        }
        return new h(i10, i11, i12);
    }

    public static h z(long j10) {
        long j11;
        long j12 = (j10 + 719528) - 60;
        if (j12 < 0) {
            long j13 = ((j12 + 1) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.m(j14 + j11 + (i11 / 10)), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    @Override // j$.time.temporal.k
    /* renamed from: B */
    public h l(long j10, x xVar) {
        if (xVar instanceof j$.time.temporal.b) {
            switch (g.f9514b[((j$.time.temporal.b) xVar).ordinal()]) {
                case 1:
                    return C(j10);
                case 2:
                    return E(j10);
                case 3:
                    return D(j10);
                case 4:
                    return F(j10);
                case 5:
                    return F(c.d(j10, 10L));
                case 6:
                    return F(c.d(j10, 100L));
                case 7:
                    return F(c.d(j10, 1000L));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(aVar, c.a(k(aVar), j10));
                default:
                    throw new y("Unsupported unit: " + xVar);
            }
        }
        return (h) xVar.a(this, j10);
    }

    public h C(long j10) {
        return j10 == 0 ? this : z(c.a(H(), j10));
    }

    public h D(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f9517a * 12) + (this.f9518b - 1) + j10;
        return G(j$.time.temporal.a.YEAR.m(c.c(j11, 12L)), ((int) c.b(j11, 12L)) + 1, this.f9519c);
    }

    public h E(long j10) {
        return C(c.d(j10, 7L));
    }

    public h F(long j10) {
        return j10 == 0 ? this : G(j$.time.temporal.a.YEAR.m(this.f9517a + j10), this.f9518b, this.f9519c);
    }

    public long H() {
        long j10;
        long j11 = this.f9517a;
        long j12 = this.f9518b;
        long j13 = (365 * j11) + 0;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + (this.f9519c - 1);
        if (j12 > 2) {
            j14--;
            if (!x()) {
                j14--;
            }
        }
        return j14 - 719528;
    }

    @Override // j$.time.temporal.k
    /* renamed from: I */
    public h c(j$.time.temporal.o oVar, long j10) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.o(j10);
            switch (g.f9513a[aVar.ordinal()]) {
                case 1:
                    int i10 = (int) j10;
                    return this.f9519c == i10 ? this : y(this.f9517a, this.f9518b, i10);
                case 2:
                    int i11 = (int) j10;
                    return u() == i11 ? this : A(this.f9517a, i11);
                case 3:
                    return E(j10 - k(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.f9517a < 1) {
                        j10 = 1 - j10;
                    }
                    return L((int) j10);
                case 5:
                    return C(j10 - t().o());
                case 6:
                    return C(j10 - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return C(j10 - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return z(j10);
                case 9:
                    return E(j10 - k(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i12 = (int) j10;
                    if (this.f9518b == i12) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.o(i12);
                    return G(this.f9517a, i12, this.f9519c);
                case 11:
                    return D(j10 - (((this.f9517a * 12) + this.f9518b) - 1));
                case 12:
                    return L((int) j10);
                case 13:
                    return k(j$.time.temporal.a.ERA) == j10 ? this : L(1 - this.f9517a);
                default:
                    throw new y("Unsupported field: " + oVar);
            }
        }
        return (h) oVar.i(this, j10);
    }

    public j$.time.chrono.b J(j$.time.temporal.l lVar) {
        boolean z10 = lVar instanceof h;
        j$.time.temporal.k kVar = lVar;
        if (!z10) {
            kVar = ((j$.time.temporal.m) lVar).a(this);
        }
        return (h) kVar;
    }

    public h K(int i10) {
        return u() == i10 ? this : A(this.f9517a, i10);
    }

    public h L(int i10) {
        if (this.f9517a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.o(i10);
        return G(i10, this.f9518b, this.f9519c);
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.EPOCH_DAY, H());
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k b(j$.time.temporal.l lVar) {
        return (h) lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && p((h) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? r(oVar) : j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar.l() : oVar != null && oVar.h(this);
    }

    public int hashCode() {
        int i10 = this.f9517a;
        return (((i10 << 11) + (this.f9518b << 6)) + this.f9519c) ^ (i10 & (-2048));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        int i10;
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (!aVar.l()) {
                throw new y("Unsupported field: " + oVar);
            }
            int i11 = g.f9513a[aVar.ordinal()];
            if (i11 == 1) {
                short s10 = this.f9518b;
                i10 = s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : x() ? 29 : 28;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    return z.i(1L, (n.r(this.f9518b) != n.FEBRUARY || x()) ? 5L : 4L);
                } else if (i11 != 4) {
                    return oVar.c();
                } else {
                    return z.i(1L, this.f9517a <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                i10 = x() ? 366 : 365;
            }
            return z.i(1L, i10);
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.EPOCH_DAY) {
                return H();
            }
            if (oVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return ((this.f9517a * 12) + this.f9518b) - 1;
            }
            return r(oVar);
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        if (wVar == u.f9564a) {
            return this;
        }
        if (wVar == j$.time.temporal.p.f9559a || wVar == t.f9563a || wVar == j$.time.temporal.s.f9562a || wVar == v.f9565a) {
            return null;
        }
        if (wVar == j$.time.temporal.q.f9560a) {
            return j$.time.chrono.g.f9432a;
        }
        return wVar == j$.time.temporal.r.f9561a ? j$.time.temporal.b.DAYS : wVar.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof h) {
            return p((h) bVar);
        }
        int compare = Long.compare(H(), ((h) bVar).H());
        if (compare == 0) {
            j$.time.chrono.g gVar = j$.time.chrono.g.f9432a;
            return 0;
        }
        return compare;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p(h hVar) {
        int i10 = this.f9517a - hVar.f9517a;
        if (i10 == 0) {
            int i11 = this.f9518b - hVar.f9518b;
            return i11 == 0 ? this.f9519c - hVar.f9519c : i11;
        }
        return i10;
    }

    public int s() {
        return this.f9519c;
    }

    public DayOfWeek t() {
        return DayOfWeek.p(((int) c.b(H() + 3, 7L)) + 1);
    }

    public String toString() {
        int i10;
        int i11 = this.f9517a;
        short s10 = this.f9518b;
        short s11 = this.f9519c;
        int abs = Math.abs(i11);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i11 < 0) {
                sb.append(i11 - 10000);
                i10 = 1;
            } else {
                sb.append(i11 + 10000);
                i10 = 0;
            }
            sb.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb.append('+');
            }
            sb.append(i11);
        }
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        sb.append(s11 >= 10 ? "-" : "-0");
        sb.append((int) s11);
        return sb.toString();
    }

    public int u() {
        return (n.r(this.f9518b).o(x()) + this.f9519c) - 1;
    }

    public int v() {
        return this.f9518b;
    }

    public int w() {
        return this.f9517a;
    }

    public boolean x() {
        return j$.time.chrono.g.f9432a.c(this.f9517a);
    }
}
