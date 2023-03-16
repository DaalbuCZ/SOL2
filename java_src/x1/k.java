package x1;

import java.io.EOFException;
import s1.m1;
import x1.e0;
/* loaded from: classes.dex */
public final class k implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16273a = new byte[4096];

    @Override // x1.e0
    public int a(o3.i iVar, int i10, boolean z10, int i11) {
        int b10 = iVar.b(this.f16273a, 0, Math.min(this.f16273a.length, i10));
        if (b10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return b10;
    }

    @Override // x1.e0
    public void b(p3.a0 a0Var, int i10, int i11) {
        a0Var.P(i10);
    }

    @Override // x1.e0
    public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
    }

    @Override // x1.e0
    public /* synthetic */ void d(p3.a0 a0Var, int i10) {
        d0.b(this, a0Var, i10);
    }

    @Override // x1.e0
    public void e(m1 m1Var) {
    }

    @Override // x1.e0
    public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
        return d0.a(this, iVar, i10, z10);
    }
}
