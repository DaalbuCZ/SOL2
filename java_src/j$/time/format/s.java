package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f9490a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9491b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9492c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f9493d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f9493d = arrayList;
        this.f9490a = dateTimeFormatter;
        arrayList.add(new y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private y d() {
        ArrayList arrayList = this.f9493d;
        return (y) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(char c10, char c11) {
        if (this.f9491b) {
            return c10 == c11;
        }
        return b(c10, c11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s c() {
        s sVar = new s(this.f9490a);
        sVar.f9491b = this.f9491b;
        sVar.f9492c = this.f9492c;
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        ArrayList arrayList;
        int size;
        if (z10) {
            arrayList = this.f9493d;
            size = arrayList.size() - 2;
        } else {
            arrayList = this.f9493d;
            size = arrayList.size() - 1;
        }
        arrayList.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x f() {
        return this.f9490a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j$.time.chrono.f g() {
        j$.time.chrono.f fVar = d().f9506c;
        if (fVar == null) {
            j$.time.chrono.f a10 = this.f9490a.a();
            return a10 == null ? j$.time.chrono.g.f9432a : a10;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale h() {
        return this.f9490a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long i(j$.time.temporal.o oVar) {
        return (Long) d().f9504a.get(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f9491b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.f9492c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(boolean z10) {
        this.f9491b = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().f9505b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n(j$.time.temporal.o oVar, long j10, int i10, int i11) {
        Objects.requireNonNull(oVar, "field");
        Long l10 = (Long) d().f9504a.put(oVar, Long.valueOf(j10));
        return (l10 == null || l10.longValue() == j10) ? i11 : ~i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        d().f9507d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(boolean z10) {
        this.f9492c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        ArrayList arrayList = this.f9493d;
        y d10 = d();
        Objects.requireNonNull(d10);
        y yVar = new y();
        yVar.f9504a.putAll(d10.f9504a);
        yVar.f9505b = d10.f9505b;
        yVar.f9506c = d10.f9506c;
        yVar.f9507d = d10.f9507d;
        arrayList.add(yVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 > charSequence.length() || i11 + i12 > charSequence2.length()) {
            return false;
        }
        if (this.f9491b) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                    return false;
                }
            }
            return true;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            char charAt = charSequence.charAt(i10 + i14);
            char charAt2 = charSequence2.charAt(i11 + i14);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TemporalAccessor s(z zVar, Set set) {
        y d10 = d();
        j$.time.chrono.f fVar = d().f9506c;
        if (fVar == null && (fVar = this.f9490a.a()) == null) {
            fVar = j$.time.chrono.g.f9432a;
        }
        d10.f9506c = fVar;
        ZoneId zoneId = d10.f9505b;
        if (zoneId == null) {
            zoneId = this.f9490a.d();
        }
        d10.f9505b = zoneId;
        d10.o(zVar, set);
        return d10;
    }

    public String toString() {
        return d().toString();
    }
}
