package t4;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class e0<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14727a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14728b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f14729c;

    public e0(Executor executor, h hVar, j0 j0Var) {
        this.f14727a = executor;
        this.f14728b = hVar;
        this.f14729c = j0Var;
    }

    @Override // t4.c
    public final void a() {
        this.f14729c.u();
    }

    @Override // t4.f
    public final void b(TContinuationResult tcontinuationresult) {
        this.f14729c.t(tcontinuationresult);
    }

    @Override // t4.e
    public final void c(Exception exc) {
        this.f14729c.s(exc);
    }

    @Override // t4.f0
    public final void d(i iVar) {
        this.f14727a.execute(new d0(this, iVar));
    }
}
