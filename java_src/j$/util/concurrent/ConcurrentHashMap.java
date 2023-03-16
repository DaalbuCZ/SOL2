package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, u {

    /* renamed from: g  reason: collision with root package name */
    private static final int f9645g = (1 << (32 - 16)) - 1;

    /* renamed from: h  reason: collision with root package name */
    private static final int f9646h = 32 - 16;

    /* renamed from: i  reason: collision with root package name */
    static final int f9647i = Runtime.getRuntime().availableProcessors();

    /* renamed from: j  reason: collision with root package name */
    private static final Unsafe f9648j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f9649k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f9650l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f9651m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f9652n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f9653o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f9654p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f9655q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient l[] f9656a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient l[] f9657b;
    private volatile transient long baseCount;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient c[] f9658c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient i f9659d;

    /* renamed from: e  reason: collision with root package name */
    private transient s f9660e;

    /* renamed from: f  reason: collision with root package name */
    private transient e f9661f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c10 = v.c();
            f9648j = c10;
            f9649k = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            f9650l = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            f9651m = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            f9652n = c10.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            f9653o = c10.objectFieldOffset(c.class.getDeclaredField("value"));
            f9654p = c10.arrayBaseOffset(l[].class);
            int arrayIndexScale = c10.arrayIndexScale(l[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            f9655q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i10 >= 536870912 ? 1073741824 : o(i10 + (i10 >>> 1) + 1);
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((i10 < i11 ? i11 : i10) / f10) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : o((int) j10);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.c[] r0 = r11.f9658c
            if (r0 != 0) goto L14
            sun.misc.Unsafe r1 = j$.util.concurrent.ConcurrentHashMap.f9648j
            long r3 = j$.util.concurrent.ConcurrentHashMap.f9651m
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L96
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L96
            int r3 = j$.util.concurrent.ThreadLocalRandom.b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L96
            sun.misc.Unsafe r3 = j$.util.concurrent.ConcurrentHashMap.f9648j
            long r5 = j$.util.concurrent.ConcurrentHashMap.f9653o
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L96
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.m()
        L3b:
            if (r14 < 0) goto L95
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L95
            j$.util.concurrent.l[] r12 = r11.f9656a
            if (r12 == 0) goto L95
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L95
            int r13 = j(r13)
            if (r4 >= 0) goto L7c
            int r14 = j$.util.concurrent.ConcurrentHashMap.f9646h
            int r14 = r4 >>> r14
            if (r14 != r13) goto L95
            int r14 = r13 + 1
            if (r4 == r14) goto L95
            int r14 = j$.util.concurrent.ConcurrentHashMap.f9645g
            int r13 = r13 + r14
            if (r4 == r13) goto L95
            j$.util.concurrent.l[] r13 = r11.f9657b
            if (r13 == 0) goto L95
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6b
            goto L95
        L6b:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.f9648j
            long r2 = j$.util.concurrent.ConcurrentHashMap.f9649k
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L90
            r11.p(r12, r13)
            goto L90
        L7c:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.f9648j
            long r2 = j$.util.concurrent.ConcurrentHashMap.f9649k
            int r14 = j$.util.concurrent.ConcurrentHashMap.f9646h
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L90
            r13 = 0
            r11.p(r12, r13)
        L90:
            long r9 = r11.m()
            goto L3d
        L95:
            return
        L96:
            r11.e(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(l[] lVarArr, int i10, l lVar, l lVar2) {
        return j$.time.temporal.n.e(f9648j, lVarArr, (i10 << f9655q) + f9654p, null, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (r24.f9658c != r7) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
        r1 = new j$.util.concurrent.c[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
        if (r2 >= r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ab, code lost:
        r24.f9658c = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.e(long, boolean):void");
    }

    private final l[] g() {
        while (true) {
            l[] lVarArr = this.f9656a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else if (f9648j.compareAndSwapInt(this, f9649k, i10, -1)) {
                try {
                    l[] lVarArr2 = this.f9656a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i11 = i10 > 0 ? i10 : 16;
                        l[] lVarArr3 = new l[i11];
                        this.f9656a = lVarArr3;
                        i10 = i11 - (i11 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i10;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i10;
                    throw th;
                }
            }
        }
    }

    static final int j(int i10) {
        return Integer.numberOfLeadingZeros(i10) | 32768;
    }

    static final void k(l[] lVarArr, int i10, l lVar) {
        f9648j.putObjectVolatile(lVarArr, (i10 << f9655q) + f9654p, lVar);
    }

    static final int l(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l n(l[] lVarArr, int i10) {
        return (l) f9648j.getObjectVolatile(lVarArr, (i10 << f9655q) + f9654p);
    }

    private static final int o(int i10) {
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        if (i16 < 0) {
            return 1;
        }
        if (i16 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r15v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.l] */
    private final void p(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        l[] lVarArr4;
        int i10;
        int i11;
        g gVar;
        boolean z10;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i12;
        r rVar;
        r rVar2;
        boolean z11;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = lVarArr.length;
        int i13 = f9647i;
        boolean z12 = true;
        int i14 = i13 > 1 ? (length >>> 3) / i13 : length;
        int i15 = i14 < 16 ? 16 : i14;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap3.f9657b = lVarArr5;
                concurrentHashMap3.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        l[] lVarArr6 = lVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        boolean z13 = true;
        int i16 = 0;
        int i17 = 0;
        boolean z14 = false;
        while (true) {
            if (z13) {
                int i18 = i16 - 1;
                if (i18 >= i17 || z14) {
                    concurrentHashMap = concurrentHashMap4;
                    lVarArr4 = lVarArr6;
                    i16 = i18;
                    i17 = i17;
                } else {
                    int i19 = concurrentHashMap4.transferIndex;
                    if (i19 <= 0) {
                        i16 = -1;
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                    } else {
                        Unsafe unsafe = f9648j;
                        long j10 = f9650l;
                        int i20 = i19 > i15 ? i19 - i15 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        int i21 = i17;
                        if (unsafe.compareAndSwapInt(this, j10, i19, i20)) {
                            i16 = i19 - 1;
                            i17 = i20;
                        } else {
                            lVarArr6 = lVarArr4;
                            i16 = i18;
                            i17 = i21;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                }
                lVarArr6 = lVarArr4;
                concurrentHashMap4 = concurrentHashMap;
                z13 = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                l[] lVarArr7 = lVarArr6;
                int i22 = i17;
                r rVar3 = null;
                if (i16 < 0 || i16 >= length || (i12 = i16 + length) >= length2) {
                    i10 = i15;
                    i11 = length2;
                    gVar = gVar2;
                    if (z14) {
                        this.f9657b = null;
                        this.f9656a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    z10 = true;
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = f9648j;
                    long j11 = f9649k;
                    int i23 = concurrentHashMap2.sizeCtl;
                    int i24 = i16;
                    if (!unsafe2.compareAndSwapInt(this, j11, i23, i23 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        lVarArr6 = lVarArr7;
                        i16 = i24;
                    } else if (i23 - 2 != (j(length) << f9646h)) {
                        return;
                    } else {
                        i16 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        z13 = true;
                        z14 = true;
                        lVarArr6 = lVarArr7;
                    }
                } else {
                    l n10 = n(lVarArr7, i16);
                    if (n10 == null) {
                        z11 = b(lVarArr7, i16, null, gVar2);
                    } else {
                        int i25 = n10.f9681a;
                        if (i25 == -1) {
                            z11 = z12;
                        } else {
                            synchronized (n10) {
                                if (n(lVarArr7, i16) == n10) {
                                    if (i25 >= 0) {
                                        int i26 = i25 & length;
                                        r rVar4 = n10;
                                        for (r rVar5 = n10.f9684d; rVar5 != null; rVar5 = rVar5.f9684d) {
                                            int i27 = rVar5.f9681a & length;
                                            if (i27 != i26) {
                                                rVar4 = rVar5;
                                                i26 = i27;
                                            }
                                        }
                                        if (i26 == 0) {
                                            rVar = rVar4;
                                        } else {
                                            rVar = null;
                                            rVar3 = rVar4;
                                        }
                                        l lVar = n10;
                                        while (lVar != rVar4) {
                                            int i28 = lVar.f9681a;
                                            int i29 = i15;
                                            Object obj = lVar.f9682b;
                                            int i30 = length2;
                                            Object obj2 = lVar.f9683c;
                                            if ((i28 & length) == 0) {
                                                rVar2 = rVar4;
                                                rVar = new l(i28, obj, obj2, rVar);
                                            } else {
                                                rVar2 = rVar4;
                                                rVar3 = new l(i28, obj, obj2, rVar3);
                                            }
                                            lVar = lVar.f9684d;
                                            i15 = i29;
                                            length2 = i30;
                                            rVar4 = rVar2;
                                        }
                                        i10 = i15;
                                        i11 = length2;
                                        k(lVarArr3, i16, rVar);
                                        k(lVarArr3, i12, rVar3);
                                        k(lVarArr7, i16, gVar2);
                                        gVar = gVar2;
                                    } else {
                                        i10 = i15;
                                        i11 = length2;
                                        if (n10 instanceof q) {
                                            q qVar = (q) n10;
                                            r rVar6 = null;
                                            r rVar7 = null;
                                            l lVar2 = qVar.f9700f;
                                            int i31 = 0;
                                            int i32 = 0;
                                            r rVar8 = null;
                                            while (lVar2 != null) {
                                                q qVar2 = qVar;
                                                int i33 = lVar2.f9681a;
                                                g gVar3 = gVar2;
                                                r rVar9 = new r(i33, lVar2.f9682b, lVar2.f9683c, null, null);
                                                if ((i33 & length) == 0) {
                                                    rVar9.f9705h = rVar7;
                                                    if (rVar7 == null) {
                                                        rVar3 = rVar9;
                                                    } else {
                                                        rVar7.f9684d = rVar9;
                                                    }
                                                    i31++;
                                                    rVar7 = rVar9;
                                                } else {
                                                    rVar9.f9705h = rVar6;
                                                    if (rVar6 == null) {
                                                        rVar8 = rVar9;
                                                    } else {
                                                        rVar6.f9684d = rVar9;
                                                    }
                                                    i32++;
                                                    rVar6 = rVar9;
                                                }
                                                lVar2 = lVar2.f9684d;
                                                qVar = qVar2;
                                                gVar2 = gVar3;
                                            }
                                            q qVar3 = qVar;
                                            g gVar4 = gVar2;
                                            l s10 = i31 <= 6 ? s(rVar3) : i32 != 0 ? new q(rVar3) : qVar3;
                                            l s11 = i32 <= 6 ? s(rVar8) : i31 != 0 ? new q(rVar8) : qVar3;
                                            k(lVarArr3, i16, s10);
                                            k(lVarArr3, i12, s11);
                                            gVar = gVar4;
                                            k(lVarArr, i16, gVar);
                                            lVarArr7 = lVarArr;
                                        }
                                    }
                                    z13 = true;
                                } else {
                                    i10 = i15;
                                    i11 = length2;
                                }
                                gVar = gVar2;
                            }
                            concurrentHashMap4 = this;
                            lVarArr6 = lVarArr7;
                            z10 = true;
                            concurrentHashMap2 = concurrentHashMap4;
                        }
                    }
                    z13 = z11;
                    i10 = i15;
                    i11 = length2;
                    lVarArr6 = lVarArr7;
                    concurrentHashMap4 = concurrentHashMap5;
                    z10 = z12;
                    concurrentHashMap2 = concurrentHashMap3;
                    gVar = gVar2;
                }
                gVar2 = gVar;
                concurrentHashMap3 = concurrentHashMap2;
                z12 = z10;
                i17 = i22;
                i15 = i10;
                length2 = i11;
            }
        }
    }

    private final void q(l[] lVarArr, int i10) {
        int length = lVarArr.length;
        if (length < 64) {
            r(length << 1);
            return;
        }
        l n10 = n(lVarArr, i10);
        if (n10 == null || n10.f9681a < 0) {
            return;
        }
        synchronized (n10) {
            if (n(lVarArr, i10) == n10) {
                r rVar = null;
                l lVar = n10;
                r rVar2 = null;
                while (lVar != null) {
                    r rVar3 = new r(lVar.f9681a, lVar.f9682b, lVar.f9683c, null, null);
                    rVar3.f9705h = rVar2;
                    if (rVar2 == null) {
                        rVar = rVar3;
                    } else {
                        rVar2.f9684d = rVar3;
                    }
                    lVar = lVar.f9684d;
                    rVar2 = rVar3;
                }
                k(lVarArr, i10, new q(rVar));
            }
        }
    }

    private final void r(int i10) {
        int length;
        l[] lVarArr;
        int o10 = i10 >= 536870912 ? 1073741824 : o(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 < 0) {
                return;
            }
            l[] lVarArr2 = this.f9656a;
            if (lVarArr2 == null || (length = lVarArr2.length) == 0) {
                int i12 = i11 > o10 ? i11 : o10;
                if (f9648j.compareAndSwapInt(this, f9649k, i11, -1)) {
                    try {
                        if (this.f9656a == lVarArr2) {
                            this.f9656a = new l[i12];
                            i11 = i12 - (i12 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i11;
                    }
                } else {
                    continue;
                }
            } else if (o10 <= i11 || length >= 1073741824) {
                return;
            } else {
                if (lVarArr2 == this.f9656a) {
                    int j10 = j(length);
                    if (i11 < 0) {
                        if ((i11 >>> f9646h) != j10 || i11 == j10 + 1 || i11 == j10 + f9645g || (lVarArr = this.f9657b) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (f9648j.compareAndSwapInt(this, f9649k, i11, i11 + 1)) {
                            p(lVarArr2, lVarArr);
                        }
                    } else if (f9648j.compareAndSwapInt(this, f9649k, i11, (j10 << f9646h) + 2)) {
                        p(lVarArr2, null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        int o10;
        boolean z10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j12++;
            lVar = new l(l(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z11 = true;
        if (j12 >= 536870912) {
            o10 = 1073741824;
        } else {
            int i10 = (int) j12;
            o10 = o(i10 + (i10 >>> 1) + 1);
        }
        l[] lVarArr = new l[o10];
        int i11 = o10 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f9684d;
            int i12 = lVar.f9681a;
            int i13 = i12 & i11;
            l n10 = n(lVarArr, i13);
            if (n10 == null) {
                z10 = z11;
            } else {
                Object obj2 = lVar.f9682b;
                if (n10.f9681a >= 0) {
                    int i14 = 0;
                    for (l lVar3 = n10; lVar3 != null; lVar3 = lVar3.f9684d) {
                        if (lVar3.f9681a == i12 && ((obj = lVar3.f9682b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i14++;
                    }
                    z10 = true;
                    if (z10 && i14 >= 8) {
                        j11++;
                        lVar.f9684d = n10;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j13 = j11;
                            r rVar3 = new r(lVar4.f9681a, lVar4.f9682b, lVar4.f9683c, null, null);
                            rVar3.f9705h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f9684d = rVar3;
                            }
                            lVar4 = lVar4.f9684d;
                            rVar2 = rVar3;
                            j11 = j13;
                        }
                        k(lVarArr, i13, new q(rVar));
                    }
                } else if (((q) n10).f(i12, obj2, lVar.f9683c) == null) {
                    j11 += j10;
                }
                z10 = false;
            }
            if (z10) {
                j11++;
                lVar.f9684d = n10;
                k(lVarArr, i13, lVar);
            }
            j10 = 1;
            lVar = lVar2;
            z11 = true;
        }
        this.f9656a = lVarArr;
        this.sizeCtl = o10 - (o10 >>> 2);
        this.baseCount = j11;
    }

    static l s(l lVar) {
        l lVar2 = null;
        l lVar3 = null;
        while (lVar != null) {
            l lVar4 = new l(lVar.f9681a, lVar.f9682b, lVar.f9683c, null);
            if (lVar3 == null) {
                lVar2 = lVar4;
            } else {
                lVar3.f9684d = lVar4;
            }
            lVar = lVar.f9684d;
            lVar3 = lVar4;
        }
        return lVar2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 0;
        int i11 = 1;
        while (i11 < 16) {
            i10++;
            i11 <<= 1;
        }
        int i12 = 32 - i10;
        int i13 = i11 - 1;
        n[] nVarArr = new n[16];
        for (int i14 = 0; i14 < 16; i14++) {
            nVarArr[i14] = new n(0.75f);
        }
        objectOutputStream.putFields().put("segments", nVarArr);
        objectOutputStream.putFields().put("segmentShift", i12);
        objectOutputStream.putFields().put("segmentMask", i13);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f9656a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b10 = pVar.b();
                if (b10 == null) {
                    break;
                }
                objectOutputStream.writeObject(b10.f9682b);
                objectOutputStream.writeObject(b10.f9683c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void clear() {
        l[] lVarArr = this.f9656a;
        int i10 = 0;
        long j10 = 0;
        while (lVarArr != null && i10 < lVarArr.length) {
            l n10 = n(lVarArr, i10);
            if (n10 == null) {
                i10++;
            } else {
                int i11 = n10.f9681a;
                if (i11 == -1) {
                    lVarArr = f(lVarArr, n10);
                    i10 = 0;
                } else {
                    synchronized (n10) {
                        if (n(lVarArr, i10) == n10) {
                            for (l lVar = i11 >= 0 ? n10 : n10 instanceof q ? ((q) n10).f9700f : null; lVar != null; lVar = lVar.f9684d) {
                                j10--;
                            }
                            k(lVarArr, i10, null);
                            i10++;
                        }
                    }
                }
            }
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    @Override // j$.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        int i10;
        l lVar;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int l10 = l(obj.hashCode());
        l[] lVarArr = this.f9656a;
        int i11 = 0;
        Object obj4 = null;
        int i12 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & l10;
                    l n10 = n(lVarArr, i13);
                    if (n10 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            if (b(lVarArr, i13, null, mVar)) {
                                Object s10 = biFunction.s(obj, null);
                                if (s10 != null) {
                                    lVar = new l(l10, obj, s10, null);
                                    i10 = 1;
                                } else {
                                    i10 = i11;
                                    lVar = null;
                                }
                                k(lVarArr, i13, lVar);
                                i11 = i10;
                                obj4 = s10;
                                i12 = 1;
                            }
                        }
                        if (i12 != 0) {
                            break;
                        }
                    } else {
                        int i14 = n10.f9681a;
                        if (i14 == -1) {
                            lVarArr = f(lVarArr, n10);
                        } else {
                            synchronized (n10) {
                                if (n(lVarArr, i13) == n10) {
                                    if (i14 >= 0) {
                                        l lVar2 = null;
                                        l lVar3 = n10;
                                        int i15 = 1;
                                        while (true) {
                                            if (lVar3.f9681a != l10 || ((obj3 = lVar3.f9682b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                l lVar4 = lVar3.f9684d;
                                                if (lVar4 == null) {
                                                    Object s11 = biFunction.s(obj, null);
                                                    if (s11 != null) {
                                                        lVar3.f9684d = new l(l10, obj, s11, null);
                                                        i11 = 1;
                                                    }
                                                    obj2 = s11;
                                                } else {
                                                    i15++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                        }
                                        obj2 = biFunction.s(obj, lVar3.f9683c);
                                        if (obj2 != null) {
                                            lVar3.f9683c = obj2;
                                        } else {
                                            l lVar5 = lVar3.f9684d;
                                            if (lVar2 != null) {
                                                lVar2.f9684d = lVar5;
                                            } else {
                                                k(lVarArr, i13, lVar5);
                                            }
                                            i11 = -1;
                                        }
                                        i12 = i15;
                                        obj4 = obj2;
                                    } else if (n10 instanceof q) {
                                        q qVar = (q) n10;
                                        r rVar = qVar.f9699e;
                                        r b10 = rVar != null ? rVar.b(l10, obj, null) : null;
                                        Object s12 = biFunction.s(obj, b10 == null ? null : b10.f9683c);
                                        if (s12 != null) {
                                            if (b10 != null) {
                                                b10.f9683c = s12;
                                            } else {
                                                qVar.f(l10, obj, s12);
                                                i11 = 1;
                                            }
                                        } else if (b10 != null) {
                                            if (qVar.g(b10)) {
                                                k(lVarArr, i13, s(qVar.f9700f));
                                            }
                                            i12 = 1;
                                            obj4 = s12;
                                            i11 = -1;
                                        }
                                        i12 = 1;
                                        obj4 = s12;
                                    }
                                }
                            }
                            if (i12 != 0) {
                                if (i12 >= 8) {
                                    q(lVarArr, i13);
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = g();
        }
        if (i11 != 0) {
            a(i11, i12);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        r b10;
        Object obj2;
        Object obj3;
        if (obj == null || function == null) {
            throw null;
        }
        int l10 = l(obj.hashCode());
        l[] lVarArr = this.f9656a;
        Object obj4 = null;
        int i10 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & l10;
                    l n10 = n(lVarArr, i11);
                    boolean z10 = true;
                    if (n10 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            if (b(lVarArr, i11, null, mVar)) {
                                Object a10 = function.a(obj);
                                k(lVarArr, i11, a10 != null ? new l(l10, obj, a10, null) : null);
                                obj4 = a10;
                                i10 = 1;
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    } else {
                        int i12 = n10.f9681a;
                        if (i12 == -1) {
                            lVarArr = f(lVarArr, n10);
                        } else {
                            synchronized (n10) {
                                if (n(lVarArr, i11) == n10) {
                                    if (i12 >= 0) {
                                        l lVar = n10;
                                        int i13 = 1;
                                        while (true) {
                                            if (lVar.f9681a != l10 || ((obj3 = lVar.f9682b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                l lVar2 = lVar.f9684d;
                                                if (lVar2 == null) {
                                                    Object a11 = function.a(obj);
                                                    if (a11 != null) {
                                                        lVar.f9684d = new l(l10, obj, a11, null);
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    obj2 = a11;
                                                } else {
                                                    i13++;
                                                    lVar = lVar2;
                                                }
                                            }
                                        }
                                        obj2 = lVar.f9683c;
                                        z10 = false;
                                        int i14 = i13;
                                        obj4 = obj2;
                                        i10 = i14;
                                    } else if (n10 instanceof q) {
                                        i10 = 2;
                                        q qVar = (q) n10;
                                        r rVar = qVar.f9699e;
                                        if (rVar == null || (b10 = rVar.b(l10, obj, null)) == null) {
                                            Object a12 = function.a(obj);
                                            if (a12 != null) {
                                                qVar.f(l10, obj, a12);
                                            } else {
                                                z10 = false;
                                            }
                                            obj4 = a12;
                                        } else {
                                            obj4 = b10.f9683c;
                                        }
                                    }
                                }
                                z10 = false;
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    q(lVarArr, i11);
                                }
                                if (!z10) {
                                    return obj4;
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = g();
        }
        if (obj4 != null) {
            a(1L, i10);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        r5 = r15.s(r14, r8.f9683c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        r8.f9683c = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        r3 = r8.f9684d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
        r10.f9684d = r3;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto La7
            if (r15 == 0) goto La7
            int r1 = r14.hashCode()
            int r1 = l(r1)
            j$.util.concurrent.l[] r2 = r13.f9656a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto La1
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto La1
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = n(r2, r6)
            if (r7 != 0) goto L24
            goto L97
        L24:
            int r8 = r7.f9681a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.f(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = n(r2, r6)     // Catch: java.lang.Throwable -> L9e
            if (r10 != r7) goto L94
            if (r8 < 0) goto L67
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f9681a     // Catch: java.lang.Throwable -> L9e
            if (r11 != r1) goto L5c
            java.lang.Object r11 = r8.f9682b     // Catch: java.lang.Throwable -> L9e
            if (r11 == r14) goto L4a
            if (r11 == 0) goto L5c
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto L5c
        L4a:
            java.lang.Object r5 = r8.f9683c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r15.s(r14, r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L55
            r8.f9683c = r5     // Catch: java.lang.Throwable -> L9e
            goto L94
        L55:
            j$.util.concurrent.l r3 = r8.f9684d     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L90
            r10.f9684d = r3     // Catch: java.lang.Throwable -> L9e
            goto L93
        L5c:
            j$.util.concurrent.l r10 = r8.f9684d     // Catch: java.lang.Throwable -> L9e
            if (r10 != 0) goto L61
            goto L94
        L61:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L67:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L94
            r4 = 2
            r8 = r7
            j$.util.concurrent.q r8 = (j$.util.concurrent.q) r8     // Catch: java.lang.Throwable -> L9e
            j$.util.concurrent.r r10 = r8.f9699e     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L94
            j$.util.concurrent.r r10 = r10.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L94
            java.lang.Object r5 = r10.f9683c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r15.s(r14, r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L84
            r10.f9683c = r5     // Catch: java.lang.Throwable -> L9e
            goto L94
        L84:
            boolean r3 = r8.g(r10)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L93
            j$.util.concurrent.r r3 = r8.f9700f     // Catch: java.lang.Throwable -> L9e
            j$.util.concurrent.l r3 = s(r3)     // Catch: java.lang.Throwable -> L9e
        L90:
            k(r2, r6, r3)     // Catch: java.lang.Throwable -> L9e
        L93:
            r3 = r9
        L94:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L12
        L97:
            if (r3 == 0) goto L9d
            long r14 = (long) r3
            r13.a(r14, r4)
        L9d:
            return r5
        L9e:
            r14 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9e
            throw r14
        La1:
            j$.util.concurrent.l[] r2 = r13.g()
            goto L12
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        l[] lVarArr = this.f9656a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b10 = pVar.b();
                if (b10 == null) {
                    break;
                }
                Object obj2 = b10.f9683c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set entrySet() {
        e eVar = this.f9661f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f9661f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        V value;
        V v10;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                l[] lVarArr = this.f9656a;
                int length = lVarArr == null ? 0 : lVarArr.length;
                p pVar = new p(lVarArr, length, 0, length);
                while (true) {
                    l b10 = pVar.b();
                    if (b10 == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = b10.f9683c;
                    Object obj3 = map.get(b10.f9682b);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    final l[] f(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i10;
        if (!(lVar instanceof g) || (lVarArr2 = ((g) lVar).f9674e) == null) {
            return this.f9656a;
        }
        int j10 = j(lVarArr.length);
        while (true) {
            if (lVarArr2 != this.f9657b || this.f9656a != lVarArr || (i10 = this.sizeCtl) >= 0 || (i10 >>> f9646h) != j10 || i10 == j10 + 1 || i10 == f9645g + j10 || this.transferIndex <= 0) {
                break;
            } else if (f9648j.compareAndSwapInt(this, f9649k, i10, i10 + 1)) {
                p(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    @Override // j$.util.concurrent.u, j$.util.Map
    public void forEach(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        l[] lVarArr = this.f9656a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l b10 = pVar.b();
            if (b10 == null) {
                return;
            }
            biConsumer.n(b10.f9682b, b10.f9683c);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f9683c;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = l(r0)
            j$.util.concurrent.l[] r1 = r4.f9656a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = n(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f9681a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f9682b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f9683c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f9683c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.f9684d
            if (r1 == 0) goto L4e
            int r3 = r1.f9681a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f9682b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f9683c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r11 == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L98
            if (r10 == 0) goto L98
            int r1 = r9.hashCode()
            int r1 = l(r1)
            r2 = 0
            j$.util.concurrent.l[] r3 = r8.f9656a
        L10:
            if (r3 == 0) goto L92
            int r4 = r3.length
            if (r4 != 0) goto L17
            goto L92
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.l r5 = n(r3, r4)
            if (r5 != 0) goto L2c
            j$.util.concurrent.l r5 = new j$.util.concurrent.l
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = b(r3, r4, r0, r5)
            if (r4 == 0) goto L10
            goto L89
        L2c:
            int r6 = r5.f9681a
            r7 = -1
            if (r6 != r7) goto L36
            j$.util.concurrent.l[] r3 = r8.f(r3, r5)
            goto L10
        L36:
            monitor-enter(r5)
            j$.util.concurrent.l r7 = n(r3, r4)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r5) goto L7b
            if (r6 < 0) goto L68
            r2 = 1
            r6 = r5
        L41:
            int r7 = r6.f9681a     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L58
            java.lang.Object r7 = r6.f9682b     // Catch: java.lang.Throwable -> L8f
            if (r7 == r9) goto L51
            if (r7 == 0) goto L58
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L58
        L51:
            java.lang.Object r7 = r6.f9683c     // Catch: java.lang.Throwable -> L8f
            if (r11 != 0) goto L7c
        L55:
            r6.f9683c = r10     // Catch: java.lang.Throwable -> L8f
            goto L7c
        L58:
            j$.util.concurrent.l r7 = r6.f9684d     // Catch: java.lang.Throwable -> L8f
            if (r7 != 0) goto L64
            j$.util.concurrent.l r7 = new j$.util.concurrent.l     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r1, r9, r10, r0)     // Catch: java.lang.Throwable -> L8f
            r6.f9684d = r7     // Catch: java.lang.Throwable -> L8f
            goto L7b
        L64:
            int r2 = r2 + 1
            r6 = r7
            goto L41
        L68:
            boolean r6 = r5 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L7b
            r2 = 2
            r6 = r5
            j$.util.concurrent.q r6 = (j$.util.concurrent.q) r6     // Catch: java.lang.Throwable -> L8f
            j$.util.concurrent.r r6 = r6.f(r1, r9, r10)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L7b
            java.lang.Object r7 = r6.f9683c     // Catch: java.lang.Throwable -> L8f
            if (r11 != 0) goto L7c
            goto L55
        L7b:
            r7 = r0
        L7c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L10
            r9 = 8
            if (r2 < r9) goto L86
            r8.q(r3, r4)
        L86:
            if (r7 == 0) goto L89
            return r7
        L89:
            r9 = 1
            r8.a(r9, r2)
            return r0
        L8f:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            throw r9
        L92:
            j$.util.concurrent.l[] r3 = r8.g()
            goto L10
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.h(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int hashCode() {
        l[] lVarArr = this.f9656a;
        int i10 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b10 = pVar.b();
                if (b10 == null) {
                    break;
                }
                i10 += b10.f9683c.hashCode() ^ b10.f9682b.hashCode();
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object i(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        l n10;
        Object obj4;
        r b10;
        l s10;
        Object obj5;
        int l10 = l(obj.hashCode());
        l[] lVarArr = this.f9656a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (n10 = n(lVarArr, (i10 = (length - 1) & l10))) == null) {
                break;
            }
            int i11 = n10.f9681a;
            if (i11 == -1) {
                lVarArr = f(lVarArr, n10);
            } else {
                boolean z10 = false;
                synchronized (n10) {
                    if (n(lVarArr, i10) == n10) {
                        if (i11 >= 0) {
                            l lVar = null;
                            l lVar2 = n10;
                            while (true) {
                                if (lVar2.f9681a != l10 || ((obj5 = lVar2.f9682b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    l lVar3 = lVar2.f9684d;
                                    if (lVar3 == null) {
                                        break;
                                    }
                                    lVar = lVar2;
                                    lVar2 = lVar3;
                                }
                            }
                            obj4 = lVar2.f9683c;
                            if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                if (obj2 != null) {
                                    lVar2.f9683c = obj2;
                                } else if (lVar != null) {
                                    lVar.f9684d = lVar2.f9684d;
                                } else {
                                    s10 = lVar2.f9684d;
                                    k(lVarArr, i10, s10);
                                }
                                z10 = true;
                            }
                            obj4 = null;
                            z10 = true;
                        } else if (n10 instanceof q) {
                            q qVar = (q) n10;
                            r rVar = qVar.f9699e;
                            if (rVar != null && (b10 = rVar.b(l10, obj, null)) != null) {
                                obj4 = b10.f9683c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        b10.f9683c = obj2;
                                    } else if (qVar.g(b10)) {
                                        s10 = s(qVar.f9700f);
                                        k(lVarArr, i10, s10);
                                    }
                                    z10 = true;
                                }
                            }
                            obj4 = null;
                            z10 = true;
                        }
                    }
                    obj4 = null;
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return m() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<K> keySet() {
        i iVar = this.f9659d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, null);
        this.f9659d = iVar2;
        return iVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long m() {
        c[] cVarArr = this.f9658c;
        long j10 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j10 += cVar.value;
                }
            }
        }
        return j10;
    }

    @Override // j$.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int l10 = l(obj.hashCode());
        l[] lVarArr = this.f9656a;
        int i11 = 0;
        Object obj6 = null;
        int i12 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & l10;
                    l n10 = n(lVarArr, i13);
                    i10 = 1;
                    if (n10 != null) {
                        int i14 = n10.f9681a;
                        if (i14 == -1) {
                            lVarArr = f(lVarArr, n10);
                        } else {
                            synchronized (n10) {
                                if (n(lVarArr, i13) == n10) {
                                    if (i14 >= 0) {
                                        l lVar = null;
                                        l lVar2 = n10;
                                        int i15 = 1;
                                        while (true) {
                                            if (lVar2.f9681a != l10 || ((obj4 = lVar2.f9682b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                l lVar3 = lVar2.f9684d;
                                                if (lVar3 == null) {
                                                    lVar2.f9684d = new l(l10, obj, obj5, null);
                                                    i12 = 1;
                                                    obj3 = obj5;
                                                    break;
                                                }
                                                i15++;
                                                lVar = lVar2;
                                                lVar2 = lVar3;
                                            }
                                        }
                                        obj3 = biFunction.s(lVar2.f9683c, obj5);
                                        if (obj3 != null) {
                                            lVar2.f9683c = obj3;
                                        } else {
                                            l lVar4 = lVar2.f9684d;
                                            if (lVar != null) {
                                                lVar.f9684d = lVar4;
                                            } else {
                                                k(lVarArr, i13, lVar4);
                                            }
                                            i12 = -1;
                                        }
                                        i11 = i15;
                                        obj6 = obj3;
                                    } else if (n10 instanceof q) {
                                        i11 = 2;
                                        q qVar = (q) n10;
                                        r rVar = qVar.f9699e;
                                        r b10 = rVar == null ? null : rVar.b(l10, obj, null);
                                        Object s10 = b10 == null ? obj5 : biFunction.s(b10.f9683c, obj5);
                                        if (s10 != null) {
                                            if (b10 != null) {
                                                b10.f9683c = s10;
                                            } else {
                                                qVar.f(l10, obj, s10);
                                                i12 = 1;
                                            }
                                        } else if (b10 != null) {
                                            if (qVar.g(b10)) {
                                                k(lVarArr, i13, s(qVar.f9700f));
                                            }
                                            i12 = -1;
                                        }
                                        obj6 = s10;
                                    }
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    q(lVarArr, i13);
                                }
                                i10 = i12;
                                obj5 = obj6;
                            }
                        }
                    } else if (b(lVarArr, i13, null, new l(l10, obj, obj5, null))) {
                        break;
                    }
                }
            }
            lVarArr = g();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj5;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k10, V v10) {
        return (V) h(k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        r(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        return (V) h(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        return (V) i(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        return (obj2 == null || i(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return i(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return i(obj, obj3, obj2) != null;
    }

    @Override // j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        l[] lVarArr = this.f9656a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l b10 = pVar.b();
            if (b10 == null) {
                return;
            }
            Object obj = b10.f9683c;
            Object obj2 = b10.f9682b;
            do {
                Object s10 = biFunction.s(obj2, obj);
                Objects.requireNonNull(s10);
                if (i(obj2, s10, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long m10 = m();
        if (m10 < 0) {
            return 0;
        }
        if (m10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) m10;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        l[] lVarArr = this.f9656a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        l b10 = pVar.b();
        if (b10 != null) {
            while (true) {
                Object obj = b10.f9682b;
                Object obj2 = b10.f9683c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                b10 = pVar.b();
                if (b10 == null) {
                    break;
                }
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection values() {
        s sVar = this.f9660e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f9660e = sVar2;
        return sVar2;
    }
}
