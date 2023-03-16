package h2;

import h2.i0;
import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.h2;
import x1.b0;
/* loaded from: classes.dex */
public final class h implements x1.l {

    /* renamed from: m  reason: collision with root package name */
    public static final x1.r f7787m = g.f7785b;

    /* renamed from: a  reason: collision with root package name */
    private final int f7788a;

    /* renamed from: b  reason: collision with root package name */
    private final i f7789b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f7790c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.a0 f7791d;

    /* renamed from: e  reason: collision with root package name */
    private final p3.z f7792e;

    /* renamed from: f  reason: collision with root package name */
    private x1.n f7793f;

    /* renamed from: g  reason: collision with root package name */
    private long f7794g;

    /* renamed from: h  reason: collision with root package name */
    private long f7795h;

    /* renamed from: i  reason: collision with root package name */
    private int f7796i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7797j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7798k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7799l;

    public h() {
        this(0);
    }

    public h(int i10) {
        this.f7788a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f7789b = new i(true);
        this.f7790c = new p3.a0(2048);
        this.f7796i = -1;
        this.f7795h = -1L;
        p3.a0 a0Var = new p3.a0(10);
        this.f7791d = a0Var;
        this.f7792e = new p3.z(a0Var.d());
    }

    private void e(x1.m mVar) {
        int h10;
        if (this.f7797j) {
            return;
        }
        this.f7796i = -1;
        mVar.g();
        long j10 = 0;
        if (mVar.q() == 0) {
            l(mVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!mVar.l(this.f7791d.d(), 0, 2, true)) {
                    break;
                }
                this.f7791d.O(0);
                if (!i.m(this.f7791d.I())) {
                    break;
                } else if (!mVar.l(this.f7791d.d(), 0, 4, true)) {
                    break;
                } else {
                    this.f7792e.p(14);
                    h10 = this.f7792e.h(13);
                    if (h10 <= 6) {
                        this.f7797j = true;
                        throw h2.a("Malformed ADTS stream", null);
                    }
                    j10 += h10;
                    i11++;
                    if (i11 == 1000) {
                        break;
                    }
                }
            } catch (EOFException unused) {
            }
        } while (mVar.j(h10 - 6, true));
        i10 = i11;
        mVar.g();
        if (i10 > 0) {
            this.f7796i = (int) (j10 / i10);
        } else {
            this.f7796i = -1;
        }
        this.f7797j = true;
    }

    private static int f(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private x1.b0 g(long j10, boolean z10) {
        return new x1.e(j10, this.f7795h, f(this.f7796i, this.f7789b.k()), this.f7796i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] h() {
        return new x1.l[]{new h()};
    }

    @RequiresNonNull({"extractorOutput"})
    private void k(long j10, boolean z10) {
        if (this.f7799l) {
            return;
        }
        boolean z11 = (this.f7788a & 1) != 0 && this.f7796i > 0;
        if (z11 && this.f7789b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f7789b.k() == -9223372036854775807L) {
            this.f7793f.t(new b0.b(-9223372036854775807L));
        } else {
            this.f7793f.t(g(j10, (this.f7788a & 2) != 0));
        }
        this.f7799l = true;
    }

    private int l(x1.m mVar) {
        int i10 = 0;
        while (true) {
            mVar.o(this.f7791d.d(), 0, 10);
            this.f7791d.O(0);
            if (this.f7791d.F() != 4801587) {
                break;
            }
            this.f7791d.P(3);
            int B = this.f7791d.B();
            i10 += B + 10;
            mVar.p(B);
        }
        mVar.g();
        mVar.p(i10);
        if (this.f7795h == -1) {
            this.f7795h = i10;
        }
        return i10;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f7798k = false;
        this.f7789b.b();
        this.f7794g = j11;
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f7793f = nVar;
        this.f7789b.c(nVar, new i0.d(0, 1));
        nVar.i();
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        p3.a.h(this.f7793f);
        long a10 = mVar.a();
        int i10 = this.f7788a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || a10 == -1)) ? false : true) {
            e(mVar);
        }
        int b10 = mVar.b(this.f7790c.d(), 0, 2048);
        boolean z10 = b10 == -1;
        k(a10, z10);
        if (z10) {
            return -1;
        }
        this.f7790c.O(0);
        this.f7790c.N(b10);
        if (!this.f7798k) {
            this.f7789b.e(this.f7794g, 4);
            this.f7798k = true;
        }
        this.f7789b.a(this.f7790c);
        return 0;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        int l10 = l(mVar);
        int i10 = l10;
        int i11 = 0;
        int i12 = 0;
        do {
            mVar.o(this.f7791d.d(), 0, 2);
            this.f7791d.O(0);
            if (i.m(this.f7791d.I())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                mVar.o(this.f7791d.d(), 0, 4);
                this.f7792e.p(14);
                int h10 = this.f7792e.h(13);
                if (h10 > 6) {
                    mVar.p(h10 - 6);
                    i12 += h10;
                }
            }
            i10++;
            mVar.g();
            mVar.p(i10);
            i11 = 0;
            i12 = 0;
        } while (i10 - l10 < 8192);
        return false;
    }
}
