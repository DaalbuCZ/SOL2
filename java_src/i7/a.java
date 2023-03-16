package i7;

import f7.w;
import f7.x;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a<E> extends w<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final x f8350c = new C0127a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f8351a;

    /* renamed from: b  reason: collision with root package name */
    private final w<E> f8352b;

    /* renamed from: i7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0127a implements x {
        C0127a() {
        }

        @Override // f7.x
        public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
            Type e10 = aVar.e();
            if ((e10 instanceof GenericArrayType) || ((e10 instanceof Class) && ((Class) e10).isArray())) {
                Type g10 = h7.b.g(e10);
                return new a(eVar, eVar.k(m7.a.b(g10)), h7.b.k(g10));
            }
            return null;
        }
    }

    public a(f7.e eVar, w<E> wVar, Class<E> cls) {
        this.f8352b = new m(eVar, wVar, cls);
        this.f8351a = cls;
    }

    @Override // f7.w
    public Object c(n7.a aVar) {
        if (aVar.Z() == n7.b.NULL) {
            aVar.S();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.r()) {
            arrayList.add(this.f8352b.c(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f8351a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f7.w
    public void e(n7.c cVar, Object obj) {
        if (obj == null) {
            cVar.D();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f8352b.e(cVar, Array.get(obj, i10));
        }
        cVar.k();
    }
}
