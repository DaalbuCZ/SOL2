package m;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: q  reason: collision with root package name */
    static Object[] f11277q;

    /* renamed from: r  reason: collision with root package name */
    static int f11278r;

    /* renamed from: s  reason: collision with root package name */
    static Object[] f11279s;

    /* renamed from: t  reason: collision with root package name */
    static int f11280t;

    /* renamed from: n  reason: collision with root package name */
    int[] f11281n;

    /* renamed from: o  reason: collision with root package name */
    Object[] f11282o;

    /* renamed from: p  reason: collision with root package name */
    int f11283p;

    public g() {
        this.f11281n = c.f11246a;
        this.f11282o = c.f11248c;
        this.f11283p = 0;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f11281n = c.f11246a;
            this.f11282o = c.f11248c;
        } else {
            a(i10);
        }
        this.f11283p = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = f11279s;
                if (objArr != null) {
                    this.f11282o = objArr;
                    f11279s = (Object[]) objArr[0];
                    this.f11281n = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f11280t--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f11277q;
                if (objArr2 != null) {
                    this.f11282o = objArr2;
                    f11277q = (Object[]) objArr2[0];
                    this.f11281n = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f11278r--;
                    return;
                }
            }
        }
        this.f11281n = new int[i10];
        this.f11282o = new Object[i10 << 1];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f11280t < 10) {
                    objArr[0] = f11279s;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f11279s = objArr;
                    f11280t++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f11278r < 10) {
                    objArr[0] = f11277q;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f11277q = objArr;
                    f11278r++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f11283p;
        int[] iArr = this.f11281n;
        if (iArr.length < i10) {
            Object[] objArr = this.f11282o;
            a(i10);
            if (this.f11283p > 0) {
                System.arraycopy(iArr, 0, this.f11281n, 0, i11);
                System.arraycopy(objArr, 0, this.f11282o, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f11283p != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f11283p;
        if (i10 > 0) {
            int[] iArr = this.f11281n;
            Object[] objArr = this.f11282o;
            this.f11281n = c.f11246a;
            this.f11282o = c.f11248c;
            this.f11283p = 0;
            d(iArr, objArr, i10);
        }
        if (this.f11283p > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i10) {
        int i11 = this.f11283p;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f11281n, i11, i10);
        if (b10 >= 0 && !obj.equals(this.f11282o[b10 << 1])) {
            int i12 = b10 + 1;
            while (i12 < i11 && this.f11281n[i12] == i10) {
                if (obj.equals(this.f11282o[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b10 - 1; i13 >= 0 && this.f11281n[i13] == i10; i13--) {
                if (obj.equals(this.f11282o[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f11283p; i10++) {
                try {
                    K i11 = i(i10);
                    V l10 = l(i10);
                    Object obj2 = gVar.get(i11);
                    if (l10 == null) {
                        if (obj2 != null || !gVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!l10.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f11283p; i12++) {
                try {
                    K i13 = i(i12);
                    V l11 = l(i12);
                    Object obj3 = map.get(i13);
                    if (l11 == null) {
                        if (obj3 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!l11.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i10 = this.f11283p;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f11281n, i10, 0);
        if (b10 >= 0 && this.f11282o[b10 << 1] != null) {
            int i11 = b10 + 1;
            while (i11 < i10 && this.f11281n[i11] == 0) {
                if (this.f11282o[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = b10 - 1; i12 >= 0 && this.f11281n[i12] == 0; i12--) {
                if (this.f11282o[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return b10;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? (V) this.f11282o[(f10 << 1) + 1] : v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i10 = this.f11283p * 2;
        Object[] objArr = this.f11282o;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f11281n;
        Object[] objArr = this.f11282o;
        int i10 = this.f11283p;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public K i(int i10) {
        return (K) this.f11282o[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f11283p <= 0;
    }

    public V j(int i10) {
        Object[] objArr = this.f11282o;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f11283p;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f11281n, objArr, i12);
            this.f11281n = c.f11246a;
            this.f11282o = c.f11248c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f11281n;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f11282o;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f11282o;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f11283p) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f11281n, 0, i10);
                    System.arraycopy(objArr, 0, this.f11282o, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f11281n, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f11282o, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 == this.f11283p) {
            this.f11283p = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f11282o;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V l(int i10) {
        return (V) this.f11282o[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int e10;
        int i11 = this.f11283p;
        if (k10 == null) {
            e10 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            e10 = e(k10, hashCode);
        }
        if (e10 >= 0) {
            int i12 = (e10 << 1) + 1;
            Object[] objArr = this.f11282o;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~e10;
        int[] iArr = this.f11281n;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f11282o;
            a(i14);
            if (i11 != this.f11283p) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f11281n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f11282o, 0, objArr2.length);
            }
            d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f11281n;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f11282o;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f11283p - i13) << 1);
        }
        int i16 = this.f11283p;
        if (i11 == i16) {
            int[] iArr4 = this.f11281n;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f11282o;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f11283p = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return j(f10);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 >= 0) {
            V l10 = l(f10);
            if (obj2 == l10 || (obj2 != null && obj2.equals(l10))) {
                j(f10);
                return true;
            }
            return false;
        }
        return false;
    }

    public V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return k(f10, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 >= 0) {
            V l10 = l(f10);
            if (l10 == v10 || (v10 != null && v10.equals(l10))) {
                k(f10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.f11283p;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11283p * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11283p; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            K i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l10 = l(i10);
            if (l10 != this) {
                sb.append(l10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
