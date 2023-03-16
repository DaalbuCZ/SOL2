package b5;

import b5.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class q<E> extends o<E> implements List<E>, RandomAccess {

    /* renamed from: o  reason: collision with root package name */
    private static final t0<Object> f2863o = new b(j0.f2823r, 0);

    /* loaded from: classes.dex */
    public static final class a<E> extends o.a<E> {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        @Override // b5.o.b
        /* renamed from: f */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> g(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public q<E> h() {
            this.f2856c = true;
            return q.C(this.f2854a, this.f2855b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<E> extends b5.a<E> {

        /* renamed from: p  reason: collision with root package name */
        private final q<E> f2864p;

        b(q<E> qVar, int i10) {
            super(qVar.size(), i10);
            this.f2864p = qVar;
        }

        @Override // b5.a
        protected E b(int i10) {
            return this.f2864p.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends q<E> {

        /* renamed from: p  reason: collision with root package name */
        final transient int f2865p;

        /* renamed from: q  reason: collision with root package name */
        final transient int f2866q;

        c(int i10, int i11) {
            this.f2865p = i10;
            this.f2866q = i11;
        }

        @Override // b5.q, java.util.List
        /* renamed from: N */
        public q<E> subList(int i10, int i11) {
            a5.j.m(i10, i11, this.f2866q);
            q qVar = q.this;
            int i12 = this.f2865p;
            return qVar.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.List
        public E get(int i10) {
            a5.j.g(i10, this.f2866q);
            return q.this.get(i10 + this.f2865p);
        }

        @Override // b5.o
        @CheckForNull
        Object[] h() {
            return q.this.h();
        }

        @Override // b5.q, b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // b5.o
        int k() {
            return q.this.l() + this.f2865p + this.f2866q;
        }

        @Override // b5.o
        int l() {
            return q.this.l() + this.f2865p;
        }

        @Override // b5.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // b5.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // b5.o
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f2866q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> q<E> C(Object[] objArr, int i10) {
        return i10 == 0 ? J() : new j0(objArr, i10);
    }

    public static <E> a<E> D() {
        return new a<>();
    }

    private static <E> q<E> E(Object... objArr) {
        return x(g0.b(objArr));
    }

    public static <E> q<E> F(Collection<? extends E> collection) {
        if (collection instanceof o) {
            q<E> d10 = ((o) collection).d();
            return d10.s() ? x(d10.toArray()) : d10;
        }
        return E(collection.toArray());
    }

    public static <E> q<E> G(E[] eArr) {
        return eArr.length == 0 ? J() : E((Object[]) eArr.clone());
    }

    public static <E> q<E> J() {
        return (q<E>) j0.f2823r;
    }

    public static <E> q<E> K(E e10) {
        return E(e10);
    }

    public static <E> q<E> L(E e10, E e11) {
        return E(e10, e11);
    }

    public static <E> q<E> M(E e10, E e11, E e12, E e13, E e14) {
        return E(e10, e11, e12, e13, e14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> q<E> x(Object[] objArr) {
        return C(objArr, objArr.length);
    }

    @Override // java.util.List
    /* renamed from: H */
    public t0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: I */
    public t0<E> listIterator(int i10) {
        a5.j.k(i10, size());
        return isEmpty() ? (t0<E>) f2863o : new b(this, i10);
    }

    @Override // java.util.List
    /* renamed from: N */
    public q<E> subList(int i10, int i11) {
        a5.j.m(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? J() : O(i10, i11);
    }

    q<E> O(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // b5.o
    @Deprecated
    public final q<E> d() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return w.c(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b5.o
    public int g(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.f(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: v */
    public s0<E> iterator() {
        return listIterator();
    }
}
