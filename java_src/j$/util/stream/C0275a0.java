package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0275a0 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private j$.util.H f9972a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0356q2 f9973b;

    /* renamed from: c  reason: collision with root package name */
    private final D0 f9974c;

    /* renamed from: d  reason: collision with root package name */
    private long f9975d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0275a0(D0 d02, j$.util.H h10, InterfaceC0356q2 interfaceC0356q2) {
        super(null);
        this.f9973b = interfaceC0356q2;
        this.f9974c = d02;
        this.f9972a = h10;
        this.f9975d = 0L;
    }

    C0275a0(C0275a0 c0275a0, j$.util.H h10) {
        super(c0275a0);
        this.f9972a = h10;
        this.f9973b = c0275a0.f9973b;
        this.f9975d = c0275a0.f9975d;
        this.f9974c = c0275a0.f9974c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.H trySplit;
        j$.util.H h10 = this.f9972a;
        long estimateSize = h10.estimateSize();
        long j10 = this.f9975d;
        if (j10 == 0) {
            j10 = AbstractC0299f.h(estimateSize);
            this.f9975d = j10;
        }
        boolean g10 = EnumC0298e3.SHORT_CIRCUIT.g(this.f9974c.r0());
        boolean z10 = false;
        InterfaceC0356q2 interfaceC0356q2 = this.f9973b;
        C0275a0 c0275a0 = this;
        while (true) {
            if (g10 && interfaceC0356q2.r()) {
                break;
            } else if (estimateSize <= j10 || (trySplit = h10.trySplit()) == null) {
                break;
            } else {
                C0275a0 c0275a02 = new C0275a0(c0275a0, trySplit);
                c0275a0.addToPendingCount(1);
                if (z10) {
                    h10 = trySplit;
                } else {
                    C0275a0 c0275a03 = c0275a0;
                    c0275a0 = c0275a02;
                    c0275a02 = c0275a03;
                }
                z10 = !z10;
                c0275a0.fork();
                c0275a0 = c0275a02;
                estimateSize = h10.estimateSize();
            }
        }
        c0275a0.f9974c.e0(interfaceC0356q2, h10);
        c0275a0.f9972a = null;
        c0275a0.propagateCompletion();
    }
}
