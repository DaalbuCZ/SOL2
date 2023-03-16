package m;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f11254a;

    /* renamed from: b  reason: collision with root package name */
    private int f11255b;

    /* renamed from: c  reason: collision with root package name */
    private int f11256c;

    /* renamed from: d  reason: collision with root package name */
    private int f11257d;

    /* renamed from: e  reason: collision with root package name */
    private int f11258e;

    /* renamed from: f  reason: collision with root package name */
    private int f11259f;

    /* renamed from: g  reason: collision with root package name */
    private int f11260g;

    /* renamed from: h  reason: collision with root package name */
    private int f11261h;

    public e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f11256c = i10;
        this.f11254a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int f(K k10, V v10) {
        int g10 = g(k10, v10);
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    protected V a(K k10) {
        return null;
    }

    protected void b(boolean z10, K k10, V v10, V v11) {
    }

    public final V c(K k10) {
        V put;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            V v10 = this.f11254a.get(k10);
            if (v10 != null) {
                this.f11260g++;
                return v10;
            }
            this.f11261h++;
            V a10 = a(k10);
            if (a10 == null) {
                return null;
            }
            synchronized (this) {
                this.f11258e++;
                put = this.f11254a.put(k10, a10);
                if (put != null) {
                    this.f11254a.put(k10, put);
                } else {
                    this.f11255b += f(k10, a10);
                }
            }
            if (put != null) {
                b(false, k10, a10, put);
                return put;
            }
            i(this.f11256c);
            return a10;
        }
    }

    public final V d(K k10, V v10) {
        V put;
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f11257d++;
            this.f11255b += f(k10, v10);
            put = this.f11254a.put(k10, v10);
            if (put != null) {
                this.f11255b -= f(k10, put);
            }
        }
        if (put != null) {
            b(false, k10, put, v10);
        }
        i(this.f11256c);
        return put;
    }

    public final V e(K k10) {
        V remove;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            remove = this.f11254a.remove(k10);
            if (remove != null) {
                this.f11255b -= f(k10, remove);
            }
        }
        if (remove != null) {
            b(false, k10, remove, null);
        }
        return remove;
    }

    protected int g(K k10, V v10) {
        return 1;
    }

    public final synchronized Map<K, V> h() {
        return new LinkedHashMap(this.f11254a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f11255b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f11254a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f11255b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f11255b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f11254a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f11254a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f11254a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f11255b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.f(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f11255b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f11259f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f11259f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m.e.i(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f11260g;
        i11 = this.f11261h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f11256c), Integer.valueOf(this.f11260g), Integer.valueOf(this.f11261h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
