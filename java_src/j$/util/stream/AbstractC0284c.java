package j$.util.stream;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0284c extends D0 implements InterfaceC0309h {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f9987s = 0;

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0284c f9988h;

    /* renamed from: i  reason: collision with root package name */
    private final AbstractC0284c f9989i;

    /* renamed from: j  reason: collision with root package name */
    protected final int f9990j;

    /* renamed from: k  reason: collision with root package name */
    private AbstractC0284c f9991k;

    /* renamed from: l  reason: collision with root package name */
    private int f9992l;

    /* renamed from: m  reason: collision with root package name */
    private int f9993m;

    /* renamed from: n  reason: collision with root package name */
    private j$.util.H f9994n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9995o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9996p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f9997q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9998r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0284c(j$.util.H h10, int i10, boolean z10) {
        this.f9989i = null;
        this.f9994n = h10;
        this.f9988h = this;
        int i11 = EnumC0298e3.f10017g & i10;
        this.f9990j = i11;
        this.f9993m = (~(i11 << 1)) & EnumC0298e3.f10022l;
        this.f9992l = 0;
        this.f9998r = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0284c(AbstractC0284c abstractC0284c, int i10) {
        if (abstractC0284c.f9995o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0284c.f9995o = true;
        abstractC0284c.f9991k = this;
        this.f9989i = abstractC0284c;
        this.f9990j = EnumC0298e3.f10018h & i10;
        this.f9993m = EnumC0298e3.a(i10, abstractC0284c.f9993m);
        AbstractC0284c abstractC0284c2 = abstractC0284c.f9988h;
        this.f9988h = abstractC0284c2;
        if (U0()) {
            abstractC0284c2.f9996p = true;
        }
        this.f9992l = abstractC0284c.f9992l + 1;
    }

    private j$.util.H W0(int i10) {
        int i11;
        int i12;
        AbstractC0284c abstractC0284c = this.f9988h;
        j$.util.H h10 = abstractC0284c.f9994n;
        if (h10 != null) {
            abstractC0284c.f9994n = null;
            if (abstractC0284c.f9998r && abstractC0284c.f9996p) {
                AbstractC0284c abstractC0284c2 = abstractC0284c.f9991k;
                int i13 = 1;
                while (abstractC0284c != this) {
                    int i14 = abstractC0284c2.f9990j;
                    if (abstractC0284c2.U0()) {
                        i13 = 0;
                        if (EnumC0298e3.SHORT_CIRCUIT.g(i14)) {
                            i14 &= ~EnumC0298e3.f10031u;
                        }
                        h10 = abstractC0284c2.T0(abstractC0284c, h10);
                        if (h10.hasCharacteristics(64)) {
                            i11 = i14 & (~EnumC0298e3.f10030t);
                            i12 = EnumC0298e3.f10029s;
                        } else {
                            i11 = i14 & (~EnumC0298e3.f10029s);
                            i12 = EnumC0298e3.f10030t;
                        }
                        i14 = i11 | i12;
                    }
                    abstractC0284c2.f9992l = i13;
                    abstractC0284c2.f9993m = EnumC0298e3.a(i14, abstractC0284c.f9993m);
                    i13++;
                    AbstractC0284c abstractC0284c3 = abstractC0284c2;
                    abstractC0284c2 = abstractC0284c2.f9991k;
                    abstractC0284c = abstractC0284c3;
                }
            }
            if (i10 != 0) {
                this.f9993m = EnumC0298e3.a(i10, this.f9993m);
            }
            return h10;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final InterfaceC0356q2 I0(InterfaceC0356q2 interfaceC0356q2, j$.util.H h10) {
        Objects.requireNonNull(interfaceC0356q2);
        e0(J0(interfaceC0356q2), h10);
        return interfaceC0356q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final InterfaceC0356q2 J0(InterfaceC0356q2 interfaceC0356q2) {
        Objects.requireNonNull(interfaceC0356q2);
        for (AbstractC0284c abstractC0284c = this; abstractC0284c.f9992l > 0; abstractC0284c = abstractC0284c.f9989i) {
            interfaceC0356q2 = abstractC0284c.V0(abstractC0284c.f9989i.f9993m, interfaceC0356q2);
        }
        return interfaceC0356q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final j$.util.H K0(j$.util.H h10) {
        return this.f9992l == 0 ? h10 : Y0(this, new C0279b(h10, 0), this.f9988h.f9998r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object L0(L3 l32) {
        if (this.f9995o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f9995o = true;
        return this.f9988h.f9998r ? l32.f(this, W0(l32.a())) : l32.g(this, W0(l32.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final P0 M0(j$.util.function.n nVar) {
        if (this.f9995o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f9995o = true;
        if (this.f9988h.f9998r && this.f9989i != null && U0()) {
            this.f9992l = 0;
            AbstractC0284c abstractC0284c = this.f9989i;
            return S0(abstractC0284c, abstractC0284c.W0(0), nVar);
        }
        return j0(W0(0), true, nVar);
    }

    abstract P0 N0(D0 d02, j$.util.H h10, boolean z10, j$.util.function.n nVar);

    abstract void O0(j$.util.H h10, InterfaceC0356q2 interfaceC0356q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int P0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q0() {
        return EnumC0298e3.ORDERED.g(this.f9993m);
    }

    public /* synthetic */ j$.util.H R0() {
        return W0(0);
    }

    P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    j$.util.H T0(D0 d02, j$.util.H h10) {
        return S0(d02, h10, C0274a.f9952a).spliterator();
    }

    abstract boolean U0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.util.H X0() {
        AbstractC0284c abstractC0284c = this.f9988h;
        if (this == abstractC0284c) {
            if (this.f9995o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f9995o = true;
            j$.util.H h10 = abstractC0284c.f9994n;
            if (h10 != null) {
                abstractC0284c.f9994n = null;
                return h10;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException();
    }

    abstract j$.util.H Y0(D0 d02, j$.util.function.A a10, boolean z10);

    @Override // j$.util.stream.InterfaceC0309h, java.lang.AutoCloseable
    public void close() {
        this.f9995o = true;
        this.f9994n = null;
        AbstractC0284c abstractC0284c = this.f9988h;
        Runnable runnable = abstractC0284c.f9997q;
        if (runnable != null) {
            abstractC0284c.f9997q = null;
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final void e0(InterfaceC0356q2 interfaceC0356q2, j$.util.H h10) {
        Objects.requireNonNull(interfaceC0356q2);
        if (EnumC0298e3.SHORT_CIRCUIT.g(this.f9993m)) {
            f0(interfaceC0356q2, h10);
            return;
        }
        interfaceC0356q2.j(h10.getExactSizeIfKnown());
        h10.forEachRemaining(interfaceC0356q2);
        interfaceC0356q2.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final void f0(InterfaceC0356q2 interfaceC0356q2, j$.util.H h10) {
        AbstractC0284c abstractC0284c = this;
        while (abstractC0284c.f9992l > 0) {
            abstractC0284c = abstractC0284c.f9989i;
        }
        interfaceC0356q2.j(h10.getExactSizeIfKnown());
        abstractC0284c.O0(h10, interfaceC0356q2);
        interfaceC0356q2.h();
    }

    @Override // j$.util.stream.InterfaceC0309h
    public final boolean isParallel() {
        return this.f9988h.f9998r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final P0 j0(j$.util.H h10, boolean z10, j$.util.function.n nVar) {
        if (this.f9988h.f9998r) {
            return N0(this, h10, z10, nVar);
        }
        H0 C0 = C0(k0(h10), nVar);
        Objects.requireNonNull(C0);
        e0(J0(C0), h10);
        return C0.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final long k0(j$.util.H h10) {
        if (EnumC0298e3.SIZED.g(this.f9993m)) {
            return h10.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.InterfaceC0309h
    public InterfaceC0309h onClose(Runnable runnable) {
        AbstractC0284c abstractC0284c = this.f9988h;
        Runnable runnable2 = abstractC0284c.f9997q;
        if (runnable2 != null) {
            runnable = new K3(runnable2, runnable);
        }
        abstractC0284c.f9997q = runnable;
        return this;
    }

    public final InterfaceC0309h parallel() {
        this.f9988h.f9998r = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final int q0() {
        AbstractC0284c abstractC0284c = this;
        while (abstractC0284c.f9992l > 0) {
            abstractC0284c = abstractC0284c.f9989i;
        }
        return abstractC0284c.P0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.D0
    public final int r0() {
        return this.f9993m;
    }

    public final InterfaceC0309h sequential() {
        this.f9988h.f9998r = false;
        return this;
    }

    public j$.util.H spliterator() {
        if (this.f9995o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f9995o = true;
        AbstractC0284c abstractC0284c = this.f9988h;
        if (this == abstractC0284c) {
            j$.util.H h10 = abstractC0284c.f9994n;
            if (h10 != null) {
                abstractC0284c.f9994n = null;
                return h10;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return Y0(this, new C0279b(this, 1), abstractC0284c.f9998r);
    }
}
