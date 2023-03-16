package y0;

import java.util.List;
import java.util.Map;
import y0.c;
import y0.k3;
/* loaded from: classes.dex */
public class f2 {

    /* renamed from: c  reason: collision with root package name */
    private static final String f16523c = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final w2 f16524a;

    /* renamed from: b  reason: collision with root package name */
    private final m0<j2> f16525b;

    public f2(w2 w2Var) {
        l3.a(w2Var, "BugfenderApiManager must be not null");
        this.f16524a = w2Var;
        this.f16525b = new m2();
    }

    private void d(Throwable th) {
        if (th instanceof q0) {
            i0.d(f16523c, "Unrecognized application key.");
        } else if (th instanceof f1) {
            i0.a("Bugfender-SDK", "Log limit reached");
        } else if (th instanceof k1) {
            Throwable cause = th.getCause();
            i0.d("Bugfender-SDK", ((cause instanceof j2) && ((j2) cause).a() == 0) ? "The Internet permission is not available, please manually delete the app and reinstall it so the manifest can be updated" : "Network error, will retry later");
        }
    }

    public long a(z1 z1Var) {
        try {
            String b10 = this.f16524a.b("session", g.a(z1Var, Boolean.TRUE));
            g2 a10 = h.a(b10);
            if (a10 != null) {
                return a10.a();
            }
            throw new j2(2, "Unexpected response body from server: " + b10);
        } catch (j2 e10) {
            v0 of = this.f16525b.of(e10);
            d(of);
            throw of;
        }
    }

    public k3 b(String str, c3 c3Var, Map<String, ?> map) {
        try {
            String b10 = this.f16524a.b("app/device-status", d.a(str, c3Var, map));
            c a10 = e.a(b10);
            if (a10 == null) {
                throw new j2(2, "Unexpected response body from server: " + b10);
            }
            c.a a11 = a10.a();
            if (a11 != null) {
                int a12 = a11.a();
                if (a12 == -1017) {
                    throw new j2(-1017, "Deleted app");
                }
                if (a12 == -1004) {
                    throw new j2(-1004, "Invalid app token");
                }
            }
            return new k3.b().d(a10.g()).b(a10.h()).a(a10.e().a()).c();
        } catch (j2 e10) {
            v0 of = this.f16525b.of(e10);
            d(of);
            throw of;
        }
    }

    public void c(String str, String str2, q<?> qVar) {
        try {
            this.f16524a.b("device/keyvalue", i.a(str, str2, qVar));
        } catch (j2 e10) {
            v0 of = this.f16525b.of(e10);
            d(of);
            throw of;
        }
    }

    public void e(List<n0> list, z1 z1Var) {
        try {
            this.f16524a.c("log/batch", j.a(list, z1Var), z1Var.l());
        } catch (j2 e10) {
            v0 of = this.f16525b.of(e10);
            d(of);
            throw of;
        }
    }

    public void f(d3 d3Var, z1 z1Var) {
        try {
            this.f16524a.b("issue", f.a(d3Var, z1Var));
        } catch (j2 e10) {
            v0 of = this.f16525b.of(e10);
            d(of);
            throw of;
        }
    }
}
