package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.q;
import j$.time.temporal.y;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static int a(ChronoZonedDateTime chronoZonedDateTime, o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = e.f9431a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                ZonedDateTime zonedDateTime = (ZonedDateTime) chronoZonedDateTime;
                return i10 != 2 ? ((LocalDateTime) zonedDateTime.f()).g(oVar) : zonedDateTime.p().s();
            }
            throw new y("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return n.b(chronoZonedDateTime, oVar);
    }

    public static f b(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        int i10 = n.f9558a;
        f fVar = (f) temporalAccessor.m(q.f9560a);
        return fVar != null ? fVar : g.f9432a;
    }
}
