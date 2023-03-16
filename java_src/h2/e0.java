package h2;

import p3.m0;
import x1.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 extends x1.a {

    /* loaded from: classes.dex */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final p3.i0 f7759a;

        /* renamed from: b  reason: collision with root package name */
        private final p3.a0 f7760b = new p3.a0();

        /* renamed from: c  reason: collision with root package name */
        private final int f7761c;

        /* renamed from: d  reason: collision with root package name */
        private final int f7762d;

        public a(int i10, p3.i0 i0Var, int i11) {
            this.f7761c = i10;
            this.f7759a = i0Var;
            this.f7762d = i11;
        }

        private a.e c(p3.a0 a0Var, long j10, long j11) {
            int a10;
            int a11;
            int f10 = a0Var.f();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (a11 = (a10 = j0.a(a0Var.d(), a0Var.e(), f10)) + 188) <= f10) {
                long c10 = j0.c(a0Var, a10, this.f7761c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f7759a.b(c10);
                    if (b10 > j10) {
                        return j14 == -9223372036854775807L ? a.e.d(b10, j11) : a.e.e(j11 + j13);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j11 + a10);
                    } else {
                        j13 = a10;
                        j14 = b10;
                    }
                }
                a0Var.O(a11);
                j12 = a11;
            }
            return j14 != -9223372036854775807L ? a.e.f(j14, j11 + j12) : a.e.f16184d;
        }

        @Override // x1.a.f
        public a.e a(x1.m mVar, long j10) {
            long q10 = mVar.q();
            int min = (int) Math.min(this.f7762d, mVar.a() - q10);
            this.f7760b.K(min);
            mVar.o(this.f7760b.d(), 0, min);
            return c(this.f7760b, j10, q10);
        }

        @Override // x1.a.f
        public void b() {
            this.f7760b.L(m0.f12311f);
        }
    }

    public e0(p3.i0 i0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, i0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
