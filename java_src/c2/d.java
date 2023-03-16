package c2;

import x1.b0;
import x1.c0;
import x1.e0;
import x1.n;
/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: n  reason: collision with root package name */
    private final long f3143n;

    /* renamed from: o  reason: collision with root package name */
    private final n f3144o;

    /* loaded from: classes.dex */
    class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f3145a;

        a(b0 b0Var) {
            this.f3145a = b0Var;
        }

        @Override // x1.b0
        public boolean f() {
            return this.f3145a.f();
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            b0.a g10 = this.f3145a.g(j10);
            c0 c0Var = g10.f16189a;
            c0 c0Var2 = new c0(c0Var.f16194a, c0Var.f16195b + d.this.f3143n);
            c0 c0Var3 = g10.f16190b;
            return new b0.a(c0Var2, new c0(c0Var3.f16194a, c0Var3.f16195b + d.this.f3143n));
        }

        @Override // x1.b0
        public long h() {
            return this.f3145a.h();
        }
    }

    public d(long j10, n nVar) {
        this.f3143n = j10;
        this.f3144o = nVar;
    }

    @Override // x1.n
    public e0 e(int i10, int i11) {
        return this.f3144o.e(i10, i11);
    }

    @Override // x1.n
    public void i() {
        this.f3144o.i();
    }

    @Override // x1.n
    public void t(b0 b0Var) {
        this.f3144o.t(new a(b0Var));
    }
}
