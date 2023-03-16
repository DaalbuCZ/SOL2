package m1;

import android.content.Context;
import n1.y;
/* loaded from: classes.dex */
public final class i implements i1.b<y> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Context> f11323a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<o1.d> f11324b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<n1.g> f11325c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<q1.a> f11326d;

    public i(x8.a<Context> aVar, x8.a<o1.d> aVar2, x8.a<n1.g> aVar3, x8.a<q1.a> aVar4) {
        this.f11323a = aVar;
        this.f11324b = aVar2;
        this.f11325c = aVar3;
        this.f11326d = aVar4;
    }

    public static i a(x8.a<Context> aVar, x8.a<o1.d> aVar2, x8.a<n1.g> aVar3, x8.a<q1.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y c(Context context, o1.d dVar, n1.g gVar, q1.a aVar) {
        return (y) i1.d.c(h.a(context, dVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public y get() {
        return c(this.f11323a.get(), this.f11324b.get(), this.f11325c.get(), this.f11326d.get());
    }
}
