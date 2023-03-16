package s1;
/* loaded from: classes.dex */
public abstract class f implements y2, a3 {

    /* renamed from: n  reason: collision with root package name */
    private final int f13362n;

    /* renamed from: p  reason: collision with root package name */
    private b3 f13364p;

    /* renamed from: q  reason: collision with root package name */
    private int f13365q;

    /* renamed from: r  reason: collision with root package name */
    private t1.t1 f13366r;

    /* renamed from: s  reason: collision with root package name */
    private int f13367s;

    /* renamed from: t  reason: collision with root package name */
    private u2.n0 f13368t;

    /* renamed from: u  reason: collision with root package name */
    private m1[] f13369u;

    /* renamed from: v  reason: collision with root package name */
    private long f13370v;

    /* renamed from: w  reason: collision with root package name */
    private long f13371w;

    /* renamed from: y  reason: collision with root package name */
    private boolean f13373y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f13374z;

    /* renamed from: o  reason: collision with root package name */
    private final n1 f13363o = new n1();

    /* renamed from: x  reason: collision with root package name */
    private long f13372x = Long.MIN_VALUE;

    public f(int i10) {
        this.f13362n = i10;
    }

    private void R(long j10, boolean z10) {
        this.f13373y = false;
        this.f13371w = j10;
        this.f13372x = j10;
        L(j10, z10);
    }

    @Override // s1.y2
    public /* synthetic */ void A(float f10, float f11) {
        x2.a(this, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q B(Throwable th, m1 m1Var, int i10) {
        return C(th, m1Var, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q C(Throwable th, m1 m1Var, boolean z10, int i10) {
        int i11;
        if (m1Var != null && !this.f13374z) {
            this.f13374z = true;
            try {
                i11 = z2.f(a(m1Var));
            } catch (q unused) {
            } finally {
                this.f13374z = false;
            }
            return q.g(th, e(), F(), m1Var, i11, z10, i10);
        }
        i11 = 4;
        return q.g(th, e(), F(), m1Var, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b3 D() {
        return (b3) p3.a.e(this.f13364p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n1 E() {
        this.f13363o.a();
        return this.f13363o;
    }

    protected final int F() {
        return this.f13365q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final t1.t1 G() {
        return (t1.t1) p3.a.e(this.f13366r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m1[] H() {
        return (m1[]) p3.a.e(this.f13369u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean I() {
        return m() ? this.f13373y : ((u2.n0) p3.a.e(this.f13368t)).i();
    }

    protected abstract void J();

    protected void K(boolean z10, boolean z11) {
    }

    protected abstract void L(long j10, boolean z10);

    protected void M() {
    }

    protected void N() {
    }

    protected void O() {
    }

    protected abstract void P(m1[] m1VarArr, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int Q(n1 n1Var, v1.g gVar, int i10) {
        int e10 = ((u2.n0) p3.a.e(this.f13368t)).e(n1Var, gVar, i10);
        if (e10 == -4) {
            if (gVar.t()) {
                this.f13372x = Long.MIN_VALUE;
                return this.f13373y ? -4 : -3;
            }
            long j10 = gVar.f15538r + this.f13370v;
            gVar.f15538r = j10;
            this.f13372x = Math.max(this.f13372x, j10);
        } else if (e10 == -5) {
            m1 m1Var = (m1) p3.a.e(n1Var.f13638b);
            if (m1Var.C != Long.MAX_VALUE) {
                n1Var.f13638b = m1Var.b().i0(m1Var.C + this.f13370v).E();
            }
        }
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int S(long j10) {
        return ((u2.n0) p3.a.e(this.f13368t)).t(j10 - this.f13370v);
    }

    @Override // s1.y2
    public final void c() {
        p3.a.f(this.f13367s == 0);
        this.f13363o.a();
        M();
    }

    @Override // s1.y2
    public final int f() {
        return this.f13367s;
    }

    @Override // s1.y2
    public final void g() {
        p3.a.f(this.f13367s == 1);
        this.f13363o.a();
        this.f13367s = 0;
        this.f13368t = null;
        this.f13369u = null;
        this.f13373y = false;
        J();
    }

    @Override // s1.y2
    public final u2.n0 h() {
        return this.f13368t;
    }

    @Override // s1.y2, s1.a3
    public final int k() {
        return this.f13362n;
    }

    @Override // s1.y2
    public final void l(m1[] m1VarArr, u2.n0 n0Var, long j10, long j11) {
        p3.a.f(!this.f13373y);
        this.f13368t = n0Var;
        if (this.f13372x == Long.MIN_VALUE) {
            this.f13372x = j10;
        }
        this.f13369u = m1VarArr;
        this.f13370v = j11;
        P(m1VarArr, j10, j11);
    }

    @Override // s1.y2
    public final boolean m() {
        return this.f13372x == Long.MIN_VALUE;
    }

    public int n() {
        return 0;
    }

    @Override // s1.t2.b
    public void p(int i10, Object obj) {
    }

    @Override // s1.y2
    public final void q() {
        this.f13373y = true;
    }

    @Override // s1.y2
    public final void r(b3 b3Var, m1[] m1VarArr, u2.n0 n0Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        p3.a.f(this.f13367s == 0);
        this.f13364p = b3Var;
        this.f13367s = 1;
        K(z10, z11);
        l(m1VarArr, n0Var, j11, j12);
        R(j10, z10);
    }

    @Override // s1.y2
    public final void s() {
        ((u2.n0) p3.a.e(this.f13368t)).b();
    }

    @Override // s1.y2
    public final void start() {
        p3.a.f(this.f13367s == 1);
        this.f13367s = 2;
        N();
    }

    @Override // s1.y2
    public final void stop() {
        p3.a.f(this.f13367s == 2);
        this.f13367s = 1;
        O();
    }

    @Override // s1.y2
    public final long t() {
        return this.f13372x;
    }

    @Override // s1.y2
    public final void u(long j10) {
        R(j10, false);
    }

    @Override // s1.y2
    public final boolean v() {
        return this.f13373y;
    }

    @Override // s1.y2
    public final void w(int i10, t1.t1 t1Var) {
        this.f13365q = i10;
        this.f13366r = t1Var;
    }

    @Override // s1.y2
    public p3.t x() {
        return null;
    }

    @Override // s1.y2
    public final a3 y() {
        return this;
    }
}
