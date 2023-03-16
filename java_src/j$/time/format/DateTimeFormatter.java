package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /* renamed from: h  reason: collision with root package name */
    public static final DateTimeFormatter f9440h;

    /* renamed from: a  reason: collision with root package name */
    private final f f9441a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f9442b;

    /* renamed from: c  reason: collision with root package name */
    private final x f9443c;

    /* renamed from: d  reason: collision with root package name */
    private final z f9444d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f9445e = null;

    /* renamed from: f  reason: collision with root package name */
    private final j$.time.chrono.f f9446f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneId f9447g;

    static {
        r rVar = new r();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        rVar.l(aVar, 4, 10, 5);
        rVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        rVar.k(aVar2, 2);
        rVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        rVar.k(aVar3, 2);
        z zVar = z.STRICT;
        j$.time.chrono.g gVar = j$.time.chrono.g.f9432a;
        DateTimeFormatter t10 = rVar.t(zVar, gVar);
        ISO_LOCAL_DATE = t10;
        r rVar2 = new r();
        rVar2.p();
        rVar2.a(t10);
        rVar2.h();
        rVar2.t(zVar, gVar);
        r rVar3 = new r();
        rVar3.p();
        rVar3.a(t10);
        rVar3.o();
        rVar3.h();
        rVar3.t(zVar, gVar);
        r rVar4 = new r();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        rVar4.k(aVar4, 2);
        rVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        rVar4.k(aVar5, 2);
        rVar4.o();
        rVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        rVar4.k(aVar6, 2);
        rVar4.o();
        rVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter t11 = rVar4.t(zVar, null);
        r rVar5 = new r();
        rVar5.p();
        rVar5.a(t11);
        rVar5.h();
        rVar5.t(zVar, null);
        r rVar6 = new r();
        rVar6.p();
        rVar6.a(t11);
        rVar6.o();
        rVar6.h();
        rVar6.t(zVar, null);
        r rVar7 = new r();
        rVar7.p();
        rVar7.a(t10);
        rVar7.e('T');
        rVar7.a(t11);
        DateTimeFormatter t12 = rVar7.t(zVar, gVar);
        ISO_LOCAL_DATE_TIME = t12;
        r rVar8 = new r();
        rVar8.p();
        rVar8.a(t12);
        rVar8.h();
        DateTimeFormatter t13 = rVar8.t(zVar, gVar);
        r rVar9 = new r();
        rVar9.a(t13);
        rVar9.o();
        rVar9.e('[');
        rVar9.q();
        rVar9.m();
        rVar9.e(']');
        rVar9.t(zVar, gVar);
        r rVar10 = new r();
        rVar10.a(t12);
        rVar10.o();
        rVar10.h();
        rVar10.o();
        rVar10.e('[');
        rVar10.q();
        rVar10.m();
        rVar10.e(']');
        rVar10.t(zVar, gVar);
        r rVar11 = new r();
        rVar11.p();
        rVar11.l(aVar, 4, 10, 5);
        rVar11.e('-');
        rVar11.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        rVar11.o();
        rVar11.h();
        rVar11.t(zVar, gVar);
        r rVar12 = new r();
        rVar12.p();
        rVar12.l(j$.time.temporal.j.f9556c, 4, 10, 5);
        rVar12.f("-W");
        rVar12.k(j$.time.temporal.j.f9555b, 2);
        rVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        rVar12.k(aVar7, 1);
        rVar12.o();
        rVar12.h();
        rVar12.t(zVar, gVar);
        r rVar13 = new r();
        rVar13.p();
        rVar13.c();
        f9440h = rVar13.t(zVar, null);
        r rVar14 = new r();
        rVar14.p();
        rVar14.k(aVar, 4);
        rVar14.k(aVar2, 2);
        rVar14.k(aVar3, 2);
        rVar14.o();
        rVar14.g("+HHMMss", "Z");
        rVar14.t(zVar, gVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        r rVar15 = new r();
        rVar15.p();
        rVar15.r();
        rVar15.o();
        rVar15.i(aVar7, hashMap);
        rVar15.f(", ");
        rVar15.n();
        rVar15.l(aVar3, 1, 2, 4);
        rVar15.e(' ');
        rVar15.i(aVar2, hashMap2);
        rVar15.e(' ');
        rVar15.k(aVar, 4);
        rVar15.e(' ');
        rVar15.k(aVar4, 2);
        rVar15.e(':');
        rVar15.k(aVar5, 2);
        rVar15.o();
        rVar15.e(':');
        rVar15.k(aVar6, 2);
        rVar15.n();
        rVar15.e(' ');
        rVar15.g("+HHMM", "GMT");
        rVar15.t(z.SMART, gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(f fVar, Locale locale, x xVar, z zVar, Set set, j$.time.chrono.f fVar2, ZoneId zoneId) {
        this.f9441a = fVar;
        this.f9442b = locale;
        this.f9443c = xVar;
        Objects.requireNonNull(zVar, "resolverStyle");
        this.f9444d = zVar;
        this.f9446f = fVar2;
        this.f9447g = null;
    }

    private TemporalAccessor f(CharSequence charSequence, ParsePosition parsePosition) {
        String charSequence2;
        ParsePosition parsePosition2 = new ParsePosition(0);
        s sVar = new s(this);
        int b10 = this.f9441a.b(sVar, charSequence, parsePosition2.getIndex());
        if (b10 < 0) {
            parsePosition2.setErrorIndex(~b10);
            sVar = null;
        } else {
            parsePosition2.setIndex(b10);
        }
        if (sVar == null || parsePosition2.getErrorIndex() >= 0 || parsePosition2.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            if (parsePosition2.getErrorIndex() >= 0) {
                throw new t("Text '" + charSequence2 + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
            }
            throw new t("Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
        }
        return sVar.s(this.f9444d, this.f9445e);
    }

    public j$.time.chrono.f a() {
        return this.f9446f;
    }

    public x b() {
        return this.f9443c;
    }

    public Locale c() {
        return this.f9442b;
    }

    public ZoneId d() {
        return this.f9447g;
    }

    public Object e(CharSequence charSequence, j$.time.temporal.w wVar) {
        String charSequence2;
        Objects.requireNonNull(charSequence, "text");
        try {
            return ((y) f(charSequence, null)).m(wVar);
        } catch (t e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            throw new t("Text '" + charSequence2 + "' could not be parsed: " + e11.getMessage(), charSequence, 0, e11);
        }
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f9441a.a(new v(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e10) {
            throw new j$.time.d(e10.getMessage(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f g(boolean z10) {
        return this.f9441a.c(z10);
    }

    public String toString() {
        String fVar = this.f9441a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
