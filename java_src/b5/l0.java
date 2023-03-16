package b5;

import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l0<E> extends s<E> {

    /* renamed from: u  reason: collision with root package name */
    private static final Object[] f2844u;

    /* renamed from: v  reason: collision with root package name */
    static final l0<Object> f2845v;

    /* renamed from: p  reason: collision with root package name */
    final transient Object[] f2846p;

    /* renamed from: q  reason: collision with root package name */
    private final transient int f2847q;

    /* renamed from: r  reason: collision with root package name */
    final transient Object[] f2848r;

    /* renamed from: s  reason: collision with root package name */
    private final transient int f2849s;

    /* renamed from: t  reason: collision with root package name */
    private final transient int f2850t;

    static {
        Object[] objArr = new Object[0];
        f2844u = objArr;
        f2845v = new l0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f2846p = objArr;
        this.f2847q = i10;
        this.f2848r = objArr2;
        this.f2849s = i11;
        this.f2850t = i12;
    }

    @Override // b5.s
    q<E> F() {
        return q.C(this.f2846p, this.f2850t);
    }

    @Override // b5.s
    boolean G() {
        return true;
    }

    @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f2848r;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b10 = n.b(obj);
        while (true) {
            int i10 = b10 & this.f2849s;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    @Override // b5.o
    int g(Object[] objArr, int i10) {
        System.arraycopy(this.f2846p, 0, objArr, i10, this.f2850t);
        return i10 + this.f2850t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.o
    public Object[] h() {
        return this.f2846p;
    }

    @Override // b5.s, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f2847q;
    }

    @Override // b5.o
    int k() {
        return this.f2850t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.o
    public int l() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.o
    public boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f2850t;
    }

    @Override // b5.s, b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: v */
    public s0<E> iterator() {
        return d().iterator();
    }
}
