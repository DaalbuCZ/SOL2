package t4;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class u<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14762a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14763b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f14764c;

    public u(Executor executor, a aVar, j0 j0Var) {
        this.f14762a = executor;
        this.f14763b = aVar;
        this.f14764c = j0Var;
    }

    @Override // t4.c
    public final void a() {
        this.f14764c.u();
    }

    @Override // t4.f
    public final void b(TContinuationResult tcontinuationresult) {
        this.f14764c.t(tcontinuationresult);
    }

    @Override // t4.e
    public final void c(Exception exc) {
        this.f14764c.s(exc);
    }

    @Override // t4.f0
    public final void d(i iVar) {
        this.f14762a.execute(new t(this, iVar));
    }
}
