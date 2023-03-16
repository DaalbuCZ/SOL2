package j$.util.stream;

import j$.util.function.InterfaceC0260c;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class V0 extends AbstractC0299f {

    /* renamed from: h  reason: collision with root package name */
    protected final D0 f9920h;

    /* renamed from: i  reason: collision with root package name */
    protected final j$.util.function.s f9921i;

    /* renamed from: j  reason: collision with root package name */
    protected final InterfaceC0260c f9922j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V0(D0 d02, j$.util.H h10, j$.util.function.s sVar, InterfaceC0260c interfaceC0260c) {
        super(d02, h10);
        this.f9920h = d02;
        this.f9921i = sVar;
        this.f9922j = interfaceC0260c;
    }

    V0(V0 v02, j$.util.H h10) {
        super(v02, h10);
        this.f9920h = v02.f9920h;
        this.f9921i = v02.f9921i;
        this.f9922j = v02.f9922j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public Object a() {
        H0 h02 = (H0) this.f9921i.v(this.f9920h.k0(this.f10040b));
        this.f9920h.I0(h02, this.f10040b);
        return h02.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public AbstractC0299f f(j$.util.H h10) {
        return new V0(this, h10);
    }

    @Override // j$.util.stream.AbstractC0299f, java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            g((P0) this.f9922j.s((P0) ((V0) this.f10042d).b(), (P0) ((V0) this.f10043e).b()));
        }
        this.f10040b = null;
        this.f10043e = null;
        this.f10042d = null;
    }
}
