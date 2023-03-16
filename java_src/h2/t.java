package h2;

import h2.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.m1;
import u1.e0;
/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f8033a;

    /* renamed from: b  reason: collision with root package name */
    private final e0.a f8034b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8035c;

    /* renamed from: d  reason: collision with root package name */
    private x1.e0 f8036d;

    /* renamed from: e  reason: collision with root package name */
    private String f8037e;

    /* renamed from: f  reason: collision with root package name */
    private int f8038f;

    /* renamed from: g  reason: collision with root package name */
    private int f8039g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8040h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8041i;

    /* renamed from: j  reason: collision with root package name */
    private long f8042j;

    /* renamed from: k  reason: collision with root package name */
    private int f8043k;

    /* renamed from: l  reason: collision with root package name */
    private long f8044l;

    public t() {
        this(null);
    }

    public t(String str) {
        this.f8038f = 0;
        p3.a0 a0Var = new p3.a0(4);
        this.f8033a = a0Var;
        a0Var.d()[0] = -1;
        this.f8034b = new e0.a();
        this.f8044l = -9223372036854775807L;
        this.f8035c = str;
    }

    private void f(p3.a0 a0Var) {
        byte[] d10 = a0Var.d();
        int f10 = a0Var.f();
        for (int e10 = a0Var.e(); e10 < f10; e10++) {
            boolean z10 = (d10[e10] & 255) == 255;
            boolean z11 = this.f8041i && (d10[e10] & 224) == 224;
            this.f8041i = z10;
            if (z11) {
                a0Var.O(e10 + 1);
                this.f8041i = false;
                this.f8033a.d()[1] = d10[e10];
                this.f8039g = 2;
                this.f8038f = 1;
                return;
            }
        }
        a0Var.O(f10);
    }

    @RequiresNonNull({"output"})
    private void g(p3.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f8043k - this.f8039g);
        this.f8036d.d(a0Var, min);
        int i10 = this.f8039g + min;
        this.f8039g = i10;
        int i11 = this.f8043k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f8044l;
        if (j10 != -9223372036854775807L) {
            this.f8036d.c(j10, 1, i11, 0, null);
            this.f8044l += this.f8042j;
        }
        this.f8039g = 0;
        this.f8038f = 0;
    }

    @RequiresNonNull({"output"})
    private void h(p3.a0 a0Var) {
        int min = Math.min(a0Var.a(), 4 - this.f8039g);
        a0Var.j(this.f8033a.d(), this.f8039g, min);
        int i10 = this.f8039g + min;
        this.f8039g = i10;
        if (i10 < 4) {
            return;
        }
        this.f8033a.O(0);
        if (!this.f8034b.a(this.f8033a.m())) {
            this.f8039g = 0;
            this.f8038f = 1;
            return;
        }
        e0.a aVar = this.f8034b;
        this.f8043k = aVar.f14930c;
        if (!this.f8040h) {
            this.f8042j = (aVar.f14934g * 1000000) / aVar.f14931d;
            this.f8036d.e(new m1.b().S(this.f8037e).e0(this.f8034b.f14929b).W(4096).H(this.f8034b.f14932e).f0(this.f8034b.f14931d).V(this.f8035c).E());
            this.f8040h = true;
        }
        this.f8033a.O(0);
        this.f8036d.d(this.f8033a, 4);
        this.f8038f = 2;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f8036d);
        while (a0Var.a() > 0) {
            int i10 = this.f8038f;
            if (i10 == 0) {
                f(a0Var);
            } else if (i10 == 1) {
                h(a0Var);
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                g(a0Var);
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f8038f = 0;
        this.f8039g = 0;
        this.f8041i = false;
        this.f8044l = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f8037e = dVar.b();
        this.f8036d = nVar.e(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f8044l = j10;
        }
    }
}
