package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class q6 {

    /* renamed from: a  reason: collision with root package name */
    static volatile i7 f4097a = i7.c();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4098b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(1:20)(7:32|(1:34)(1:40)|35|(2:37|(1:39))|27|28|29)|21|22|23|24|(1:26)|27|28|29) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L1d
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r6 = r6.concat(r0)
            android.util.Log.e(r5, r6)
            return r1
        L1d:
            com.google.android.gms.internal.measurement.i7 r6 = com.google.android.gms.internal.measurement.q6.f4097a
            boolean r6 = r6.b()
            if (r6 == 0) goto L32
        L25:
            com.google.android.gms.internal.measurement.i7 r5 = com.google.android.gms.internal.measurement.q6.f4097a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L32:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.q6.f4098b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.i7 r0 = com.google.android.gms.internal.measurement.q6.f4097a     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.measurement.i7 r5 = com.google.android.gms.internal.measurement.q6.f4097a     // Catch: java.lang.Throwable -> L96
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> L96
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L96
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L96
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L96
            return r5
        L4b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L58
            goto L79
        L58:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L96
            r4 = 29
            if (r3 >= r4) goto L66
            r3 = r1
            goto L68
        L66:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L68:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L8a
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L96
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L79
            goto L8a
        L79:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8a java.lang.Throwable -> L96
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L96
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L8a
            r1 = 1
        L8a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.internal.measurement.i7 r5 = com.google.android.gms.internal.measurement.i7.d(r5)     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.internal.measurement.q6.f4097a = r5     // Catch: java.lang.Throwable -> L96
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L96
            goto L25
        L96:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L96
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q6.a(android.content.Context, android.net.Uri):boolean");
    }
}
