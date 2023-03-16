package x1;

import p3.m0;
import x1.b0;
import x1.v;
/* loaded from: classes.dex */
public final class u implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final v f16279a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16280b;

    public u(v vVar, long j10) {
        this.f16279a = vVar;
        this.f16280b = j10;
    }

    private c0 a(long j10, long j11) {
        return new c0((j10 * 1000000) / this.f16279a.f16285e, this.f16280b + j11);
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        p3.a.h(this.f16279a.f16291k);
        v vVar = this.f16279a;
        v.a aVar = vVar.f16291k;
        long[] jArr = aVar.f16293a;
        long[] jArr2 = aVar.f16294b;
        int i10 = m0.i(jArr, vVar.i(j10), true, false);
        c0 a10 = a(i10 == -1 ? 0L : jArr[i10], i10 != -1 ? jArr2[i10] : 0L);
        if (a10.f16194a == j10 || i10 == jArr.length - 1) {
            return new b0.a(a10);
        }
        int i11 = i10 + 1;
        return new b0.a(a10, a(jArr[i11], jArr2[i11]));
    }

    @Override // x1.b0
    public long h() {
        return this.f16279a.f();
    }
}
