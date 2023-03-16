package r9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class t0<T> extends kotlinx.coroutines.internal.c0<T> {

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13162q = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean I0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f13162q.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.c0, r9.a
    protected void D0(Object obj) {
        b9.d b10;
        if (I0()) {
            return;
        }
        b10 = c9.c.b(this.f10910p);
        kotlinx.coroutines.internal.i.c(b10, z.a(obj, this.f10910p), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.c0, r9.w1
    public void z(Object obj) {
        D0(obj);
    }
}
