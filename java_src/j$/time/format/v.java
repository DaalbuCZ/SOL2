package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private TemporalAccessor f9498a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f9499b;

    /* renamed from: c  reason: collision with root package name */
    private int f9500c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.v.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f9500c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x b() {
        return this.f9499b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale c() {
        return this.f9499b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TemporalAccessor d() {
        return this.f9498a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long e(j$.time.temporal.o oVar) {
        try {
            return Long.valueOf(this.f9498a.k(oVar));
        } catch (j$.time.d e10) {
            if (this.f9500c > 0) {
                return null;
            }
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object f(j$.time.temporal.w wVar) {
        Object m10 = this.f9498a.m(wVar);
        if (m10 == null && this.f9500c == 0) {
            StringBuilder b10 = j$.time.a.b("Unable to extract value: ");
            b10.append(this.f9498a.getClass());
            throw new j$.time.d(b10.toString());
        }
        return m10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f9500c++;
    }

    public String toString() {
        return this.f9498a.toString();
    }
}
