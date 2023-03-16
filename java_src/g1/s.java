package g1;
/* loaded from: classes.dex */
final class s<T> implements e1.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p f7443a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7444b;

    /* renamed from: c  reason: collision with root package name */
    private final e1.b f7445c;

    /* renamed from: d  reason: collision with root package name */
    private final e1.e<T, byte[]> f7446d;

    /* renamed from: e  reason: collision with root package name */
    private final t f7447e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar, String str, e1.b bVar, e1.e<T, byte[]> eVar, t tVar) {
        this.f7443a = pVar;
        this.f7444b = str;
        this.f7445c = bVar;
        this.f7446d = eVar;
        this.f7447e = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }

    @Override // e1.f
    public void a(e1.c<T> cVar, e1.h hVar) {
        this.f7447e.a(o.a().e(this.f7443a).c(cVar).f(this.f7444b).d(this.f7446d).b(this.f7445c).a(), hVar);
    }

    @Override // e1.f
    public void b(e1.c<T> cVar) {
        a(cVar, r.f7442a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p d() {
        return this.f7443a;
    }
}
