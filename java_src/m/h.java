package m;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f11284r = new Object();

    /* renamed from: n  reason: collision with root package name */
    private boolean f11285n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f11286o;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f11287p;

    /* renamed from: q  reason: collision with root package name */
    private int f11288q;

    public h() {
        this(10);
    }

    public h(int i10) {
        this.f11285n = false;
        if (i10 == 0) {
            this.f11286o = c.f11246a;
            this.f11287p = c.f11248c;
            return;
        }
        int e10 = c.e(i10);
        this.f11286o = new int[e10];
        this.f11287p = new Object[e10];
    }

    private void g() {
        int i10 = this.f11288q;
        int[] iArr = this.f11286o;
        Object[] objArr = this.f11287p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f11284r) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f11285n = false;
        this.f11288q = i11;
    }

    public void c(int i10, E e10) {
        int i11 = this.f11288q;
        if (i11 != 0 && i10 <= this.f11286o[i11 - 1]) {
            n(i10, e10);
            return;
        }
        if (this.f11285n && i11 >= this.f11286o.length) {
            g();
        }
        int i12 = this.f11288q;
        if (i12 >= this.f11286o.length) {
            int e11 = c.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f11286o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f11287p;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f11286o = iArr;
            this.f11287p = objArr;
        }
        this.f11286o[i12] = i10;
        this.f11287p[i12] = e10;
        this.f11288q = i12 + 1;
    }

    public void d() {
        int i10 = this.f11288q;
        Object[] objArr = this.f11287p;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f11288q = 0;
        this.f11285n = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f11286o = (int[]) this.f11286o.clone();
            hVar.f11287p = (Object[]) this.f11287p.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E h(int i10) {
        return i(i10, null);
    }

    public E i(int i10, E e10) {
        int a10 = c.a(this.f11286o, this.f11288q, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f11287p;
            if (objArr[a10] != f11284r) {
                return (E) objArr[a10];
            }
        }
        return e10;
    }

    public int l(int i10) {
        if (this.f11285n) {
            g();
        }
        return c.a(this.f11286o, this.f11288q, i10);
    }

    public int m(int i10) {
        if (this.f11285n) {
            g();
        }
        return this.f11286o[i10];
    }

    public void n(int i10, E e10) {
        int a10 = c.a(this.f11286o, this.f11288q, i10);
        if (a10 >= 0) {
            this.f11287p[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f11288q;
        if (i11 < i12) {
            Object[] objArr = this.f11287p;
            if (objArr[i11] == f11284r) {
                this.f11286o[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f11285n && i12 >= this.f11286o.length) {
            g();
            i11 = ~c.a(this.f11286o, this.f11288q, i10);
        }
        int i13 = this.f11288q;
        if (i13 >= this.f11286o.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f11286o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f11287p;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11286o = iArr;
            this.f11287p = objArr2;
        }
        int i14 = this.f11288q;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f11286o;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f11287p;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f11288q - i11);
        }
        this.f11286o[i11] = i10;
        this.f11287p[i11] = e10;
        this.f11288q++;
    }

    public void p(int i10) {
        int a10 = c.a(this.f11286o, this.f11288q, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f11287p;
            Object obj = objArr[a10];
            Object obj2 = f11284r;
            if (obj != obj2) {
                objArr[a10] = obj2;
                this.f11285n = true;
            }
        }
    }

    public int q() {
        if (this.f11285n) {
            g();
        }
        return this.f11288q;
    }

    public E s(int i10) {
        if (this.f11285n) {
            g();
        }
        return (E) this.f11287p[i10];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11288q * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11288q; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(m(i10));
            sb.append('=');
            E s10 = s(i10);
            if (s10 != this) {
                sb.append(s10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
