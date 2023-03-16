package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q<T> implements t4.d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b f3630a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3631b;

    /* renamed from: c  reason: collision with root package name */
    private final y3.b<?> f3632c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3633d;

    /* renamed from: e  reason: collision with root package name */
    private final long f3634e;

    q(b bVar, int i10, y3.b<?> bVar2, long j10, long j11, String str, String str2) {
        this.f3630a = bVar;
        this.f3631b = i10;
        this.f3632c = bVar2;
        this.f3633d = j10;
        this.f3634e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> q<T> b(b bVar, int i10, y3.b<?> bVar2) {
        boolean z10;
        if (bVar.f()) {
            z3.q a10 = z3.p.b().a();
            if (a10 == null) {
                z10 = true;
            } else if (!a10.v()) {
                return null;
            } else {
                z10 = a10.x();
                m w10 = bVar.w(bVar2);
                if (w10 != null) {
                    if (!(w10.v() instanceof z3.c)) {
                        return null;
                    }
                    z3.c cVar = (z3.c) w10.v();
                    if (cVar.J() && !cVar.i()) {
                        z3.e c10 = c(w10, cVar, i10);
                        if (c10 == null) {
                            return null;
                        }
                        w10.G();
                        z10 = c10.C();
                    }
                }
            }
            return new q<>(bVar, i10, bVar2, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    private static z3.e c(m<?> mVar, z3.c<?> cVar, int i10) {
        int[] s10;
        int[] v10;
        z3.e H = cVar.H();
        if (H == null || !H.x() || ((s10 = H.s()) != null ? !d4.b.b(s10, i10) : !((v10 = H.v()) == null || !d4.b.b(v10, i10))) || mVar.s() >= H.k()) {
            return null;
        }
        return H;
    }

    @Override // t4.d
    public final void a(t4.i<T> iVar) {
        m w10;
        int i10;
        int i11;
        int i12;
        int k10;
        long j10;
        long j11;
        int i13;
        if (this.f3630a.f()) {
            z3.q a10 = z3.p.b().a();
            if ((a10 == null || a10.v()) && (w10 = this.f3630a.w(this.f3632c)) != null && (w10.v() instanceof z3.c)) {
                z3.c cVar = (z3.c) w10.v();
                boolean z10 = true;
                int i14 = 0;
                boolean z11 = this.f3633d > 0;
                int z12 = cVar.z();
                if (a10 != null) {
                    z11 &= a10.x();
                    int k11 = a10.k();
                    int s10 = a10.s();
                    i10 = a10.C();
                    if (cVar.J() && !cVar.i()) {
                        z3.e c10 = c(w10, cVar, this.f3631b);
                        if (c10 == null) {
                            return;
                        }
                        if (!c10.C() || this.f3633d <= 0) {
                            z10 = false;
                        }
                        s10 = c10.k();
                        z11 = z10;
                    }
                    i12 = k11;
                    i11 = s10;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                b bVar = this.f3630a;
                if (iVar.p()) {
                    k10 = 0;
                } else {
                    if (iVar.n()) {
                        i14 = 100;
                    } else {
                        Exception k12 = iVar.k();
                        if (k12 instanceof x3.b) {
                            Status a11 = ((x3.b) k12).a();
                            int s11 = a11.s();
                            w3.b k13 = a11.k();
                            k10 = k13 == null ? -1 : k13.k();
                            i14 = s11;
                        } else {
                            i14 = 101;
                        }
                    }
                    k10 = -1;
                }
                if (z11) {
                    long j12 = this.f3633d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - this.f3634e);
                    j10 = j12;
                    j11 = currentTimeMillis;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                bVar.E(new z3.m(this.f3631b, i14, k10, j10, j11, null, null, z12, i13), i10, i12, i11);
            }
        }
    }
}
