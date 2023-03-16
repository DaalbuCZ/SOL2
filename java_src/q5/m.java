package q5;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12826a;

    /* renamed from: b  reason: collision with root package name */
    private final f5.e f12827b;

    /* renamed from: c  reason: collision with root package name */
    private final s f12828c;

    /* renamed from: f  reason: collision with root package name */
    private n f12831f;

    /* renamed from: g  reason: collision with root package name */
    private n f12832g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12833h;

    /* renamed from: i  reason: collision with root package name */
    private k f12834i;

    /* renamed from: j  reason: collision with root package name */
    private final w f12835j;

    /* renamed from: k  reason: collision with root package name */
    private final v5.f f12836k;

    /* renamed from: l  reason: collision with root package name */
    public final p5.b f12837l;

    /* renamed from: m  reason: collision with root package name */
    private final o5.a f12838m;

    /* renamed from: n  reason: collision with root package name */
    private final ExecutorService f12839n;

    /* renamed from: o  reason: collision with root package name */
    private final i f12840o;

    /* renamed from: p  reason: collision with root package name */
    private final n5.a f12841p;

    /* renamed from: e  reason: collision with root package name */
    private final long f12830e = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private final b0 f12829d = new b0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<t4.i<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x5.i f12842a;

        a(x5.i iVar) {
            this.f12842a = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public t4.i<Void> call() {
            return m.this.i(this.f12842a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ x5.i f12844n;

        b(x5.i iVar) {
            this.f12844n = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.i(this.f12844n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d10 = m.this.f12831f.d();
                if (!d10) {
                    n5.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d10);
            } catch (Exception e10) {
                n5.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(m.this.f12834i.u());
        }
    }

    public m(f5.e eVar, w wVar, n5.a aVar, s sVar, p5.b bVar, o5.a aVar2, v5.f fVar, ExecutorService executorService) {
        this.f12827b = eVar;
        this.f12828c = sVar;
        this.f12826a = eVar.l();
        this.f12835j = wVar;
        this.f12841p = aVar;
        this.f12837l = bVar;
        this.f12838m = aVar2;
        this.f12839n = executorService;
        this.f12836k = fVar;
        this.f12840o = new i(executorService);
    }

    private void d() {
        boolean z10;
        try {
            z10 = Boolean.TRUE.equals((Boolean) j0.d(this.f12840o.h(new d())));
        } catch (Exception unused) {
            z10 = false;
        }
        this.f12833h = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t4.i<Void> i(x5.i iVar) {
        r();
        try {
            this.f12837l.a(new p5.a() { // from class: q5.l
                @Override // p5.a
                public final void a(String str) {
                    m.this.n(str);
                }
            });
            if (!iVar.b().f16340b.f16347a) {
                n5.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return t4.l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f12834i.B(iVar)) {
                n5.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f12834i.U(iVar.a());
        } catch (Exception e10) {
            n5.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return t4.l.d(e10);
        } finally {
            q();
        }
    }

    private void k(x5.i iVar) {
        n5.f f10;
        String str;
        Future<?> submit = this.f12839n.submit(new b(iVar));
        n5.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            f10 = n5.f.f();
            str = "Crashlytics was interrupted during initialization.";
            f10.e(str, e);
        } catch (ExecutionException e11) {
            e = e11;
            f10 = n5.f.f();
            str = "Crashlytics encountered a problem during initialization.";
            f10.e(str, e);
        } catch (TimeoutException e12) {
            e = e12;
            f10 = n5.f.f();
            str = "Crashlytics timed out during initialization.";
            f10.e(str, e);
        }
    }

    public static String l() {
        return "18.3.5";
    }

    static boolean m(String str, boolean z10) {
        if (!z10) {
            n5.f.f().i("Configured not to require a build ID.");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        } else {
            return true;
        }
    }

    public t4.i<Boolean> e() {
        return this.f12834i.o();
    }

    public t4.i<Void> f() {
        return this.f12834i.t();
    }

    public boolean g() {
        return this.f12833h;
    }

    boolean h() {
        return this.f12831f.c();
    }

    public t4.i<Void> j(x5.i iVar) {
        return j0.f(this.f12839n, new a(iVar));
    }

    public void n(String str) {
        this.f12834i.Y(System.currentTimeMillis() - this.f12830e, str);
    }

    public void o(Throwable th) {
        this.f12834i.X(Thread.currentThread(), th);
    }

    public void p(Throwable th) {
        n5.f f10 = n5.f.f();
        f10.b("Recorded on-demand fatal events: " + this.f12829d.b());
        n5.f f11 = n5.f.f();
        f11.b("Dropped on-demand fatal events: " + this.f12829d.a());
        this.f12834i.S("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f12829d.b()));
        this.f12834i.S("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f12829d.a()));
        this.f12834i.O(Thread.currentThread(), th);
    }

    void q() {
        this.f12840o.h(new c());
    }

    void r() {
        this.f12840o.b();
        this.f12831f.a();
        n5.f.f().i("Initialization marker file was created.");
    }

    public boolean s(q5.a aVar, x5.i iVar) {
        if (m(aVar.f12717b, h.k(this.f12826a, "com.crashlytics.RequireBuildId", true))) {
            String gVar = new g(this.f12835j).toString();
            try {
                this.f12832g = new n("crash_marker", this.f12836k);
                this.f12831f = new n("initialization_marker", this.f12836k);
                r5.i iVar2 = new r5.i(gVar, this.f12836k, this.f12840o);
                r5.c cVar = new r5.c(this.f12836k);
                this.f12834i = new k(this.f12826a, this.f12840o, this.f12835j, this.f12828c, this.f12836k, this.f12832g, aVar, iVar2, cVar, e0.g(this.f12826a, this.f12835j, this.f12836k, aVar, cVar, iVar2, new y5.a(1024, new y5.c(10)), iVar, this.f12829d), this.f12841p, this.f12838m);
                boolean h10 = h();
                d();
                this.f12834i.z(gVar, Thread.getDefaultUncaughtExceptionHandler(), iVar);
                if (!h10 || !h.c(this.f12826a)) {
                    n5.f.f().b("Successfully configured exception handler.");
                    return true;
                }
                n5.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                k(iVar);
                return false;
            } catch (Exception e10) {
                n5.f.f().e("Crashlytics was not started due to an exception during initialization", e10);
                this.f12834i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    public t4.i<Void> t() {
        return this.f12834i.Q();
    }

    public void u(Boolean bool) {
        this.f12828c.g(bool);
    }

    public void v(String str, String str2) {
        this.f12834i.R(str, str2);
    }

    public void w(String str, String str2) {
        this.f12834i.S(str, str2);
    }

    public void x(String str) {
        this.f12834i.T(str);
    }
}
