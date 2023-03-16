package e2;

import p3.m0;
import p3.s;
import x1.b0;
import x1.c0;
/* loaded from: classes.dex */
final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f6640a;

    /* renamed from: b  reason: collision with root package name */
    private final s f6641b;

    /* renamed from: c  reason: collision with root package name */
    private final s f6642c;

    /* renamed from: d  reason: collision with root package name */
    private long f6643d;

    public b(long j10, long j11, long j12) {
        this.f6643d = j10;
        this.f6640a = j12;
        s sVar = new s();
        this.f6641b = sVar;
        s sVar2 = new s();
        this.f6642c = sVar2;
        sVar.a(0L);
        sVar2.a(j11);
    }

    public boolean a(long j10) {
        s sVar = this.f6641b;
        return j10 - sVar.b(sVar.c() - 1) < 100000;
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f6641b.a(j10);
        this.f6642c.a(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10) {
        this.f6643d = j10;
    }

    @Override // e2.g
    public long d(long j10) {
        return this.f6641b.b(m0.g(this.f6642c, j10, true, true));
    }

    @Override // e2.g
    public long e() {
        return this.f6640a;
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        int g10 = m0.g(this.f6641b, j10, true, true);
        c0 c0Var = new c0(this.f6641b.b(g10), this.f6642c.b(g10));
        if (c0Var.f16194a == j10 || g10 == this.f6641b.c() - 1) {
            return new b0.a(c0Var);
        }
        int i10 = g10 + 1;
        return new b0.a(c0Var, new c0(this.f6641b.b(i10), this.f6642c.b(i10)));
    }

    @Override // x1.b0
    public long h() {
        return this.f6643d;
    }
}
