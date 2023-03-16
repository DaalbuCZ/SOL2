package u2;
/* loaded from: classes.dex */
public final class c implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final x1.r f15167a;

    /* renamed from: b  reason: collision with root package name */
    private x1.l f15168b;

    /* renamed from: c  reason: collision with root package name */
    private x1.m f15169c;

    public c(x1.r rVar) {
        this.f15167a = rVar;
    }

    @Override // u2.c0
    public void a() {
        x1.l lVar = this.f15168b;
        if (lVar != null) {
            lVar.a();
            this.f15168b = null;
        }
        this.f15169c = null;
    }

    @Override // u2.c0
    public void b(long j10, long j11) {
        ((x1.l) p3.a.e(this.f15168b)).b(j10, j11);
    }

    @Override // u2.c0
    public int c(x1.a0 a0Var) {
        return ((x1.l) p3.a.e(this.f15168b)).i((x1.m) p3.a.e(this.f15169c), a0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.q() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.q() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // u2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(o3.i r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, x1.n r15) {
        /*
            r7 = this;
            x1.f r6 = new x1.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f15169c = r6
            x1.l r8 = r7.f15168b
            if (r8 == 0) goto L10
            return
        L10:
            x1.r r8 = r7.f15167a
            x1.l[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f15168b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.j(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f15168b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            p3.a.f(r14)
            r6.g()
            goto L70
        L35:
            x1.l r1 = r7.f15168b
            if (r1 != 0) goto L66
            long r1 = r6.q()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            x1.l r9 = r7.f15168b
            if (r9 != 0) goto L4f
            long r9 = r6.q()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            p3.a.f(r13)
            r6.g()
            throw r8
        L57:
            x1.l r1 = r7.f15168b
            if (r1 != 0) goto L66
            long r1 = r6.q()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            p3.a.f(r1)
            r6.g()
            int r0 = r0 + 1
            goto L22
        L70:
            x1.l r10 = r7.f15168b
            if (r10 == 0) goto L7a
        L74:
            x1.l r8 = r7.f15168b
            r8.c(r15)
            return
        L7a:
            u2.w0 r10 = new u2.w0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p3.m0.M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p3.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.c.d(o3.i, android.net.Uri, java.util.Map, long, long, x1.n):void");
    }

    @Override // u2.c0
    public long e() {
        x1.m mVar = this.f15169c;
        if (mVar != null) {
            return mVar.q();
        }
        return -1L;
    }

    @Override // u2.c0
    public void f() {
        x1.l lVar = this.f15168b;
        if (lVar instanceof e2.f) {
            ((e2.f) lVar).k();
        }
    }
}
