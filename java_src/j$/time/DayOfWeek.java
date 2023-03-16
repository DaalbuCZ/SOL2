package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.w;
import j$.time.temporal.y;
import j$.time.temporal.z;
/* loaded from: classes2.dex */
public enum DayOfWeek implements TemporalAccessor, j$.time.temporal.l {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a  reason: collision with root package name */
    private static final DayOfWeek[] f9410a = values();

    public static DayOfWeek p(int i10) {
        if (i10 < 1 || i10 > 7) {
            throw new d("Invalid value for DayOfWeek: " + i10);
        }
        return f9410a[i10 - 1];
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.DAY_OF_WEEK, o());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.DAY_OF_WEEK ? o() : j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.DAY_OF_WEEK : oVar != null && oVar.h(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.DAY_OF_WEEK ? oVar.c() : j$.time.temporal.n.d(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return o();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new y("Unsupported field: " + oVar);
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        return wVar == j$.time.temporal.r.f9561a ? j$.time.temporal.b.DAYS : j$.time.temporal.n.c(this, wVar);
    }

    public int o() {
        return ordinal() + 1;
    }
}
