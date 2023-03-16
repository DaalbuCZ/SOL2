package h2;

import h2.i0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.h2;
import s1.m1;
import u1.a;
/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f8012a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f8013b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.z f8014c;

    /* renamed from: d  reason: collision with root package name */
    private x1.e0 f8015d;

    /* renamed from: e  reason: collision with root package name */
    private String f8016e;

    /* renamed from: f  reason: collision with root package name */
    private m1 f8017f;

    /* renamed from: g  reason: collision with root package name */
    private int f8018g;

    /* renamed from: h  reason: collision with root package name */
    private int f8019h;

    /* renamed from: i  reason: collision with root package name */
    private int f8020i;

    /* renamed from: j  reason: collision with root package name */
    private int f8021j;

    /* renamed from: k  reason: collision with root package name */
    private long f8022k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8023l;

    /* renamed from: m  reason: collision with root package name */
    private int f8024m;

    /* renamed from: n  reason: collision with root package name */
    private int f8025n;

    /* renamed from: o  reason: collision with root package name */
    private int f8026o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8027p;

    /* renamed from: q  reason: collision with root package name */
    private long f8028q;

    /* renamed from: r  reason: collision with root package name */
    private int f8029r;

    /* renamed from: s  reason: collision with root package name */
    private long f8030s;

    /* renamed from: t  reason: collision with root package name */
    private int f8031t;

    /* renamed from: u  reason: collision with root package name */
    private String f8032u;

    public s(String str) {
        this.f8012a = str;
        p3.a0 a0Var = new p3.a0(1024);
        this.f8013b = a0Var;
        this.f8014c = new p3.z(a0Var.d());
        this.f8022k = -9223372036854775807L;
    }

    private static long f(p3.z zVar) {
        return zVar.h((zVar.h(2) + 1) * 8);
    }

    @RequiresNonNull({"output"})
    private void g(p3.z zVar) {
        if (!zVar.g()) {
            this.f8023l = true;
            l(zVar);
        } else if (!this.f8023l) {
            return;
        }
        if (this.f8024m != 0) {
            throw h2.a(null, null);
        }
        if (this.f8025n != 0) {
            throw h2.a(null, null);
        }
        k(zVar, j(zVar));
        if (this.f8027p) {
            zVar.r((int) this.f8028q);
        }
    }

    private int h(p3.z zVar) {
        int b10 = zVar.b();
        a.b e10 = u1.a.e(zVar, true);
        this.f8032u = e10.f14865c;
        this.f8029r = e10.f14863a;
        this.f8031t = e10.f14864b;
        return b10 - zVar.b();
    }

    private void i(p3.z zVar) {
        int i10;
        int h10 = zVar.h(3);
        this.f8026o = h10;
        if (h10 == 0) {
            i10 = 8;
        } else if (h10 != 1) {
            if (h10 == 3 || h10 == 4 || h10 == 5) {
                zVar.r(6);
                return;
            } else if (h10 != 6 && h10 != 7) {
                throw new IllegalStateException();
            } else {
                zVar.r(1);
                return;
            }
        } else {
            i10 = 9;
        }
        zVar.r(i10);
    }

    private int j(p3.z zVar) {
        int h10;
        if (this.f8026o == 0) {
            int i10 = 0;
            do {
                h10 = zVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw h2.a(null, null);
    }

    @RequiresNonNull({"output"})
    private void k(p3.z zVar, int i10) {
        int e10 = zVar.e();
        if ((e10 & 7) == 0) {
            this.f8013b.O(e10 >> 3);
        } else {
            zVar.i(this.f8013b.d(), 0, i10 * 8);
            this.f8013b.O(0);
        }
        this.f8015d.d(this.f8013b, i10);
        long j10 = this.f8022k;
        if (j10 != -9223372036854775807L) {
            this.f8015d.c(j10, 1, i10, 0, null);
            this.f8022k += this.f8030s;
        }
    }

    @RequiresNonNull({"output"})
    private void l(p3.z zVar) {
        boolean g10;
        int h10 = zVar.h(1);
        int h11 = h10 == 1 ? zVar.h(1) : 0;
        this.f8024m = h11;
        if (h11 != 0) {
            throw h2.a(null, null);
        }
        if (h10 == 1) {
            f(zVar);
        }
        if (!zVar.g()) {
            throw h2.a(null, null);
        }
        this.f8025n = zVar.h(6);
        int h12 = zVar.h(4);
        int h13 = zVar.h(3);
        if (h12 != 0 || h13 != 0) {
            throw h2.a(null, null);
        }
        if (h10 == 0) {
            int e10 = zVar.e();
            int h14 = h(zVar);
            zVar.p(e10);
            byte[] bArr = new byte[(h14 + 7) / 8];
            zVar.i(bArr, 0, h14);
            m1 E = new m1.b().S(this.f8016e).e0("audio/mp4a-latm").I(this.f8032u).H(this.f8031t).f0(this.f8029r).T(Collections.singletonList(bArr)).V(this.f8012a).E();
            if (!E.equals(this.f8017f)) {
                this.f8017f = E;
                this.f8030s = 1024000000 / E.M;
                this.f8015d.e(E);
            }
        } else {
            zVar.r(((int) f(zVar)) - h(zVar));
        }
        i(zVar);
        boolean g11 = zVar.g();
        this.f8027p = g11;
        this.f8028q = 0L;
        if (g11) {
            if (h10 == 1) {
                this.f8028q = f(zVar);
            } else {
                do {
                    g10 = zVar.g();
                    this.f8028q = (this.f8028q << 8) + zVar.h(8);
                } while (g10);
            }
        }
        if (zVar.g()) {
            zVar.r(8);
        }
    }

    private void m(int i10) {
        this.f8013b.K(i10);
        this.f8014c.n(this.f8013b.d());
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f8015d);
        while (a0Var.a() > 0) {
            int i10 = this.f8018g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int C = a0Var.C();
                    if ((C & 224) == 224) {
                        this.f8021j = C;
                        this.f8018g = 2;
                    } else if (C != 86) {
                        this.f8018g = 0;
                    }
                } else if (i10 == 2) {
                    int C2 = ((this.f8021j & (-225)) << 8) | a0Var.C();
                    this.f8020i = C2;
                    if (C2 > this.f8013b.d().length) {
                        m(this.f8020i);
                    }
                    this.f8019h = 0;
                    this.f8018g = 3;
                } else if (i10 != 3) {
                    throw new IllegalStateException();
                } else {
                    int min = Math.min(a0Var.a(), this.f8020i - this.f8019h);
                    a0Var.j(this.f8014c.f12390a, this.f8019h, min);
                    int i11 = this.f8019h + min;
                    this.f8019h = i11;
                    if (i11 == this.f8020i) {
                        this.f8014c.p(0);
                        g(this.f8014c);
                        this.f8018g = 0;
                    }
                }
            } else if (a0Var.C() == 86) {
                this.f8018g = 1;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f8018g = 0;
        this.f8022k = -9223372036854775807L;
        this.f8023l = false;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f8015d = nVar.e(dVar.c(), 1);
        this.f8016e = dVar.b();
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f8022k = j10;
        }
    }
}
