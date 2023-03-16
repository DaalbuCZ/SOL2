package h2;

import h2.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import s1.m1;
import u1.b;
/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p3.z f7734a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f7735b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7736c;

    /* renamed from: d  reason: collision with root package name */
    private String f7737d;

    /* renamed from: e  reason: collision with root package name */
    private x1.e0 f7738e;

    /* renamed from: f  reason: collision with root package name */
    private int f7739f;

    /* renamed from: g  reason: collision with root package name */
    private int f7740g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7741h;

    /* renamed from: i  reason: collision with root package name */
    private long f7742i;

    /* renamed from: j  reason: collision with root package name */
    private m1 f7743j;

    /* renamed from: k  reason: collision with root package name */
    private int f7744k;

    /* renamed from: l  reason: collision with root package name */
    private long f7745l;

    public c() {
        this(null);
    }

    public c(String str) {
        p3.z zVar = new p3.z(new byte[128]);
        this.f7734a = zVar;
        this.f7735b = new p3.a0(zVar.f12390a);
        this.f7739f = 0;
        this.f7745l = -9223372036854775807L;
        this.f7736c = str;
    }

    private boolean f(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f7740g);
        a0Var.j(bArr, this.f7740g, min);
        int i11 = this.f7740g + min;
        this.f7740g = i11;
        return i11 == i10;
    }

    @RequiresNonNull({"output"})
    private void g() {
        this.f7734a.p(0);
        b.C0220b e10 = u1.b.e(this.f7734a);
        m1 m1Var = this.f7743j;
        if (m1Var == null || e10.f14887d != m1Var.L || e10.f14886c != m1Var.M || !m0.c(e10.f14884a, m1Var.f13587y)) {
            m1 E = new m1.b().S(this.f7737d).e0(e10.f14884a).H(e10.f14887d).f0(e10.f14886c).V(this.f7736c).E();
            this.f7743j = E;
            this.f7738e.e(E);
        }
        this.f7744k = e10.f14888e;
        this.f7742i = (e10.f14889f * 1000000) / this.f7743j.M;
    }

    private boolean h(p3.a0 a0Var) {
        while (true) {
            boolean z10 = false;
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f7741h) {
                int C = a0Var.C();
                if (C == 119) {
                    this.f7741h = false;
                    return true;
                }
                if (C != 11) {
                    this.f7741h = z10;
                }
                z10 = true;
                this.f7741h = z10;
            } else {
                if (a0Var.C() != 11) {
                    this.f7741h = z10;
                }
                z10 = true;
                this.f7741h = z10;
            }
        }
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f7738e);
        while (a0Var.a() > 0) {
            int i10 = this.f7739f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f7744k - this.f7740g);
                        this.f7738e.d(a0Var, min);
                        int i11 = this.f7740g + min;
                        this.f7740g = i11;
                        int i12 = this.f7744k;
                        if (i11 == i12) {
                            long j10 = this.f7745l;
                            if (j10 != -9223372036854775807L) {
                                this.f7738e.c(j10, 1, i12, 0, null);
                                this.f7745l += this.f7742i;
                            }
                            this.f7739f = 0;
                        }
                    }
                } else if (f(a0Var, this.f7735b.d(), 128)) {
                    g();
                    this.f7735b.O(0);
                    this.f7738e.d(this.f7735b, 128);
                    this.f7739f = 2;
                }
            } else if (h(a0Var)) {
                this.f7739f = 1;
                this.f7735b.d()[0] = 11;
                this.f7735b.d()[1] = 119;
                this.f7740g = 2;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f7739f = 0;
        this.f7740g = 0;
        this.f7741h = false;
        this.f7745l = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7737d = dVar.b();
        this.f7738e = nVar.e(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7745l = j10;
        }
    }
}
