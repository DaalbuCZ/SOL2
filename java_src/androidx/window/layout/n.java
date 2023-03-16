package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.g;
import androidx.window.layout.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class n implements p {

    /* renamed from: d  reason: collision with root package name */
    private static volatile n f2480d;

    /* renamed from: a  reason: collision with root package name */
    private g f2482a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f2483b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a f2479c = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final ReentrantLock f2481e = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        public final n a(Context context) {
            k9.k.e(context, "context");
            if (n.f2480d == null) {
                ReentrantLock reentrantLock = n.f2481e;
                reentrantLock.lock();
                try {
                    if (n.f2480d == null) {
                        n.f2480d = new n(n.f2479c.b(context));
                    }
                    y8.s sVar = y8.s.f17099a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            n nVar = n.f2480d;
            k9.k.b(nVar);
            return nVar;
        }

        public final g b(Context context) {
            k9.k.e(context, "context");
            try {
                if (c(SidecarCompat.f2416f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.l()) {
                        return sidecarCompat;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(i0.h hVar) {
            return hVar != null && hVar.compareTo(i0.h.f8223s.a()) >= 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f2484a;

        public b(n nVar) {
            k9.k.e(nVar, "this$0");
            this.f2484a = nVar;
        }

        @Override // androidx.window.layout.g.a
        @SuppressLint({"SyntheticAccessor"})
        public void a(Activity activity, v vVar) {
            k9.k.e(activity, "activity");
            k9.k.e(vVar, "newLayout");
            Iterator<c> it = this.f2484a.h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (k9.k.a(next.d(), activity)) {
                    next.b(vVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f2485a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f2486b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.util.a<v> f2487c;

        /* renamed from: d  reason: collision with root package name */
        private v f2488d;

        public c(Activity activity, Executor executor, androidx.core.util.a<v> aVar) {
            k9.k.e(activity, "activity");
            k9.k.e(executor, "executor");
            k9.k.e(aVar, "callback");
            this.f2485a = activity;
            this.f2486b = executor;
            this.f2487c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, v vVar) {
            k9.k.e(cVar, "this$0");
            k9.k.e(vVar, "$newLayoutInfo");
            cVar.f2487c.accept(vVar);
        }

        public final void b(final v vVar) {
            k9.k.e(vVar, "newLayoutInfo");
            this.f2488d = vVar;
            this.f2486b.execute(new Runnable() { // from class: androidx.window.layout.o
                @Override // java.lang.Runnable
                public final void run() {
                    n.c.c(n.c.this, vVar);
                }
            });
        }

        public final Activity d() {
            return this.f2485a;
        }

        public final androidx.core.util.a<v> e() {
            return this.f2487c;
        }

        public final v f() {
            return this.f2488d;
        }
    }

    public n(g gVar) {
        this.f2482a = gVar;
        g gVar2 = this.f2482a;
        if (gVar2 == null) {
            return;
        }
        gVar2.b(new b(this));
    }

    private final void f(Activity activity) {
        g gVar;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f2483b;
        boolean z10 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (k9.k.a(((c) it.next()).d(), activity)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || (gVar = this.f2482a) == null) {
            return;
        }
        gVar.c(activity);
    }

    private final boolean i(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f2483b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (c cVar : copyOnWriteArrayList) {
            if (k9.k.a(cVar.d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.p
    public void a(androidx.core.util.a<v> aVar) {
        k9.k.e(aVar, "callback");
        synchronized (f2481e) {
            if (g() == null) {
                return;
            }
            ArrayList<c> arrayList = new ArrayList();
            Iterator<c> it = h().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.e() == aVar) {
                    k9.k.d(next, "callbackWrapper");
                    arrayList.add(next);
                }
            }
            h().removeAll(arrayList);
            for (c cVar : arrayList) {
                f(cVar.d());
            }
            y8.s sVar = y8.s.f17099a;
        }
    }

    @Override // androidx.window.layout.p
    public void b(Activity activity, Executor executor, androidx.core.util.a<v> aVar) {
        v vVar;
        Object obj;
        List d10;
        k9.k.e(activity, "activity");
        k9.k.e(executor, "executor");
        k9.k.e(aVar, "callback");
        ReentrantLock reentrantLock = f2481e;
        reentrantLock.lock();
        try {
            g g10 = g();
            if (g10 == null) {
                d10 = z8.j.d();
                aVar.accept(new v(d10));
                return;
            }
            boolean i10 = i(activity);
            c cVar = new c(activity, executor, aVar);
            h().add(cVar);
            if (i10) {
                Iterator<T> it = h().iterator();
                while (true) {
                    vVar = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (k9.k.a(activity, ((c) obj).d())) {
                        break;
                    }
                }
                c cVar2 = (c) obj;
                if (cVar2 != null) {
                    vVar = cVar2.f();
                }
                if (vVar != null) {
                    cVar.b(vVar);
                }
            } else {
                g10.a(activity);
            }
            y8.s sVar = y8.s.f17099a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final g g() {
        return this.f2482a;
    }

    public final CopyOnWriteArrayList<c> h() {
        return this.f2483b;
    }
}
