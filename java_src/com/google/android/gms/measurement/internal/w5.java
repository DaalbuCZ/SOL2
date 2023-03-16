package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class w5 implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.i1 f5155n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i6 f5156o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5(i6 i6Var, com.google.android.gms.internal.measurement.i1 i1Var) {
        this.f5156o = i6Var;
        this.f5155n = i1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.i6 r0 = r6.f5156o
            com.google.android.gms.measurement.internal.j4 r0 = r0.f4438a
            com.google.android.gms.measurement.internal.l8 r0 = r0.M()
            com.google.android.gms.internal.measurement.ge.c()
            com.google.android.gms.measurement.internal.j4 r1 = r0.f4438a
            com.google.android.gms.measurement.internal.h r1 = r1.z()
            com.google.android.gms.measurement.internal.t2 r2 = com.google.android.gms.measurement.internal.u2.f5082w0
            r3 = 0
            boolean r1 = r1.B(r3, r2)
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.j4 r1 = r0.f4438a
            com.google.android.gms.measurement.internal.s3 r1 = r1.F()
            p4.b r1 = r1.q()
            p4.a r2 = p4.a.ANALYTICS_STORAGE
            boolean r1 = r1.i(r2)
            if (r1 != 0) goto L39
            com.google.android.gms.measurement.internal.j4 r0 = r0.f4438a
            com.google.android.gms.measurement.internal.f3 r0 = r0.d()
            com.google.android.gms.measurement.internal.d3 r0 = r0.x()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L7f
        L39:
            com.google.android.gms.measurement.internal.j4 r1 = r0.f4438a
            com.google.android.gms.measurement.internal.s3 r1 = r1.F()
            com.google.android.gms.measurement.internal.j4 r2 = r0.f4438a
            d4.e r2 = r2.e()
            long r4 = r2.a()
            boolean r1 = r1.v(r4)
            if (r1 != 0) goto L82
            com.google.android.gms.measurement.internal.j4 r1 = r0.f4438a
            com.google.android.gms.measurement.internal.s3 r1 = r1.F()
            com.google.android.gms.measurement.internal.p3 r1 = r1.f4983p
            long r1 = r1.a()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L62
            goto L82
        L62:
            com.google.android.gms.measurement.internal.j4 r0 = r0.f4438a
            com.google.android.gms.measurement.internal.s3 r0 = r0.F()
            com.google.android.gms.measurement.internal.p3 r0 = r0.f4983p
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L83
        L73:
            com.google.android.gms.measurement.internal.j4 r0 = r0.f4438a
            com.google.android.gms.measurement.internal.f3 r0 = r0.d()
            com.google.android.gms.measurement.internal.d3 r0 = r0.x()
            java.lang.String r1 = "getSessionId has been disabled."
        L7f:
            r0.a(r1)
        L82:
            r0 = r3
        L83:
            if (r0 == 0) goto L97
            com.google.android.gms.measurement.internal.i6 r1 = r6.f5156o
            com.google.android.gms.measurement.internal.j4 r1 = r1.f4438a
            com.google.android.gms.measurement.internal.i9 r1 = r1.N()
            com.google.android.gms.internal.measurement.i1 r2 = r6.f5155n
            long r3 = r0.longValue()
            r1.I(r2, r3)
            return
        L97:
            com.google.android.gms.internal.measurement.i1 r0 = r6.f5155n     // Catch: android.os.RemoteException -> L9d
            r0.T(r3)     // Catch: android.os.RemoteException -> L9d
            return
        L9d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.i6 r1 = r6.f5156o
            com.google.android.gms.measurement.internal.j4 r1 = r1.f4438a
            com.google.android.gms.measurement.internal.f3 r1 = r1.d()
            com.google.android.gms.measurement.internal.d3 r1 = r1.r()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w5.run():void");
    }
}
