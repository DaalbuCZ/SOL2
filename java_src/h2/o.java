package h2;

import h2.i0;
import java.util.Arrays;
import java.util.Collections;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f7904l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f7905a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f7906b;

    /* renamed from: e  reason: collision with root package name */
    private final u f7909e;

    /* renamed from: f  reason: collision with root package name */
    private b f7910f;

    /* renamed from: g  reason: collision with root package name */
    private long f7911g;

    /* renamed from: h  reason: collision with root package name */
    private String f7912h;

    /* renamed from: i  reason: collision with root package name */
    private x1.e0 f7913i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7914j;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f7907c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f7908d = new a(128);

    /* renamed from: k  reason: collision with root package name */
    private long f7915k = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f7916f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f7917a;

        /* renamed from: b  reason: collision with root package name */
        private int f7918b;

        /* renamed from: c  reason: collision with root package name */
        public int f7919c;

        /* renamed from: d  reason: collision with root package name */
        public int f7920d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f7921e;

        public a(int i10) {
            this.f7921e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f7917a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f7921e;
                int length = bArr2.length;
                int i13 = this.f7919c;
                if (length < i13 + i12) {
                    this.f7921e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f7921e, this.f7919c, i12);
                this.f7919c += i12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
            if (r9 != 181) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f7918b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L3f
                r7 = 3
                if (r0 == r4) goto L37
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L53
            L1d:
                int r9 = r8.f7919c
                int r9 = r9 - r10
                r8.f7919c = r9
                r8.f7917a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L32
                goto L41
            L32:
                int r9 = r8.f7919c
                r8.f7920d = r9
                goto L48
            L37:
                r10 = 31
                if (r9 <= r10) goto L3c
                goto L41
            L3c:
                r8.f7918b = r7
                goto L53
            L3f:
                if (r9 == r3) goto L48
            L41:
                p3.r.i(r6, r5)
                r8.c()
                goto L53
            L48:
                r8.f7918b = r4
                goto L53
            L4b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L53
                r8.f7918b = r2
                r8.f7917a = r2
            L53:
                byte[] r9 = h2.o.a.f7916f
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.o.a.b(int, int):boolean");
        }

        public void c() {
            this.f7917a = false;
            this.f7919c = 0;
            this.f7918b = 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final x1.e0 f7922a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7923b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f7924c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f7925d;

        /* renamed from: e  reason: collision with root package name */
        private int f7926e;

        /* renamed from: f  reason: collision with root package name */
        private int f7927f;

        /* renamed from: g  reason: collision with root package name */
        private long f7928g;

        /* renamed from: h  reason: collision with root package name */
        private long f7929h;

        public b(x1.e0 e0Var) {
            this.f7922a = e0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f7924c) {
                int i12 = this.f7927f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f7927f = i12 + (i11 - i10);
                    return;
                }
                this.f7925d = ((bArr[i13] & 192) >> 6) == 0;
                this.f7924c = false;
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f7926e == 182 && z10 && this.f7923b) {
                long j11 = this.f7929h;
                if (j11 != -9223372036854775807L) {
                    this.f7922a.c(j11, this.f7925d ? 1 : 0, (int) (j10 - this.f7928g), i10, null);
                }
            }
            if (this.f7926e != 179) {
                this.f7928g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f7926e = i10;
            this.f7925d = false;
            this.f7923b = i10 == 182 || i10 == 179;
            this.f7924c = i10 == 182;
            this.f7927f = 0;
            this.f7929h = j10;
        }

        public void d() {
            this.f7923b = false;
            this.f7924c = false;
            this.f7925d = false;
            this.f7926e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(k0 k0Var) {
        p3.a0 a0Var;
        this.f7905a = k0Var;
        if (k0Var != null) {
            this.f7909e = new u(178, 128);
            a0Var = new p3.a0();
        } else {
            a0Var = null;
            this.f7909e = null;
        }
        this.f7906b = a0Var;
    }

    private static m1 f(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f7921e, aVar.f7919c);
        p3.z zVar = new p3.z(copyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int h10 = zVar.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = zVar.h(8);
            int h12 = zVar.h(8);
            if (h12 != 0) {
                f10 = h11 / h12;
            }
            p3.r.i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f7904l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            }
            p3.r.i("H263Reader", "Invalid aspect ratio");
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            p3.r.i("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int h13 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (h13 == 0) {
                p3.r.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int h14 = zVar.h(13);
        zVar.q();
        int h15 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new m1.b().S(str).e0("video/mp4v-es").j0(h14).Q(h15).a0(f10).T(Collections.singletonList(copyOf)).E();
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f7910f);
        p3.a.h(this.f7913i);
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        byte[] d10 = a0Var.d();
        this.f7911g += a0Var.a();
        this.f7913i.d(a0Var, a0Var.a());
        while (true) {
            int c10 = p3.w.c(d10, e10, f10, this.f7907c);
            if (c10 == f10) {
                break;
            }
            int i10 = c10 + 3;
            int i11 = a0Var.d()[i10] & 255;
            int i12 = c10 - e10;
            int i13 = 0;
            if (!this.f7914j) {
                if (i12 > 0) {
                    this.f7908d.a(d10, e10, c10);
                }
                if (this.f7908d.b(i11, i12 < 0 ? -i12 : 0)) {
                    x1.e0 e0Var = this.f7913i;
                    a aVar = this.f7908d;
                    e0Var.e(f(aVar, aVar.f7920d, (String) p3.a.e(this.f7912h)));
                    this.f7914j = true;
                }
            }
            this.f7910f.a(d10, e10, c10);
            u uVar = this.f7909e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(d10, e10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f7909e.b(i13)) {
                    u uVar2 = this.f7909e;
                    ((p3.a0) m0.j(this.f7906b)).M(this.f7909e.f8048d, p3.w.q(uVar2.f8048d, uVar2.f8049e));
                    ((k0) m0.j(this.f7905a)).a(this.f7915k, this.f7906b);
                }
                if (i11 == 178 && a0Var.d()[c10 + 2] == 1) {
                    this.f7909e.e(i11);
                }
            }
            int i14 = f10 - c10;
            this.f7910f.b(this.f7911g - i14, i14, this.f7914j);
            this.f7910f.c(i11, this.f7915k);
            e10 = i10;
        }
        if (!this.f7914j) {
            this.f7908d.a(d10, e10, f10);
        }
        this.f7910f.a(d10, e10, f10);
        u uVar3 = this.f7909e;
        if (uVar3 != null) {
            uVar3.a(d10, e10, f10);
        }
    }

    @Override // h2.m
    public void b() {
        p3.w.a(this.f7907c);
        this.f7908d.c();
        b bVar = this.f7910f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f7909e;
        if (uVar != null) {
            uVar.d();
        }
        this.f7911g = 0L;
        this.f7915k = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7912h = dVar.b();
        x1.e0 e10 = nVar.e(dVar.c(), 2);
        this.f7913i = e10;
        this.f7910f = new b(e10);
        k0 k0Var = this.f7905a;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7915k = j10;
        }
    }
}
