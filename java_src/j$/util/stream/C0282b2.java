package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0282b2 extends AbstractC0299f {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0277a2 f9985h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0282b2(AbstractC0277a2 abstractC0277a2, D0 d02, j$.util.H h10) {
        super(d02, h10);
        this.f9985h = abstractC0277a2;
    }

    C0282b2(C0282b2 c0282b2, j$.util.H h10) {
        super(c0282b2, h10);
        this.f9985h = c0282b2.f9985h;
    }

    @Override // j$.util.stream.AbstractC0299f
    protected Object a() {
        D0 d02 = this.f10039a;
        Y1 b10 = this.f9985h.b();
        d02.I0(b10, this.f10040b);
        return b10;
    }

    @Override // j$.util.stream.AbstractC0299f
    protected AbstractC0299f f(j$.util.H h10) {
        return new C0282b2(this, h10);
    }

    @Override // j$.util.stream.AbstractC0299f, java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            Y1 y12 = (Y1) ((C0282b2) this.f10042d).b();
            y12.q((Y1) ((C0282b2) this.f10043e).b());
            g(y12);
        }
        this.f10040b = null;
        this.f10043e = null;
        this.f10042d = null;
    }
}
