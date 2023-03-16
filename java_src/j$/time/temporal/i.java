package j$.time.temporal;
/* loaded from: classes2.dex */
enum i implements x {
    WEEK_BASED_YEARS("WeekBasedYears", j$.time.e.g(31556952)),
    QUARTER_YEARS("QuarterYears", j$.time.e.g(7889238));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f9553a;

    i(String str, j$.time.e eVar) {
        this.f9553a = str;
    }

    @Override // j$.time.temporal.x
    public k a(k kVar, long j10) {
        int i10 = c.f9549a[ordinal()];
        if (i10 == 1) {
            o oVar = j.f9556c;
            return kVar.c(oVar, j$.time.c.a(kVar.g(oVar), j10));
        } else if (i10 == 2) {
            return kVar.l(j10 / 256, b.YEARS).l((j10 % 256) * 3, b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9553a;
    }
}
