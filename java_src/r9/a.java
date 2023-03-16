package r9;
/* loaded from: classes.dex */
public abstract class a<T> extends w1 implements b9.d<T>, j0 {

    /* renamed from: o  reason: collision with root package name */
    private final b9.g f13090o;

    public a(b9.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            c0((p1) gVar.c(p1.f13154l));
        }
        this.f13090o = gVar.j(this);
    }

    protected void D0(Object obj) {
        z(obj);
    }

    protected void E0(Throwable th, boolean z10) {
    }

    protected void F0(T t10) {
    }

    public final <R> void G0(l0 l0Var, R r10, j9.p<? super R, ? super b9.d<? super T>, ? extends Object> pVar) {
        l0Var.g(pVar, r10, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r9.w1
    public String I() {
        return o0.a(this) + " was cancelled";
    }

    @Override // r9.w1, r9.p1
    public boolean a() {
        return super.a();
    }

    @Override // b9.d
    public final b9.g b() {
        return this.f13090o;
    }

    @Override // r9.w1
    public final void b0(Throwable th) {
        g0.a(this.f13090o, th);
    }

    @Override // r9.j0
    public b9.g d() {
        return this.f13090o;
    }

    @Override // r9.w1
    public String i0() {
        String b10 = c0.b(this.f13090o);
        if (b10 == null) {
            return super.i0();
        }
        return '\"' + b10 + "\":" + super.i0();
    }

    @Override // b9.d
    public final void l(Object obj) {
        Object g02 = g0(z.d(obj, null, 1, null));
        if (g02 == x1.f13188b) {
            return;
        }
        D0(g02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r9.w1
    protected final void n0(Object obj) {
        if (!(obj instanceof v)) {
            F0(obj);
            return;
        }
        v vVar = (v) obj;
        E0(vVar.f13170a, vVar.a());
    }
}
