package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import b0.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public abstract class h {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected volatile b0.b f2236a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f2237b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f2238c;

    /* renamed from: d  reason: collision with root package name */
    private b0.c f2239d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2241f;

    /* renamed from: g  reason: collision with root package name */
    boolean f2242g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f2243h;

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantReadWriteLock f2244i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    private final ThreadLocal<Integer> f2245j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f2246k = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final e f2240e = e();

    /* loaded from: classes.dex */
    public static class a<T extends h> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f2247a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2248b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f2249c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f2250d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f2251e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f2252f;

        /* renamed from: g  reason: collision with root package name */
        private c.InterfaceC0057c f2253g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2254h;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2256j;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2258l;

        /* renamed from: n  reason: collision with root package name */
        private Set<Integer> f2260n;

        /* renamed from: o  reason: collision with root package name */
        private Set<Integer> f2261o;

        /* renamed from: p  reason: collision with root package name */
        private String f2262p;

        /* renamed from: q  reason: collision with root package name */
        private File f2263q;

        /* renamed from: i  reason: collision with root package name */
        private c f2255i = c.AUTOMATIC;

        /* renamed from: k  reason: collision with root package name */
        private boolean f2257k = true;

        /* renamed from: m  reason: collision with root package name */
        private final d f2259m = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context, Class<T> cls, String str) {
            this.f2249c = context;
            this.f2247a = cls;
            this.f2248b = str;
        }

        public a<T> a(b bVar) {
            if (this.f2250d == null) {
                this.f2250d = new ArrayList<>();
            }
            this.f2250d.add(bVar);
            return this;
        }

        public a<T> b(z.a... aVarArr) {
            if (this.f2261o == null) {
                this.f2261o = new HashSet();
            }
            for (z.a aVar : aVarArr) {
                this.f2261o.add(Integer.valueOf(aVar.f17123a));
                this.f2261o.add(Integer.valueOf(aVar.f17124b));
            }
            this.f2259m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f2254h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
            if (r1 != null) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T d() {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.a.d():androidx.room.h");
        }

        public a<T> e() {
            this.f2257k = false;
            this.f2258l = true;
            return this;
        }

        public a<T> f(c.InterfaceC0057c interfaceC0057c) {
            this.f2253g = interfaceC0057c;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f2251e = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(b0.b bVar) {
        }

        public void b(b0.b bVar) {
        }

        public void c(b0.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean e(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        c g(Context context) {
            ActivityManager activityManager;
            return this != AUTOMATIC ? this : (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || e(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, z.a>> f2268a = new HashMap<>();

        private void a(z.a aVar) {
            int i10 = aVar.f17123a;
            int i11 = aVar.f17124b;
            TreeMap<Integer, z.a> treeMap = this.f2268a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f2268a.put(Integer.valueOf(i10), treeMap);
            }
            z.a aVar2 = treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.util.List<z.a> d(java.util.List<z.a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, z.a>> r0 = r6.f2268a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = r5
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(z.a... aVarArr) {
            for (z.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<z.a> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f2241f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f2245j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        b0.b T = this.f2239d.T();
        this.f2240e.m(T);
        T.e();
    }

    public b0.f d(String str) {
        a();
        b();
        return this.f2239d.T().s(str);
    }

    protected abstract e e();

    protected abstract b0.c f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        this.f2239d.T().d();
        if (k()) {
            return;
        }
        this.f2240e.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Lock h() {
        return this.f2244i.readLock();
    }

    public b0.c i() {
        return this.f2239d;
    }

    public Executor j() {
        return this.f2237b;
    }

    public boolean k() {
        return this.f2239d.T().A();
    }

    public void l(androidx.room.a aVar) {
        b0.c f10 = f(aVar);
        this.f2239d = f10;
        if (f10 instanceof j) {
            ((j) f10).b(aVar);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            r2 = aVar.f2178g == c.WRITE_AHEAD_LOGGING;
            this.f2239d.setWriteAheadLoggingEnabled(r2);
        }
        this.f2243h = aVar.f2176e;
        this.f2237b = aVar.f2179h;
        this.f2238c = new l(aVar.f2180i);
        this.f2241f = aVar.f2177f;
        this.f2242g = r2;
        if (aVar.f2181j) {
            this.f2240e.i(aVar.f2173b, aVar.f2174c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(b0.b bVar) {
        this.f2240e.d(bVar);
    }

    public boolean o() {
        b0.b bVar = this.f2236a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(b0.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(b0.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.f2239d.T().L(eVar) : this.f2239d.T().w(eVar, cancellationSignal);
    }

    @Deprecated
    public void r() {
        this.f2239d.T().J();
    }
}
