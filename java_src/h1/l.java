package h1;

import android.content.Context;
/* loaded from: classes.dex */
public final class l implements i1.b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Context> f7707a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<i> f7708b;

    public l(x8.a<Context> aVar, x8.a<i> aVar2) {
        this.f7707a = aVar;
        this.f7708b = aVar2;
    }

    public static l a(x8.a<Context> aVar, x8.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // x8.a
    /* renamed from: b */
    public k get() {
        return c(this.f7707a.get(), this.f7708b.get());
    }
}
