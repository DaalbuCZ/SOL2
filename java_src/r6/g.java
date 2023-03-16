package r6;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
/* loaded from: classes.dex */
public final class g implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final x8.a<f5.e> f13080a;

    /* renamed from: b  reason: collision with root package name */
    private final x8.a<i6.b<com.google.firebase.remoteconfig.c>> f13081b;

    /* renamed from: c  reason: collision with root package name */
    private final x8.a<j6.e> f13082c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.a<i6.b<e1.g>> f13083d;

    /* renamed from: e  reason: collision with root package name */
    private final x8.a<RemoteConfigManager> f13084e;

    /* renamed from: f  reason: collision with root package name */
    private final x8.a<com.google.firebase.perf.config.a> f13085f;

    /* renamed from: g  reason: collision with root package name */
    private final x8.a<SessionManager> f13086g;

    public g(x8.a<f5.e> aVar, x8.a<i6.b<com.google.firebase.remoteconfig.c>> aVar2, x8.a<j6.e> aVar3, x8.a<i6.b<e1.g>> aVar4, x8.a<RemoteConfigManager> aVar5, x8.a<com.google.firebase.perf.config.a> aVar6, x8.a<SessionManager> aVar7) {
        this.f13080a = aVar;
        this.f13081b = aVar2;
        this.f13082c = aVar3;
        this.f13083d = aVar4;
        this.f13084e = aVar5;
        this.f13085f = aVar6;
        this.f13086g = aVar7;
    }

    public static g a(x8.a<f5.e> aVar, x8.a<i6.b<com.google.firebase.remoteconfig.c>> aVar2, x8.a<j6.e> aVar3, x8.a<i6.b<e1.g>> aVar4, x8.a<RemoteConfigManager> aVar5, x8.a<com.google.firebase.perf.config.a> aVar6, x8.a<SessionManager> aVar7) {
        return new g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static e c(f5.e eVar, i6.b<com.google.firebase.remoteconfig.c> bVar, j6.e eVar2, i6.b<e1.g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new e(eVar, bVar, eVar2, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // x8.a
    /* renamed from: b */
    public e get() {
        return c(this.f13080a.get(), this.f13081b.get(), this.f13082c.get(), this.f13083d.get(), this.f13084e.get(), this.f13085f.get(), this.f13086g.get());
    }
}
