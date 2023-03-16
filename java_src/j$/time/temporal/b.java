package j$.time.temporal;
/* loaded from: classes2.dex */
public enum b implements x {
    NANOS("Nanos", j$.time.e.c(1)),
    MICROS("Micros", j$.time.e.c(1000)),
    MILLIS("Millis", j$.time.e.c(1000000)),
    SECONDS("Seconds", j$.time.e.g(1)),
    MINUTES("Minutes", j$.time.e.g(60)),
    HOURS("Hours", j$.time.e.g(3600)),
    HALF_DAYS("HalfDays", j$.time.e.g(43200)),
    DAYS("Days", j$.time.e.g(86400)),
    WEEKS("Weeks", j$.time.e.g(604800)),
    MONTHS("Months", j$.time.e.g(2629746)),
    YEARS("Years", j$.time.e.g(31556952)),
    DECADES("Decades", j$.time.e.g(315569520)),
    CENTURIES("Centuries", j$.time.e.g(3155695200L)),
    MILLENNIA("Millennia", j$.time.e.g(31556952000L)),
    ERAS("Eras", j$.time.e.g(31556952000000000L)),
    FOREVER("Forever", j$.time.e.h(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f9548a;

    b(String str, j$.time.e eVar) {
        this.f9548a = str;
    }

    @Override // j$.time.temporal.x
    public k a(k kVar, long j10) {
        return kVar.l(j10, this);
    }

    public boolean b() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9548a;
    }
}
