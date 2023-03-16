package com.google.android.gms.internal.measurement;

import android.os.Binder;
/* loaded from: classes.dex */
public final /* synthetic */ class j6 {
    public static Object a(k6 k6Var) {
        try {
            return k6Var.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return k6Var.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
