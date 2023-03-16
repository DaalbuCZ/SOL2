package androidx.appcompat.widget;
/* loaded from: classes.dex */
class o0 {

    /* renamed from: a  reason: collision with root package name */
    private int f960a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f961b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f962c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f963d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f964e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f965f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f966g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f967h = false;

    public int a() {
        return this.f966g ? this.f960a : this.f961b;
    }

    public int b() {
        return this.f960a;
    }

    public int c() {
        return this.f961b;
    }

    public int d() {
        return this.f966g ? this.f961b : this.f960a;
    }

    public void e(int i10, int i11) {
        this.f967h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f964e = i10;
            this.f960a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f965f = i11;
            this.f961b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f966g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f966g = r2
            boolean r0 = r1.f967h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f963d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f964e
        L16:
            r1.f960a = r2
            int r2 = r1.f962c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f962c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f964e
        L24:
            r1.f960a = r2
            int r2 = r1.f963d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f964e
            r1.f960a = r2
        L2f:
            int r2 = r1.f965f
        L31:
            r1.f961b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f962c = i10;
        this.f963d = i11;
        this.f967h = true;
        if (this.f966g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f960a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f961b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f960a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f961b = i11;
        }
    }
}
