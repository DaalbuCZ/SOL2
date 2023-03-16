package g1;
/* loaded from: classes.dex */
public final class w implements i1.b<u> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<q1.a> f7453a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<q1.a> f7454b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<m1.e> f7455c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<n1.s> f7456d;

    /* renamed from: e  reason: collision with root package name */
    private final x8.a<n1.w> f7457e;

    public w(x8.a<q1.a> aVar, x8.a<q1.a> aVar2, x8.a<m1.e> aVar3, x8.a<n1.s> aVar4, x8.a<n1.w> aVar5) {
        this.f7453a = aVar;
        this.f7454b = aVar2;
        this.f7455c = aVar3;
        this.f7456d = aVar4;
        this.f7457e = aVar5;
    }

    public static w a(x8.a<q1.a> aVar, x8.a<q1.a> aVar2, x8.a<m1.e> aVar3, x8.a<n1.s> aVar4, x8.a<n1.w> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(q1.a aVar, q1.a aVar2, m1.e eVar, n1.s sVar, n1.w wVar) {
        return new u(aVar, aVar2, eVar, sVar, wVar);
    }

    @Override // x8.a
    /* renamed from: b */
    public u get() {
        return c(this.f7453a.get(), this.f7454b.get(), this.f7455c.get(), this.f7456d.get(), this.f7457e.get());
    }
}
