package y0;
/* loaded from: classes.dex */
public class q3 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final f2 f16684n;

    /* renamed from: o  reason: collision with root package name */
    private final c3 f16685o;

    /* renamed from: p  reason: collision with root package name */
    private final j3<String> f16686p;

    /* renamed from: q  reason: collision with root package name */
    private final h2<k3> f16687q;

    /* renamed from: r  reason: collision with root package name */
    private final s2 f16688r;

    public q3(f2 f2Var, c3 c3Var, j3<String> j3Var, h2<k3> h2Var, s2 s2Var) {
        this.f16684n = f2Var;
        this.f16685o = c3Var;
        this.f16686p = j3Var;
        this.f16687q = h2Var;
        this.f16688r = s2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k3 b10 = this.f16684n.b(this.f16685o.a(), this.f16685o, this.f16686p.a(true));
            this.f16688r.k(b10);
            h2<k3> h2Var = this.f16687q;
            if (h2Var != null) {
                h2Var.a(b10);
            }
        } catch (v0 e10) {
            h2<k3> h2Var2 = this.f16687q;
            if (h2Var2 != null) {
                h2Var2.b(e10);
            }
        }
    }
}
