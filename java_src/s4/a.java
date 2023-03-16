package s4;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import d4.h;
import d4.n;
import d4.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import m4.i;
import z3.o;
@ThreadSafe
/* loaded from: classes.dex */
public class a {

    /* renamed from: r  reason: collision with root package name */
    private static final long f13990r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    private static volatile ScheduledExecutorService f13991s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f13992t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static volatile e f13993u = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f13994a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f13995b;

    /* renamed from: c  reason: collision with root package name */
    private int f13996c;

    /* renamed from: d  reason: collision with root package name */
    private Future<?> f13997d;

    /* renamed from: e  reason: collision with root package name */
    private long f13998e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<f> f13999f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14000g;

    /* renamed from: h  reason: collision with root package name */
    private int f14001h;

    /* renamed from: i  reason: collision with root package name */
    m4.b f14002i;

    /* renamed from: j  reason: collision with root package name */
    private d4.e f14003j;

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f14004k;

    /* renamed from: l  reason: collision with root package name */
    private final String f14005l;

    /* renamed from: m  reason: collision with root package name */
    private final String f14006m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f14007n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, d> f14008o;

    /* renamed from: p  reason: collision with root package name */
    private AtomicInteger f14009p;

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f14010q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f13994a = new Object();
        this.f13996c = 0;
        this.f13999f = new HashSet();
        this.f14000g = true;
        this.f14003j = h.d();
        this.f14008o = new HashMap();
        this.f14009p = new AtomicInteger(0);
        o.j(context, "WakeLock: context must not be null");
        o.f(str, "WakeLock: wakeLockName must not be empty");
        this.f14007n = context.getApplicationContext();
        this.f14006m = str;
        this.f14002i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f14005l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f14005l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.f13995b = newWakeLock;
        if (p.c(context)) {
            WorkSource b10 = p.b(context, n.a(packageName) ? context.getPackageName() : packageName);
            this.f14004k = b10;
            if (b10 != null) {
                i(newWakeLock, b10);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f13991s;
        if (scheduledExecutorService == null) {
            synchronized (f13992t) {
                scheduledExecutorService = f13991s;
                if (scheduledExecutorService == null) {
                    m4.h.a();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f13991s = scheduledExecutorService;
                }
            }
        }
        this.f14010q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f13994a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f14005l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.f13996c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (this.f14000g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f13999f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f13999f);
        this.f13999f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        f fVar = (f) arrayList.get(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r5.f14002i != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r5.f14002i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r5.f14002i != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f13994a
            monitor-enter(r6)
            boolean r0 = r5.b()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        Lb:
            boolean r0 = r5.f14000g     // Catch: java.lang.Throwable -> La2
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r5.f13996c     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + (-1)
            r5.f13996c = r0     // Catch: java.lang.Throwable -> La2
            if (r0 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        L1b:
            r5.f13996c = r1     // Catch: java.lang.Throwable -> La2
        L1d:
            r5.g()     // Catch: java.lang.Throwable -> La2
            java.util.Map<java.lang.String, s4.d> r0 = r5.f14008o     // Catch: java.lang.Throwable -> La2
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La2
        L2a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La2
            s4.d r2 = (s4.d) r2     // Catch: java.lang.Throwable -> La2
            r2.f14012a = r1     // Catch: java.lang.Throwable -> La2
            goto L2a
        L39:
            java.util.Map<java.lang.String, s4.d> r0 = r5.f14008o     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.Future<?> r0 = r5.f13997d     // Catch: java.lang.Throwable -> La2
            r2 = 0
            if (r0 == 0) goto L4c
            r0.cancel(r1)     // Catch: java.lang.Throwable -> La2
            r5.f13997d = r2     // Catch: java.lang.Throwable -> La2
            r3 = 0
            r5.f13998e = r3     // Catch: java.lang.Throwable -> La2
        L4c:
            r5.f14001h = r1     // Catch: java.lang.Throwable -> La2
            android.os.PowerManager$WakeLock r0 = r5.f13995b     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L8f
            android.os.PowerManager$WakeLock r0 = r5.f13995b     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r0.release()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            m4.b r0 = r5.f14002i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
        L5f:
            r5.f14002i = r2     // Catch: java.lang.Throwable -> La2
            goto La0
        L62:
            r0 = move-exception
            goto L88
        L64:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L87
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f14005l     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L62
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L62
            m4.b r0 = r5.f14002i     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto La0
            goto L5f
        L87:
            throw r0     // Catch: java.lang.Throwable -> L62
        L88:
            m4.b r1 = r5.f14002i     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L8e
            r5.f14002i = r2     // Catch: java.lang.Throwable -> La2
        L8e:
            throw r0     // Catch: java.lang.Throwable -> La2
        L8f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f14005l     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> La2
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            return
        La2:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.a.h(int):void");
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f14009p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f13990r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f13994a) {
            if (!b()) {
                this.f14002i = m4.b.a(false, null);
                this.f13995b.acquire();
                this.f14003j.b();
            }
            this.f13996c++;
            this.f14001h++;
            f(null);
            d dVar = this.f14008o.get(null);
            if (dVar == null) {
                dVar = new d(null);
                this.f14008o.put(null, dVar);
            }
            dVar.f14012a++;
            long b10 = this.f14003j.b();
            long j11 = Long.MAX_VALUE - b10 > max ? b10 + max : Long.MAX_VALUE;
            if (j11 > this.f13998e) {
                this.f13998e = j11;
                Future<?> future = this.f13997d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f13997d = this.f14010q.schedule(new Runnable() { // from class: s4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.e(a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f13994a) {
            z10 = this.f13996c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f14009p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f14005l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f13994a) {
            f(null);
            if (this.f14008o.containsKey(null)) {
                d dVar = this.f14008o.get(null);
                if (dVar != null) {
                    int i10 = dVar.f14012a - 1;
                    dVar.f14012a = i10;
                    if (i10 == 0) {
                        this.f14008o.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f14005l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z10) {
        synchronized (this.f13994a) {
            this.f14000g = z10;
        }
    }
}
