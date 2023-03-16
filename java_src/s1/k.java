package s1;
/* loaded from: classes.dex */
public class k implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final o3.q f13513a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13514b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13515c;

    /* renamed from: d  reason: collision with root package name */
    private final long f13516d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13517e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13518f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13519g;

    /* renamed from: h  reason: collision with root package name */
    private final long f13520h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f13521i;

    /* renamed from: j  reason: collision with root package name */
    private int f13522j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13523k;

    public k() {
        this(new o3.q(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected k(o3.q qVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.f13513a = qVar;
        this.f13514b = p3.m0.A0(i10);
        this.f13515c = p3.m0.A0(i11);
        this.f13516d = p3.m0.A0(i12);
        this.f13517e = p3.m0.A0(i13);
        this.f13518f = i14;
        this.f13522j = i14 == -1 ? 13107200 : i14;
        this.f13519g = z10;
        this.f13520h = p3.m0.A0(i15);
        this.f13521i = z11;
    }

    private static void a(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        p3.a.b(z10, str + " cannot be less than " + str2);
    }

    private static int l(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void m(boolean z10) {
        int i10 = this.f13518f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f13522j = i10;
        this.f13523k = false;
        if (z10) {
            this.f13513a.g();
        }
    }

    @Override // s1.s1
    public void b() {
        m(false);
    }

    @Override // s1.s1
    public boolean c() {
        return this.f13521i;
    }

    @Override // s1.s1
    public void d() {
        m(true);
    }

    @Override // s1.s1
    public boolean e(long j10, float f10, boolean z10, long j11) {
        long e02 = p3.m0.e0(j10, f10);
        long j12 = z10 ? this.f13517e : this.f13516d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || e02 >= j12 || (!this.f13519g && this.f13513a.f() >= this.f13522j);
    }

    @Override // s1.s1
    public boolean f(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f13513a.f() >= this.f13522j;
        long j12 = this.f13514b;
        if (f10 > 1.0f) {
            j12 = Math.min(p3.m0.Z(j12, f10), this.f13515c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f13519g && z11) {
                z10 = false;
            }
            this.f13523k = z10;
            if (!z10 && j11 < 500000) {
                p3.r.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f13515c || z11) {
            this.f13523k = false;
        }
        return this.f13523k;
    }

    @Override // s1.s1
    public o3.b g() {
        return this.f13513a;
    }

    @Override // s1.s1
    public void h() {
        m(true);
    }

    @Override // s1.s1
    public void i(y2[] y2VarArr, u2.v0 v0Var, n3.t[] tVarArr) {
        int i10 = this.f13518f;
        if (i10 == -1) {
            i10 = k(y2VarArr, tVarArr);
        }
        this.f13522j = i10;
        this.f13513a.h(i10);
    }

    @Override // s1.s1
    public long j() {
        return this.f13520h;
    }

    protected int k(y2[] y2VarArr, n3.t[] tVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < y2VarArr.length; i11++) {
            if (tVarArr[i11] != null) {
                i10 += l(y2VarArr[i11].k());
            }
        }
        return Math.max(13107200, i10);
    }
}
