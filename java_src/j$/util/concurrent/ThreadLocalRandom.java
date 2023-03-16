package j$.util.concurrent;

import j$.util.stream.C0325k0;
import j$.util.stream.C0365t0;
import j$.util.stream.D0;
import j$.util.stream.G;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicInteger f9662d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicLong f9663e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal f9664f;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal f9665g;

    /* renamed from: a  reason: collision with root package name */
    long f9666a;

    /* renamed from: b  reason: collision with root package name */
    int f9667b;

    /* renamed from: c  reason: collision with root package name */
    boolean f9668c = true;

    static {
        long h10;
        if (((Boolean) AccessController.doPrivileged(new w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            h10 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                h10 = (h10 << 8) | (seed[i10] & 255);
            }
        } else {
            h10 = h(System.nanoTime()) ^ h(System.currentTimeMillis());
        }
        f9663e = new AtomicLong(h10);
        f9664f = new ThreadLocal();
        f9665g = new x();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadLocalRandom(w wVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f9665g.get()).f9667b = i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f9665g.get()).f9667b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f9665g.get();
        if (threadLocalRandom.f9667b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f9662d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f9663e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f9665g.get();
        threadLocalRandom.f9666a = h10;
        threadLocalRandom.f9667b = addAndGet;
    }

    private static int g(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 < d11) {
            double d12 = ((d11 - d10) * nextLong) + d10;
            return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
        }
        return nextLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i10, int i11) {
        int i12;
        int g10 = g(i());
        if (i10 < i11) {
            int i13 = i11 - i10;
            int i14 = i13 - 1;
            if ((i13 & i14) == 0) {
                i12 = g10 & i14;
            } else if (i13 > 0) {
                int i15 = g10 >>> 1;
                while (true) {
                    int i16 = i15 + i14;
                    i12 = i15 % i13;
                    if (i16 - i12 >= 0) {
                        break;
                    }
                    i15 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g10 >= i10 && g10 < i11) {
                        return g10;
                    }
                    g10 = g(i());
                }
            }
            return i12 + i10;
        }
        return g10;
    }

    @Override // java.util.Random
    public DoubleStream doubles() {
        return G.A(D0.h0(new y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d), false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j10, long j11) {
        long h10 = h(i());
        if (j10 >= j11) {
            return h10;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (h10 & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = h10 >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                h10 = h(i());
            }
        } else {
            while (true) {
                if (h10 >= j10 && h10 < j11) {
                    return h10;
                }
                h10 = h(i());
            }
        }
    }

    final long i() {
        long j10 = this.f9666a - 7046029254386353131L;
        this.f9666a = j10;
        return j10;
    }

    @Override // java.util.Random
    public IntStream ints() {
        return C0325k0.A(D0.t0(new z(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0), false));
    }

    @Override // java.util.Random
    public LongStream longs() {
        return C0365t0.A(D0.v0(new A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L), false));
    }

    @Override // java.util.Random
    protected int next(int i10) {
        return (int) (h(i()) >>> (64 - i10));
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public double nextGaussian() {
        ThreadLocal threadLocal = f9664f;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                f9664f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int g10 = g(i());
        int i11 = i10 - 1;
        if ((i10 & i11) == 0) {
            return g10 & i11;
        }
        while (true) {
            int i12 = g10 >>> 1;
            int i13 = i12 + i11;
            int i14 = i12 % i10;
            if (i13 - i14 >= 0) {
                return i14;
            }
            g10 = g(i());
        }
    }

    @Override // java.util.Random
    public long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.f9668c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Random
    public DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return G.A(D0.h0(new y(0L, Long.MAX_VALUE, d10, d11), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return C0325k0.A(D0.t0(new z(0L, Long.MAX_VALUE, i10, i11), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public LongStream longs(long j10) {
        if (j10 >= 0) {
            return C0365t0.A(D0.v0(new A(0L, j10, Long.MAX_VALUE, 0L), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return G.A(D0.h0(new y(0L, j10, Double.MAX_VALUE, 0.0d), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public IntStream ints(long j10) {
        if (j10 >= 0) {
            return C0325k0.A(D0.t0(new z(0L, j10, Integer.MAX_VALUE, 0), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return C0365t0.A(D0.v0(new A(0L, Long.MAX_VALUE, j10, j11), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 >= 0) {
            if (d10 < d11) {
                return G.A(D0.h0(new y(0L, j10, d10, d11), false));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public IntStream ints(long j10, int i10, int i11) {
        if (j10 >= 0) {
            if (i10 < i11) {
                return C0325k0.A(D0.t0(new z(0L, j10, i10, i11), false));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public LongStream longs(long j10, long j11, long j12) {
        if (j10 >= 0) {
            if (j11 < j12) {
                return C0365t0.A(D0.v0(new A(0L, j10, j11, j12), false));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }
}
