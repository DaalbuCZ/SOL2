package com.google.firebase.crashlytics;

import android.annotation.SuppressLint;
import n5.f;
/* loaded from: classes.dex */
public final class b {
    @SuppressLint({"VisibleForTests"})
    public static void a(Throwable th) {
        if (th == null) {
            f.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            a.d().f5321a.p(th);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static void b(String str) {
        a.d().f5321a.w("com.crashlytics.flutter.build-id.0", str);
    }
}
