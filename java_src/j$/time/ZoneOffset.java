package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.t;
import j$.time.temporal.w;
import j$.time.temporal.y;
import j$.time.temporal.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.l, Comparable<ZoneOffset> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9425a;

    /* renamed from: b  reason: collision with root package name */
    private final transient String f9426b;

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap f9421c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap f9422d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = v(0);

    /* renamed from: e  reason: collision with root package name */
    public static final ZoneOffset f9423e = v(-64800);

    /* renamed from: f  reason: collision with root package name */
    public static final ZoneOffset f9424f = v(64800);

    private ZoneOffset(int i10) {
        String sb;
        this.f9425a = i10;
        if (i10 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? "0" : "");
            sb2.append(i11);
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                sb2.append(i13 >= 10 ? ":" : ":0");
                sb2.append(i13);
            }
            sb = sb2.toString();
        }
        this.f9426b = sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset t(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.ZoneOffset.f9422d
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6e
            r1 = 3
            if (r0 == r1) goto L8a
            r4 = 5
            if (r0 == r4) goto L64
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5b
            r5 = 7
            if (r0 == r5) goto L4e
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = w(r7, r2, r3)
            int r1 = w(r7, r6, r2)
            int r2 = w(r7, r5, r2)
            goto L90
        L37:
            j$.time.d r0 = new j$.time.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L4e:
            int r0 = w(r7, r2, r3)
            int r1 = w(r7, r1, r3)
            int r2 = w(r7, r4, r3)
            goto L90
        L5b:
            int r0 = w(r7, r2, r3)
            int r1 = w(r7, r6, r2)
            goto L6c
        L64:
            int r0 = w(r7, r2, r3)
            int r1 = w(r7, r1, r3)
        L6c:
            r2 = r3
            goto L90
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L8a:
            int r0 = w(r7, r2, r3)
            r1 = r3
            r2 = r1
        L90:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb4
            if (r3 != r5) goto L9d
            goto Lb4
        L9d:
            j$.time.d r0 = new j$.time.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        Lb4:
            if (r3 != r5) goto Lbe
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = u(r7, r0, r1)
            return r7
        Lbe:
            j$.time.ZoneOffset r7 = u(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.t(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset u(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new d("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new d("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new d("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new d("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new d("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        } else if (i12 < -59 || i12 > 59) {
            throw new d("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        } else if (Math.abs(i10) != 18 || (i11 | i12) == 0) {
            return v((i11 * 60) + (i10 * 3600) + i12);
        } else {
            throw new d("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset v(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new d("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i10);
            ConcurrentMap concurrentMap = f9421c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i10));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
                f9422d.putIfAbsent(zoneOffset2.f9426b, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i10);
    }

    private static int w(CharSequence charSequence, int i10, boolean z10) {
        if (z10 && charSequence.charAt(i10 - 1) != ':') {
            throw new d("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i10);
        char charAt2 = charSequence.charAt(i10 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new d("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    @Override // j$.time.temporal.l
    public j$.time.temporal.k a(j$.time.temporal.k kVar) {
        return kVar.c(j$.time.temporal.a.OFFSET_SECONDS, this.f9425a);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f9425a - this.f9425a;
    }

    @Override // j$.time.ZoneId
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f9425a == ((ZoneOffset) obj).f9425a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int g(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f9425a;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new y("Unsupported field: " + oVar);
        }
        return j$.time.temporal.n.d(this, oVar).a(k(oVar), oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.h(this);
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f9425a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public z i(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.d(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f9425a;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new y("Unsupported field: " + oVar);
        }
        return oVar.b(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        return (wVar == j$.time.temporal.s.f9562a || wVar == t.f9563a) ? this : j$.time.temporal.n.c(this, wVar);
    }

    @Override // j$.time.ZoneId
    public String o() {
        return this.f9426b;
    }

    @Override // j$.time.ZoneId
    public j$.time.zone.c p() {
        return j$.time.zone.c.i(this);
    }

    public int s() {
        return this.f9425a;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.f9426b;
    }
}
