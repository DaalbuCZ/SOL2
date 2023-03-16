package u2;

import android.net.Uri;
import s1.l3;
import s1.u1;
/* loaded from: classes.dex */
public final class q0 extends l3 {
    private static final Object C = new Object();
    private static final u1 D = new u1.c().c("SinglePeriodTimeline").e(Uri.EMPTY).a();
    private final u1 A;
    private final u1.g B;

    /* renamed from: p  reason: collision with root package name */
    private final long f15342p;

    /* renamed from: q  reason: collision with root package name */
    private final long f15343q;

    /* renamed from: r  reason: collision with root package name */
    private final long f15344r;

    /* renamed from: s  reason: collision with root package name */
    private final long f15345s;

    /* renamed from: t  reason: collision with root package name */
    private final long f15346t;

    /* renamed from: u  reason: collision with root package name */
    private final long f15347u;

    /* renamed from: v  reason: collision with root package name */
    private final long f15348v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f15349w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f15350x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f15351y;

    /* renamed from: z  reason: collision with root package name */
    private final Object f15352z;

    public q0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var, u1.g gVar) {
        this.f15342p = j10;
        this.f15343q = j11;
        this.f15344r = j12;
        this.f15345s = j13;
        this.f15346t = j14;
        this.f15347u = j15;
        this.f15348v = j16;
        this.f15349w = z10;
        this.f15350x = z11;
        this.f15351y = z12;
        this.f15352z = obj;
        this.A = (u1) p3.a.e(u1Var);
        this.B = gVar;
    }

    public q0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, u1Var, z12 ? u1Var.f13765q : null);
    }

    public q0(long j10, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, u1Var);
    }

    @Override // s1.l3
    public int f(Object obj) {
        return C.equals(obj) ? 0 : -1;
    }

    @Override // s1.l3
    public l3.b k(int i10, l3.b bVar, boolean z10) {
        p3.a.c(i10, 0, 1);
        return bVar.v(null, z10 ? C : null, 0, this.f15345s, -this.f15347u);
    }

    @Override // s1.l3
    public int m() {
        return 1;
    }

    @Override // s1.l3
    public Object q(int i10) {
        p3.a.c(i10, 0, 1);
        return C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 > r5) goto L9;
     */
    @Override // s1.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1.l3.d s(int r25, s1.l3.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p3.a.c(r3, r1, r2)
            long r1 = r0.f15348v
            boolean r14 = r0.f15350x
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f15351y
            if (r5 != 0) goto L2e
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r5 = r0.f15346t
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = s1.l3.d.E
            s1.u1 r5 = r0.A
            java.lang.Object r6 = r0.f15352z
            long r7 = r0.f15342p
            long r9 = r0.f15343q
            long r11 = r0.f15344r
            boolean r13 = r0.f15349w
            s1.u1$g r15 = r0.B
            long r1 = r0.f15346t
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f15347u
            r22 = r1
            r3 = r26
            s1.l3$d r1 = r3.i(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.q0.s(int, s1.l3$d, long):s1.l3$d");
    }

    @Override // s1.l3
    public int t() {
        return 1;
    }
}
