package n3;

import java.util.List;
import u2.t0;
/* loaded from: classes.dex */
public final class u extends c {

    /* renamed from: h  reason: collision with root package name */
    private final int f11731h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f11732i;

    public u(t0 t0Var, int i10, int i11) {
        this(t0Var, i10, i11, 0, null);
    }

    public u(t0 t0Var, int i10, int i11, int i12, Object obj) {
        super(t0Var, new int[]{i10}, i11);
        this.f11731h = i12;
        this.f11732i = obj;
    }

    @Override // n3.t
    public int p() {
        return this.f11731h;
    }

    @Override // n3.t
    public int q() {
        return 0;
    }

    @Override // n3.t
    public void r(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr) {
    }

    @Override // n3.t
    public Object t() {
        return this.f11732i;
    }
}
