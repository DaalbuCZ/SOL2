package y0;
/* loaded from: classes.dex */
public abstract class v1 implements e1 {

    /* renamed from: n  reason: collision with root package name */
    private final boolean f16727n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f16728o;

    /* renamed from: p  reason: collision with root package name */
    private q1 f16729p;

    public v1(q1 q1Var, boolean z10, boolean z11) {
        this.f16729p = q1Var;
        this.f16727n = z10;
        this.f16728o = z11;
    }

    @Override // y0.e1
    public void a() {
        this.f16729p = null;
    }

    public void c(String str) {
        if (e()) {
            i0.a("Interaction", str);
        }
        if (this.f16728o) {
            d().l("Interaction", str);
        }
    }

    public q1 d() {
        return this.f16729p;
    }

    public boolean e() {
        return this.f16727n;
    }
}
