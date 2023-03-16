package u4;
/* loaded from: classes.dex */
final class e0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f15417a = this;

    /* renamed from: b  reason: collision with root package name */
    private final v4.g f15418b;

    /* renamed from: c  reason: collision with root package name */
    private final v4.g f15419c;

    /* renamed from: d  reason: collision with root package name */
    private final v4.g f15420d;

    /* renamed from: e  reason: collision with root package name */
    private final v4.g f15421e;

    /* renamed from: f  reason: collision with root package name */
    private final v4.g f15422f;

    /* renamed from: g  reason: collision with root package name */
    private final v4.g f15423g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e0(n nVar, d0 d0Var) {
        p pVar = new p(nVar);
        this.f15418b = pVar;
        v4.g b10 = v4.e.b(new z(pVar));
        this.f15419c = b10;
        v4.g b11 = v4.e.b(new x(pVar, b10));
        this.f15420d = b11;
        v4.g b12 = v4.e.b(new j(pVar));
        this.f15421e = b12;
        v4.g b13 = v4.e.b(new m(b11, b12, pVar));
        this.f15422f = b13;
        this.f15423g = v4.e.b(new o(b13));
    }

    @Override // u4.e
    public final b a() {
        return (b) this.f15423g.a();
    }
}
