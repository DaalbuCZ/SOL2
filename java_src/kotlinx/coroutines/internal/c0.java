package kotlinx.coroutines.internal;

import r9.p1;
/* loaded from: classes.dex */
public class c0<T> extends r9.a<T> implements d9.e {

    /* renamed from: p  reason: collision with root package name */
    public final b9.d<T> f10910p;

    @Override // r9.a
    protected void D0(Object obj) {
        b9.d<T> dVar = this.f10910p;
        dVar.l(r9.z.a(obj, dVar));
    }

    public final p1 H0() {
        r9.q Y = Y();
        if (Y != null) {
            return Y.getParent();
        }
        return null;
    }

    @Override // r9.w1
    protected final boolean e0() {
        return true;
    }

    @Override // d9.e
    public final d9.e h() {
        b9.d<T> dVar = this.f10910p;
        if (dVar instanceof d9.e) {
            return (d9.e) dVar;
        }
        return null;
    }

    @Override // d9.e
    public final StackTraceElement n() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r9.w1
    public void z(Object obj) {
        b9.d b10;
        b10 = c9.c.b(this.f10910p);
        i.c(b10, r9.z.a(obj, this.f10910p), null, 2, null);
    }
}
