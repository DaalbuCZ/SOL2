package androidx.concurrent.futures;

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
    static final boolean f1119q = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: r  reason: collision with root package name */
    private static final Logger f1120r = Logger.getLogger(a.class.getName());

    /* renamed from: s  reason: collision with root package name */
    static final b f1121s;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f1122t;

    /* renamed from: n  reason: collision with root package name */
    volatile Object f1123n;

    /* renamed from: o  reason: collision with root package name */
    volatile e f1124o;

    /* renamed from: p  reason: collision with root package name */
    volatile i f1125p;

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
        static final c f1126c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1127d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f1128a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1129b;

        static {
            if (a.f1119q) {
                f1127d = null;
                f1126c = null;
                return;
            }
            f1127d = new c(false, null);
            f1126c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f1128a = z10;
            this.f1129b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f1130b = new d(new C0014a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f1131a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0014a extends Throwable {
            C0014a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1131a = (Throwable) a.l(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1132d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f1133a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1134b;

        /* renamed from: c  reason: collision with root package name */
        e f1135c;

        e(Runnable runnable, Executor executor) {
            this.f1133a = runnable;
            this.f1134b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1136a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1137b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1138c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1139d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1140e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1136a = atomicReferenceFieldUpdater;
            this.f1137b = atomicReferenceFieldUpdater2;
            this.f1138c = atomicReferenceFieldUpdater3;
            this.f1139d = atomicReferenceFieldUpdater4;
            this.f1140e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1139d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1140e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f1138c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1137b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1136a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final a<V> f1141n;

        /* renamed from: o  reason: collision with root package name */
        final e5.a<? extends V> f1142o;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1141n.f1123n != this) {
                return;
            }
            if (a.f1121s.b(this.f1141n, this, a.s(this.f1142o))) {
                a.p(this.f1141n);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1124o == eVar) {
                    aVar.f1124o = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1123n == obj) {
                    aVar.f1123n = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1125p == iVar) {
                    aVar.f1125p = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1145b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1144a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f1143c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f1144a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f1145b;

        i() {
            a.f1121s.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f1121s.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1144a;
            if (thread != null) {
                this.f1144a = null;
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
        f1121s = hVar;
        if (th != null) {
            f1120r.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1122t = new Object();
    }

    private String A(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void g(StringBuilder sb) {
        String str = "]";
        try {
            Object t10 = t(this);
            sb.append("SUCCESS, result=[");
            sb.append(A(t10));
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

    private static CancellationException j(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T l(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e m(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1124o;
        } while (!f1121s.a(this, eVar2, e.f1132d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1135c;
            eVar4.f1135c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.concurrent.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.concurrent.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.concurrent.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.concurrent.futures.a<V>, androidx.concurrent.futures.a] */
    static void p(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.w();
            aVar.h();
            e m10 = aVar.m(eVar);
            while (m10 != null) {
                eVar = m10.f1135c;
                Runnable runnable = m10.f1133a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1141n;
                    if (aVar.f1123n == gVar) {
                        if (f1121s.b(aVar, gVar, s(gVar.f1142o))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    q(runnable, m10.f1134b);
                }
                m10 = eVar;
            }
            return;
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f1120r;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V r(Object obj) {
        if (obj instanceof c) {
            throw j("Task was cancelled.", ((c) obj).f1129b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1131a);
        }
        if (obj == f1122t) {
            return null;
        }
        return obj;
    }

    static Object s(e5.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f1123n;
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f1128a ? cVar.f1129b != null ? new c(false, cVar.f1129b) : c.f1127d : obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1119q) && isCancelled) {
            return c.f1127d;
        }
        try {
            Object t10 = t(aVar);
            return t10 == null ? f1122t : t10;
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

    static <V> V t(Future<V> future) {
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

    private void w() {
        i iVar;
        do {
            iVar = this.f1125p;
        } while (!f1121s.c(this, iVar, i.f1143c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1145b;
        }
    }

    private void x(i iVar) {
        iVar.f1144a = null;
        while (true) {
            i iVar2 = this.f1125p;
            if (iVar2 == i.f1143c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1145b;
                if (iVar2.f1144a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1145b = iVar4;
                    if (iVar3.f1144a == null) {
                        break;
                    }
                } else if (!f1121s.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        Object obj = this.f1123n;
        return (obj instanceof c) && ((c) obj).f1128a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f1123n;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f1119q ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f1126c : c.f1127d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f1121s.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.u();
                }
                p(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                e5.a<? extends V> aVar2 = ((g) obj).f1142o;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z10);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f1123n;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f1123n;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // e5.a
    public final void e(Runnable runnable, Executor executor) {
        l(runnable);
        l(executor);
        e eVar = this.f1124o;
        if (eVar == e.f1132d) {
            q(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f1135c = eVar;
            if (f1121s.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.f1124o;
        } while (eVar != e.f1132d);
        q(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1123n;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return r(obj2);
        }
        i iVar = this.f1125p;
        if (iVar != i.f1143c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f1121s.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            x(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1123n;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return r(obj);
                }
                iVar = this.f1125p;
            } while (iVar != i.f1143c);
            return r(this.f1123n);
        }
        return r(this.f1123n);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1123n;
        if ((obj != null) && (!(obj instanceof g))) {
            return r(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1125p;
            if (iVar != i.f1143c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1121s.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                x(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1123n;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return r(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        x(iVar2);
                    } else {
                        iVar = this.f1125p;
                    }
                } while (iVar != i.f1143c);
                return r(this.f1123n);
            }
            return r(this.f1123n);
        }
        while (nanos > 0) {
            Object obj3 = this.f1123n;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return r(obj3);
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

    protected void h() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1123n instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f1123n;
        return (!(obj instanceof g)) & (obj != null);
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
                    str = v();
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
            g(sb);
            sb.append("]");
            return sb.toString();
        }
        str2 = "CANCELLED";
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    protected void u() {
    }

    protected String v() {
        Object obj = this.f1123n;
        if (obj instanceof g) {
            return "setFuture=[" + A(((g) obj).f1142o) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y(V v10) {
        if (v10 == null) {
            v10 = (V) f1122t;
        }
        if (f1121s.b(this, null, v10)) {
            p(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z(Throwable th) {
        if (f1121s.b(this, null, new d((Throwable) l(th)))) {
            p(this);
            return true;
        }
        return false;
    }
}
