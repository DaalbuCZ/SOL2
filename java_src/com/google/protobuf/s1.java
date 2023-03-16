package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f6084a = D();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f6085b = com.google.protobuf.d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f6086c = o(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f6087d = o(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f6088e = B();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f6089f = T();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f6090g = S();

    /* renamed from: h  reason: collision with root package name */
    static final long f6091h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f6092i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f6093j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f6094k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f6095l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f6096m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f6097n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f6098o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f6099p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f6100q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f6101r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f6102s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f6103t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f6104u;

    /* renamed from: v  reason: collision with root package name */
    private static final int f6105v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f6106w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.s1.e
        public boolean c(Object obj, long j10) {
            return s1.f6106w ? s1.s(obj, j10) : s1.t(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public byte d(Object obj, long j10) {
            return s1.f6106w ? s1.v(obj, j10) : s1.w(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.protobuf.s1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.protobuf.s1.e
        public void k(Object obj, long j10, boolean z10) {
            if (s1.f6106w) {
                s1.I(obj, j10, z10);
            } else {
                s1.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.s1.e
        public void l(Object obj, long j10, byte b10) {
            if (s1.f6106w) {
                s1.L(obj, j10, b10);
            } else {
                s1.M(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.s1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.s1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.s1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.s1.e
        public boolean c(Object obj, long j10) {
            return s1.f6106w ? s1.s(obj, j10) : s1.t(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public byte d(Object obj, long j10) {
            return s1.f6106w ? s1.v(obj, j10) : s1.w(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.protobuf.s1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.protobuf.s1.e
        public void k(Object obj, long j10, boolean z10) {
            if (s1.f6106w) {
                s1.I(obj, j10, z10);
            } else {
                s1.J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.s1.e
        public void l(Object obj, long j10, byte b10) {
            if (s1.f6106w) {
                s1.L(obj, j10, b10);
            } else {
                s1.M(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.s1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.s1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.s1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.s1.e
        public boolean c(Object obj, long j10) {
            return this.f6107a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public byte d(Object obj, long j10) {
            return this.f6107a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public double e(Object obj, long j10) {
            return this.f6107a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public float f(Object obj, long j10) {
            return this.f6107a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.s1.e
        public void k(Object obj, long j10, boolean z10) {
            this.f6107a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.s1.e
        public void l(Object obj, long j10, byte b10) {
            this.f6107a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.s1.e
        public void m(Object obj, long j10, double d10) {
            this.f6107a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.s1.e
        public void n(Object obj, long j10, float f10) {
            this.f6107a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.s1.e
        public boolean r() {
            if (super.r()) {
                try {
                    Class<?> cls = this.f6107a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    s1.G(th);
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.s1.e
        public boolean s() {
            if (super.s()) {
                try {
                    Class<?> cls = this.f6107a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, Integer.TYPE);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    return true;
                } catch (Throwable th) {
                    s1.G(th);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f6107a;

        e(Unsafe unsafe) {
            this.f6107a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f6107a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f6107a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f6107a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f6107a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f6107a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f6107a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f6107a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f6107a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f6107a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f6107a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                s1.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f6107a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return s1.n() != null;
            } catch (Throwable th) {
                s1.G(th);
                return false;
            }
        }
    }

    static {
        long l10 = l(byte[].class);
        f6091h = l10;
        f6092i = l(boolean[].class);
        f6093j = m(boolean[].class);
        f6094k = l(int[].class);
        f6095l = m(int[].class);
        f6096m = l(long[].class);
        f6097n = m(long[].class);
        f6098o = l(float[].class);
        f6099p = m(float[].class);
        f6100q = l(double[].class);
        f6101r = m(double[].class);
        f6102s = l(Object[].class);
        f6103t = m(Object[].class);
        f6104u = q(n());
        f6105v = (int) (7 & l10);
        f6106w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private s1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(Object obj, long j10) {
        return f6088e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f6084a;
        if (unsafe == null) {
            return null;
        }
        if (com.google.protobuf.d.c()) {
            if (f6086c) {
                return new c(unsafe);
            }
            if (f6087d) {
                return new b(unsafe);
            }
            return null;
        }
        return new d(unsafe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object C(Object obj, long j10) {
        return f6088e.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean E() {
        return f6090g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F() {
        return f6089f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th) {
        Logger logger = Logger.getLogger(s1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(Object obj, long j10, boolean z10) {
        f6088e.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K(byte[] bArr, long j10, byte b10) {
        f6088e.l(bArr, f6091h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int z10 = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z10 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j10, double d10) {
        f6088e.m(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(Object obj, long j10, float f10) {
        f6088e.n(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void P(Object obj, long j10, int i10) {
        f6088e.o(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Q(Object obj, long j10, long j11) {
        f6088e.p(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(Object obj, long j10, Object obj2) {
        f6088e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f6088e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f6088e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T k(Class<T> cls) {
        try {
            return (T) f6084a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class<?> cls) {
        if (f6090g) {
            return f6088e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f6090g) {
            return f6088e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field n() {
        Field p10;
        if (!com.google.protobuf.d.c() || (p10 = p(Buffer.class, "effectiveDirectAddress")) == null) {
            Field p11 = p(Buffer.class, "address");
            if (p11 == null || p11.getType() != Long.TYPE) {
                return null;
            }
            return p11;
        }
        return p10;
    }

    static boolean o(Class<?> cls) {
        if (com.google.protobuf.d.c()) {
            try {
                Class<?> cls2 = f6085b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f6088e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(Object obj, long j10) {
        return f6088e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        return v(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte u(byte[] bArr, long j10) {
        return f6088e.d(bArr, f6091h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double x(Object obj, long j10) {
        return f6088e.e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float y(Object obj, long j10) {
        return f6088e.f(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(Object obj, long j10) {
        return f6088e.g(obj, j10);
    }
}
