package h2;

import h2.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.m1;
import u1.c;
/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p3.z f7763a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f7764b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7765c;

    /* renamed from: d  reason: collision with root package name */
    private String f7766d;

    /* renamed from: e  reason: collision with root package name */
    private x1.e0 f7767e;

    /* renamed from: f  reason: collision with root package name */
    private int f7768f;

    /* renamed from: g  reason: collision with root package name */
    private int f7769g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7770h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7771i;

    /* renamed from: j  reason: collision with root package name */
    private long f7772j;

    /* renamed from: k  reason: collision with root package name */
    private m1 f7773k;

    /* renamed from: l  reason: collision with root package name */
    private int f7774l;

    /* renamed from: m  reason: collision with root package name */
    private long f7775m;

    public f() {
        this(null);
    }

    public f(String str) {
        p3.z zVar = new p3.z(new byte[16]);
        this.f7763a = zVar;
        this.f7764b = new p3.a0(zVar.f12390a);
        this.f7768f = 0;
        this.f7769g = 0;
        this.f7770h = false;
        this.f7771i = false;
        this.f7775m = -9223372036854775807L;
        this.f7765c = str;
    }

    private boolean f(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f7769g);
        a0Var.j(bArr, this.f7769g, min);
        int i11 = this.f7769g + min;
        this.f7769g = i11;
        return i11 == i10;
    }

    @RequiresNonNull({"output"})
    private void g() {
        this.f7763a.p(0);
        c.b d10 = u1.c.d(this.f7763a);
        m1 m1Var = this.f7773k;
        if (m1Var == null || d10.f14896c != m1Var.L || d10.f14895b != m1Var.M || !"audio/ac4".equals(m1Var.f13587y)) {
            m1 E = new m1.b().S(this.f7766d).e0("audio/ac4").H(d10.f14896c).f0(d10.f14895b).V(this.f7765c).E();
            this.f7773k = E;
            this.f7767e.e(E);
        }
        this.f7774l = d10.f14897d;
        this.f7772j = (d10.f14898e * 1000000) / this.f7773k.M;
    }

    private boolean h(p3.a0 a0Var) {
        int C;
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f7770h) {
                C = a0Var.C();
                this.f7770h = C == 172;
                if (C == 64 || C == 65) {
                    break;
                }
            } else {
                this.f7770h = a0Var.C() == 172;
            }
        }
        this.f7771i = C == 65;
        return true;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f7767e);
        while (a0Var.a() > 0) {
            int i10 = this.f7768f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f7774l - this.f7769g);
                        this.f7767e.d(a0Var, min);
                        int i11 = this.f7769g + min;
                        this.f7769g = i11;
                        int i12 = this.f7774l;
                        if (i11 == i12) {
                            long j10 = this.f7775m;
                            if (j10 != -9223372036854775807L) {
                                this.f7767e.c(j10, 1, i12, 0, null);
                                this.f7775m += this.f7772j;
                            }
                            this.f7768f = 0;
                        }
                    }
                } else if (f(a0Var, this.f7764b.d(), 16)) {
                    g();
                    this.f7764b.O(0);
                    this.f7767e.d(this.f7764b, 16);
                    this.f7768f = 2;
                }
            } else if (h(a0Var)) {
                this.f7768f = 1;
                this.f7764b.d()[0] = -84;
                this.f7764b.d()[1] = (byte) (this.f7771i ? 65 : 64);
                this.f7769g = 2;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f7768f = 0;
        this.f7769g = 0;
        this.f7770h = false;
        this.f7771i = false;
        this.f7775m = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7766d = dVar.b();
        this.f7767e = nVar.e(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7775m = j10;
        }
    }
}
