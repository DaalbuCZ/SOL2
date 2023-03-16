package b5;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b5.b<T> {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Iterator f2879p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ a5.k f2880q;

        a(Iterator it, a5.k kVar) {
            this.f2879p = it;
            this.f2880q = kVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
        @Override // b5.b
        @CheckForNull
        protected T b() {
            while (this.f2879p.hasNext()) {
                ?? next = this.f2879p.next();
                if (this.f2880q.apply(next)) {
                    return next;
                }
            }
            return c();
        }
    }

    /* loaded from: classes.dex */
    class b extends s0<T> {

        /* renamed from: n  reason: collision with root package name */
        boolean f2881n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f2882o;

        b(Object obj) {
            this.f2882o = obj;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return !this.f2881n;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (this.f2881n) {
                throw new NoSuchElementException();
            }
            this.f2881n = true;
            return this.f2882o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c implements Iterator<Object>, j$.util.Iterator {
        INSTANCE;

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, java.util.Iterator<? extends T> it) {
        a5.j.i(collection);
        a5.j.i(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(java.util.Iterator<T> it, a5.k<? super T> kVar) {
        return l(it, kVar) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(java.util.Iterator<?> it) {
        a5.j.i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(java.util.Iterator<?> it, @CheckForNull Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = a5.i.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.u.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> java.util.Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> s0<T> g(java.util.Iterator<T> it, a5.k<? super T> kVar) {
        a5.j.i(it);
        a5.j.i(kVar);
        return new a(it, kVar);
    }

    public static <T> T h(java.util.Iterator<T> it, a5.k<? super T> kVar) {
        a5.j.i(it);
        a5.j.i(kVar);
        while (it.hasNext()) {
            T next = it.next();
            if (kVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T i(java.util.Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j(java.util.Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) i(it) : t10;
    }

    public static <T> T k(java.util.Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int l(java.util.Iterator<T> it, a5.k<? super T> kVar) {
        a5.j.j(kVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public static <T> T m(java.util.Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean n(java.util.Iterator<?> it, Collection<?> collection) {
        a5.j.i(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean o(java.util.Iterator<T> it, a5.k<? super T> kVar) {
        a5.j.i(kVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> s0<T> p(T t10) {
        return new b(t10);
    }
}
