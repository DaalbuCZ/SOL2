package j$.time;

import j$.time.temporal.TemporalAccessor;
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
public final class l implements j$.time.temporal.k, j$.time.temporal.l, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final l f9524e;

    /* renamed from: f  reason: collision with root package name */
    public static final l f9525f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f9526g;

    /* renamed from: h  reason: collision with root package name */
    private static final l[] f9527h = new l[24];

    /* renamed from: a  reason: collision with root package name */
    private final byte f9528a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f9529b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f9530c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9531d;

    static {
        int i10 = 0;
        while (true) {
            l[] lVarArr = f9527h;
            if (i10 >= lVarArr.length) {
                f9526g = lVarArr[0];
                l lVar = lVarArr[12];
                f9524e = lVarArr[0];
                f9525f = new l(23, 59, 59, 999999999);
                return;
            }
            lVarArr[i10] = new l(i10, 0, 0, 0);
            i10++;
        }
    }

    private l(int i10, int i11, int i12, int i13) {
        this.f9528a = (byte) i10;
        this.f9529b = (byte) i11;
        this.f9530c = (byte) i12;
        this.f9531d = i13;
    }

    private static l p(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f9527h[i10] : new l(i10, i11, i12, i13);
    }

    public static l q(TemporalAccessor temporalAccessor) {
        l lVar = (l) temporalAccessor.m(v.f9565a);
        if (lVar != null) {
            return lVar;
        }
        throw new d("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int r(j$.time.temporal.o oVar) {
        switch (k.f9522a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.f9531d;
            case 2:
                throw new y("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f9531d / 1000;
            case 4:
                throw new y("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f9531d / 1000000;
            case 6:
                return (int) (D() / 1000000);
            case 7:
                return this.f9530c;
            case 8:
                return E();
            case 9:
                return this.f9529b;
            case 10:
                return (this.f9528a * 60) + this.f9529b;
            case 11:
                return this.f9528a % 12;
            case 12:
                int i10 = this.f9528a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f9528a;
            case 14:
                byte b10 = this.f9528a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f9528a / 12;
            default:
                throw new y("Unsupported field: " + oVar);
        }
    }

    public static l w(int i10, int i11) {
        j$.time.temporal.a.HOUR_OF_DAY.o(i10);
        if (i11 == 0) {
            return f9527h[i10];
        }
        j$.time.temporal.a.MINUTE_OF_HOUR.o(i11);
        return new l(i10, i11, 0, 0);
    }

    public static l x(int i10, int i11, int i12, int i13) {
        j$.time.temporal.a.HOUR_OF_DAY.o(i10);
        j$.time.temporal.a.MINUTE_OF_HOUR.o(i11);
        j$.time.temporal.a.SECOND_OF_MINUTE.o(i12);
        j$.time.temporal.a.NANO_OF_SECOND.o(i13);
        return p(i10, i11, i12, i13);
    }

    public static l y(long j10) {
        j$.time.temporal.a.NANO_OF_DAY.o(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i10 * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i11 * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return p(i10, i11, i12, (int) (j12 - (i12 * 1000000000)));
    }

    public l A(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f9528a * 60) + this.f9529b;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : p(i11 / 60, i11 % 60, this.f9530c, this.f9531d);
    }

    public l B(long j10) {
        if (j10 == 0) {
            return this;
        }
        long D = D();
        long j11 = (((j10 % 86400000000000L) + D) + 86400000000000L) % 86400000000000L;
        return D == j11 ? this : p((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public l C(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f9529b * 60) + (this.f9528a * 3600) + this.f9530c;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : p(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f9531d);
    }

    public long D() {
        return (this.f9530c * 1000000000) + (this.f9529b * 60000000000L) + (this.f9528a * 3600000000000L) + this.f9531d;
    }

    public int E() {
        return (this.f9529b * 60) + (this.f9528a * 3600) + this.f9530c;
    }

    @Override // j$.time.temporal.k
    /* renamed from: F */
    public l c(j$.time.temporal.o oVar, long j10) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.o(j10);
            switch (k.f9522a[aVar.ordinal()]) {
                case 1:
                    return H((int) j10);
                case 2:
                    return y(j10);
                case 3:
                    return H(((int) j10) * 1000);
                case 4:
                    return y(j10 * 1000);
                case 5:
                    return H(((int) j10) * 1000000);
                case 6:
                    return y(j10 * 1000000);
                case 7:
                    int i10 = (int) j10;
                    if (this.f9530c == i10) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.o(i10);
                    return p(this.f9528a, this.f9529b, i10, this.f9531d);
                case 8:
                    return C(j10 - E());
                case 9:
                    int i11 = (int) j10;
                    if (this.f9529b == i11) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.o(i11);
                    return p(this.f9528a, i11, this.f9530c, this.f9531d);
                case 10:
                    return A(j10 - ((this.f9528a * 60) + this.f9529b));
                case 11:
                    return z(j10 - (this.f9528a % 12));
                case 12:
                    if (j10 == 12) {
                        j10 = 0;
                    }
                    return z(j10 - (this.f9528a % 12));
                case 13:
                    return G((int) j10);
                case 14:
                    if (j10 == 24) {
                        j10 = 0;
                    }
                    return G((int) j10);
                case 15:
                    return z((j10 - (this.f9528a / 12)) * 12);
                default:
                    throw new y("Unsupported field: " + oVar);
            }
        }
        return (l) oVar.i(this, j10);
    }

    public l G(int i10) {
        if (this.f9528a == i10) {
            return this;
        }
        j$.time.temporal.a.HOUR_OF_DAY.o(i10);
        return p(i10, this.f9529b, this.f9530c, this.f9531d);
    }

    public l H(int i10) {
        if (this.f9531d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.o(i10);
        return p(this.f9528a, this.f9529b, this.f9530c, i10);
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.NANO_OF_DAY, D());
    }

    @Override // j$.time.temporal.k
    public j$.time.temporal.k b(j$.time.temporal.l lVar) {
        boolean z10 = lVar instanceof l;
        j$.time.temporal.k kVar = lVar;
        if (!z10) {
            kVar = ((h) lVar).a(this);
        }
        return (l) kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f9528a == lVar.f9528a && this.f9529b == lVar.f9529b && this.f9530c == lVar.f9530c && this.f9531d == lVar.f9531d;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? r(oVar) : j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar.g() : oVar != null && oVar.h(this);
    }

    public int hashCode() {
        long D = D();
        return (int) (D ^ (D >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.d(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.NANO_OF_DAY ? D() : oVar == j$.time.temporal.a.MICRO_OF_DAY ? D() / 1000 : r(oVar) : oVar.b(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // j$.time.temporal.k
    public j$.time.temporal.k l(long j10, x xVar) {
        long j11;
        long j12;
        if (!(xVar instanceof j$.time.temporal.b)) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) xVar;
            Objects.requireNonNull(bVar);
            return (l) l(j10, bVar);
        }
        switch (k.f9523b[((j$.time.temporal.b) xVar).ordinal()]) {
            case 1:
                return B(j10);
            case 2:
                j11 = j10 % 86400000000L;
                j12 = 1000;
                j10 = j11 * j12;
                return B(j10);
            case 3:
                j11 = j10 % 86400000;
                j12 = 1000000;
                j10 = j11 * j12;
                return B(j10);
            case 4:
                return C(j10);
            case 5:
                return A(j10);
            case 6:
                break;
            case 7:
                j10 = (j10 % 2) * 12;
                break;
            default:
                throw new y("Unsupported unit: " + xVar);
        }
        return z(j10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        if (wVar == j$.time.temporal.q.f9560a || wVar == j$.time.temporal.p.f9559a || wVar == t.f9563a || wVar == j$.time.temporal.s.f9562a) {
            return null;
        }
        if (wVar == v.f9565a) {
            return this;
        }
        if (wVar == u.f9564a) {
            return null;
        }
        return wVar == j$.time.temporal.r.f9561a ? j$.time.temporal.b.NANOS : wVar.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: o */
    public int compareTo(l lVar) {
        int compare = Integer.compare(this.f9528a, lVar.f9528a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f9529b, lVar.f9529b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.f9530c, lVar.f9530c);
                return compare3 == 0 ? Integer.compare(this.f9531d, lVar.f9531d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    public int s() {
        return this.f9528a;
    }

    public int t() {
        return this.f9529b;
    }

    public String toString() {
        int i10;
        StringBuilder sb = new StringBuilder(18);
        byte b10 = this.f9528a;
        byte b11 = this.f9529b;
        byte b12 = this.f9530c;
        int i11 = this.f9531d;
        sb.append(b10 < 10 ? "0" : "");
        sb.append((int) b10);
        sb.append(b11 < 10 ? ":0" : ":");
        sb.append((int) b11);
        if (b12 > 0 || i11 > 0) {
            sb.append(b12 >= 10 ? ":" : ":0");
            sb.append((int) b12);
            if (i11 > 0) {
                sb.append('.');
                int i12 = 1000000;
                if (i11 % 1000000 == 0) {
                    i10 = (i11 / 1000000) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = 1000000000;
                    }
                    i10 = i11 + i12;
                }
                sb.append(Integer.toString(i10).substring(1));
            }
        }
        return sb.toString();
    }

    public int u() {
        return this.f9531d;
    }

    public int v() {
        return this.f9530c;
    }

    public l z(long j10) {
        return j10 == 0 ? this : p(((((int) (j10 % 24)) + this.f9528a) + 24) % 24, this.f9529b, this.f9530c, this.f9531d);
    }
}
