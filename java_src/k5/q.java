package k5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
class q {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final k5.c<?> f10669a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f10670b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f10671c = new HashSet();

        b(k5.c<?> cVar) {
            this.f10669a = cVar;
        }

        void a(b bVar) {
            this.f10670b.add(bVar);
        }

        void b(b bVar) {
            this.f10671c.add(bVar);
        }

        k5.c<?> c() {
            return this.f10669a;
        }

        Set<b> d() {
            return this.f10670b;
        }

        boolean e() {
            return this.f10670b.isEmpty();
        }

        boolean f() {
            return this.f10671c.isEmpty();
        }

        void g(b bVar) {
            this.f10671c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final f0<?> f10672a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f10673b;

        private c(f0<?> f0Var, boolean z10) {
            this.f10672a = f0Var;
            this.f10673b = z10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f10672a.equals(this.f10672a) && cVar.f10673b == this.f10673b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f10672a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f10673b).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<k5.c<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b10.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c10) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<k5.c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (k5.c<?> cVar : list) {
            b bVar = new b(cVar);
            for (f0<? super Object> f0Var : cVar.j()) {
                c cVar2 = new c(f0Var, !cVar.p());
                if (!hashMap.containsKey(cVar2)) {
                    hashMap.put(cVar2, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar2);
                if (!set2.isEmpty() && !cVar2.f10673b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f0Var));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (r rVar : bVar2.c().g()) {
                    if (rVar.e() && (set = (Set) hashMap.get(new c(rVar.c(), rVar.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
