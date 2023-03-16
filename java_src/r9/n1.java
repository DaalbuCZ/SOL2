package r9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
final class n1 extends r1 {

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13147s = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: r  reason: collision with root package name */
    private final j9.l<Throwable, y8.s> f13148r;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(j9.l<? super Throwable, y8.s> lVar) {
        this.f13148r = lVar;
    }

    @Override // r9.x
    public void C(Throwable th) {
        if (f13147s.compareAndSet(this, 0, 1)) {
            this.f13148r.c(th);
        }
    }

    @Override // j9.l
    public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
        C(th);
        return y8.s.f17099a;
    }
}
