package u1;

import p3.m0;
import u1.z;
/* loaded from: classes.dex */
public class a0 implements z.d {

    /* renamed from: b  reason: collision with root package name */
    protected final int f14866b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f14867c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f14868d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f14869e;

    /* renamed from: f  reason: collision with root package name */
    protected final int f14870f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14871g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f14872a = 250000;

        /* renamed from: b  reason: collision with root package name */
        private int f14873b = 750000;

        /* renamed from: c  reason: collision with root package name */
        private int f14874c = 4;

        /* renamed from: d  reason: collision with root package name */
        private int f14875d = 250000;

        /* renamed from: e  reason: collision with root package name */
        private int f14876e = 50000000;

        /* renamed from: f  reason: collision with root package name */
        private int f14877f = 2;

        public a0 g() {
            return new a0(this);
        }
    }

    protected a0(a aVar) {
        this.f14866b = aVar.f14872a;
        this.f14867c = aVar.f14873b;
        this.f14868d = aVar.f14874c;
        this.f14869e = aVar.f14875d;
        this.f14870f = aVar.f14876e;
        this.f14871g = aVar.f14877f;
    }

    protected static int b(int i10, int i11, int i12) {
        return d5.d.d(((i10 * i11) * i12) / 1000000);
    }

    protected static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // u1.z.d
    public int a(int i10, int i11, int i12, int i13, int i14, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14) * d10)) + i13) - 1) / i13) * i13;
    }

    protected int c(int i10, int i11, int i12, int i13, int i14) {
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return f(i11);
                }
                throw new IllegalArgumentException();
            }
            return e(i11);
        }
        return g(i10, i14, i13);
    }

    protected int e(int i10) {
        return d5.d.d((this.f14870f * d(i10)) / 1000000);
    }

    protected int f(int i10) {
        int i11 = this.f14869e;
        if (i10 == 5) {
            i11 *= this.f14871g;
        }
        return d5.d.d((i11 * d(i10)) / 1000000);
    }

    protected int g(int i10, int i11, int i12) {
        return m0.q(i10 * this.f14868d, b(this.f14866b, i11, i12), b(this.f14867c, i11, i12));
    }
}
