package r9;

import java.util.concurrent.locks.LockSupport;
import r9.b1;
/* loaded from: classes.dex */
public abstract class c1 extends a1 {
    protected abstract Thread h0();

    /* JADX INFO: Access modifiers changed from: protected */
    public void i0(long j10, b1.a aVar) {
        p0.f13152u.u0(j10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j0() {
        Thread h02 = h0();
        if (Thread.currentThread() != h02) {
            c.a();
            LockSupport.unpark(h02);
        }
    }
}
