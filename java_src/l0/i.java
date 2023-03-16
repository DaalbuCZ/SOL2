package l0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import k0.j;
import k0.m;
import k0.p;
import k0.t;
import k0.u;
/* loaded from: classes.dex */
public class i extends t {

    /* renamed from: j  reason: collision with root package name */
    private static final String f11065j = k0.j.f("WorkManagerImpl");

    /* renamed from: k  reason: collision with root package name */
    private static i f11066k = null;

    /* renamed from: l  reason: collision with root package name */
    private static i f11067l = null;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f11068m = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f11069a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.a f11070b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f11071c;

    /* renamed from: d  reason: collision with root package name */
    private u0.a f11072d;

    /* renamed from: e  reason: collision with root package name */
    private List<e> f11073e;

    /* renamed from: f  reason: collision with root package name */
    private d f11074f;

    /* renamed from: g  reason: collision with root package name */
    private t0.e f11075g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11076h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f11077i;

    public i(Context context, androidx.work.a aVar, u0.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.workmanager_test_configuration));
    }

    public i(Context context, androidx.work.a aVar, u0.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        k0.j.e(new j.a(aVar.j()));
        List<e> g10 = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, g10, new d(context, aVar, aVar2, workDatabase, g10));
    }

    public i(Context context, androidx.work.a aVar, u0.a aVar2, boolean z10) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.c(), z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (l0.i.f11067l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        l0.i.f11067l = new l0.i(r4, r5, new u0.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        l0.i.f11066k = l0.i.f11067l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = l0.i.f11068m
            monitor-enter(r0)
            l0.i r1 = l0.i.f11066k     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            l0.i r2 = l0.i.f11067l     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            l0.i r1 = l0.i.f11067l     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            l0.i r1 = new l0.i     // Catch: java.lang.Throwable -> L34
            u0.b r2 = new u0.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            l0.i.f11067l = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            l0.i r4 = l0.i.f11067l     // Catch: java.lang.Throwable -> L34
            l0.i.f11066k = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.i.f(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static i j() {
        synchronized (f11068m) {
            i iVar = f11066k;
            if (iVar != null) {
                return iVar;
            }
            return f11067l;
        }
    }

    public static i k(Context context) {
        i j10;
        synchronized (f11068m) {
            j10 = j();
            if (j10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                f(applicationContext, ((a.c) applicationContext).a());
                j10 = k(applicationContext);
            }
        }
        return j10;
    }

    private void q(Context context, androidx.work.a aVar, u0.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11069a = applicationContext;
        this.f11070b = aVar;
        this.f11072d = aVar2;
        this.f11071c = workDatabase;
        this.f11073e = list;
        this.f11074f = dVar;
        this.f11075g = new t0.e(workDatabase);
        this.f11076h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f11072d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // k0.t
    public m a(String str) {
        t0.a d10 = t0.a.d(str, this);
        this.f11072d.b(d10);
        return d10.e();
    }

    @Override // k0.t
    public m b(UUID uuid) {
        t0.a b10 = t0.a.b(uuid, this);
        this.f11072d.b(b10);
        return b10.e();
    }

    @Override // k0.t
    public m c(List<? extends u> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public List<e> g(Context context, androidx.work.a aVar, u0.a aVar2) {
        return Arrays.asList(f.a(context, this), new m0.b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f11069a;
    }

    public androidx.work.a i() {
        return this.f11070b;
    }

    public t0.e l() {
        return this.f11075g;
    }

    public d m() {
        return this.f11074f;
    }

    public List<e> n() {
        return this.f11073e;
    }

    public WorkDatabase o() {
        return this.f11071c;
    }

    public u0.a p() {
        return this.f11072d;
    }

    public void r() {
        synchronized (f11068m) {
            this.f11076h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f11077i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f11077i = null;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            n0.b.b(h());
        }
        o().B().u();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f11068m) {
            this.f11077i = pendingResult;
            if (this.f11076h) {
                pendingResult.finish();
                this.f11077i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f11072d.b(new t0.h(this, str, aVar));
    }

    public void w(String str) {
        this.f11072d.b(new t0.i(this, str, true));
    }

    public void x(String str) {
        this.f11072d.b(new t0.i(this, str, false));
    }
}
