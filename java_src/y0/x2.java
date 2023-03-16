package y0;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class x2 implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16767a;

    public x2(s2 s2Var) {
        this.f16767a = s2Var;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Boolean call() {
        return Boolean.valueOf(this.f16767a.f().l());
    }
}
