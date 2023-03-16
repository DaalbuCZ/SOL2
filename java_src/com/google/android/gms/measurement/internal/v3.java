package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: a  reason: collision with root package name */
    final j4 f5106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(a9 a9Var) {
        this.f5106a = a9Var.c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        try {
            f4.b a10 = f4.c.a(this.f5106a.c());
            if (a10 != null) {
                return a10.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f5106a.d().v().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f5106a.d().v().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
