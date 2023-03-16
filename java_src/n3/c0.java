package n3;

import s1.a3;
import s1.l3;
import u2.u;
import u2.v0;
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private a f11643a;

    /* renamed from: b  reason: collision with root package name */
    private o3.f f11644b;

    /* loaded from: classes.dex */
    public interface a {
        void d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o3.f a() {
        return (o3.f) p3.a.h(this.f11644b);
    }

    public void b(a aVar, o3.f fVar) {
        this.f11643a = aVar;
        this.f11644b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f11643a;
        if (aVar != null) {
            aVar.d();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public void f() {
        this.f11643a = null;
        this.f11644b = null;
    }

    public abstract d0 g(a3[] a3VarArr, v0 v0Var, u.b bVar, l3 l3Var);

    public void h(u1.e eVar) {
    }
}
