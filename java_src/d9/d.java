package d9;

import b9.g;
/* loaded from: classes.dex */
public abstract class d extends a {

    /* renamed from: o  reason: collision with root package name */
    private final b9.g f6614o;

    /* renamed from: p  reason: collision with root package name */
    private transient b9.d<Object> f6615p;

    public d(b9.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.b() : null);
    }

    public d(b9.d<Object> dVar, b9.g gVar) {
        super(dVar);
        this.f6614o = gVar;
    }

    @Override // b9.d
    public b9.g b() {
        b9.g gVar = this.f6614o;
        k9.k.b(gVar);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d9.a
    public void t() {
        b9.d<?> dVar = this.f6615p;
        if (dVar != null && dVar != this) {
            g.b c10 = b().c(b9.e.f2968b);
            k9.k.b(c10);
            ((b9.e) c10).R(dVar);
        }
        this.f6615p = c.f6613n;
    }

    public final b9.d<Object> u() {
        b9.d<Object> dVar = this.f6615p;
        if (dVar == null) {
            b9.e eVar = (b9.e) b().c(b9.e.f2968b);
            if (eVar == null || (dVar = eVar.p(this)) == null) {
                dVar = this;
            }
            this.f6615p = dVar;
        }
        return dVar;
    }
}
