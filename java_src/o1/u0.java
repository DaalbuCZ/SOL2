package o1;

import android.content.Context;
/* loaded from: classes.dex */
public final class u0 implements i1.b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<Context> f11906a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<String> f11907b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<Integer> f11908c;

    public u0(x8.a<Context> aVar, x8.a<String> aVar2, x8.a<Integer> aVar3) {
        this.f11906a = aVar;
        this.f11907b = aVar2;
        this.f11908c = aVar3;
    }

    public static u0 a(x8.a<Context> aVar, x8.a<String> aVar2, x8.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // x8.a
    /* renamed from: b */
    public t0 get() {
        return c(this.f11906a.get(), this.f11907b.get(), this.f11908c.get().intValue());
    }
}
