package g1;
/* loaded from: classes.dex */
public final class a implements c6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c6.a f7369a = new a();

    /* renamed from: g1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0110a implements b6.d<j1.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0110a f7370a = new C0110a();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7371b = b6.c.a("window").b(e6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b6.c f7372c = b6.c.a("logSourceMetrics").b(e6.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final b6.c f7373d = b6.c.a("globalMetrics").b(e6.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final b6.c f7374e = b6.c.a("appNamespace").b(e6.a.b().c(4).a()).a();

        private C0110a() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(j1.a aVar, b6.e eVar) {
            eVar.f(f7371b, aVar.d());
            eVar.f(f7372c, aVar.c());
            eVar.f(f7373d, aVar.b());
            eVar.f(f7374e, aVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements b6.d<j1.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f7375a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7376b = b6.c.a("storageMetrics").b(e6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(j1.b bVar, b6.e eVar) {
            eVar.f(f7376b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements b6.d<j1.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f7377a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7378b = b6.c.a("eventsDroppedCount").b(e6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b6.c f7379c = b6.c.a("reason").b(e6.a.b().c(3).a()).a();

        private c() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(j1.c cVar, b6.e eVar) {
            eVar.b(f7378b, cVar.a());
            eVar.f(f7379c, cVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements b6.d<j1.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f7380a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7381b = b6.c.a("logSource").b(e6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b6.c f7382c = b6.c.a("logEventDropped").b(e6.a.b().c(2).a()).a();

        private d() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(j1.d dVar, b6.e eVar) {
            eVar.f(f7381b, dVar.b());
            eVar.f(f7382c, dVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements b6.d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f7383a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7384b = b6.c.d("clientMetrics");

        private e() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(m mVar, b6.e eVar) {
            eVar.f(f7384b, mVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements b6.d<j1.e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f7385a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7386b = b6.c.a("currentCacheSizeBytes").b(e6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b6.c f7387c = b6.c.a("maxCacheSizeBytes").b(e6.a.b().c(2).a()).a();

        private f() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(j1.e eVar, b6.e eVar2) {
            eVar2.b(f7386b, eVar.a());
            eVar2.b(f7387c, eVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements b6.d<j1.f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f7388a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f7389b = b6.c.a("startMs").b(e6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b6.c f7390c = b6.c.a("endMs").b(e6.a.b().c(2).a()).a();

        private g() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(j1.f fVar, b6.e eVar) {
            eVar.b(f7389b, fVar.b());
            eVar.b(f7390c, fVar.a());
        }
    }

    private a() {
    }

    @Override // c6.a
    public void a(c6.b<?> bVar) {
        bVar.a(m.class, e.f7383a);
        bVar.a(j1.a.class, C0110a.f7370a);
        bVar.a(j1.f.class, g.f7388a);
        bVar.a(j1.d.class, d.f7380a);
        bVar.a(j1.c.class, c.f7377a);
        bVar.a(j1.b.class, b.f7375a);
        bVar.a(j1.e.class, f.f7385a);
    }
}
