package com.google.firebase.messaging;
/* loaded from: classes.dex */
public final class a implements c6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c6.a f5458a = new a();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0081a implements b6.d<p6.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0081a f5459a = new C0081a();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f5460b = b6.c.a("projectNumber").b(e6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final b6.c f5461c = b6.c.a("messageId").b(e6.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final b6.c f5462d = b6.c.a("instanceId").b(e6.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final b6.c f5463e = b6.c.a("messageType").b(e6.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final b6.c f5464f = b6.c.a("sdkPlatform").b(e6.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final b6.c f5465g = b6.c.a("packageName").b(e6.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final b6.c f5466h = b6.c.a("collapseKey").b(e6.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final b6.c f5467i = b6.c.a("priority").b(e6.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final b6.c f5468j = b6.c.a("ttl").b(e6.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final b6.c f5469k = b6.c.a("topic").b(e6.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final b6.c f5470l = b6.c.a("bulkId").b(e6.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final b6.c f5471m = b6.c.a("event").b(e6.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final b6.c f5472n = b6.c.a("analyticsLabel").b(e6.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final b6.c f5473o = b6.c.a("campaignId").b(e6.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final b6.c f5474p = b6.c.a("composerLabel").b(e6.a.b().c(15).a()).a();

        private C0081a() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(p6.a aVar, b6.e eVar) {
            eVar.b(f5460b, aVar.l());
            eVar.f(f5461c, aVar.h());
            eVar.f(f5462d, aVar.g());
            eVar.f(f5463e, aVar.i());
            eVar.f(f5464f, aVar.m());
            eVar.f(f5465g, aVar.j());
            eVar.f(f5466h, aVar.d());
            eVar.c(f5467i, aVar.k());
            eVar.c(f5468j, aVar.o());
            eVar.f(f5469k, aVar.n());
            eVar.b(f5470l, aVar.b());
            eVar.f(f5471m, aVar.f());
            eVar.f(f5472n, aVar.a());
            eVar.b(f5473o, aVar.c());
            eVar.f(f5474p, aVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements b6.d<p6.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f5475a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f5476b = b6.c.a("messagingClientEvent").b(e6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(p6.b bVar, b6.e eVar) {
            eVar.f(f5476b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements b6.d<k0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f5477a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final b6.c f5478b = b6.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // b6.d
        /* renamed from: b */
        public void a(k0 k0Var, b6.e eVar) {
            eVar.f(f5478b, k0Var.b());
        }
    }

    private a() {
    }

    @Override // c6.a
    public void a(c6.b<?> bVar) {
        bVar.a(k0.class, c.f5477a);
        bVar.a(p6.b.class, b.f5475a);
        bVar.a(p6.a.class, C0081a.f5459a);
    }
}
