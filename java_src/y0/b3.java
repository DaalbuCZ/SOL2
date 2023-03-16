package y0;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class b3 implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16456a;

    public b3(s2 s2Var) {
        this.f16456a = s2Var;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Boolean call() {
        return Boolean.valueOf(this.f16456a.i().l());
    }
}
