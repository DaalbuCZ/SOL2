package v9;

import b9.g;
import b9.h;
import j9.p;
import k9.k;
import k9.l;
import q9.f;
import r9.t1;
import y8.m;
import y8.s;
/* loaded from: classes.dex */
public final class c<T> extends d9.d implements u9.c<T> {

    /* renamed from: q  reason: collision with root package name */
    public final u9.c<T> f15797q;

    /* renamed from: r  reason: collision with root package name */
    public final g f15798r;

    /* renamed from: s  reason: collision with root package name */
    public final int f15799s;

    /* renamed from: t  reason: collision with root package name */
    private g f15800t;

    /* renamed from: u  reason: collision with root package name */
    private b9.d<? super s> f15801u;

    /* loaded from: classes.dex */
    static final class a extends l implements p<Integer, g.b, Integer> {

        /* renamed from: o  reason: collision with root package name */
        public static final a f15802o = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // j9.p
        public /* bridge */ /* synthetic */ Integer k(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(u9.c<? super T> cVar, g gVar) {
        super(b.f15795n, h.f2971n);
        this.f15797q = cVar;
        this.f15798r = gVar;
        this.f15799s = ((Number) gVar.S(0, a.f15802o)).intValue();
    }

    private final void v(g gVar, g gVar2, T t10) {
        if (gVar2 instanceof v9.a) {
            x((v9.a) gVar2, t10);
        }
        e.a(this, gVar);
    }

    private final Object w(b9.d<? super s> dVar, T t10) {
        Object c10;
        g b10 = dVar.b();
        t1.d(b10);
        g gVar = this.f15800t;
        if (gVar != b10) {
            v(b10, gVar, t10);
            this.f15800t = b10;
        }
        this.f15801u = dVar;
        Object j10 = d.a().j(this.f15797q, t10, this);
        c10 = c9.d.c();
        if (!k.a(j10, c10)) {
            this.f15801u = null;
        }
        return j10;
    }

    private final void x(v9.a aVar, Object obj) {
        String e10;
        e10 = f.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f15793n + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e10.toString());
    }

    @Override // u9.c
    public Object a(T t10, b9.d<? super s> dVar) {
        Object c10;
        Object c11;
        try {
            Object w10 = w(dVar, t10);
            c10 = c9.d.c();
            if (w10 == c10) {
                d9.h.c(dVar);
            }
            c11 = c9.d.c();
            return w10 == c11 ? w10 : s.f17099a;
        } catch (Throwable th) {
            this.f15800t = new v9.a(th, dVar.b());
            throw th;
        }
    }

    @Override // d9.d, b9.d
    public g b() {
        g gVar = this.f15800t;
        return gVar == null ? h.f2971n : gVar;
    }

    @Override // d9.a, d9.e
    public d9.e h() {
        b9.d<? super s> dVar = this.f15801u;
        if (dVar instanceof d9.e) {
            return (d9.e) dVar;
        }
        return null;
    }

    @Override // d9.a, d9.e
    public StackTraceElement n() {
        return null;
    }

    @Override // d9.a
    public Object r(Object obj) {
        Object c10;
        Throwable b10 = m.b(obj);
        if (b10 != null) {
            this.f15800t = new v9.a(b10, b());
        }
        b9.d<? super s> dVar = this.f15801u;
        if (dVar != null) {
            dVar.l(obj);
        }
        c10 = c9.d.c();
        return c10;
    }

    @Override // d9.d, d9.a
    public void t() {
        super.t();
    }
}
