package o1;
/* loaded from: classes.dex */
public final class n0 implements i1.b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<q1.a> f11870a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<q1.a> f11871b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<e> f11872c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<t0> f11873d;

    /* renamed from: e  reason: collision with root package name */
    private final x8.a<String> f11874e;

    public n0(x8.a<q1.a> aVar, x8.a<q1.a> aVar2, x8.a<e> aVar3, x8.a<t0> aVar4, x8.a<String> aVar5) {
        this.f11870a = aVar;
        this.f11871b = aVar2;
        this.f11872c = aVar3;
        this.f11873d = aVar4;
        this.f11874e = aVar5;
    }

    public static n0 a(x8.a<q1.a> aVar, x8.a<q1.a> aVar2, x8.a<e> aVar3, x8.a<t0> aVar4, x8.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(q1.a aVar, q1.a aVar2, Object obj, Object obj2, x8.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // x8.a
    /* renamed from: b */
    public m0 get() {
        return c(this.f11870a.get(), this.f11871b.get(), this.f11872c.get(), this.f11873d.get(), this.f11874e);
    }
}
