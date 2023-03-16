package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.iid.s;
import com.google.firebase.iid.u;
import h6.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.GuardedBy;
@Deprecated
/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: j  reason: collision with root package name */
    private static u f5326j;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: l  reason: collision with root package name */
    static ScheduledExecutorService f5328l;

    /* renamed from: a  reason: collision with root package name */
    final Executor f5329a;

    /* renamed from: b  reason: collision with root package name */
    private final f5.e f5330b;

    /* renamed from: c  reason: collision with root package name */
    private final n f5331c;

    /* renamed from: d  reason: collision with root package name */
    private final k f5332d;

    /* renamed from: e  reason: collision with root package name */
    private final s f5333e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.e f5334f;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    private boolean f5335g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a.InterfaceC0119a> f5336h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f5325i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f5327k = Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(f5.e eVar, n nVar, Executor executor, Executor executor2, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2) {
        this.f5335g = false;
        this.f5336h = new ArrayList();
        if (n.c(eVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f5326j == null) {
                f5326j = new u(eVar.l());
            }
        }
        this.f5330b = eVar;
        this.f5331c = nVar;
        this.f5332d = new k(eVar, nVar, bVar, bVar2, eVar2);
        this.f5329a = executor2;
        this.f5333e = new s(executor);
        this.f5334f = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstanceId(f5.e eVar, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2) {
        this(eVar, new n(eVar.l()), b.b(), b.b(), bVar, bVar2, eVar2);
    }

    private static String A(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private <T> T b(t4.i<T> iVar) {
        try {
            return (T) t4.l.b(iVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    B();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        }
    }

    private static <T> T c(t4.i<T> iVar) {
        z3.o.j(iVar, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.b(d.f5343n, new t4.d(countDownLatch) { // from class: com.google.firebase.iid.e

            /* renamed from: a  reason: collision with root package name */
            private final CountDownLatch f5344a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5344a = countDownLatch;
            }

            @Override // t4.d
            public void a(t4.i iVar2) {
                this.f5344a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return (T) l(iVar);
    }

    private static void e(f5.e eVar) {
        z3.o.f(eVar.q().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        z3.o.f(eVar.q().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        z3.o.f(eVar.q().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        z3.o.b(u(eVar.q().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        z3.o.b(t(eVar.q().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(f5.e eVar) {
        e(eVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eVar.j(FirebaseInstanceId.class);
        z3.o.j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    private t4.i<l> k(final String str, String str2) {
        final String A = A(str2);
        return t4.l.e(null).j(this.f5329a, new t4.a(this, str, A) { // from class: com.google.firebase.iid.c

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f5340a;

            /* renamed from: b  reason: collision with root package name */
            private final String f5341b;

            /* renamed from: c  reason: collision with root package name */
            private final String f5342c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5340a = this;
                this.f5341b = str;
                this.f5342c = A;
            }

            @Override // t4.a
            public Object a(t4.i iVar) {
                return this.f5340a.z(this.f5341b, this.f5342c, iVar);
            }
        });
    }

    private static <T> T l(t4.i<T> iVar) {
        if (iVar.p()) {
            return iVar.l();
        }
        if (iVar.n()) {
            throw new CancellationException("Task is already canceled");
        }
        if (iVar.o()) {
            throw new IllegalStateException(iVar.k());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    private String m() {
        return "[DEFAULT]".equals(this.f5330b.p()) ? "" : this.f5330b.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    static boolean t(@Nonnull String str) {
        return f5327k.matcher(str).matches();
    }

    static boolean u(@Nonnull String str) {
        return str.contains(":");
    }

    synchronized void B() {
        f5326j.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void C(boolean z10) {
        this.f5335g = z10;
    }

    synchronized void D() {
        if (this.f5335g) {
            return;
        }
        E(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void E(long j10) {
        g(new v(this, Math.min(Math.max(30L, j10 + j10), f5325i)), j10);
        this.f5335g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F(u.a aVar) {
        return aVar == null || aVar.c(this.f5331c.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a.InterfaceC0119a interfaceC0119a) {
        this.f5336h.add(interfaceC0119a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return o(n.c(this.f5330b), "*");
    }

    @Deprecated
    public void f(String str, String str2) {
        e(this.f5330b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String A = A(str2);
        b(this.f5332d.b(i(), str, A));
        f5326j.e(m(), str, A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f5328l == null) {
                f5328l = new ScheduledThreadPoolExecutor(1, new e4.a("FirebaseInstanceId"));
            }
            f5328l.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5.e h() {
        return this.f5330b;
    }

    String i() {
        try {
            f5326j.j(this.f5330b.r());
            return (String) c(this.f5334f.a());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Deprecated
    public t4.i<l> j() {
        e(this.f5330b);
        return k(n.c(this.f5330b), "*");
    }

    @Deprecated
    public String n() {
        e(this.f5330b);
        u.a p10 = p();
        if (F(p10)) {
            D();
        }
        return u.a.b(p10);
    }

    @Deprecated
    public String o(String str, String str2) {
        e(this.f5330b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((l) b(k(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u.a p() {
        return q(n.c(this.f5330b), "*");
    }

    u.a q(String str, String str2) {
        return f5326j.g(m(), str, str2);
    }

    public boolean s() {
        return this.f5331c.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ t4.i w(String str, String str2, String str3, String str4) {
        f5326j.i(m(), str, str2, str4, this.f5331c.a());
        return t4.l.e(new m(str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void x(u.a aVar, l lVar) {
        String a10 = lVar.a();
        if (aVar == null || !a10.equals(aVar.f5385a)) {
            for (a.InterfaceC0119a interfaceC0119a : this.f5336h) {
                interfaceC0119a.a(a10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ t4.i y(final String str, final String str2, final String str3, final u.a aVar) {
        return this.f5332d.e(str, str2, str3).q(this.f5329a, new t4.h(this, str2, str3, str) { // from class: com.google.firebase.iid.g

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f5350a;

            /* renamed from: b  reason: collision with root package name */
            private final String f5351b;

            /* renamed from: c  reason: collision with root package name */
            private final String f5352c;

            /* renamed from: d  reason: collision with root package name */
            private final String f5353d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5350a = this;
                this.f5351b = str2;
                this.f5352c = str3;
                this.f5353d = str;
            }

            @Override // t4.h
            public t4.i a(Object obj) {
                return this.f5350a.w(this.f5351b, this.f5352c, this.f5353d, (String) obj);
            }
        }).f(h.f5354n, new t4.f(this, aVar) { // from class: com.google.firebase.iid.i

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f5355a;

            /* renamed from: b  reason: collision with root package name */
            private final u.a f5356b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5355a = this;
                this.f5356b = aVar;
            }

            @Override // t4.f
            public void b(Object obj) {
                this.f5355a.x(this.f5356b, (l) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ t4.i z(final String str, final String str2, t4.i iVar) {
        final String i10 = i();
        final u.a q10 = q(str, str2);
        return !F(q10) ? t4.l.e(new m(i10, q10.f5385a)) : this.f5333e.a(str, str2, new s.a(this, i10, str, str2, q10) { // from class: com.google.firebase.iid.f

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f5345a;

            /* renamed from: b  reason: collision with root package name */
            private final String f5346b;

            /* renamed from: c  reason: collision with root package name */
            private final String f5347c;

            /* renamed from: d  reason: collision with root package name */
            private final String f5348d;

            /* renamed from: e  reason: collision with root package name */
            private final u.a f5349e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5345a = this;
                this.f5346b = i10;
                this.f5347c = str;
                this.f5348d = str2;
                this.f5349e = q10;
            }

            @Override // com.google.firebase.iid.s.a
            public t4.i start() {
                return this.f5345a.y(this.f5346b, this.f5347c, this.f5348d, this.f5349e);
            }
        });
    }
}
