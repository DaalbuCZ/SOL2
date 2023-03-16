package h2;

import h2.i0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f7979a;

    /* renamed from: b  reason: collision with root package name */
    private String f7980b;

    /* renamed from: c  reason: collision with root package name */
    private x1.e0 f7981c;

    /* renamed from: d  reason: collision with root package name */
    private a f7982d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7983e;

    /* renamed from: l  reason: collision with root package name */
    private long f7990l;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f7984f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f7985g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f7986h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f7987i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f7988j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f7989k = new u(40, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f7991m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final p3.a0 f7992n = new p3.a0();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x1.e0 f7993a;

        /* renamed from: b  reason: collision with root package name */
        private long f7994b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f7995c;

        /* renamed from: d  reason: collision with root package name */
        private int f7996d;

        /* renamed from: e  reason: collision with root package name */
        private long f7997e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7998f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f7999g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f8000h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8001i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f8002j;

        /* renamed from: k  reason: collision with root package name */
        private long f8003k;

        /* renamed from: l  reason: collision with root package name */
        private long f8004l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f8005m;

        public a(x1.e0 e0Var) {
            this.f7993a = e0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f8004l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f8005m;
            this.f7993a.c(j10, z10 ? 1 : 0, (int) (this.f7994b - this.f8003k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f8002j && this.f7999g) {
                this.f8005m = this.f7995c;
                this.f8002j = false;
            } else if (this.f8000h || this.f7999g) {
                if (z10 && this.f8001i) {
                    d(i10 + ((int) (j10 - this.f7994b)));
                }
                this.f8003k = this.f7994b;
                this.f8004l = this.f7997e;
                this.f8005m = this.f7995c;
                this.f8001i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f7998f) {
                int i12 = this.f7996d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f7996d = i12 + (i11 - i10);
                    return;
                }
                this.f7999g = (bArr[i13] & 128) != 0;
                this.f7998f = false;
            }
        }

        public void f() {
            this.f7998f = false;
            this.f7999g = false;
            this.f8000h = false;
            this.f8001i = false;
            this.f8002j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f7999g = false;
            this.f8000h = false;
            this.f7997e = j11;
            this.f7996d = 0;
            this.f7994b = j10;
            if (!c(i11)) {
                if (this.f8001i && !this.f8002j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f8001i = false;
                }
                if (b(i11)) {
                    this.f8000h = !this.f8002j;
                    this.f8002j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f7995c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f7998f = z11;
        }
    }

    public q(d0 d0Var) {
        this.f7979a = d0Var;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void f() {
        p3.a.h(this.f7981c);
        m0.j(this.f7982d);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void g(long j10, int i10, int i11, long j11) {
        this.f7982d.a(j10, i10, this.f7983e);
        if (!this.f7983e) {
            this.f7985g.b(i11);
            this.f7986h.b(i11);
            this.f7987i.b(i11);
            if (this.f7985g.c() && this.f7986h.c() && this.f7987i.c()) {
                this.f7981c.e(i(this.f7980b, this.f7985g, this.f7986h, this.f7987i));
                this.f7983e = true;
            }
        }
        if (this.f7988j.b(i11)) {
            u uVar = this.f7988j;
            this.f7992n.M(this.f7988j.f8048d, p3.w.q(uVar.f8048d, uVar.f8049e));
            this.f7992n.P(5);
            this.f7979a.a(j11, this.f7992n);
        }
        if (this.f7989k.b(i11)) {
            u uVar2 = this.f7989k;
            this.f7992n.M(this.f7989k.f8048d, p3.w.q(uVar2.f8048d, uVar2.f8049e));
            this.f7992n.P(5);
            this.f7979a.a(j11, this.f7992n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void h(byte[] bArr, int i10, int i11) {
        this.f7982d.e(bArr, i10, i11);
        if (!this.f7983e) {
            this.f7985g.a(bArr, i10, i11);
            this.f7986h.a(bArr, i10, i11);
            this.f7987i.a(bArr, i10, i11);
        }
        this.f7988j.a(bArr, i10, i11);
        this.f7989k.a(bArr, i10, i11);
    }

    private static m1 i(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f8049e;
        byte[] bArr = new byte[uVar2.f8049e + i10 + uVar3.f8049e];
        System.arraycopy(uVar.f8048d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f8048d, 0, bArr, uVar.f8049e, uVar2.f8049e);
        System.arraycopy(uVar3.f8048d, 0, bArr, uVar.f8049e + uVar2.f8049e, uVar3.f8049e);
        p3.b0 b0Var = new p3.b0(uVar2.f8048d, 0, uVar2.f8049e);
        b0Var.l(44);
        int e10 = b0Var.e(3);
        b0Var.k();
        int e11 = b0Var.e(2);
        boolean d10 = b0Var.d();
        int e12 = b0Var.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (b0Var.d()) {
                i11 |= 1 << i12;
            }
        }
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = b0Var.e(8);
        }
        int e13 = b0Var.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < e10; i15++) {
            if (b0Var.d()) {
                i14 += 89;
            }
            if (b0Var.d()) {
                i14 += 8;
            }
        }
        b0Var.l(i14);
        if (e10 > 0) {
            b0Var.l((8 - e10) * 2);
        }
        b0Var.h();
        int h10 = b0Var.h();
        if (h10 == 3) {
            b0Var.k();
        }
        int h11 = b0Var.h();
        int h12 = b0Var.h();
        if (b0Var.d()) {
            int h13 = b0Var.h();
            int h14 = b0Var.h();
            int h15 = b0Var.h();
            int h16 = b0Var.h();
            h11 -= ((h10 == 1 || h10 == 2) ? 2 : 1) * (h13 + h14);
            h12 -= (h10 == 1 ? 2 : 1) * (h15 + h16);
        }
        b0Var.h();
        b0Var.h();
        int h17 = b0Var.h();
        int i16 = b0Var.d() ? 0 : e10;
        while (true) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
            if (i16 > e10) {
                break;
            }
            i16++;
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            j(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        k(b0Var);
        if (b0Var.d()) {
            for (int i17 = 0; i17 < b0Var.h(); i17++) {
                b0Var.l(h17 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f10 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int e14 = b0Var.e(8);
                if (e14 == 255) {
                    int e15 = b0Var.e(16);
                    int e16 = b0Var.e(16);
                    if (e15 != 0 && e16 != 0) {
                        f10 = e15 / e16;
                    }
                } else {
                    float[] fArr = p3.w.f12351b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        p3.r.i("H265Reader", "Unexpected aspect_ratio_idc value: " + e14);
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                h12 *= 2;
            }
        }
        return new m1.b().S(str).e0("video/hevc").I(p3.e.c(e11, d10, e12, i11, iArr, e13)).j0(h11).Q(h12).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    private static void j(p3.b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (b0Var.d()) {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        b0Var.g();
                    }
                } else {
                    b0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void k(p3.b0 b0Var) {
        int h10 = b0Var.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = b0Var.d();
            }
            if (z10) {
                b0Var.k();
                b0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (b0Var.d()) {
                        b0Var.k();
                    }
                }
            } else {
                int h11 = b0Var.h();
                int h12 = b0Var.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    b0Var.h();
                    b0Var.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    b0Var.h();
                    b0Var.k();
                }
                i10 = i13;
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void l(long j10, int i10, int i11, long j11) {
        this.f7982d.g(j10, i10, i11, j11, this.f7983e);
        if (!this.f7983e) {
            this.f7985g.e(i11);
            this.f7986h.e(i11);
            this.f7987i.e(i11);
        }
        this.f7988j.e(i11);
        this.f7989k.e(i11);
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        f();
        while (a0Var.a() > 0) {
            int e10 = a0Var.e();
            int f10 = a0Var.f();
            byte[] d10 = a0Var.d();
            this.f7990l += a0Var.a();
            this.f7981c.d(a0Var, a0Var.a());
            while (e10 < f10) {
                int c10 = p3.w.c(d10, e10, f10, this.f7984f);
                if (c10 == f10) {
                    h(d10, e10, f10);
                    return;
                }
                int e11 = p3.w.e(d10, c10);
                int i10 = c10 - e10;
                if (i10 > 0) {
                    h(d10, e10, c10);
                }
                int i11 = f10 - c10;
                long j10 = this.f7990l - i11;
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f7991m);
                l(j10, i11, e11, this.f7991m);
                e10 = c10 + 3;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f7990l = 0L;
        this.f7991m = -9223372036854775807L;
        p3.w.a(this.f7984f);
        this.f7985g.d();
        this.f7986h.d();
        this.f7987i.d();
        this.f7988j.d();
        this.f7989k.d();
        a aVar = this.f7982d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7980b = dVar.b();
        x1.e0 e10 = nVar.e(dVar.c(), 2);
        this.f7981c = e10;
        this.f7982d = new a(e10);
        this.f7979a.b(nVar, dVar);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7991m = j10;
        }
    }
}
