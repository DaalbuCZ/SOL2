package z1;

import b5.q;
import b5.s0;
import p3.a0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final q<a> f17172a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17173b;

    private f(int i10, q<a> qVar) {
        this.f17173b = i10;
        this.f17172a = qVar;
    }

    private static a a(int i10, int i11, a0 a0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, a0Var);
            case 1751742049:
                return c.b(a0Var);
            case 1752331379:
                return d.c(a0Var);
            case 1852994675:
                return h.a(a0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, a0 a0Var) {
        q.a aVar = new q.a();
        int f10 = a0Var.f();
        int i11 = -2;
        while (a0Var.a() > 8) {
            int p10 = a0Var.p();
            int e10 = a0Var.e() + a0Var.p();
            a0Var.N(e10);
            a c10 = p10 == 1414744396 ? c(a0Var.p(), a0Var) : a(p10, i11, a0Var);
            if (c10 != null) {
                if (c10.getType() == 1752331379) {
                    i11 = ((d) c10).b();
                }
                aVar.a(c10);
            }
            a0Var.O(e10);
            a0Var.N(f10);
        }
        return new f(i10, aVar.h());
    }

    public <T extends a> T b(Class<T> cls) {
        s0<a> it = this.f17172a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // z1.a
    public int getType() {
        return this.f17173b;
    }
}
