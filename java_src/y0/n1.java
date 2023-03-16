package y0;

import java.io.File;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class n1 implements Callable<n2<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16611a;

    /* renamed from: b  reason: collision with root package name */
    private final f2 f16612b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16613c;

    public n1(s2 s2Var, f2 f2Var, String str) {
        this.f16611a = s2Var;
        this.f16612b = f2Var;
        this.f16613c = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public n2<Boolean> call() {
        z1 c10 = this.f16611a.c();
        z2<d3> f10 = this.f16611a.f();
        c0<d3> k10 = f10.k();
        if (!k10.c()) {
            if (k10.b().size() > 0) {
                for (File file : k10.b()) {
                    f10.d(file);
                }
            }
            return new n2<>(Boolean.TRUE);
        }
        if (c10.l() <= 0) {
            try {
                long a10 = this.f16612b.a(c10);
                c10.b(a10);
                this.f16611a.m(a10);
            } catch (v0 e10) {
                return new n2<>(Boolean.FALSE, e10);
            }
        }
        boolean z10 = false;
        for (d3 d3Var : k10.a()) {
            d3Var.b((int) c10.l());
            d3Var.c(new g0(this.f16613c));
            try {
                this.f16612b.f(d3Var, c10);
                z10 = true;
            } catch (v0 e11) {
                return new n2<>(Boolean.FALSE, e11);
            }
        }
        if (z10) {
            f10.g(k10.b());
        }
        return new n2<>(Boolean.valueOf(z10));
    }
}
