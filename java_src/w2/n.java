package w2;

import s1.m1;
/* loaded from: classes.dex */
public abstract class n extends f {

    /* renamed from: j  reason: collision with root package name */
    public final long f16044j;

    public n(o3.l lVar, o3.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12) {
        super(lVar, pVar, 1, m1Var, i10, obj, j10, j11);
        p3.a.e(m1Var);
        this.f16044j = j12;
    }

    public long g() {
        long j10 = this.f16044j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean h();
}
