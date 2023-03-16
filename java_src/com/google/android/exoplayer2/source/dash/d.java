package com.google.android.exoplayer2.source.dash;

import p3.m0;
import s1.m1;
import s1.n1;
import u2.n0;
import v1.g;
import y2.f;
/* loaded from: classes.dex */
final class d implements n0 {

    /* renamed from: n  reason: collision with root package name */
    private final m1 f3432n;

    /* renamed from: p  reason: collision with root package name */
    private long[] f3434p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3435q;

    /* renamed from: r  reason: collision with root package name */
    private f f3436r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3437s;

    /* renamed from: t  reason: collision with root package name */
    private int f3438t;

    /* renamed from: o  reason: collision with root package name */
    private final m2.c f3433o = new m2.c();

    /* renamed from: u  reason: collision with root package name */
    private long f3439u = -9223372036854775807L;

    public d(f fVar, m1 m1Var, boolean z10) {
        this.f3432n = m1Var;
        this.f3436r = fVar;
        this.f3434p = fVar.f16896b;
        d(fVar, z10);
    }

    public String a() {
        return this.f3436r.a();
    }

    @Override // u2.n0
    public void b() {
    }

    public void c(long j10) {
        boolean z10 = true;
        int e10 = m0.e(this.f3434p, j10, true, false);
        this.f3438t = e10;
        if (!this.f3435q || e10 != this.f3434p.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = -9223372036854775807L;
        }
        this.f3439u = j10;
    }

    public void d(f fVar, boolean z10) {
        int i10 = this.f3438t;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f3434p[i10 - 1];
        this.f3435q = z10;
        this.f3436r = fVar;
        long[] jArr = fVar.f16896b;
        this.f3434p = jArr;
        long j11 = this.f3439u;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f3438t = m0.e(jArr, j10, false, false);
        }
    }

    @Override // u2.n0
    public int e(n1 n1Var, g gVar, int i10) {
        int i11 = this.f3438t;
        boolean z10 = i11 == this.f3434p.length;
        if (z10 && !this.f3435q) {
            gVar.w(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f3437s) {
            n1Var.f13638b = this.f3432n;
            this.f3437s = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            if ((i10 & 1) == 0) {
                this.f3438t = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f3433o.a(this.f3436r.f16895a[i11]);
                gVar.y(a10.length);
                gVar.f15536p.put(a10);
            }
            gVar.f15538r = this.f3434p[i11];
            gVar.w(1);
            return -4;
        }
    }

    @Override // u2.n0
    public boolean i() {
        return true;
    }

    @Override // u2.n0
    public int t(long j10) {
        int max = Math.max(this.f3438t, m0.e(this.f3434p, j10, true, false));
        int i10 = max - this.f3438t;
        this.f3438t = max;
        return i10;
    }
}
