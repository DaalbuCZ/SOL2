package y0;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class y2 implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16783a;

    /* renamed from: b  reason: collision with root package name */
    private final z1 f16784b;

    public y2(s2 s2Var, z1 z1Var) {
        this.f16783a = s2Var;
        this.f16784b = z1Var;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Boolean call() {
        try {
            this.f16783a.l(this.f16784b);
            return Boolean.TRUE;
        } catch (a1 e10) {
            i0.d("Bugfender-SDK", e10.getMessage());
            return Boolean.FALSE;
        }
    }
}
