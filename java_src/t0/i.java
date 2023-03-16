package t0;

import androidx.work.impl.WorkDatabase;
import k0.s;
import s0.q;
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    private static final String f14446q = k0.j.f("StopWorkRunnable");

    /* renamed from: n  reason: collision with root package name */
    private final l0.i f14447n;

    /* renamed from: o  reason: collision with root package name */
    private final String f14448o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f14449p;

    public i(l0.i iVar, String str, boolean z10) {
        this.f14447n = iVar;
        this.f14448o = str;
        this.f14449p = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o10;
        WorkDatabase o11 = this.f14447n.o();
        l0.d m10 = this.f14447n.m();
        q B = o11.B();
        o11.c();
        try {
            boolean h10 = m10.h(this.f14448o);
            if (this.f14449p) {
                o10 = this.f14447n.m().n(this.f14448o);
            } else {
                if (!h10 && B.j(this.f14448o) == s.RUNNING) {
                    B.c(s.ENQUEUED, this.f14448o);
                }
                o10 = this.f14447n.m().o(this.f14448o);
            }
            k0.j.c().a(f14446q, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f14448o, Boolean.valueOf(o10)), new Throwable[0]);
            o11.r();
        } finally {
            o11.g();
        }
    }
}
