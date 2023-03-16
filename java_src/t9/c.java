package t9;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.r;
import r9.n0;
import r9.o0;
import t9.i;
/* loaded from: classes.dex */
public abstract class c<E> implements t<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14832d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: b  reason: collision with root package name */
    protected final j9.l<E, y8.s> f14833b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlinx.coroutines.internal.p f14834c = new kotlinx.coroutines.internal.p();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes.dex */
    public static final class a<E> extends s {

        /* renamed from: q  reason: collision with root package name */
        public final E f14835q;

        public a(E e10) {
            this.f14835q = e10;
        }

        @Override // t9.s
        public void C() {
        }

        @Override // t9.s
        public Object D() {
            return this.f14835q;
        }

        @Override // t9.s
        public e0 E(r.b bVar) {
            return r9.m.f13141a;
        }

        @Override // kotlinx.coroutines.internal.r
        public String toString() {
            return "SendBuffered@" + o0.b(this) + '(' + this.f14835q + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(j9.l<? super E, y8.s> lVar) {
        this.f14833b = lVar;
    }

    private final int b() {
        kotlinx.coroutines.internal.p pVar = this.f14834c;
        int i10 = 0;
        for (kotlinx.coroutines.internal.r rVar = (kotlinx.coroutines.internal.r) pVar.s(); !k9.k.a(rVar, pVar); rVar = rVar.t()) {
            if (rVar instanceof kotlinx.coroutines.internal.r) {
                i10++;
            }
        }
        return i10;
    }

    private final String f() {
        String str;
        kotlinx.coroutines.internal.r t10 = this.f14834c.t();
        if (t10 == this.f14834c) {
            return "EmptyQueue";
        }
        if (t10 instanceof j) {
            str = t10.toString();
        } else if (t10 instanceof o) {
            str = "ReceiveQueued";
        } else if (t10 instanceof s) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + t10;
        }
        kotlinx.coroutines.internal.r u10 = this.f14834c.u();
        if (u10 != t10) {
            String str2 = str + ",queueSize=" + b();
            if (u10 instanceof j) {
                return str2 + ",closedForSend=" + u10;
            }
            return str2;
        }
        return str;
    }

    private final void g(j<?> jVar) {
        Object b10 = kotlinx.coroutines.internal.m.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.r u10 = jVar.u();
            o oVar = u10 instanceof o ? (o) u10 : null;
            if (oVar == null) {
                break;
            } else if (oVar.y()) {
                b10 = kotlinx.coroutines.internal.m.c(b10, oVar);
            } else {
                oVar.v();
            }
        }
        if (b10 != null) {
            if (b10 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) b10;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((o) arrayList.get(size)).D(jVar);
                }
            } else {
                ((o) b10).D(jVar);
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.J();
    }

    @Override // t9.t
    public final Object a(E e10) {
        i.b bVar;
        j<?> jVar;
        Object i10 = i(e10);
        if (i10 == b.f14827b) {
            return i.f14849a.c(y8.s.f17099a);
        }
        if (i10 == b.f14828c) {
            jVar = d();
            if (jVar == null) {
                return i.f14849a.b();
            }
            bVar = i.f14849a;
        } else if (!(i10 instanceof j)) {
            throw new IllegalStateException(("trySend returned " + i10).toString());
        } else {
            bVar = i.f14849a;
            jVar = (j) i10;
        }
        return bVar.a(h(jVar));
    }

    protected String c() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j<?> d() {
        kotlinx.coroutines.internal.r u10 = this.f14834c.u();
        j<?> jVar = u10 instanceof j ? (j) u10 : null;
        if (jVar != null) {
            g(jVar);
            return jVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlinx.coroutines.internal.p e() {
        return this.f14834c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object i(E e10) {
        q<E> l10;
        e0 h10;
        do {
            l10 = l();
            if (l10 == null) {
                return b.f14828c;
            }
            h10 = l10.h(e10, null);
        } while (h10 == null);
        if (n0.a()) {
            if (!(h10 == r9.m.f13141a)) {
                throw new AssertionError();
            }
        }
        l10.b(e10);
        return l10.g();
    }

    protected void j(kotlinx.coroutines.internal.r rVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q<?> k(E e10) {
        kotlinx.coroutines.internal.r u10;
        kotlinx.coroutines.internal.r rVar = this.f14834c;
        a aVar = new a(e10);
        do {
            u10 = rVar.u();
            if (u10 instanceof q) {
                return (q) u10;
            }
        } while (!u10.n(aVar, rVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q<E> l() {
        kotlinx.coroutines.internal.r rVar;
        kotlinx.coroutines.internal.r z10;
        kotlinx.coroutines.internal.p pVar = this.f14834c;
        while (true) {
            rVar = (kotlinx.coroutines.internal.r) pVar.s();
            if (rVar != pVar && (rVar instanceof q)) {
                if (((((q) rVar) instanceof j) && !rVar.x()) || (z10 = rVar.z()) == null) {
                    break;
                }
                z10.w();
            }
        }
        rVar = null;
        return (q) rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s m() {
        kotlinx.coroutines.internal.r rVar;
        kotlinx.coroutines.internal.r z10;
        kotlinx.coroutines.internal.p pVar = this.f14834c;
        while (true) {
            rVar = (kotlinx.coroutines.internal.r) pVar.s();
            if (rVar != pVar && (rVar instanceof s)) {
                if (((((s) rVar) instanceof j) && !rVar.x()) || (z10 = rVar.z()) == null) {
                    break;
                }
                z10.w();
            }
        }
        rVar = null;
        return (s) rVar;
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + '{' + f() + '}' + c();
    }
}
