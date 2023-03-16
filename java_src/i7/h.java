package i7;

import f7.p;
import f7.s;
import f7.w;
import f7.x;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: n  reason: collision with root package name */
    private final h7.c f8365n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f8366o;

    /* loaded from: classes.dex */
    private final class a<K, V> extends w<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final w<K> f8367a;

        /* renamed from: b  reason: collision with root package name */
        private final w<V> f8368b;

        /* renamed from: c  reason: collision with root package name */
        private final h7.i<? extends Map<K, V>> f8369c;

        public a(f7.e eVar, Type type, w<K> wVar, Type type2, w<V> wVar2, h7.i<? extends Map<K, V>> iVar) {
            this.f8367a = new m(eVar, wVar, type);
            this.f8368b = new m(eVar, wVar2, type2);
            this.f8369c = iVar;
        }

        private String f(f7.k kVar) {
            if (!kVar.x()) {
                if (kVar.s()) {
                    return "null";
                }
                throw new AssertionError();
            }
            p h10 = kVar.h();
            if (h10.J()) {
                return String.valueOf(h10.G());
            }
            if (h10.H()) {
                return Boolean.toString(h10.C());
            }
            if (h10.K()) {
                return h10.k();
            }
            throw new AssertionError();
        }

        @Override // f7.w
        /* renamed from: g */
        public Map<K, V> c(n7.a aVar) {
            n7.b Z = aVar.Z();
            if (Z == n7.b.NULL) {
                aVar.S();
                return null;
            }
            Map<K, V> a10 = this.f8369c.a();
            if (Z == n7.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.r()) {
                    aVar.a();
                    K c10 = this.f8367a.c(aVar);
                    if (a10.put(c10, this.f8368b.c(aVar)) != null) {
                        throw new s("duplicate key: " + c10);
                    }
                    aVar.k();
                }
                aVar.k();
            } else {
                aVar.b();
                while (aVar.r()) {
                    h7.f.f8130a.a(aVar);
                    K c11 = this.f8367a.c(aVar);
                    if (a10.put(c11, this.f8368b.c(aVar)) != null) {
                        throw new s("duplicate key: " + c11);
                    }
                }
                aVar.o();
            }
            return a10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f7.w
        /* renamed from: h */
        public void e(n7.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.D();
            } else if (!h.this.f8366o) {
                cVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.y(String.valueOf(entry.getKey()));
                    this.f8368b.e(cVar, entry.getValue());
                }
                cVar.o();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    f7.k d10 = this.f8367a.d(entry2.getKey());
                    arrayList.add(d10);
                    arrayList2.add(entry2.getValue());
                    z10 |= d10.l() || d10.v();
                }
                if (!z10) {
                    cVar.f();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.y(f((f7.k) arrayList.get(i10)));
                        this.f8368b.e(cVar, arrayList2.get(i10));
                        i10++;
                    }
                    cVar.o();
                    return;
                }
                cVar.c();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.c();
                    h7.l.b((f7.k) arrayList.get(i10), cVar);
                    this.f8368b.e(cVar, arrayList2.get(i10));
                    cVar.k();
                    i10++;
                }
                cVar.k();
            }
        }
    }

    public h(h7.c cVar, boolean z10) {
        this.f8365n = cVar;
        this.f8366o = z10;
    }

    private w<?> a(f7.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f8413f : eVar.k(m7.a.b(type));
    }

    @Override // f7.x
    public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
        Type e10 = aVar.e();
        if (Map.class.isAssignableFrom(aVar.c())) {
            Type[] j10 = h7.b.j(e10, h7.b.k(e10));
            return new a(eVar, j10[0], a(eVar, j10[0]), j10[1], eVar.k(m7.a.b(j10[1])), this.f8365n.a(aVar));
        }
        return null;
    }
}
