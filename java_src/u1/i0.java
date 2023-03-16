package u1;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f14963a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14964b;

    /* renamed from: c  reason: collision with root package name */
    private final float f14965c;

    /* renamed from: d  reason: collision with root package name */
    private final float f14966d;

    /* renamed from: e  reason: collision with root package name */
    private final float f14967e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14968f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14969g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14970h;

    /* renamed from: i  reason: collision with root package name */
    private final short[] f14971i;

    /* renamed from: j  reason: collision with root package name */
    private short[] f14972j;

    /* renamed from: k  reason: collision with root package name */
    private int f14973k;

    /* renamed from: l  reason: collision with root package name */
    private short[] f14974l;

    /* renamed from: m  reason: collision with root package name */
    private int f14975m;

    /* renamed from: n  reason: collision with root package name */
    private short[] f14976n;

    /* renamed from: o  reason: collision with root package name */
    private int f14977o;

    /* renamed from: p  reason: collision with root package name */
    private int f14978p;

    /* renamed from: q  reason: collision with root package name */
    private int f14979q;

    /* renamed from: r  reason: collision with root package name */
    private int f14980r;

    /* renamed from: s  reason: collision with root package name */
    private int f14981s;

    /* renamed from: t  reason: collision with root package name */
    private int f14982t;

    /* renamed from: u  reason: collision with root package name */
    private int f14983u;

    /* renamed from: v  reason: collision with root package name */
    private int f14984v;

    public i0(int i10, int i11, float f10, float f11, int i12) {
        this.f14963a = i10;
        this.f14964b = i11;
        this.f14965c = f10;
        this.f14966d = f11;
        this.f14967e = i10 / i12;
        this.f14968f = i10 / 400;
        int i13 = i10 / 65;
        this.f14969g = i13;
        int i14 = i13 * 2;
        this.f14970h = i14;
        this.f14971i = new short[i14];
        this.f14972j = new short[i14 * i11];
        this.f14974l = new short[i14 * i11];
        this.f14976n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f14975m == i10) {
            return;
        }
        int i13 = this.f14963a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f14977o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f14978p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f14979q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f14974l = f(this.f14974l, this.f14975m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f14964b;
                    if (i18 < i19) {
                        this.f14974l[(this.f14975m * i19) + i18] = n(this.f14976n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f14979q++;
                this.f14975m++;
            }
            int i20 = i11 + 1;
            this.f14978p = i20;
            if (i20 == i13) {
                this.f14978p = 0;
                p3.a.f(i12 == i14);
                this.f14979q = 0;
            }
            i15++;
        }
    }

    private void b(float f10) {
        int w10;
        int i10 = this.f14973k;
        if (i10 < this.f14970h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f14980r > 0) {
                w10 = c(i11);
            } else {
                int g10 = g(this.f14972j, i11);
                w10 = ((double) f10) > 1.0d ? g10 + w(this.f14972j, i11, f10, g10) : m(this.f14972j, i11, f10, g10);
            }
            i11 += w10;
        } while (this.f14970h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int min = Math.min(this.f14970h, this.f14980r);
        d(this.f14972j, i10, min);
        this.f14980r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f14974l, this.f14975m, i11);
        this.f14974l = f10;
        int i12 = this.f14964b;
        System.arraycopy(sArr, i10 * i12, f10, this.f14975m * i12, i12 * i11);
        this.f14975m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f14970h / i11;
        int i13 = this.f14964b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f14971i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f14964b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f14963a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f14964b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f14968f, this.f14969g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f14971i, 0, this.f14968f / i13, this.f14969g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f14968f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f14969g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f14964b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f14971i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f14983u, this.f14984v) ? this.f14981s : i11;
        this.f14982t = this.f14983u;
        this.f14981s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f14964b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f14983u = i14 / i16;
        this.f14984v = i17 / i15;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f14980r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f14974l, this.f14975m, i13);
        this.f14974l = f11;
        int i14 = this.f14964b;
        System.arraycopy(sArr, i10 * i14, f11, this.f14975m * i14, i14 * i11);
        p(i12, this.f14964b, this.f14974l, this.f14975m + i11, sArr, i10 + i11, sArr, i10);
        this.f14975m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f14964b];
        int i13 = this.f14979q * i11;
        int i14 = this.f14978p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f14975m - i10;
        short[] f10 = f(this.f14976n, this.f14977o, i11);
        this.f14976n = f10;
        short[] sArr = this.f14974l;
        int i12 = this.f14964b;
        System.arraycopy(sArr, i10 * i12, f10, this.f14977o * i12, i12 * i11);
        this.f14975m = i10;
        this.f14977o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f14981s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f14982t * 3;
    }

    private void r() {
        int i10 = this.f14975m;
        float f10 = this.f14965c;
        float f11 = this.f14966d;
        float f12 = f10 / f11;
        float f13 = this.f14967e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f14972j, 0, this.f14973k);
            this.f14973k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f14976n;
        int i11 = this.f14964b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f14977o - i10) * i11);
        this.f14977o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f14973k - i10;
        short[] sArr = this.f14972j;
        int i12 = this.f14964b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f14973k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f14980r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f14974l, this.f14975m, i12);
        this.f14974l = f11;
        p(i12, this.f14964b, f11, this.f14975m, sArr, i10, sArr, i10 + i11);
        this.f14975m += i12;
        return i12;
    }

    public void i() {
        this.f14973k = 0;
        this.f14975m = 0;
        this.f14977o = 0;
        this.f14978p = 0;
        this.f14979q = 0;
        this.f14980r = 0;
        this.f14981s = 0;
        this.f14982t = 0;
        this.f14983u = 0;
        this.f14984v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f14964b, this.f14975m);
        shortBuffer.put(this.f14974l, 0, this.f14964b * min);
        int i10 = this.f14975m - min;
        this.f14975m = i10;
        short[] sArr = this.f14974l;
        int i11 = this.f14964b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f14975m * this.f14964b * 2;
    }

    public int l() {
        return this.f14973k * this.f14964b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f14973k;
        float f10 = this.f14965c;
        float f11 = this.f14966d;
        int i12 = this.f14975m + ((int) ((((i11 / (f10 / f11)) + this.f14977o) / (this.f14967e * f11)) + 0.5f));
        this.f14972j = f(this.f14972j, i11, (this.f14970h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f14970h;
            int i14 = this.f14964b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f14972j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f14973k += i10 * 2;
        r();
        if (this.f14975m > i12) {
            this.f14975m = i12;
        }
        this.f14973k = 0;
        this.f14980r = 0;
        this.f14977o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f14964b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f14972j, this.f14973k, i11);
        this.f14972j = f10;
        shortBuffer.get(f10, this.f14973k * this.f14964b, ((i10 * i11) * 2) / 2);
        this.f14973k += i11;
        r();
    }
}
