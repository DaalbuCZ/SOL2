package i2;

import android.util.Pair;
import p3.a0;
import p3.m0;
import p3.r;
import s1.h2;
import x1.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8277a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8278b;

        private a(int i10, long j10) {
            this.f8277a = i10;
            this.f8278b = j10;
        }

        public static a a(m mVar, a0 a0Var) {
            mVar.o(a0Var.d(), 0, 8);
            a0Var.O(0);
            return new a(a0Var.m(), a0Var.s());
        }
    }

    public static boolean a(m mVar) {
        a0 a0Var = new a0(8);
        int i10 = a.a(mVar, a0Var).f8277a;
        if (i10 == 1380533830 || i10 == 1380333108) {
            mVar.o(a0Var.d(), 0, 4);
            a0Var.O(0);
            int m10 = a0Var.m();
            if (m10 != 1463899717) {
                r.c("WavHeaderReader", "Unsupported form type: " + m10);
                return false;
            }
            return true;
        }
        return false;
    }

    public static c b(m mVar) {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a d10 = d(1718449184, mVar, a0Var);
        p3.a.f(d10.f8278b >= 16);
        mVar.o(a0Var.d(), 0, 16);
        a0Var.O(0);
        int u10 = a0Var.u();
        int u11 = a0Var.u();
        int t10 = a0Var.t();
        int t11 = a0Var.t();
        int u12 = a0Var.u();
        int u13 = a0Var.u();
        int i10 = ((int) d10.f8278b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            mVar.o(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = m0.f12311f;
        }
        mVar.h((int) (mVar.m() - mVar.q()));
        return new c(u10, u11, t10, t11, u12, u13, bArr);
    }

    public static long c(m mVar) {
        a0 a0Var = new a0(8);
        a a10 = a.a(mVar, a0Var);
        if (a10.f8277a != 1685272116) {
            mVar.g();
            return -1L;
        }
        mVar.p(8);
        a0Var.O(0);
        mVar.o(a0Var.d(), 0, 8);
        long q10 = a0Var.q();
        mVar.h(((int) a10.f8278b) + 8);
        return q10;
    }

    private static a d(int i10, m mVar, a0 a0Var) {
        while (true) {
            a a10 = a.a(mVar, a0Var);
            if (a10.f8277a == i10) {
                return a10;
            }
            r.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f8277a);
            long j10 = a10.f8278b + 8;
            if (j10 > 2147483647L) {
                throw h2.d("Chunk is too large (~2GB+) to skip; id: " + a10.f8277a);
            }
            mVar.h((int) j10);
        }
    }

    public static Pair<Long, Long> e(m mVar) {
        mVar.g();
        a d10 = d(1684108385, mVar, new a0(8));
        mVar.h(8);
        return Pair.create(Long.valueOf(mVar.q()), Long.valueOf(d10.f8278b));
    }
}
