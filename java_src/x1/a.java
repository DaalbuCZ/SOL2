package x1;

import p3.m0;
import x1.b0;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0233a f16165a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f16166b;

    /* renamed from: c  reason: collision with root package name */
    protected c f16167c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16168d;

    /* renamed from: x1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0233a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final d f16169a;

        /* renamed from: b  reason: collision with root package name */
        private final long f16170b;

        /* renamed from: c  reason: collision with root package name */
        private final long f16171c;

        /* renamed from: d  reason: collision with root package name */
        private final long f16172d;

        /* renamed from: e  reason: collision with root package name */
        private final long f16173e;

        /* renamed from: f  reason: collision with root package name */
        private final long f16174f;

        /* renamed from: g  reason: collision with root package name */
        private final long f16175g;

        public C0233a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f16169a = dVar;
            this.f16170b = j10;
            this.f16171c = j11;
            this.f16172d = j12;
            this.f16173e = j13;
            this.f16174f = j14;
            this.f16175g = j15;
        }

        @Override // x1.b0
        public boolean f() {
            return true;
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            return new b0.a(new c0(j10, c.h(this.f16169a.a(j10), this.f16171c, this.f16172d, this.f16173e, this.f16174f, this.f16175g)));
        }

        @Override // x1.b0
        public long h() {
            return this.f16170b;
        }

        public long k(long j10) {
            return this.f16169a.a(j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // x1.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f16176a;

        /* renamed from: b  reason: collision with root package name */
        private final long f16177b;

        /* renamed from: c  reason: collision with root package name */
        private final long f16178c;

        /* renamed from: d  reason: collision with root package name */
        private long f16179d;

        /* renamed from: e  reason: collision with root package name */
        private long f16180e;

        /* renamed from: f  reason: collision with root package name */
        private long f16181f;

        /* renamed from: g  reason: collision with root package name */
        private long f16182g;

        /* renamed from: h  reason: collision with root package name */
        private long f16183h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f16176a = j10;
            this.f16177b = j11;
            this.f16179d = j12;
            this.f16180e = j13;
            this.f16181f = j14;
            this.f16182g = j15;
            this.f16178c = j16;
            this.f16183h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return m0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f16182g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f16181f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f16183h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f16176a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f16177b;
        }

        private void n() {
            this.f16183h = h(this.f16177b, this.f16179d, this.f16180e, this.f16181f, this.f16182g, this.f16178c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f16180e = j10;
            this.f16182g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f16179d = j10;
            this.f16181f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j10);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f16184d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        private final int f16185a;

        /* renamed from: b  reason: collision with root package name */
        private final long f16186b;

        /* renamed from: c  reason: collision with root package name */
        private final long f16187c;

        private e(int i10, long j10, long j11) {
            this.f16185a = i10;
            this.f16186b = j10;
            this.f16187c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface f {
        e a(m mVar, long j10);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f16166b = fVar;
        this.f16168d = i10;
        this.f16165a = new C0233a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f16165a.k(j10), this.f16165a.f16171c, this.f16165a.f16172d, this.f16165a.f16173e, this.f16165a.f16174f, this.f16165a.f16175g);
    }

    public final b0 b() {
        return this.f16165a;
    }

    public int c(m mVar, a0 a0Var) {
        while (true) {
            c cVar = (c) p3.a.h(this.f16167c);
            long j10 = cVar.j();
            long i10 = cVar.i();
            long k10 = cVar.k();
            if (i10 - j10 <= this.f16168d) {
                e(false, j10);
                return g(mVar, j10, a0Var);
            } else if (!i(mVar, k10)) {
                return g(mVar, k10, a0Var);
            } else {
                mVar.g();
                e a10 = this.f16166b.a(mVar, cVar.m());
                int i11 = a10.f16185a;
                if (i11 == -3) {
                    e(false, k10);
                    return g(mVar, k10, a0Var);
                } else if (i11 == -2) {
                    cVar.p(a10.f16186b, a10.f16187c);
                } else if (i11 != -1) {
                    if (i11 == 0) {
                        i(mVar, a10.f16187c);
                        e(true, a10.f16187c);
                        return g(mVar, a10.f16187c, a0Var);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    cVar.o(a10.f16186b, a10.f16187c);
                }
            }
        }
    }

    public final boolean d() {
        return this.f16167c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f16167c = null;
        this.f16166b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(m mVar, long j10, a0 a0Var) {
        if (j10 == mVar.q()) {
            return 0;
        }
        a0Var.f16188a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f16167c;
        if (cVar == null || cVar.l() != j10) {
            this.f16167c = a(j10);
        }
    }

    protected final boolean i(m mVar, long j10) {
        long q10 = j10 - mVar.q();
        if (q10 < 0 || q10 > 262144) {
            return false;
        }
        mVar.h((int) q10);
        return true;
    }
}
