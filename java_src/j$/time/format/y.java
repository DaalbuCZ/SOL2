package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y implements TemporalAccessor {

    /* renamed from: b  reason: collision with root package name */
    ZoneId f9505b;

    /* renamed from: c  reason: collision with root package name */
    j$.time.chrono.f f9506c;

    /* renamed from: d  reason: collision with root package name */
    boolean f9507d;

    /* renamed from: e  reason: collision with root package name */
    private z f9508e;

    /* renamed from: f  reason: collision with root package name */
    private j$.time.chrono.b f9509f;

    /* renamed from: g  reason: collision with root package name */
    private j$.time.l f9510g;

    /* renamed from: a  reason: collision with root package name */
    final Map f9504a = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    j$.time.p f9511h = j$.time.p.f9536d;

    private void a(TemporalAccessor temporalAccessor) {
        Iterator it = this.f9504a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.o oVar = (j$.time.temporal.o) entry.getKey();
            if (temporalAccessor.h(oVar)) {
                try {
                    long k10 = temporalAccessor.k(oVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (k10 != longValue) {
                        throw new j$.time.d("Conflict found: Field " + oVar + " " + k10 + " differs from " + oVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void p() {
        if (this.f9504a.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f9505b;
            if (zoneId == null) {
                Long l10 = (Long) this.f9504a.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l10 == null) {
                    return;
                }
                zoneId = ZoneOffset.v(l10.intValue());
            }
            q(zoneId);
        }
    }

    private void q(ZoneId zoneId) {
        Map map = this.f9504a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        Instant t10 = Instant.t(((Long) map.remove(aVar)).longValue());
        Objects.requireNonNull((j$.time.chrono.g) this.f9506c);
        ZonedDateTime q10 = ZonedDateTime.q(t10, zoneId);
        u(q10.u());
        v(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(q10.d().E()));
    }

    private void r(long j10, long j11, long j12, long j13) {
        j$.time.l x10;
        j$.time.p pVar;
        if (this.f9508e == z.LENIENT) {
            long a10 = j$.time.c.a(j$.time.c.a(j$.time.c.a(j$.time.c.d(j10, 3600000000000L), j$.time.c.d(j11, 60000000000L)), j$.time.c.d(j12, 1000000000L)), j13);
            x10 = j$.time.l.y(j$.time.c.b(a10, 86400000000000L));
            pVar = j$.time.p.d((int) j$.time.c.c(a10, 86400000000000L));
        } else {
            int m10 = j$.time.temporal.a.MINUTE_OF_HOUR.m(j11);
            int m11 = j$.time.temporal.a.NANO_OF_SECOND.m(j13);
            if (this.f9508e == z.SMART && j10 == 24 && m10 == 0 && j12 == 0 && m11 == 0) {
                x10 = j$.time.l.f9526g;
                pVar = j$.time.p.d(1);
            } else {
                x10 = j$.time.l.x(j$.time.temporal.a.HOUR_OF_DAY.m(j10), m10, j$.time.temporal.a.SECOND_OF_MINUTE.m(j12), m11);
                pVar = j$.time.p.f9536d;
            }
        }
        t(x10, pVar);
    }

    private void s() {
        j$.time.temporal.o oVar;
        Long valueOf;
        Map map = this.f9504a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long longValue = ((Long) this.f9504a.remove(aVar)).longValue();
            z zVar = this.f9508e;
            if (zVar == z.STRICT || (zVar == z.SMART && longValue != 0)) {
                aVar.o(longValue);
            }
            j$.time.temporal.o oVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            v(aVar, oVar2, Long.valueOf(longValue));
        }
        Map map2 = this.f9504a;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(aVar2)) {
            long longValue2 = ((Long) this.f9504a.remove(aVar2)).longValue();
            z zVar2 = this.f9508e;
            if (zVar2 == z.STRICT || (zVar2 == z.SMART && longValue2 != 0)) {
                aVar2.o(longValue2);
            }
            v(aVar2, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.f9504a;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map3.containsKey(aVar3)) {
            Map map4 = this.f9504a;
            j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map4.containsKey(aVar4)) {
                long longValue3 = ((Long) this.f9504a.remove(aVar3)).longValue();
                long longValue4 = ((Long) this.f9504a.remove(aVar4)).longValue();
                if (this.f9508e == z.LENIENT) {
                    oVar = j$.time.temporal.a.HOUR_OF_DAY;
                    valueOf = Long.valueOf(j$.time.c.a(j$.time.c.d(longValue3, 12L), longValue4));
                } else {
                    aVar3.o(longValue3);
                    aVar4.o(longValue3);
                    oVar = j$.time.temporal.a.HOUR_OF_DAY;
                    valueOf = Long.valueOf((longValue3 * 12) + longValue4);
                }
                v(aVar3, oVar, valueOf);
            }
        }
        Map map5 = this.f9504a;
        j$.time.temporal.a aVar5 = j$.time.temporal.a.NANO_OF_DAY;
        if (map5.containsKey(aVar5)) {
            long longValue5 = ((Long) this.f9504a.remove(aVar5)).longValue();
            if (this.f9508e != z.LENIENT) {
                aVar5.o(longValue5);
            }
            v(aVar5, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            v(aVar5, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            v(aVar5, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            v(aVar5, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.f9504a;
        j$.time.temporal.a aVar6 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map6.containsKey(aVar6)) {
            long longValue6 = ((Long) this.f9504a.remove(aVar6)).longValue();
            if (this.f9508e != z.LENIENT) {
                aVar6.o(longValue6);
            }
            v(aVar6, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            v(aVar6, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.f9504a;
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map7.containsKey(aVar7)) {
            long longValue7 = ((Long) this.f9504a.remove(aVar7)).longValue();
            if (this.f9508e != z.LENIENT) {
                aVar7.o(longValue7);
            }
            v(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            v(aVar7, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.f9504a;
        j$.time.temporal.a aVar8 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map8.containsKey(aVar8)) {
            long longValue8 = ((Long) this.f9504a.remove(aVar8)).longValue();
            if (this.f9508e != z.LENIENT) {
                aVar8.o(longValue8);
            }
            v(aVar8, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            v(aVar8, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            v(aVar8, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.f9504a;
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map9.containsKey(aVar9)) {
            long longValue9 = ((Long) this.f9504a.remove(aVar9)).longValue();
            if (this.f9508e != z.LENIENT) {
                aVar9.o(longValue9);
            }
            v(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            v(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.f9504a;
        j$.time.temporal.a aVar10 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map10.containsKey(aVar10)) {
            long longValue10 = ((Long) this.f9504a.get(aVar10)).longValue();
            z zVar3 = this.f9508e;
            z zVar4 = z.LENIENT;
            if (zVar3 != zVar4) {
                aVar10.o(longValue10);
            }
            Map map11 = this.f9504a;
            j$.time.temporal.a aVar11 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map11.containsKey(aVar11)) {
                long longValue11 = ((Long) this.f9504a.remove(aVar11)).longValue();
                if (this.f9508e != zVar4) {
                    aVar11.o(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                v(aVar11, aVar10, Long.valueOf(longValue10));
            }
            Map map12 = this.f9504a;
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map12.containsKey(aVar12)) {
                long longValue12 = ((Long) this.f9504a.remove(aVar12)).longValue();
                if (this.f9508e != zVar4) {
                    aVar12.o(longValue12);
                }
                v(aVar12, aVar10, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.f9504a;
        j$.time.temporal.a aVar13 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map13.containsKey(aVar13)) {
            Map map14 = this.f9504a;
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map14.containsKey(aVar14)) {
                Map map15 = this.f9504a;
                j$.time.temporal.a aVar15 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map15.containsKey(aVar15) && this.f9504a.containsKey(aVar10)) {
                    r(((Long) this.f9504a.remove(aVar13)).longValue(), ((Long) this.f9504a.remove(aVar14)).longValue(), ((Long) this.f9504a.remove(aVar15)).longValue(), ((Long) this.f9504a.remove(aVar10)).longValue());
                }
            }
        }
    }

    private void t(j$.time.l lVar, j$.time.p pVar) {
        j$.time.l lVar2 = this.f9510g;
        if (lVar2 == null) {
            this.f9510g = lVar;
        } else if (!lVar2.equals(lVar)) {
            StringBuilder b10 = j$.time.a.b("Conflict found: Fields resolved to different times: ");
            b10.append(this.f9510g);
            b10.append(" ");
            b10.append(lVar);
            throw new j$.time.d(b10.toString());
        } else if (!this.f9511h.c() && !pVar.c() && !this.f9511h.equals(pVar)) {
            StringBuilder b11 = j$.time.a.b("Conflict found: Fields resolved to different excess periods: ");
            b11.append(this.f9511h);
            b11.append(" ");
            b11.append(pVar);
            throw new j$.time.d(b11.toString());
        }
        this.f9511h = pVar;
    }

    private void u(j$.time.chrono.b bVar) {
        j$.time.chrono.b bVar2 = this.f9509f;
        if (bVar2 != null) {
            if (bVar == null || ((j$.time.h) bVar2).equals(bVar)) {
                return;
            }
            StringBuilder b10 = j$.time.a.b("Conflict found: Fields resolved to two different dates: ");
            b10.append(this.f9509f);
            b10.append(" ");
            b10.append(bVar);
            throw new j$.time.d(b10.toString());
        } else if (bVar != null) {
            if (((j$.time.chrono.a) this.f9506c).equals(j$.time.chrono.g.f9432a)) {
                this.f9509f = bVar;
                return;
            }
            StringBuilder b11 = j$.time.a.b("ChronoLocalDate must use the effective parsed chronology: ");
            b11.append(this.f9506c);
            throw new j$.time.d(b11.toString());
        }
    }

    private void v(j$.time.temporal.o oVar, j$.time.temporal.o oVar2, Long l10) {
        Long l11 = (Long) this.f9504a.put(oVar2, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new j$.time.d("Conflict found: " + oVar2 + " " + l11 + " differs from " + oVar2 + " " + l10 + " while resolving  " + oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int g(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        if (this.f9504a.containsKey(oVar)) {
            return true;
        }
        j$.time.chrono.b bVar = this.f9509f;
        if (bVar == null || !((j$.time.h) bVar).h(oVar)) {
            j$.time.l lVar = this.f9510g;
            if (lVar == null || !lVar.h(oVar)) {
                return (oVar == null || (oVar instanceof j$.time.temporal.a) || !oVar.h(this)) ? false : true;
            }
            return true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.z i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.d(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "field");
        Long l10 = (Long) this.f9504a.get(oVar);
        if (l10 != null) {
            return l10.longValue();
        }
        j$.time.chrono.b bVar = this.f9509f;
        if (bVar == null || !((j$.time.h) bVar).h(oVar)) {
            j$.time.l lVar = this.f9510g;
            if (lVar == null || !lVar.h(oVar)) {
                if (oVar instanceof j$.time.temporal.a) {
                    throw new j$.time.temporal.y("Unsupported field: " + oVar);
                }
                return oVar.b(this);
            }
            return this.f9510g.k(oVar);
        }
        return ((j$.time.h) this.f9509f).k(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(j$.time.temporal.w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        if (wVar == j$.time.temporal.p.f9559a) {
            return this.f9505b;
        }
        if (wVar == j$.time.temporal.q.f9560a) {
            return this.f9506c;
        }
        if (wVar == j$.time.temporal.u.f9564a) {
            j$.time.chrono.b bVar = this.f9509f;
            if (bVar != null) {
                return j$.time.h.q(bVar);
            }
            return null;
        } else if (wVar == j$.time.temporal.v.f9565a) {
            return this.f9510g;
        } else {
            if (wVar == j$.time.temporal.t.f9563a || wVar == j$.time.temporal.s.f9562a) {
                return wVar.a(this);
            }
            if (wVar == j$.time.temporal.r.f9561a) {
                return null;
            }
            return wVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.time.temporal.TemporalAccessor o(j$.time.format.z r19, java.util.Set r20) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.y.o(j$.time.format.z, java.util.Set):j$.time.temporal.TemporalAccessor");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f9504a);
        sb.append(',');
        sb.append(this.f9506c);
        if (this.f9505b != null) {
            sb.append(',');
            sb.append(this.f9505b);
        }
        if (this.f9509f != null || this.f9510g != null) {
            sb.append(" resolved to ");
            j$.time.chrono.b bVar = this.f9509f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.f9510g != null) {
                    sb.append('T');
                }
            }
            sb.append(this.f9510g);
        }
        return sb.toString();
    }
}
