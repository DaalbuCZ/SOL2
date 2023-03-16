package h2;

import android.util.SparseArray;
import h2.i0;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import p3.w;
import s1.m1;
/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f7930a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7931b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7932c;

    /* renamed from: g  reason: collision with root package name */
    private long f7936g;

    /* renamed from: i  reason: collision with root package name */
    private String f7938i;

    /* renamed from: j  reason: collision with root package name */
    private x1.e0 f7939j;

    /* renamed from: k  reason: collision with root package name */
    private b f7940k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7941l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7943n;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f7937h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    private final u f7933d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f7934e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f7935f = new u(6, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f7942m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    private final p3.a0 f7944o = new p3.a0();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final x1.e0 f7945a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f7946b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f7947c;

        /* renamed from: f  reason: collision with root package name */
        private final p3.b0 f7950f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f7951g;

        /* renamed from: h  reason: collision with root package name */
        private int f7952h;

        /* renamed from: i  reason: collision with root package name */
        private int f7953i;

        /* renamed from: j  reason: collision with root package name */
        private long f7954j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f7955k;

        /* renamed from: l  reason: collision with root package name */
        private long f7956l;

        /* renamed from: o  reason: collision with root package name */
        private boolean f7959o;

        /* renamed from: p  reason: collision with root package name */
        private long f7960p;

        /* renamed from: q  reason: collision with root package name */
        private long f7961q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f7962r;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray<w.c> f7948d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray<w.b> f7949e = new SparseArray<>();

        /* renamed from: m  reason: collision with root package name */
        private a f7957m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f7958n = new a();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f7963a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f7964b;

            /* renamed from: c  reason: collision with root package name */
            private w.c f7965c;

            /* renamed from: d  reason: collision with root package name */
            private int f7966d;

            /* renamed from: e  reason: collision with root package name */
            private int f7967e;

            /* renamed from: f  reason: collision with root package name */
            private int f7968f;

            /* renamed from: g  reason: collision with root package name */
            private int f7969g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f7970h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f7971i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f7972j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f7973k;

            /* renamed from: l  reason: collision with root package name */
            private int f7974l;

            /* renamed from: m  reason: collision with root package name */
            private int f7975m;

            /* renamed from: n  reason: collision with root package name */
            private int f7976n;

            /* renamed from: o  reason: collision with root package name */
            private int f7977o;

            /* renamed from: p  reason: collision with root package name */
            private int f7978p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (this.f7963a) {
                    if (aVar.f7963a) {
                        w.c cVar = (w.c) p3.a.h(this.f7965c);
                        w.c cVar2 = (w.c) p3.a.h(aVar.f7965c);
                        return (this.f7968f == aVar.f7968f && this.f7969g == aVar.f7969g && this.f7970h == aVar.f7970h && (!this.f7971i || !aVar.f7971i || this.f7972j == aVar.f7972j) && (((i10 = this.f7966d) == (i11 = aVar.f7966d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f12378l) != 0 || cVar2.f12378l != 0 || (this.f7975m == aVar.f7975m && this.f7976n == aVar.f7976n)) && ((i12 != 1 || cVar2.f12378l != 1 || (this.f7977o == aVar.f7977o && this.f7978p == aVar.f7978p)) && (z10 = this.f7973k) == aVar.f7973k && (!z10 || this.f7974l == aVar.f7974l))))) ? false : true;
                    }
                    return true;
                }
                return false;
            }

            public void b() {
                this.f7964b = false;
                this.f7963a = false;
            }

            public boolean d() {
                int i10;
                return this.f7964b && ((i10 = this.f7967e) == 7 || i10 == 2);
            }

            public void e(w.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f7965c = cVar;
                this.f7966d = i10;
                this.f7967e = i11;
                this.f7968f = i12;
                this.f7969g = i13;
                this.f7970h = z10;
                this.f7971i = z11;
                this.f7972j = z12;
                this.f7973k = z13;
                this.f7974l = i14;
                this.f7975m = i15;
                this.f7976n = i16;
                this.f7977o = i17;
                this.f7978p = i18;
                this.f7963a = true;
                this.f7964b = true;
            }

            public void f(int i10) {
                this.f7967e = i10;
                this.f7964b = true;
            }
        }

        public b(x1.e0 e0Var, boolean z10, boolean z11) {
            this.f7945a = e0Var;
            this.f7946b = z10;
            this.f7947c = z11;
            byte[] bArr = new byte[128];
            this.f7951g = bArr;
            this.f7950f = new p3.b0(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f7961q;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f7962r;
            this.f7945a.c(j10, z10 ? 1 : 0, (int) (this.f7954j - this.f7960p), i10, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f7953i == 9 || (this.f7947c && this.f7958n.c(this.f7957m))) {
                if (z10 && this.f7959o) {
                    d(i10 + ((int) (j10 - this.f7954j)));
                }
                this.f7960p = this.f7954j;
                this.f7961q = this.f7956l;
                this.f7962r = false;
                this.f7959o = true;
            }
            if (this.f7946b) {
                z11 = this.f7958n.d();
            }
            boolean z13 = this.f7962r;
            int i11 = this.f7953i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f7962r = z14;
            return z14;
        }

        public boolean c() {
            return this.f7947c;
        }

        public void e(w.b bVar) {
            this.f7949e.append(bVar.f12364a, bVar);
        }

        public void f(w.c cVar) {
            this.f7948d.append(cVar.f12370d, cVar);
        }

        public void g() {
            this.f7955k = false;
            this.f7959o = false;
            this.f7958n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f7953i = i10;
            this.f7956l = j11;
            this.f7954j = j10;
            if (!this.f7946b || i10 != 1) {
                if (!this.f7947c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f7957m;
            this.f7957m = this.f7958n;
            this.f7958n = aVar;
            aVar.b();
            this.f7952h = 0;
            this.f7955k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f7930a = d0Var;
        this.f7931b = z10;
        this.f7932c = z11;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void f() {
        p3.a.h(this.f7939j);
        m0.j(this.f7940k);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void g(long j10, int i10, int i11, long j11) {
        u uVar;
        if (!this.f7941l || this.f7940k.c()) {
            this.f7933d.b(i11);
            this.f7934e.b(i11);
            if (this.f7941l) {
                if (this.f7933d.c()) {
                    u uVar2 = this.f7933d;
                    this.f7940k.f(p3.w.l(uVar2.f8048d, 3, uVar2.f8049e));
                    uVar = this.f7933d;
                } else if (this.f7934e.c()) {
                    u uVar3 = this.f7934e;
                    this.f7940k.e(p3.w.j(uVar3.f8048d, 3, uVar3.f8049e));
                    uVar = this.f7934e;
                }
            } else if (this.f7933d.c() && this.f7934e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar4 = this.f7933d;
                arrayList.add(Arrays.copyOf(uVar4.f8048d, uVar4.f8049e));
                u uVar5 = this.f7934e;
                arrayList.add(Arrays.copyOf(uVar5.f8048d, uVar5.f8049e));
                u uVar6 = this.f7933d;
                w.c l10 = p3.w.l(uVar6.f8048d, 3, uVar6.f8049e);
                u uVar7 = this.f7934e;
                w.b j12 = p3.w.j(uVar7.f8048d, 3, uVar7.f8049e);
                this.f7939j.e(new m1.b().S(this.f7938i).e0("video/avc").I(p3.e.a(l10.f12367a, l10.f12368b, l10.f12369c)).j0(l10.f12372f).Q(l10.f12373g).a0(l10.f12374h).T(arrayList).E());
                this.f7941l = true;
                this.f7940k.f(l10);
                this.f7940k.e(j12);
                this.f7933d.d();
                uVar = this.f7934e;
            }
            uVar.d();
        }
        if (this.f7935f.b(i11)) {
            u uVar8 = this.f7935f;
            this.f7944o.M(this.f7935f.f8048d, p3.w.q(uVar8.f8048d, uVar8.f8049e));
            this.f7944o.O(4);
            this.f7930a.a(j11, this.f7944o);
        }
        if (this.f7940k.b(j10, i10, this.f7941l, this.f7943n)) {
            this.f7943n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f7941l || this.f7940k.c()) {
            this.f7933d.a(bArr, i10, i11);
            this.f7934e.a(bArr, i10, i11);
        }
        this.f7935f.a(bArr, i10, i11);
        this.f7940k.a(bArr, i10, i11);
    }

    @RequiresNonNull({"sampleReader"})
    private void i(long j10, int i10, long j11) {
        if (!this.f7941l || this.f7940k.c()) {
            this.f7933d.e(i10);
            this.f7934e.e(i10);
        }
        this.f7935f.e(i10);
        this.f7940k.h(j10, i10, j11);
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        f();
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        byte[] d10 = a0Var.d();
        this.f7936g += a0Var.a();
        this.f7939j.d(a0Var, a0Var.a());
        while (true) {
            int c10 = p3.w.c(d10, e10, f10, this.f7937h);
            if (c10 == f10) {
                h(d10, e10, f10);
                return;
            }
            int f11 = p3.w.f(d10, c10);
            int i10 = c10 - e10;
            if (i10 > 0) {
                h(d10, e10, c10);
            }
            int i11 = f10 - c10;
            long j10 = this.f7936g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f7942m);
            i(j10, f11, this.f7942m);
            e10 = c10 + 3;
        }
    }

    @Override // h2.m
    public void b() {
        this.f7936g = 0L;
        this.f7943n = false;
        this.f7942m = -9223372036854775807L;
        p3.w.a(this.f7937h);
        this.f7933d.d();
        this.f7934e.d();
        this.f7935f.d();
        b bVar = this.f7940k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f7938i = dVar.b();
        x1.e0 e10 = nVar.e(dVar.c(), 2);
        this.f7939j = e10;
        this.f7940k = new b(e10, this.f7931b, this.f7932c);
        this.f7930a.b(nVar, dVar);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f7942m = j10;
        }
        this.f7943n |= (i10 & 2) != 0;
    }
}
