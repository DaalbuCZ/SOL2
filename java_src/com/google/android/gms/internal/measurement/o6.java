package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o6 implements l6 {

    /* renamed from: c  reason: collision with root package name */
    private static o6 f4051c;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Context f4052a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f4053b;

    private o6() {
        this.f4052a = null;
        this.f4053b = null;
    }

    private o6(Context context) {
        this.f4052a = context;
        n6 n6Var = new n6(this, null);
        this.f4053b = n6Var;
        context.getContentResolver().registerContentObserver(b6.f3726a, true, n6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o6 b(Context context) {
        o6 o6Var;
        synchronized (o6.class) {
            if (f4051c == null) {
                f4051c = androidx.core.content.c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new o6(context) : new o6();
            }
            o6Var = f4051c;
        }
        return o6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        Context context;
        synchronized (o6.class) {
            o6 o6Var = f4051c;
            if (o6Var != null && (context = o6Var.f4052a) != null && o6Var.f4053b != null) {
                context.getContentResolver().unregisterContentObserver(f4051c.f4053b);
            }
            f4051c = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.l6
    @Nullable
    /* renamed from: c */
    public final String a(final String str) {
        Context context = this.f4052a;
        if (context != null && !c6.a(context)) {
            try {
                return (String) j6.a(new k6() { // from class: com.google.android.gms.internal.measurement.m6
                    @Override // com.google.android.gms.internal.measurement.k6
                    public final Object a() {
                        return o6.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String d(String str) {
        return b6.a(this.f4052a.getContentResolver(), str, null);
    }
}
