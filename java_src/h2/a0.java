package h2;

import android.util.SparseArray;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import x1.b0;
/* loaded from: classes.dex */
public final class a0 implements x1.l {

    /* renamed from: l  reason: collision with root package name */
    public static final x1.r f7710l = z.f8075b;

    /* renamed from: a  reason: collision with root package name */
    private final p3.i0 f7711a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f7712b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f7713c;

    /* renamed from: d  reason: collision with root package name */
    private final y f7714d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7715e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7716f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7717g;

    /* renamed from: h  reason: collision with root package name */
    private long f7718h;

    /* renamed from: i  reason: collision with root package name */
    private x f7719i;

    /* renamed from: j  reason: collision with root package name */
    private x1.n f7720j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7721k;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m f7722a;

        /* renamed from: b  reason: collision with root package name */
        private final p3.i0 f7723b;

        /* renamed from: c  reason: collision with root package name */
        private final p3.z f7724c = new p3.z(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f7725d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f7726e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7727f;

        /* renamed from: g  reason: collision with root package name */
        private int f7728g;

        /* renamed from: h  reason: collision with root package name */
        private long f7729h;

        public a(m mVar, p3.i0 i0Var) {
            this.f7722a = mVar;
            this.f7723b = i0Var;
        }

        private void b() {
            this.f7724c.r(8);
            this.f7725d = this.f7724c.g();
            this.f7726e = this.f7724c.g();
            this.f7724c.r(6);
            this.f7728g = this.f7724c.h(8);
        }

        private void c() {
            this.f7729h = 0L;
            if (this.f7725d) {
                this.f7724c.r(4);
                this.f7724c.r(1);
                this.f7724c.r(1);
                long h10 = (this.f7724c.h(3) << 30) | (this.f7724c.h(15) << 15) | this.f7724c.h(15);
                this.f7724c.r(1);
                if (!this.f7727f && this.f7726e) {
                    this.f7724c.r(4);
                    this.f7724c.r(1);
                    this.f7724c.r(1);
                    this.f7724c.r(1);
                    this.f7723b.b((this.f7724c.h(3) << 30) | (this.f7724c.h(15) << 15) | this.f7724c.h(15));
                    this.f7727f = true;
                }
                this.f7729h = this.f7723b.b(h10);
            }
        }

        public void a(p3.a0 a0Var) {
            a0Var.j(this.f7724c.f12390a, 0, 3);
            this.f7724c.p(0);
            b();
            a0Var.j(this.f7724c.f12390a, 0, this.f7728g);
            this.f7724c.p(0);
            c();
            this.f7722a.e(this.f7729h, 4);
            this.f7722a.a(a0Var);
            this.f7722a.d();
        }

        public void d() {
            this.f7727f = false;
            this.f7722a.b();
        }
    }

    public a0() {
        this(new p3.i0(0L));
    }

    public a0(p3.i0 i0Var) {
        this.f7711a = i0Var;
        this.f7713c = new p3.a0(4096);
        this.f7712b = new SparseArray<>();
        this.f7714d = new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] e() {
        return new x1.l[]{new a0()};
    }

    @RequiresNonNull({"output"})
    private void f(long j10) {
        x1.n nVar;
        x1.b0 bVar;
        if (this.f7721k) {
            return;
        }
        this.f7721k = true;
        if (this.f7714d.c() != -9223372036854775807L) {
            x xVar = new x(this.f7714d.d(), this.f7714d.c(), j10);
            this.f7719i = xVar;
            nVar = this.f7720j;
            bVar = xVar.b();
        } else {
            nVar = this.f7720j;
            bVar = new b0.b(this.f7714d.c());
        }
        nVar.t(bVar);
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f7711a.e() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f7711a.c();
            z11 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : false;
        }
        if (z11) {
            this.f7711a.g(j11);
        }
        x xVar = this.f7719i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f7712b.size(); i10++) {
            this.f7712b.valueAt(i10).d();
        }
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f7720j = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    @Override // x1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i(x1.m r10, x1.a0 r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a0.i(x1.m, x1.a0):int");
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        byte[] bArr = new byte[14];
        mVar.o(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            mVar.p(bArr[13] & 7);
            mVar.o(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }
}
