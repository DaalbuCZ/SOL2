package s1;

import android.os.SystemClock;
import s1.u1;
/* loaded from: classes.dex */
public final class j implements r1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f13479a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13480b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13481c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13482d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13483e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13484f;

    /* renamed from: g  reason: collision with root package name */
    private final float f13485g;

    /* renamed from: h  reason: collision with root package name */
    private long f13486h;

    /* renamed from: i  reason: collision with root package name */
    private long f13487i;

    /* renamed from: j  reason: collision with root package name */
    private long f13488j;

    /* renamed from: k  reason: collision with root package name */
    private long f13489k;

    /* renamed from: l  reason: collision with root package name */
    private long f13490l;

    /* renamed from: m  reason: collision with root package name */
    private long f13491m;

    /* renamed from: n  reason: collision with root package name */
    private float f13492n;

    /* renamed from: o  reason: collision with root package name */
    private float f13493o;

    /* renamed from: p  reason: collision with root package name */
    private float f13494p;

    /* renamed from: q  reason: collision with root package name */
    private long f13495q;

    /* renamed from: r  reason: collision with root package name */
    private long f13496r;

    /* renamed from: s  reason: collision with root package name */
    private long f13497s;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f13498a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f13499b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f13500c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f13501d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f13502e = p3.m0.A0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f13503f = p3.m0.A0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f13504g = 0.999f;

        public j a() {
            return new j(this.f13498a, this.f13499b, this.f13500c, this.f13501d, this.f13502e, this.f13503f, this.f13504g);
        }
    }

    private j(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f13479a = f10;
        this.f13480b = f11;
        this.f13481c = j10;
        this.f13482d = f12;
        this.f13483e = j11;
        this.f13484f = j12;
        this.f13485g = f13;
        this.f13486h = -9223372036854775807L;
        this.f13487i = -9223372036854775807L;
        this.f13489k = -9223372036854775807L;
        this.f13490l = -9223372036854775807L;
        this.f13493o = f10;
        this.f13492n = f11;
        this.f13494p = 1.0f;
        this.f13495q = -9223372036854775807L;
        this.f13488j = -9223372036854775807L;
        this.f13491m = -9223372036854775807L;
        this.f13496r = -9223372036854775807L;
        this.f13497s = -9223372036854775807L;
    }

    private void f(long j10) {
        long j11 = this.f13496r + (this.f13497s * 3);
        if (this.f13491m > j11) {
            float A0 = (float) p3.m0.A0(this.f13481c);
            this.f13491m = d5.f.c(j11, this.f13488j, this.f13491m - (((this.f13494p - 1.0f) * A0) + ((this.f13492n - 1.0f) * A0)));
            return;
        }
        long r10 = p3.m0.r(j10 - (Math.max(0.0f, this.f13494p - 1.0f) / this.f13482d), this.f13491m, j11);
        this.f13491m = r10;
        long j12 = this.f13490l;
        if (j12 == -9223372036854775807L || r10 <= j12) {
            return;
        }
        this.f13491m = j12;
    }

    private void g() {
        long j10 = this.f13486h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f13487i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f13489k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f13490l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f13488j == j10) {
            return;
        }
        this.f13488j = j10;
        this.f13491m = j10;
        this.f13496r = -9223372036854775807L;
        this.f13497s = -9223372036854775807L;
        this.f13495q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    private void i(long j10, long j11) {
        long h10;
        long j12 = j10 - j11;
        long j13 = this.f13496r;
        if (j13 == -9223372036854775807L) {
            this.f13496r = j12;
            h10 = 0;
        } else {
            long max = Math.max(j12, h(j13, j12, this.f13485g));
            this.f13496r = max;
            h10 = h(this.f13497s, Math.abs(j12 - max), this.f13485g);
        }
        this.f13497s = h10;
    }

    @Override // s1.r1
    public void a() {
        long j10 = this.f13491m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f13484f;
        this.f13491m = j11;
        long j12 = this.f13490l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f13491m = j12;
        }
        this.f13495q = -9223372036854775807L;
    }

    @Override // s1.r1
    public void b(u1.g gVar) {
        this.f13486h = p3.m0.A0(gVar.f13817n);
        this.f13489k = p3.m0.A0(gVar.f13818o);
        this.f13490l = p3.m0.A0(gVar.f13819p);
        float f10 = gVar.f13820q;
        if (f10 == -3.4028235E38f) {
            f10 = this.f13479a;
        }
        this.f13493o = f10;
        float f11 = gVar.f13821r;
        if (f11 == -3.4028235E38f) {
            f11 = this.f13480b;
        }
        this.f13492n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f13486h = -9223372036854775807L;
        }
        g();
    }

    @Override // s1.r1
    public float c(long j10, long j11) {
        if (this.f13486h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f13495q == -9223372036854775807L || SystemClock.elapsedRealtime() - this.f13495q >= this.f13481c) {
            this.f13495q = SystemClock.elapsedRealtime();
            f(j10);
            long j12 = j10 - this.f13491m;
            if (Math.abs(j12) < this.f13483e) {
                this.f13494p = 1.0f;
            } else {
                this.f13494p = p3.m0.p((this.f13482d * ((float) j12)) + 1.0f, this.f13493o, this.f13492n);
            }
            return this.f13494p;
        }
        return this.f13494p;
    }

    @Override // s1.r1
    public void d(long j10) {
        this.f13487i = j10;
        g();
    }

    @Override // s1.r1
    public long e() {
        return this.f13491m;
    }
}
