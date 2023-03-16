package h1;

import android.content.Context;
/* loaded from: classes.dex */
public final class j implements i1.b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Context> f7699a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<q1.a> f7700b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<q1.a> f7701c;

    public j(x8.a<Context> aVar, x8.a<q1.a> aVar2, x8.a<q1.a> aVar3) {
        this.f7699a = aVar;
        this.f7700b = aVar2;
        this.f7701c = aVar3;
    }

    public static j a(x8.a<Context> aVar, x8.a<q1.a> aVar2, x8.a<q1.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, q1.a aVar, q1.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // x8.a
    /* renamed from: b */
    public i get() {
        return c(this.f7699a.get(), this.f7700b.get(), this.f7701c.get());
    }
}
