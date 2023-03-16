package x1;

import x1.e0;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16220a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f16221b;

    /* renamed from: c  reason: collision with root package name */
    private int f16222c;

    /* renamed from: d  reason: collision with root package name */
    private long f16223d;

    /* renamed from: e  reason: collision with root package name */
    private int f16224e;

    /* renamed from: f  reason: collision with root package name */
    private int f16225f;

    /* renamed from: g  reason: collision with root package name */
    private int f16226g;

    public void a(e0 e0Var, e0.a aVar) {
        if (this.f16222c > 0) {
            e0Var.c(this.f16223d, this.f16224e, this.f16225f, this.f16226g, aVar);
            this.f16222c = 0;
        }
    }

    public void b() {
        this.f16221b = false;
        this.f16222c = 0;
    }

    public void c(e0 e0Var, long j10, int i10, int i11, int i12, e0.a aVar) {
        p3.a.g(this.f16226g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f16221b) {
            int i13 = this.f16222c;
            int i14 = i13 + 1;
            this.f16222c = i14;
            if (i13 == 0) {
                this.f16223d = j10;
                this.f16224e = i10;
                this.f16225f = 0;
            }
            this.f16225f += i11;
            this.f16226g = i12;
            if (i14 >= 16) {
                a(e0Var, aVar);
            }
        }
    }

    public void d(m mVar) {
        if (this.f16221b) {
            return;
        }
        mVar.o(this.f16220a, 0, 10);
        mVar.g();
        if (u1.b.i(this.f16220a) == 0) {
            return;
        }
        this.f16221b = true;
    }
}
