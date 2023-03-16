package r9;

import b9.e;
import b9.g;
/* loaded from: classes.dex */
public abstract class d0 extends b9.a implements b9.e {

    /* renamed from: o  reason: collision with root package name */
    public static final a f13106o = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends b9.b<b9.e, d0> {

        /* renamed from: r9.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0189a extends k9.l implements j9.l<g.b, d0> {

            /* renamed from: o  reason: collision with root package name */
            public static final C0189a f13107o = new C0189a();

            C0189a() {
                super(1);
            }

            @Override // j9.l
            /* renamed from: a */
            public final d0 c(g.b bVar) {
                if (bVar instanceof d0) {
                    return (d0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(b9.e.f2968b, C0189a.f13107o);
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    public d0() {
        super(b9.e.f2968b);
    }

    @Override // b9.a, b9.g
    public b9.g B(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    @Override // b9.e
    public final void R(b9.d<?> dVar) {
        ((kotlinx.coroutines.internal.h) dVar).v();
    }

    public boolean W(b9.g gVar) {
        return true;
    }

    public d0 X(int i10) {
        kotlinx.coroutines.internal.o.a(i10);
        return new kotlinx.coroutines.internal.n(this, i10);
    }

    public abstract void b(b9.g gVar, Runnable runnable);

    @Override // b9.a, b9.g.b, b9.g
    public <E extends g.b> E c(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // b9.e
    public final <T> b9.d<T> p(b9.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.h(this, dVar);
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}
