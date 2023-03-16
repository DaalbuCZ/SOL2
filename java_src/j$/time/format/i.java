package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i implements g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i10) {
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        Long e10 = vVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor d10 = vVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d10.h(aVar) ? Long.valueOf(vVar.d().k(aVar)) : null;
        int i10 = 0;
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int m10 = aVar.m(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j10 = (longValue - 315569520000L) + 62167219200L;
            long c10 = j$.time.c.c(j10, 315569520000L) + 1;
            LocalDateTime E = LocalDateTime.E(j$.time.c.b(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (c10 > 0) {
                sb.append('+');
                sb.append(c10);
            }
            sb.append(E);
            if (E.x() == 0) {
                sb.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime E2 = LocalDateTime.E(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(E2);
            if (E2.x() == 0) {
                sb.append(":00");
            }
            if (j12 < 0) {
                if (E2.y() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb.insert(length, j12);
                } else {
                    sb.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (m10 > 0) {
            sb.append('.');
            int i11 = 100000000;
            while (true) {
                if (m10 <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = m10 / i11;
                sb.append((char) (i12 + 48));
                m10 -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        r rVar = new r();
        rVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        rVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        rVar.k(aVar, 2);
        rVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        rVar.k(aVar2, 2);
        rVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        rVar.k(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i13 = 0;
        rVar.b(aVar4, 0, 9, true);
        rVar.e('Z');
        f g10 = rVar.s().g(false);
        s c10 = sVar.c();
        int b10 = g10.b(c10, charSequence, i10);
        if (b10 < 0) {
            return b10;
        }
        long longValue = c10.i(j$.time.temporal.a.YEAR).longValue();
        int intValue = c10.i(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = c10.i(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = c10.i(aVar).intValue();
        int intValue4 = c10.i(aVar2).intValue();
        Long i14 = c10.i(aVar3);
        Long i15 = c10.i(aVar4);
        int intValue5 = i14 != null ? i14.intValue() : 0;
        int intValue6 = i15 != null ? i15.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i11 = 0;
            i12 = intValue5;
            i13 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            sVar.o();
            i11 = intValue3;
            i12 = 59;
        } else {
            i11 = intValue3;
            i12 = intValue5;
        }
        try {
            return sVar.n(aVar4, intValue6, i10, sVar.n(j$.time.temporal.a.INSTANT_SECONDS, j$.time.c.d(longValue / 10000, 315569520000L) + LocalDateTime.C(((int) longValue) % 10000, intValue, intValue2, i11, intValue4, i12, 0).plusDays(i13).J(ZoneOffset.UTC), i10, b10));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public String toString() {
        return "Instant()";
    }
}
