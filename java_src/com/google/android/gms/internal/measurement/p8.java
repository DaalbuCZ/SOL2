package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class p8 extends w7 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f4063b = Logger.getLogger(p8.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f4064c = bc.C();

    /* renamed from: a  reason: collision with root package name */
    q8 f4065a;

    private p8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p8(o8 o8Var) {
    }

    public static int A(t9 t9Var) {
        int a10 = t9Var.a();
        return a(a10) + a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(oa oaVar, za zaVar) {
        int a10 = ((q7) oaVar).a(zaVar);
        return a(a10) + a10;
    }

    public static int C(String str) {
        int length;
        try {
            length = hc.c(str);
        } catch (gc unused) {
            length = str.getBytes(p9.f4067b).length;
        }
        return a(length) + length;
    }

    public static int D(int i10) {
        return a(i10 << 3);
    }

    public static int a(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static p8 c(byte[] bArr) {
        return new m8(bArr, 0, bArr.length);
    }

    public static int x(h8 h8Var) {
        int h10 = h8Var.h();
        return a(h10) + h10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int y(int i10, oa oaVar, za zaVar) {
        int a10 = a(i10 << 3);
        return a10 + a10 + ((q7) oaVar).a(zaVar);
    }

    public static int z(int i10) {
        if (i10 >= 0) {
            return a(i10);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, gc gcVar) {
        f4063b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) gcVar);
        byte[] bytes = str.getBytes(p9.f4067b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new n8(e10);
        }
    }

    public abstract int g();

    public abstract void h(byte b10);

    public abstract void i(int i10, boolean z10);

    public abstract void j(int i10, h8 h8Var);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10);

    public abstract void m(int i10, long j10);

    public abstract void n(long j10);

    public abstract void o(int i10, int i11);

    public abstract void p(int i10);

    public abstract void q(byte[] bArr, int i10, int i11);

    public abstract void r(int i10, String str);

    public abstract void s(int i10, int i11);

    public abstract void t(int i10, int i11);

    public abstract void u(int i10);

    public abstract void v(int i10, long j10);

    public abstract void w(long j10);
}
