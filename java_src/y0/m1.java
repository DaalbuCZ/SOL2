package y0;

import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import y0.c1;
import y0.n0;
/* loaded from: classes.dex */
public class m1 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    private final q1 f16573a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16574b;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f16576d;

    /* renamed from: e  reason: collision with root package name */
    private Future<?> f16577e = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f16575c = Process.myPid();

    /* loaded from: classes.dex */
    class a implements c1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z0.c f16578a;

        a(z0.c cVar) {
            this.f16578a = cVar;
        }

        @Override // y0.c1.a
        public void b(String str) {
            try {
                f0 a10 = f0.a(str, m1.this.f16575c);
                if (TextUtils.isEmpty(a10.c())) {
                    return;
                }
                m1.this.d(a10, this.f16578a);
            } catch (u2 unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c1 f16580n;

        b(c1 c1Var) {
            this.f16580n = c1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m1.this.f16577e.isDone() || m1.this.f16577e.isCancelled()) {
                m1.this.f16573a.i(0, "logcat", "Logcat", n0.c.W, "Bugfender-SDK", "Logcat process has exited prematurely, restarting it in 5 minutes to continue delivering the logs. During this time logs will not be collected.");
                m1 m1Var = m1.this;
                m1Var.f16577e = m1Var.f16576d.submit(this.f16580n);
            }
        }
    }

    public m1(String str, q1 q1Var, ExecutorService executorService) {
        this.f16574b = str;
        this.f16573a = q1Var;
        this.f16576d = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(f0 f0Var, z0.c cVar) {
        z0.b a10;
        if (f0Var.d().startsWith("BF/") || (a10 = cVar.a(new z0.b(0, "logcat", "Logcat", f0Var.b().g(), f0Var.d(), f0Var.c()))) == null) {
            return;
        }
        f(a10);
    }

    private void f(z0.b bVar) {
        this.f16573a.i(bVar.c(), bVar.e(), bVar.a(), n0.c.g(bVar.b()), bVar.f(), bVar.d());
    }

    @Override // y0.h1
    public void a(z0.c cVar) {
        a aVar = new a(cVar);
        c1 c1Var = new c1(this.f16574b);
        c1Var.e(aVar);
        this.f16577e = this.f16576d.submit(c1Var);
        Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new b(c1Var), 1L, 5L, TimeUnit.MINUTES);
    }
}
