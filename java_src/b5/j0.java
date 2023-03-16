package b5;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j0<E> extends q<E> {

    /* renamed from: r  reason: collision with root package name */
    static final q<Object> f2823r = new j0(new Object[0], 0);

    /* renamed from: p  reason: collision with root package name */
    final transient Object[] f2824p;

    /* renamed from: q  reason: collision with root package name */
    private final transient int f2825q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Object[] objArr, int i10) {
        this.f2824p = objArr;
        this.f2825q = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.q, b5.o
    public int g(Object[] objArr, int i10) {
        System.arraycopy(this.f2824p, 0, objArr, i10, this.f2825q);
        return i10 + this.f2825q;
    }

    @Override // java.util.List
    public E get(int i10) {
        a5.j.g(i10, this.f2825q);
        E e10 = (E) this.f2824p[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.o
    public Object[] h() {
        return this.f2824p;
    }

    @Override // b5.o
    int k() {
        return this.f2825q;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2825q;
    }
}
