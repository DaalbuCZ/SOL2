package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class Z extends CountedCompleter {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f9941h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final D0 f9942a;

    /* renamed from: b  reason: collision with root package name */
    private j$.util.H f9943b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9944c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f9945d;

    /* renamed from: e  reason: collision with root package name */
    private final InterfaceC0356q2 f9946e;

    /* renamed from: f  reason: collision with root package name */
    private final Z f9947f;

    /* renamed from: g  reason: collision with root package name */
    private P0 f9948g;

    /* JADX INFO: Access modifiers changed from: protected */
    public Z(D0 d02, j$.util.H h10, InterfaceC0356q2 interfaceC0356q2) {
        super(null);
        this.f9942a = d02;
        this.f9943b = h10;
        this.f9944c = AbstractC0299f.h(h10.estimateSize());
        this.f9945d = new ConcurrentHashMap(Math.max(16, AbstractC0299f.f10038g << 1));
        this.f9946e = interfaceC0356q2;
        this.f9947f = null;
    }

    Z(Z z10, j$.util.H h10, Z z11) {
        super(z10);
        this.f9942a = z10.f9942a;
        this.f9943b = h10;
        this.f9944c = z10.f9944c;
        this.f9945d = z10.f9945d;
        this.f9946e = z10.f9946e;
        this.f9947f = z11;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.H trySplit;
        j$.util.H h10 = this.f9943b;
        long j10 = this.f9944c;
        boolean z10 = false;
        Z z11 = this;
        while (h10.estimateSize() > j10 && (trySplit = h10.trySplit()) != null) {
            Z z12 = new Z(z11, trySplit, z11.f9947f);
            Z z13 = new Z(z11, h10, z12);
            z11.addToPendingCount(1);
            z13.addToPendingCount(1);
            z11.f9945d.put(z12, z13);
            if (z11.f9947f != null) {
                z12.addToPendingCount(1);
                if (z11.f9945d.replace(z11.f9947f, z11, z12)) {
                    z11.addToPendingCount(-1);
                } else {
                    z12.addToPendingCount(-1);
                }
            }
            if (z10) {
                h10 = trySplit;
                z11 = z12;
                z12 = z13;
            } else {
                z11 = z13;
            }
            z10 = !z10;
            z12.fork();
        }
        if (z11.getPendingCount() > 0) {
            C0329l c0329l = C0329l.f10087e;
            D0 d02 = z11.f9942a;
            H0 C0 = d02.C0(d02.k0(h10), c0329l);
            AbstractC0284c abstractC0284c = (AbstractC0284c) z11.f9942a;
            Objects.requireNonNull(abstractC0284c);
            Objects.requireNonNull(C0);
            abstractC0284c.e0(abstractC0284c.J0(C0), h10);
            z11.f9948g = C0.b();
            z11.f9943b = null;
        }
        z11.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        P0 p02 = this.f9948g;
        if (p02 != null) {
            p02.a(this.f9946e);
            this.f9948g = null;
        } else {
            j$.util.H h10 = this.f9943b;
            if (h10 != null) {
                this.f9942a.I0(this.f9946e, h10);
                this.f9943b = null;
            }
        }
        Z z10 = (Z) this.f9945d.remove(this);
        if (z10 != null) {
            z10.tryComplete();
        }
    }
}
