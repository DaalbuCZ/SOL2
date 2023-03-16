package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.e0;
import r9.n0;
import r9.o0;
import y8.s;
/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: n  reason: collision with root package name */
    public final int f10986n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10987o;

    /* renamed from: p  reason: collision with root package name */
    public final long f10988p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public final String f10989q;

    /* renamed from: r  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f10990r;

    /* renamed from: s  reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f10991s;

    /* renamed from: t  reason: collision with root package name */
    public final b0<c> f10992t;

    /* renamed from: u  reason: collision with root package name */
    public static final C0153a f10981u = new C0153a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final e0 f10985y = new e0("NOT_IN_STACK");

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f10982v = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: w  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f10983w = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10984x = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0153a {
        private C0153a() {
        }

        public /* synthetic */ C0153a(k9.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10993a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f10993a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends Thread {

        /* renamed from: u  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f10994u = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: n  reason: collision with root package name */
        public final n f10995n;
        private volatile Object nextParkedWorker;

        /* renamed from: o  reason: collision with root package name */
        public d f10996o;

        /* renamed from: p  reason: collision with root package name */
        private long f10997p;

        /* renamed from: q  reason: collision with root package name */
        private long f10998q;

        /* renamed from: r  reason: collision with root package name */
        private int f10999r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f11000s;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f10995n = new n();
            this.f10996o = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f10985y;
            this.f10999r = l9.c.f11231n.b();
        }

        public c(a aVar, int i10) {
            this();
            o(i10);
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.f10983w.addAndGet(a.this, -2097152L);
            d dVar = this.f10996o;
            if (dVar != d.TERMINATED) {
                if (n0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f10996o = d.DORMANT;
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && s(d.BLOCKING)) {
                a.this.E();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f11018o.b();
            i(b10);
            c(b10);
            a.this.y(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h m10;
            h m11;
            if (z10) {
                boolean z11 = k(a.this.f10986n * 2) == 0;
                if (z11 && (m11 = m()) != null) {
                    return m11;
                }
                h h10 = this.f10995n.h();
                if (h10 != null) {
                    return h10;
                }
                if (!z11 && (m10 = m()) != null) {
                    return m10;
                }
            } else {
                h m12 = m();
                if (m12 != null) {
                    return m12;
                }
            }
            return t(false);
        }

        private final void i(int i10) {
            this.f10997p = 0L;
            if (this.f10996o == d.PARKING) {
                if (n0.a()) {
                    if (!(i10 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f10996o = d.BLOCKING;
            }
        }

        private final boolean j() {
            return this.nextParkedWorker != a.f10985y;
        }

        private final void l() {
            if (this.f10997p == 0) {
                this.f10997p = System.nanoTime() + a.this.f10988p;
            }
            LockSupport.parkNanos(a.this.f10988p);
            if (System.nanoTime() - this.f10997p >= 0) {
                this.f10997p = 0L;
                u();
            }
        }

        private final h m() {
            kotlinx.coroutines.scheduling.d dVar;
            if (k(2) == 0) {
                h d10 = a.this.f10990r.d();
                if (d10 != null) {
                    return d10;
                }
                dVar = a.this.f10991s;
            } else {
                h d11 = a.this.f10991s.d();
                if (d11 != null) {
                    return d11;
                }
                dVar = a.this.f10990r;
            }
            return dVar.d();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f10996o != d.TERMINATED) {
                    h f10 = f(this.f11000s);
                    if (f10 != null) {
                        this.f10998q = 0L;
                        d(f10);
                    } else {
                        this.f11000s = false;
                        if (this.f10998q == 0) {
                            r();
                        } else if (z10) {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10998q);
                            this.f10998q = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        private final boolean q() {
            boolean z10;
            if (this.f10996o != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.f10983w.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f10996o = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void r() {
            if (!j()) {
                a.this.r(this);
                return;
            }
            if (n0.a()) {
                if (!(this.f10995n.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !a.this.isTerminated() && this.f10996o != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final h t(boolean z10) {
            if (n0.a()) {
                if (!(this.f10995n.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int k10 = k(i10);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                k10++;
                if (k10 > i10) {
                    k10 = 1;
                }
                c b10 = aVar.f10992t.b(k10);
                if (b10 != null && b10 != this) {
                    if (n0.a()) {
                        if (!(this.f10995n.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    n nVar = this.f10995n;
                    n nVar2 = b10.f10995n;
                    long k11 = z10 ? nVar.k(nVar2) : nVar.l(nVar2);
                    if (k11 == -1) {
                        return this.f10995n.h();
                    }
                    if (k11 > 0) {
                        j10 = Math.min(j10, k11);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f10998q = j10;
            return null;
        }

        private final void u() {
            a aVar = a.this;
            synchronized (aVar.f10992t) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f10986n) {
                    return;
                }
                if (f10994u.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    o(0);
                    aVar.t(this, i10, 0);
                    int andDecrement = (int) (a.f10983w.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i10) {
                        c b10 = aVar.f10992t.b(andDecrement);
                        k9.k.b(b10);
                        c cVar = b10;
                        aVar.f10992t.c(i10, cVar);
                        cVar.o(i10);
                        aVar.t(cVar, andDecrement, i10);
                    }
                    aVar.f10992t.c(andDecrement, null);
                    s sVar = s.f17099a;
                    this.f10996o = d.TERMINATED;
                }
            }
        }

        public final h f(boolean z10) {
            h d10;
            if (q()) {
                return e(z10);
            }
            if (!z10 || (d10 = this.f10995n.h()) == null) {
                d10 = a.this.f10991s.d();
            }
            return d10 == null ? t(true) : d10;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i10) {
            int i11 = this.f10999r;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f10999r = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f10989q);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f10996o;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f10983w.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f10996o = dVar;
            }
            return z10;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f10986n = i10;
        this.f10987o = i11;
        this.f10988p = j10;
        this.f10989q = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f10990r = new kotlinx.coroutines.scheduling.d();
        this.f10991s = new kotlinx.coroutines.scheduling.d();
        this.parkedWorkersStack = 0L;
        this.f10992t = new b0<>(i10 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    private final void D(boolean z10) {
        long addAndGet = f10983w.addAndGet(this, 2097152L);
        if (z10 || R() || N(addAndGet)) {
            return;
        }
        R();
    }

    private final h G(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f10996o == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f11018o.b() == 0 && cVar.f10996o == d.BLOCKING) {
            return hVar;
        }
        cVar.f11000s = true;
        return cVar.f10995n.a(hVar, z10);
    }

    private final boolean N(long j10) {
        int a10;
        a10 = n9.f.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (a10 < this.f10986n) {
            int b10 = b();
            if (b10 == 1 && this.f10986n > 1) {
                b();
            }
            if (b10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean O(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.controlState;
        }
        return aVar.N(j10);
    }

    private final boolean R() {
        c p10;
        do {
            p10 = p();
            if (p10 == null) {
                return false;
            }
        } while (!c.f10994u.compareAndSet(p10, -1, 0));
        LockSupport.unpark(p10);
        return true;
    }

    private final boolean a(h hVar) {
        return (hVar.f11018o.b() == 1 ? this.f10991s : this.f10990r).a(hVar);
    }

    private final int b() {
        int a10;
        int i10;
        synchronized (this.f10992t) {
            if (isTerminated()) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                a10 = n9.f.a(i11 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (a10 >= this.f10986n) {
                    return 0;
                }
                if (i11 >= this.f10987o) {
                    return 0;
                }
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i12 > 0 && this.f10992t.b(i12) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i12);
                this.f10992t.c(i12, cVar);
                if (!(i12 == ((int) (2097151 & f10983w.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i10 = a10 + 1;
            }
            return i10;
        }
    }

    private final c f() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !k9.k.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void k(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f11026f;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.j(runnable, iVar, z10);
    }

    private final int o(c cVar) {
        int g10;
        do {
            Object h10 = cVar.h();
            if (h10 == f10985y) {
                return -1;
            }
            if (h10 == null) {
                return 0;
            }
            cVar = (c) h10;
            g10 = cVar.g();
        } while (g10 == 0);
        return g10;
    }

    private final c p() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c b10 = this.f10992t.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int o10 = o(b10);
            if (o10 >= 0 && f10982v.compareAndSet(this, j10, o10 | j11)) {
                b10.p(f10985y);
                return b10;
            }
        }
    }

    public final void B(long j10) {
        int i10;
        h d10;
        if (f10984x.compareAndSet(this, 0, 1)) {
            c f10 = f();
            synchronized (this.f10992t) {
                i10 = (int) (this.controlState & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f10992t.b(i11);
                    k9.k.b(b10);
                    c cVar = b10;
                    if (cVar != f10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        d dVar = cVar.f10996o;
                        if (n0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f10995n.g(this.f10991s);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f10991s.b();
            this.f10990r.b();
            while (true) {
                if (f10 != null) {
                    d10 = f10.f(true);
                    if (d10 != null) {
                        continue;
                        y(d10);
                    }
                }
                d10 = this.f10990r.d();
                if (d10 == null && (d10 = this.f10991s.d()) == null) {
                    break;
                }
                y(d10);
            }
            if (f10 != null) {
                f10.s(d.TERMINATED);
            }
            if (n0.a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f10986n)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void E() {
        if (R() || O(this, 0L, 1, null)) {
            return;
        }
        R();
    }

    public final h c(Runnable runnable, i iVar) {
        long a10 = l.f11025e.a();
        if (runnable instanceof h) {
            h hVar = (h) runnable;
            hVar.f11017n = a10;
            hVar.f11018o = iVar;
            return hVar;
        }
        return new k(runnable, a10, iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        B(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(Runnable runnable, i iVar, boolean z10) {
        r9.c.a();
        h c10 = c(runnable, iVar);
        c f10 = f();
        h G = G(f10, c10, z10);
        if (G != null && !a(G)) {
            throw new RejectedExecutionException(this.f10989q + " was terminated");
        }
        boolean z11 = z10 && f10 != null;
        if (c10.f11018o.b() != 0) {
            D(z11);
        } else if (z11) {
        } else {
            E();
        }
    }

    public final boolean r(c cVar) {
        long j10;
        long j11;
        int g10;
        if (cVar.h() != f10985y) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            int i10 = (int) (2097151 & j10);
            j11 = (2097152 + j10) & (-2097152);
            g10 = cVar.g();
            if (n0.a()) {
                if (!(g10 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.p(this.f10992t.b(i10));
        } while (!f10982v.compareAndSet(this, j10, g10 | j11));
        return true;
    }

    public final void t(c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? o(cVar) : i11;
            }
            if (i12 >= 0 && f10982v.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        char c10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f10992t.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f10992t.b(i15);
            if (b10 != null) {
                int f10 = b10.f10995n.f();
                int i16 = b.f10993a[b10.f10996o.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb = new StringBuilder();
                        sb.append(f10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb = new StringBuilder();
                        sb.append(f10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (f10 > 0) {
                            sb = new StringBuilder();
                            sb.append(f10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb.append(c10);
                    arrayList.add(sb.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f10989q + '@' + o0.b(this) + "[Pool Size {core = " + this.f10986n + ", max = " + this.f10987o + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f10990r.c() + ", global blocking queue size = " + this.f10991s.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f10986n - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void y(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }
}
