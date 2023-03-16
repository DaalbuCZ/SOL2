package k9;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class l<R> implements h<R>, Serializable {

    /* renamed from: n  reason: collision with root package name */
    private final int f10896n;

    public l(int i10) {
        this.f10896n = i10;
    }

    @Override // k9.h
    public int f() {
        return this.f10896n;
    }

    public String toString() {
        String f10 = s.f(this);
        k.d(f10, "renderLambdaToString(this)");
        return f10;
    }
}
