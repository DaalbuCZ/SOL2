package k3;

import android.text.Layout;
/* loaded from: classes.dex */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f10581a;

    /* renamed from: b  reason: collision with root package name */
    private int f10582b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10583c;

    /* renamed from: d  reason: collision with root package name */
    private int f10584d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10585e;

    /* renamed from: k  reason: collision with root package name */
    private float f10591k;

    /* renamed from: l  reason: collision with root package name */
    private String f10592l;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f10595o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f10596p;

    /* renamed from: r  reason: collision with root package name */
    private b f10598r;

    /* renamed from: f  reason: collision with root package name */
    private int f10586f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f10587g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f10588h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f10589i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f10590j = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f10593m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f10594n = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f10597q = -1;

    /* renamed from: s  reason: collision with root package name */
    private float f10599s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f10583c && gVar.f10583c) {
                w(gVar.f10582b);
            }
            if (this.f10588h == -1) {
                this.f10588h = gVar.f10588h;
            }
            if (this.f10589i == -1) {
                this.f10589i = gVar.f10589i;
            }
            if (this.f10581a == null && (str = gVar.f10581a) != null) {
                this.f10581a = str;
            }
            if (this.f10586f == -1) {
                this.f10586f = gVar.f10586f;
            }
            if (this.f10587g == -1) {
                this.f10587g = gVar.f10587g;
            }
            if (this.f10594n == -1) {
                this.f10594n = gVar.f10594n;
            }
            if (this.f10595o == null && (alignment2 = gVar.f10595o) != null) {
                this.f10595o = alignment2;
            }
            if (this.f10596p == null && (alignment = gVar.f10596p) != null) {
                this.f10596p = alignment;
            }
            if (this.f10597q == -1) {
                this.f10597q = gVar.f10597q;
            }
            if (this.f10590j == -1) {
                this.f10590j = gVar.f10590j;
                this.f10591k = gVar.f10591k;
            }
            if (this.f10598r == null) {
                this.f10598r = gVar.f10598r;
            }
            if (this.f10599s == Float.MAX_VALUE) {
                this.f10599s = gVar.f10599s;
            }
            if (z10 && !this.f10585e && gVar.f10585e) {
                u(gVar.f10584d);
            }
            if (z10 && this.f10593m == -1 && (i10 = gVar.f10593m) != -1) {
                this.f10593m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f10592l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f10589i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f10586f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f10596p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f10594n = i10;
        return this;
    }

    public g F(int i10) {
        this.f10593m = i10;
        return this;
    }

    public g G(float f10) {
        this.f10599s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f10595o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f10597q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f10598r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f10587g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f10585e) {
            return this.f10584d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f10583c) {
            return this.f10582b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f10581a;
    }

    public float e() {
        return this.f10591k;
    }

    public int f() {
        return this.f10590j;
    }

    public String g() {
        return this.f10592l;
    }

    public Layout.Alignment h() {
        return this.f10596p;
    }

    public int i() {
        return this.f10594n;
    }

    public int j() {
        return this.f10593m;
    }

    public float k() {
        return this.f10599s;
    }

    public int l() {
        int i10 = this.f10588h;
        if (i10 == -1 && this.f10589i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f10589i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f10595o;
    }

    public boolean n() {
        return this.f10597q == 1;
    }

    public b o() {
        return this.f10598r;
    }

    public boolean p() {
        return this.f10585e;
    }

    public boolean q() {
        return this.f10583c;
    }

    public boolean s() {
        return this.f10586f == 1;
    }

    public boolean t() {
        return this.f10587g == 1;
    }

    public g u(int i10) {
        this.f10584d = i10;
        this.f10585e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f10588h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f10582b = i10;
        this.f10583c = true;
        return this;
    }

    public g x(String str) {
        this.f10581a = str;
        return this;
    }

    public g y(float f10) {
        this.f10591k = f10;
        return this;
    }

    public g z(int i10) {
        this.f10590j = i10;
        return this;
    }
}
