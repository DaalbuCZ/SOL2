package b2;

import b2.e;
import p3.a0;
import p3.w;
import s1.m1;
import x1.e0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f2754b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f2755c;

    /* renamed from: d  reason: collision with root package name */
    private int f2756d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2757e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2758f;

    /* renamed from: g  reason: collision with root package name */
    private int f2759g;

    public f(e0 e0Var) {
        super(e0Var);
        this.f2754b = new a0(w.f12350a);
        this.f2755c = new a0(4);
    }

    @Override // b2.e
    protected boolean b(a0 a0Var) {
        int C = a0Var.C();
        int i10 = (C >> 4) & 15;
        int i11 = C & 15;
        if (i11 == 7) {
            this.f2759g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // b2.e
    protected boolean c(a0 a0Var, long j10) {
        int C = a0Var.C();
        long n10 = j10 + (a0Var.n() * 1000);
        if (C == 0 && !this.f2757e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.j(a0Var2.d(), 0, a0Var.a());
            q3.a b10 = q3.a.b(a0Var2);
            this.f2756d = b10.f12558b;
            this.f2753a.e(new m1.b().e0("video/avc").I(b10.f12562f).j0(b10.f12559c).Q(b10.f12560d).a0(b10.f12561e).T(b10.f12557a).E());
            this.f2757e = true;
            return false;
        } else if (C == 1 && this.f2757e) {
            int i10 = this.f2759g == 1 ? 1 : 0;
            if (this.f2758f || i10 != 0) {
                byte[] d10 = this.f2755c.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i11 = 4 - this.f2756d;
                int i12 = 0;
                while (a0Var.a() > 0) {
                    a0Var.j(this.f2755c.d(), i11, this.f2756d);
                    this.f2755c.O(0);
                    int G = this.f2755c.G();
                    this.f2754b.O(0);
                    this.f2753a.d(this.f2754b, 4);
                    this.f2753a.d(a0Var, G);
                    i12 = i12 + 4 + G;
                }
                this.f2753a.c(n10, i10, i12, 0, null);
                this.f2758f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
