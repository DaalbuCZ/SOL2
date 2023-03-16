package x1;

import java.util.Arrays;
import java.util.List;
import s1.h2;
import x1.v;
/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public v f16278a;

        public a(v vVar) {
            this.f16278a = vVar;
        }
    }

    public static boolean a(m mVar) {
        p3.a0 a0Var = new p3.a0(4);
        mVar.o(a0Var.d(), 0, 4);
        return a0Var.E() == 1716281667;
    }

    public static int b(m mVar) {
        mVar.g();
        p3.a0 a0Var = new p3.a0(2);
        mVar.o(a0Var.d(), 0, 2);
        int I = a0Var.I();
        int i10 = I >> 2;
        mVar.g();
        if (i10 == 16382) {
            return I;
        }
        throw h2.a("First frame does not start with sync code.", null);
    }

    public static k2.a c(m mVar, boolean z10) {
        k2.a a10 = new y().a(mVar, z10 ? null : p2.h.f12222b);
        if (a10 == null || a10.d() == 0) {
            return null;
        }
        return a10;
    }

    public static k2.a d(m mVar, boolean z10) {
        mVar.g();
        long m10 = mVar.m();
        k2.a c10 = c(mVar, z10);
        mVar.h((int) (mVar.m() - m10));
        return c10;
    }

    public static boolean e(m mVar, a aVar) {
        v a10;
        mVar.g();
        p3.z zVar = new p3.z(new byte[4]);
        mVar.o(zVar.f12390a, 0, 4);
        boolean g10 = zVar.g();
        int h10 = zVar.h(7);
        int h11 = zVar.h(24) + 4;
        if (h10 == 0) {
            a10 = h(mVar);
        } else {
            v vVar = aVar.f16278a;
            if (vVar == null) {
                throw new IllegalArgumentException();
            }
            if (h10 == 3) {
                a10 = vVar.b(g(mVar, h11));
            } else if (h10 == 4) {
                a10 = vVar.c(j(mVar, h11));
            } else if (h10 != 6) {
                mVar.h(h11);
                return g10;
            } else {
                p3.a0 a0Var = new p3.a0(h11);
                mVar.readFully(a0Var.d(), 0, h11);
                a0Var.P(4);
                a10 = vVar.a(b5.q.K(n2.a.a(a0Var)));
            }
        }
        aVar.f16278a = a10;
        return g10;
    }

    public static v.a f(p3.a0 a0Var) {
        a0Var.P(1);
        int F = a0Var.F();
        long e10 = a0Var.e() + F;
        int i10 = F / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long v10 = a0Var.v();
            if (v10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = v10;
            jArr2[i11] = a0Var.v();
            a0Var.P(2);
            i11++;
        }
        a0Var.P((int) (e10 - a0Var.e()));
        return new v.a(jArr, jArr2);
    }

    private static v.a g(m mVar, int i10) {
        p3.a0 a0Var = new p3.a0(i10);
        mVar.readFully(a0Var.d(), 0, i10);
        return f(a0Var);
    }

    private static v h(m mVar) {
        byte[] bArr = new byte[38];
        mVar.readFully(bArr, 0, 38);
        return new v(bArr, 4);
    }

    public static void i(m mVar) {
        p3.a0 a0Var = new p3.a0(4);
        mVar.readFully(a0Var.d(), 0, 4);
        if (a0Var.E() != 1716281667) {
            throw h2.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(m mVar, int i10) {
        p3.a0 a0Var = new p3.a0(i10);
        mVar.readFully(a0Var.d(), 0, i10);
        a0Var.P(4);
        return Arrays.asList(h0.j(a0Var, false, false).f16239b);
    }
}
