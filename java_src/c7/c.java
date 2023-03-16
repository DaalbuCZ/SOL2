package c7;

import java.util.Iterator;
import java.util.Set;
import k5.r;
/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f3226a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3227b;

    c(Set<f> set, d dVar) {
        this.f3226a = e(set);
        this.f3227b = dVar;
    }

    public static k5.c<i> c() {
        return k5.c.c(i.class).b(r.m(f.class)).f(b.f3225a).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(k5.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // c7.i
    public String a() {
        if (this.f3227b.b().isEmpty()) {
            return this.f3226a;
        }
        return this.f3226a + ' ' + e(this.f3227b.b());
    }
}
