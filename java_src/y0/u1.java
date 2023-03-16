package y0;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class u1 implements Callable<n2<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final f2 f16719a;

    /* renamed from: b  reason: collision with root package name */
    private final s2 f16720b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16721c;

    /* renamed from: d  reason: collision with root package name */
    private final i1 f16722d;

    /* renamed from: e  reason: collision with root package name */
    private final List<z1> f16723e;

    public u1(f2 f2Var, s2 s2Var, String str, List<z1> list) {
        this.f16719a = f2Var;
        this.f16720b = s2Var;
        this.f16721c = str;
        this.f16722d = null;
        this.f16723e = list;
    }

    public u1(f2 f2Var, s2 s2Var, String str, i1 i1Var) {
        this.f16719a = f2Var;
        this.f16720b = s2Var;
        this.f16721c = str;
        this.f16722d = i1Var;
        this.f16723e = null;
    }

    private c0<String> a(z1 z1Var) {
        try {
            return this.f16720b.f(z1Var).i();
        } catch (e3 unused) {
            return new c0<>(Collections.emptyList(), Collections.emptyList());
        }
    }

    private static boolean c(z1 z1Var, int i10) {
        return new Date().getTime() - z1Var.n().getTime() >= TimeUnit.DAYS.toMillis((long) i10);
    }

    private List<z1> d() {
        List<z1> list = this.f16723e;
        return (list == null || list.size() <= 0) ? this.f16720b.a() : this.f16723e;
    }

    private c0<d3> e(z1 z1Var) {
        try {
            return this.f16720b.n(z1Var).i();
        } catch (e3 unused) {
            return new c0<>(Collections.emptyList(), Collections.emptyList());
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public n2<Boolean> call() {
        s2 s2Var;
        i1 i1Var;
        try {
            List<z1> d10 = d();
            boolean z10 = false;
            int i10 = 0;
            for (z1 z1Var : d10) {
                try {
                } catch (Exception e10) {
                    i0.d("Bugfender-SDK", "There was a problem sending the old session " + z1Var.g());
                    if (!(e10 instanceof k1) && !(e10 instanceof j2)) {
                        this.f16720b.p(z1Var.g());
                    }
                }
                if (c(z1Var, 30)) {
                    s2Var = this.f16720b;
                } else {
                    z2<n0> q10 = this.f16720b.q(z1Var);
                    c0<n0> a10 = q10.a(1);
                    c0<d3> e11 = e(z1Var);
                    c0<String> a11 = a(z1Var);
                    if (a10.c() || e11.c() || a11.c()) {
                        if (z1Var.l() <= 0) {
                            long a12 = this.f16719a.a(z1Var);
                            z1Var.b(a12);
                            this.f16720b.o(z1Var.g(), a12);
                        }
                        if (e11.c()) {
                            for (d3 d3Var : e11.a()) {
                                d3Var.b(z1Var.l());
                                d3Var.c(new g0(this.f16721c));
                                this.f16719a.f(d3Var, z1Var);
                            }
                        }
                        while (a10.c()) {
                            this.f16719a.e(a10.a(), z1Var);
                            q10.g(a10.b());
                            a10 = q10.a(1);
                        }
                        if (a11.c() && (i1Var = this.f16722d) != null) {
                            i1Var.b(z1Var, a11.a());
                        }
                        this.f16720b.p(z1Var.g());
                        i10++;
                    } else {
                        s2Var = this.f16720b;
                    }
                }
                s2Var.p(z1Var.g());
            }
            return new n2<>(Boolean.valueOf((d10.size() == 0 || i10 > 0) ? true : true));
        } catch (Exception e12) {
            return new n2<>(Boolean.FALSE, e12);
        }
    }
}
