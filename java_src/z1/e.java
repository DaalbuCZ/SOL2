package z1;

import java.util.Arrays;
import p3.m0;
import x1.b0;
import x1.c0;
import x1.e0;
import x1.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    protected final e0 f17160a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17161b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17162c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17163d;

    /* renamed from: e  reason: collision with root package name */
    private final int f17164e;

    /* renamed from: f  reason: collision with root package name */
    private int f17165f;

    /* renamed from: g  reason: collision with root package name */
    private int f17166g;

    /* renamed from: h  reason: collision with root package name */
    private int f17167h;

    /* renamed from: i  reason: collision with root package name */
    private int f17168i;

    /* renamed from: j  reason: collision with root package name */
    private int f17169j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f17170k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f17171l;

    public e(int i10, int i11, long j10, int i12, e0 e0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        p3.a.a(z10);
        this.f17163d = j10;
        this.f17164e = i12;
        this.f17160a = e0Var;
        this.f17161b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f17162c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f17170k = new long[512];
        this.f17171l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f17163d * i10) / this.f17164e;
    }

    private c0 h(int i10) {
        return new c0(this.f17171l[i10] * g(), this.f17170k[i10]);
    }

    public void a() {
        this.f17167h++;
    }

    public void b(long j10) {
        if (this.f17169j == this.f17171l.length) {
            long[] jArr = this.f17170k;
            this.f17170k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f17171l;
            this.f17171l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f17170k;
        int i10 = this.f17169j;
        jArr2[i10] = j10;
        this.f17171l[i10] = this.f17168i;
        this.f17169j = i10 + 1;
    }

    public void c() {
        this.f17170k = Arrays.copyOf(this.f17170k, this.f17169j);
        this.f17171l = Arrays.copyOf(this.f17171l, this.f17169j);
    }

    public long f() {
        return e(this.f17167h);
    }

    public long g() {
        return e(1);
    }

    public b0.a i(long j10) {
        int g10 = (int) (j10 / g());
        int h10 = m0.h(this.f17171l, g10, true, true);
        if (this.f17171l[h10] == g10) {
            return new b0.a(h(h10));
        }
        c0 h11 = h(h10);
        int i10 = h10 + 1;
        return i10 < this.f17170k.length ? new b0.a(h11, h(i10)) : new b0.a(h11);
    }

    public boolean j(int i10) {
        return this.f17161b == i10 || this.f17162c == i10;
    }

    public void k() {
        this.f17168i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f17171l, this.f17167h) >= 0;
    }

    public boolean m(m mVar) {
        int i10 = this.f17166g;
        int f10 = i10 - this.f17160a.f(mVar, i10, false);
        this.f17166g = f10;
        boolean z10 = f10 == 0;
        if (z10) {
            if (this.f17165f > 0) {
                this.f17160a.c(f(), l() ? 1 : 0, this.f17165f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f17165f = i10;
        this.f17166g = i10;
    }

    public void o(long j10) {
        int i10;
        if (this.f17169j == 0) {
            i10 = 0;
        } else {
            i10 = this.f17171l[m0.i(this.f17170k, j10, true, true)];
        }
        this.f17167h = i10;
    }
}
