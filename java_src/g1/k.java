package g1;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k implements i1.b<Executor> {

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final k f7435a = new k();
    }

    public static k a() {
        return a.f7435a;
    }

    public static Executor b() {
        return (Executor) i1.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // x8.a
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
