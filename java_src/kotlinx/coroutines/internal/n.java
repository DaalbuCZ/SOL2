package kotlinx.coroutines.internal;

import r9.q0;
import r9.r0;
/* loaded from: classes.dex */
public final class n extends r9.d0 implements Runnable, r0 {

    /* renamed from: p  reason: collision with root package name */
    private final r9.d0 f10947p;

    /* renamed from: q  reason: collision with root package name */
    private final int f10948q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ r0 f10949r;
    private volatile int runningWorkers;

    /* renamed from: s  reason: collision with root package name */
    private final s<Runnable> f10950s;

    /* renamed from: t  reason: collision with root package name */
    private final Object f10951t;

    public n(r9.d0 d0Var, int i10) {
        this.f10947p = d0Var;
        this.f10948q = i10;
        r0 r0Var = d0Var instanceof r0 ? (r0) d0Var : null;
        this.f10949r = r0Var == null ? q0.a() : r0Var;
        this.f10950s = new s<>(false);
        this.f10951t = new Object();
    }

    private final boolean Y(Runnable runnable) {
        this.f10950s.a(runnable);
        return this.runningWorkers >= this.f10948q;
    }

    private final boolean Z() {
        synchronized (this.f10951t) {
            if (this.runningWorkers >= this.f10948q) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // r9.d0
    public void b(b9.g gVar, Runnable runnable) {
        if (Y(runnable) || !Z()) {
            return;
        }
        this.f10947p.b(this, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f10951t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f10950s.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = y8.s.f17099a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f10950s
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            b9.h r3 = b9.h.f2971n
            r9.g0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            r9.d0 r2 = r4.f10947p
            boolean r2 = r2.W(r4)
            if (r2 == 0) goto L2
            r9.d0 r0 = r4.f10947p
            r0.b(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f10951t
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f10950s     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            y8.s r2 = y8.s.f17099a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.n.run():void");
    }
}
