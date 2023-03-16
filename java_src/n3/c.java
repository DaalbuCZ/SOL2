package n3;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p3.m0;
import s1.m1;
import u2.t0;
/* loaded from: classes.dex */
public abstract class c implements t {

    /* renamed from: a  reason: collision with root package name */
    protected final t0 f11636a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f11637b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f11638c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11639d;

    /* renamed from: e  reason: collision with root package name */
    private final m1[] f11640e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f11641f;

    /* renamed from: g  reason: collision with root package name */
    private int f11642g;

    public c(t0 t0Var, int... iArr) {
        this(t0Var, iArr, 0);
    }

    public c(t0 t0Var, int[] iArr, int i10) {
        int i11 = 0;
        p3.a.f(iArr.length > 0);
        this.f11639d = i10;
        this.f11636a = (t0) p3.a.e(t0Var);
        int length = iArr.length;
        this.f11637b = length;
        this.f11640e = new m1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f11640e[i12] = t0Var.b(iArr[i12]);
        }
        Arrays.sort(this.f11640e, b.f11635n);
        this.f11638c = new int[this.f11637b];
        while (true) {
            int i13 = this.f11637b;
            if (i11 >= i13) {
                this.f11641f = new long[i13];
                return;
            } else {
                this.f11638c[i11] = t0Var.c(this.f11640e[i11]);
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(m1 m1Var, m1 m1Var2) {
        return m1Var2.f13583u - m1Var.f13583u;
    }

    @Override // n3.w
    public final m1 a(int i10) {
        return this.f11640e[i10];
    }

    @Override // n3.w
    public final int b(int i10) {
        return this.f11638c[i10];
    }

    @Override // n3.w
    public final t0 c() {
        return this.f11636a;
    }

    @Override // n3.w
    public final int d(m1 m1Var) {
        for (int i10 = 0; i10 < this.f11637b; i10++) {
            if (this.f11640e[i10] == m1Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // n3.w
    public final int e(int i10) {
        for (int i11 = 0; i11 < this.f11637b; i11++) {
            if (this.f11638c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11636a == cVar.f11636a && Arrays.equals(this.f11638c, cVar.f11638c);
    }

    @Override // n3.t
    public void g() {
    }

    @Override // n3.t
    public boolean h(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean i11 = i(i10, elapsedRealtime);
        int i12 = 0;
        while (i12 < this.f11637b && !i11) {
            i11 = (i12 == i10 || i(i12, elapsedRealtime)) ? false : true;
            i12++;
        }
        if (i11) {
            long[] jArr = this.f11641f;
            jArr[i10] = Math.max(jArr[i10], m0.b(elapsedRealtime, j10, Long.MAX_VALUE));
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f11642g == 0) {
            this.f11642g = (System.identityHashCode(this.f11636a) * 31) + Arrays.hashCode(this.f11638c);
        }
        return this.f11642g;
    }

    @Override // n3.t
    public boolean i(int i10, long j10) {
        return this.f11641f[i10] > j10;
    }

    @Override // n3.t
    public /* synthetic */ void j(boolean z10) {
        s.b(this, z10);
    }

    @Override // n3.t
    public void k() {
    }

    @Override // n3.t
    public int l(long j10, List<? extends w2.n> list) {
        return list.size();
    }

    @Override // n3.w
    public final int length() {
        return this.f11638c.length;
    }

    @Override // n3.t
    public final int m() {
        return this.f11638c[q()];
    }

    @Override // n3.t
    public /* synthetic */ boolean n(long j10, w2.f fVar, List list) {
        return s.d(this, j10, fVar, list);
    }

    @Override // n3.t
    public final m1 o() {
        return this.f11640e[q()];
    }

    @Override // n3.t
    public void s(float f10) {
    }

    @Override // n3.t
    public /* synthetic */ void u() {
        s.a(this);
    }

    @Override // n3.t
    public /* synthetic */ void v() {
        s.c(this);
    }
}
