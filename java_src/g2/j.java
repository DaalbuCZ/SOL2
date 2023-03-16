package g2;

import b5.q;
import g2.i;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p3.a0;
import s1.h2;
import s1.m1;
import x1.h0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f7516n;

    /* renamed from: o  reason: collision with root package name */
    private int f7517o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7518p;

    /* renamed from: q  reason: collision with root package name */
    private h0.d f7519q;

    /* renamed from: r  reason: collision with root package name */
    private h0.b f7520r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h0.d f7521a;

        /* renamed from: b  reason: collision with root package name */
        public final h0.b f7522b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7523c;

        /* renamed from: d  reason: collision with root package name */
        public final h0.c[] f7524d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7525e;

        public a(h0.d dVar, h0.b bVar, byte[] bArr, h0.c[] cVarArr, int i10) {
            this.f7521a = dVar;
            this.f7522b = bVar;
            this.f7523c = bArr;
            this.f7524d = cVarArr;
            this.f7525e = i10;
        }
    }

    static void n(a0 a0Var, long j10) {
        if (a0Var.b() < a0Var.f() + 4) {
            a0Var.L(Arrays.copyOf(a0Var.d(), a0Var.f() + 4));
        } else {
            a0Var.N(a0Var.f() + 4);
        }
        byte[] d10 = a0Var.d();
        d10[a0Var.f() - 4] = (byte) (j10 & 255);
        d10[a0Var.f() - 3] = (byte) ((j10 >>> 8) & 255);
        d10[a0Var.f() - 2] = (byte) ((j10 >>> 16) & 255);
        d10[a0Var.f() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f7524d[p(b10, aVar.f7525e, 1)].f16241a ? aVar.f7521a.f16251g : aVar.f7521a.f16252h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(a0 a0Var) {
        try {
            return h0.m(1, a0Var, true);
        } catch (h2 unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.i
    public void e(long j10) {
        super.e(j10);
        this.f7518p = j10 != 0;
        h0.d dVar = this.f7519q;
        this.f7517o = dVar != null ? dVar.f16251g : 0;
    }

    @Override // g2.i
    protected long f(a0 a0Var) {
        if ((a0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int o10 = o(a0Var.d()[0], (a) p3.a.h(this.f7516n));
        long j10 = this.f7518p ? (this.f7517o + o10) / 4 : 0;
        n(a0Var, j10);
        this.f7518p = true;
        this.f7517o = o10;
        return j10;
    }

    @Override // g2.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        if (this.f7516n != null) {
            p3.a.e(bVar.f7514a);
            return false;
        }
        a q10 = q(a0Var);
        this.f7516n = q10;
        if (q10 == null) {
            return true;
        }
        h0.d dVar = q10.f7521a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f16254j);
        arrayList.add(q10.f7523c);
        bVar.f7514a = new m1.b().e0("audio/vorbis").G(dVar.f16249e).Z(dVar.f16248d).H(dVar.f16246b).f0(dVar.f16247c).T(arrayList).X(h0.c(q.G(q10.f7522b.f16239b))).E();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f7516n = null;
            this.f7519q = null;
            this.f7520r = null;
        }
        this.f7517o = 0;
        this.f7518p = false;
    }

    a q(a0 a0Var) {
        h0.d dVar = this.f7519q;
        if (dVar == null) {
            this.f7519q = h0.k(a0Var);
            return null;
        }
        h0.b bVar = this.f7520r;
        if (bVar == null) {
            this.f7520r = h0.i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.f()];
        System.arraycopy(a0Var.d(), 0, bArr, 0, a0Var.f());
        h0.c[] l10 = h0.l(a0Var, dVar.f16246b);
        return new a(dVar, bVar, bArr, l10, h0.a(l10.length - 1));
    }
}
