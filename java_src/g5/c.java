package g5;

import android.content.Context;
import i5.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final i6.b<i5.a> f7549a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7550b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f7551c = null;

    public c(Context context, i6.b<i5.a> bVar, String str) {
        this.f7549a = bVar;
        this.f7550b = str;
    }

    private void a(a.c cVar) {
        this.f7549a.get().c(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g10 = g();
        for (b bVar : list) {
            while (arrayDeque.size() >= g10) {
                i(((a.c) arrayDeque.pollFirst()).f8329b);
            }
            a.c d10 = bVar.d(this.f7550b);
            a(d10);
            arrayDeque.offer(d10);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(b.a(map));
        }
        return arrayList;
    }

    private List<a.c> d() {
        return this.f7549a.get().b(this.f7550b, "");
    }

    private ArrayList<b> e(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!set.contains(bVar.b())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> f(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c cVar : list) {
            if (!set.contains(cVar.f8329b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f7551c == null) {
            this.f7551c = Integer.valueOf(this.f7549a.get().g(this.f7550b));
        }
        return this.f7551c.intValue();
    }

    private void i(String str) {
        this.f7549a.get().clearConditionalUserProperty(str, null, null);
    }

    private void j(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            i(cVar.f8329b);
        }
    }

    private void l(List<b> list) {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (b bVar : list) {
            hashSet.add(bVar.b());
        }
        List<a.c> d10 = d();
        HashSet hashSet2 = new HashSet();
        for (a.c cVar : d10) {
            hashSet2.add(cVar.f8329b);
        }
        j(f(d10, hashSet));
        b(e(list, hashSet2));
    }

    private void m() {
        if (this.f7549a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) {
        m();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        l(c(list));
    }
}
