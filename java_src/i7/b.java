package i7;

import f7.w;
import f7.x;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: n  reason: collision with root package name */
    private final h7.c f8353n;

    /* loaded from: classes.dex */
    private static final class a<E> extends w<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final w<E> f8354a;

        /* renamed from: b  reason: collision with root package name */
        private final h7.i<? extends Collection<E>> f8355b;

        public a(f7.e eVar, Type type, w<E> wVar, h7.i<? extends Collection<E>> iVar) {
            this.f8354a = new m(eVar, wVar, type);
            this.f8355b = iVar;
        }

        @Override // f7.w
        /* renamed from: f */
        public Collection<E> c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            Collection<E> a10 = this.f8355b.a();
            aVar.a();
            while (aVar.r()) {
                a10.add(this.f8354a.c(aVar));
            }
            aVar.k();
            return a10;
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.D();
                return;
            }
            cVar.c();
            for (E e10 : collection) {
                this.f8354a.e(cVar, e10);
            }
            cVar.k();
        }
    }

    public b(h7.c cVar) {
        this.f8353n = cVar;
    }

    @Override // f7.x
    public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        if (Collection.class.isAssignableFrom(c10)) {
            Type h10 = h7.b.h(e10, c10);
            return new a(eVar, h10, eVar.k(m7.a.b(h10)), this.f8353n.a(aVar));
        }
        return null;
    }
}
