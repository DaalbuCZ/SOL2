package r9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class b1 extends c1 implements r0 {

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13094s = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_queue");

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13095t = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    public static abstract class a implements Runnable, Comparable<a>, y0, kotlinx.coroutines.internal.k0 {
        private volatile Object _heap;

        /* renamed from: n  reason: collision with root package name */
        public long f13096n;

        /* renamed from: o  reason: collision with root package name */
        private int f13097o;

        @Override // r9.y0
        public final synchronized void e() {
            kotlinx.coroutines.internal.e0 e0Var;
            kotlinx.coroutines.internal.e0 e0Var2;
            Object obj = this._heap;
            e0Var = e1.f13110a;
            if (obj == e0Var) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                bVar.g(this);
            }
            e0Var2 = e1.f13110a;
            this._heap = e0Var2;
        }

        @Override // kotlinx.coroutines.internal.k0
        public void g(int i10) {
            this.f13097o = i10;
        }

        @Override // kotlinx.coroutines.internal.k0
        public void h(kotlinx.coroutines.internal.j0<?> j0Var) {
            kotlinx.coroutines.internal.e0 e0Var;
            Object obj = this._heap;
            e0Var = e1.f13110a;
            if (!(obj != e0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = j0Var;
        }

        @Override // kotlinx.coroutines.internal.k0
        public int j() {
            return this.f13097o;
        }

        @Override // kotlinx.coroutines.internal.k0
        public kotlinx.coroutines.internal.j0<?> m() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.j0) {
                return (kotlinx.coroutines.internal.j0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: p */
        public int compareTo(a aVar) {
            int i10 = ((this.f13096n - aVar.f13096n) > 0L ? 1 : ((this.f13096n - aVar.f13096n) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:37:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int q(long r8, r9.b1.b r10, r9.b1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.e0 r1 = r9.e1.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.k0 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                r9.b1$a r0 = (r9.b1.a) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = r9.b1.k0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f13098b = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f13096n     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f13098b     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f13096n     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f13098b     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f13096n = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r9.b1.a.q(long, r9.b1$b, r9.b1):int");
        }

        public final boolean r(long j10) {
            return j10 - this.f13096n >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f13096n + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlinx.coroutines.internal.j0<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f13098b;

        public b(long j10) {
            this.f13098b = j10;
        }
    }

    private final void l0() {
        kotlinx.coroutines.internal.e0 e0Var;
        kotlinx.coroutines.internal.e0 e0Var2;
        if (n0.a() && !p0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13094s;
                e0Var = e1.f13111b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, e0Var)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.t) {
                ((kotlinx.coroutines.internal.t) obj).d();
                return;
            } else {
                e0Var2 = e1.f13111b;
                if (obj == e0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.t tVar = new kotlinx.coroutines.internal.t(8, true);
                tVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f13094s, this, obj, tVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable m0() {
        kotlinx.coroutines.internal.e0 e0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.t) {
                kotlinx.coroutines.internal.t tVar = (kotlinx.coroutines.internal.t) obj;
                Object j10 = tVar.j();
                if (j10 != kotlinx.coroutines.internal.t.f10966h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f13094s, this, obj, tVar.i());
            } else {
                e0Var = e1.f13111b;
                if (obj == e0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f13094s, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean o0(Runnable runnable) {
        kotlinx.coroutines.internal.e0 e0Var;
        while (true) {
            Object obj = this._queue;
            if (p0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f13094s, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.t) {
                kotlinx.coroutines.internal.t tVar = (kotlinx.coroutines.internal.t) obj;
                int a10 = tVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f13094s, this, obj, tVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                e0Var = e1.f13111b;
                if (obj == e0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.t tVar2 = new kotlinx.coroutines.internal.t(8, true);
                tVar2.a((Runnable) obj);
                tVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f13094s, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean p0() {
        return this._isCompleted;
    }

    private final void s0() {
        a i10;
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar == null || (i10 = bVar.i()) == null) {
                return;
            }
            i0(nanoTime, i10);
        }
    }

    private final int v0(long j10, a aVar) {
        if (p0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            androidx.concurrent.futures.b.a(f13095t, this, null, new b(j10));
            Object obj = this._delayed;
            k9.k.b(obj);
            bVar = (b) obj;
        }
        return aVar.q(j10, bVar, this);
    }

    private final void w0(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    private final boolean x0(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar != null ? bVar.e() : null) == aVar;
    }

    @Override // r9.d0
    public final void b(b9.g gVar, Runnable runnable) {
        n0(runnable);
    }

    @Override // r9.a1
    protected long b0() {
        a e10;
        long b10;
        kotlinx.coroutines.internal.e0 e0Var;
        if (super.b0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.t)) {
                e0Var = e1.f13111b;
                return obj == e0Var ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.t) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        if (bVar == null || (e10 = bVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f13096n;
        c.a();
        b10 = n9.f.b(j10 - System.nanoTime(), 0L);
        return b10;
    }

    public void n0(Runnable runnable) {
        if (o0(runnable)) {
            j0();
        } else {
            p0.f13152u.n0(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q0() {
        kotlinx.coroutines.internal.e0 e0Var;
        if (f0()) {
            b bVar = (b) this._delayed;
            if (bVar == null || bVar.d()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof kotlinx.coroutines.internal.t) {
                        return ((kotlinx.coroutines.internal.t) obj).g();
                    }
                    e0Var = e1.f13111b;
                    if (obj != e0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long r0() {
        /*
            r9 = this;
            boolean r0 = r9.g0()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            r9.b1$b r0 = (r9.b1.b) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.d()
            if (r3 != 0) goto L45
            r9.c.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.k0 r5 = r0.b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
        L24:
            monitor-exit(r0)
            goto L3d
        L26:
            r9.b1$a r5 = (r9.b1.a) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.r(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.o0(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = r8
        L35:
            if (r5 == 0) goto L24
            kotlinx.coroutines.internal.k0 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
            goto L24
        L3d:
            r9.b1$a r6 = (r9.b1.a) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.m0()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.b0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.b1.r0():long");
    }

    @Override // r9.a1
    public void shutdown() {
        g2.f13116a.b();
        w0(true);
        l0();
        do {
        } while (r0() <= 0);
        s0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void u0(long j10, a aVar) {
        int v02 = v0(j10, aVar);
        if (v02 == 0) {
            if (x0(aVar)) {
                j0();
            }
        } else if (v02 == 1) {
            i0(j10, aVar);
        } else if (v02 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }
}
