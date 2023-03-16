package d9;

import java.io.Serializable;
import y8.m;
import y8.n;
import y8.s;
/* loaded from: classes.dex */
public abstract class a implements b9.d<Object>, e, Serializable {

    /* renamed from: n  reason: collision with root package name */
    private final b9.d<Object> f6612n;

    public a(b9.d<Object> dVar) {
        this.f6612n = dVar;
    }

    @Override // d9.e
    public e h() {
        b9.d<Object> dVar = this.f6612n;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b9.d
    public final void l(Object obj) {
        Object r10;
        Object c10;
        b9.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            b9.d dVar2 = aVar.f6612n;
            k9.k.b(dVar2);
            try {
                r10 = aVar.r(obj);
                c10 = c9.d.c();
            } catch (Throwable th) {
                m.a aVar2 = m.f17093n;
                obj = m.a(n.a(th));
            }
            if (r10 == c10) {
                return;
            }
            m.a aVar3 = m.f17093n;
            obj = m.a(r10);
            aVar.t();
            if (!(dVar2 instanceof a)) {
                dVar2.l(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // d9.e
    public StackTraceElement n() {
        return g.d(this);
    }

    public b9.d<s> o(Object obj, b9.d<?> dVar) {
        k9.k.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final b9.d<Object> p() {
        return this.f6612n;
    }

    protected abstract Object r(Object obj);

    protected void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object n10 = n();
        if (n10 == null) {
            n10 = getClass().getName();
        }
        sb.append(n10);
        return sb.toString();
    }
}
