package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class a<V> implements e5.a<V> {

    /* renamed from: q  reason: collision with root package name */
    static final boolean f2670q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: r  reason: collision with root package name */
    private static final Logger f2671r = Logger.getLogger(a.class.getName());

    /* renamed from: s  reason: collision with root package name */
    static final b f2672s;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f2673t;

    /* renamed from: n  reason: collision with root package name */
    volatile Object f2674n;

    /* renamed from: o  reason: collision with root package name */
    volatile e f2675o;

    /* renamed from: p  reason: collision with root package name */
    volatile i f2676p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f2677c;

        /* renamed from: d  reason: collision with root package name */
        static final c f2678d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f2679a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f2680b;

        static {
            if (a.f2670q) {
                f2678d = null;
                f2677c = null;
                return;
            }
            f2678d = new c(false, null);
            f2677c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f2679a = z10;
            this.f2680b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f2681b = new d(new C0053a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f2682a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0053a extends Throwable {
            C0053a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f2682a = (Throwable) a.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f2683d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f2684a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f2685b;

        /* renamed from: c  reason: collision with root package name */
        e f2686c;

        e(Runnable runnable, Executor executor) {
            this.f2684a = runnable;
            this.f2685b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f2687a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f2688b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f2689c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f2690d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f2691e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f2687a = atomicReferenceFieldUpdater;
            this.f2688b = atomicReferenceFieldUpdater2;
            this.f2689c = atomicReferenceFieldUpdater3;
            this.f2690d = atomicReferenceFieldUpdater4;
            this.f2691e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f2690d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f2691e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f2689c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f2688b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f2687a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final a<V> f2692n;

        /* renamed from: o  reason: collision with root package name */
        final e5.a<? extends V> f2693o;

        g(a<V> aVar, e5.a<? extends V> aVar2) {
            this.f2692n = aVar;
            this.f2693o = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2692n.f2674n != this) {
                return;
            }
            if (a.f2672s.b(this.f2692n, this, a.j(this.f2693o))) {
                a.g(this.f2692n);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2675o == eVar) {
                    aVar.f2675o = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2674n == obj) {
                    aVar.f2674n = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f2676p == iVar) {
                    aVar.f2676p = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f2696b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f2695a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f2694c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f2695a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f2696b;

        i() {
            a.f2672s.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f2672s.d(this, iVar);
        }

        void b() {
            Thread thread = this.f2695a;
            if (thread != null) {
                this.f2695a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "p"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "o"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "n"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f2672s = hVar;
        if (th != null) {
            f2671r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2673t = new Object();
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object k10 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k10));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append(str);
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T d(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2675o;
        } while (!f2672s.a(this, eVar2, e.f2683d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2686c;
            eVar4.f2686c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f2686c;
                Runnable runnable = f10.f2684a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f2692n;
                    if (aVar.f2674n == gVar) {
                        if (f2672s.b(aVar, gVar, j(gVar.f2693o))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f2685b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f2671r;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f2680b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f2682a);
        }
        if (obj == f2673t) {
            return null;
        }
        return obj;
    }

    static Object j(e5.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f2674n;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f2679a ? cVar.f2680b != null ? new c(false, cVar.f2680b) : c.f2678d : obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f2670q) && isCancelled) {
            return c.f2678d;
        }
        try {
            Object k10 = k(aVar);
            return k10 == null ? f2673t : k10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f2676p;
        } while (!f2672s.c(this, iVar, i.f2694c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f2696b;
        }
    }

    private void o(i iVar) {
        iVar.f2695a = null;
        while (true) {
            i iVar2 = this.f2676p;
            if (iVar2 == i.f2694c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2696b;
                if (iVar2.f2695a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2696b = iVar4;
                    if (iVar3.f2695a == null) {
                        break;
                    }
                } else if (!f2672s.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f2674n;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f2670q ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f2677c : c.f2678d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f2672s.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                e5.a<? extends V> aVar2 = ((g) obj).f2693o;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z10);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f2674n;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f2674n;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // e5.a
    public final void e(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f2675o;
        if (eVar == e.f2683d) {
            h(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f2686c = eVar;
            if (f2672s.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f2675o;
        } while (eVar != e.f2683d);
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f2674n;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return i(obj2);
        }
        i iVar = this.f2676p;
        if (iVar != i.f2694c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f2672s.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f2674n;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return i(obj);
                }
                iVar = this.f2676p;
            } while (iVar != i.f2694c);
            return i(this.f2674n);
        }
        return i(this.f2674n);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2674n;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f2676p;
            if (iVar != i.f2694c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f2672s.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2674n;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f2676p;
                    }
                } while (iVar != i.f2694c);
                return i(this.f2674n);
            }
            return i(this.f2674n);
        }
        while (nanos > 0) {
            Object obj3 = this.f2674n;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z10 = i10 == 0 || nanos2 > 1000;
            if (i10 > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2674n instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f2674n;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    protected String m() {
        Object obj = this.f2674n;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f2693o) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) f2673t;
        }
        if (f2672s.b(this, null, v10)) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (f2672s.b(this, null, new d((Throwable) d(th)))) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(e5.a<? extends V> aVar) {
        d dVar;
        d(aVar);
        Object obj = this.f2674n;
        if (obj == null) {
            if (aVar.isDone()) {
                if (f2672s.b(this, null, j(aVar))) {
                    g(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, aVar);
            if (f2672s.b(this, null, gVar)) {
                try {
                    aVar.e(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f2681b;
                    }
                    f2672s.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f2674n;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f2679a);
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = m();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
