package t6;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final f5.e f14784a;

    /* renamed from: b  reason: collision with root package name */
    private final j6.e f14785b;

    /* renamed from: c  reason: collision with root package name */
    private final i6.b<com.google.firebase.remoteconfig.c> f14786c;

    /* renamed from: d  reason: collision with root package name */
    private final i6.b<e1.g> f14787d;

    public a(f5.e eVar, j6.e eVar2, i6.b<com.google.firebase.remoteconfig.c> bVar, i6.b<e1.g> bVar2) {
        this.f14784a = eVar;
        this.f14785b = eVar2;
        this.f14786c = bVar;
        this.f14787d = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5.e b() {
        return this.f14784a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6.e c() {
        return this.f14785b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i6.b<com.google.firebase.remoteconfig.c> d() {
        return this.f14786c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i6.b<e1.g> g() {
        return this.f14787d;
    }
}
