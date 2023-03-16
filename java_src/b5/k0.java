package b5;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k0<K, V> extends r<K, V> {

    /* renamed from: u  reason: collision with root package name */
    static final r<Object, Object> f2830u = new k0(null, new Object[0], 0);
    @CheckForNull

    /* renamed from: r  reason: collision with root package name */
    private final transient Object f2831r;

    /* renamed from: s  reason: collision with root package name */
    final transient Object[] f2832s;

    /* renamed from: t  reason: collision with root package name */
    private final transient int f2833t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends s<Map.Entry<K, V>> {

        /* renamed from: p  reason: collision with root package name */
        private final transient r<K, V> f2834p;

        /* renamed from: q  reason: collision with root package name */
        private final transient Object[] f2835q;

        /* renamed from: r  reason: collision with root package name */
        private final transient int f2836r;

        /* renamed from: s  reason: collision with root package name */
        private final transient int f2837s;

        /* renamed from: b5.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0061a extends q<Map.Entry<K, V>> {
            C0061a() {
            }

            @Override // java.util.List
            /* renamed from: P */
            public Map.Entry<K, V> get(int i10) {
                a5.j.g(i10, a.this.f2837s);
                int i11 = i10 * 2;
                Object obj = a.this.f2835q[a.this.f2836r + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f2835q[i11 + (a.this.f2836r ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // b5.o
            public boolean s() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f2837s;
            }
        }

        a(r<K, V> rVar, Object[] objArr, int i10, int i11) {
            this.f2834p = rVar;
            this.f2835q = objArr;
            this.f2836r = i10;
            this.f2837s = i11;
        }

        @Override // b5.s
        q<Map.Entry<K, V>> F() {
            return new C0061a();
        }

        @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f2834p.get(key));
            }
            return false;
        }

        @Override // b5.o
        int g(Object[] objArr, int i10) {
            return d().g(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b5.o
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f2837s;
        }

        @Override // b5.s, b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: v */
        public s0<Map.Entry<K, V>> iterator() {
            return d().iterator();
        }
    }

    /* loaded from: classes.dex */
    static final class b<K> extends s<K> {

        /* renamed from: p  reason: collision with root package name */
        private final transient r<K, ?> f2839p;

        /* renamed from: q  reason: collision with root package name */
        private final transient q<K> f2840q;

        b(r<K, ?> rVar, q<K> qVar) {
            this.f2839p = rVar;
            this.f2840q = qVar;
        }

        @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f2839p.get(obj) != null;
        }

        @Override // b5.s, b5.o
        public q<K> d() {
            return this.f2840q;
        }

        @Override // b5.o
        int g(Object[] objArr, int i10) {
            return d().g(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b5.o
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f2839p.size();
        }

        @Override // b5.s, b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: v */
        public s0<K> iterator() {
            return d().iterator();
        }
    }

    /* loaded from: classes.dex */
    static final class c extends q<Object> {

        /* renamed from: p  reason: collision with root package name */
        private final transient Object[] f2841p;

        /* renamed from: q  reason: collision with root package name */
        private final transient int f2842q;

        /* renamed from: r  reason: collision with root package name */
        private final transient int f2843r;

        c(Object[] objArr, int i10, int i11) {
            this.f2841p = objArr;
            this.f2842q = i10;
            this.f2843r = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            a5.j.g(i10, this.f2843r);
            Object obj = this.f2841p[(i10 * 2) + this.f2842q];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // b5.o
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f2843r;
        }
    }

    private k0(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.f2831r = obj;
        this.f2832s = objArr;
        this.f2833t = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> k0<K, V> l(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (k0) f2830u;
        }
        if (i10 != 1) {
            a5.j.k(i10, objArr.length >> 1);
            return new k0<>(m(objArr, i10, s.x(i10), 0), objArr, i10);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        h.a(obj, obj2);
        return new k0<>(null, objArr, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object m(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.k0.m(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static IllegalArgumentException n(Object obj, Object obj2, Object[] objArr, int i10) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i10]);
        String valueOf4 = String.valueOf(objArr[i10 ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @CheckForNull
    static Object o(@CheckForNull Object obj, Object[] objArr, int i10, int i11, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj2)) {
                Object obj4 = objArr[i11 ^ 1];
                Objects.requireNonNull(obj4);
                return obj4;
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a10 = n.a(obj2.hashCode());
                while (true) {
                    int i12 = a10 & length;
                    int i13 = bArr[i12] & 255;
                    if (i13 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i13])) {
                        return objArr[i13 ^ 1];
                    }
                    a10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a11 = n.a(obj2.hashCode());
                while (true) {
                    int i14 = a11 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    a11 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a12 = n.a(obj2.hashCode());
                while (true) {
                    int i16 = a12 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    a12 = i16 + 1;
                }
            }
        }
    }

    @Override // b5.r
    s<Map.Entry<K, V>> d() {
        return new a(this, this.f2832s, 0, this.f2833t);
    }

    @Override // b5.r
    s<K> e() {
        return new b(this, new c(this.f2832s, 0, this.f2833t));
    }

    @Override // b5.r
    o<V> f() {
        return new c(this.f2832s, 1, this.f2833t);
    }

    @Override // b5.r, java.util.Map, j$.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v10 = (V) o(this.f2831r, this.f2832s, this.f2833t, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // b5.r
    boolean h() {
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public int size() {
        return this.f2833t;
    }
}
