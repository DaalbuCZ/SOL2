package t4;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class s implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14757a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14758b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f14759c;

    public s(Executor executor, a aVar, j0 j0Var) {
        this.f14757a = executor;
        this.f14758b = aVar;
        this.f14759c = j0Var;
    }

    @Override // t4.f0
    public final void d(i iVar) {
        this.f14757a.execute(new r(this, iVar));
    }
}
