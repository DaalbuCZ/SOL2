package b5;

import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0<E> extends s<E> {

    /* renamed from: p  reason: collision with root package name */
    final transient E f2868p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(E e10) {
        this.f2868p = (E) a5.j.i(e10);
    }

    @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f2868p.equals(obj);
    }

    @Override // b5.s, b5.o
    public q<E> d() {
        return q.K(this.f2868p);
    }

    @Override // b5.o
    int g(Object[] objArr, int i10) {
        objArr[i10] = this.f2868p;
        return i10 + 1;
    }

    @Override // b5.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2868p.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.o
    public boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f2868p.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // b5.s, b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: v */
    public s0<E> iterator() {
        return u.p(this.f2868p);
    }
}
