package k8;

import l8.t;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final l8.a<String> f10706a;

    public e(y7.a aVar) {
        this.f10706a = new l8.a<>(aVar, "flutter/lifecycle", t.f11229b);
    }

    public void a() {
        x7.b.f("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f10706a.c("AppLifecycleState.detached");
    }

    public void b() {
        x7.b.f("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f10706a.c("AppLifecycleState.inactive");
    }

    public void c() {
        x7.b.f("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f10706a.c("AppLifecycleState.paused");
    }

    public void d() {
        x7.b.f("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f10706a.c("AppLifecycleState.resumed");
    }
}
