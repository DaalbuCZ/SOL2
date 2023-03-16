package x1;
/* loaded from: classes.dex */
public final class c {
    public static void a(long j10, p3.a0 a0Var, e0[] e0VarArr) {
        while (true) {
            if (a0Var.a() <= 1) {
                return;
            }
            int c10 = c(a0Var);
            int c11 = c(a0Var);
            int e10 = a0Var.e() + c11;
            if (c11 == -1 || c11 > a0Var.a()) {
                p3.r.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                e10 = a0Var.f();
            } else if (c10 == 4 && c11 >= 8) {
                int C = a0Var.C();
                int I = a0Var.I();
                int m10 = I == 49 ? a0Var.m() : 0;
                int C2 = a0Var.C();
                if (I == 47) {
                    a0Var.P(1);
                }
                boolean z10 = C == 181 && (I == 49 || I == 47) && C2 == 3;
                if (I == 49) {
                    z10 &= m10 == 1195456820;
                }
                if (z10) {
                    b(j10, a0Var, e0VarArr);
                }
            }
            a0Var.O(e10);
        }
    }

    public static void b(long j10, p3.a0 a0Var, e0[] e0VarArr) {
        int C = a0Var.C();
        if ((C & 64) != 0) {
            a0Var.P(1);
            int i10 = (C & 31) * 3;
            int e10 = a0Var.e();
            for (e0 e0Var : e0VarArr) {
                a0Var.O(e10);
                e0Var.d(a0Var, i10);
                if (j10 != -9223372036854775807L) {
                    e0Var.c(j10, 1, i10, 0, null);
                }
            }
        }
    }

    private static int c(p3.a0 a0Var) {
        int i10 = 0;
        while (a0Var.a() != 0) {
            int C = a0Var.C();
            i10 += C;
            if (C != 255) {
                return i10;
            }
        }
        return -1;
    }
}
