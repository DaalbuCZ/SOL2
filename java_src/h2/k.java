package h2;

import h2.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.m1;
/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: b  reason: collision with root package name */
    private final String f7864b;

    /* renamed from: c  reason: collision with root package name */
    private String f7865c;

    /* renamed from: d  reason: collision with root package name */
    private x1.e0 f7866d;

    /* renamed from: f  reason: collision with root package name */
    private int f7868f;

    /* renamed from: g  reason: collision with root package name */
    private int f7869g;

    /* renamed from: h  reason: collision with root package name */
    private long f7870h;

    /* renamed from: i  reason: collision with root package name */
    private m1 f7871i;

    /* renamed from: j  reason: collision with root package name */
    private int f7872j;

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f7863a = new p3.a0(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    private int f7867e = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f7873k = -9223372036854775807L;

    public k(String str) {
        this.f7864b = str;
    }

    private boolean f(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f7868f);
        a0Var.j(bArr, this.f7868f, min);
        int i11 = this.f7868f + min;
        this.f7868f = i11;
        return i11 == i10;
    }

    @RequiresNonNull({"output"})
    private void g() {
        byte[] d10 = this.f7863a.d();
        if (this.f7871i == null) {
            m1 g10 = u1.b0.g(d10, this.f7865c, this.f7864b, null);
            this.f7871i = g10;
            this.f7866d.e(g10);
        }
        this.f7872j = u1.b0.a(d10);
        this.f7870h = (int) ((u1.b0.f(d10) * 1000000) / this.f7871i.M);
    }

    private boolean h(p3.a0 a0Var) {
        while (a0Var.a() > 0) {
            int i10 = this.f7869g << 8;
            this.f7869g = i10;
            int C = i10 | a0Var.C();
            this.f7869g = C;
            if (u1.b0.d(C)) {
                byte[] d10 = this.f7863a.d();
                int i11 = this.f7869g;
                d10[0] = (byte) ((i11 >> 24) & 255);
                d10[1] = (byte) ((i11 >> 16) & 255);
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                this.f7868f = 4;
                this.f7869g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f7866d);
        while (a0Var.a() > 0) {
            int i10 = this.f7867e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(a0Var.a(), this.f7872j - this.f7868f);
                    this.f7866d.d(a0Var, min);
                    int i11 = this.f7868f + min;
                    this.f7868f = i11;
                    int i12 = this.f7872j;
                    if (i11 == i12) {
                        long j10 = this.f7873k;
                        if (j10 != -9223372036854775807L) {
                            this.f7866d.c(j10, 1, i12, 0, null);
                            this.f7873k += this.f7870h;
                        }
                        this.f7867e = 0;
                    }
                } else if (f(a0Var, this.f7863a.d(), 18)) {
                    g();
                    this.f7863a.O(0);
                    this.f7866d.d(this.f7863a, 18);
                    this.f7867e = 2;
                }
            } else if (h(a0Var)) {
                this.f7867e = 1;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f7867e = 0;
        this.f7868f = 0;
        this.f7869g = 0;
        this.f7873k = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7865c = dVar.b();
        this.f7866d = nVar.e(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7873k = j10;
        }
    }
}
