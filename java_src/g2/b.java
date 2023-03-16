package g2;

import g2.i;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p3.a0;
import p3.m0;
import x1.b0;
import x1.m;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private v f7471n;

    /* renamed from: o  reason: collision with root package name */
    private a f7472o;

    /* loaded from: classes.dex */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private v f7473a;

        /* renamed from: b  reason: collision with root package name */
        private v.a f7474b;

        /* renamed from: c  reason: collision with root package name */
        private long f7475c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f7476d = -1;

        public a(v vVar, v.a aVar) {
            this.f7473a = vVar;
            this.f7474b = aVar;
        }

        @Override // g2.g
        public b0 a() {
            p3.a.f(this.f7475c != -1);
            return new u(this.f7473a, this.f7475c);
        }

        @Override // g2.g
        public long b(m mVar) {
            long j10 = this.f7476d;
            if (j10 >= 0) {
                long j11 = -(j10 + 2);
                this.f7476d = -1L;
                return j11;
            }
            return -1L;
        }

        @Override // g2.g
        public void c(long j10) {
            long[] jArr = this.f7474b.f16293a;
            this.f7476d = jArr[m0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f7475c = j10;
        }
    }

    private int n(a0 a0Var) {
        int i10 = (a0Var.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            a0Var.P(4);
            a0Var.J();
        }
        int j10 = s.j(a0Var, i10);
        a0Var.O(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.C() == 127 && a0Var.E() == 1179402563;
    }

    @Override // g2.i
    protected long f(a0 a0Var) {
        if (o(a0Var.d())) {
            return n(a0Var);
        }
        return -1L;
    }

    @Override // g2.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        byte[] d10 = a0Var.d();
        v vVar = this.f7471n;
        if (vVar == null) {
            v vVar2 = new v(d10, 17);
            this.f7471n = vVar2;
            bVar.f7514a = vVar2.g(Arrays.copyOfRange(d10, 9, a0Var.f()), null);
            return true;
        } else if ((d10[0] & Byte.MAX_VALUE) == 3) {
            v.a f10 = t.f(a0Var);
            v b10 = vVar.b(f10);
            this.f7471n = b10;
            this.f7472o = new a(b10, f10);
            return true;
        } else if (o(d10)) {
            a aVar = this.f7472o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f7515b = this.f7472o;
            }
            p3.a.e(bVar.f7514a);
            return false;
        } else {
            return true;
        }
    }

    @Override // g2.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f7471n = null;
            this.f7472o = null;
        }
    }
}
