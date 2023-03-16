package j$.time;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class p implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final p f9536d = new p(0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f9537a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9538b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9539c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS));
    }

    private p(int i10, int i11, int i12) {
        this.f9537a = i10;
        this.f9538b = i11;
        this.f9539c = i12;
    }

    public static p d(int i10) {
        return (0 | i10) == 0 ? f9536d : new p(0, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.time.temporal.k a(j$.time.temporal.k r7) {
        /*
            r6 = this;
            j$.time.temporal.q r0 = j$.time.temporal.q.f9560a
            r1 = r7
            j$.time.h r1 = (j$.time.h) r1
            java.lang.Object r0 = r1.m(r0)
            j$.time.chrono.f r0 = (j$.time.chrono.f) r0
            if (r0 == 0) goto L1e
            j$.time.chrono.g r2 = j$.time.chrono.g.f9432a
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            goto L1e
        L16:
            j$.time.d r7 = new j$.time.d
            java.lang.String r0 = "Chronology mismatch, expected: ISO, actual: ISO"
            r7.<init>(r0)
            throw r7
        L1e:
            int r0 = r6.f9538b
            if (r0 != 0) goto L2e
            int r0 = r6.f9537a
            if (r0 == 0) goto L3f
            long r2 = (long) r0
            j$.time.temporal.b r7 = j$.time.temporal.b.YEARS
        L29:
            j$.time.h r7 = r1.l(r2, r7)
            goto L3f
        L2e:
            int r2 = r6.f9537a
            long r2 = (long) r2
            r4 = 12
            long r2 = r2 * r4
            long r4 = (long) r0
            long r2 = r2 + r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3f
            j$.time.temporal.b r7 = j$.time.temporal.b.MONTHS
            goto L29
        L3f:
            int r0 = r6.f9539c
            if (r0 == 0) goto L4c
            long r0 = (long) r0
            j$.time.temporal.b r2 = j$.time.temporal.b.DAYS
            j$.time.h r7 = (j$.time.h) r7
            j$.time.h r7 = r7.l(r0, r2)
        L4c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.p.a(j$.time.temporal.k):j$.time.temporal.k");
    }

    public int b() {
        return this.f9539c;
    }

    public boolean c() {
        return this == f9536d;
    }

    public long e() {
        return (this.f9537a * 12) + this.f9538b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f9537a == pVar.f9537a && this.f9538b == pVar.f9538b && this.f9539c == pVar.f9539c;
        }
        return false;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f9539c, 16) + Integer.rotateLeft(this.f9538b, 8) + this.f9537a;
    }

    public String toString() {
        if (this == f9536d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i10 = this.f9537a;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        int i11 = this.f9538b;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('M');
        }
        int i12 = this.f9539c;
        if (i12 != 0) {
            sb.append(i12);
            sb.append('D');
        }
        return sb.toString();
    }
}
