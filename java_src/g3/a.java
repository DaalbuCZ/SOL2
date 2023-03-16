package g3;

import android.graphics.Bitmap;
import d3.b;
import d3.g;
import d3.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p3.a0;
import p3.m0;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f7526o;

    /* renamed from: p  reason: collision with root package name */
    private final a0 f7527p;

    /* renamed from: q  reason: collision with root package name */
    private final C0113a f7528q;

    /* renamed from: r  reason: collision with root package name */
    private Inflater f7529r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0113a {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f7530a = new a0();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f7531b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f7532c;

        /* renamed from: d  reason: collision with root package name */
        private int f7533d;

        /* renamed from: e  reason: collision with root package name */
        private int f7534e;

        /* renamed from: f  reason: collision with root package name */
        private int f7535f;

        /* renamed from: g  reason: collision with root package name */
        private int f7536g;

        /* renamed from: h  reason: collision with root package name */
        private int f7537h;

        /* renamed from: i  reason: collision with root package name */
        private int f7538i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(a0 a0Var, int i10) {
            int F;
            if (i10 < 4) {
                return;
            }
            a0Var.P(3);
            int i11 = i10 - 4;
            if ((a0Var.C() & 128) != 0) {
                if (i11 < 7 || (F = a0Var.F()) < 4) {
                    return;
                }
                this.f7537h = a0Var.I();
                this.f7538i = a0Var.I();
                this.f7530a.K(F - 4);
                i11 -= 7;
            }
            int e10 = this.f7530a.e();
            int f10 = this.f7530a.f();
            if (e10 >= f10 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, f10 - e10);
            a0Var.j(this.f7530a.d(), e10, min);
            this.f7530a.O(e10 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(a0 a0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f7533d = a0Var.I();
            this.f7534e = a0Var.I();
            a0Var.P(11);
            this.f7535f = a0Var.I();
            this.f7536g = a0Var.I();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(a0 a0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            a0Var.P(2);
            Arrays.fill(this.f7531b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int C = a0Var.C();
                int C2 = a0Var.C();
                int C3 = a0Var.C();
                int C4 = a0Var.C();
                int C5 = a0Var.C();
                double d10 = C2;
                double d11 = C3 - 128;
                int i13 = i12;
                double d12 = C4 - 128;
                this.f7531b[C] = m0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | (m0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (C5 << 24) | (m0.q((int) ((1.402d * d11) + d10), 0, 255) << 16);
                i12 = i13 + 1;
            }
            this.f7532c = true;
        }

        public d3.b d() {
            int i10;
            if (this.f7533d == 0 || this.f7534e == 0 || this.f7537h == 0 || this.f7538i == 0 || this.f7530a.f() == 0 || this.f7530a.e() != this.f7530a.f() || !this.f7532c) {
                return null;
            }
            this.f7530a.O(0);
            int i11 = this.f7537h * this.f7538i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int C = this.f7530a.C();
                if (C != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f7531b[C];
                } else {
                    int C2 = this.f7530a.C();
                    if (C2 != 0) {
                        i10 = ((C2 & 64) == 0 ? C2 & 63 : ((C2 & 63) << 8) | this.f7530a.C()) + i12;
                        Arrays.fill(iArr, i12, i10, (C2 & 128) == 0 ? 0 : this.f7531b[this.f7530a.C()]);
                    }
                }
                i12 = i10;
            }
            return new b.C0093b().f(Bitmap.createBitmap(iArr, this.f7537h, this.f7538i, Bitmap.Config.ARGB_8888)).k(this.f7535f / this.f7533d).l(0).h(this.f7536g / this.f7534e, 0).i(0).n(this.f7537h / this.f7533d).g(this.f7538i / this.f7534e).a();
        }

        public void h() {
            this.f7533d = 0;
            this.f7534e = 0;
            this.f7535f = 0;
            this.f7536g = 0;
            this.f7537h = 0;
            this.f7538i = 0;
            this.f7530a.K(0);
            this.f7532c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f7526o = new a0();
        this.f7527p = new a0();
        this.f7528q = new C0113a();
    }

    private void C(a0 a0Var) {
        if (a0Var.a() <= 0 || a0Var.h() != 120) {
            return;
        }
        if (this.f7529r == null) {
            this.f7529r = new Inflater();
        }
        if (m0.p0(a0Var, this.f7527p, this.f7529r)) {
            a0Var.M(this.f7527p.d(), this.f7527p.f());
        }
    }

    private static d3.b D(a0 a0Var, C0113a c0113a) {
        int f10 = a0Var.f();
        int C = a0Var.C();
        int I = a0Var.I();
        int e10 = a0Var.e() + I;
        d3.b bVar = null;
        if (e10 > f10) {
            a0Var.O(f10);
            return null;
        }
        if (C != 128) {
            switch (C) {
                case 20:
                    c0113a.g(a0Var, I);
                    break;
                case 21:
                    c0113a.e(a0Var, I);
                    break;
                case 22:
                    c0113a.f(a0Var, I);
                    break;
            }
        } else {
            bVar = c0113a.d();
            c0113a.h();
        }
        a0Var.O(e10);
        return bVar;
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        this.f7526o.M(bArr, i10);
        C(this.f7526o);
        this.f7528q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f7526o.a() >= 3) {
            d3.b D = D(this.f7526o, this.f7528q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
