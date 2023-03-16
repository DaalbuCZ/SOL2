package i7;

import f7.q;
import f7.r;
import f7.w;
import f7.x;
/* loaded from: classes.dex */
public final class l<T> extends w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final r<T> f8397a;

    /* renamed from: b  reason: collision with root package name */
    private final f7.j<T> f8398b;

    /* renamed from: c  reason: collision with root package name */
    final f7.e f8399c;

    /* renamed from: d  reason: collision with root package name */
    private final m7.a<T> f8400d;

    /* renamed from: e  reason: collision with root package name */
    private final x f8401e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.b f8402f = new b();

    /* renamed from: g  reason: collision with root package name */
    private w<T> f8403g;

    /* loaded from: classes.dex */
    private final class b implements q, f7.i {
        private b() {
        }
    }

    public l(r<T> rVar, f7.j<T> jVar, f7.e eVar, m7.a<T> aVar, x xVar) {
        this.f8397a = rVar;
        this.f8398b = jVar;
        this.f8399c = eVar;
        this.f8400d = aVar;
        this.f8401e = xVar;
    }

    private w<T> f() {
        w<T> wVar = this.f8403g;
        if (wVar != null) {
            return wVar;
        }
        w<T> l10 = this.f8399c.l(this.f8401e, this.f8400d);
        this.f8403g = l10;
        return l10;
    }

    @Override // f7.w
    public T c(n7.a aVar) {
        if (this.f8398b == null) {
            return f().c(aVar);
        }
        f7.k a10 = h7.l.a(aVar);
        if (a10.s()) {
            return null;
        }
        return this.f8398b.a(a10, this.f8400d.e(), this.f8402f);
    }

    @Override // f7.w
    public void e(n7.c cVar, T t10) {
        r<T> rVar = this.f8397a;
        if (rVar == null) {
            f().e(cVar, t10);
        } else if (t10 == null) {
            cVar.D();
        } else {
            h7.l.b(rVar.a(t10, this.f8400d.e(), this.f8402f), cVar);
        }
    }
}
