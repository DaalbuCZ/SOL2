package x1;

import p3.m0;
import s1.h2;
/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f16277a;
    }

    private static boolean a(p3.a0 a0Var, v vVar, int i10) {
        int j10 = j(a0Var, i10);
        return j10 != -1 && j10 <= vVar.f16282b;
    }

    private static boolean b(p3.a0 a0Var, int i10) {
        return a0Var.C() == m0.u(a0Var.d(), i10, a0Var.e() - 1, 0);
    }

    private static boolean c(p3.a0 a0Var, v vVar, boolean z10, a aVar) {
        try {
            long J = a0Var.J();
            if (!z10) {
                J *= vVar.f16282b;
            }
            aVar.f16277a = J;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(p3.a0 a0Var, v vVar, int i10, a aVar) {
        int e10 = a0Var.e();
        long E = a0Var.E();
        long j10 = E >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((E >> 4) & 15), vVar) && f((int) ((E >> 1) & 7), vVar) && !(((E & 1) > 1L ? 1 : ((E & 1) == 1L ? 0 : -1)) == 0) && c(a0Var, vVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(a0Var, vVar, (int) ((E >> 12) & 15)) && e(a0Var, vVar, (int) ((E >> 8) & 15)) && b(a0Var, e10);
    }

    private static boolean e(p3.a0 a0Var, v vVar, int i10) {
        int i11 = vVar.f16285e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == vVar.f16286f;
        } else if (i10 == 12) {
            return a0Var.C() * 1000 == i11;
        } else if (i10 <= 14) {
            int I = a0Var.I();
            if (i10 == 14) {
                I *= 10;
            }
            return I == i11;
        } else {
            return false;
        }
    }

    private static boolean f(int i10, v vVar) {
        return i10 == 0 || i10 == vVar.f16289i;
    }

    private static boolean g(int i10, v vVar) {
        return i10 <= 7 ? i10 == vVar.f16287g - 1 : i10 <= 10 && vVar.f16287g == 2;
    }

    public static boolean h(m mVar, v vVar, int i10, a aVar) {
        long m10 = mVar.m();
        byte[] bArr = new byte[2];
        mVar.o(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            mVar.g();
            mVar.p((int) (m10 - mVar.q()));
            return false;
        }
        p3.a0 a0Var = new p3.a0(16);
        System.arraycopy(bArr, 0, a0Var.d(), 0, 2);
        a0Var.N(o.c(mVar, a0Var.d(), 2, 14));
        mVar.g();
        mVar.p((int) (m10 - mVar.q()));
        return d(a0Var, vVar, i10, aVar);
    }

    public static long i(m mVar, v vVar) {
        mVar.g();
        mVar.p(1);
        byte[] bArr = new byte[1];
        mVar.o(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        mVar.p(2);
        int i10 = z10 ? 7 : 6;
        p3.a0 a0Var = new p3.a0(i10);
        a0Var.N(o.c(mVar, a0Var.d(), 0, i10));
        mVar.g();
        a aVar = new a();
        if (c(a0Var, vVar, z10, aVar)) {
            return aVar.f16277a;
        }
        throw h2.a(null, null);
    }

    public static int j(p3.a0 a0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a0Var.C() + 1;
            case 7:
                return a0Var.I() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
