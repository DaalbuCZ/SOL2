package m1;

import java.util.concurrent.Executor;
import n1.y;
/* loaded from: classes.dex */
public final class d implements i1.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Executor> f11317a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<h1.e> f11318b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<y> f11319c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<o1.d> f11320d;

    /* renamed from: e  reason: collision with root package name */
    private final x8.a<p1.b> f11321e;

    public d(x8.a<Executor> aVar, x8.a<h1.e> aVar2, x8.a<y> aVar3, x8.a<o1.d> aVar4, x8.a<p1.b> aVar5) {
        this.f11317a = aVar;
        this.f11318b = aVar2;
        this.f11319c = aVar3;
        this.f11320d = aVar4;
        this.f11321e = aVar5;
    }

    public static d a(x8.a<Executor> aVar, x8.a<h1.e> aVar2, x8.a<y> aVar3, x8.a<o1.d> aVar4, x8.a<p1.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, h1.e eVar, y yVar, o1.d dVar, p1.b bVar) {
        return new c(executor, eVar, yVar, dVar, bVar);
    }

    @Override // x8.a
    /* renamed from: b */
    public c get() {
        return c(this.f11317a.get(), this.f11318b.get(), this.f11319c.get(), this.f11320d.get(), this.f11321e.get());
    }
}
