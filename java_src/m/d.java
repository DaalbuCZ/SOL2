package m;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f11249r = new Object();

    /* renamed from: n  reason: collision with root package name */
    private boolean f11250n;

    /* renamed from: o  reason: collision with root package name */
    private long[] f11251o;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f11252p;

    /* renamed from: q  reason: collision with root package name */
    private int f11253q;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f11250n = false;
        if (i10 == 0) {
            this.f11251o = c.f11247b;
            this.f11252p = c.f11248c;
            return;
        }
        int f10 = c.f(i10);
        this.f11251o = new long[f10];
        this.f11252p = new Object[f10];
    }

    private void g() {
        int i10 = this.f11253q;
        long[] jArr = this.f11251o;
        Object[] objArr = this.f11252p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f11249r) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f11250n = false;
        this.f11253q = i11;
    }

    public void c(long j10, E e10) {
        int i10 = this.f11253q;
        if (i10 != 0 && j10 <= this.f11251o[i10 - 1]) {
            m(j10, e10);
            return;
        }
        if (this.f11250n && i10 >= this.f11251o.length) {
            g();
        }
        int i11 = this.f11253q;
        if (i11 >= this.f11251o.length) {
            int f10 = c.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f11251o;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f11252p;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f11251o = jArr;
            this.f11252p = objArr;
        }
        this.f11251o[i11] = j10;
        this.f11252p[i11] = e10;
        this.f11253q = i11 + 1;
    }

    public void d() {
        int i10 = this.f11253q;
        Object[] objArr = this.f11252p;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f11253q = 0;
        this.f11250n = false;
    }

    /* renamed from: e */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f11251o = (long[]) this.f11251o.clone();
            dVar.f11252p = (Object[]) this.f11252p.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E h(long j10) {
        return i(j10, null);
    }

    public E i(long j10, E e10) {
        int b10 = c.b(this.f11251o, this.f11253q, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f11252p;
            if (objArr[b10] != f11249r) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public long l(int i10) {
        if (this.f11250n) {
            g();
        }
        return this.f11251o[i10];
    }

    public void m(long j10, E e10) {
        int b10 = c.b(this.f11251o, this.f11253q, j10);
        if (b10 >= 0) {
            this.f11252p[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f11253q;
        if (i10 < i11) {
            Object[] objArr = this.f11252p;
            if (objArr[i10] == f11249r) {
                this.f11251o[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f11250n && i11 >= this.f11251o.length) {
            g();
            i10 = ~c.b(this.f11251o, this.f11253q, j10);
        }
        int i12 = this.f11253q;
        if (i12 >= this.f11251o.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f11251o;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f11252p;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11251o = jArr;
            this.f11252p = objArr2;
        }
        int i13 = this.f11253q;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f11251o;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f11252p;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f11253q - i10);
        }
        this.f11251o[i10] = j10;
        this.f11252p[i10] = e10;
        this.f11253q++;
    }

    public void n(long j10) {
        int b10 = c.b(this.f11251o, this.f11253q, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f11252p;
            Object obj = objArr[b10];
            Object obj2 = f11249r;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f11250n = true;
            }
        }
    }

    public int p() {
        if (this.f11250n) {
            g();
        }
        return this.f11253q;
    }

    public E q(int i10) {
        if (this.f11250n) {
            g();
        }
        return (E) this.f11252p[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11253q * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11253q; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(l(i10));
            sb.append('=');
            E q10 = q(i10);
            if (q10 != this) {
                sb.append(q10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
