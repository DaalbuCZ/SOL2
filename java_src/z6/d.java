package z6;

import a7.l;
import a7.o;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f17466a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17467b;

    /* renamed from: c  reason: collision with root package name */
    private final float f17468c;

    /* renamed from: d  reason: collision with root package name */
    private a f17469d;

    /* renamed from: e  reason: collision with root package name */
    private a f17470e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17471f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        private static final u6.a f17472k = u6.a.e();

        /* renamed from: l  reason: collision with root package name */
        private static final long f17473l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        private final a7.a f17474a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f17475b;

        /* renamed from: c  reason: collision with root package name */
        private l f17476c;

        /* renamed from: d  reason: collision with root package name */
        private a7.i f17477d;

        /* renamed from: e  reason: collision with root package name */
        private long f17478e;

        /* renamed from: f  reason: collision with root package name */
        private double f17479f;

        /* renamed from: g  reason: collision with root package name */
        private a7.i f17480g;

        /* renamed from: h  reason: collision with root package name */
        private a7.i f17481h;

        /* renamed from: i  reason: collision with root package name */
        private long f17482i;

        /* renamed from: j  reason: collision with root package name */
        private long f17483j;

        a(a7.i iVar, long j10, a7.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z10) {
            this.f17474a = aVar;
            this.f17478e = j10;
            this.f17477d = iVar;
            this.f17479f = j10;
            this.f17476c = aVar.a();
            g(aVar2, str, z10);
            this.f17475b = z10;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            long f10 = f(aVar, str);
            long e10 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            a7.i iVar = new a7.i(e10, f10, timeUnit);
            this.f17480g = iVar;
            this.f17482i = e10;
            if (z10) {
                f17472k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(e10));
            }
            long d10 = d(aVar, str);
            long c10 = c(aVar, str);
            a7.i iVar2 = new a7.i(c10, d10, timeUnit);
            this.f17481h = iVar2;
            this.f17483j = c10;
            if (z10) {
                f17472k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(c10));
            }
        }

        synchronized void a(boolean z10) {
            this.f17477d = z10 ? this.f17480g : this.f17481h;
            this.f17478e = z10 ? this.f17482i : this.f17483j;
        }

        synchronized boolean b(b7.i iVar) {
            boolean z10;
            l a10 = this.f17474a.a();
            double d10 = (this.f17476c.d(a10) * this.f17477d.a()) / f17473l;
            if (d10 > 0.0d) {
                this.f17479f = Math.min(this.f17479f + d10, this.f17478e);
                this.f17476c = a10;
            }
            double d11 = this.f17479f;
            if (d11 >= 1.0d) {
                this.f17479f = d11 - 1.0d;
                z10 = true;
            } else {
                if (this.f17475b) {
                    f17472k.j("Exceeded log rate limit, dropping the log.");
                }
                z10 = false;
            }
            return z10;
        }
    }

    d(a7.i iVar, long j10, a7.a aVar, float f10, float f11, com.google.firebase.perf.config.a aVar2) {
        this.f17469d = null;
        this.f17470e = null;
        boolean z10 = false;
        this.f17471f = false;
        o.a(0.0f <= f10 && f10 < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        if (0.0f <= f11 && f11 < 1.0f) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f17467b = f10;
        this.f17468c = f11;
        this.f17466a = aVar2;
        this.f17469d = new a(iVar, j10, aVar, aVar2, "Trace", this.f17471f);
        this.f17470e = new a(iVar, j10, aVar, aVar2, "Network", this.f17471f);
    }

    public d(Context context, a7.i iVar, long j10) {
        this(iVar, j10, new a7.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f17471f = o.b(context);
    }

    static float b() {
        return new Random().nextFloat();
    }

    private boolean c(List<b7.k> list) {
        return list.size() > 0 && list.get(0).X() > 0 && list.get(0).W(0) == b7.l.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean d() {
        return this.f17468c < this.f17466a.f();
    }

    private boolean e() {
        return this.f17467b < this.f17466a.s();
    }

    private boolean f() {
        return this.f17467b < this.f17466a.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f17469d.a(z10);
        this.f17470e.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(b7.i iVar) {
        if (j(iVar)) {
            if (iVar.s()) {
                return !this.f17470e.b(iVar);
            }
            if (iVar.l()) {
                return !this.f17469d.b(iVar);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(b7.i iVar) {
        if (!iVar.l() || f() || c(iVar.n().q0())) {
            if (!i(iVar) || d() || c(iVar.n().q0())) {
                return !iVar.s() || e() || c(iVar.t().o0());
            }
            return false;
        }
        return false;
    }

    protected boolean i(b7.i iVar) {
        return iVar.l() && iVar.n().p0().startsWith("_st_") && iVar.n().f0("Hosting_activity");
    }

    boolean j(b7.i iVar) {
        return (!iVar.l() || (!(iVar.n().p0().equals(a7.c.FOREGROUND_TRACE_NAME.toString()) || iVar.n().p0().equals(a7.c.BACKGROUND_TRACE_NAME.toString())) || iVar.n().i0() <= 0)) && !iVar.c();
    }
}
