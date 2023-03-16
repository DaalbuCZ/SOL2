package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.c;
import java.util.UUID;
import java.util.concurrent.Executor;
import k0.e;
import k0.v;
/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: n  reason: collision with root package name */
    private Context f2511n;

    /* renamed from: o  reason: collision with root package name */
    private WorkerParameters f2512o;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f2513p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2514q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2515r;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final androidx.work.b f2516a;

            public C0048a() {
                this(androidx.work.b.f2561c);
            }

            public C0048a(androidx.work.b bVar) {
                this.f2516a = bVar;
            }

            public androidx.work.b e() {
                return this.f2516a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0048a.class != obj.getClass()) {
                    return false;
                }
                return this.f2516a.equals(((C0048a) obj).f2516a);
            }

            public int hashCode() {
                return (C0048a.class.getName().hashCode() * 31) + this.f2516a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f2516a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final androidx.work.b f2517a;

            public c() {
                this(androidx.work.b.f2561c);
            }

            public c(androidx.work.b bVar) {
                this.f2517a = bVar;
            }

            public androidx.work.b e() {
                return this.f2517a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f2517a.equals(((c) obj).f2517a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f2517a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f2517a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0048a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f2511n = context;
        this.f2512o = workerParameters;
    }

    public final Context a() {
        return this.f2511n;
    }

    public Executor b() {
        return this.f2512o.a();
    }

    public e5.a<e> c() {
        c t10 = c.t();
        t10.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t10;
    }

    public final UUID f() {
        return this.f2512o.c();
    }

    public final b g() {
        return this.f2512o.d();
    }

    public v h() {
        return this.f2512o.e();
    }

    public boolean i() {
        return this.f2515r;
    }

    public final boolean j() {
        return this.f2513p;
    }

    public final boolean k() {
        return this.f2514q;
    }

    public void l() {
    }

    public void m(boolean z10) {
        this.f2515r = z10;
    }

    public final void n() {
        this.f2514q = true;
    }

    public abstract e5.a<a> o();

    public final void p() {
        this.f2513p = true;
        l();
    }
}
