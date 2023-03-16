package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f9484f = 0;

    /* renamed from: a  reason: collision with root package name */
    private r f9485a;

    /* renamed from: b  reason: collision with root package name */
    private final r f9486b;

    /* renamed from: c  reason: collision with root package name */
    private final List f9487c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9488d;

    /* renamed from: e  reason: collision with root package name */
    private int f9489e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.o oVar = j$.time.temporal.j.f9554a;
        hashMap.put('Q', oVar);
        hashMap.put('q', oVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
    }

    public r() {
        this.f9485a = this;
        this.f9487c = new ArrayList();
        this.f9489e = -1;
        this.f9486b = null;
        this.f9488d = false;
    }

    private r(r rVar, boolean z10) {
        this.f9485a = this;
        this.f9487c = new ArrayList();
        this.f9489e = -1;
        this.f9486b = rVar;
        this.f9488d = z10;
    }

    private int d(g gVar) {
        Objects.requireNonNull(gVar, "pp");
        r rVar = this.f9485a;
        Objects.requireNonNull(rVar);
        rVar.f9487c.add(gVar);
        r rVar2 = this.f9485a;
        rVar2.f9489e = -1;
        return rVar2.f9487c.size() - 1;
    }

    private r j(j jVar) {
        j e10;
        r rVar = this.f9485a;
        int i10 = rVar.f9489e;
        if (i10 >= 0) {
            j jVar2 = (j) rVar.f9487c.get(i10);
            if (jVar.f9462b == jVar.f9463c && j.c(jVar) == 4) {
                e10 = jVar2.f(jVar.f9463c);
                d(jVar.e());
                this.f9485a.f9489e = i10;
            } else {
                e10 = jVar2.e();
                this.f9485a.f9489e = d(jVar);
            }
            this.f9485a.f9487c.set(i10, e10);
        } else {
            rVar.f9489e = d(jVar);
        }
        return this;
    }

    private DateTimeFormatter u(Locale locale, z zVar, j$.time.chrono.f fVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f9485a.f9486b != null) {
            n();
        }
        return new DateTimeFormatter(new f(this.f9487c, false), locale, x.f9503a, zVar, null, fVar, null);
    }

    public r a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.g(false));
        return this;
    }

    public r b(j$.time.temporal.o oVar, int i10, int i11, boolean z10) {
        d(new h(oVar, i10, i11, z10));
        return this;
    }

    public r c() {
        d(new i(-2));
        return this;
    }

    public r e(char c10) {
        d(new e(c10));
        return this;
    }

    public r f(String str) {
        if (str.length() > 0) {
            d(str.length() == 1 ? new e(str.charAt(0)) : new o(str));
        }
        return this;
    }

    public r g(String str, String str2) {
        d(new k(str, str2));
        return this;
    }

    public r h() {
        d(k.f9467d);
        return this;
    }

    public r i(j$.time.temporal.o oVar, Map map) {
        Objects.requireNonNull(oVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        B b10 = B.FULL;
        d(new p(oVar, b10, new C0250b(this, new w(Collections.singletonMap(b10, linkedHashMap)))));
        return this;
    }

    public r k(j$.time.temporal.o oVar, int i10) {
        Objects.requireNonNull(oVar, "field");
        if (i10 >= 1 && i10 <= 19) {
            j(new j(oVar, i10, i10, 4));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
    }

    public r l(j$.time.temporal.o oVar, int i10, int i11, int i12) {
        if (i10 == i11 && i12 == 4) {
            k(oVar, i11);
            return this;
        }
        Objects.requireNonNull(oVar, "field");
        if (i12 != 0) {
            if (i10 < 1 || i10 > 19) {
                throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
            } else if (i11 < 1 || i11 > 19) {
                throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
            } else if (i11 >= i10) {
                j(new j(oVar, i10, i11, i12));
                return this;
            } else {
                throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
            }
        }
        throw new NullPointerException("signStyle");
    }

    public r m() {
        d(new q(C0249a.f9448a, "ZoneRegionId()"));
        return this;
    }

    public r n() {
        r rVar = this.f9485a;
        if (rVar.f9486b != null) {
            if (rVar.f9487c.size() > 0) {
                r rVar2 = this.f9485a;
                f fVar = new f(rVar2.f9487c, rVar2.f9488d);
                this.f9485a = this.f9485a.f9486b;
                d(fVar);
            } else {
                this.f9485a = this.f9485a.f9486b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public r o() {
        r rVar = this.f9485a;
        rVar.f9489e = -1;
        this.f9485a = new r(rVar, true);
        return this;
    }

    public r p() {
        d(n.INSENSITIVE);
        return this;
    }

    public r q() {
        d(n.SENSITIVE);
        return this;
    }

    public r r() {
        d(n.LENIENT);
        return this;
    }

    public DateTimeFormatter s() {
        return u(Locale.getDefault(), z.SMART, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter t(z zVar, j$.time.chrono.f fVar) {
        return u(Locale.getDefault(), zVar, fVar);
    }
}
