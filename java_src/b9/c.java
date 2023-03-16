package b9;

import b9.g;
import j9.p;
import java.io.Serializable;
import k9.k;
import k9.l;
/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: n  reason: collision with root package name */
    private final g f2965n;

    /* renamed from: o  reason: collision with root package name */
    private final g.b f2966o;

    /* loaded from: classes.dex */
    static final class a extends l implements p<String, g.b, String> {

        /* renamed from: o  reason: collision with root package name */
        public static final a f2967o = new a();

        a() {
            super(2);
        }

        @Override // j9.p
        /* renamed from: a */
        public final String k(String str, g.b bVar) {
            k.e(str, "acc");
            k.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        k.e(gVar, "left");
        k.e(bVar, "element");
        this.f2965n = gVar;
        this.f2966o = bVar;
    }

    private final boolean b(g.b bVar) {
        return k.a(c(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (b(cVar.f2966o)) {
            g gVar = cVar.f2965n;
            if (!(gVar instanceof c)) {
                k.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int e() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f2965n;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // b9.g
    public g B(g.c<?> cVar) {
        k.e(cVar, "key");
        if (this.f2966o.c(cVar) != null) {
            return this.f2965n;
        }
        g B = this.f2965n.B(cVar);
        return B == this.f2965n ? this : B == h.f2971n ? this.f2966o : new c(B, this.f2966o);
    }

    @Override // b9.g
    public <R> R S(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return pVar.k((Object) this.f2965n.S(r10, pVar), this.f2966o);
    }

    @Override // b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        k.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f2966o.c(cVar);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar2.f2965n;
            if (!(gVar instanceof c)) {
                return (E) gVar.c(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f2965n.hashCode() + this.f2966o.hashCode();
    }

    @Override // b9.g
    public g j(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) S("", a.f2967o)) + ']';
    }
}
