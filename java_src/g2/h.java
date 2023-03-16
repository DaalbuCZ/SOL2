package g2;

import b5.q;
import g2.i;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p3.a0;
import s1.m1;
import u1.f0;
import x1.h0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f7498o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f7499p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    private boolean f7500n;

    private long n(byte[] bArr) {
        int i10;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArr[1] & 63;
        }
        int i14 = i11 >> 3;
        return i13 * (i14 >= 16 ? 2500 << i10 : i14 >= 12 ? 10000 << (i10 & 1) : (i14 & 3) == 3 ? 60000 : 10000 << i10);
    }

    private static boolean o(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int e10 = a0Var.e();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.j(bArr2, 0, bArr.length);
        a0Var.O(e10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean p(a0 a0Var) {
        return o(a0Var, f7498o);
    }

    @Override // g2.i
    protected long f(a0 a0Var) {
        return c(n(a0Var.d()));
    }

    @Override // g2.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        m1.b X;
        if (o(a0Var, f7498o)) {
            byte[] copyOf = Arrays.copyOf(a0Var.d(), a0Var.f());
            int c10 = f0.c(copyOf);
            List<byte[]> a10 = f0.a(copyOf);
            if (bVar.f7514a != null) {
                return true;
            }
            X = new m1.b().e0("audio/opus").H(c10).f0(48000).T(a10);
        } else {
            byte[] bArr = f7499p;
            if (!o(a0Var, bArr)) {
                p3.a.h(bVar.f7514a);
                return false;
            }
            p3.a.h(bVar.f7514a);
            if (this.f7500n) {
                return true;
            }
            this.f7500n = true;
            a0Var.P(bArr.length);
            k2.a c11 = h0.c(q.G(h0.j(a0Var, false, false).f16239b));
            if (c11 == null) {
                return true;
            }
            X = bVar.f7514a.b().X(c11.b(bVar.f7514a.f13585w));
        }
        bVar.f7514a = X.E();
        return true;
    }

    @Override // g2.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f7500n = false;
        }
    }
}
