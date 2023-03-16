package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.h;
import j$.util.AbstractC0251a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class c implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f9573i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final b[] f9574j = new b[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f9575k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final a[] f9576l = new a[0];

    /* renamed from: a  reason: collision with root package name */
    private final long[] f9577a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f9578b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f9579c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f9580d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f9581e;

    /* renamed from: f  reason: collision with root package name */
    private final b[] f9582f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f9583g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentMap f9584h = new ConcurrentHashMap();

    private c(ZoneOffset zoneOffset) {
        this.f9578b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f9573i;
        this.f9577a = jArr;
        this.f9579c = jArr;
        this.f9580d = f9575k;
        this.f9581e = zoneOffsetArr;
        this.f9582f = f9574j;
        this.f9583g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(TimeZone timeZone) {
        this.f9578b = r0;
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        long[] jArr = f9573i;
        this.f9577a = jArr;
        this.f9579c = jArr;
        this.f9580d = f9575k;
        this.f9581e = zoneOffsetArr;
        this.f9582f = f9574j;
        this.f9583g = timeZone;
    }

    private Object a(LocalDateTime localDateTime, a aVar) {
        LocalDateTime b10 = aVar.b();
        boolean l10 = aVar.l();
        boolean A = localDateTime.A(b10);
        return l10 ? A ? aVar.i() : localDateTime.A(aVar.a()) ? aVar : aVar.h() : !A ? aVar.h() : localDateTime.A(aVar.a()) ? aVar.i() : aVar;
    }

    private a[] b(int i10) {
        long j10;
        long j11;
        Integer valueOf = Integer.valueOf(i10);
        a[] aVarArr = (a[]) this.f9584h.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f9583g == null) {
            b[] bVarArr = this.f9582f;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length > 0) {
                b bVar = bVarArr[0];
                throw null;
            }
            if (i10 < 2100) {
                this.f9584h.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        } else if (i10 < 1800) {
            return f9576l;
        } else {
            long J = LocalDateTime.B(i10 - 1, 12, 31, 0, 0).J(this.f9578b[0]);
            long j12 = 1000;
            int offset = this.f9583g.getOffset(J * 1000);
            long j13 = 31968000 + J;
            a[] aVarArr3 = f9576l;
            while (J < j13) {
                long j14 = 7776000 + J;
                long j15 = J;
                if (offset != this.f9583g.getOffset(j14 * j12)) {
                    J = j15;
                    while (j14 - J > 1) {
                        long j16 = j13;
                        long c10 = j$.time.c.c(j14 + J, 2L);
                        long j17 = j14;
                        if (this.f9583g.getOffset(c10 * 1000) == offset) {
                            J = c10;
                            j14 = j17;
                        } else {
                            j14 = c10;
                        }
                        j12 = 1000;
                        j13 = j16;
                    }
                    j10 = j13;
                    long j18 = j14;
                    j11 = j12;
                    if (this.f9583g.getOffset(J * j11) == offset) {
                        J = j18;
                    }
                    ZoneOffset j19 = j(offset);
                    int offset2 = this.f9583g.getOffset(J * j11);
                    ZoneOffset j20 = j(offset2);
                    if (c(J, j20) == i10) {
                        a[] aVarArr4 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                        aVarArr4[aVarArr4.length - 1] = new a(J, j19, j20);
                        offset = offset2;
                        aVarArr3 = aVarArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    j10 = j13;
                    j11 = j12;
                    J = j14;
                }
                j12 = j11;
                j13 = j10;
            }
            if (1916 <= i10 && i10 < 2100) {
                this.f9584h.putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
    }

    private int c(long j10, ZoneOffset zoneOffset) {
        return h.z(j$.time.c.c(j10 + zoneOffset.s(), 86400L)).w();
    }

    private Object e(LocalDateTime localDateTime) {
        LocalDateTime[] localDateTimeArr;
        Object obj = null;
        int i10 = 0;
        if (this.f9583g != null) {
            a[] b10 = b(localDateTime.y());
            if (b10.length == 0) {
                return j(this.f9583g.getOffset(localDateTime.J(this.f9578b[0]) * 1000));
            }
            int length = b10.length;
            while (i10 < length) {
                a aVar = b10[i10];
                Object a10 = a(localDateTime, aVar);
                if ((a10 instanceof a) || a10.equals(aVar.i())) {
                    return a10;
                }
                i10++;
                obj = a10;
            }
            return obj;
        } else if (this.f9579c.length == 0) {
            return this.f9578b[0];
        } else {
            if (this.f9582f.length > 0) {
                if (localDateTime.z(this.f9580d[localDateTimeArr.length - 1])) {
                    a[] b11 = b(localDateTime.y());
                    int length2 = b11.length;
                    while (i10 < length2) {
                        a aVar2 = b11[i10];
                        Object a11 = a(localDateTime, aVar2);
                        if ((a11 instanceof a) || a11.equals(aVar2.i())) {
                            return a11;
                        }
                        i10++;
                        obj = a11;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.f9580d, localDateTime);
            if (binarySearch == -1) {
                return this.f9581e[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.f9580d;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i11 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i11])) {
                        binarySearch = i11;
                    }
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime[] localDateTimeArr3 = this.f9580d;
                LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
                ZoneOffset[] zoneOffsetArr = this.f9581e;
                int i12 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr[i12];
                ZoneOffset zoneOffset2 = zoneOffsetArr[i12 + 1];
                return zoneOffset2.s() > zoneOffset.s() ? new a(localDateTime2, zoneOffset, zoneOffset2) : new a(localDateTime3, zoneOffset, zoneOffset2);
            }
            return this.f9581e[(binarySearch / 2) + 1];
        }
    }

    public static c i(ZoneOffset zoneOffset) {
        return new c(zoneOffset);
    }

    private static ZoneOffset j(int i10) {
        return ZoneOffset.v(i10 / 1000);
    }

    public ZoneOffset d(Instant instant) {
        long[] jArr;
        ZoneOffset[] zoneOffsetArr;
        TimeZone timeZone = this.f9583g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f9579c.length == 0) {
            return this.f9578b[0];
        }
        long q10 = instant.q();
        if (this.f9582f.length > 0) {
            if (q10 > this.f9579c[jArr.length - 1]) {
                a[] b10 = b(c(q10, this.f9581e[zoneOffsetArr.length - 1]));
                a aVar = null;
                for (int i10 = 0; i10 < b10.length; i10++) {
                    aVar = b10[i10];
                    if (q10 < aVar.n()) {
                        return aVar.i();
                    }
                }
                return aVar.h();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f9579c, q10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f9581e[binarySearch + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return AbstractC0251a.x(this.f9583g, cVar.f9583g) && Arrays.equals(this.f9577a, cVar.f9577a) && Arrays.equals(this.f9578b, cVar.f9578b) && Arrays.equals(this.f9579c, cVar.f9579c) && Arrays.equals(this.f9581e, cVar.f9581e) && Arrays.equals(this.f9582f, cVar.f9582f);
        }
        return false;
    }

    public a f(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        if (e10 instanceof a) {
            return (a) e10;
        }
        return null;
    }

    public List g(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        return e10 instanceof a ? ((a) e10).k() : Collections.singletonList((ZoneOffset) e10);
    }

    public boolean h() {
        TimeZone timeZone = this.f9583g;
        if (timeZone == null) {
            return this.f9579c.length == 0;
        } else if (timeZone.useDaylightTime() || this.f9583g.getDSTSavings() != 0) {
            return false;
        } else {
            Instant instant = Instant.f9412c;
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            Instant s10 = Instant.s(System.currentTimeMillis());
            a aVar = null;
            if (this.f9583g != null) {
                long q10 = s10.q();
                if (s10.r() > 0 && q10 < Long.MAX_VALUE) {
                    q10++;
                }
                int c10 = c(q10, d(s10));
                a[] b10 = b(c10);
                int length = b10.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (q10 > b10[length].n()) {
                            aVar = b10[length];
                            break;
                        }
                        length--;
                    } else if (c10 > 1800) {
                        a[] b11 = b(c10 - 1);
                        int length2 = b11.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(q10 - 31104000, (j$.time.c.g().f() / 1000) + 31968000);
                                int offset = this.f9583g.getOffset((q10 - 1) * 1000);
                                long H = h.y(1800, 1, 1).H() * 86400;
                                while (true) {
                                    if (H > min) {
                                        break;
                                    }
                                    int offset2 = this.f9583g.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c11 = c(min, j(offset2));
                                        a[] b12 = b(c11 + 1);
                                        int length3 = b12.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                a[] b13 = b(c11);
                                                aVar = b13[b13.length - 1];
                                                break;
                                            } else if (q10 > b12[length3].n()) {
                                                aVar = b12[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (q10 > b11[length2].n()) {
                                aVar = b11[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.f9579c.length != 0) {
                long q11 = s10.q();
                if (s10.r() > 0 && q11 < Long.MAX_VALUE) {
                    q11++;
                }
                long[] jArr = this.f9579c;
                long j10 = jArr[jArr.length - 1];
                if (this.f9582f.length > 0 && q11 > j10) {
                    ZoneOffset[] zoneOffsetArr = this.f9581e;
                    ZoneOffset zoneOffset2 = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int c12 = c(q11, zoneOffset2);
                    a[] b14 = b(c12);
                    int length4 = b14.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i10 = c12 - 1;
                            if (i10 > c(j10, zoneOffset2)) {
                                a[] b15 = b(i10);
                                aVar = b15[b15.length - 1];
                            }
                        } else if (q11 > b14[length4].n()) {
                            aVar = b14[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.f9579c, q11);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i11 = binarySearch - 1;
                    long j11 = this.f9579c[i11];
                    ZoneOffset[] zoneOffsetArr2 = this.f9581e;
                    aVar = new a(j11, zoneOffsetArr2[i11], zoneOffsetArr2[binarySearch]);
                }
            }
            return aVar == null;
        }
    }

    public int hashCode() {
        TimeZone timeZone = this.f9583g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f9577a)) ^ Arrays.hashCode(this.f9578b)) ^ Arrays.hashCode(this.f9579c)) ^ Arrays.hashCode(this.f9581e)) ^ Arrays.hashCode(this.f9582f);
    }

    public String toString() {
        StringBuilder b10;
        if (this.f9583g != null) {
            b10 = j$.time.a.b("ZoneRules[timeZone=");
            b10.append(this.f9583g.getID());
        } else {
            b10 = j$.time.a.b("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f9578b;
            b10.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        b10.append("]");
        return b10.toString();
    }
}
