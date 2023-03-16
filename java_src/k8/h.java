package k8;

import l8.k;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final l8.k f10715a;

    /* renamed from: b  reason: collision with root package name */
    private final k.c f10716b;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // l8.k.c
        public void onMethodCall(l8.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public h(y7.a aVar) {
        a aVar2 = new a();
        this.f10716b = aVar2;
        l8.k kVar = new l8.k(aVar, "flutter/navigation", l8.g.f11210a);
        this.f10715a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        x7.b.f("NavigationChannel", "Sending message to pop route.");
        this.f10715a.c("popRoute", null);
    }

    public void b(String str) {
        x7.b.f("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f10715a.c("pushRoute", str);
    }

    public void c(String str) {
        x7.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f10715a.c("setInitialRoute", str);
    }
}
