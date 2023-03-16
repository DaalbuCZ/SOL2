package q5;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import q5.q;
import s5.d0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k {

    /* renamed from: s  reason: collision with root package name */
    static final FilenameFilter f12778s = j.f12773a;

    /* renamed from: a  reason: collision with root package name */
    private final Context f12779a;

    /* renamed from: b  reason: collision with root package name */
    private final s f12780b;

    /* renamed from: c  reason: collision with root package name */
    private final n f12781c;

    /* renamed from: d  reason: collision with root package name */
    private final r5.i f12782d;

    /* renamed from: e  reason: collision with root package name */
    private final i f12783e;

    /* renamed from: f  reason: collision with root package name */
    private final w f12784f;

    /* renamed from: g  reason: collision with root package name */
    private final v5.f f12785g;

    /* renamed from: h  reason: collision with root package name */
    private final q5.a f12786h;

    /* renamed from: i  reason: collision with root package name */
    private final r5.c f12787i;

    /* renamed from: j  reason: collision with root package name */
    private final n5.a f12788j;

    /* renamed from: k  reason: collision with root package name */
    private final o5.a f12789k;

    /* renamed from: l  reason: collision with root package name */
    private final e0 f12790l;

    /* renamed from: m  reason: collision with root package name */
    private q f12791m;

    /* renamed from: n  reason: collision with root package name */
    private x5.i f12792n = null;

    /* renamed from: o  reason: collision with root package name */
    final t4.j<Boolean> f12793o = new t4.j<>();

    /* renamed from: p  reason: collision with root package name */
    final t4.j<Boolean> f12794p = new t4.j<>();

    /* renamed from: q  reason: collision with root package name */
    final t4.j<Void> f12795q = new t4.j<>();

    /* renamed from: r  reason: collision with root package name */
    final AtomicBoolean f12796r = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements q.a {
        a() {
        }

        @Override // q5.q.a
        public void a(x5.i iVar, Thread thread, Throwable th) {
            k.this.H(iVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Callable<t4.i<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f12798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f12799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Thread f12800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x5.i f12801d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f12802e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements t4.h<x5.d, Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Executor f12804a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f12805b;

            a(Executor executor, String str) {
                this.f12804a = executor;
                this.f12805b = str;
            }

            @Override // t4.h
            /* renamed from: b */
            public t4.i<Void> a(x5.d dVar) {
                if (dVar == null) {
                    n5.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return t4.l.e(null);
                }
                t4.i[] iVarArr = new t4.i[2];
                iVarArr[0] = k.this.N();
                iVarArr[1] = k.this.f12790l.w(this.f12804a, b.this.f12802e ? this.f12805b : null);
                return t4.l.g(iVarArr);
            }
        }

        b(long j10, Throwable th, Thread thread, x5.i iVar, boolean z10) {
            this.f12798a = j10;
            this.f12799b = th;
            this.f12800c = thread;
            this.f12801d = iVar;
            this.f12802e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public t4.i<Void> call() {
            long G = k.G(this.f12798a);
            String D = k.this.D();
            if (D == null) {
                n5.f.f().d("Tried to write a fatal exception while no session was open.");
                return t4.l.e(null);
            }
            k.this.f12781c.a();
            k.this.f12790l.r(this.f12799b, this.f12800c, D, G);
            k.this.y(this.f12798a);
            k.this.v(this.f12801d);
            k.this.x(new q5.g(k.this.f12784f).toString());
            if (k.this.f12780b.d()) {
                Executor c10 = k.this.f12783e.c();
                return this.f12801d.a().q(c10, new a(c10, D));
            }
            return t4.l.e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements t4.h<Void, Boolean> {
        c() {
        }

        @Override // t4.h
        /* renamed from: b */
        public t4.i<Boolean> a(Void r12) {
            return t4.l.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements t4.h<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t4.i f12808a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Callable<t4.i<Void>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Boolean f12810a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: q5.k$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0183a implements t4.h<x5.d, Void> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Executor f12812a;

                C0183a(Executor executor) {
                    this.f12812a = executor;
                }

                @Override // t4.h
                /* renamed from: b */
                public t4.i<Void> a(x5.d dVar) {
                    if (dVar == null) {
                        n5.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        k.this.N();
                        k.this.f12790l.v(this.f12812a);
                        k.this.f12795q.e(null);
                    }
                    return t4.l.e(null);
                }
            }

            a(Boolean bool) {
                this.f12810a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public t4.i<Void> call() {
                if (this.f12810a.booleanValue()) {
                    n5.f.f().b("Sending cached crash reports...");
                    k.this.f12780b.c(this.f12810a.booleanValue());
                    Executor c10 = k.this.f12783e.c();
                    return d.this.f12808a.q(c10, new C0183a(c10));
                }
                n5.f.f().i("Deleting cached crash reports...");
                k.s(k.this.L());
                k.this.f12790l.u();
                k.this.f12795q.e(null);
                return t4.l.e(null);
            }
        }

        d(t4.i iVar) {
            this.f12808a = iVar;
        }

        @Override // t4.h
        /* renamed from: b */
        public t4.i<Void> a(Boolean bool) {
            return k.this.f12783e.i(new a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f12814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12815b;

        e(long j10, String str) {
            this.f12814a = j10;
            this.f12815b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (k.this.J()) {
                return null;
            }
            k.this.f12787i.g(this.f12814a, this.f12815b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ long f12817n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Throwable f12818o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Thread f12819p;

        f(long j10, Throwable th, Thread thread) {
            this.f12817n = j10;
            this.f12818o = th;
            this.f12819p = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.J()) {
                return;
            }
            long G = k.G(this.f12817n);
            String D = k.this.D();
            if (D == null) {
                n5.f.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                k.this.f12790l.s(this.f12818o, this.f12819p, D, G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12821a;

        g(String str) {
            this.f12821a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            k.this.x(this.f12821a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f12823a;

        h(long j10) {
            this.f12823a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f12823a);
            k.this.f12789k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, i iVar, w wVar, s sVar, v5.f fVar, n nVar, q5.a aVar, r5.i iVar2, r5.c cVar, e0 e0Var, n5.a aVar2, o5.a aVar3) {
        this.f12779a = context;
        this.f12783e = iVar;
        this.f12784f = wVar;
        this.f12780b = sVar;
        this.f12785g = fVar;
        this.f12781c = nVar;
        this.f12786h = aVar;
        this.f12782d = iVar2;
        this.f12787i = cVar;
        this.f12788j = aVar2;
        this.f12789k = aVar3;
        this.f12790l = e0Var;
    }

    private void A(String str) {
        n5.f f10 = n5.f.f();
        f10.i("Finalizing native report for session " + str);
        n5.g a10 = this.f12788j.a(str);
        File d10 = a10.d();
        if (d10 == null || !d10.exists()) {
            n5.f f11 = n5.f.f();
            f11.k("No minidump data found for session " + str);
            return;
        }
        long lastModified = d10.lastModified();
        r5.c cVar = new r5.c(this.f12785g, str);
        File i10 = this.f12785g.i(str);
        if (!i10.isDirectory()) {
            n5.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        y(lastModified);
        List<z> F = F(a10, str, this.f12785g, cVar.b());
        a0.b(i10, F);
        n5.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f12790l.h(str, F);
        cVar.a();
    }

    private static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String D() {
        SortedSet<String> n10 = this.f12790l.n();
        if (n10.isEmpty()) {
            return null;
        }
        return n10.first();
    }

    private static long E() {
        return G(System.currentTimeMillis());
    }

    static List<z> F(n5.g gVar, String str, v5.f fVar, byte[] bArr) {
        File o10 = fVar.o(str, "user-data");
        File o11 = fVar.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q5.f("logs_file", "logs", bArr));
        arrayList.add(new v("crash_meta_file", "metadata", gVar.f()));
        arrayList.add(new v("session_meta_file", "session", gVar.e()));
        arrayList.add(new v("app_meta_file", "app", gVar.a()));
        arrayList.add(new v("device_meta_file", "device", gVar.c()));
        arrayList.add(new v("os_meta_file", "os", gVar.b()));
        arrayList.add(new v("minidump_file", "minidump", gVar.d()));
        arrayList.add(new v("user_meta_file", "user", o10));
        arrayList.add(new v("keys_file", "keys", o11));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long G(long j10) {
        return j10 / 1000;
    }

    private t4.i<Void> M(long j10) {
        if (C()) {
            n5.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return t4.l.e(null);
        }
        n5.f.f().b("Logging app exception event to Firebase Analytics");
        return t4.l.c(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t4.i<Void> N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                n5.f f10 = n5.f.f();
                f10.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return t4.l.f(arrayList);
    }

    private t4.i<Boolean> V() {
        if (this.f12780b.d()) {
            n5.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f12793o.e(Boolean.FALSE);
            return t4.l.e(Boolean.TRUE);
        }
        n5.f.f().b("Automatic data collection is disabled.");
        n5.f.f().i("Notifying that unsent reports are available.");
        this.f12793o.e(Boolean.TRUE);
        t4.i<TContinuationResult> r10 = this.f12780b.i().r(new c());
        n5.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return j0.k(r10, this.f12794p.a());
    }

    private void W(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            n5.f f10 = n5.f.f();
            f10.i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f12779a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f12790l.t(str, historicalProcessExitReasons, new r5.c(this.f12785g, str), r5.i.i(str, this.f12785g, this.f12783e));
            return;
        }
        n5.f f11 = n5.f.f();
        f11.i("No ApplicationExitInfo available. Session: " + str);
    }

    private static d0.a p(w wVar, q5.a aVar) {
        return d0.a.b(wVar.f(), aVar.f12721f, aVar.f12722g, wVar.a(), t.e(aVar.f12719d).g(), aVar.f12723h);
    }

    private static d0.b q() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return d0.b.c(q5.h.m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), q5.h.t(), statFs.getBlockCount() * statFs.getBlockSize(), q5.h.z(), q5.h.n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static d0.c r() {
        return d0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, q5.h.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void w(boolean z10, x5.i iVar) {
        ArrayList arrayList = new ArrayList(this.f12790l.n());
        if (arrayList.size() <= z10) {
            n5.f.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z10 ? 1 : 0);
        if (iVar.b().f16340b.f16348b) {
            W(str);
        } else {
            n5.f.f().i("ANR feature disabled.");
        }
        if (this.f12788j.c(str)) {
            A(str);
        }
        this.f12790l.i(E(), z10 != 0 ? (String) arrayList.get(0) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(String str) {
        long E = E();
        n5.f f10 = n5.f.f();
        f10.b("Opening a new session with ID " + str);
        this.f12788j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", m.l()), E, s5.d0.b(p(this.f12784f, this.f12786h), r(), q()));
        this.f12787i.e(str);
        this.f12790l.o(str, E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(long j10) {
        try {
            v5.f fVar = this.f12785g;
            if (fVar.e(".ae" + j10).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e10) {
            n5.f.f().l("Could not create app exception marker file.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B(x5.i iVar) {
        this.f12783e.b();
        if (J()) {
            n5.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        n5.f.f().i("Finalizing previously open sessions.");
        try {
            w(true, iVar);
            n5.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            n5.f.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    void H(x5.i iVar, Thread thread, Throwable th) {
        I(iVar, thread, th, false);
    }

    synchronized void I(x5.i iVar, Thread thread, Throwable th, boolean z10) {
        n5.f f10 = n5.f.f();
        f10.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            j0.d(this.f12783e.i(new b(System.currentTimeMillis(), th, thread, iVar, z10)));
        } catch (TimeoutException unused) {
            n5.f.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            n5.f.f().e("Error handling uncaught exception", e10);
        }
    }

    boolean J() {
        q qVar = this.f12791m;
        return qVar != null && qVar.a();
    }

    List<File> L() {
        return this.f12785g.f(f12778s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(Thread thread, Throwable th) {
        x5.i iVar = this.f12792n;
        if (iVar == null) {
            n5.f.f().k("settingsProvider not set");
        } else {
            I(iVar, thread, th, true);
        }
    }

    void P(String str) {
        this.f12783e.h(new g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<Void> Q() {
        this.f12794p.e(Boolean.TRUE);
        return this.f12795q.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(String str, String str2) {
        try {
            this.f12782d.l(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f12779a;
            if (context != null && q5.h.x(context)) {
                throw e10;
            }
            n5.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(String str, String str2) {
        try {
            this.f12782d.m(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f12779a;
            if (context != null && q5.h.x(context)) {
                throw e10;
            }
            n5.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str) {
        this.f12782d.n(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public t4.i<Void> U(t4.i<x5.d> iVar) {
        if (this.f12790l.l()) {
            n5.f.f().i("Crash reports are available to be sent.");
            return V().r(new d(iVar));
        }
        n5.f.f().i("No crash reports are available to be sent.");
        this.f12793o.e(Boolean.FALSE);
        return t4.l.e(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(Thread thread, Throwable th) {
        this.f12783e.g(new f(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(long j10, String str) {
        this.f12783e.h(new e(j10, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<Boolean> o() {
        if (this.f12796r.compareAndSet(false, true)) {
            return this.f12793o.a();
        }
        n5.f.f().k("checkForUnsentReports should only be called once per execution.");
        return t4.l.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<Void> t() {
        this.f12794p.e(Boolean.FALSE);
        return this.f12795q.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        if (!this.f12781c.c()) {
            String D = D();
            return D != null && this.f12788j.c(D);
        }
        n5.f.f().i("Found previous crash marker.");
        this.f12781c.d();
        return true;
    }

    void v(x5.i iVar) {
        w(false, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, x5.i iVar) {
        this.f12792n = iVar;
        P(str);
        q qVar = new q(new a(), iVar, uncaughtExceptionHandler, this.f12788j);
        this.f12791m = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }
}
