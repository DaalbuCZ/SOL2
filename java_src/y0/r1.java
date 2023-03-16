package y0;

import java.io.File;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class r1 implements Callable<n2<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16692a;

    /* renamed from: b  reason: collision with root package name */
    private final f2 f16693b;

    /* renamed from: c  reason: collision with root package name */
    private final n0 f16694c;

    public r1(s2 s2Var, f2 f2Var) {
        this.f16692a = s2Var;
        this.f16693b = f2Var;
        this.f16694c = null;
    }

    public r1(s2 s2Var, f2 f2Var, n0 n0Var) {
        this.f16694c = n0Var;
        this.f16692a = s2Var;
        this.f16693b = f2Var;
    }

    private c0<n0> a(z2<n0> z2Var) {
        return z2Var.j(1);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public n2<Boolean> call() {
        try {
            z1 c10 = this.f16692a.c();
            if (c10.l() <= 0) {
                try {
                    long a10 = this.f16693b.a(c10);
                    c10.b(a10);
                    this.f16692a.m(a10);
                } catch (v0 e10) {
                    if (!(e10 instanceof k1)) {
                        i0.c(e10);
                    }
                    return new n2<>(Boolean.FALSE, e10);
                }
            }
            z2<n0> i10 = this.f16692a.i();
            c0<n0> a11 = a(i10);
            if (this.f16694c != null) {
                a11.a().add(this.f16694c);
            }
            if (!a11.c() && a11.b().size() > 0) {
                for (File file : a11.b()) {
                    i10.d(file);
                }
                return new n2<>(Boolean.TRUE, null);
            }
            boolean z10 = true;
            while (a11.c()) {
                try {
                    this.f16693b.e(a11.a(), c10);
                    z10 &= i10.g(a11.b());
                    a11 = a(i10);
                } catch (v0 e11) {
                    if (!(e11 instanceof k1)) {
                        i0.c(e11);
                    }
                    return new n2<>(Boolean.FALSE, e11);
                }
            }
            return new n2<>(Boolean.valueOf(z10));
        } catch (Throwable th) {
            if (!(th instanceof k1) || !(th instanceof j2)) {
                i0.c(th);
            }
            return new n2<>(Boolean.FALSE, th);
        }
    }
}
