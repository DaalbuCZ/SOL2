package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0379w2 extends AbstractC0354q0 {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f10167w = 0;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ long f10168u;

    /* renamed from: v  reason: collision with root package name */
    final /* synthetic */ long f10169v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379w2(AbstractC0284c abstractC0284c, int i10, int i11, long j10, long j11) {
        super(abstractC0284c, i10, i11);
        this.f10168u = j10;
        this.f10169v = j11;
    }

    @Override // j$.util.stream.AbstractC0284c
    P0 S0(D0 d02, j$.util.H h10, j$.util.function.n nVar) {
        long k02 = d02.k0(h10);
        if (k02 > 0 && h10.hasCharacteristics(16384)) {
            return D0.c0(d02, D0.S(d02.q0(), h10, this.f10168u, this.f10169v), true);
        }
        return !EnumC0298e3.ORDERED.g(d02.r0()) ? D0.c0(this, g1((j$.util.D) d02.K0(h10), this.f10168u, this.f10169v, k02), true) : (P0) new A2(this, d02, h10, nVar, this.f10168u, this.f10169v).invoke();
    }

    @Override // j$.util.stream.AbstractC0284c
    j$.util.H T0(D0 d02, j$.util.H h10) {
        long Y;
        long k02 = d02.k0(h10);
        if (k02 > 0 && h10.hasCharacteristics(16384)) {
            j$.util.D d10 = (j$.util.D) d02.K0(h10);
            long j10 = this.f10168u;
            Y = D0.Y(j10, this.f10169v);
            return new y3(d10, j10, Y);
        }
        return !EnumC0298e3.ORDERED.g(d02.r0()) ? g1((j$.util.D) d02.K0(h10), this.f10168u, this.f10169v, k02) : ((P0) new A2(this, d02, h10, L.f9849b, this.f10168u, this.f10169v).invoke()).spliterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0284c
    public InterfaceC0356q2 V0(int i10, InterfaceC0356q2 interfaceC0356q2) {
        return new C0375v2(this, interfaceC0356q2);
    }

    j$.util.D g1(j$.util.D d10, long j10, long j11, long j12) {
        long j13;
        long j14 = 0;
        if (j10 <= j12) {
            j13 = j11 >= 0 ? Math.min(j11, j12 - j10) : j12 - j10;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new E3(d10, j14, j13);
    }
}
