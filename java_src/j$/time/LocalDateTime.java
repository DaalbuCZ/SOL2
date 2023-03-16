package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.v;
import j$.time.temporal.w;
import j$.time.temporal.x;
import j$.time.temporal.z;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.k, j$.time.temporal.l, j$.time.chrono.c, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f9415c = D(h.f9515d, l.f9524e);

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f9416d = D(h.f9516e, l.f9525f);

    /* renamed from: a  reason: collision with root package name */
    private final h f9417a;

    /* renamed from: b  reason: collision with root package name */
    private final l f9418b;

    private LocalDateTime(h hVar, l lVar) {
        this.f9417a = hVar;
        this.f9418b = lVar;
    }

    public static LocalDateTime B(int i10, int i11, int i12, int i13, int i14) {
        return new LocalDateTime(h.y(i10, i11, i12), l.w(i13, i14));
    }

    public static LocalDateTime C(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new LocalDateTime(h.y(i10, i11, i12), l.x(i13, i14, i15, i16));
    }

    public static LocalDateTime D(h hVar, l lVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(hVar, lVar);
    }

    public static LocalDateTime E(long j10, int i10, ZoneOffset zoneOffset) {
        long s10;
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.o(j11);
        return new LocalDateTime(h.z(c.c(j10 + zoneOffset.s(), 86400L)), l.y((((int) c.b(s10, 86400L)) * 1000000000) + j11));
    }

    private LocalDateTime I(h hVar, long j10, long j11, long j12, long j13, int i10) {
        l y10;
        h hVar2 = hVar;
        if ((j10 | j11 | j12 | j13) == 0) {
            y10 = this.f9418b;
        } else {
            long j14 = i10;
            long D = this.f9418b.D();
            long j15 = ((((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L)) * j14) + D;
            long c10 = c.c(j15, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
            long b10 = c.b(j15, 86400000000000L);
            y10 = b10 == D ? this.f9418b : l.y(b10);
            hVar2 = hVar2.C(c10);
        }
        return M(hVar2, y10);
    }

    private LocalDateTime M(h hVar, l lVar) {
        return (this.f9417a == hVar && this.f9418b == lVar) ? this : new LocalDateTime(hVar, lVar);
    }

    private int p(LocalDateTime localDateTime) {
        int p10 = this.f9417a.p(localDateTime.f9417a);
        return p10 == 0 ? this.f9418b.compareTo(localDateTime.f9418b) : p10;
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.e(charSequence, i.f9520a);
    }

    public static LocalDateTime q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).v();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(h.q(temporalAccessor), l.q(temporalAccessor));
        } catch (d e10) {
            throw new d("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public boolean A(j$.time.chrono.c cVar) {
        if (cVar instanceof LocalDateTime) {
            return p((LocalDateTime) cVar) < 0;
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int i10 = (((h) L()).H() > ((h) localDateTime.L()).H() ? 1 : (((h) L()).H() == ((h) localDateTime.L()).H() ? 0 : -1));
        return i10 < 0 || (i10 == 0 && d().D() < localDateTime.d().D());
    }

    @Override // j$.time.temporal.k
    /* renamed from: F */
    public LocalDateTime l(long j10, x xVar) {
        if (xVar instanceof j$.time.temporal.b) {
            switch (j.f9521a[((j$.time.temporal.b) xVar).ordinal()]) {
                case 1:
                    return G(j10);
                case 2:
                    return plusDays(j10 / 86400000000L).G((j10 % 86400000000L) * 1000);
                case 3:
                    return plusDays(j10 / 86400000).G((j10 % 86400000) * 1000000);
                case 4:
                    return H(j10);
                case 5:
                    return I(this.f9417a, 0L, j10, 0L, 0L, 1);
                case 6:
                    return I(this.f9417a, j10, 0L, 0L, 0L, 1);
                case 7:
                    LocalDateTime plusDays = plusDays(j10 / 256);
                    return plusDays.I(plusDays.f9417a, (j10 % 256) * 12, 0L, 0L, 0L, 1);
                default:
                    return M(this.f9417a.l(j10, xVar), this.f9418b);
            }
        }
        return (LocalDateTime) xVar.a(this, j10);
    }

    public LocalDateTime G(long j10) {
        return I(this.f9417a, 0L, 0L, 0L, j10, 1);
    }

    public LocalDateTime H(long j10) {
        return I(this.f9417a, 0L, 0L, j10, 0L, 1);
    }

    public long J(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((((h) L()).H() * 86400) + d().E()) - zoneOffset.s();
    }

    public h K() {
        return this.f9417a;
    }

    public j$.time.chrono.b L() {
        return this.f9417a;
    }

    @Override // j$.time.temporal.k
    /* renamed from: N */
    public LocalDateTime b(j$.time.temporal.l lVar) {
        return lVar instanceof h ? M((h) lVar, this.f9418b) : lVar instanceof l ? M(this.f9417a, (l) lVar) : lVar instanceof LocalDateTime ? (LocalDateTime) lVar : (LocalDateTime) lVar.a(this);
    }

    @Override // j$.time.temporal.k
    /* renamed from: O */
    public LocalDateTime c(j$.time.temporal.o oVar, long j10) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).g() ? M(this.f9417a, this.f9418b.c(oVar, j10)) : M(this.f9417a.c(oVar, j10), this.f9418b) : (LocalDateTime) oVar.i(this, j10);
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.EPOCH_DAY, this.f9417a.H()).c(j$.time.temporal.a.NANO_OF_DAY, this.f9418b.D());
    }

    public l d() {
        return this.f9418b;
    }

    public j$.time.chrono.f e() {
        Objects.requireNonNull((h) L());
        return j$.time.chrono.g.f9432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f9417a.equals(localDateTime.f9417a) && this.f9418b.equals(localDateTime.f9418b);
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).g() ? this.f9418b.g(oVar) : this.f9417a.g(oVar) : j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.h(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.l() || aVar.g();
    }

    public int hashCode() {
        return this.f9417a.hashCode() ^ this.f9418b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).g()) {
                l lVar = this.f9418b;
                Objects.requireNonNull(lVar);
                return j$.time.temporal.n.d(lVar, oVar);
            }
            return this.f9417a.i(oVar);
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).g() ? this.f9418b.k(oVar) : this.f9417a.k(oVar) : oVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        if (wVar == u.f9564a) {
            return this.f9417a;
        }
        if (wVar == j$.time.temporal.p.f9559a || wVar == t.f9563a || wVar == j$.time.temporal.s.f9562a) {
            return null;
        }
        if (wVar == v.f9565a) {
            return d();
        }
        if (wVar != j$.time.temporal.q.f9560a) {
            return wVar == j$.time.temporal.r.f9561a ? j$.time.temporal.b.NANOS : wVar.a(this);
        }
        e();
        return j$.time.chrono.g.f9432a;
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(j$.time.chrono.c cVar) {
        if (cVar instanceof LocalDateTime) {
            return p((LocalDateTime) cVar);
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int compareTo = ((h) L()).compareTo(localDateTime.L());
        if (compareTo == 0) {
            int compareTo2 = d().compareTo(localDateTime.d());
            if (compareTo2 == 0) {
                e();
                j$.time.chrono.g gVar = j$.time.chrono.g.f9432a;
                localDateTime.e();
                return 0;
            }
            return compareTo2;
        }
        return compareTo;
    }

    public LocalDateTime plusDays(long j10) {
        return M(this.f9417a.C(j10), this.f9418b);
    }

    public LocalDateTime plusWeeks(long j10) {
        return M(this.f9417a.E(j10), this.f9418b);
    }

    public int r() {
        return this.f9417a.s();
    }

    public DayOfWeek s() {
        return this.f9417a.t();
    }

    public int t() {
        return this.f9418b.s();
    }

    public String toString() {
        return this.f9417a.toString() + 'T' + this.f9418b.toString();
    }

    public int u() {
        return this.f9418b.t();
    }

    public int v() {
        return this.f9417a.v();
    }

    public int w() {
        return this.f9418b.u();
    }

    public int x() {
        return this.f9418b.v();
    }

    public int y() {
        return this.f9417a.w();
    }

    public boolean z(j$.time.chrono.c cVar) {
        if (cVar instanceof LocalDateTime) {
            return p((LocalDateTime) cVar) > 0;
        }
        LocalDateTime localDateTime = (LocalDateTime) cVar;
        int i10 = (((h) L()).H() > ((h) localDateTime.L()).H() ? 1 : (((h) L()).H() == ((h) localDateTime.L()).H() ? 0 : -1));
        return i10 > 0 || (i10 == 0 && d().D() > localDateTime.d().D());
    }
}
