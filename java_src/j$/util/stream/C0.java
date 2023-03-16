package j$.util.stream;
/* loaded from: classes2.dex */
final class C0 extends AbstractC0289d {

    /* renamed from: j  reason: collision with root package name */
    private final B0 f9787j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0(B0 b02, D0 d02, j$.util.H h10) {
        super(d02, h10);
        this.f9787j = b02;
    }

    C0(C0 c02, j$.util.H h10) {
        super(c02, h10);
        this.f9787j = c02.f9787j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public Object a() {
        boolean z10;
        D0 d02 = this.f10039a;
        AbstractC0389z0 abstractC0389z0 = (AbstractC0389z0) this.f9787j.f9780c.get();
        d02.I0(abstractC0389z0, this.f10040b);
        boolean z11 = abstractC0389z0.f10190b;
        z10 = this.f9787j.f9779b.f9763b;
        if (z11 == z10) {
            l(Boolean.valueOf(z11));
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public AbstractC0299f f(j$.util.H h10) {
        return new C0(this, h10);
    }

    @Override // j$.util.stream.AbstractC0289d
    protected Object k() {
        boolean z10;
        z10 = this.f9787j.f9779b.f9763b;
        return Boolean.valueOf(!z10);
    }
}
