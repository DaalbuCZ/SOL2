package t4;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f14747a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final int f14748b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f14749c;
    @GuardedBy("mLock")

    /* renamed from: d  reason: collision with root package name */
    private int f14750d;
    @GuardedBy("mLock")

    /* renamed from: e  reason: collision with root package name */
    private int f14751e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    private int f14752f;
    @GuardedBy("mLock")

    /* renamed from: g  reason: collision with root package name */
    private Exception f14753g;
    @GuardedBy("mLock")

    /* renamed from: h  reason: collision with root package name */
    private boolean f14754h;

    public q(int i10, j0 j0Var) {
        this.f14748b = i10;
        this.f14749c = j0Var;
    }

    @GuardedBy("mLock")
    private final void d() {
        if (this.f14750d + this.f14751e + this.f14752f == this.f14748b) {
            if (this.f14753g == null) {
                if (this.f14754h) {
                    this.f14749c.u();
                    return;
                } else {
                    this.f14749c.t(null);
                    return;
                }
            }
            j0 j0Var = this.f14749c;
            int i10 = this.f14751e;
            int i11 = this.f14748b;
            j0Var.s(new ExecutionException(i10 + " out of " + i11 + " underlying tasks failed", this.f14753g));
        }
    }

    @Override // t4.c
    public final void a() {
        synchronized (this.f14747a) {
            this.f14752f++;
            this.f14754h = true;
            d();
        }
    }

    @Override // t4.f
    public final void b(T t10) {
        synchronized (this.f14747a) {
            this.f14750d++;
            d();
        }
    }

    @Override // t4.e
    public final void c(Exception exc) {
        synchronized (this.f14747a) {
            this.f14751e++;
            this.f14753g = exc;
            d();
        }
    }
}
