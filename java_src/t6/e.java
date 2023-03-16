package t6;
/* loaded from: classes.dex */
public final class e implements x8.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14791a;

    public e(a aVar) {
        this.f14791a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static i6.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (i6.b) r7.b.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: b */
    public i6.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f14791a);
    }
}
