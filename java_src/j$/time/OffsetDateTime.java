package j$.time;

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
public final class OffsetDateTime implements j$.time.temporal.k, j$.time.temporal.l, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f9419a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f9420b;

    static {
        new OffsetDateTime(LocalDateTime.f9415c, ZoneOffset.f9424f);
        new OffsetDateTime(LocalDateTime.f9416d, ZoneOffset.f9423e);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f9419a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f9420b = zoneOffset;
    }

    public static OffsetDateTime o(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset d10 = j$.time.zone.c.i((ZoneOffset) zoneId).d(instant);
        return new OffsetDateTime(LocalDateTime.E(instant.q(), instant.r(), d10), d10);
    }

    private OffsetDateTime p(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f9419a == localDateTime && this.f9420b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.EPOCH_DAY, this.f9419a.K().H()).c(j$.time.temporal.a.NANO_OF_DAY, d().D()).c(j$.time.temporal.a.OFFSET_SECONDS, this.f9420b.s());
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k b(j$.time.temporal.l lVar) {
        return p(this.f9419a.b(lVar), this.f9420b);
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k c(j$.time.temporal.o oVar, long j10) {
        LocalDateTime localDateTime;
        ZoneOffset v10;
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i10 = o.f9535a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    localDateTime = this.f9419a.c(oVar, j10);
                    v10 = this.f9420b;
                } else {
                    localDateTime = this.f9419a;
                    v10 = ZoneOffset.v(aVar.m(j10));
                }
                return p(localDateTime, v10);
            }
            return o(Instant.u(j10, this.f9419a.w()), this.f9420b);
        }
        return (OffsetDateTime) oVar.i(this, j10);
    }

    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f9420b.equals(offsetDateTime2.f9420b)) {
            compare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            compare = Long.compare(n(), offsetDateTime2.n());
            if (compare == 0) {
                compare = d().u() - offsetDateTime2.d().u();
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

    public l d() {
        return this.f9419a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f9419a.equals(offsetDateTime.f9419a) && this.f9420b.equals(offsetDateTime.f9420b);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = o.f9535a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? this.f9419a.g(oVar) : this.f9420b.s();
            }
            throw new y("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return (oVar instanceof j$.time.temporal.a) || (oVar != null && oVar.h(this));
    }

    public int hashCode() {
        return this.f9419a.hashCode() ^ this.f9420b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) ? oVar.c() : this.f9419a.i(oVar) : oVar.k(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = o.f9535a[((j$.time.temporal.a) oVar).ordinal()];
            return i10 != 1 ? i10 != 2 ? this.f9419a.k(oVar) : this.f9420b.s() : n();
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k l(long j10, x xVar) {
        if (xVar instanceof j$.time.temporal.b) {
            return p(this.f9419a.l(j10, xVar), this.f9420b);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) xVar;
        Objects.requireNonNull(bVar);
        return (OffsetDateTime) l(j10, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        if (wVar == j$.time.temporal.s.f9562a || wVar == t.f9563a) {
            return this.f9420b;
        }
        if (wVar == j$.time.temporal.p.f9559a) {
            return null;
        }
        if (wVar == u.f9564a) {
            return this.f9419a.K();
        }
        return wVar == v.f9565a ? d() : wVar == j$.time.temporal.q.f9560a ? j$.time.chrono.g.f9432a : wVar == j$.time.temporal.r.f9561a ? j$.time.temporal.b.NANOS : wVar.a(this);
    }

    public long n() {
        return this.f9419a.J(this.f9420b);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f9419a;
    }

    public String toString() {
        return this.f9419a.toString() + this.f9420b.toString();
    }
}
