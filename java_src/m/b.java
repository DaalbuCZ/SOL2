package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f11235r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Object[] f11236s = new Object[0];

    /* renamed from: t  reason: collision with root package name */
    private static Object[] f11237t;

    /* renamed from: u  reason: collision with root package name */
    private static int f11238u;

    /* renamed from: v  reason: collision with root package name */
    private static Object[] f11239v;

    /* renamed from: w  reason: collision with root package name */
    private static int f11240w;

    /* renamed from: n  reason: collision with root package name */
    private int[] f11241n;

    /* renamed from: o  reason: collision with root package name */
    Object[] f11242o;

    /* renamed from: p  reason: collision with root package name */
    int f11243p;

    /* renamed from: q  reason: collision with root package name */
    private f<E, E> f11244q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // m.f
        protected void a() {
            b.this.clear();
        }

        @Override // m.f
        protected Object b(int i10, int i11) {
            return b.this.f11242o[i10];
        }

        @Override // m.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // m.f
        protected int d() {
            return b.this.f11243p;
        }

        @Override // m.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // m.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // m.f
        protected void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // m.f
        protected void h(int i10) {
            b.this.v(i10);
        }

        @Override // m.f
        protected E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f11241n = f11235r;
            this.f11242o = f11236s;
        } else {
            d(i10);
        }
        this.f11243p = 0;
    }

    private void d(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f11239v;
                if (objArr != null) {
                    this.f11242o = objArr;
                    f11239v = (Object[]) objArr[0];
                    this.f11241n = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f11240w--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f11237t;
                if (objArr2 != null) {
                    this.f11242o = objArr2;
                    f11237t = (Object[]) objArr2[0];
                    this.f11241n = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f11238u--;
                    return;
                }
            }
        }
        this.f11241n = new int[i10];
        this.f11242o = new Object[i10];
    }

    private static void h(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f11240w < 10) {
                    objArr[0] = f11239v;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f11239v = objArr;
                    f11240w++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f11238u < 10) {
                    objArr[0] = f11237t;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f11237t = objArr;
                    f11238u++;
                }
            }
        }
    }

    private f<E, E> k() {
        if (this.f11244q == null) {
            this.f11244q = new a();
        }
        return this.f11244q;
    }

    private int l(Object obj, int i10) {
        int i11 = this.f11243p;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f11241n, i11, i10);
        if (a10 >= 0 && !obj.equals(this.f11242o[a10])) {
            int i12 = a10 + 1;
            while (i12 < i11 && this.f11241n[i12] == i10) {
                if (obj.equals(this.f11242o[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a10 - 1; i13 >= 0 && this.f11241n[i13] == i10; i13--) {
                if (obj.equals(this.f11242o[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return a10;
    }

    private int s() {
        int i10 = this.f11243p;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f11241n, i10, 0);
        if (a10 >= 0 && this.f11242o[a10] != null) {
            int i11 = a10 + 1;
            while (i11 < i10 && this.f11241n[i11] == 0) {
                if (this.f11242o[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && this.f11241n[i12] == 0; i12--) {
                if (this.f11242o[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return a10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int l10;
        if (e10 == null) {
            l10 = s();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            l10 = l(e10, hashCode);
        }
        if (l10 >= 0) {
            return false;
        }
        int i11 = ~l10;
        int i12 = this.f11243p;
        int[] iArr = this.f11241n;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f11242o;
            d(i13);
            int[] iArr2 = this.f11241n;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f11242o, 0, objArr.length);
            }
            h(iArr, objArr, this.f11243p);
        }
        int i14 = this.f11243p;
        if (i11 < i14) {
            int[] iArr3 = this.f11241n;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f11242o;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f11243p - i11);
        }
        this.f11241n[i11] = i10;
        this.f11242o[i11] = e10;
        this.f11243p++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        g(this.f11243p + collection.size());
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f11243p;
        if (i10 != 0) {
            h(this.f11241n, this.f11242o, i10);
            this.f11241n = f11235r;
            this.f11242o = f11236s;
            this.f11243p = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f11243p; i10++) {
                try {
                    if (!set.contains(x(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void g(int i10) {
        int[] iArr = this.f11241n;
        if (iArr.length < i10) {
            Object[] objArr = this.f11242o;
            d(i10);
            int i11 = this.f11243p;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f11241n, 0, i11);
                System.arraycopy(objArr, 0, this.f11242o, 0, this.f11243p);
            }
            h(iArr, objArr, this.f11243p);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f11241n;
        int i10 = this.f11243p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? s() : l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f11243p <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return k().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            v(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f11243p - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f11242o[i10])) {
                v(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f11243p;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f11243p;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f11242o, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f11243p) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f11243p));
        }
        System.arraycopy(this.f11242o, 0, tArr, 0, this.f11243p);
        int length = tArr.length;
        int i10 = this.f11243p;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11243p * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11243p; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            E x10 = x(i10);
            if (x10 != this) {
                sb.append(x10);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E v(int i10) {
        Object[] objArr = this.f11242o;
        E e10 = (E) objArr[i10];
        int i11 = this.f11243p;
        if (i11 <= 1) {
            h(this.f11241n, objArr, i11);
            this.f11241n = f11235r;
            this.f11242o = f11236s;
            this.f11243p = 0;
        } else {
            int[] iArr = this.f11241n;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f11243p = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f11242o;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f11243p - i10);
                }
                this.f11242o[this.f11243p] = null;
            } else {
                d(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f11243p--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f11241n, 0, i10);
                    System.arraycopy(objArr, 0, this.f11242o, 0, i10);
                }
                int i14 = this.f11243p;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f11241n, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f11242o, i10, this.f11243p - i10);
                }
            }
        }
        return e10;
    }

    public E x(int i10) {
        return (E) this.f11242o[i10];
    }
}
