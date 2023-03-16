package y0;

import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class d1 implements Callable<n2<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final f2 f16501a;

    /* renamed from: b  reason: collision with root package name */
    private final j3<String> f16502b;

    /* renamed from: c  reason: collision with root package name */
    private final c3 f16503c;

    public d1(f2 f2Var, j3<String> j3Var, c3 c3Var) {
        this.f16501a = f2Var;
        this.f16502b = j3Var;
        this.f16503c = c3Var;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public n2<Boolean> call() {
        Map<String, ?> d10 = this.f16502b.d();
        for (String str : d10.keySet()) {
            try {
                this.f16501a.c(this.f16503c.a(), this.f16503c.l(), new q<>(str, d10.get(str)));
                this.f16502b.g(str);
            } catch (v0 e10) {
                return new n2<>(Boolean.FALSE, e10);
            }
        }
        return new n2<>(Boolean.TRUE);
    }
}
