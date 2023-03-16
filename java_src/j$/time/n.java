package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.w;
import j$.time.temporal.y;
import j$.time.temporal.z;
/* loaded from: classes2.dex */
public enum n implements TemporalAccessor, j$.time.temporal.l {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a  reason: collision with root package name */
    private static final n[] f9533a = values();

    public static n r(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new d("Invalid value for MonthOfYear: " + i10);
        }
        return f9533a[i10 - 1];
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        if (((j$.time.chrono.a) j$.time.chrono.d.b(kVar)).equals(j$.time.chrono.g.f9432a)) {
            return kVar.c(j$.time.temporal.a.MONTH_OF_YEAR, p());
        }
        throw new d("Adjustment only supported on ISO date-time");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.MONTH_OF_YEAR ? p() : j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.MONTH_OF_YEAR : oVar != null && oVar.h(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.MONTH_OF_YEAR ? oVar.c() : j$.time.temporal.n.d(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new y("Unsupported field: " + oVar);
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        return wVar == j$.time.temporal.q.f9560a ? j$.time.chrono.g.f9432a : wVar == j$.time.temporal.r.f9561a ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.c(this, wVar);
    }

    public int o(boolean z10) {
        switch (m.f9532a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + c.j.K0;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public int p() {
        return ordinal() + 1;
    }

    public int q(boolean z10) {
        int i10 = m.f9532a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public n s(long j10) {
        return f9533a[((((int) (j10 % 12)) + 12) + ordinal()) % 12];
    }
}
