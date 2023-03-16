package n1;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class t implements i1.b<s> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Context> f11542a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<h1.e> f11543b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<o1.d> f11544c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<y> f11545d;

    /* renamed from: e  reason: collision with root package name */
    private final x8.a<Executor> f11546e;

    /* renamed from: f  reason: collision with root package name */
    private final x8.a<p1.b> f11547f;

    /* renamed from: g  reason: collision with root package name */
    private final x8.a<q1.a> f11548g;

    /* renamed from: h  reason: collision with root package name */
    private final x8.a<q1.a> f11549h;

    /* renamed from: i  reason: collision with root package name */
    private final x8.a<o1.c> f11550i;

    public t(x8.a<Context> aVar, x8.a<h1.e> aVar2, x8.a<o1.d> aVar3, x8.a<y> aVar4, x8.a<Executor> aVar5, x8.a<p1.b> aVar6, x8.a<q1.a> aVar7, x8.a<q1.a> aVar8, x8.a<o1.c> aVar9) {
        this.f11542a = aVar;
        this.f11543b = aVar2;
        this.f11544c = aVar3;
        this.f11545d = aVar4;
        this.f11546e = aVar5;
        this.f11547f = aVar6;
        this.f11548g = aVar7;
        this.f11549h = aVar8;
        this.f11550i = aVar9;
    }

    public static t a(x8.a<Context> aVar, x8.a<h1.e> aVar2, x8.a<o1.d> aVar3, x8.a<y> aVar4, x8.a<Executor> aVar5, x8.a<p1.b> aVar6, x8.a<q1.a> aVar7, x8.a<q1.a> aVar8, x8.a<o1.c> aVar9) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static s c(Context context, h1.e eVar, o1.d dVar, y yVar, Executor executor, p1.b bVar, q1.a aVar, q1.a aVar2, o1.c cVar) {
        return new s(context, eVar, dVar, yVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // x8.a
    /* renamed from: b */
    public s get() {
        return c(this.f11542a.get(), this.f11543b.get(), this.f11544c.get(), this.f11545d.get(), this.f11546e.get(), this.f11547f.get(), this.f11548g.get(), this.f11549h.get(), this.f11550i.get());
    }
}
