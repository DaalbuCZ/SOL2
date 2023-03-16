package j$.util.stream;
/* loaded from: classes2.dex */
final class A2 extends AbstractC0289d {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC0284c f9771j;

    /* renamed from: k  reason: collision with root package name */
    private final j$.util.function.n f9772k;

    /* renamed from: l  reason: collision with root package name */
    private final long f9773l;

    /* renamed from: m  reason: collision with root package name */
    private final long f9774m;

    /* renamed from: n  reason: collision with root package name */
    private long f9775n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f9776o;

    A2(A2 a22, j$.util.H h10) {
        super(a22, h10);
        this.f9771j = a22.f9771j;
        this.f9772k = a22.f9772k;
        this.f9773l = a22.f9773l;
        this.f9774m = a22.f9774m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC0284c abstractC0284c, D0 d02, j$.util.H h10, j$.util.function.n nVar, long j10, long j11) {
        super(d02, h10);
        this.f9771j = abstractC0284c;
        this.f9772k = nVar;
        this.f9773l = j10;
        this.f9774m = j11;
    }

    private long m(long j10) {
        if (this.f9776o) {
            return this.f9775n;
        }
        A2 a22 = (A2) this.f10042d;
        A2 a23 = (A2) this.f10043e;
        if (a22 == null || a23 == null) {
            return this.f9775n;
        }
        long m10 = a22.m(j10);
        return m10 >= j10 ? m10 : m10 + a23.m(j10);
    }

    @Override // j$.util.stream.AbstractC0299f
    protected Object a() {
        if (e()) {
            H0 C0 = this.f9771j.C0(EnumC0298e3.SIZED.h(this.f9771j.f9990j) ? this.f9771j.k0(this.f10040b) : -1L, this.f9772k);
            InterfaceC0356q2 V0 = this.f9771j.V0(this.f10039a.r0(), C0);
            D0 d02 = this.f10039a;
            d02.f0(d02.J0(V0), this.f10040b);
            return C0.b();
        }
        D0 d03 = this.f10039a;
        H0 C02 = d03.C0(-1L, this.f9772k);
        d03.I0(C02, this.f10040b);
        P0 b10 = C02.b();
        this.f9775n = b10.count();
        this.f9776o = true;
        this.f10040b = null;
        return b10;
    }

    @Override // j$.util.stream.AbstractC0299f
    protected AbstractC0299f f(j$.util.H h10) {
        return new A2(this, h10);
    }

    @Override // j$.util.stream.AbstractC0289d
    protected void i() {
        this.f10005i = true;
        if (this.f9776o) {
            g(k());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0289d
    /* renamed from: n */
    public final P0 k() {
        return D0.i0(this.f9771j.P0());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    @Override // j$.util.stream.AbstractC0299f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
