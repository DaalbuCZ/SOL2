package f2;

import s1.m1;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f7128a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7129b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7130c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7131d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7132e;

    /* renamed from: f  reason: collision with root package name */
    public final m1 f7133f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7134g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f7135h;

    /* renamed from: i  reason: collision with root package name */
    public final long[] f7136i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7137j;

    /* renamed from: k  reason: collision with root package name */
    private final p[] f7138k;

    public o(int i10, int i11, long j10, long j11, long j12, m1 m1Var, int i12, p[] pVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f7128a = i10;
        this.f7129b = i11;
        this.f7130c = j10;
        this.f7131d = j11;
        this.f7132e = j12;
        this.f7133f = m1Var;
        this.f7134g = i12;
        this.f7138k = pVarArr;
        this.f7137j = i13;
        this.f7135h = jArr;
        this.f7136i = jArr2;
    }

    public p a(int i10) {
        p[] pVarArr = this.f7138k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
