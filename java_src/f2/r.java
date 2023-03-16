package f2;

import p3.m0;
/* loaded from: classes.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f7162a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7163b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f7164c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f7165d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7166e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f7167f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f7168g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7169h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        p3.a.a(iArr.length == jArr2.length);
        p3.a.a(jArr.length == jArr2.length);
        p3.a.a(iArr2.length == jArr2.length);
        this.f7162a = oVar;
        this.f7164c = jArr;
        this.f7165d = iArr;
        this.f7166e = i10;
        this.f7167f = jArr2;
        this.f7168g = iArr2;
        this.f7169h = j10;
        this.f7163b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = m0.i(this.f7167f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f7168g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = m0.e(this.f7167f, j10, true, false); e10 < this.f7167f.length; e10++) {
            if ((this.f7168g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
