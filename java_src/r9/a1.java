package r9;
/* loaded from: classes.dex */
public abstract class a1 extends d0 {

    /* renamed from: p  reason: collision with root package name */
    private long f13091p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13092q;

    /* renamed from: r  reason: collision with root package name */
    private kotlinx.coroutines.internal.a<u0<?>> f13093r;

    private final long Z(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void d0(a1 a1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        a1Var.c0(z10);
    }

    public final void Y(boolean z10) {
        long Z = this.f13091p - Z(z10);
        this.f13091p = Z;
        if (Z > 0) {
            return;
        }
        if (n0.a()) {
            if (!(this.f13091p == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f13092q) {
            shutdown();
        }
    }

    public final void a0(u0<?> u0Var) {
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f13093r;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f13093r = aVar;
        }
        aVar.a(u0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b0() {
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f13093r;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void c0(boolean z10) {
        this.f13091p += Z(z10);
        if (z10) {
            return;
        }
        this.f13092q = true;
    }

    public final boolean e0() {
        return this.f13091p >= Z(true);
    }

    public final boolean f0() {
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f13093r;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }

    public final boolean g0() {
        u0<?> d10;
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f13093r;
        if (aVar == null || (d10 = aVar.d()) == null) {
            return false;
        }
        d10.run();
        return true;
    }

    public void shutdown() {
    }
}
