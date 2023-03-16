package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.v;
import j$.time.temporal.w;
import j$.time.temporal.x;
import j$.time.temporal.y;
import j$.time.temporal.z;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.k, ChronoZonedDateTime<h>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f9427a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f9428b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f9429c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.f9427a = localDateTime;
        this.f9428b = zoneOffset;
        this.f9429c = zoneId;
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return q(Instant.s(System.currentTimeMillis()), new b(zoneId).h());
    }

    private static ZonedDateTime o(long j10, int i10, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.p().d(Instant.u(j10, i10));
        return new ZonedDateTime(LocalDateTime.E(j10, i10, d10), d10, zoneId);
    }

    public static ZonedDateTime of(int i10, int i11, int i12, int i13, int i14, int i15, int i16, ZoneId zoneId) {
        return r(LocalDateTime.C(i10, i11, i12, i13, i14, i15, i16), zoneId, null);
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return r(localDateTime, zoneId, null);
    }

    public static ZonedDateTime q(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return o(instant.q(), instant.r(), zoneId);
    }

    public static ZonedDateTime r(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        j$.time.zone.c p10 = zoneId.p();
        List g10 = p10.g(localDateTime);
        if (g10.size() == 1) {
            zoneOffset = (ZoneOffset) g10.get(0);
        } else if (g10.size() == 0) {
            j$.time.zone.a f10 = p10.f(localDateTime);
            localDateTime = localDateTime.H(f10.c().b());
            zoneOffset = f10.h();
        } else if (zoneOffset == null || !g10.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g10.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    private ZonedDateTime s(LocalDateTime localDateTime) {
        return r(localDateTime, this.f9429c, this.f9428b);
    }

    private ZonedDateTime t(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f9428b) || !this.f9429c.p().g(this.f9427a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f9427a, zoneOffset, this.f9429c);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(n(), chronoZonedDateTime.n());
        if (compare == 0) {
            int u10 = d().u() - chronoZonedDateTime.d().u();
            if (u10 == 0) {
                int compareTo = ((LocalDateTime) f()).compareTo(chronoZonedDateTime.f());
                if (compareTo == 0) {
                    int compareTo2 = j().o().compareTo(chronoZonedDateTime.j().o());
                    if (compareTo2 == 0) {
                        e();
                        j$.time.chrono.g gVar = j$.time.chrono.g.f9432a;
                        Objects.requireNonNull(chronoZonedDateTime.e());
                        return 0;
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return u10;
        }
        return compare;
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k b(j$.time.temporal.l lVar) {
        return r(LocalDateTime.D((h) lVar, this.f9427a.d()), this.f9429c, this.f9428b);
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k c(j$.time.temporal.o oVar, long j10) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i10 = s.f9543a[aVar.ordinal()];
            return i10 != 1 ? i10 != 2 ? s(this.f9427a.c(oVar, j10)) : t(ZoneOffset.v(aVar.m(j10))) : o(j10, getNano(), this.f9429c);
        }
        return (ZonedDateTime) oVar.i(this, j10);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public l d() {
        return this.f9427a.d();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public j$.time.chrono.f e() {
        Objects.requireNonNull((h) u());
        return j$.time.chrono.g.f9432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.f9427a.equals(zonedDateTime.f9427a) && this.f9428b.equals(zonedDateTime.f9428b) && this.f9429c.equals(zonedDateTime.f9429c);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public j$.time.chrono.c f() {
        return this.f9427a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = s.f9543a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? this.f9427a.g(oVar) : this.f9428b.s();
            }
            throw new y("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.chrono.d.a(this, oVar);
    }

    public int getDayOfMonth() {
        return this.f9427a.r();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f9427a.s();
    }

    public int getHour() {
        return this.f9427a.t();
    }

    public int getMinute() {
        return this.f9427a.u();
    }

    public int getMonthValue() {
        return this.f9427a.v();
    }

    public int getNano() {
        return this.f9427a.w();
    }

    public int getSecond() {
        return this.f9427a.x();
    }

    public int getYear() {
        return this.f9427a.y();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return (oVar instanceof j$.time.temporal.a) || (oVar != null && oVar.h(this));
    }

    public int hashCode() {
        return (this.f9427a.hashCode() ^ this.f9428b.hashCode()) ^ Integer.rotateLeft(this.f9429c.hashCode(), 3);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) ? oVar.c() : this.f9427a.i(oVar) : oVar.k(this);
    }

    public boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        int i10 = (n() > chronoZonedDateTime.n() ? 1 : (n() == chronoZonedDateTime.n() ? 0 : -1));
        return i10 < 0 || (i10 == 0 && d().u() < chronoZonedDateTime.d().u());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId j() {
        return this.f9429c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = s.f9543a[((j$.time.temporal.a) oVar).ordinal()];
            return i10 != 1 ? i10 != 2 ? this.f9427a.k(oVar) : this.f9428b.s() : n();
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k l(long j10, x xVar) {
        boolean z10 = xVar instanceof j$.time.temporal.b;
        j$.time.temporal.b bVar = (j$.time.temporal.b) xVar;
        if (!z10) {
            Objects.requireNonNull(bVar);
            return (ZonedDateTime) l(j10, bVar);
        } else if (bVar.b()) {
            return s(this.f9427a.l(j10, bVar));
        } else {
            LocalDateTime l10 = this.f9427a.l(j10, bVar);
            ZoneOffset zoneOffset = this.f9428b;
            ZoneId zoneId = this.f9429c;
            Objects.requireNonNull(l10, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            return zoneId.p().g(l10).contains(zoneOffset) ? new ZonedDateTime(l10, zoneOffset, zoneId) : o(l10.J(zoneOffset), l10.w(), zoneId);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        if (wVar == u.f9564a) {
            return this.f9427a.K();
        }
        if (wVar == t.f9563a || wVar == j$.time.temporal.p.f9559a) {
            return this.f9429c;
        }
        if (wVar == j$.time.temporal.s.f9562a) {
            return this.f9428b;
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

    @Override // j$.time.chrono.ChronoZonedDateTime
    public long n() {
        return ((((h) u()).H() * 86400) + d().E()) - p().s();
    }

    public ZoneOffset p() {
        return this.f9428b;
    }

    public ZonedDateTime plusDays(long j10) {
        return s(this.f9427a.plusDays(j10));
    }

    public Instant toInstant() {
        return Instant.u(n(), d().u());
    }

    public String toString() {
        String str = this.f9427a.toString() + this.f9428b.toString();
        if (this.f9428b != this.f9429c) {
            return str + '[' + this.f9429c.toString() + ']';
        }
        return str;
    }

    public j$.time.chrono.b u() {
        return this.f9427a.K();
    }

    public LocalDateTime v() {
        return this.f9427a;
    }
}
