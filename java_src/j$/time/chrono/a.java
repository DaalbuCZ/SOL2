package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.h;
import j$.time.temporal.n;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class a implements f {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Map map, j$.time.temporal.a aVar, long j10) {
        Long l10 = (Long) map.get(aVar);
        if (l10 == null || l10.longValue() == j10) {
            map.put(aVar, Long.valueOf(j10));
            return;
        }
        throw new j$.time.d("Conflict found: " + aVar + " " + l10 + " differs from " + aVar + " " + j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b b(b bVar, long j10, long j11, long j12) {
        long j13;
        h l10 = ((h) bVar).l(j10, j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar2 = j$.time.temporal.b.WEEKS;
        h l11 = l10.l(j11, bVar2);
        if (j12 <= 7) {
            if (j12 < 1) {
                l11 = l11.l(j$.time.c.e(j12, 7L) / 7, bVar2);
                j13 = j12 + 6;
            }
            return l11.J(n.f(DayOfWeek.p((int) j12)));
        }
        j13 = j12 - 1;
        l11 = l11.l(j13 / 7, bVar2);
        j12 = (j13 % 7) + 1;
        return l11.J(n.f(DayOfWeek.p((int) j12)));
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Objects.requireNonNull((f) obj);
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            Objects.requireNonNull((a) obj);
            return true;
        }
        return false;
    }

    public int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public String toString() {
        return "ISO";
    }
}
