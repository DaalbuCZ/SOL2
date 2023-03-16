package h2;

import h2.i0;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import s1.m1;
import u1.a;
/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f7827v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7828a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.z f7829b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f7830c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7831d;

    /* renamed from: e  reason: collision with root package name */
    private String f7832e;

    /* renamed from: f  reason: collision with root package name */
    private x1.e0 f7833f;

    /* renamed from: g  reason: collision with root package name */
    private x1.e0 f7834g;

    /* renamed from: h  reason: collision with root package name */
    private int f7835h;

    /* renamed from: i  reason: collision with root package name */
    private int f7836i;

    /* renamed from: j  reason: collision with root package name */
    private int f7837j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7838k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7839l;

    /* renamed from: m  reason: collision with root package name */
    private int f7840m;

    /* renamed from: n  reason: collision with root package name */
    private int f7841n;

    /* renamed from: o  reason: collision with root package name */
    private int f7842o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7843p;

    /* renamed from: q  reason: collision with root package name */
    private long f7844q;

    /* renamed from: r  reason: collision with root package name */
    private int f7845r;

    /* renamed from: s  reason: collision with root package name */
    private long f7846s;

    /* renamed from: t  reason: collision with root package name */
    private x1.e0 f7847t;

    /* renamed from: u  reason: collision with root package name */
    private long f7848u;

    public i(boolean z10) {
        this(z10, null);
    }

    public i(boolean z10, String str) {
        this.f7829b = new p3.z(new byte[7]);
        this.f7830c = new p3.a0(Arrays.copyOf(f7827v, 10));
        s();
        this.f7840m = -1;
        this.f7841n = -1;
        this.f7844q = -9223372036854775807L;
        this.f7846s = -9223372036854775807L;
        this.f7828a = z10;
        this.f7831d = str;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void f() {
        p3.a.e(this.f7833f);
        m0.j(this.f7847t);
        m0.j(this.f7834g);
    }

    private void g(p3.a0 a0Var) {
        if (a0Var.a() == 0) {
            return;
        }
        this.f7829b.f12390a[0] = a0Var.d()[a0Var.e()];
        this.f7829b.p(2);
        int h10 = this.f7829b.h(4);
        int i10 = this.f7841n;
        if (i10 != -1 && h10 != i10) {
            q();
            return;
        }
        if (!this.f7839l) {
            this.f7839l = true;
            this.f7840m = this.f7842o;
            this.f7841n = h10;
        }
        t();
    }

    private boolean h(p3.a0 a0Var, int i10) {
        a0Var.O(i10 + 1);
        if (w(a0Var, this.f7829b.f12390a, 1)) {
            this.f7829b.p(4);
            int h10 = this.f7829b.h(1);
            int i11 = this.f7840m;
            if (i11 == -1 || h10 == i11) {
                if (this.f7841n != -1) {
                    if (!w(a0Var, this.f7829b.f12390a, 1)) {
                        return true;
                    }
                    this.f7829b.p(2);
                    if (this.f7829b.h(4) != this.f7841n) {
                        return false;
                    }
                    a0Var.O(i10 + 2);
                }
                if (w(a0Var, this.f7829b.f12390a, 4)) {
                    this.f7829b.p(14);
                    int h11 = this.f7829b.h(13);
                    if (h11 < 7) {
                        return false;
                    }
                    byte[] d10 = a0Var.d();
                    int f10 = a0Var.f();
                    int i12 = i10 + h11;
                    if (i12 >= f10) {
                        return true;
                    }
                    if (d10[i12] == -1) {
                        int i13 = i12 + 1;
                        if (i13 == f10) {
                            return true;
                        }
                        return l((byte) -1, d10[i13]) && ((d10[i13] & 8) >> 3) == h10;
                    } else if (d10[i12] != 73) {
                        return false;
                    } else {
                        int i14 = i12 + 1;
                        if (i14 == f10) {
                            return true;
                        }
                        if (d10[i14] != 68) {
                            return false;
                        }
                        int i15 = i12 + 2;
                        return i15 == f10 || d10[i15] == 51;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean i(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f7836i);
        a0Var.j(bArr, this.f7836i, min);
        int i11 = this.f7836i + min;
        this.f7836i = i11;
        return i11 == i10;
    }

    private void j(p3.a0 a0Var) {
        int i10;
        byte[] d10 = a0Var.d();
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        while (e10 < f10) {
            int i11 = e10 + 1;
            int i12 = d10[e10] & 255;
            if (this.f7837j == 512 && l((byte) -1, (byte) i12) && (this.f7839l || h(a0Var, i11 - 2))) {
                this.f7842o = (i12 & 8) >> 3;
                this.f7838k = (i12 & 1) == 0;
                if (this.f7839l) {
                    t();
                } else {
                    r();
                }
                a0Var.O(i11);
                return;
            }
            int i13 = this.f7837j;
            int i14 = i12 | i13;
            if (i14 != 329) {
                if (i14 == 511) {
                    this.f7837j = 512;
                } else if (i14 == 836) {
                    i10 = 1024;
                } else if (i14 == 1075) {
                    u();
                    a0Var.O(i11);
                    return;
                } else if (i13 != 256) {
                    this.f7837j = 256;
                    i11--;
                }
                e10 = i11;
            } else {
                i10 = 768;
            }
            this.f7837j = i10;
            e10 = i11;
        }
        a0Var.O(e10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @RequiresNonNull({"output"})
    private void n() {
        this.f7829b.p(0);
        if (this.f7843p) {
            this.f7829b.r(10);
        } else {
            int h10 = this.f7829b.h(2) + 1;
            if (h10 != 2) {
                p3.r.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
                h10 = 2;
            }
            this.f7829b.r(5);
            byte[] b10 = u1.a.b(h10, this.f7841n, this.f7829b.h(3));
            a.b f10 = u1.a.f(b10);
            m1 E = new m1.b().S(this.f7832e).e0("audio/mp4a-latm").I(f10.f14865c).H(f10.f14864b).f0(f10.f14863a).T(Collections.singletonList(b10)).V(this.f7831d).E();
            this.f7844q = 1024000000 / E.M;
            this.f7833f.e(E);
            this.f7843p = true;
        }
        this.f7829b.r(4);
        int h11 = (this.f7829b.h(13) - 2) - 5;
        if (this.f7838k) {
            h11 -= 2;
        }
        v(this.f7833f, this.f7844q, 0, h11);
    }

    @RequiresNonNull({"id3Output"})
    private void o() {
        this.f7834g.d(this.f7830c, 10);
        this.f7830c.O(6);
        v(this.f7834g, 0L, 10, this.f7830c.B() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    private void p(p3.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f7845r - this.f7836i);
        this.f7847t.d(a0Var, min);
        int i10 = this.f7836i + min;
        this.f7836i = i10;
        int i11 = this.f7845r;
        if (i10 == i11) {
            long j10 = this.f7846s;
            if (j10 != -9223372036854775807L) {
                this.f7847t.c(j10, 1, i11, 0, null);
                this.f7846s += this.f7848u;
            }
            s();
        }
    }

    private void q() {
        this.f7839l = false;
        s();
    }

    private void r() {
        this.f7835h = 1;
        this.f7836i = 0;
    }

    private void s() {
        this.f7835h = 0;
        this.f7836i = 0;
        this.f7837j = 256;
    }

    private void t() {
        this.f7835h = 3;
        this.f7836i = 0;
    }

    private void u() {
        this.f7835h = 2;
        this.f7836i = f7827v.length;
        this.f7845r = 0;
        this.f7830c.O(0);
    }

    private void v(x1.e0 e0Var, long j10, int i10, int i11) {
        this.f7835h = 4;
        this.f7836i = i10;
        this.f7847t = e0Var;
        this.f7848u = j10;
        this.f7845r = i11;
    }

    private boolean w(p3.a0 a0Var, byte[] bArr, int i10) {
        if (a0Var.a() < i10) {
            return false;
        }
        a0Var.j(bArr, 0, i10);
        return true;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        f();
        while (a0Var.a() > 0) {
            int i10 = this.f7835h;
            if (i10 == 0) {
                j(a0Var);
            } else if (i10 == 1) {
                g(a0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(a0Var, this.f7829b.f12390a, this.f7838k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 != 4) {
                    throw new IllegalStateException();
                } else {
                    p(a0Var);
                }
            } else if (i(a0Var, this.f7830c.d(), 10)) {
                o();
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f7846s = -9223372036854775807L;
        q();
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7832e = dVar.b();
        x1.e0 e10 = nVar.e(dVar.c(), 1);
        this.f7833f = e10;
        this.f7847t = e10;
        if (!this.f7828a) {
            this.f7834g = new x1.k();
            return;
        }
        dVar.a();
        x1.e0 e11 = nVar.e(dVar.c(), 5);
        this.f7834g = e11;
        e11.e(new m1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7846s = j10;
        }
    }

    public long k() {
        return this.f7844q;
    }
}
