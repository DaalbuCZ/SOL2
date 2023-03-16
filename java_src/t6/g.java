package t6;

import com.google.firebase.perf.session.SessionManager;
/* loaded from: classes.dex */
public final class g implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14793a;

    public g(a aVar) {
        this.f14793a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) r7.b.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public SessionManager get() {
        return c(this.f14793a);
    }
}
