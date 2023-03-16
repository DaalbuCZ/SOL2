package x1;

import x1.b0;
/* loaded from: classes.dex */
public class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f16202a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16203b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16204c;

    /* renamed from: d  reason: collision with root package name */
    private final long f16205d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16206e;

    /* renamed from: f  reason: collision with root package name */
    private final long f16207f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16208g;

    public e(long j10, long j11, int i10, int i11, boolean z10) {
        long c10;
        this.f16202a = j10;
        this.f16203b = j11;
        this.f16204c = i11 == -1 ? 1 : i11;
        this.f16206e = i10;
        this.f16208g = z10;
        if (j10 == -1) {
            this.f16205d = -1L;
            c10 = -9223372036854775807L;
        } else {
            this.f16205d = j10 - j11;
            c10 = c(j10, j11, i10);
        }
        this.f16207f = c10;
    }

    private long a(long j10) {
        int i10 = this.f16204c;
        long j11 = (((j10 * this.f16206e) / 8000000) / i10) * i10;
        long j12 = this.f16205d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f16203b + Math.max(j11, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    public long b(long j10) {
        return c(j10, this.f16203b, this.f16206e);
    }

    @Override // x1.b0
    public boolean f() {
        return this.f16205d != -1 || this.f16208g;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        if (this.f16205d != -1 || this.f16208g) {
            long a10 = a(j10);
            long b10 = b(a10);
            c0 c0Var = new c0(b10, a10);
            if (this.f16205d != -1 && b10 < j10) {
                int i10 = this.f16204c;
                if (i10 + a10 < this.f16202a) {
                    long j11 = a10 + i10;
                    return new b0.a(c0Var, new c0(b(j11), j11));
                }
            }
            return new b0.a(c0Var);
        }
        return new b0.a(new c0(0L, this.f16203b));
    }

    @Override // x1.b0
    public long h() {
        return this.f16207f;
    }
}
