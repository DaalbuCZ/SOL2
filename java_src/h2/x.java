package h2;

import p3.m0;
import x1.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends x1.a {

    /* loaded from: classes.dex */
    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final p3.i0 f8065a;

        /* renamed from: b  reason: collision with root package name */
        private final p3.a0 f8066b;

        private b(p3.i0 i0Var) {
            this.f8065a = i0Var;
            this.f8066b = new p3.a0();
        }

        private a.e c(p3.a0 a0Var, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (a0Var.a() >= 4) {
                if (x.k(a0Var.d(), a0Var.e()) != 442) {
                    a0Var.P(1);
                } else {
                    a0Var.P(4);
                    long l10 = y.l(a0Var);
                    if (l10 != -9223372036854775807L) {
                        long b10 = this.f8065a.b(l10);
                        if (b10 > j10) {
                            return j12 == -9223372036854775807L ? a.e.d(b10, j11) : a.e.e(j11 + i11);
                        } else if (100000 + b10 > j10) {
                            return a.e.e(j11 + a0Var.e());
                        } else {
                            i11 = a0Var.e();
                            j12 = b10;
                        }
                    }
                    d(a0Var);
                    i10 = a0Var.e();
                }
            }
            return j12 != -9223372036854775807L ? a.e.f(j12, j11 + i10) : a.e.f16184d;
        }

        private static void d(p3.a0 a0Var) {
            int k10;
            int f10 = a0Var.f();
            if (a0Var.a() < 10) {
                a0Var.O(f10);
                return;
            }
            a0Var.P(9);
            int C = a0Var.C() & 7;
            if (a0Var.a() < C) {
                a0Var.O(f10);
                return;
            }
            a0Var.P(C);
            if (a0Var.a() < 4) {
                a0Var.O(f10);
                return;
            }
            if (x.k(a0Var.d(), a0Var.e()) == 443) {
                a0Var.P(4);
                int I = a0Var.I();
                if (a0Var.a() < I) {
                    a0Var.O(f10);
                    return;
                }
                a0Var.P(I);
            }
            while (a0Var.a() >= 4 && (k10 = x.k(a0Var.d(), a0Var.e())) != 442 && k10 != 441 && (k10 >>> 8) == 1) {
                a0Var.P(4);
                if (a0Var.a() < 2) {
                    a0Var.O(f10);
                    return;
                }
                a0Var.O(Math.min(a0Var.f(), a0Var.e() + a0Var.I()));
            }
        }

        @Override // x1.a.f
        public a.e a(x1.m mVar, long j10) {
            long q10 = mVar.q();
            int min = (int) Math.min(20000L, mVar.a() - q10);
            this.f8066b.K(min);
            mVar.o(this.f8066b.d(), 0, min);
            return c(this.f8066b, j10, q10);
        }

        @Override // x1.a.f
        public void b() {
            this.f8066b.L(m0.f12311f);
        }
    }

    public x(p3.i0 i0Var, long j10, long j11) {
        super(new a.b(), new b(i0Var), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
