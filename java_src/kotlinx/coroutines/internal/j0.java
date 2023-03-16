package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.k0;
/* loaded from: classes.dex */
public class j0<T extends k0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    private T[] f10940a;

    private final T[] f() {
        T[] tArr = this.f10940a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new k0[4];
            this.f10940a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            k9.k.d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((k0[]) copyOf);
            this.f10940a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i10) {
        this._size = i10;
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f10940a;
            k9.k.b(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                k9.k.b(t10);
                T t11 = tArr[i11];
                k9.k.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            k9.k.b(t12);
            T t13 = tArr[i11];
            k9.k.b(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f10940a;
            k9.k.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            k9.k.b(t10);
            T t11 = tArr[i10];
            k9.k.b(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f10940a;
        k9.k.b(tArr);
        T t10 = tArr[i11];
        k9.k.b(t10);
        T t11 = tArr[i10];
        k9.k.b(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.g(i10);
        t11.g(i11);
    }

    public final void a(T t10) {
        if (r9.n0.a()) {
            if (!(t10.m() == null)) {
                throw new AssertionError();
            }
        }
        t10.h(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.g(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f10940a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            if (t10.m() == null) {
                z10 = false;
            } else {
                int j10 = t10.j();
                if (r9.n0.a()) {
                    if (!(j10 >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(j10);
            }
        }
        return z10;
    }

    public final T h(int i10) {
        if (r9.n0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f10940a;
        k9.k.b(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                k9.k.b(t10);
                T t11 = tArr[i11];
                k9.k.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        k9.k.b(t12);
        if (r9.n0.a()) {
            if (!(t12.m() == this)) {
                throw new AssertionError();
            }
        }
        t12.h(null);
        t12.g(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
