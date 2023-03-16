package i0;

import i0.f;
import j9.l;
import k9.k;
/* loaded from: classes.dex */
final class g<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f8219b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8220c;

    /* renamed from: d  reason: collision with root package name */
    private final f.b f8221d;

    /* renamed from: e  reason: collision with root package name */
    private final e f8222e;

    public g(T t10, String str, f.b bVar, e eVar) {
        k.e(t10, "value");
        k.e(str, "tag");
        k.e(bVar, "verificationMode");
        k.e(eVar, "logger");
        this.f8219b = t10;
        this.f8220c = str;
        this.f8221d = bVar;
        this.f8222e = eVar;
    }

    @Override // i0.f
    public T a() {
        return this.f8219b;
    }

    @Override // i0.f
    public f<T> c(String str, l<? super T, Boolean> lVar) {
        k.e(str, "message");
        k.e(lVar, "condition");
        return lVar.c((T) this.f8219b).booleanValue() ? this : new d(this.f8219b, this.f8220c, str, this.f8222e, this.f8221d);
    }
}
