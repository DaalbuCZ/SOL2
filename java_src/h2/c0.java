package h2;

import h2.i0;
import p3.m0;
/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f7746a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f7747b = new p3.a0(32);

    /* renamed from: c  reason: collision with root package name */
    private int f7748c;

    /* renamed from: d  reason: collision with root package name */
    private int f7749d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7750e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7751f;

    public c0(b0 b0Var) {
        this.f7746a = b0Var;
    }

    @Override // h2.i0
    public void a(p3.a0 a0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int e10 = z10 ? a0Var.e() + a0Var.C() : -1;
        if (this.f7751f) {
            if (!z10) {
                return;
            }
            this.f7751f = false;
            a0Var.O(e10);
            this.f7749d = 0;
        }
        while (a0Var.a() > 0) {
            int i11 = this.f7749d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int C = a0Var.C();
                    a0Var.O(a0Var.e() - 1);
                    if (C == 255) {
                        this.f7751f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.a(), 3 - this.f7749d);
                a0Var.j(this.f7747b.d(), this.f7749d, min);
                int i12 = this.f7749d + min;
                this.f7749d = i12;
                if (i12 == 3) {
                    this.f7747b.O(0);
                    this.f7747b.N(3);
                    this.f7747b.P(1);
                    int C2 = this.f7747b.C();
                    int C3 = this.f7747b.C();
                    this.f7750e = (C2 & 128) != 0;
                    this.f7748c = (((C2 & 15) << 8) | C3) + 3;
                    int b10 = this.f7747b.b();
                    int i13 = this.f7748c;
                    if (b10 < i13) {
                        this.f7747b.c(Math.min(4098, Math.max(i13, this.f7747b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.a(), this.f7748c - this.f7749d);
                a0Var.j(this.f7747b.d(), this.f7749d, min2);
                int i14 = this.f7749d + min2;
                this.f7749d = i14;
                int i15 = this.f7748c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f7750e) {
                        this.f7747b.N(i15);
                    } else if (m0.t(this.f7747b.d(), 0, this.f7748c, -1) != 0) {
                        this.f7751f = true;
                        return;
                    } else {
                        this.f7747b.N(this.f7748c - 4);
                    }
                    this.f7747b.O(0);
                    this.f7746a.a(this.f7747b);
                    this.f7749d = 0;
                }
            }
        }
    }

    @Override // h2.i0
    public void b() {
        this.f7751f = true;
    }

    @Override // h2.i0
    public void c(p3.i0 i0Var, x1.n nVar, i0.d dVar) {
        this.f7746a.c(i0Var, nVar, dVar);
        this.f7751f = true;
    }
}
