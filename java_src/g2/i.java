package g2;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.m0;
import s1.m1;
import x1.a0;
import x1.b0;
import x1.e0;
import x1.m;
import x1.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    private e0 f7502b;

    /* renamed from: c  reason: collision with root package name */
    private n f7503c;

    /* renamed from: d  reason: collision with root package name */
    private g f7504d;

    /* renamed from: e  reason: collision with root package name */
    private long f7505e;

    /* renamed from: f  reason: collision with root package name */
    private long f7506f;

    /* renamed from: g  reason: collision with root package name */
    private long f7507g;

    /* renamed from: h  reason: collision with root package name */
    private int f7508h;

    /* renamed from: i  reason: collision with root package name */
    private int f7509i;

    /* renamed from: k  reason: collision with root package name */
    private long f7511k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7512l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7513m;

    /* renamed from: a  reason: collision with root package name */
    private final e f7501a = new e();

    /* renamed from: j  reason: collision with root package name */
    private b f7510j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        m1 f7514a;

        /* renamed from: b  reason: collision with root package name */
        g f7515b;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements g {
        private c() {
        }

        @Override // g2.g
        public b0 a() {
            return new b0.b(-9223372036854775807L);
        }

        @Override // g2.g
        public long b(m mVar) {
            return -1L;
        }

        @Override // g2.g
        public void c(long j10) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void a() {
        p3.a.h(this.f7502b);
        m0.j(this.f7503c);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean i(m mVar) {
        while (this.f7501a.d(mVar)) {
            this.f7511k = mVar.q() - this.f7506f;
            if (!h(this.f7501a.c(), this.f7506f, this.f7510j)) {
                return true;
            }
            this.f7506f = mVar.q();
        }
        this.f7508h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    private int j(m mVar) {
        if (i(mVar)) {
            m1 m1Var = this.f7510j.f7514a;
            this.f7509i = m1Var.M;
            if (!this.f7513m) {
                this.f7502b.e(m1Var);
                this.f7513m = true;
            }
            g gVar = this.f7510j.f7515b;
            if (gVar == null) {
                if (mVar.a() != -1) {
                    f b10 = this.f7501a.b();
                    this.f7504d = new g2.a(this, this.f7506f, mVar.a(), b10.f7494h + b10.f7495i, b10.f7489c, (b10.f7488b & 4) != 0);
                    this.f7508h = 2;
                    this.f7501a.f();
                    return 0;
                }
                gVar = new c();
            }
            this.f7504d = gVar;
            this.f7508h = 2;
            this.f7501a.f();
            return 0;
        }
        return -1;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int k(m mVar, a0 a0Var) {
        long b10 = this.f7504d.b(mVar);
        if (b10 >= 0) {
            a0Var.f16188a = b10;
            return 1;
        }
        if (b10 < -1) {
            e(-(b10 + 2));
        }
        if (!this.f7512l) {
            this.f7503c.t((b0) p3.a.h(this.f7504d.a()));
            this.f7512l = true;
        }
        if (this.f7511k <= 0 && !this.f7501a.d(mVar)) {
            this.f7508h = 3;
            return -1;
        }
        this.f7511k = 0L;
        p3.a0 c10 = this.f7501a.c();
        long f10 = f(c10);
        if (f10 >= 0) {
            long j10 = this.f7507g;
            if (j10 + f10 >= this.f7505e) {
                long b11 = b(j10);
                this.f7502b.d(c10, c10.f());
                this.f7502b.c(b11, 1, c10.f(), 0, null);
                this.f7505e = -1L;
            }
        }
        this.f7507g += f10;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / this.f7509i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(long j10) {
        return (this.f7509i * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(n nVar, e0 e0Var) {
        this.f7503c = nVar;
        this.f7502b = e0Var;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(long j10) {
        this.f7507g = j10;
    }

    protected abstract long f(p3.a0 a0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(m mVar, a0 a0Var) {
        a();
        int i10 = this.f7508h;
        if (i10 != 0) {
            if (i10 == 1) {
                mVar.h((int) this.f7506f);
                this.f7508h = 2;
                return 0;
            } else if (i10 == 2) {
                m0.j(this.f7504d);
                return k(mVar, a0Var);
            } else if (i10 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        return j(mVar);
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean h(p3.a0 a0Var, long j10, b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(boolean z10) {
        int i10;
        if (z10) {
            this.f7510j = new b();
            this.f7506f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f7508h = i10;
        this.f7505e = -1L;
        this.f7507g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f7501a.e();
        if (j10 == 0) {
            l(!this.f7512l);
        } else if (this.f7508h != 0) {
            this.f7505e = c(j11);
            ((g) m0.j(this.f7504d)).c(this.f7505e);
            this.f7508h = 2;
        }
    }
}
