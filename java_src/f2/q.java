package f2;

import p3.a0;
/* loaded from: classes.dex */
final class q {

    /* renamed from: a  reason: collision with root package name */
    public c f7144a;

    /* renamed from: b  reason: collision with root package name */
    public long f7145b;

    /* renamed from: c  reason: collision with root package name */
    public long f7146c;

    /* renamed from: d  reason: collision with root package name */
    public long f7147d;

    /* renamed from: e  reason: collision with root package name */
    public int f7148e;

    /* renamed from: f  reason: collision with root package name */
    public int f7149f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7155l;

    /* renamed from: n  reason: collision with root package name */
    public p f7157n;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7159p;

    /* renamed from: q  reason: collision with root package name */
    public long f7160q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7161r;

    /* renamed from: g  reason: collision with root package name */
    public long[] f7150g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f7151h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f7152i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f7153j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f7154k = new boolean[0];

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f7156m = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public final a0 f7158o = new a0();

    public void a(a0 a0Var) {
        a0Var.j(this.f7158o.d(), 0, this.f7158o.f());
        this.f7158o.O(0);
        this.f7159p = false;
    }

    public void b(x1.m mVar) {
        mVar.readFully(this.f7158o.d(), 0, this.f7158o.f());
        this.f7158o.O(0);
        this.f7159p = false;
    }

    public long c(int i10) {
        return this.f7153j[i10];
    }

    public void d(int i10) {
        this.f7158o.K(i10);
        this.f7155l = true;
        this.f7159p = true;
    }

    public void e(int i10, int i11) {
        this.f7148e = i10;
        this.f7149f = i11;
        if (this.f7151h.length < i10) {
            this.f7150g = new long[i10];
            this.f7151h = new int[i10];
        }
        if (this.f7152i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f7152i = new int[i12];
            this.f7153j = new long[i12];
            this.f7154k = new boolean[i12];
            this.f7156m = new boolean[i12];
        }
    }

    public void f() {
        this.f7148e = 0;
        this.f7160q = 0L;
        this.f7161r = false;
        this.f7155l = false;
        this.f7159p = false;
        this.f7157n = null;
    }

    public boolean g(int i10) {
        return this.f7155l && this.f7156m[i10];
    }
}
