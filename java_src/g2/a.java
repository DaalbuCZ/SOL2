package g2;

import java.io.EOFException;
import java.io.IOException;
import p3.m0;
import x1.b0;
import x1.c0;
import x1.m;
import x1.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f7458a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7459b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7460c;

    /* renamed from: d  reason: collision with root package name */
    private final i f7461d;

    /* renamed from: e  reason: collision with root package name */
    private int f7462e;

    /* renamed from: f  reason: collision with root package name */
    private long f7463f;

    /* renamed from: g  reason: collision with root package name */
    private long f7464g;

    /* renamed from: h  reason: collision with root package name */
    private long f7465h;

    /* renamed from: i  reason: collision with root package name */
    private long f7466i;

    /* renamed from: j  reason: collision with root package name */
    private long f7467j;

    /* renamed from: k  reason: collision with root package name */
    private long f7468k;

    /* renamed from: l  reason: collision with root package name */
    private long f7469l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements b0 {
        private b() {
        }

        @Override // x1.b0
        public boolean f() {
            return true;
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            return new b0.a(new c0(j10, m0.r((a.this.f7459b + ((a.this.f7461d.c(j10) * (a.this.f7460c - a.this.f7459b)) / a.this.f7463f)) - 30000, a.this.f7459b, a.this.f7460c - 1)));
        }

        @Override // x1.b0
        public long h() {
            return a.this.f7461d.b(a.this.f7463f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        p3.a.a(j10 >= 0 && j11 > j10);
        this.f7461d = iVar;
        this.f7459b = j10;
        this.f7460c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f7463f = j13;
            this.f7462e = 4;
        } else {
            this.f7462e = 0;
        }
        this.f7458a = new f();
    }

    private long i(m mVar) {
        if (this.f7466i == this.f7467j) {
            return -1L;
        }
        long q10 = mVar.q();
        if (!this.f7458a.d(mVar, this.f7467j)) {
            long j10 = this.f7466i;
            if (j10 != q10) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f7458a.a(mVar, false);
        mVar.g();
        long j11 = this.f7465h;
        f fVar = this.f7458a;
        long j12 = fVar.f7489c;
        long j13 = j11 - j12;
        int i10 = fVar.f7494h + fVar.f7495i;
        if (0 > j13 || j13 >= 72000) {
            int i11 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
            if (i11 < 0) {
                this.f7467j = q10;
                this.f7469l = j12;
            } else {
                this.f7466i = mVar.q() + i10;
                this.f7468k = this.f7458a.f7489c;
            }
            long j14 = this.f7467j;
            long j15 = this.f7466i;
            if (j14 - j15 < 100000) {
                this.f7467j = j15;
                return j15;
            }
            long q11 = mVar.q() - (i10 * (i11 <= 0 ? 2L : 1L));
            long j16 = this.f7467j;
            long j17 = this.f7466i;
            return m0.r(q11 + ((j13 * (j16 - j17)) / (this.f7469l - this.f7468k)), j17, j16 - 1);
        }
        return -1L;
    }

    private void k(m mVar) {
        while (true) {
            this.f7458a.c(mVar);
            this.f7458a.a(mVar, false);
            f fVar = this.f7458a;
            if (fVar.f7489c > this.f7465h) {
                mVar.g();
                return;
            }
            mVar.h(fVar.f7494h + fVar.f7495i);
            this.f7466i = mVar.q();
            this.f7468k = this.f7458a.f7489c;
        }
    }

    @Override // g2.g
    public long b(m mVar) {
        int i10 = this.f7462e;
        if (i10 == 0) {
            long q10 = mVar.q();
            this.f7464g = q10;
            this.f7462e = 1;
            long j10 = this.f7460c - 65307;
            if (j10 > q10) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(mVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f7462e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(mVar);
            this.f7462e = 4;
            return -(this.f7468k + 2);
        }
        this.f7463f = j(mVar);
        this.f7462e = 4;
        return this.f7464g;
    }

    @Override // g2.g
    public void c(long j10) {
        this.f7465h = m0.r(j10, 0L, this.f7463f - 1);
        this.f7462e = 2;
        this.f7466i = this.f7459b;
        this.f7467j = this.f7460c;
        this.f7468k = 0L;
        this.f7469l = this.f7463f;
    }

    @Override // g2.g
    /* renamed from: h */
    public b a() {
        if (this.f7463f != 0) {
            return new b();
        }
        return null;
    }

    long j(m mVar) {
        long j10;
        f fVar;
        this.f7458a.b();
        if (this.f7458a.c(mVar)) {
            this.f7458a.a(mVar, false);
            f fVar2 = this.f7458a;
            mVar.h(fVar2.f7494h + fVar2.f7495i);
            do {
                j10 = this.f7458a.f7489c;
                f fVar3 = this.f7458a;
                if ((fVar3.f7488b & 4) == 4 || !fVar3.c(mVar) || mVar.q() >= this.f7460c || !this.f7458a.a(mVar, true)) {
                    break;
                }
                fVar = this.f7458a;
            } while (o.e(mVar, fVar.f7494h + fVar.f7495i));
            return j10;
        }
        throw new EOFException();
    }
}
