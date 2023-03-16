package l0;

import androidx.lifecycle.o;
import k0.m;
/* loaded from: classes.dex */
public class c implements m {

    /* renamed from: c  reason: collision with root package name */
    private final o<m.b> f11035c = new o<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<m.b.c> f11036d = androidx.work.impl.utils.futures.c.t();

    public c() {
        a(m.f10509b);
    }

    public void a(m.b bVar) {
        this.f11035c.f(bVar);
        if (bVar instanceof m.b.c) {
            this.f11036d.p((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f11036d.q(((m.b.a) bVar).a());
        }
    }
}
