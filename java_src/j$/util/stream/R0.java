package j$.util.stream;
/* loaded from: classes2.dex */
abstract class R0 implements P0 {

    /* renamed from: a  reason: collision with root package name */
    protected final P0 f9889a;

    /* renamed from: b  reason: collision with root package name */
    protected final P0 f9890b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9891c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R0(P0 p02, P0 p03) {
        this.f9889a = p02;
        this.f9890b = p03;
        this.f9891c = p02.count() + p03.count();
    }

    @Override // j$.util.stream.P0
    public long count() {
        return this.f9891c;
    }

    @Override // j$.util.stream.P0
    public /* bridge */ /* synthetic */ O0 f(int i10) {
        return (O0) f(i10);
    }

    @Override // j$.util.stream.P0
    public P0 f(int i10) {
        if (i10 == 0) {
            return this.f9889a;
        }
        if (i10 == 1) {
            return this.f9890b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public int n() {
        return 2;
    }
}
