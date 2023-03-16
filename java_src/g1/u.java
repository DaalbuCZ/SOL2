package g1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class u implements t {

    /* renamed from: e  reason: collision with root package name */
    private static volatile v f7448e;

    /* renamed from: a  reason: collision with root package name */
    private final q1.a f7449a;

    /* renamed from: b  reason: collision with root package name */
    private final q1.a f7450b;

    /* renamed from: c  reason: collision with root package name */
    private final m1.e f7451c;

    /* renamed from: d  reason: collision with root package name */
    private final n1.s f7452d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(q1.a aVar, q1.a aVar2, m1.e eVar, n1.s sVar, n1.w wVar) {
        this.f7449a = aVar;
        this.f7450b = aVar2;
        this.f7451c = eVar;
        this.f7452d = sVar;
        wVar.c();
    }

    private i b(o oVar) {
        return i.a().i(this.f7449a.a()).k(this.f7450b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public static u c() {
        v vVar = f7448e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<e1.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(e1.b.b("proto"));
    }

    public static void f(Context context) {
        if (f7448e == null) {
            synchronized (u.class) {
                if (f7448e == null) {
                    f7448e = e.c().b(context).a();
                }
            }
        }
    }

    @Override // g1.t
    public void a(o oVar, e1.h hVar) {
        this.f7451c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public n1.s e() {
        return this.f7452d;
    }

    public e1.g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.e()).c(fVar.f()).a(), this);
    }
}
