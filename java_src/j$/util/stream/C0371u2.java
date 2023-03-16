package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0371u2 extends AbstractC0310h0 {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f10151w = 0;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ long f10152u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ long f10153v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371u2(AbstractC0284c abstractC0284c, int i10, int i11, long j10, long j11) {
        super(abstractC0284c, i10, i11);
        this.f10152u = j10;
        this.f10153v = j11;
    }

    @Override // j$.util.stream.AbstractC0284c
    P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        long k02 = d02.k0(h10);
        if (k02 > 0 && h10.hasCharacteristics(16384)) {
            return D0.b0(d02, D0.S(d02.q0(), h10, this.f10152u, this.f10153v), true);
        }
        return !EnumC0298e3.ORDERED.g(d02.r0()) ? D0.b0(this, g1((j$.util.B) d02.K0(h10), this.f10152u, this.f10153v, k02), true) : (P0) new A2(this, d02, h10, nVar, this.f10152u, this.f10153v).invoke();
    }

    @Override // j$.util.stream.AbstractC0284c
    j$.util.H T0(D0 d02, j$.util.H h10) {
        long Y;
        long k02 = d02.k0(h10);
        if (k02 > 0 && h10.hasCharacteristics(16384)) {
            j$.util.B b10 = (j$.util.B) d02.K0(h10);
            long j10 = this.f10152u;
            Y = D0.Y(j10, this.f10153v);
            return new w3(b10, j10, Y);
        }
        return !EnumC0298e3.ORDERED.g(d02.r0()) ? g1((j$.util.B) d02.K0(h10), this.f10152u, this.f10153v, k02) : ((P0) new A2(this, d02, h10, K.f9841c, this.f10152u, this.f10153v).invoke()).spliterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        return new C0367t2(this, interfaceC0356q2);
    }

    j$.util.B g1(j$.util.B b10, long j10, long j11, long j12) {
        long j13;
        long j14 = 0;
        if (j10 <= j12) {
            j13 = j11 >= 0 ? Math.min(j11, j12 - j10) : j12 - j10;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new D3(b10, j14, j13);
    }
}
