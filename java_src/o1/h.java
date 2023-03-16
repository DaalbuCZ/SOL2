package o1;

import android.content.Context;
/* loaded from: classes.dex */
public final class h implements i1.b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Context> f11846a;

    public h(x8.a<Context> aVar) {
        this.f11846a = aVar;
    }

    public static h a(x8.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) i1.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public String get() {
        return c(this.f11846a.get());
    }
}
