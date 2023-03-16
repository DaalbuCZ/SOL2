package a8;

import a8.f;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f284a;

    /* renamed from: b  reason: collision with root package name */
    private c f285b;

    /* renamed from: c  reason: collision with root package name */
    private long f286c;

    /* renamed from: d  reason: collision with root package name */
    private a8.b f287d;

    /* renamed from: e  reason: collision with root package name */
    private FlutterJNI f288e;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f289f;

    /* renamed from: g  reason: collision with root package name */
    Future<b> f290g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f291a;

        a(Context context) {
            this.f291a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            f.this.f288e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public b call() {
            w8.e.a("FlutterLoader initTask");
            try {
                f.this.m(this.f291a);
                f.this.f288e.loadLibrary();
                f.this.f288e.updateRefreshRate();
                f.this.f289f.execute(new Runnable() { // from class: a8.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.c();
                    }
                });
                return new b(w8.b.d(this.f291a), w8.b.a(this.f291a), w8.b.c(this.f291a), null);
            } finally {
                w8.e.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f293a;

        /* renamed from: b  reason: collision with root package name */
        final String f294b;

        /* renamed from: c  reason: collision with root package name */
        final String f295c;

        private b(String str, String str2, String str3) {
            this.f293a = str;
            this.f294b = str2;
            this.f295c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f296a;

        public String a() {
            return this.f296a;
        }
    }

    public f() {
        this(x7.a.e().d().a());
    }

    public f(FlutterJNI flutterJNI) {
        this(flutterJNI, x7.a.e().b());
    }

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f284a = false;
        this.f288e = flutterJNI;
        this.f289f = executorService;
    }

    private String j(String str) {
        return this.f287d.f269d + File.separator + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g m(Context context) {
        return null;
    }

    private static boolean n(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Context context, String[] strArr, Handler handler, Runnable runnable) {
        g(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        try {
            this.f290g.get();
            w8.a.a(Looper.getMainLooper()).post(new Runnable() { // from class: a8.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.o(context, strArr, handler, runnable);
                }
            });
        } catch (Exception e10) {
            x7.b.c("FlutterLoader", "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    public boolean f() {
        return this.f287d.f272g;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.content.Context r10, java.lang.String[] r11) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.g(android.content.Context, java.lang.String[]):void");
    }

    public void h(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f285b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.f284a) {
            handler.post(runnable);
        } else {
            this.f289f.execute(new Runnable() { // from class: a8.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.p(context, strArr, handler, runnable);
                }
            });
        }
    }

    public String i() {
        return this.f287d.f269d;
    }

    public String k(String str) {
        return j(str);
    }

    public String l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("packages");
        String str3 = File.separator;
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        return k(sb.toString());
    }

    public void q(Context context) {
        r(context, new c());
    }

    public void r(Context context, c cVar) {
        if (this.f285b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        w8.e.a("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f285b = cVar;
            this.f286c = SystemClock.uptimeMillis();
            this.f287d = a8.a.e(applicationContext);
            (Build.VERSION.SDK_INT >= 17 ? io.flutter.view.e.g((DisplayManager) applicationContext.getSystemService("display"), this.f288e) : io.flutter.view.e.f(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f288e)).h();
            this.f290g = this.f289f.submit(new a(applicationContext));
        } finally {
            w8.e.d();
        }
    }
}
