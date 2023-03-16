package v6;

import a7.l;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;
import z6.k;
/* loaded from: classes.dex */
public class g {

    /* renamed from: f  reason: collision with root package name */
    private static final u6.a f15715f = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final h f15716a;

    /* renamed from: b  reason: collision with root package name */
    private final l f15717b;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15720e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15719d = false;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f15718c = new ConcurrentHashMap();

    public g(String str, String str2, k kVar, l lVar) {
        this.f15720e = false;
        this.f15717b = lVar;
        h o10 = h.c(kVar).z(str).o(str2);
        this.f15716a = o10;
        o10.q();
        if (com.google.firebase.perf.config.a.g().K()) {
            return;
        }
        f15715f.g("HttpMetric feature is disabled. URL %s", str);
        this.f15720e = true;
    }

    private void a(String str, String str2) {
        if (this.f15719d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!this.f15718c.containsKey(str) && this.f15718c.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        w6.e.d(str, str2);
    }

    public void b(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            f15715f.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f15716a.f());
            z10 = true;
        } catch (Exception e10) {
            f15715f.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f15718c.put(str, str2);
        }
    }

    public void c(int i10) {
        this.f15716a.p(i10);
    }

    public void d(long j10) {
        this.f15716a.s(j10);
    }

    public void e(String str) {
        this.f15716a.u(str);
    }

    public void f(long j10) {
        this.f15716a.v(j10);
    }

    public void g() {
        this.f15717b.i();
        this.f15716a.t(this.f15717b.e());
    }

    public void h() {
        if (this.f15720e) {
            return;
        }
        this.f15716a.x(this.f15717b.c()).n(this.f15718c).b();
        this.f15719d = true;
    }
}
