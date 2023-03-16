package t6;

import com.google.firebase.perf.config.RemoteConfigManager;
/* loaded from: classes.dex */
public final class f implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14792a;

    public f(a aVar) {
        this.f14792a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) r7.b.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public RemoteConfigManager get() {
        return c(this.f14792a);
    }
}
