package r9;

import y8.m;
/* loaded from: classes.dex */
public abstract class u0<T> extends kotlinx.coroutines.scheduling.h {

    /* renamed from: p  reason: collision with root package name */
    public int f13168p;

    public u0(int i10) {
        this.f13168p = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract b9.d<T> c();

    public Throwable d(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f13170a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            y8.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        k9.k.b(th);
        g0.a(c().b(), new m0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object a10;
        Object a11;
        Object a12;
        if (n0.a()) {
            if (!(this.f13168p != -1)) {
                throw new AssertionError();
            }
        }
        kotlinx.coroutines.scheduling.i iVar = this.f11018o;
        try {
            kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) c();
            b9.d<T> dVar = hVar.f10921r;
            Object obj = hVar.f10923t;
            b9.g b10 = dVar.b();
            Object c10 = kotlinx.coroutines.internal.i0.c(b10, obj);
            i2<?> f10 = c10 != kotlinx.coroutines.internal.i0.f10926a ? c0.f(dVar, b10, c10) : null;
            b9.g b11 = dVar.b();
            Object k10 = k();
            Throwable d10 = d(k10);
            p1 p1Var = (d10 == null && v0.b(this.f13168p)) ? (p1) b11.c(p1.f13154l) : null;
            if (p1Var != null && !p1Var.a()) {
                Throwable G = p1Var.G();
                a(k10, G);
                m.a aVar = y8.m.f17093n;
                if (n0.d() && (dVar instanceof d9.e)) {
                    G = kotlinx.coroutines.internal.d0.a(G, (d9.e) dVar);
                }
                a11 = y8.m.a(y8.n.a(G));
            } else if (d10 != null) {
                m.a aVar2 = y8.m.f17093n;
                a11 = y8.m.a(y8.n.a(d10));
            } else {
                m.a aVar3 = y8.m.f17093n;
                a11 = y8.m.a(f(k10));
            }
            dVar.l(a11);
            y8.s sVar = y8.s.f17099a;
            if (f10 == null || f10.I0()) {
                kotlinx.coroutines.internal.i0.a(b10, c10);
            }
            try {
                m.a aVar4 = y8.m.f17093n;
                iVar.a();
                a12 = y8.m.a(sVar);
            } catch (Throwable th) {
                m.a aVar5 = y8.m.f17093n;
                a12 = y8.m.a(y8.n.a(th));
            }
            j(null, y8.m.b(a12));
        } catch (Throwable th2) {
            try {
                m.a aVar6 = y8.m.f17093n;
                iVar.a();
                a10 = y8.m.a(y8.s.f17099a);
            } catch (Throwable th3) {
                m.a aVar7 = y8.m.f17093n;
                a10 = y8.m.a(y8.n.a(th3));
            }
            j(th2, y8.m.b(a10));
        }
    }
}
