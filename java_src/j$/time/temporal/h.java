package j$.time.temporal;

import j$.time.DayOfWeek;
import java.util.Map;
/* loaded from: classes2.dex */
enum h implements o {
    DAY_OF_QUARTER { // from class: j$.time.temporal.d
        @Override // j$.time.temporal.h, j$.time.temporal.o
        public TemporalAccessor a(Map map, TemporalAccessor temporalAccessor, j$.time.format.z zVar) {
            j$.time.h y10;
            long j10;
            a aVar = a.YEAR;
            Long l10 = (Long) map.get(aVar);
            o oVar = h.QUARTER_OF_YEAR;
            Long l11 = (Long) map.get(oVar);
            if (l10 == null || l11 == null) {
                return null;
            }
            int m10 = aVar.m(l10.longValue());
            long longValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
            h.o(temporalAccessor);
            if (zVar == j$.time.format.z.LENIENT) {
                y10 = j$.time.h.y(m10, 1, 1).D(j$.time.c.d(j$.time.c.e(l11.longValue(), 1L), 3L));
                j10 = j$.time.c.e(longValue, 1L);
            } else {
                y10 = j$.time.h.y(m10, ((oVar.c().a(l11.longValue(), oVar) - 1) * 3) + 1, 1);
                if (longValue < 1 || longValue > 90) {
                    (zVar == j$.time.format.z.STRICT ? k(y10) : c()).b(longValue, this);
                }
                j10 = longValue - 1;
            }
            map.remove(this);
            map.remove(aVar);
            map.remove(oVar);
            return y10.C(j10);
        }

        @Override // j$.time.temporal.o
        public long b(TemporalAccessor temporalAccessor) {
            int[] iArr;
            if (h(temporalAccessor)) {
                int g10 = temporalAccessor.g(a.DAY_OF_YEAR);
                int g11 = temporalAccessor.g(a.MONTH_OF_YEAR);
                long k10 = temporalAccessor.k(a.YEAR);
                iArr = h.f9550a;
                return g10 - iArr[((g11 - 1) / 3) + (j$.time.chrono.g.f9432a.c(k10) ? 4 : 0)];
            }
            throw new y("Unsupported field: DayOfQuarter");
        }

        @Override // j$.time.temporal.o
        public z c() {
            return z.j(1L, 90L, 92L);
        }

        @Override // j$.time.temporal.o
        public boolean h(TemporalAccessor temporalAccessor) {
            if (temporalAccessor.h(a.DAY_OF_YEAR) && temporalAccessor.h(a.MONTH_OF_YEAR) && temporalAccessor.h(a.YEAR)) {
                if (((j$.time.chrono.a) j$.time.chrono.d.b(temporalAccessor)).equals(j$.time.chrono.g.f9432a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // j$.time.temporal.o
        public k i(k kVar, long j10) {
            long b10 = b(kVar);
            c().b(j10, this);
            a aVar = a.DAY_OF_YEAR;
            return kVar.c(aVar, (j10 - b10) + kVar.k(aVar));
        }

        @Override // j$.time.temporal.h, j$.time.temporal.o
        public z k(TemporalAccessor temporalAccessor) {
            if (h(temporalAccessor)) {
                long k10 = temporalAccessor.k(h.QUARTER_OF_YEAR);
                if (k10 == 1) {
                    return j$.time.chrono.g.f9432a.c(temporalAccessor.k(a.YEAR)) ? z.i(1L, 91L) : z.i(1L, 90L);
                }
                return k10 == 2 ? z.i(1L, 91L) : (k10 == 3 || k10 == 4) ? z.i(1L, 92L) : c();
            }
            throw new y("Unsupported field: DayOfQuarter");
        }

        @Override // java.lang.Enum
        public String toString() {
            return "DayOfQuarter";
        }
    },
    QUARTER_OF_YEAR { // from class: j$.time.temporal.e
        @Override // j$.time.temporal.o
        public long b(TemporalAccessor temporalAccessor) {
            if (h(temporalAccessor)) {
                return (temporalAccessor.k(a.MONTH_OF_YEAR) + 2) / 3;
            }
            throw new y("Unsupported field: QuarterOfYear");
        }

        @Override // j$.time.temporal.o
        public z c() {
            return z.i(1L, 4L);
        }

        @Override // j$.time.temporal.o
        public boolean h(TemporalAccessor temporalAccessor) {
            if (temporalAccessor.h(a.MONTH_OF_YEAR)) {
                if (((j$.time.chrono.a) j$.time.chrono.d.b(temporalAccessor)).equals(j$.time.chrono.g.f9432a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // j$.time.temporal.o
        public k i(k kVar, long j10) {
            long b10 = b(kVar);
            c().b(j10, this);
            a aVar = a.MONTH_OF_YEAR;
            return kVar.c(aVar, ((j10 - b10) * 3) + kVar.k(aVar));
        }

        @Override // java.lang.Enum
        public String toString() {
            return "QuarterOfYear";
        }
    },
    WEEK_OF_WEEK_BASED_YEAR { // from class: j$.time.temporal.f
        @Override // j$.time.temporal.h, j$.time.temporal.o
        public TemporalAccessor a(Map map, TemporalAccessor temporalAccessor, j$.time.format.z zVar) {
            j$.time.h c10;
            long j10;
            j$.time.h E;
            long j11;
            o oVar = h.WEEK_BASED_YEAR;
            Long l10 = (Long) map.get(oVar);
            a aVar = a.DAY_OF_WEEK;
            Long l11 = (Long) map.get(aVar);
            if (l10 == null || l11 == null) {
                return null;
            }
            int a10 = oVar.c().a(l10.longValue(), oVar);
            long longValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
            h.o(temporalAccessor);
            j$.time.h y10 = j$.time.h.y(a10, 1, 4);
            if (zVar == j$.time.format.z.LENIENT) {
                long longValue2 = l11.longValue();
                if (longValue2 > 7) {
                    j11 = longValue2 - 1;
                    E = y10.E(j11 / 7);
                } else {
                    j10 = 1;
                    if (longValue2 < 1) {
                        E = y10.E(j$.time.c.e(longValue2, 7L) / 7);
                        j11 = longValue2 + 6;
                    }
                    c10 = y10.E(j$.time.c.e(longValue, j10)).c(aVar, longValue2);
                }
                y10 = E;
                j10 = 1;
                longValue2 = (j11 % 7) + 1;
                c10 = y10.E(j$.time.c.e(longValue, j10)).c(aVar, longValue2);
            } else {
                int m10 = aVar.m(l11.longValue());
                if (longValue < 1 || longValue > 52) {
                    (zVar == j$.time.format.z.STRICT ? h.p(y10) : c()).b(longValue, this);
                }
                c10 = y10.E(longValue - 1).c(aVar, m10);
            }
            map.remove(this);
            map.remove(oVar);
            map.remove(aVar);
            return c10;
        }

        @Override // j$.time.temporal.o
        public long b(TemporalAccessor temporalAccessor) {
            if (h(temporalAccessor)) {
                return h.q(j$.time.h.q(temporalAccessor));
            }
            throw new y("Unsupported field: WeekOfWeekBasedYear");
        }

        @Override // j$.time.temporal.o
        public z c() {
            return z.j(1L, 52L, 53L);
        }

        @Override // j$.time.temporal.o
        public boolean h(TemporalAccessor temporalAccessor) {
            if (temporalAccessor.h(a.EPOCH_DAY)) {
                if (((j$.time.chrono.a) j$.time.chrono.d.b(temporalAccessor)).equals(j$.time.chrono.g.f9432a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // j$.time.temporal.o
        public k i(k kVar, long j10) {
            c().b(j10, this);
            return kVar.l(j$.time.c.e(j10, b(kVar)), b.WEEKS);
        }

        @Override // j$.time.temporal.h, j$.time.temporal.o
        public z k(TemporalAccessor temporalAccessor) {
            if (h(temporalAccessor)) {
                return h.p(j$.time.h.q(temporalAccessor));
            }
            throw new y("Unsupported field: WeekOfWeekBasedYear");
        }

        @Override // java.lang.Enum
        public String toString() {
            return "WeekOfWeekBasedYear";
        }
    },
    WEEK_BASED_YEAR { // from class: j$.time.temporal.g
        @Override // j$.time.temporal.o
        public long b(TemporalAccessor temporalAccessor) {
            int t10;
            if (h(temporalAccessor)) {
                t10 = h.t(j$.time.h.q(temporalAccessor));
                return t10;
            }
            throw new y("Unsupported field: WeekBasedYear");
        }

        @Override // j$.time.temporal.o
        public z c() {
            return a.YEAR.c();
        }

        @Override // j$.time.temporal.o
        public boolean h(TemporalAccessor temporalAccessor) {
            if (temporalAccessor.h(a.EPOCH_DAY)) {
                if (((j$.time.chrono.a) j$.time.chrono.d.b(temporalAccessor)).equals(j$.time.chrono.g.f9432a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // j$.time.temporal.o
        public k i(k kVar, long j10) {
            a aVar;
            j$.time.h y10;
            int u10;
            if (h(kVar)) {
                int a10 = c().a(j10, h.WEEK_BASED_YEAR);
                j$.time.h q10 = j$.time.h.q(kVar);
                int g10 = q10.g(a.DAY_OF_WEEK);
                int q11 = h.q(q10);
                if (q11 == 53) {
                    u10 = h.u(a10);
                    if (u10 == 52) {
                        q11 = 52;
                    }
                }
                return kVar.b(j$.time.h.y(a10, 1, 4).C(((q11 - 1) * 7) + (g10 - y10.g(aVar))));
            }
            throw new y("Unsupported field: WeekBasedYear");
        }

        @Override // java.lang.Enum
        public String toString() {
            return "WeekBasedYear";
        }
    };
    

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f9550a = {0, 90, 181, 273, 0, 91, 182, 274};

    /* JADX INFO: Access modifiers changed from: package-private */
    h(c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(TemporalAccessor temporalAccessor) {
        if (!((j$.time.chrono.a) j$.time.chrono.d.b(temporalAccessor)).equals(j$.time.chrono.g.f9432a)) {
            throw new j$.time.d("Resolve requires IsoChronology");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z p(j$.time.h hVar) {
        return z.i(1L, u(t(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.x())) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int q(j$.time.h r5) {
        /*
            j$.time.DayOfWeek r0 = r5.t()
            int r0 = r0.ordinal()
            int r1 = r5.u()
            r2 = 1
            int r1 = r1 - r2
            int r0 = 3 - r0
            int r0 = r0 + r1
            int r3 = r0 / 7
            int r3 = r3 * 7
            int r0 = r0 - r3
            r3 = -3
            int r0 = r0 + r3
            if (r0 >= r3) goto L1c
            int r0 = r0 + 7
        L1c:
            if (r1 >= r0) goto L3f
            r0 = 180(0xb4, float:2.52E-43)
            j$.time.h r5 = r5.K(r0)
            r0 = -1
            j$.time.h r5 = r5.F(r0)
            int r5 = t(r5)
            int r5 = u(r5)
            long r0 = (long) r5
            r2 = 1
            j$.time.temporal.z r5 = j$.time.temporal.z.i(r2, r0)
            long r0 = r5.d()
            int r5 = (int) r0
            goto L5b
        L3f:
            int r1 = r1 - r0
            int r1 = r1 / 7
            int r1 = r1 + r2
            r4 = 53
            if (r1 != r4) goto L59
            if (r0 == r3) goto L55
            r3 = -2
            if (r0 != r3) goto L53
            boolean r5 = r5.x()
            if (r5 == 0) goto L53
            goto L55
        L53:
            r5 = 0
            goto L56
        L55:
            r5 = r2
        L56:
            if (r5 != 0) goto L59
            goto L5a
        L59:
            r2 = r1
        L5a:
            r5 = r2
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.temporal.h.q(j$.time.h):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(j$.time.h hVar) {
        int w10 = hVar.w();
        int u10 = hVar.u();
        if (u10 <= 3) {
            return u10 - hVar.t().ordinal() < -2 ? w10 - 1 : w10;
        } else if (u10 >= 363) {
            return ((u10 - 363) - (hVar.x() ? 1 : 0)) - hVar.t().ordinal() >= 0 ? w10 + 1 : w10;
        } else {
            return w10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int u(int i10) {
        j$.time.h y10 = j$.time.h.y(i10, 1, 1);
        if (y10.t() != DayOfWeek.THURSDAY) {
            return (y10.t() == DayOfWeek.WEDNESDAY && y10.x()) ? 53 : 52;
        }
        return 53;
    }

    public /* synthetic */ TemporalAccessor a(Map map, TemporalAccessor temporalAccessor, j$.time.format.z zVar) {
        return null;
    }

    @Override // j$.time.temporal.o
    public boolean g() {
        return false;
    }

    public z k(TemporalAccessor temporalAccessor) {
        return c();
    }

    @Override // j$.time.temporal.o
    public boolean l() {
        return true;
    }
}
