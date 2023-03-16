package n1;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class x implements i1.b<w> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Executor> f11557a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<o1.d> f11558b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<y> f11559c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<p1.b> f11560d;

    public x(x8.a<Executor> aVar, x8.a<o1.d> aVar2, x8.a<y> aVar3, x8.a<p1.b> aVar4) {
        this.f11557a = aVar;
        this.f11558b = aVar2;
        this.f11559c = aVar3;
        this.f11560d = aVar4;
    }

    public static x a(x8.a<Executor> aVar, x8.a<o1.d> aVar2, x8.a<y> aVar3, x8.a<p1.b> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w c(Executor executor, o1.d dVar, y yVar, p1.b bVar) {
        return new w(executor, dVar, yVar, bVar);
    }

    @Override // x8.a
    /* renamed from: b */
    public w get() {
        return c(this.f11557a.get(), this.f11558b.get(), this.f11559c.get(), this.f11560d.get());
    }
}
