package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.t;
import j$.time.temporal.u;
import j$.time.temporal.v;
import j$.time.temporal.w;
import j$.time.temporal.x;
import j$.time.temporal.y;
import j$.time.temporal.z;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.k, j$.time.temporal.l, Comparable<Instant>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Instant f9412c = new Instant(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f9413a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9414b;

    static {
        u(-31557014167219200L, 0L);
        u(31556889864403199L, 999999999L);
    }

    private Instant(long j10, int i10) {
        this.f9413a = j10;
        this.f9414b = i10;
    }

    private static Instant p(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return f9412c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new d("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public static Instant s(long j10) {
        return p(c.c(j10, 1000L), ((int) c.b(j10, 1000L)) * 1000000);
    }

    public static Instant t(long j10) {
        return p(j10, 0);
    }

    public static Instant u(long j10, long j11) {
        return p(c.a(j10, c.c(j11, 1000000000L)), (int) c.b(j11, 1000000000L));
    }

    private Instant v(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return u(c.a(c.a(this.f9413a, j10), j11 / 1000000000), this.f9414b + (j11 % 1000000000));
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.INSTANT_SECONDS, this.f9413a).c(j$.time.temporal.a.NANO_OF_SECOND, this.f9414b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.o(this, zoneOffset);
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k b(j$.time.temporal.l lVar) {
        return (Instant) ((h) lVar).a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r3 != r2.f9414b) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r3 != r2.f9414b) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r4 = r2.f9413a;
     */
    @Override // j$.time.temporal.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.time.temporal.k c(j$.time.temporal.o r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof j$.time.temporal.a
            if (r0 == 0) goto L67
            r0 = r3
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.o(r4)
            int[] r1 = j$.time.f.f9436a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L56
            r1 = 2
            if (r0 == r1) goto L48
            r1 = 3
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 != r1) goto L27
            long r0 = r2.f9413a
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L65
            int r3 = r2.f9414b
            goto L51
        L27:
            j$.time.temporal.y r4 = new j$.time.temporal.y
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported field: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L3e:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.f9414b
            if (r3 == r4) goto L65
            goto L4f
        L48:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.f9414b
            if (r3 == r4) goto L65
        L4f:
            long r4 = r2.f9413a
        L51:
            j$.time.Instant r3 = p(r4, r3)
            goto L6d
        L56:
            int r3 = r2.f9414b
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L65
            long r0 = r2.f9413a
            int r3 = (int) r4
            j$.time.Instant r3 = p(r0, r3)
            goto L6d
        L65:
            r3 = r2
            goto L6d
        L67:
            j$.time.temporal.k r3 = r3.i(r2, r4)
            j$.time.Instant r3 = (j$.time.Instant) r3
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.c(j$.time.temporal.o, long):j$.time.temporal.k");
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f9413a, instant2.f9413a);
        return compare != 0 ? compare : this.f9414b - instant2.f9414b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f9413a == instant.f9413a && this.f9414b == instant.f9414b;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = f.f9436a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.m(this.f9413a);
                        }
                        throw new y("Unsupported field: " + oVar);
                    }
                    return this.f9414b / 1000000;
                }
                return this.f9414b / 1000;
            }
            return this.f9414b;
        }
        return j$.time.temporal.n.d(this, oVar).a(oVar.b(this), oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.NANO_OF_SECOND || oVar == j$.time.temporal.a.MICRO_OF_SECOND || oVar == j$.time.temporal.a.MILLI_OF_SECOND : oVar != null && oVar.h(this);
    }

    public int hashCode() {
        long j10 = this.f9413a;
        return (this.f9414b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.d(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        int i10;
        if (oVar instanceof j$.time.temporal.a) {
            int i11 = f.f9436a[((j$.time.temporal.a) oVar).ordinal()];
            if (i11 == 1) {
                i10 = this.f9414b;
            } else if (i11 == 2) {
                i10 = this.f9414b / 1000;
            } else if (i11 != 3) {
                if (i11 == 4) {
                    return this.f9413a;
                }
                throw new y("Unsupported field: " + oVar);
            } else {
                i10 = this.f9414b / 1000000;
            }
            return i10;
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k l(long j10, x xVar) {
        long j11;
        if (xVar instanceof j$.time.temporal.b) {
            switch (f.f9437b[((j$.time.temporal.b) xVar).ordinal()]) {
                case 1:
                    return v(0L, j10);
                case 2:
                    return v(j10 / 1000000, (j10 % 1000000) * 1000);
                case 3:
                    return v(j10 / 1000, (j10 % 1000) * 1000000);
                case 4:
                    return v(j10, 0L);
                case 5:
                    j11 = 60;
                    break;
                case 6:
                    j11 = 3600;
                    break;
                case 7:
                    j11 = 43200;
                    break;
                case 8:
                    j11 = 86400;
                    break;
                default:
                    throw new y("Unsupported unit: " + xVar);
            }
            return w(c.d(j10, j11));
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) xVar;
        Objects.requireNonNull(bVar);
        return (Instant) l(j10, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        if (wVar == j$.time.temporal.r.f9561a) {
            return j$.time.temporal.b.NANOS;
        }
        if (wVar == j$.time.temporal.q.f9560a || wVar == j$.time.temporal.p.f9559a || wVar == t.f9563a || wVar == j$.time.temporal.s.f9562a || wVar == u.f9564a || wVar == v.f9565a) {
            return null;
        }
        return wVar.a(this);
    }

    public int o(Instant instant) {
        int compare = Long.compare(this.f9413a, instant.f9413a);
        return compare != 0 ? compare : this.f9414b - instant.f9414b;
    }

    public long q() {
        return this.f9413a;
    }

    public int r() {
        return this.f9414b;
    }

    public long toEpochMilli() {
        long d10;
        int i10;
        long j10 = this.f9413a;
        if (j10 >= 0 || this.f9414b <= 0) {
            d10 = c.d(j10, 1000L);
            i10 = this.f9414b / 1000000;
        } else {
            d10 = c.d(j10 + 1, 1000L);
            i10 = (this.f9414b / 1000000) - 1000;
        }
        return c.a(d10, i10);
    }

    public String toString() {
        return DateTimeFormatter.f9440h.format(this);
    }

    public Instant w(long j10) {
        return v(j10, 0L);
    }
}
