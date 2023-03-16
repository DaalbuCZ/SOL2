package h2;

import h2.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class w implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f8053a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.z f8054b = new p3.z(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f8055c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f8056d;

    /* renamed from: e  reason: collision with root package name */
    private p3.i0 f8057e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8058f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8059g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8060h;

    /* renamed from: i  reason: collision with root package name */
    private int f8061i;

    /* renamed from: j  reason: collision with root package name */
    private int f8062j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8063k;

    /* renamed from: l  reason: collision with root package name */
    private long f8064l;

    public w(m mVar) {
        this.f8053a = mVar;
    }

    private boolean d(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f8056d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.P(min);
        } else {
            a0Var.j(bArr, this.f8056d, min);
        }
        int i11 = this.f8056d + min;
        this.f8056d = i11;
        return i11 == i10;
    }

    private boolean e() {
        this.f8054b.p(0);
        int h10 = this.f8054b.h(24);
        if (h10 != 1) {
            p3.r.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f8062j = -1;
            return false;
        }
        this.f8054b.r(8);
        int h11 = this.f8054b.h(16);
        this.f8054b.r(5);
        this.f8063k = this.f8054b.g();
        this.f8054b.r(2);
        this.f8058f = this.f8054b.g();
        this.f8059g = this.f8054b.g();
        this.f8054b.r(6);
        int h12 = this.f8054b.h(8);
        this.f8061i = h12;
        if (h11 != 0) {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f8062j = i10;
            if (i10 < 0) {
                p3.r.i("PesReader", "Found negative packet payload size: " + this.f8062j);
            }
            return true;
        }
        this.f8062j = -1;
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void f() {
        this.f8054b.p(0);
        this.f8064l = -9223372036854775807L;
        if (this.f8058f) {
            this.f8054b.r(4);
            this.f8054b.r(1);
            this.f8054b.r(1);
            long h10 = (this.f8054b.h(3) << 30) | (this.f8054b.h(15) << 15) | this.f8054b.h(15);
            this.f8054b.r(1);
            if (!this.f8060h && this.f8059g) {
                this.f8054b.r(4);
                this.f8054b.r(1);
                this.f8054b.r(1);
                this.f8054b.r(1);
                this.f8057e.b((this.f8054b.h(3) << 30) | (this.f8054b.h(15) << 15) | this.f8054b.h(15));
                this.f8060h = true;
            }
            this.f8064l = this.f8057e.b(h10);
        }
    }

    private void g(int i10) {
        this.f8055c = i10;
        this.f8056d = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:35:0x007c). Please submit an issue!!! */
    @Override // h2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(p3.a0 r8, int r9) {
        /*
            r7 = this;
            p3.i0 r0 = r7.f8057e
            p3.a.h(r0)
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L47
            int r0 = r7.f8055c
            if (r0 == 0) goto L44
            if (r0 == r4) goto L44
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L3f
            if (r0 != r2) goto L39
            int r0 = r7.f8062j
            if (r0 == r1) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f8062j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p3.r.i(r5, r0)
            goto L7c
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L3f:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            p3.r.i(r5, r0)
        L44:
            r7.g(r4)
        L47:
            int r0 = r8.a()
            if (r0 <= 0) goto Ld8
            int r0 = r7.f8055c
            if (r0 == 0) goto Lcf
            r5 = 0
            if (r0 == r4) goto Lb7
            if (r0 == r3) goto L88
            if (r0 != r2) goto L82
            int r0 = r8.a()
            int r6 = r7.f8062j
            if (r6 != r1) goto L61
            goto L63
        L61:
            int r5 = r0 - r6
        L63:
            if (r5 <= 0) goto L6e
            int r0 = r0 - r5
            int r5 = r8.e()
            int r5 = r5 + r0
            r8.N(r5)
        L6e:
            h2.m r5 = r7.f8053a
            r5.a(r8)
            int r5 = r7.f8062j
            if (r5 == r1) goto L47
            int r5 = r5 - r0
            r7.f8062j = r5
            if (r5 != 0) goto L47
        L7c:
            h2.m r0 = r7.f8053a
            r0.d()
            goto L44
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L88:
            r0 = 10
            int r6 = r7.f8061i
            int r0 = java.lang.Math.min(r0, r6)
            p3.z r6 = r7.f8054b
            byte[] r6 = r6.f12390a
            boolean r0 = r7.d(r8, r6, r0)
            if (r0 == 0) goto L47
            r0 = 0
            int r6 = r7.f8061i
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L47
            r7.f()
            boolean r0 = r7.f8063k
            if (r0 == 0) goto Lab
            r5 = 4
        Lab:
            r9 = r9 | r5
            h2.m r0 = r7.f8053a
            long r5 = r7.f8064l
            r0.e(r5, r9)
            r7.g(r2)
            goto L47
        Lb7:
            p3.z r0 = r7.f8054b
            byte[] r0 = r0.f12390a
            r6 = 9
            boolean r0 = r7.d(r8, r0, r6)
            if (r0 == 0) goto L47
            boolean r0 = r7.e()
            if (r0 == 0) goto Lca
            r5 = r3
        Lca:
            r7.g(r5)
            goto L47
        Lcf:
            int r0 = r8.a()
            r8.P(r0)
            goto L47
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.w.a(p3.a0, int):void");
    }

    @Override // h2.i0
    public final void b() {
        this.f8055c = 0;
        this.f8056d = 0;
        this.f8060h = false;
        this.f8053a.b();
    }

    @Override // h2.i0
    public void c(p3.i0 i0Var, x1.n nVar, i0.d dVar) {
        this.f8057e = i0Var;
        this.f8053a.c(nVar, dVar);
    }
}
