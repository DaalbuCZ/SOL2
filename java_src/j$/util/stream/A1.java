package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class A1 extends CountedCompleter implements InterfaceC0356q2 {

    /* renamed from: a  reason: collision with root package name */
    protected final j$.util.H f9764a;

    /* renamed from: b  reason: collision with root package name */
    protected final D0 f9765b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f9766c;

    /* renamed from: d  reason: collision with root package name */
    protected long f9767d;

    /* renamed from: e  reason: collision with root package name */
    protected long f9768e;

    /* renamed from: f  reason: collision with root package name */
    protected int f9769f;

    /* renamed from: g  reason: collision with root package name */
    protected int f9770g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A1(j$.util.H h10, D0 d02, int i10) {
        this.f9764a = h10;
        this.f9765b = d02;
        this.f9766c = AbstractC0299f.h(h10.estimateSize());
        this.f9767d = 0L;
        this.f9768e = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A1(A1 a12, j$.util.H h10, long j10, long j11, int i10) {
        super(a12);
        this.f9764a = h10;
        this.f9765b = a12.f9765b;
        this.f9766c = a12.f9766c;
        this.f9767d = j10;
        this.f9768e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    abstract A1 a(j$.util.H h10, long j10, long j11);

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void c(double d10) {
        D0.A();
        throw null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.H trySplit;
        j$.util.H h10 = this.f9764a;
        A1 a12 = this;
        while (h10.estimateSize() > a12.f9766c && (trySplit = h10.trySplit()) != null) {
            a12.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            a12.a(trySplit, a12.f9767d, estimateSize).fork();
            a12 = a12.a(h10, a12.f9767d + estimateSize, a12.f9768e - estimateSize);
        }
        AbstractC0284c abstractC0284c = (AbstractC0284c) a12.f9765b;
        Objects.requireNonNull(abstractC0284c);
        abstractC0284c.e0(abstractC0284c.J0(a12), h10);
        a12.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void d(int i10) {
        D0.E();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void e(long j10) {
        D0.F();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ void h() {
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public void j(long j10) {
        long j11 = this.f9768e;
        if (j10 > j11) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.f9767d;
        this.f9769f = i10;
        this.f9770g = i10 + ((int) j11);
    }

    @Override // j$.util.stream.InterfaceC0356q2
    public /* synthetic */ boolean r() {
        return false;
    }
}
