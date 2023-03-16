package w2;

import s1.m1;
/* loaded from: classes.dex */
public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f15975k;

    /* renamed from: l  reason: collision with root package name */
    public final long f15976l;

    /* renamed from: m  reason: collision with root package name */
    private c f15977m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f15978n;

    public a(o3.l lVar, o3.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, j14);
        this.f15975k = j12;
        this.f15976l = j13;
    }

    public final int i(int i10) {
        return ((int[]) p3.a.h(this.f15978n))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c j() {
        return (c) p3.a.h(this.f15977m);
    }

    public void k(c cVar) {
        this.f15977m = cVar;
        this.f15978n = cVar.a();
    }
}
